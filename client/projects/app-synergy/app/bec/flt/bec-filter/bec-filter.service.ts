import { inject, Injectable } from "@angular/core";
import { SynergyAppService } from "@synergy/sys";
import { becRoutePath } from "../../bec-route-path";
import { AngBecFlt } from "../api";

export interface BecFilterNavigationState {
  entity: AngBecFlt;
  duplicated: boolean;
}

@Injectable({
  providedIn: "root",
})
export class BecFilterService {
  private appService = inject(SynergyAppService);

  navigateToList() {
    return this.appService.navigate([becRoutePath.BEC_FILTER_BASE_PATH]);
  }

  navigateToView(uid: number): Promise<boolean> {
    return this.appService.navigate([becRoutePath.BEC_FILTER_BASE_PATH, uid]);
  }

  navigateToNew(navigationState?: BecFilterNavigationState) {
    return this.appService.navigate(
      [becRoutePath.BEC_FILTER_BASE_PATH, "new"],
      {
        state: navigationState,
      },
    );
  }

  navigateToEdit(uid: number, navigationState?: BecFilterNavigationState) {
    return this.appService.navigate(
      [becRoutePath.BEC_FILTER_BASE_PATH, uid, "edit"],
      {
        state: navigationState,
      },
    );
  }
}
