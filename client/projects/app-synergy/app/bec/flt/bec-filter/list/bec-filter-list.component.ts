import { RowClickedEvent } from "@ag-grid-community/core";
import { AsyncPipe } from "@angular/common";
import {
  ChangeDetectionStrategy,
  Component,
  inject,
  OnDestroy,
  OnInit,
} from "@angular/core";
import { ActivatedRoute } from "@angular/router";
import {
  SynergyBehavioursModule,
  SynergyButtonComponent,
  SynergyNgLetDirective,
} from "@slib2/behaviours";
import {
  SynergyGridComponent,
  SynergyGridToolbarComponent,
  SynergyGridToolbarExportComponent,
} from "@slib2/forms";
import { SynergyLayoutsModule } from "@slib2/layouts";
import {
  ExhaustingEvent,
  Loading,
  SingleEvent,
  TakeUntilDestroy,
} from "@slib2/util";
import { from, Observable } from "rxjs";
import { SynergyBreadcrumbComponent } from "@synergy/sys";
import { SynergyGridQueryDirective } from "@synergy/sys";
import { SynergyGridToolbarRefreshComponent } from "@synergy/sys";
import { SynergyGridToolbarViewComponent } from "@synergy/sys";
import { SynergyIconStandardPipe } from "@synergy/sys";
import { SynergyIfAuthNewDirective } from "@synergy/sys";
import { SynergyTranslatePipe } from "@synergy/sys";
import { ReuseRoute, routeGridConfig } from "@synergy/sys";
import { SQueryRow } from "@synergy/sys";
import { BecFilterService } from "../bec-filter.service";
import { BecFilterStore } from "../bec-filter.store";

@Component({
  templateUrl: "./bec-filter-list.component.html",
  changeDetection: ChangeDetectionStrategy.OnPush,
  selector: "bec-filter-list",
  imports: [
    SynergyNgLetDirective,
    SynergyLayoutsModule,
    SynergyBreadcrumbComponent,
    SynergyIfAuthNewDirective,
    SynergyButtonComponent,
    SynergyBehavioursModule,
    SynergyGridComponent,
    SynergyGridQueryDirective,
    SynergyGridToolbarComponent,
    SynergyGridToolbarViewComponent,
    SynergyGridToolbarExportComponent,
    SynergyGridToolbarRefreshComponent,
    AsyncPipe,
    SynergyIconStandardPipe,
    SynergyTranslatePipe,
  ],
})
@ReuseRoute({ triggerInitOnAttach: true })
@TakeUntilDestroy
export class BecFilterListComponent implements OnInit, OnDestroy {
  private service = inject(BecFilterService);
  private store = inject(BecFilterStore);
  private route = inject(ActivatedRoute);

  /** La tabella oggetto dei permessi in scrittura. */
  authTable = this.route.snapshot.data.authTable;

  /** La query della lista di dati iniziale. */
  query = this.store.listQuery;

  /** Caricamento delle chiamate asincrone. */
  @Loading() loading$: Observable<boolean>;

  gridConfig = routeGridConfig(this.route, this.query);

  @SingleEvent()
  ngOnInit() {
    if (this.store.shouldLoadList()) {
      // Se la lista è da caricare, effettuo il suo caricamento tramite la query.
      return this.store.loadListQuery$();
    }
  }

  ngOnDestroy() {}

  /** Azione lanciata al click di un elemento: naviga in visualizzazione dell'entità. */
  @ExhaustingEvent()
  onRowClick(event: RowClickedEvent<SQueryRow>) {
    if (event.data) {
      const selectedUid = this.query.getValue("BecFlt.Uid", event.data);
      return from(this.service.navigateToView(selectedUid));
    }
  }

  /** Azione lanciata al "nuovo": naviga in creazione di una nuova entità. */
  onNewClick() {
    return from(this.service.navigateToNew());
  }
}
