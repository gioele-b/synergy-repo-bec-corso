import { Location, AsyncPipe } from "@angular/common";
import { ChangeDetectionStrategy, Component, inject, OnDestroy, OnInit, ViewChild } from "@angular/core";
import { MatMenuTrigger } from "@angular/material/menu";
import { ActivatedRoute } from "@angular/router";
import { SynergyDialogService } from "@slib2/dialog";
import { validationUtil } from "@slib2/forms";
import { SynergyBehavioursModule, SynergyButtonComponent, SynergyIconButtonComponent, SynergyNgLetDirective } from "@slib2/behaviours";
import { ExhaustingEvent, ISynergyLockableComponent, Loading, registerLockableComponent, TakeUntilDestroy, ChangeListener } from "@slib2/util";
import { SynergyLayoutsModule } from "@slib2/layouts";
import { distinctUntilChanged, EMPTY, from, Observable, of, withLatestFrom } from "rxjs";
import { catchError, filter, map, mapTo, switchMap } from "rxjs/operators";
import { RouteMode } from "@synergy/sys";
import { SynergyI18nService } from "@synergy/sys";
import { AngBecFlt } from "../../api";
import { SynergyBreadcrumbComponent } from "@synergy/sys";
import { SynergyIconStandardPipe } from "@synergy/sys";
import { SynergyIfAuthDeleteDirective, SynergyIfAuthEditDirective, SynergyIfAuthNewDirective } from "@synergy/sys";
import { SynergyTranslatePipe } from "@synergy/sys";
import { BecFilterFormComponent } from "../components/bec-filter-form.component";
import { BecFilterNavigationState, BecFilterService } from "../bec-filter.service";
import { BecFilterStore } from "../bec-filter.store";

@Component ({
  templateUrl: "./bec-filter-entity.component.html",
  changeDetection: ChangeDetectionStrategy.OnPush,
  selector: "bec-filter-entity",
  imports: [
    SynergyNgLetDirective,
    SynergyLayoutsModule,
    SynergyIconButtonComponent,
    SynergyBehavioursModule,
    SynergyBreadcrumbComponent,
    SynergyButtonComponent,
    MatMenuTrigger,
    SynergyIfAuthNewDirective,
    SynergyIfAuthEditDirective,
    SynergyIfAuthDeleteDirective,
    BecFilterFormComponent,
    AsyncPipe,
    SynergyIconStandardPipe,
    SynergyTranslatePipe
  ]
})
@TakeUntilDestroy
export class BecFilterEntityComponent implements OnInit, OnDestroy, ISynergyLockableComponent {

  constructor () {
    registerLockableComponent (this);
  } // constructor

  private service = inject (BecFilterService);
  protected store = inject (BecFilterStore);
  private route = inject (ActivatedRoute);
  private dialogService = inject (SynergyDialogService);
  private i18nService = inject (SynergyI18nService);
  private location = inject (Location);

  /** L'uid dell'entità ricavato dalla rotta. */
  uid$: Observable<number | undefined> = this.route.paramMap.pipe (
    map ((params) => params.has ("uid") ? Number (params.get ("uid")) : undefined),
    distinctUntilChanged (),
  );

  /** Il design della form. */
  formDesign = this.route.snapshot.data.formDesign;
  /** La modalità "view", "edit" o "new" ricavata dalla rotta. */
  private mode = this.route.snapshot.data.mode;
  /** Lo stato proveniente dalla navigazione. */
  private navigationState = this.location.getState () as BecFilterNavigationState;

  /** La tabella oggetto dei permessi in scrittura. */
  authTable = this.route.snapshot.data.authTable;

  /** Flag di utilità per capire la modalità corrente. */
  inEdit: boolean = this.mode === RouteMode.EDIT;
  inView: boolean = this.mode === RouteMode.VIEW;
  inNew: boolean = this.mode === RouteMode.NEW;

  @Loading () loading$: Observable<boolean>;
  /** La form per l'editazione dell'entità. */
  @ViewChild (BecFilterFormComponent) entityForm: BecFilterFormComponent;
  
  ngOnInit () {
    // Ricavo dalla navigazione l'entità di partenza.
    const navigationEntity = this.navigationState?.entity;
    if (this.inNew) {
      // Ricavo dalla navigazione il flag di duplicazione.
      const duplicated = !!this.navigationState?.duplicated;
      // Imposto la nuova entità.
      this.store.setNewEntity (navigationEntity, duplicated);
    } else {
      if (navigationEntity) { this.store.setEntity (navigationEntity); }
      this.listenToUid ();
    } // if - else
  } // ngOnInit

  @ChangeListener ()
  listenToUid () {
    return this.uid$.pipe (
      switchMap (uid => {
        if (isNaN (uid)) { throw new Error (); }
        this.store.clearEntity ();
        return this.store.loadEntity$ (uid, true);
      }),
      catchError (error => this.service.navigateToList ()),
    );
  } // listenToUid

  ngOnDestroy () {
    this.store.clearEntity ();
  } // ngOnDestroy

  /** Azione scaturita alla modifica dell'entità tramite la form: aggiorno l'entità a partire dalle nuove modifiche. */
  onEntityChange (newEntity: AngBecFlt) { this.store.changeEntity (newEntity); }

  /** Azione scaturita all'"indietro": ripulisco l'entità e torno alla lista. */
  @ExhaustingEvent ()
  onBackClick () { return from (this.service.navigateToList ()); }

  /** Azione scaturita al "duplica": duplico l'entità e vado in nuovo. */
  @ExhaustingEvent ()
  onDuplicateClick () {
    return from (this.navigateToDuplicate ());
  } // onDuplicateClick

  private navigateToDuplicate () {
    return this.service.navigateToNew ({
      entity: this.store.entityToDuplicate (),
      duplicated: true
    });
  } // navigateToDuplicate

  /** Azione scaturita all'"annulla": torno in sola visualizzazione. */
  @ExhaustingEvent ()
  onCancelClick (uid: number) { return from (this.service.navigateToView (uid)); }

  /** Azione scaturita al "modifica": vado in editazione dell'entità. */
  @ExhaustingEvent ()
  onEditClick (uid: number) { return from (this.service.navigateToEdit (uid)); }

  /** Azione scaturita al "salva". Esegue il salvataggio nel server e ricarica l'entità. */
  @ExhaustingEvent ()
  onSaveClick () {
    return this.save$ ().pipe (
      switchMap ((entity) => {
        if (this.mode === RouteMode.NEW) {
          // Se sono in new, navigo in edit: il ricaricamento dell'entità avverrà nell'ngOnInit in modalità edit. */
          return this.service.navigateToEdit (entity.uid);
        } else {
          // Se sono in edit, resto in edit ma ricarico l'entità.
          return this.store.loadEntity$ (entity.uid, false);
        } // if - else
      })
    );
  } // onSaveClick

  /** Azione scaturita al "salva e duplica". Dopo il salvataggio, duplica l'entità e va in new. */
  @ExhaustingEvent ()
  onSaveAndDuplicateClick () {
    return this.save$ ().pipe (
      // Ricarico l'entità prima di duplicarla.
      switchMap (entity => this.store.loadEntity$ (entity.uid, false)),
      switchMap (() => {
        if (this.inNew) {
          this.store.setNewEntity (this.store.entityToDuplicate (), true);
          return Promise.resolve (true);
        } else {
          return this.navigateToDuplicate ();
        } // if - else
      })
    );
  } // onSaveAndDuplicateClick

  /** Azione scaturita al "salva e visualizza". Dopo il salvataggio, torna in sola visualizzazione. */
  @ExhaustingEvent ()
  onSaveAndViewClick () { return this.save$ ().pipe (switchMap ((entity) => this.service.navigateToView (entity.uid))); }

  /** Azione scaturita al "salva ed esci". Dopo il salvataggio, torna alla lista. */
  @ExhaustingEvent ()
  onSaveAndExitClick () { return this.save$ ().pipe (switchMap (() => this.service.navigateToList ())); }

  /** Azione scaturita all'"elimina". */
  @ExhaustingEvent ()
  onDeleteClick () {
    return this.dialogService.confirm$ (this.i18nService.getLabel ("confermaEliminazioneElemento"), "warning").pipe (
      withLatestFrom (this.uid$),
      switchMap (([confirm, uid]) => confirm ? this.store.deleteEntity$ (uid).pipe (mapTo (true)) : of (false)),
      switchMap (deleted => {
        if (deleted) { return this.service.navigateToList (); }
        else { return EMPTY; }
      })
    );
  } // onDeleteClick

  /** Effettua il salvataggio dell'entità. Prima ne controlla la validità. */
  private save$ () {
    return this.validate$ ().pipe (
      filter (isValid => isValid),
      switchMap (() => {
        switch (this.mode) {
          case RouteMode.NEW: return this.store.savePost$ ();
          case RouteMode.EDIT: return this.store.savePut$ ();
          default: return EMPTY;
        } // switch
      })
    );
  } // save$

  canDeactivate (): boolean { return !this.store.entityChanged (); }

  /** Controlla la validità dell'entità. */
  private validate$ (): Observable<boolean> {
    // Eseguo la validazione della form.
    return this.entityForm.validate$ ().pipe (
      map (validations => !validationUtil.getNotValidValidation (validations, { dispatchFocus: true }))
    );
  } // validate$

} // BecFilterEntityComponent
