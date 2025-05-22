import { inject, NgModule } from "@angular/core";
import { ResolveData, RouterModule, Routes } from "@angular/router";
import { RouteMode, SynergyRouteModeGuard } from "@synergy/sys";
import {
  SynergyFormDesignsService,
  SynergyLockableComponentGuard,
} from "@synergy/sys";
import { BecFilterFormComponent } from "./components/bec-filter-form.component";

const entityResolve: ResolveData = {
  formDesign: () =>
    inject(SynergyFormDesignsService).loadFormDesign$(
      BecFilterFormComponent.FORM_DESIGN_NAME,
    ),
};

const authTable = "AngBecFlt";

const routes: Routes = [
  {
    path: "",
    loadComponent: () =>
      import("./bec-filter.component").then((c) => c.BecFilterComponent),
    canActivateChild: [SynergyRouteModeGuard],
    children: [
      {
        path: "",
        loadComponent: () =>
          import("./list/bec-filter-list.component").then(
            (c) => c.BecFilterListComponent,
          ),
        data: { mode: RouteMode.LIST, authTable },
      },
      {
        path: "new",
        loadComponent: () =>
          import("./entity/bec-filter-entity.component").then(
            (c) => c.BecFilterEntityComponent,
          ),
        canDeactivate: [SynergyLockableComponentGuard],
        data: { mode: RouteMode.NEW, authTable },
        resolve: entityResolve,
      },
      {
        path: ":uid",
        loadComponent: () =>
          import("./entity/bec-filter-entity.component").then(
            (c) => c.BecFilterEntityComponent,
          ),
        data: { mode: RouteMode.VIEW, authTable },
        resolve: entityResolve,
      },
      {
        path: ":uid/edit",
        loadComponent: () =>
          import("./entity/bec-filter-entity.component").then(
            (c) => c.BecFilterEntityComponent,
          ),
        canDeactivate: [SynergyLockableComponentGuard],
        data: { mode: RouteMode.EDIT, authTable },
        resolve: entityResolve,
      },
      { path: "**", redirectTo: "", pathMatch: "full" },
    ],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
})
export class BecFilterModule {}
