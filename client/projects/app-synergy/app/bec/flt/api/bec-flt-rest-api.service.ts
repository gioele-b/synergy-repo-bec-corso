import { inject, Injectable } from "@angular/core";
import { SynergyApiService } from "@synergy/sys";
import { Observable } from "rxjs";
import { AngBecFlt } from "./bec-flt.models";

@Injectable({ providedIn: "root" })
export class BecFltRestApiService {
  private synergyApi = inject(SynergyApiService);

  postFilter$(filter: AngBecFlt): Observable<AngBecFlt> {
    return this.synergyApi.post$("rest/bec/flt/AngBecFlt", filter);
  }

  putFilter$(filter: AngBecFlt): Observable<AngBecFlt> {
    return this.synergyApi.put$("rest/bec/flt/AngBecFlt/all", filter);
  }

  deleteFilter$(filterUid: number): Observable<boolean> {
    return this.synergyApi.delete$(`rest/bec/flt/AngBecFlt/${filterUid}`);
  }

  getFilter$(filterUid: number): Observable<AngBecFlt> {
    return this.synergyApi.get$(`rest/bec/flt/AngBecFlt/byId/${filterUid}`);
  }
}
