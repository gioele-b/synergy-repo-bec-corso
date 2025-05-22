import { inject, Injectable } from "@angular/core";
import { patchState, signalStore, withState } from "@ngrx/signals";
import { SHistory } from "@slib2/behaviours";
import { withDevtools } from "@slib2/util";
import { forkJoin, of, throwError } from "rxjs";
import { catchError, switchMap, tap, mapTo } from "rxjs/operators";
import { SynergyBaseService, SynergyFormDesignsService } from "@synergy/sys";
import { SApiError, SValidation } from "@synergy/sys";
import { AngBecFlt, BecFltRestApiService } from "../api";
import { BecFilterFormComponent } from "./components/bec-filter-form.component";

/** L'interfaccia che rappresenta lo stato del modulo. */
export interface BecFilterState {
  shouldLoadList: boolean;
  entity: AngBecFlt;
  entityChanged: boolean;
  message: string;
  validations: SValidation[];
}

@Injectable({ providedIn: "root" })
export class BecFilterStore extends signalStore(
  { protectedState: false },
  withDevtools("BecFilter"),
  withState<BecFilterState>({
    shouldLoadList: true,
    entity: null,
    entityChanged: false,
    message: null,
    validations: null,
  }),
) {
  private baseService = inject(SynergyBaseService);
  private api = inject(BecFltRestApiService);
  private formDesignsService = inject(SynergyFormDesignsService);

  /** La history che gestisce l'undo e redo nel modulo. */
  readonly history = new SHistory<AngBecFlt>({
    getEntity: () => this.entity(),
    setEntity: (entity, entityChanged) =>
      patchState(this, { entity, entityChanged }),
  });

  /** La query della lista iniziale del modulo. */
  readonly listQuery = this.baseService
    .createQueryByName("stdAngBecFlt")
    .addFilter({
      alias: "BecFlt",
      column: "LogDel",
      operation: "eq",
      value: false,
    });

  /** Modifica l'entità nello stato. Registra anche l'entità vecchia nella history. */
  changeEntity(newEntity: AngBecFlt) {
    this.history.registerEntity(this.entity());
    patchState(this, (s) => ({
      ...s,
      entity: newEntity,
      entityChanged: true,
    }));
  }

  /** Imposta una entità nello stato. */
  setEntity(entity: AngBecFlt) {
    patchState(this, { entity });
  }

  /** Imposta una nuova entità nello stato. */
  setNewEntity(defaultEntity: AngBecFlt, duplicated: boolean) {
    patchState(this, {
      entityChanged: duplicated,
      message: duplicated
        ? this.baseService.getLabel("oraTiTroviNelNuovoElemento")
        : null,
      entity: {
        // IMPL inserire qui valori di default
        ...this.formDesignsService.getDefaultValues(
          BecFilterFormComponent.FORM_DESIGN_NAME,
        ),
        ...defaultEntity,
        uid: 0,
      },
      validations: null,
    });
  }

  /** Pulisce l'entità corrente. Ripulisce anche la history. */
  clearEntity() {
    patchState(this, (s) => ({
      ...s,
      entity: null,
      entityChanged: false,
      message: null,
      validations: null,
    }));
    this.history.clear();
  }

  /**
   * Ritorna l'entità da duplicare
   */
  entityToDuplicate(): AngBecFlt {
    const { ...entity } = this.entity();
    return {
      ...entity,
      uid: 0,
      // aggiungi qui i campi da resettare nel duplicato
    };
  }

  /** Carica la lista iniziale tramite la query. */
  loadListQuery$() {
    return this.listQuery.load$().pipe(tap(() => this.loadListSuccess()));
  }

  private loadListSuccess() {
    patchState(this, { shouldLoadList: false });
  }

  /** Carica l'entità a partire dal suo uid. */
  loadEntity$(uid: number, doCheck: boolean) {
    return forkJoin([this.api.getFilter$(uid)]).pipe(
      switchMap((result) =>
        doCheck
          ? this.baseService
              .checkLoadedEntity$(result[0], this.entity())
              .pipe(mapTo(result))
          : of(result),
      ),
      tap((result) => this.loadSuccess({ ...result[0] })),
      catchError((e) => {
        this.loadError(e);
        return throwError(() => e);
      }),
    );
  }

  private loadSuccess(loadedEntity: AngBecFlt) {
    patchState(this, { entity: loadedEntity });
  }

  private loadError(loadError: any) {
    // In caso di eccezione, ripulisco l'entità.
    patchState(this, { entity: null });
  }

  /** Salva l'entità in inserimento. */
  savePost$() {
    const entity = this.getEntityToSave();
    return this.api.postFilter$(entity).pipe(
      tap((savedEntity) => this.saveSuccess(savedEntity)),
      catchError((saveError) => {
        this.saveError(saveError);
        return throwError(() => saveError);
      }),
    );
  }

  /** Salva l'entità in modifica. */
  savePut$() {
    const entity = this.getEntityToSave();
    return this.api.putFilter$(entity).pipe(
      tap((savedEntity) => this.saveSuccess(savedEntity)),
      catchError((saveError) => {
        this.saveError(saveError);
        return throwError(() => saveError);
      }),
    );
  }

  private getEntityToSave() {
    const entity = { ...this.entity() };

    return entity;
  }

  /** Metodo lanciato al successo del salvataggio. */
  private saveSuccess(savedEntity: AngBecFlt) {
    patchState(this, {
      shouldLoadList: true,
      entityChanged: false,
      validations: null,
      message: null,
    });
    this.history.clear();
  }

  /** Metodo lanciato al fallimento del salvataggio. */
  private saveError({ validations }: SApiError) {
    patchState(this, { shouldLoadList: true, validations });
  }

  /** Elimina l'entità. */
  deleteEntity$(uid: number) {
    return this.api.deleteFilter$(uid).pipe(
      tap(() => this.deleteSuccess()),
      catchError((e) => {
        this.deleteError();
        return throwError(() => e);
      }),
    );
  }

  /** Metodo lanciato al successo dell'eliminazione. */
  private deleteSuccess() {
    patchState(this, {
      entity: null,
      entityChanged: false,
      shouldLoadList: true,
      message: null,
      validations: null,
    });
  }

  /** Metodo lanciato al fallimento dell'eliminazione. */
  private deleteError() {}
}
