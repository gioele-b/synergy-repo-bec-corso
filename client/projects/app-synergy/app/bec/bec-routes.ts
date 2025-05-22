import { Route } from "@angular/router";
import { routeCommon } from "@synergy/sys";
import { becRoutePath as p } from "./bec-route-path";

export const becRoutes: Route[] = [
  {
    ...routeCommon(p.BEC_FILTER_BASE_PATH),
    loadChildren: () =>
      import("./flt/bec-filter/bec-filter.module").then(
        (m) => m.BecFilterModule,
      ),
  },
];
