// tslint:disable:class-name
import * as standard from "./bec-flt.models";

import { UpfIst } from "@synergy/sys";
import { AngQryDbmTblCol } from "@synergy/sys";

export interface _AngBecFlt {
  uid?: number;
  becFltCod?: string;
  becFltDsc?: string;
  qryDbmTblColUid?: number;
  logDel?: boolean;
  etyUid?: number | null;
  tsi?: number | null;
  tsu?: number | null;
  recVer?: number;
  rsi?: number | null;
  rsu?: number | null;
  tsd?: number | null;
  rsd?: number | null;
  lngRecVer?: number;
  userFields?: UpfIst;
  _QryDbmTblCol?: AngQryDbmTblCol;
} // AngBecFlt

