import { ImportProvidersSource } from "@angular/core";
import { DvzModule } from "@synergy/dvz";
import { SysModule } from "@synergy/sys";
import { BecModule } from "./app/bec/bec.module";

export const SYNERGY_MODULES: ImportProvidersSource[] = [
  SysModule,
  DvzModule,
  BecModule
];
