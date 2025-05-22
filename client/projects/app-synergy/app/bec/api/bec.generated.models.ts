// tslint:disable:class-name
import * as standard from "./bec.models";

import { MdiIcon } from "@slib2/util";

export interface _BecVrsInf {
  uid?: number;
  vrsMaj?: number;
  vrsMin?: number;
  vrsRel?: number;
  vrsNam?: string;
  vrsIco?: MdiIcon;
  vrsClr?: string;
  stpPlg?: boolean;
  tsi?: number | null;
  tsu?: number | null;
  recVer?: number;
  rsi?: number | null;
  rsu?: number | null;
} // BecVrsInf

