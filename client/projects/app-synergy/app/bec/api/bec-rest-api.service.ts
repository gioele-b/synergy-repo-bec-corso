import { inject, Injectable } from "@angular/core";
import { SynergyApiService } from "@synergy/sys";

@Injectable ({ providedIn: "root" })
export class BecRestApiService {

  private synergyApi = inject (SynergyApiService);

} // BecRestApiService
