package net.synergy2.db.base;

import javax.annotation.Generated;

@Generated (value = "Synergy-Plugin")
public class SAlias {

    public static final String ENTITY = "Entity";
    public static final String REF_ENTITY = "RefEntity:";
    public static final int REF_ENTITY_LENGTH = REF_ENTITY.length();
    public static final String RefEntity (String ref) { return REF_ENTITY + ref; }

    /** Tipo di indirizzo */
    public static final String AngAddTyp = "AngAddTyp";
    /** FLng000003: AngAddTyp -> LngLst -> AngAddTypLng */
    public static final String AngAddTyp_FKO_LngLst = "LngLst";
    /** FSysOrg050: AngAddTyp -> RecRulLst -> SysReaRulRol */
    public static final String AngAddTyp_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngAddTyp */
    public static final String AngAddTypLng = "AngAddTypLng";
    /** FLng000003: AngAddTyp <- Rec <- AngAddTypLng */
    public static final String AngAddTypLng_FKI_Rec = "Rec";
    /** FLng000004: AngLng <- Lng <- AngAddTypLng */
    public static final String AngAddTypLng_FKI_Lng = "Lng";

    /** Informazioni applicazioni */
    public static final String AngAppInf = "AngAppInf";
    /** FSys018: AngAppInf -> AppInfVerLst -> AngAppInfVer */
    public static final String AngAppInf_FKO_AppInfVerLst = "AppInfVerLst";

    /** Versioni prodotto */
    public static final String AngAppInfVer = "AngAppInfVer";
    /** FSys018: AngAppInf <- AppInf <- AngAppInfVer */
    public static final String AngAppInfVer_FKI_AppInf = "AppInf";

    /** Anagrafico badge */
    public static final String AngBdg = "AngBdg";
    /** FSysRes007: AngBdg -> Res -> AngRes */
    public static final String AngBdg_FKO_Res = "Res";
    /** FSysRes006: AngBdgTyp <- Typ <- AngBdg */
    public static final String AngBdg_FKI_Typ = "Typ";

    /** Tipi badge */
    public static final String AngBdgTyp = "AngBdgTyp";
    /** FLng000051: AngBdgTyp -> LngLst -> AngBdgTypLng */
    public static final String AngBdgTyp_FKO_LngLst = "LngLst";
    /** FSysRes006: AngBdgTyp -> BdgLst -> AngBdg */
    public static final String AngBdgTyp_FKO_BdgLst = "BdgLst";
    /** FSysRes005: AngResMacTyp <- MacTyp <- AngBdgTyp */
    public static final String AngBdgTyp_FKI_MacTyp = "MacTyp";

    /** Traduzioni per AngBdgTyp */
    public static final String AngBdgTypLng = "AngBdgTypLng";
    /** FLng000051: AngBdgTyp <- Rec <- AngBdgTypLng */
    public static final String AngBdgTypLng_FKI_Rec = "Rec";
    /** FLng000052: AngLng <- Lng <- AngBdgTypLng */
    public static final String AngBdgTypLng_FKI_Lng = "Lng";

    /** Filtri */
    public static final String AngBecFlt = "AngBecFlt";
    /** FLng000365: AngBecFlt -> LngLst -> AngBecFltLng */
    public static final String AngBecFlt_FKO_LngLst = "LngLst";
    /** FBecFlt001: AngQryDbmTblCol <- QryDbmTblCol <- AngBecFlt */
    public static final String AngBecFlt_FKI_QryDbmTblCol = "QryDbmTblCol";

    /** Traduzioni per AngBecFlt */
    public static final String AngBecFltLng = "AngBecFltLng";
    /** FLng000365: AngBecFlt <- Rec <- AngBecFltLng */
    public static final String AngBecFltLng_FKI_Rec = "Rec";
    /** FLng000366: AngLng <- Lng <- AngBecFltLng */
    public static final String AngBecFltLng_FKI_Lng = "Lng";

    /** Banche */
    public static final String AngBnk = "AngBnk";
    /** FLng000009: AngBnk -> LngLst -> AngBnkLng */
    public static final String AngBnk_FKO_LngLst = "LngLst";
    /** FSysGeo006: AngBnk -> CmpBnkLst -> SysCmpBnk */
    public static final String AngBnk_FKO_CmpBnkLst = "CmpBnkLst";
    /** FSysGeo004: AngPlc <- Sta <- AngBnk */
    public static final String AngBnk_FKI_Sta = "Sta";
    /** FSysGeo005: AngPlc <- Prv <- AngBnk */
    public static final String AngBnk_FKI_Prv = "Prv";

    /** Traduzioni per AngBnk */
    public static final String AngBnkLng = "AngBnkLng";
    /** FLng000009: AngBnk <- Rec <- AngBnkLng */
    public static final String AngBnkLng_FKI_Rec = "Rec";
    /** FLng000010: AngLng <- Lng <- AngBnkLng */
    public static final String AngBnkLng_FKI_Lng = "Lng";

    /** Distinte base */
    public static final String AngBom = "AngBom";
    /** FSysItm011: AngItm <- Itm <- AngBom */
    public static final String AngBom_FKI_Itm = "Itm";
    /** FSysItm136: AngItm <- PrdItm <- AngBom */
    public static final String AngBom_FKI_PrdItm = "PrdItm";
    /** FSysItm137: AngItmVrn <- ItmVrn <- AngBom */
    public static final String AngBom_FKI_ItmVrn = "ItmVrn";

    /** Tipi legame distinta base */
    public static final String AngBomLnkTyp = "AngBomLnkTyp";
    /** FLng000163: AngBomLnkTyp -> LngLst -> AngBomLnkTypLng */
    public static final String AngBomLnkTyp_FKO_LngLst = "LngLst";

    /** Traduzioni per AngBomLnkTyp */
    public static final String AngBomLnkTypLng = "AngBomLnkTypLng";
    /** FLng000163: AngBomLnkTyp <- Rec <- AngBomLnkTypLng */
    public static final String AngBomLnkTypLng_FKI_Rec = "Rec";
    /** FLng000164: AngLng <- Lng <- AngBomLnkTypLng */
    public static final String AngBomLnkTypLng_FKI_Lng = "Lng";

    /** Business unit */
    public static final String AngBusUni = "AngBusUni";
    /** FLng000063: AngBusUni -> LngLst -> AngBusUniLng */
    public static final String AngBusUni_FKO_LngLst = "LngLst";
    /** FSysOrg067: AngBusUni -> OrgComLst -> AngBusUniOrgCom */
    public static final String AngBusUni_FKO_OrgComLst = "OrgComLst";

    /** Traduzioni per AngBusUni */
    public static final String AngBusUniLng = "AngBusUniLng";
    /** FLng000063: AngBusUni <- Rec <- AngBusUniLng */
    public static final String AngBusUniLng_FKI_Rec = "Rec";
    /** FLng000064: AngLng <- Lng <- AngBusUniLng */
    public static final String AngBusUniLng_FKI_Lng = "Lng";

    /** BU delle organizzazioni */
    public static final String AngBusUniOrgCom = "AngBusUniOrgCom";
    /** FSysOrg066: AngOrgCom <- OrgCom <- AngBusUniOrgCom */
    public static final String AngBusUniOrgCom_FKI_OrgCom = "OrgCom";
    /** FSysOrg067: AngBusUni <- BusUni <- AngBusUniOrgCom */
    public static final String AngBusUniOrgCom_FKI_BusUni = "BusUni";

    /** Calendari */
    public static final String AngCal = "AngCal";
    /** FSysCal009: AngCal -> ExpLst -> AngCalExp */
    public static final String AngCal_FKO_ExpLst = "ExpLst";
    /** FSysCal010: AngCal -> ExpRngLst -> AngCalExpRng */
    public static final String AngCal_FKO_ExpRngLst = "ExpRngLst";
    /** FSysCal011: AngCal -> SubRngLst -> AngCalExpRng */
    public static final String AngCal_FKO_SubRngLst = "SubRngLst";
    /** FSysCal013: AngCal -> ShfLst -> GenCal */
    public static final String AngCal_FKO_ShfLst = "ShfLst";
    /** FSysCal018: AngCal -> AvlLst -> GenCalAvl */
    public static final String AngCal_FKO_AvlLst = "AvlLst";
    /** FSysCal022: AngCal -> ResLst -> AngRes */
    public static final String AngCal_FKO_ResLst = "ResLst";
    /** FSysCom002: AngCal -> OrgComLst -> AngOrgCom */
    public static final String AngCal_FKO_OrgComLst = "OrgComLst";
    /** FSysLgs002: AngCal -> PlnLst -> AngPln */
    public static final String AngCal_FKO_PlnLst = "PlnLst";
    /** FSysCal002: AngCalDay <- MonSft <- AngCal */
    public static final String AngCal_FKI_MonSft = "MonSft";
    /** FSysCal003: AngCalDay <- TueSft <- AngCal */
    public static final String AngCal_FKI_TueSft = "TueSft";
    /** FSysCal004: AngCalDay <- WedSft <- AngCal */
    public static final String AngCal_FKI_WedSft = "WedSft";
    /** FSysCal005: AngCalDay <- ThuSft <- AngCal */
    public static final String AngCal_FKI_ThuSft = "ThuSft";
    /** FSysCal006: AngCalDay <- FriSft <- AngCal */
    public static final String AngCal_FKI_FriSft = "FriSft";
    /** FSysCal007: AngCalDay <- SatSft <- AngCal */
    public static final String AngCal_FKI_SatSft = "SatSft";
    /** FSysCal008: AngCalDay <- SunSft <- AngCal */
    public static final String AngCal_FKI_SunSft = "SunSft";
    /** FSysCal020: AngCalHld <- CalHld <- AngCal */
    public static final String AngCal_FKI_CalHld = "CalHld";

    /** Turni giornalieri */
    public static final String AngCalDay = "AngCalDay";
    /** FSysCal001: AngCalDay -> ShfLst -> AngCalDayShf */
    public static final String AngCalDay_FKO_ShfLst = "ShfLst";
    /** FSysCal002: AngCalDay -> CalMonLst -> AngCal */
    public static final String AngCalDay_FKO_CalMonLst = "CalMonLst";
    /** FSysCal003: AngCalDay -> CalTueLst -> AngCal */
    public static final String AngCalDay_FKO_CalTueLst = "CalTueLst";
    /** FSysCal004: AngCalDay -> CalWedLst -> AngCal */
    public static final String AngCalDay_FKO_CalWedLst = "CalWedLst";
    /** FSysCal005: AngCalDay -> CalThuLst -> AngCal */
    public static final String AngCalDay_FKO_CalThuLst = "CalThuLst";
    /** FSysCal006: AngCalDay -> CalFriLst -> AngCal */
    public static final String AngCalDay_FKO_CalFriLst = "CalFriLst";
    /** FSysCal007: AngCalDay -> CalSatLst -> AngCal */
    public static final String AngCalDay_FKO_CalSatLst = "CalSatLst";
    /** FSysCal008: AngCalDay -> CalSunLst -> AngCal */
    public static final String AngCalDay_FKO_CalSunLst = "CalSunLst";

    /** Dettaglio turni giornalieri */
    public static final String AngCalDayShf = "AngCalDayShf";
    /** FLng000229: AngCalDayShf -> LngLst -> AngCalDayShfLng */
    public static final String AngCalDayShf_FKO_LngLst = "LngLst";
    /** FSysCal001: AngCalDay <- Day <- AngCalDayShf */
    public static final String AngCalDayShf_FKI_Day = "Day";
    /** FSysCal034: AngCalDayShfTyp <- ShfTyp <- AngCalDayShf */
    public static final String AngCalDayShf_FKI_ShfTyp = "ShfTyp";

    /** Traduzioni per AngCalDayShf */
    public static final String AngCalDayShfLng = "AngCalDayShfLng";
    /** FLng000229: AngCalDayShf <- Rec <- AngCalDayShfLng */
    public static final String AngCalDayShfLng_FKI_Rec = "Rec";
    /** FLng000230: AngLng <- Lng <- AngCalDayShfLng */
    public static final String AngCalDayShfLng_FKI_Lng = "Lng";

    /** Tipologia turno */
    public static final String AngCalDayShfTyp = "AngCalDayShfTyp";
    /** FLng000239: AngCalDayShfTyp -> LngLst -> AngCalDayShfTypLng */
    public static final String AngCalDayShfTyp_FKO_LngLst = "LngLst";
    /** FSysCal034: AngCalDayShfTyp -> ShfLst -> AngCalDayShf */
    public static final String AngCalDayShfTyp_FKO_ShfLst = "ShfLst";
    /** FSysCal035: AngCalDayShfTyp -> ShfTypResFavLst -> AngCalDayShfTypResFav */
    public static final String AngCalDayShfTyp_FKO_ShfTypResFavLst = "ShfTypResFavLst";

    /** Traduzioni per AngCalDayShfTyp */
    public static final String AngCalDayShfTypLng = "AngCalDayShfTypLng";
    /** FLng000239: AngCalDayShfTyp <- Rec <- AngCalDayShfTypLng */
    public static final String AngCalDayShfTypLng_FKI_Rec = "Rec";
    /** FLng000240: AngLng <- Lng <- AngCalDayShfTypLng */
    public static final String AngCalDayShfTypLng_FKI_Lng = "Lng";

    /** Associazione risorse turni preferiti */
    public static final String AngCalDayShfTypResFav = "AngCalDayShfTypResFav";
    /** FSysCal035: AngCalDayShfTyp <- ShfTyp <- AngCalDayShfTypResFav */
    public static final String AngCalDayShfTypResFav_FKI_ShfTyp = "ShfTyp";
    /** FSysCal036: AngRes <- Res <- AngCalDayShfTypResFav */
    public static final String AngCalDayShfTypResFav_FKI_Res = "Res";

    /** Classifica 1 */
    public static final String AngCalEvtCls001 = "AngCalEvtCls001";
    /** FLng000241: AngCalEvtCls001 -> LngLst -> AngCalEvtCls001Lng */
    public static final String AngCalEvtCls001_FKO_LngLst = "LngLst";
    /** FSysCal043: AngCalEvtCls001 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls001_FKO_ClsLst = "ClsLst";
    /** FSysCal073: AngCalEvtCls001 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls001_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal103: AngCalEvtCls001 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls001_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls001 */
    public static final String AngCalEvtCls001Lng = "AngCalEvtCls001Lng";
    /** FLng000241: AngCalEvtCls001 <- Rec <- AngCalEvtCls001Lng */
    public static final String AngCalEvtCls001Lng_FKI_Rec = "Rec";
    /** FLng000242: AngLng <- Lng <- AngCalEvtCls001Lng */
    public static final String AngCalEvtCls001Lng_FKI_Lng = "Lng";

    /** Classifica 2 */
    public static final String AngCalEvtCls002 = "AngCalEvtCls002";
    /** FLng000243: AngCalEvtCls002 -> LngLst -> AngCalEvtCls002Lng */
    public static final String AngCalEvtCls002_FKO_LngLst = "LngLst";
    /** FSysCal044: AngCalEvtCls002 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls002_FKO_ClsLst = "ClsLst";
    /** FSysCal074: AngCalEvtCls002 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls002_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal104: AngCalEvtCls002 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls002_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls002 */
    public static final String AngCalEvtCls002Lng = "AngCalEvtCls002Lng";
    /** FLng000243: AngCalEvtCls002 <- Rec <- AngCalEvtCls002Lng */
    public static final String AngCalEvtCls002Lng_FKI_Rec = "Rec";
    /** FLng000244: AngLng <- Lng <- AngCalEvtCls002Lng */
    public static final String AngCalEvtCls002Lng_FKI_Lng = "Lng";

    /** Classifica 3 */
    public static final String AngCalEvtCls003 = "AngCalEvtCls003";
    /** FLng000245: AngCalEvtCls003 -> LngLst -> AngCalEvtCls003Lng */
    public static final String AngCalEvtCls003_FKO_LngLst = "LngLst";
    /** FSysCal045: AngCalEvtCls003 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls003_FKO_ClsLst = "ClsLst";
    /** FSysCal075: AngCalEvtCls003 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls003_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal105: AngCalEvtCls003 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls003_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls003 */
    public static final String AngCalEvtCls003Lng = "AngCalEvtCls003Lng";
    /** FLng000245: AngCalEvtCls003 <- Rec <- AngCalEvtCls003Lng */
    public static final String AngCalEvtCls003Lng_FKI_Rec = "Rec";
    /** FLng000246: AngLng <- Lng <- AngCalEvtCls003Lng */
    public static final String AngCalEvtCls003Lng_FKI_Lng = "Lng";

    /** Classifica 4 */
    public static final String AngCalEvtCls004 = "AngCalEvtCls004";
    /** FLng000247: AngCalEvtCls004 -> LngLst -> AngCalEvtCls004Lng */
    public static final String AngCalEvtCls004_FKO_LngLst = "LngLst";
    /** FSysCal046: AngCalEvtCls004 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls004_FKO_ClsLst = "ClsLst";
    /** FSysCal076: AngCalEvtCls004 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls004_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal106: AngCalEvtCls004 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls004_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls004 */
    public static final String AngCalEvtCls004Lng = "AngCalEvtCls004Lng";
    /** FLng000247: AngCalEvtCls004 <- Rec <- AngCalEvtCls004Lng */
    public static final String AngCalEvtCls004Lng_FKI_Rec = "Rec";
    /** FLng000248: AngLng <- Lng <- AngCalEvtCls004Lng */
    public static final String AngCalEvtCls004Lng_FKI_Lng = "Lng";

    /** Classifica 5 */
    public static final String AngCalEvtCls005 = "AngCalEvtCls005";
    /** FLng000249: AngCalEvtCls005 -> LngLst -> AngCalEvtCls005Lng */
    public static final String AngCalEvtCls005_FKO_LngLst = "LngLst";
    /** FSysCal047: AngCalEvtCls005 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls005_FKO_ClsLst = "ClsLst";
    /** FSysCal077: AngCalEvtCls005 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls005_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal107: AngCalEvtCls005 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls005_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls005 */
    public static final String AngCalEvtCls005Lng = "AngCalEvtCls005Lng";
    /** FLng000249: AngCalEvtCls005 <- Rec <- AngCalEvtCls005Lng */
    public static final String AngCalEvtCls005Lng_FKI_Rec = "Rec";
    /** FLng000250: AngLng <- Lng <- AngCalEvtCls005Lng */
    public static final String AngCalEvtCls005Lng_FKI_Lng = "Lng";

    /** Classifica 6 */
    public static final String AngCalEvtCls006 = "AngCalEvtCls006";
    /** FLng000251: AngCalEvtCls006 -> LngLst -> AngCalEvtCls006Lng */
    public static final String AngCalEvtCls006_FKO_LngLst = "LngLst";
    /** FSysCal048: AngCalEvtCls006 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls006_FKO_ClsLst = "ClsLst";
    /** FSysCal078: AngCalEvtCls006 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls006_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal108: AngCalEvtCls006 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls006_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls006 */
    public static final String AngCalEvtCls006Lng = "AngCalEvtCls006Lng";
    /** FLng000251: AngCalEvtCls006 <- Rec <- AngCalEvtCls006Lng */
    public static final String AngCalEvtCls006Lng_FKI_Rec = "Rec";
    /** FLng000252: AngLng <- Lng <- AngCalEvtCls006Lng */
    public static final String AngCalEvtCls006Lng_FKI_Lng = "Lng";

    /** Classifica 7 */
    public static final String AngCalEvtCls007 = "AngCalEvtCls007";
    /** FLng000253: AngCalEvtCls007 -> LngLst -> AngCalEvtCls007Lng */
    public static final String AngCalEvtCls007_FKO_LngLst = "LngLst";
    /** FSysCal049: AngCalEvtCls007 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls007_FKO_ClsLst = "ClsLst";
    /** FSysCal079: AngCalEvtCls007 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls007_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal109: AngCalEvtCls007 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls007_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls007 */
    public static final String AngCalEvtCls007Lng = "AngCalEvtCls007Lng";
    /** FLng000253: AngCalEvtCls007 <- Rec <- AngCalEvtCls007Lng */
    public static final String AngCalEvtCls007Lng_FKI_Rec = "Rec";
    /** FLng000254: AngLng <- Lng <- AngCalEvtCls007Lng */
    public static final String AngCalEvtCls007Lng_FKI_Lng = "Lng";

    /** Classifica 8 */
    public static final String AngCalEvtCls008 = "AngCalEvtCls008";
    /** FLng000255: AngCalEvtCls008 -> LngLst -> AngCalEvtCls008Lng */
    public static final String AngCalEvtCls008_FKO_LngLst = "LngLst";
    /** FSysCal050: AngCalEvtCls008 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls008_FKO_ClsLst = "ClsLst";
    /** FSysCal080: AngCalEvtCls008 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls008_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal110: AngCalEvtCls008 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls008_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls008 */
    public static final String AngCalEvtCls008Lng = "AngCalEvtCls008Lng";
    /** FLng000255: AngCalEvtCls008 <- Rec <- AngCalEvtCls008Lng */
    public static final String AngCalEvtCls008Lng_FKI_Rec = "Rec";
    /** FLng000256: AngLng <- Lng <- AngCalEvtCls008Lng */
    public static final String AngCalEvtCls008Lng_FKI_Lng = "Lng";

    /** Classifica 9 */
    public static final String AngCalEvtCls009 = "AngCalEvtCls009";
    /** FLng000257: AngCalEvtCls009 -> LngLst -> AngCalEvtCls009Lng */
    public static final String AngCalEvtCls009_FKO_LngLst = "LngLst";
    /** FSysCal051: AngCalEvtCls009 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls009_FKO_ClsLst = "ClsLst";
    /** FSysCal081: AngCalEvtCls009 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls009_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal111: AngCalEvtCls009 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls009_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls009 */
    public static final String AngCalEvtCls009Lng = "AngCalEvtCls009Lng";
    /** FLng000257: AngCalEvtCls009 <- Rec <- AngCalEvtCls009Lng */
    public static final String AngCalEvtCls009Lng_FKI_Rec = "Rec";
    /** FLng000258: AngLng <- Lng <- AngCalEvtCls009Lng */
    public static final String AngCalEvtCls009Lng_FKI_Lng = "Lng";

    /** Classifica 10 */
    public static final String AngCalEvtCls010 = "AngCalEvtCls010";
    /** FLng000259: AngCalEvtCls010 -> LngLst -> AngCalEvtCls010Lng */
    public static final String AngCalEvtCls010_FKO_LngLst = "LngLst";
    /** FSysCal052: AngCalEvtCls010 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls010_FKO_ClsLst = "ClsLst";
    /** FSysCal082: AngCalEvtCls010 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls010_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal112: AngCalEvtCls010 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls010_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls010 */
    public static final String AngCalEvtCls010Lng = "AngCalEvtCls010Lng";
    /** FLng000259: AngCalEvtCls010 <- Rec <- AngCalEvtCls010Lng */
    public static final String AngCalEvtCls010Lng_FKI_Rec = "Rec";
    /** FLng000260: AngLng <- Lng <- AngCalEvtCls010Lng */
    public static final String AngCalEvtCls010Lng_FKI_Lng = "Lng";

    /** Classifica 11 */
    public static final String AngCalEvtCls011 = "AngCalEvtCls011";
    /** FLng000261: AngCalEvtCls011 -> LngLst -> AngCalEvtCls011Lng */
    public static final String AngCalEvtCls011_FKO_LngLst = "LngLst";
    /** FSysCal053: AngCalEvtCls011 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls011_FKO_ClsLst = "ClsLst";
    /** FSysCal083: AngCalEvtCls011 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls011_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal113: AngCalEvtCls011 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls011_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls011 */
    public static final String AngCalEvtCls011Lng = "AngCalEvtCls011Lng";
    /** FLng000261: AngCalEvtCls011 <- Rec <- AngCalEvtCls011Lng */
    public static final String AngCalEvtCls011Lng_FKI_Rec = "Rec";
    /** FLng000262: AngLng <- Lng <- AngCalEvtCls011Lng */
    public static final String AngCalEvtCls011Lng_FKI_Lng = "Lng";

    /** Classifica 12 */
    public static final String AngCalEvtCls012 = "AngCalEvtCls012";
    /** FLng000263: AngCalEvtCls012 -> LngLst -> AngCalEvtCls012Lng */
    public static final String AngCalEvtCls012_FKO_LngLst = "LngLst";
    /** FSysCal054: AngCalEvtCls012 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls012_FKO_ClsLst = "ClsLst";
    /** FSysCal084: AngCalEvtCls012 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls012_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal114: AngCalEvtCls012 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls012_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls012 */
    public static final String AngCalEvtCls012Lng = "AngCalEvtCls012Lng";
    /** FLng000263: AngCalEvtCls012 <- Rec <- AngCalEvtCls012Lng */
    public static final String AngCalEvtCls012Lng_FKI_Rec = "Rec";
    /** FLng000264: AngLng <- Lng <- AngCalEvtCls012Lng */
    public static final String AngCalEvtCls012Lng_FKI_Lng = "Lng";

    /** Classifica 13 */
    public static final String AngCalEvtCls013 = "AngCalEvtCls013";
    /** FLng000265: AngCalEvtCls013 -> LngLst -> AngCalEvtCls013Lng */
    public static final String AngCalEvtCls013_FKO_LngLst = "LngLst";
    /** FSysCal055: AngCalEvtCls013 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls013_FKO_ClsLst = "ClsLst";
    /** FSysCal085: AngCalEvtCls013 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls013_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal115: AngCalEvtCls013 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls013_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls013 */
    public static final String AngCalEvtCls013Lng = "AngCalEvtCls013Lng";
    /** FLng000265: AngCalEvtCls013 <- Rec <- AngCalEvtCls013Lng */
    public static final String AngCalEvtCls013Lng_FKI_Rec = "Rec";
    /** FLng000266: AngLng <- Lng <- AngCalEvtCls013Lng */
    public static final String AngCalEvtCls013Lng_FKI_Lng = "Lng";

    /** Classifica 14 */
    public static final String AngCalEvtCls014 = "AngCalEvtCls014";
    /** FLng000267: AngCalEvtCls014 -> LngLst -> AngCalEvtCls014Lng */
    public static final String AngCalEvtCls014_FKO_LngLst = "LngLst";
    /** FSysCal056: AngCalEvtCls014 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls014_FKO_ClsLst = "ClsLst";
    /** FSysCal086: AngCalEvtCls014 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls014_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal116: AngCalEvtCls014 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls014_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls014 */
    public static final String AngCalEvtCls014Lng = "AngCalEvtCls014Lng";
    /** FLng000267: AngCalEvtCls014 <- Rec <- AngCalEvtCls014Lng */
    public static final String AngCalEvtCls014Lng_FKI_Rec = "Rec";
    /** FLng000268: AngLng <- Lng <- AngCalEvtCls014Lng */
    public static final String AngCalEvtCls014Lng_FKI_Lng = "Lng";

    /** Classifica 15 */
    public static final String AngCalEvtCls015 = "AngCalEvtCls015";
    /** FLng000269: AngCalEvtCls015 -> LngLst -> AngCalEvtCls015Lng */
    public static final String AngCalEvtCls015_FKO_LngLst = "LngLst";
    /** FSysCal057: AngCalEvtCls015 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls015_FKO_ClsLst = "ClsLst";
    /** FSysCal087: AngCalEvtCls015 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls015_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal117: AngCalEvtCls015 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls015_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls015 */
    public static final String AngCalEvtCls015Lng = "AngCalEvtCls015Lng";
    /** FLng000269: AngCalEvtCls015 <- Rec <- AngCalEvtCls015Lng */
    public static final String AngCalEvtCls015Lng_FKI_Rec = "Rec";
    /** FLng000270: AngLng <- Lng <- AngCalEvtCls015Lng */
    public static final String AngCalEvtCls015Lng_FKI_Lng = "Lng";

    /** Classifica 16 */
    public static final String AngCalEvtCls016 = "AngCalEvtCls016";
    /** FLng000271: AngCalEvtCls016 -> LngLst -> AngCalEvtCls016Lng */
    public static final String AngCalEvtCls016_FKO_LngLst = "LngLst";
    /** FSysCal058: AngCalEvtCls016 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls016_FKO_ClsLst = "ClsLst";
    /** FSysCal088: AngCalEvtCls016 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls016_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal118: AngCalEvtCls016 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls016_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls016 */
    public static final String AngCalEvtCls016Lng = "AngCalEvtCls016Lng";
    /** FLng000271: AngCalEvtCls016 <- Rec <- AngCalEvtCls016Lng */
    public static final String AngCalEvtCls016Lng_FKI_Rec = "Rec";
    /** FLng000272: AngLng <- Lng <- AngCalEvtCls016Lng */
    public static final String AngCalEvtCls016Lng_FKI_Lng = "Lng";

    /** Classifica 17 */
    public static final String AngCalEvtCls017 = "AngCalEvtCls017";
    /** FLng000273: AngCalEvtCls017 -> LngLst -> AngCalEvtCls017Lng */
    public static final String AngCalEvtCls017_FKO_LngLst = "LngLst";
    /** FSysCal059: AngCalEvtCls017 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls017_FKO_ClsLst = "ClsLst";
    /** FSysCal089: AngCalEvtCls017 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls017_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal119: AngCalEvtCls017 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls017_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls017 */
    public static final String AngCalEvtCls017Lng = "AngCalEvtCls017Lng";
    /** FLng000273: AngCalEvtCls017 <- Rec <- AngCalEvtCls017Lng */
    public static final String AngCalEvtCls017Lng_FKI_Rec = "Rec";
    /** FLng000274: AngLng <- Lng <- AngCalEvtCls017Lng */
    public static final String AngCalEvtCls017Lng_FKI_Lng = "Lng";

    /** Classifica 18 */
    public static final String AngCalEvtCls018 = "AngCalEvtCls018";
    /** FLng000275: AngCalEvtCls018 -> LngLst -> AngCalEvtCls018Lng */
    public static final String AngCalEvtCls018_FKO_LngLst = "LngLst";
    /** FSysCal060: AngCalEvtCls018 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls018_FKO_ClsLst = "ClsLst";
    /** FSysCal090: AngCalEvtCls018 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls018_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal120: AngCalEvtCls018 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls018_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls018 */
    public static final String AngCalEvtCls018Lng = "AngCalEvtCls018Lng";
    /** FLng000275: AngCalEvtCls018 <- Rec <- AngCalEvtCls018Lng */
    public static final String AngCalEvtCls018Lng_FKI_Rec = "Rec";
    /** FLng000276: AngLng <- Lng <- AngCalEvtCls018Lng */
    public static final String AngCalEvtCls018Lng_FKI_Lng = "Lng";

    /** Classifica 19 */
    public static final String AngCalEvtCls019 = "AngCalEvtCls019";
    /** FLng000277: AngCalEvtCls019 -> LngLst -> AngCalEvtCls019Lng */
    public static final String AngCalEvtCls019_FKO_LngLst = "LngLst";
    /** FSysCal061: AngCalEvtCls019 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls019_FKO_ClsLst = "ClsLst";
    /** FSysCal091: AngCalEvtCls019 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls019_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal121: AngCalEvtCls019 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls019_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls019 */
    public static final String AngCalEvtCls019Lng = "AngCalEvtCls019Lng";
    /** FLng000277: AngCalEvtCls019 <- Rec <- AngCalEvtCls019Lng */
    public static final String AngCalEvtCls019Lng_FKI_Rec = "Rec";
    /** FLng000278: AngLng <- Lng <- AngCalEvtCls019Lng */
    public static final String AngCalEvtCls019Lng_FKI_Lng = "Lng";

    /** Classifica 20 */
    public static final String AngCalEvtCls020 = "AngCalEvtCls020";
    /** FLng000279: AngCalEvtCls020 -> LngLst -> AngCalEvtCls020Lng */
    public static final String AngCalEvtCls020_FKO_LngLst = "LngLst";
    /** FSysCal062: AngCalEvtCls020 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls020_FKO_ClsLst = "ClsLst";
    /** FSysCal092: AngCalEvtCls020 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls020_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal122: AngCalEvtCls020 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls020_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls020 */
    public static final String AngCalEvtCls020Lng = "AngCalEvtCls020Lng";
    /** FLng000279: AngCalEvtCls020 <- Rec <- AngCalEvtCls020Lng */
    public static final String AngCalEvtCls020Lng_FKI_Rec = "Rec";
    /** FLng000280: AngLng <- Lng <- AngCalEvtCls020Lng */
    public static final String AngCalEvtCls020Lng_FKI_Lng = "Lng";

    /** Classifica 21 */
    public static final String AngCalEvtCls021 = "AngCalEvtCls021";
    /** FLng000281: AngCalEvtCls021 -> LngLst -> AngCalEvtCls021Lng */
    public static final String AngCalEvtCls021_FKO_LngLst = "LngLst";
    /** FSysCal063: AngCalEvtCls021 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls021_FKO_ClsLst = "ClsLst";
    /** FSysCal093: AngCalEvtCls021 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls021_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal123: AngCalEvtCls021 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls021_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls021 */
    public static final String AngCalEvtCls021Lng = "AngCalEvtCls021Lng";
    /** FLng000281: AngCalEvtCls021 <- Rec <- AngCalEvtCls021Lng */
    public static final String AngCalEvtCls021Lng_FKI_Rec = "Rec";
    /** FLng000282: AngLng <- Lng <- AngCalEvtCls021Lng */
    public static final String AngCalEvtCls021Lng_FKI_Lng = "Lng";

    /** Classifica 22 */
    public static final String AngCalEvtCls022 = "AngCalEvtCls022";
    /** FLng000283: AngCalEvtCls022 -> LngLst -> AngCalEvtCls022Lng */
    public static final String AngCalEvtCls022_FKO_LngLst = "LngLst";
    /** FSysCal064: AngCalEvtCls022 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls022_FKO_ClsLst = "ClsLst";
    /** FSysCal094: AngCalEvtCls022 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls022_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal124: AngCalEvtCls022 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls022_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls022 */
    public static final String AngCalEvtCls022Lng = "AngCalEvtCls022Lng";
    /** FLng000283: AngCalEvtCls022 <- Rec <- AngCalEvtCls022Lng */
    public static final String AngCalEvtCls022Lng_FKI_Rec = "Rec";
    /** FLng000284: AngLng <- Lng <- AngCalEvtCls022Lng */
    public static final String AngCalEvtCls022Lng_FKI_Lng = "Lng";

    /** Classifica 23 */
    public static final String AngCalEvtCls023 = "AngCalEvtCls023";
    /** FLng000285: AngCalEvtCls023 -> LngLst -> AngCalEvtCls023Lng */
    public static final String AngCalEvtCls023_FKO_LngLst = "LngLst";
    /** FSysCal065: AngCalEvtCls023 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls023_FKO_ClsLst = "ClsLst";
    /** FSysCal095: AngCalEvtCls023 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls023_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal125: AngCalEvtCls023 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls023_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls023 */
    public static final String AngCalEvtCls023Lng = "AngCalEvtCls023Lng";
    /** FLng000285: AngCalEvtCls023 <- Rec <- AngCalEvtCls023Lng */
    public static final String AngCalEvtCls023Lng_FKI_Rec = "Rec";
    /** FLng000286: AngLng <- Lng <- AngCalEvtCls023Lng */
    public static final String AngCalEvtCls023Lng_FKI_Lng = "Lng";

    /** Classifica 24 */
    public static final String AngCalEvtCls024 = "AngCalEvtCls024";
    /** FLng000287: AngCalEvtCls024 -> LngLst -> AngCalEvtCls024Lng */
    public static final String AngCalEvtCls024_FKO_LngLst = "LngLst";
    /** FSysCal066: AngCalEvtCls024 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls024_FKO_ClsLst = "ClsLst";
    /** FSysCal096: AngCalEvtCls024 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls024_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal126: AngCalEvtCls024 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls024_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls024 */
    public static final String AngCalEvtCls024Lng = "AngCalEvtCls024Lng";
    /** FLng000287: AngCalEvtCls024 <- Rec <- AngCalEvtCls024Lng */
    public static final String AngCalEvtCls024Lng_FKI_Rec = "Rec";
    /** FLng000288: AngLng <- Lng <- AngCalEvtCls024Lng */
    public static final String AngCalEvtCls024Lng_FKI_Lng = "Lng";

    /** Classifica 25 */
    public static final String AngCalEvtCls025 = "AngCalEvtCls025";
    /** FLng000289: AngCalEvtCls025 -> LngLst -> AngCalEvtCls025Lng */
    public static final String AngCalEvtCls025_FKO_LngLst = "LngLst";
    /** FSysCal067: AngCalEvtCls025 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls025_FKO_ClsLst = "ClsLst";
    /** FSysCal097: AngCalEvtCls025 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls025_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal127: AngCalEvtCls025 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls025_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls025 */
    public static final String AngCalEvtCls025Lng = "AngCalEvtCls025Lng";
    /** FLng000289: AngCalEvtCls025 <- Rec <- AngCalEvtCls025Lng */
    public static final String AngCalEvtCls025Lng_FKI_Rec = "Rec";
    /** FLng000290: AngLng <- Lng <- AngCalEvtCls025Lng */
    public static final String AngCalEvtCls025Lng_FKI_Lng = "Lng";

    /** Classifica 26 */
    public static final String AngCalEvtCls026 = "AngCalEvtCls026";
    /** FLng000291: AngCalEvtCls026 -> LngLst -> AngCalEvtCls026Lng */
    public static final String AngCalEvtCls026_FKO_LngLst = "LngLst";
    /** FSysCal068: AngCalEvtCls026 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls026_FKO_ClsLst = "ClsLst";
    /** FSysCal098: AngCalEvtCls026 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls026_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal128: AngCalEvtCls026 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls026_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls026 */
    public static final String AngCalEvtCls026Lng = "AngCalEvtCls026Lng";
    /** FLng000291: AngCalEvtCls026 <- Rec <- AngCalEvtCls026Lng */
    public static final String AngCalEvtCls026Lng_FKI_Rec = "Rec";
    /** FLng000292: AngLng <- Lng <- AngCalEvtCls026Lng */
    public static final String AngCalEvtCls026Lng_FKI_Lng = "Lng";

    /** Classifica 27 */
    public static final String AngCalEvtCls027 = "AngCalEvtCls027";
    /** FLng000293: AngCalEvtCls027 -> LngLst -> AngCalEvtCls027Lng */
    public static final String AngCalEvtCls027_FKO_LngLst = "LngLst";
    /** FSysCal069: AngCalEvtCls027 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls027_FKO_ClsLst = "ClsLst";
    /** FSysCal099: AngCalEvtCls027 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls027_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal129: AngCalEvtCls027 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls027_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls027 */
    public static final String AngCalEvtCls027Lng = "AngCalEvtCls027Lng";
    /** FLng000293: AngCalEvtCls027 <- Rec <- AngCalEvtCls027Lng */
    public static final String AngCalEvtCls027Lng_FKI_Rec = "Rec";
    /** FLng000294: AngLng <- Lng <- AngCalEvtCls027Lng */
    public static final String AngCalEvtCls027Lng_FKI_Lng = "Lng";

    /** Classifica 28 */
    public static final String AngCalEvtCls028 = "AngCalEvtCls028";
    /** FLng000295: AngCalEvtCls028 -> LngLst -> AngCalEvtCls028Lng */
    public static final String AngCalEvtCls028_FKO_LngLst = "LngLst";
    /** FSysCal070: AngCalEvtCls028 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls028_FKO_ClsLst = "ClsLst";
    /** FSysCal100: AngCalEvtCls028 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls028_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal130: AngCalEvtCls028 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls028_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls028 */
    public static final String AngCalEvtCls028Lng = "AngCalEvtCls028Lng";
    /** FLng000295: AngCalEvtCls028 <- Rec <- AngCalEvtCls028Lng */
    public static final String AngCalEvtCls028Lng_FKI_Rec = "Rec";
    /** FLng000296: AngLng <- Lng <- AngCalEvtCls028Lng */
    public static final String AngCalEvtCls028Lng_FKI_Lng = "Lng";

    /** Classifica 29 */
    public static final String AngCalEvtCls029 = "AngCalEvtCls029";
    /** FLng000297: AngCalEvtCls029 -> LngLst -> AngCalEvtCls029Lng */
    public static final String AngCalEvtCls029_FKO_LngLst = "LngLst";
    /** FSysCal071: AngCalEvtCls029 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls029_FKO_ClsLst = "ClsLst";
    /** FSysCal101: AngCalEvtCls029 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls029_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal131: AngCalEvtCls029 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls029_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls029 */
    public static final String AngCalEvtCls029Lng = "AngCalEvtCls029Lng";
    /** FLng000297: AngCalEvtCls029 <- Rec <- AngCalEvtCls029Lng */
    public static final String AngCalEvtCls029Lng_FKI_Rec = "Rec";
    /** FLng000298: AngLng <- Lng <- AngCalEvtCls029Lng */
    public static final String AngCalEvtCls029Lng_FKI_Lng = "Lng";

    /** Classifica 30 */
    public static final String AngCalEvtCls030 = "AngCalEvtCls030";
    /** FLng000299: AngCalEvtCls030 -> LngLst -> AngCalEvtCls030Lng */
    public static final String AngCalEvtCls030_FKO_LngLst = "LngLst";
    /** FSysCal072: AngCalEvtCls030 -> ClsLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls030_FKO_ClsLst = "ClsLst";
    /** FSysCal102: AngCalEvtCls030 -> ClsRefLst -> AngCalEvtClsRef */
    public static final String AngCalEvtCls030_FKO_ClsRefLst = "ClsRefLst";
    /** FSysCal132: AngCalEvtCls030 -> EvtClsLst -> CalEvtCls */
    public static final String AngCalEvtCls030_FKO_EvtClsLst = "EvtClsLst";

    /** Traduzioni per AngCalEvtCls030 */
    public static final String AngCalEvtCls030Lng = "AngCalEvtCls030Lng";
    /** FLng000299: AngCalEvtCls030 <- Rec <- AngCalEvtCls030Lng */
    public static final String AngCalEvtCls030Lng_FKI_Rec = "Rec";
    /** FLng000300: AngLng <- Lng <- AngCalEvtCls030Lng */
    public static final String AngCalEvtCls030Lng_FKI_Lng = "Lng";

    /** Classifica multipla 1 */
    public static final String AngCalEvtClsMul001 = "AngCalEvtClsMul001";
    /** FLng000301: AngCalEvtClsMul001 -> LngLst -> AngCalEvtClsMul001Lng */
    public static final String AngCalEvtClsMul001_FKO_LngLst = "LngLst";

    /** Traduzioni per AngCalEvtClsMul001 */
    public static final String AngCalEvtClsMul001Lng = "AngCalEvtClsMul001Lng";
    /** FLng000301: AngCalEvtClsMul001 <- Rec <- AngCalEvtClsMul001Lng */
    public static final String AngCalEvtClsMul001Lng_FKI_Rec = "Rec";
    /** FLng000302: AngLng <- Lng <- AngCalEvtClsMul001Lng */
    public static final String AngCalEvtClsMul001Lng_FKI_Lng = "Lng";

    /** Classifica multipla 2 */
    public static final String AngCalEvtClsMul002 = "AngCalEvtClsMul002";
    /** FLng000303: AngCalEvtClsMul002 -> LngLst -> AngCalEvtClsMul002Lng */
    public static final String AngCalEvtClsMul002_FKO_LngLst = "LngLst";

    /** Traduzioni per AngCalEvtClsMul002 */
    public static final String AngCalEvtClsMul002Lng = "AngCalEvtClsMul002Lng";
    /** FLng000303: AngCalEvtClsMul002 <- Rec <- AngCalEvtClsMul002Lng */
    public static final String AngCalEvtClsMul002Lng_FKI_Rec = "Rec";
    /** FLng000304: AngLng <- Lng <- AngCalEvtClsMul002Lng */
    public static final String AngCalEvtClsMul002Lng_FKI_Lng = "Lng";

    /** Classifica multipla 3 */
    public static final String AngCalEvtClsMul003 = "AngCalEvtClsMul003";
    /** FLng000305: AngCalEvtClsMul003 -> LngLst -> AngCalEvtClsMul003Lng */
    public static final String AngCalEvtClsMul003_FKO_LngLst = "LngLst";

    /** Traduzioni per AngCalEvtClsMul003 */
    public static final String AngCalEvtClsMul003Lng = "AngCalEvtClsMul003Lng";
    /** FLng000305: AngCalEvtClsMul003 <- Rec <- AngCalEvtClsMul003Lng */
    public static final String AngCalEvtClsMul003Lng_FKI_Rec = "Rec";
    /** FLng000306: AngLng <- Lng <- AngCalEvtClsMul003Lng */
    public static final String AngCalEvtClsMul003Lng_FKI_Lng = "Lng";

    /** Classifica multipla 4 */
    public static final String AngCalEvtClsMul004 = "AngCalEvtClsMul004";
    /** FLng000307: AngCalEvtClsMul004 -> LngLst -> AngCalEvtClsMul004Lng */
    public static final String AngCalEvtClsMul004_FKO_LngLst = "LngLst";

    /** Traduzioni per AngCalEvtClsMul004 */
    public static final String AngCalEvtClsMul004Lng = "AngCalEvtClsMul004Lng";
    /** FLng000307: AngCalEvtClsMul004 <- Rec <- AngCalEvtClsMul004Lng */
    public static final String AngCalEvtClsMul004Lng_FKI_Rec = "Rec";
    /** FLng000308: AngLng <- Lng <- AngCalEvtClsMul004Lng */
    public static final String AngCalEvtClsMul004Lng_FKI_Lng = "Lng";

    /** Classifica multipla 5 */
    public static final String AngCalEvtClsMul005 = "AngCalEvtClsMul005";
    /** FLng000309: AngCalEvtClsMul005 -> LngLst -> AngCalEvtClsMul005Lng */
    public static final String AngCalEvtClsMul005_FKO_LngLst = "LngLst";

    /** Traduzioni per AngCalEvtClsMul005 */
    public static final String AngCalEvtClsMul005Lng = "AngCalEvtClsMul005Lng";
    /** FLng000309: AngCalEvtClsMul005 <- Rec <- AngCalEvtClsMul005Lng */
    public static final String AngCalEvtClsMul005Lng_FKI_Rec = "Rec";
    /** FLng000310: AngLng <- Lng <- AngCalEvtClsMul005Lng */
    public static final String AngCalEvtClsMul005Lng_FKI_Lng = "Lng";

    /** Riferimento classifica */
    public static final String AngCalEvtClsRef = "AngCalEvtClsRef";
    /** FSysCal043: AngCalEvtCls001 <- Cls001 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls001 = "Cls001";
    /** FSysCal044: AngCalEvtCls002 <- Cls002 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls002 = "Cls002";
    /** FSysCal045: AngCalEvtCls003 <- Cls003 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls003 = "Cls003";
    /** FSysCal046: AngCalEvtCls004 <- Cls004 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls004 = "Cls004";
    /** FSysCal047: AngCalEvtCls005 <- Cls005 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls005 = "Cls005";
    /** FSysCal048: AngCalEvtCls006 <- Cls006 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls006 = "Cls006";
    /** FSysCal049: AngCalEvtCls007 <- Cls007 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls007 = "Cls007";
    /** FSysCal050: AngCalEvtCls008 <- Cls008 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls008 = "Cls008";
    /** FSysCal051: AngCalEvtCls009 <- Cls009 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls009 = "Cls009";
    /** FSysCal052: AngCalEvtCls010 <- Cls010 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls010 = "Cls010";
    /** FSysCal053: AngCalEvtCls011 <- Cls011 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls011 = "Cls011";
    /** FSysCal054: AngCalEvtCls012 <- Cls012 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls012 = "Cls012";
    /** FSysCal055: AngCalEvtCls013 <- Cls013 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls013 = "Cls013";
    /** FSysCal056: AngCalEvtCls014 <- Cls014 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls014 = "Cls014";
    /** FSysCal057: AngCalEvtCls015 <- Cls015 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls015 = "Cls015";
    /** FSysCal058: AngCalEvtCls016 <- Cls016 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls016 = "Cls016";
    /** FSysCal059: AngCalEvtCls017 <- Cls017 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls017 = "Cls017";
    /** FSysCal060: AngCalEvtCls018 <- Cls018 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls018 = "Cls018";
    /** FSysCal061: AngCalEvtCls019 <- Cls019 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls019 = "Cls019";
    /** FSysCal062: AngCalEvtCls020 <- Cls020 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls020 = "Cls020";
    /** FSysCal063: AngCalEvtCls021 <- Cls021 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls021 = "Cls021";
    /** FSysCal064: AngCalEvtCls022 <- Cls022 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls022 = "Cls022";
    /** FSysCal065: AngCalEvtCls023 <- Cls023 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls023 = "Cls023";
    /** FSysCal066: AngCalEvtCls024 <- Cls024 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls024 = "Cls024";
    /** FSysCal067: AngCalEvtCls025 <- Cls025 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls025 = "Cls025";
    /** FSysCal068: AngCalEvtCls026 <- Cls026 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls026 = "Cls026";
    /** FSysCal069: AngCalEvtCls027 <- Cls027 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls027 = "Cls027";
    /** FSysCal070: AngCalEvtCls028 <- Cls028 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls028 = "Cls028";
    /** FSysCal071: AngCalEvtCls029 <- Cls029 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls029 = "Cls029";
    /** FSysCal072: AngCalEvtCls030 <- Cls030 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_Cls030 = "Cls030";
    /** FSysCal073: AngCalEvtCls001 <- ClsRef001 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef001 = "ClsRef001";
    /** FSysCal074: AngCalEvtCls002 <- ClsRef002 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef002 = "ClsRef002";
    /** FSysCal075: AngCalEvtCls003 <- ClsRef003 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef003 = "ClsRef003";
    /** FSysCal076: AngCalEvtCls004 <- ClsRef004 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef004 = "ClsRef004";
    /** FSysCal077: AngCalEvtCls005 <- ClsRef005 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef005 = "ClsRef005";
    /** FSysCal078: AngCalEvtCls006 <- ClsRef006 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef006 = "ClsRef006";
    /** FSysCal079: AngCalEvtCls007 <- ClsRef007 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef007 = "ClsRef007";
    /** FSysCal080: AngCalEvtCls008 <- ClsRef008 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef008 = "ClsRef008";
    /** FSysCal081: AngCalEvtCls009 <- ClsRef009 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef009 = "ClsRef009";
    /** FSysCal082: AngCalEvtCls010 <- ClsRef010 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef010 = "ClsRef010";
    /** FSysCal083: AngCalEvtCls011 <- ClsRef011 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef011 = "ClsRef011";
    /** FSysCal084: AngCalEvtCls012 <- ClsRef012 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef012 = "ClsRef012";
    /** FSysCal085: AngCalEvtCls013 <- ClsRef013 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef013 = "ClsRef013";
    /** FSysCal086: AngCalEvtCls014 <- ClsRef014 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef014 = "ClsRef014";
    /** FSysCal087: AngCalEvtCls015 <- ClsRef015 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef015 = "ClsRef015";
    /** FSysCal088: AngCalEvtCls016 <- ClsRef016 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef016 = "ClsRef016";
    /** FSysCal089: AngCalEvtCls017 <- ClsRef017 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef017 = "ClsRef017";
    /** FSysCal090: AngCalEvtCls018 <- ClsRef018 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef018 = "ClsRef018";
    /** FSysCal091: AngCalEvtCls019 <- ClsRef019 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef019 = "ClsRef019";
    /** FSysCal092: AngCalEvtCls020 <- ClsRef020 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef020 = "ClsRef020";
    /** FSysCal093: AngCalEvtCls021 <- ClsRef021 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef021 = "ClsRef021";
    /** FSysCal094: AngCalEvtCls022 <- ClsRef022 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef022 = "ClsRef022";
    /** FSysCal095: AngCalEvtCls023 <- ClsRef023 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef023 = "ClsRef023";
    /** FSysCal096: AngCalEvtCls024 <- ClsRef024 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef024 = "ClsRef024";
    /** FSysCal097: AngCalEvtCls025 <- ClsRef025 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef025 = "ClsRef025";
    /** FSysCal098: AngCalEvtCls026 <- ClsRef026 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef026 = "ClsRef026";
    /** FSysCal099: AngCalEvtCls027 <- ClsRef027 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef027 = "ClsRef027";
    /** FSysCal100: AngCalEvtCls028 <- ClsRef028 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef028 = "ClsRef028";
    /** FSysCal101: AngCalEvtCls029 <- ClsRef029 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef029 = "ClsRef029";
    /** FSysCal102: AngCalEvtCls030 <- ClsRef030 <- AngCalEvtClsRef */
    public static final String AngCalEvtClsRef_FKI_ClsRef030 = "ClsRef030";

    /** Stati invito evento */
    public static final String AngCalEvtInvSts = "AngCalEvtInvSts";
    /** FLng000233: AngCalEvtInvSts -> LngLst -> AngCalEvtInvStsLng */
    public static final String AngCalEvtInvSts_FKO_LngLst = "LngLst";
    /** FSysCal031: AngCalEvtInvSts -> InvLst -> CalEvtRes */
    public static final String AngCalEvtInvSts_FKO_InvLst = "InvLst";

    /** Traduzioni per AngCalEvtInvSts */
    public static final String AngCalEvtInvStsLng = "AngCalEvtInvStsLng";
    /** FLng000233: AngCalEvtInvSts <- Rec <- AngCalEvtInvStsLng */
    public static final String AngCalEvtInvStsLng_FKI_Rec = "Rec";
    /** FLng000234: AngLng <- Lng <- AngCalEvtInvStsLng */
    public static final String AngCalEvtInvStsLng_FKI_Lng = "Lng";

    /** Tipi invito evento */
    public static final String AngCalEvtInvTyp = "AngCalEvtInvTyp";
    /** FLng000235: AngCalEvtInvTyp -> LngLst -> AngCalEvtInvTypLng */
    public static final String AngCalEvtInvTyp_FKO_LngLst = "LngLst";
    /** FSysCal032: AngCalEvtInvTyp -> InvLst -> CalEvtRes */
    public static final String AngCalEvtInvTyp_FKO_InvLst = "InvLst";

    /** Traduzioni per AngCalEvtInvTyp */
    public static final String AngCalEvtInvTypLng = "AngCalEvtInvTypLng";
    /** FLng000235: AngCalEvtInvTyp <- Rec <- AngCalEvtInvTypLng */
    public static final String AngCalEvtInvTypLng_FKI_Rec = "Rec";
    /** FLng000236: AngLng <- Lng <- AngCalEvtInvTypLng */
    public static final String AngCalEvtInvTypLng_FKI_Lng = "Lng";

    /** Stati  evento */
    public static final String AngCalEvtSts = "AngCalEvtSts";
    /** FLng000237: AngCalEvtSts -> LngLst -> AngCalEvtStsLng */
    public static final String AngCalEvtSts_FKO_LngLst = "LngLst";
    /** FSysCal028: AngCalEvtSts -> EvtLst -> CalEvt */
    public static final String AngCalEvtSts_FKO_EvtLst = "EvtLst";

    /** Traduzioni per AngCalEvtSts */
    public static final String AngCalEvtStsLng = "AngCalEvtStsLng";
    /** FLng000237: AngCalEvtSts <- Rec <- AngCalEvtStsLng */
    public static final String AngCalEvtStsLng_FKI_Rec = "Rec";
    /** FLng000238: AngLng <- Lng <- AngCalEvtStsLng */
    public static final String AngCalEvtStsLng_FKI_Lng = "Lng";

    /** Tipi eventi */
    public static final String AngCalEvtTyp = "AngCalEvtTyp";
    /** FLng000231: AngCalEvtTyp -> LngLst -> AngCalEvtTypLng */
    public static final String AngCalEvtTyp_FKO_LngLst = "LngLst";
    /** FSysCal023: AngCalEvtTyp -> EvtTypLst -> AngCalEvtTyp */
    public static final String AngCalEvtTyp_FKO_EvtTypLst = "EvtTypLst";
    /** FSysCal024: AngCalEvtTyp -> EvtLst -> CalEvt */
    public static final String AngCalEvtTyp_FKO_EvtLst = "EvtLst";
    /** FSysCal023: AngCalEvtTyp <- EvtTypRef <- AngCalEvtTyp */
    public static final String AngCalEvtTyp_FKI_EvtTypRef = "EvtTypRef";

    /** Traduzioni per AngCalEvtTyp */
    public static final String AngCalEvtTypLng = "AngCalEvtTypLng";
    /** FLng000231: AngCalEvtTyp <- Rec <- AngCalEvtTypLng */
    public static final String AngCalEvtTypLng_FKI_Rec = "Rec";
    /** FLng000232: AngLng <- Lng <- AngCalEvtTypLng */
    public static final String AngCalEvtTypLng_FKI_Lng = "Lng";

    /** Eccezioni calendario */
    public static final String AngCalExp = "AngCalExp";
    /** FSysCal009: AngCal <- Cal <- AngCalExp */
    public static final String AngCalExp_FKI_Cal = "Cal";

    /** Eccezioni calendario range */
    public static final String AngCalExpRng = "AngCalExpRng";
    /** FSysCal010: AngCal <- Cal <- AngCalExpRng */
    public static final String AngCalExpRng_FKI_Cal = "Cal";
    /** FSysCal011: AngCal <- CalSub <- AngCalExpRng */
    public static final String AngCalExpRng_FKI_CalSub = "CalSub";

    /** Calendari festività */
    public static final String AngCalHld = "AngCalHld";
    /** FSysCal019: AngCalHld -> ExpHldLst -> AngCalHldExp */
    public static final String AngCalHld_FKO_ExpHldLst = "ExpHldLst";
    /** FSysCal020: AngCalHld -> CalLst -> AngCal */
    public static final String AngCalHld_FKO_CalLst = "CalLst";

    /** Eccezioni calendario festività */
    public static final String AngCalHldExp = "AngCalHldExp";
    /** FSysCal019: AngCalHld <- CalHld <- AngCalHldExp */
    public static final String AngCalHldExp_FKI_CalHld = "CalHld";

    /** Causale movimento tempo */
    public static final String AngCauMovTmp = "AngCauMovTmp";
    /** FLng000013: AngCauMovTmp -> LngLst -> AngCauMovTmpLng */
    public static final String AngCauMovTmp_FKO_LngLst = "LngLst";

    /** Traduzioni per AngCauMovTmp */
    public static final String AngCauMovTmpLng = "AngCauMovTmpLng";
    /** FLng000013: AngCauMovTmp <- Rec <- AngCauMovTmpLng */
    public static final String AngCauMovTmpLng_FKI_Rec = "Rec";
    /** FLng000014: AngLng <- Lng <- AngCauMovTmpLng */
    public static final String AngCauMovTmpLng_FKI_Lng = "Lng";

    /** Tipi contatto */
    public static final String AngCntTyp = "AngCntTyp";
    /** FSysMnc012: AngCntTyp -> CntLst -> ResCnt */
    public static final String AngCntTyp_FKO_CntLst = "CntLst";

    /** Regole codifica */
    public static final String AngCodRul = "AngCodRul";
    /** FSysCod002: AngCodRul -> CodValLst -> GenCodVal */
    public static final String AngCodRul_FKO_CodValLst = "CodValLst";
    /** FSysCod003: AngCodRul -> CodRulTblLst -> AngCodRulTbl */
    public static final String AngCodRul_FKO_CodRulTblLst = "CodRulTblLst";
    /** FSysCod001: AngOrgCom <- Org <- AngCodRul */
    public static final String AngCodRul_FKI_Org = "Org";

    /** Tabelle collegate alle regole di codifica */
    public static final String AngCodRulTbl = "AngCodRulTbl";
    /** FSysCod003: AngCodRul <- CodRul <- AngCodRulTbl */
    public static final String AngCodRulTbl_FKI_CodRul = "CodRul";
    /** FSysCod004: AngDbmTbl <- DbmTbl <- AngCodRulTbl */
    public static final String AngCodRulTbl_FKI_DbmTbl = "DbmTbl";

    /** Centri di costo */
    public static final String AngCstCen = "AngCstCen";
    /** FLng000067: AngCstCen -> LngLst -> AngCstCenLng */
    public static final String AngCstCen_FKO_LngLst = "LngLst";
    /** FSysItm066: AngCstCen -> PrdWrkLst -> AngPrdWrk */
    public static final String AngCstCen_FKO_PrdWrkLst = "PrdWrkLst";
    /** FSysOrg051: AngCstCenTyp <- AngCstCenTyp <- AngCstCen */
    public static final String AngCstCen_FKI_AngCstCenTyp = "AngCstCenTyp";
    /** FSysOrg052: AngOrgCom <- AngOrgCom <- AngCstCen */
    public static final String AngCstCen_FKI_AngOrgCom = "AngOrgCom";
    /** FSysOrg053: AngCur <- AngCur <- AngCstCen */
    public static final String AngCstCen_FKI_AngCur = "AngCur";
    /** FSysOrg054: AngUniMeaTmp <- AngUniMeaTmp <- AngCstCen */
    public static final String AngCstCen_FKI_AngUniMeaTmp = "AngUniMeaTmp";

    /** Traduzioni per AngCstCen */
    public static final String AngCstCenLng = "AngCstCenLng";
    /** FLng000067: AngCstCen <- Rec <- AngCstCenLng */
    public static final String AngCstCenLng_FKI_Rec = "Rec";
    /** FLng000068: AngLng <- Lng <- AngCstCenLng */
    public static final String AngCstCenLng_FKI_Lng = "Lng";

    /** Tipo centro di costo */
    public static final String AngCstCenTyp = "AngCstCenTyp";
    /** FLng000069: AngCstCenTyp -> LngLst -> AngCstCenTypLng */
    public static final String AngCstCenTyp_FKO_LngLst = "LngLst";
    /** FSysOrg051: AngCstCenTyp -> CstCenLst -> AngCstCen */
    public static final String AngCstCenTyp_FKO_CstCenLst = "CstCenLst";

    /** Traduzioni per AngCstCenTyp */
    public static final String AngCstCenTypLng = "AngCstCenTypLng";
    /** FLng000069: AngCstCenTyp <- Rec <- AngCstCenTypLng */
    public static final String AngCstCenTypLng_FKI_Rec = "Rec";
    /** FLng000070: AngLng <- Lng <- AngCstCenTypLng */
    public static final String AngCstCenTypLng_FKI_Lng = "Lng";

    /** Anagrafica aliquote costo */
    public static final String AngCstRat = "AngCstRat";
    /** FLng000073: AngCstRat -> LngLst -> AngCstRatLng */
    public static final String AngCstRat_FKO_LngLst = "LngLst";
    /** FSysOrg060: AngCstRat -> CstRatLst -> CstWrkCen */
    public static final String AngCstRat_FKO_CstRatLst = "CstRatLst";

    /** Traduzioni per AngCstRat */
    public static final String AngCstRatLng = "AngCstRatLng";
    /** FLng000073: AngCstRat <- Rec <- AngCstRatLng */
    public static final String AngCstRatLng_FKI_Rec = "Rec";
    /** FLng000074: AngLng <- Lng <- AngCstRatLng */
    public static final String AngCstRatLng_FKI_Lng = "Lng";

    /** Valute */
    public static final String AngCur = "AngCur";
    /** FLng000001: AngCur -> LngLst -> AngCurLng */
    public static final String AngCur_FKO_LngLst = "LngLst";
    /** FSysGeo001: AngCur -> TrgExcLst -> GenCurDayExc */
    public static final String AngCur_FKO_TrgExcLst = "TrgExcLst";
    /** FSysGeo002: AngCur -> SrcExcLst -> GenCurDayExc */
    public static final String AngCur_FKO_SrcExcLst = "SrcExcLst";
    /** FSysOrg023: AngCur -> RecRulLst -> SysReaRulRol */
    public static final String AngCur_FKO_RecRulLst = "RecRulLst";
    /** FSysOrg053: AngCur -> CstCenLst -> AngCstCen */
    public static final String AngCur_FKO_CstCenLst = "CstCenLst";

    /** Traduzioni per AngCur */
    public static final String AngCurLng = "AngCurLng";
    /** FLng000001: AngCur <- Rec <- AngCurLng */
    public static final String AngCurLng_FKI_Rec = "Rec";
    /** FLng000002: AngLng <- Lng <- AngCurLng */
    public static final String AngCurLng_FKI_Lng = "Lng";

    /** Clienti */
    public static final String AngCus = "AngCus";
    /** FSysBas006: AngCus -> GrpLst -> AngCusGrp */
    public static final String AngCus_FKO_GrpLst = "GrpLst";
    /** FSysBas002: AngZon <- CusZon <- AngCus */
    public static final String AngCus_FKI_CusZon = "CusZon";

    /** Gruppi cliente */
    public static final String AngCusGrp = "AngCusGrp";
    /** FSysBas006: AngCus <- Cus <- AngCusGrp */
    public static final String AngCusGrp_FKI_Cus = "Cus";
    /** FSysBas007: AngGrp <- Grp <- AngCusGrp */
    public static final String AngCusGrp_FKI_Grp = "Grp";

    /** Data set */
    public static final String AngDatSet = "AngDatSet";
    /** FLng000337: AngDatSet -> LngLst -> AngDatSetLng */
    public static final String AngDatSet_FKO_LngLst = "LngLst";
    /** FSysDoc008: AngDatSet -> DocClsCtxLst -> SysDocClsCtx */
    public static final String AngDatSet_FKO_DocClsCtxLst = "DocClsCtxLst";
    /** FSysDts002: AngDatSet -> DatSetPrmLst -> AngDatSetPrm */
    public static final String AngDatSet_FKO_DatSetPrmLst = "DatSetPrmLst";
    /** FSysDts004: AngDatSet -> StpLst -> AngDatSetStp */
    public static final String AngDatSet_FKO_StpLst = "StpLst";
    /** FSysEma005: AngDatSet -> EmaCroLst -> EmaCro */
    public static final String AngDatSet_FKO_EmaCroLst = "EmaCroLst";
    /** FSysRep002: AngDatSet -> RepMdlLst -> RepMdl */
    public static final String AngDatSet_FKO_RepMdlLst = "RepMdlLst";
    /** FSysDts001: AngDbmTbl <- DbmTbl <- AngDatSet */
    public static final String AngDatSet_FKI_DbmTbl = "DbmTbl";

    /** Traduzioni per AngDatSet */
    public static final String AngDatSetLng = "AngDatSetLng";
    /** FLng000337: AngDatSet <- Rec <- AngDatSetLng */
    public static final String AngDatSetLng_FKI_Rec = "Rec";
    /** FLng000338: AngLng <- Lng <- AngDatSetLng */
    public static final String AngDatSetLng_FKI_Lng = "Lng";

    /** Parametro data set */
    public static final String AngDatSetPrm = "AngDatSetPrm";
    /** FLng000339: AngDatSetPrm -> LngLst -> AngDatSetPrmLng */
    public static final String AngDatSetPrm_FKO_LngLst = "LngLst";
    /** FSysDts009: AngDatSetPrm -> QryFltLst -> AngDatSetStpQryFlt */
    public static final String AngDatSetPrm_FKO_QryFltLst = "QryFltLst";
    /** FSysEma010: AngDatSetPrm -> EmaCroPrmLst -> EmaCroPrm */
    public static final String AngDatSetPrm_FKO_EmaCroPrmLst = "EmaCroPrmLst";
    /** FSysDts002: AngDatSet <- DatSet <- AngDatSetPrm */
    public static final String AngDatSetPrm_FKI_DatSet = "DatSet";
    /** FSysDts003: AngDbmTblCol <- DbmCol <- AngDatSetPrm */
    public static final String AngDatSetPrm_FKI_DbmCol = "DbmCol";

    /** Traduzioni per AngDatSetPrm */
    public static final String AngDatSetPrmLng = "AngDatSetPrmLng";
    /** FLng000339: AngDatSetPrm <- Rec <- AngDatSetPrmLng */
    public static final String AngDatSetPrmLng_FKI_Rec = "Rec";
    /** FLng000340: AngLng <- Lng <- AngDatSetPrmLng */
    public static final String AngDatSetPrmLng_FKI_Lng = "Lng";

    /** Step data set */
    public static final String AngDatSetStp = "AngDatSetStp";
    /** FSysDts007: AngDatSetStp -> QryFltLst -> AngDatSetStpQryFlt */
    public static final String AngDatSetStp_FKO_QryFltLst = "QryFltLst";
    /** FSysDts010: AngDatSetStp -> QryFltValLst -> AngDatSetStpQryFlt */
    public static final String AngDatSetStp_FKO_QryFltValLst = "QryFltValLst";
    /** FSysDts004: AngDatSet <- DatSet <- AngDatSetStp */
    public static final String AngDatSetStp_FKI_DatSet = "DatSet";
    /** FSysDts005: AngDatSetStpTyp <- StpTyp <- AngDatSetStp */
    public static final String AngDatSetStp_FKI_StpTyp = "StpTyp";
    /** FSysDts006: AngQry <- Qry <- AngDatSetStp */
    public static final String AngDatSetStp_FKI_Qry = "Qry";

    /** Filtro step query Dataset */
    public static final String AngDatSetStpQryFlt = "AngDatSetStpQryFlt";
    /** FSysDts007: AngDatSetStp <- Stp <- AngDatSetStpQryFlt */
    public static final String AngDatSetStpQryFlt_FKI_Stp = "Stp";
    /** FSysDts008: AngQryFld <- FltFld <- AngDatSetStpQryFlt */
    public static final String AngDatSetStpQryFlt_FKI_FltFld = "FltFld";
    /** FSysDts009: AngDatSetPrm <- ValPrm <- AngDatSetStpQryFlt */
    public static final String AngDatSetStpQryFlt_FKI_ValPrm = "ValPrm";
    /** FSysDts010: AngDatSetStp <- ValStp <- AngDatSetStpQryFlt */
    public static final String AngDatSetStpQryFlt_FKI_ValStp = "ValStp";
    /** FSysDts011: AngQryFld <- ValQryFld <- AngDatSetStpQryFlt */
    public static final String AngDatSetStpQryFlt_FKI_ValQryFld = "ValQryFld";

    /** Tipo step data set */
    public static final String AngDatSetStpTyp = "AngDatSetStpTyp";
    /** FLng000335: AngDatSetStpTyp -> LngLst -> AngDatSetStpTypLng */
    public static final String AngDatSetStpTyp_FKO_LngLst = "LngLst";
    /** FSysDts005: AngDatSetStpTyp -> StpLst -> AngDatSetStp */
    public static final String AngDatSetStpTyp_FKO_StpLst = "StpLst";

    /** Traduzioni per AngDatSetStpTyp */
    public static final String AngDatSetStpTypLng = "AngDatSetStpTypLng";
    /** FLng000335: AngDatSetStpTyp <- Rec <- AngDatSetStpTypLng */
    public static final String AngDatSetStpTypLng_FKI_Rec = "Rec";
    /** FLng000336: AngLng <- Lng <- AngDatSetStpTypLng */
    public static final String AngDatSetStpTypLng_FKI_Lng = "Lng";

    /** Giorni */
    public static final String AngDay = "AngDay";
    /** FSysCal012: AngDay -> ShfLst -> GenCal */
    public static final String AngDay_FKO_ShfLst = "ShfLst";
    /** FSysCal016: AngDay -> AbsLst -> CalResAbs */
    public static final String AngDay_FKO_AbsLst = "AbsLst";
    /** FSysCal017: AngDay -> AvlLst -> GenCalAvl */
    public static final String AngDay_FKO_AvlLst = "AvlLst";
    /** FSysCal134: AngDay -> CalOrgComAbsLst -> CalOrgComAbs */
    public static final String AngDay_FKO_CalOrgComAbsLst = "CalOrgComAbsLst";
    /** FSysCal136: AngDay -> CalPlnAbsLst -> CalPlnAbs */
    public static final String AngDay_FKO_CalPlnAbsLst = "CalPlnAbsLst";

    /** Anagrafe dizionario colonne tabelle */
    public static final String AngDbmDic = "AngDbmDic";
    /** FSys010: AngDbmDic -> ColLst -> AngDbmTblCol */
    public static final String AngDbmDic_FKO_ColLst = "ColLst";

    /** Informazioni key */
    public static final String AngDbmKey = "AngDbmKey";

    /** Chiavi esterne */
    public static final String AngDbmRfk = "AngDbmRfk";
    /** FSys015: AngDbmRfk -> RfkColLst -> AngDbmRfkCol */
    public static final String AngDbmRfk_FKO_RfkColLst = "RfkColLst";
    /** FSysQry002: AngDbmRfk -> QryJoiLst -> AngQryJoi */
    public static final String AngDbmRfk_FKO_QryJoiLst = "QryJoiLst";
    /** FSys012: AngDbmTbl <- PrtTbl <- AngDbmRfk */
    public static final String AngDbmRfk_FKI_PrtTbl = "PrtTbl";
    /** FSys013: AngDbmTbl <- ChdTbl <- AngDbmRfk */
    public static final String AngDbmRfk_FKI_ChdTbl = "ChdTbl";
    /** FSys014: AngPrs <- Prs <- AngDbmRfk */
    public static final String AngDbmRfk_FKI_Prs = "Prs";
    /** FSys020: AngMdl <- MdlRef <- AngDbmRfk */
    public static final String AngDbmRfk_FKI_MdlRef = "MdlRef";

    /** Colonne chiavi esterne */
    public static final String AngDbmRfkCol = "AngDbmRfkCol";
    /** FSys015: AngDbmRfk <- Rfk <- AngDbmRfkCol */
    public static final String AngDbmRfkCol_FKI_Rfk = "Rfk";
    /** FSys016: AngDbmTblCol <- PrtCol <- AngDbmRfkCol */
    public static final String AngDbmRfkCol_FKI_PrtCol = "PrtCol";
    /** FSys017: AngDbmTblCol <- ChdCol <- AngDbmRfkCol */
    public static final String AngDbmRfkCol_FKI_ChdCol = "ChdCol";

    /** Sequenze-generatori */
    public static final String AngDbmSeq = "AngDbmSeq";
    /** FSys011: AngDbmSeq -> ColLst -> AngDbmTblCol */
    public static final String AngDbmSeq_FKO_ColLst = "ColLst";
    /** FSys007: AngPrs <- Prs <- AngDbmSeq */
    public static final String AngDbmSeq_FKI_Prs = "Prs";

    /** Anagrafe script lanciati */
    public static final String AngDbmSpt = "AngDbmSpt";

    /** Anagrafe tabelle */
    public static final String AngDbmTbl = "AngDbmTbl";
    /** FSys008: AngDbmTbl -> ColLst -> AngDbmTblCol */
    public static final String AngDbmTbl_FKO_ColLst = "ColLst";
    /** FSys012: AngDbmTbl -> ChdRfkLst -> AngDbmRfk */
    public static final String AngDbmTbl_FKO_ChdRfkLst = "ChdRfkLst";
    /** FSys013: AngDbmTbl -> PrtRfkLst -> AngDbmRfk */
    public static final String AngDbmTbl_FKO_PrtRfkLst = "PrtRfkLst";
    /** FSysBas003: AngDbmTbl -> SysClsRefCfg -> SysClsRefCfg */
    public static final String AngDbmTbl_FKO_SysClsRefCfg = "SysClsRefCfg";
    /** FSysCod004: AngDbmTbl -> CodRulTblLst -> AngCodRulTbl */
    public static final String AngDbmTbl_FKO_CodRulTblLst = "CodRulTblLst";
    /** FSysDoc006: AngDbmTbl -> DocCtxLst -> SysDocCtx */
    public static final String AngDbmTbl_FKO_DocCtxLst = "DocCtxLst";
    /** FSysDts001: AngDbmTbl -> DatSetLst -> AngDatSet */
    public static final String AngDbmTbl_FKO_DatSetLst = "DatSetLst";
    /** FSysEnv006: AngDbmTbl -> SrcPrpLst -> AngSrcPrp */
    public static final String AngDbmTbl_FKO_SrcPrpLst = "SrcPrpLst";
    /** FSysEty001: AngDbmTbl -> EtyLst -> AngEty */
    public static final String AngDbmTbl_FKO_EtyLst = "EtyLst";
    /** FSysEty022: AngDbmTbl -> EtyAttCtxLst -> AngEtyAtt */
    public static final String AngDbmTbl_FKO_EtyAttCtxLst = "EtyAttCtxLst";
    /** FSysEty023: AngDbmTbl -> EtyComCtxLst -> AngEtyCom */
    public static final String AngDbmTbl_FKO_EtyComCtxLst = "EtyComCtxLst";
    /** FSysLog001: AngDbmTbl -> LogLst -> AngLogTbl */
    public static final String AngDbmTbl_FKO_LogLst = "LogLst";
    /** FSysMnc007: AngDbmTbl -> NotMncLst -> MncNot */
    public static final String AngDbmTbl_FKO_NotMncLst = "NotMncLst";
    /** FSysOrg019: AngDbmTbl -> RolCudLst -> SysRolCud */
    public static final String AngDbmTbl_FKO_RolCudLst = "RolCudLst";
    /** FSysOrg021: AngDbmTbl -> SysReaRulRolLst -> SysReaRulRol */
    public static final String AngDbmTbl_FKO_SysReaRulRolLst = "SysReaRulRolLst";
    /** FSysQry001: AngDbmTbl -> QryLst -> AngQry */
    public static final String AngDbmTbl_FKO_QryLst = "QryLst";
    /** FSysRep001: AngDbmTbl -> RepMdlLst -> RepMdl */
    public static final String AngDbmTbl_FKO_RepMdlLst = "RepMdlLst";
    /** FSysUpf001: AngDbmTbl -> UpfLst -> UpfDef */
    public static final String AngDbmTbl_FKO_UpfLst = "UpfLst";
    /** FSysUpf004: AngDbmTbl -> UpfIstLst -> UpfIst */
    public static final String AngDbmTbl_FKO_UpfIstLst = "UpfIstLst";
    /** FSys005: AngMdl <- MdlRef <- AngDbmTbl */
    public static final String AngDbmTbl_FKI_MdlRef = "MdlRef";
    /** FSys006: AngPrs <- Prs <- AngDbmTbl */
    public static final String AngDbmTbl_FKI_Prs = "Prs";
    /** FSysTra002: SysTraLbl <- Lbl <- AngDbmTbl */
    public static final String AngDbmTbl_FKI_Lbl = "Lbl";

    /** Anagrafe colonne tabelle */
    public static final String AngDbmTblCol = "AngDbmTblCol";
    /** FDvzRep006: AngDbmTblCol -> RepFltLst -> DvzRepQryFlt */
    public static final String AngDbmTblCol_FKO_RepFltLst = "RepFltLst";
    /** FDvzRep007: AngDbmTblCol -> RepValLst -> DvzRepQryFlt */
    public static final String AngDbmTblCol_FKO_RepValLst = "RepValLst";
    /** FDvzRep016: AngDbmTblCol -> RepDsgFltLst -> DvzRepQryDsgFlt */
    public static final String AngDbmTblCol_FKO_RepDsgFltLst = "RepDsgFltLst";
    /** FDvzRep017: AngDbmTblCol -> RepDsgValLst -> DvzRepQryDsgFlt */
    public static final String AngDbmTblCol_FKO_RepDsgValLst = "RepDsgValLst";
    /** FDvzRep022: AngDbmTblCol -> RepChrAxxLst -> DvzRepChrAxx */
    public static final String AngDbmTblCol_FKO_RepChrAxxLst = "RepChrAxxLst";
    /** FDvzRep024: AngDbmTblCol -> RepChrAxyLst -> DvzRepChrAxy */
    public static final String AngDbmTblCol_FKO_RepChrAxyLst = "RepChrAxyLst";
    /** FDvzRep028: AngDbmTblCol -> RepQryFmtRefLst -> DvzRepQryFmt */
    public static final String AngDbmTblCol_FKO_RepQryFmtRefLst = "RepQryFmtRefLst";
    /** FDvzRep030: AngDbmTblCol -> RepQryCnvLst -> DvzRepQryCnv */
    public static final String AngDbmTblCol_FKO_RepQryCnvLst = "RepQryCnvLst";
    /** FDvzRep034: AngDbmTblCol -> RepChrAxxClrLst -> DvzRepChrAxx */
    public static final String AngDbmTblCol_FKO_RepChrAxxClrLst = "RepChrAxxClrLst";
    /** FDvzRep035: AngDbmTblCol -> RepChrAxxDscLst -> DvzRepChrAxx */
    public static final String AngDbmTblCol_FKO_RepChrAxxDscLst = "RepChrAxxDscLst";
    /** FDvzRep037: AngDbmTblCol -> RepGntStrLst -> DvzRepGnt */
    public static final String AngDbmTblCol_FKO_RepGntStrLst = "RepGntStrLst";
    /** FDvzRep038: AngDbmTblCol -> RepGntEndLst -> DvzRepGnt */
    public static final String AngDbmTblCol_FKO_RepGntEndLst = "RepGntEndLst";
    /** FDvzRep039: AngDbmTblCol -> RepGntCodLst -> DvzRepGnt */
    public static final String AngDbmTblCol_FKO_RepGntCodLst = "RepGntCodLst";
    /** FDvzRep040: AngDbmTblCol -> RepGntDscLst -> DvzRepGnt */
    public static final String AngDbmTblCol_FKO_RepGntDscLst = "RepGntDscLst";
    /** FDvzRep041: AngDbmTblCol -> RepGntClrLst -> DvzRepGnt */
    public static final String AngDbmTblCol_FKO_RepGntClrLst = "RepGntClrLst";
    /** FDvzRep042: AngDbmTblCol -> RepGntDayLst -> DvzRepGnt */
    public static final String AngDbmTblCol_FKO_RepGntDayLst = "RepGntDayLst";
    /** FDvzRep044: AngDbmTblCol -> RepGntGrpLst -> DvzRepGntGrp */
    public static final String AngDbmTblCol_FKO_RepGntGrpLst = "RepGntGrpLst";
    /** FDvzRep045: AngDbmTblCol -> RepGntGrpDscLst -> DvzRepGntGrp */
    public static final String AngDbmTblCol_FKO_RepGntGrpDscLst = "RepGntGrpDscLst";
    /** FDvzRep048: AngDbmTblCol -> RepGntLayTssLst -> DvzRepGntLay */
    public static final String AngDbmTblCol_FKO_RepGntLayTssLst = "RepGntLayTssLst";
    /** FDvzRep049: AngDbmTblCol -> RepGntLayDayLst -> DvzRepGntLay */
    public static final String AngDbmTblCol_FKO_RepGntLayDayLst = "RepGntLayDayLst";
    /** FDvzWks007: AngDbmTblCol -> DvzQryPrmLst -> DvzWksQryPrm */
    public static final String AngDbmTblCol_FKO_DvzQryPrmLst = "DvzQryPrmLst";
    /** FDvzWks010: AngDbmTblCol -> DvzQryFltLst -> DvzWksQryFlt */
    public static final String AngDbmTblCol_FKO_DvzQryFltLst = "DvzQryFltLst";
    /** FDvzWks011: AngDbmTblCol -> DvzQryFltValLst -> DvzWksQryFlt */
    public static final String AngDbmTblCol_FKO_DvzQryFltValLst = "DvzQryFltValLst";
    /** FDvzWks014: AngDbmTblCol -> DvzQryFmtLst -> DvzWksQryFmt */
    public static final String AngDbmTblCol_FKO_DvzQryFmtLst = "DvzQryFmtLst";
    /** FDvzWks019: AngDbmTblCol -> DvzQryDsgStyLst -> DvzWksQryDsgSty */
    public static final String AngDbmTblCol_FKO_DvzQryDsgStyLst = "DvzQryDsgStyLst";
    /** FDvzWks022: AngDbmTblCol -> DvzQryDsgFltLst -> DvzWksQryDsgFlt */
    public static final String AngDbmTblCol_FKO_DvzQryDsgFltLst = "DvzQryDsgFltLst";
    /** FDvzWks024: AngDbmTblCol -> DvzQryDsgFltValLst -> DvzWksQryDsgFlt */
    public static final String AngDbmTblCol_FKO_DvzQryDsgFltValLst = "DvzQryDsgFltValLst";
    /** FDvzWks031: AngDbmTblCol -> DvzChrAxxLst -> DvzWksChrAxx */
    public static final String AngDbmTblCol_FKO_DvzChrAxxLst = "DvzChrAxxLst";
    /** FDvzWks033: AngDbmTblCol -> DvzChrAxxClrLst -> DvzWksChrAxx */
    public static final String AngDbmTblCol_FKO_DvzChrAxxClrLst = "DvzChrAxxClrLst";
    /** FDvzWks035: AngDbmTblCol -> DvzChrAxxDscLst -> DvzWksChrAxx */
    public static final String AngDbmTblCol_FKO_DvzChrAxxDscLst = "DvzChrAxxDscLst";
    /** FDvzWks038: AngDbmTblCol -> DvzChrAxyLst -> DvzWksChrAxy */
    public static final String AngDbmTblCol_FKO_DvzChrAxyLst = "DvzChrAxyLst";
    /** FDvzWks043: AngDbmTblCol -> DvzGntStrLst -> DvzWksGnt */
    public static final String AngDbmTblCol_FKO_DvzGntStrLst = "DvzGntStrLst";
    /** FDvzWks045: AngDbmTblCol -> DvzGntEndLst -> DvzWksGnt */
    public static final String AngDbmTblCol_FKO_DvzGntEndLst = "DvzGntEndLst";
    /** FDvzWks047: AngDbmTblCol -> DvzGntClrLst -> DvzWksGnt */
    public static final String AngDbmTblCol_FKO_DvzGntClrLst = "DvzGntClrLst";
    /** FDvzWks049: AngDbmTblCol -> DvzGntDayLst -> DvzWksGnt */
    public static final String AngDbmTblCol_FKO_DvzGntDayLst = "DvzGntDayLst";
    /** FDvzWks052: AngDbmTblCol -> DvzGntColLst -> DvzWksGntCol */
    public static final String AngDbmTblCol_FKO_DvzGntColLst = "DvzGntColLst";
    /** FDvzWks055: AngDbmTblCol -> DvzGntGrpLst -> DvzWksGntGrp */
    public static final String AngDbmTblCol_FKO_DvzGntGrpLst = "DvzGntGrpLst";
    /** FDvzWks057: AngDbmTblCol -> DvzGntGrpDscLst -> DvzWksGntGrp */
    public static final String AngDbmTblCol_FKO_DvzGntGrpDscLst = "DvzGntGrpDscLst";
    /** FDvzWks061: AngDbmTblCol -> DvzGntLayTssLst -> DvzWksGntLay */
    public static final String AngDbmTblCol_FKO_DvzGntLayTssLst = "DvzGntLayTssLst";
    /** FDvzWks063: AngDbmTblCol -> DvzGntLayDayLst -> DvzWksGntLay */
    public static final String AngDbmTblCol_FKO_DvzGntLayDayLst = "DvzGntLayDayLst";
    /** FDvzWks065: AngDbmTblCol -> DvzGntLblLftLst -> DvzWksGnt */
    public static final String AngDbmTblCol_FKO_DvzGntLblLftLst = "DvzGntLblLftLst";
    /** FDvzWks067: AngDbmTblCol -> DvzGntLblMidLst -> DvzWksGnt */
    public static final String AngDbmTblCol_FKO_DvzGntLblMidLst = "DvzGntLblMidLst";
    /** FDvzWks069: AngDbmTblCol -> DvzGntLblRgtLst -> DvzWksGnt */
    public static final String AngDbmTblCol_FKO_DvzGntLblRgtLst = "DvzGntLblRgtLst";
    /** FSys016: AngDbmTblCol -> ChdColLst -> AngDbmRfkCol */
    public static final String AngDbmTblCol_FKO_ChdColLst = "ChdColLst";
    /** FSys017: AngDbmTblCol -> PrtColLst -> AngDbmRfkCol */
    public static final String AngDbmTblCol_FKO_PrtColLst = "PrtColLst";
    /** FSysDoc013: AngDbmTblCol -> DocClsCtxAttLst -> SysDocClsCtxAtt */
    public static final String AngDbmTblCol_FKO_DocClsCtxAttLst = "DocClsCtxAttLst";
    /** FSysDoc016: AngDbmTblCol -> DocClsCtxFltValLst -> SysDocClsCtxFlt */
    public static final String AngDbmTblCol_FKO_DocClsCtxFltValLst = "DocClsCtxFltValLst";
    /** FSysDoc017: AngDbmTblCol -> DocClsCtxFltLst -> SysDocClsCtxFlt */
    public static final String AngDbmTblCol_FKO_DocClsCtxFltLst = "DocClsCtxFltLst";
    /** FSysDts003: AngDbmTblCol -> DatSetPrmLst -> AngDatSetPrm */
    public static final String AngDbmTblCol_FKO_DatSetPrmLst = "DatSetPrmLst";
    /** FSysQry007: AngDbmTblCol -> QryColLst -> AngQryDbmTblCol */
    public static final String AngDbmTblCol_FKO_QryColLst = "QryColLst";
    /** FSysQry016: AngDbmTblCol -> FltLst -> AngQryFlt */
    public static final String AngDbmTblCol_FKO_FltLst = "FltLst";
    /** FSysQry017: AngDbmTblCol -> FltValLst -> AngQryFlt */
    public static final String AngDbmTblCol_FKO_FltValLst = "FltValLst";
    /** FSysQry021: AngDbmTblCol -> LytSrtLst -> AngQryLytSrt */
    public static final String AngDbmTblCol_FKO_LytSrtLst = "LytSrtLst";
    /** FSysQry041: AngDbmTblCol -> QryFldLst -> AngQryFld */
    public static final String AngDbmTblCol_FKO_QryFldLst = "QryFldLst";
    /** FSysUif009: AngDbmTblCol -> SysFrmDsgFldLst -> SysFrmDsgFld */
    public static final String AngDbmTblCol_FKO_SysFrmDsgFldLst = "SysFrmDsgFldLst";
    /** FSysWks026: AngDbmTblCol -> SysWksPrmDscColLst -> SysWksPrm */
    public static final String AngDbmTblCol_FKO_SysWksPrmDscColLst = "SysWksPrmDscColLst";
    /** FSysWks028: AngDbmTblCol -> SysWksPrmUidColLst -> SysWksPrm */
    public static final String AngDbmTblCol_FKO_SysWksPrmUidColLst = "SysWksPrmUidColLst";
    /** FSysWks029: AngDbmTblCol -> SysWksPrmCodColLst -> SysWksPrm */
    public static final String AngDbmTblCol_FKO_SysWksPrmCodColLst = "SysWksPrmCodColLst";
    /** FSysWks038: AngDbmTblCol -> WksWdgPrmLst -> SysWksWdgPrm */
    public static final String AngDbmTblCol_FKO_WksWdgPrmLst = "WksWdgPrmLst";
    /** FSysWks041: AngDbmTblCol -> WksWdgFltLst -> SysWksWdgFlt */
    public static final String AngDbmTblCol_FKO_WksWdgFltLst = "WksWdgFltLst";
    /** FSysWks042: AngDbmTblCol -> WksWdgFltValLst -> SysWksWdgFlt */
    public static final String AngDbmTblCol_FKO_WksWdgFltValLst = "WksWdgFltValLst";
    /** FSys008: AngDbmTbl <- Tbl <- AngDbmTblCol */
    public static final String AngDbmTblCol_FKI_Tbl = "Tbl";
    /** FSys009: AngPrs <- Prs <- AngDbmTblCol */
    public static final String AngDbmTblCol_FKI_Prs = "Prs";
    /** FSys010: AngDbmDic <- Dic <- AngDbmTblCol */
    public static final String AngDbmTblCol_FKI_Dic = "Dic";
    /** FSys011: AngDbmSeq <- Seq <- AngDbmTblCol */
    public static final String AngDbmTblCol_FKI_Seq = "Seq";
    /** FSys019: AngMdl <- MdlRef <- AngDbmTblCol */
    public static final String AngDbmTblCol_FKI_MdlRef = "MdlRef";
    /** FSysTra004: SysTraLbl <- Lbl <- AngDbmTblCol */
    public static final String AngDbmTblCol_FKI_Lbl = "Lbl";

    /** Informazioni versione */
    public static final String AngDbmVrsInf = "AngDbmVrsInf";

    /** Tipo gestione documentale */
    public static final String AngDocMngTyp = "AngDocMngTyp";

    /** Macro tipo grafico */
    public static final String AngDvzChrMacTyp = "AngDvzChrMacTyp";
    /** FDvzWks001: AngDvzChrMacTyp -> ChrTypLst -> AngDvzChrTyp */
    public static final String AngDvzChrMacTyp_FKO_ChrTypLst = "ChrTypLst";
    /** FLng000349: AngDvzChrMacTyp -> LngLst -> AngDvzChrMacTypLng */
    public static final String AngDvzChrMacTyp_FKO_LngLst = "LngLst";

    /** Traduzioni per AngDvzChrMacTyp */
    public static final String AngDvzChrMacTypLng = "AngDvzChrMacTypLng";
    /** FLng000349: AngDvzChrMacTyp <- Rec <- AngDvzChrMacTypLng */
    public static final String AngDvzChrMacTypLng_FKI_Rec = "Rec";
    /** FLng000350: AngLng <- Lng <- AngDvzChrMacTypLng */
    public static final String AngDvzChrMacTypLng_FKI_Lng = "Lng";

    /** Tipo grafico */
    public static final String AngDvzChrTyp = "AngDvzChrTyp";
    /** FDvzWks029: AngDvzChrTyp -> ChrLst -> DvzWksChr */
    public static final String AngDvzChrTyp_FKO_ChrLst = "ChrLst";
    /** FLng000351: AngDvzChrTyp -> LngLst -> AngDvzChrTypLng */
    public static final String AngDvzChrTyp_FKO_LngLst = "LngLst";
    /** FDvzWks001: AngDvzChrMacTyp <- MacTyp <- AngDvzChrTyp */
    public static final String AngDvzChrTyp_FKI_MacTyp = "MacTyp";

    /** Traduzioni per AngDvzChrTyp */
    public static final String AngDvzChrTypLng = "AngDvzChrTypLng";
    /** FLng000351: AngDvzChrTyp <- Rec <- AngDvzChrTypLng */
    public static final String AngDvzChrTypLng_FKI_Rec = "Rec";
    /** FLng000352: AngLng <- Lng <- AngDvzChrTypLng */
    public static final String AngDvzChrTypLng_FKI_Lng = "Lng";

    /** Tipo gantt layer */
    public static final String AngDvzGntLayTyp = "AngDvzGntLayTyp";
    /** FDvzWks060: AngDvzGntLayTyp -> GntLayLst -> DvzWksGntLay */
    public static final String AngDvzGntLayTyp_FKO_GntLayLst = "GntLayLst";
    /** FLng000353: AngDvzGntLayTyp -> LngLst -> AngDvzGntLayTypLng */
    public static final String AngDvzGntLayTyp_FKO_LngLst = "LngLst";

    /** Traduzioni per AngDvzGntLayTyp */
    public static final String AngDvzGntLayTypLng = "AngDvzGntLayTypLng";
    /** FLng000353: AngDvzGntLayTyp <- Rec <- AngDvzGntLayTypLng */
    public static final String AngDvzGntLayTypLng_FKI_Rec = "Rec";
    /** FLng000354: AngLng <- Lng <- AngDvzGntLayTypLng */
    public static final String AngDvzGntLayTypLng_FKI_Lng = "Lng";

    /** Anagrafica delle proprietà della mail */
    public static final String AngEmaPrp = "AngEmaPrp";
    /** FSysEma001: AngEmaSrv <- Srv <- AngEmaPrp */
    public static final String AngEmaPrp_FKI_Srv = "Srv";

    /** Anagrafica dei server di posta */
    public static final String AngEmaSrv = "AngEmaSrv";
    /** FLng000367: AngEmaSrv -> LngLst -> AngEmaSrvLng */
    public static final String AngEmaSrv_FKO_LngLst = "LngLst";
    /** FSysEma001: AngEmaSrv -> PrpEmaLst -> AngEmaPrp */
    public static final String AngEmaSrv_FKO_PrpEmaLst = "PrpEmaLst";
    /** FSysEma007: AngEmaSrv -> EmaCroLst -> EmaCro */
    public static final String AngEmaSrv_FKO_EmaCroLst = "EmaCroLst";

    /** Traduzioni per AngEmaSrv */
    public static final String AngEmaSrvLng = "AngEmaSrvLng";
    /** FLng000367: AngEmaSrv <- Rec <- AngEmaSrvLng */
    public static final String AngEmaSrvLng_FKI_Rec = "Rec";
    /** FLng000368: AngLng <- Lng <- AngEmaSrvLng */
    public static final String AngEmaSrvLng_FKI_Lng = "Lng";

    /** Anagrafica lavori ETL */
    public static final String AngEtlJob = "AngEtlJob";
    /** FLng000043: AngEtlJob -> LngLst -> AngEtlJobLng */
    public static final String AngEtlJob_FKO_LngLst = "LngLst";
    /** FSysEtl002: AngEtlJob -> EtlJobPrmLst -> AngEtlJobPrm */
    public static final String AngEtlJob_FKO_EtlJobPrmLst = "EtlJobPrmLst";
    /** FSysEtlWks004: AngEtlJob -> WksBtnActLst -> SysWksBtnAct */
    public static final String AngEtlJob_FKO_WksBtnActLst = "WksBtnActLst";
    /** FSysEtl001: AngEtlSrv <- EtlSrv <- AngEtlJob */
    public static final String AngEtlJob_FKI_EtlSrv = "EtlSrv";

    /** Traduzioni per AngEtlJob */
    public static final String AngEtlJobLng = "AngEtlJobLng";
    /** FLng000043: AngEtlJob <- Rec <- AngEtlJobLng */
    public static final String AngEtlJobLng_FKI_Rec = "Rec";
    /** FLng000044: AngLng <- Lng <- AngEtlJobLng */
    public static final String AngEtlJobLng_FKI_Lng = "Lng";

    /** Anagrafica parametri lavori ETL */
    public static final String AngEtlJobPrm = "AngEtlJobPrm";
    /** FLng000045: AngEtlJobPrm -> LngLst -> AngEtlJobPrmLng */
    public static final String AngEtlJobPrm_FKO_LngLst = "LngLst";
    /** FSysEtlWks002: AngEtlJobPrm -> SysWksBtnActLst -> SysEtlJobWksBtnActPrm */
    public static final String AngEtlJobPrm_FKO_SysWksBtnActLst = "SysWksBtnActLst";
    /** FSysEtl002: AngEtlJob <- EtlJob <- AngEtlJobPrm */
    public static final String AngEtlJobPrm_FKI_EtlJob = "EtlJob";

    /** Traduzioni per AngEtlJobPrm */
    public static final String AngEtlJobPrmLng = "AngEtlJobPrmLng";
    /** FLng000045: AngEtlJobPrm <- Rec <- AngEtlJobPrmLng */
    public static final String AngEtlJobPrmLng_FKI_Rec = "Rec";
    /** FLng000046: AngLng <- Lng <- AngEtlJobPrmLng */
    public static final String AngEtlJobPrmLng_FKI_Lng = "Lng";

    /** ETL server */
    public static final String AngEtlSrv = "AngEtlSrv";
    /** FLng000041: AngEtlSrv -> LngLst -> AngEtlSrvLng */
    public static final String AngEtlSrv_FKO_LngLst = "LngLst";
    /** FSysEtl001: AngEtlSrv -> EtlJobLst -> AngEtlJob */
    public static final String AngEtlSrv_FKO_EtlJobLst = "EtlJobLst";

    /** Traduzioni per AngEtlSrv */
    public static final String AngEtlSrvLng = "AngEtlSrvLng";
    /** FLng000041: AngEtlSrv <- Rec <- AngEtlSrvLng */
    public static final String AngEtlSrvLng_FKI_Rec = "Rec";
    /** FLng000042: AngLng <- Lng <- AngEtlSrvLng */
    public static final String AngEtlSrvLng_FKI_Lng = "Lng";

    /** Entity */
    public static final String AngEty = "AngEty";
    /** FSysCal037: AngEty -> Evt -> CalEvt */
    public static final String AngEty_FKO_Evt = "Evt";
    /** FSysEty002: AngEty -> EtyTrgLst -> AngEtyLnk */
    public static final String AngEty_FKO_EtyTrgLst = "EtyTrgLst";
    /** FSysEty003: AngEty -> EtySrcLst -> AngEtyLnk */
    public static final String AngEty_FKO_EtySrcLst = "EtySrcLst";
    /** FSysEty005: AngEty -> ComLst -> AngEtyCom */
    public static final String AngEty_FKO_ComLst = "ComLst";
    /** FSysEty007: AngEty -> ExtLnkLst -> AngEtyExtLnk */
    public static final String AngEty_FKO_ExtLnkLst = "ExtLnkLst";
    /** FSysEty009: AngEty -> LikLst -> AngEtyLik */
    public static final String AngEty_FKO_LikLst = "LikLst";
    /** FSysEty011: AngEty -> MenLst -> AngEtyMen */
    public static final String AngEty_FKO_MenLst = "MenLst";
    /** FSysEty014: AngEty -> AttLst -> AngEtyAtt */
    public static final String AngEty_FKO_AttLst = "AttLst";
    /** FSysEty017: AngEty -> WtcLst -> AngEtyWtc */
    public static final String AngEty_FKO_WtcLst = "WtcLst";
    /** FSysEty031: AngEty -> DocLst -> AngEtyDoc */
    public static final String AngEty_FKO_DocLst = "DocLst";
    /** FSysRep006: AngEty -> RepMdlLngLst -> RepMdlLngVrs */
    public static final String AngEty_FKO_RepMdlLngLst = "RepMdlLngLst";
    /** FSysEty001: AngDbmTbl <- Tbl <- AngEty */
    public static final String AngEty_FKI_Tbl = "Tbl";

    /** Allegati su entity */
    public static final String AngEtyAtt = "AngEtyAtt";
    /** FSysEty028: AngEtyAtt -> VisLst -> AngEtyAttVis */
    public static final String AngEtyAtt_FKO_VisLst = "VisLst";
    /** FSysEty033: AngEtyAtt -> DupAttLst -> AngEtyAtt */
    public static final String AngEtyAtt_FKO_DupAttLst = "DupAttLst";
    /** FSysMnc018: AngEtyAtt -> NotEtyAttLst -> MncNotEtyAtt */
    public static final String AngEtyAtt_FKO_NotEtyAttLst = "NotEtyAttLst";
    /** FSysEty014: AngEty <- Ety <- AngEtyAtt */
    public static final String AngEtyAtt_FKI_Ety = "Ety";
    /** FSysEty015: AngEtyAttTyp <- Typ <- AngEtyAtt */
    public static final String AngEtyAtt_FKI_Typ = "Typ";
    /** FSysEty016: AngEtyAttCat <- Cat <- AngEtyAtt */
    public static final String AngEtyAtt_FKI_Cat = "Cat";
    /** FSysEty019: AngEtyCom <- Com <- AngEtyAtt */
    public static final String AngEtyAtt_FKI_Com = "Com";
    /** FSysEty021: AngRes <- Res <- AngEtyAtt */
    public static final String AngEtyAtt_FKI_Res = "Res";
    /** FSysEty022: AngDbmTbl <- CtxTbl <- AngEtyAtt */
    public static final String AngEtyAtt_FKI_CtxTbl = "CtxTbl";
    /** FSysEty030: AngRes <- ObsRes <- AngEtyAtt */
    public static final String AngEtyAtt_FKI_ObsRes = "ObsRes";
    /** FSysEty032: AngEtyDoc <- DocEty <- AngEtyAtt */
    public static final String AngEtyAtt_FKI_DocEty = "DocEty";
    /** FSysEty033: AngEtyAtt <- SrcAtt <- AngEtyAtt */
    public static final String AngEtyAtt_FKI_SrcAtt = "SrcAtt";

    /** Categorie allegati su entity */
    public static final String AngEtyAttCat = "AngEtyAttCat";
    /** FLng000203: AngEtyAttCat -> LngLst -> AngEtyAttCatLng */
    public static final String AngEtyAttCat_FKO_LngLst = "LngLst";
    /** FSysDoc022: AngEtyAttCat -> DocCtxLst -> SysDocCtxCatAtt */
    public static final String AngEtyAttCat_FKO_DocCtxLst = "DocCtxLst";
    /** FSysEty016: AngEtyAttCat -> AttLst -> AngEtyAtt */
    public static final String AngEtyAttCat_FKO_AttLst = "AttLst";

    /** Traduzioni per AngEtyAttCat */
    public static final String AngEtyAttCatLng = "AngEtyAttCatLng";
    /** FLng000203: AngEtyAttCat <- Rec <- AngEtyAttCatLng */
    public static final String AngEtyAttCatLng_FKI_Rec = "Rec";
    /** FLng000204: AngLng <- Lng <- AngEtyAttCatLng */
    public static final String AngEtyAttCatLng_FKI_Lng = "Lng";

    /** Tipi allegati su entity */
    public static final String AngEtyAttTyp = "AngEtyAttTyp";
    /** FLng000201: AngEtyAttTyp -> LngLst -> AngEtyAttTypLng */
    public static final String AngEtyAttTyp_FKO_LngLst = "LngLst";
    /** FSysEty015: AngEtyAttTyp -> AttLst -> AngEtyAtt */
    public static final String AngEtyAttTyp_FKO_AttLst = "AttLst";

    /** Traduzioni per AngEtyAttTyp */
    public static final String AngEtyAttTypLng = "AngEtyAttTypLng";
    /** FLng000201: AngEtyAttTyp <- Rec <- AngEtyAttTypLng */
    public static final String AngEtyAttTypLng_FKI_Rec = "Rec";
    /** FLng000202: AngLng <- Lng <- AngEtyAttTypLng */
    public static final String AngEtyAttTypLng_FKI_Lng = "Lng";

    /** Visibilità di allegati su entity */
    public static final String AngEtyAttVis = "AngEtyAttVis";
    /** FSysEty024: AngRes <- Res <- AngEtyAttVis */
    public static final String AngEtyAttVis_FKI_Res = "Res";
    /** FSysEty026: AngGrp <- Grp <- AngEtyAttVis */
    public static final String AngEtyAttVis_FKI_Grp = "Grp";
    /** FSysEty028: AngEtyAtt <- Att <- AngEtyAttVis */
    public static final String AngEtyAttVis_FKI_Att = "Att";

    /** Commenti su entity */
    public static final String AngEtyCom = "AngEtyCom";
    /** FSysEty019: AngEtyCom -> AttLst -> AngEtyAtt */
    public static final String AngEtyCom_FKO_AttLst = "AttLst";
    /** FSysEty029: AngEtyCom -> VisLst -> AngEtyComVis */
    public static final String AngEtyCom_FKO_VisLst = "VisLst";
    /** FSysEty005: AngEty <- Ety <- AngEtyCom */
    public static final String AngEtyCom_FKI_Ety = "Ety";
    /** FSysEty006: AngRes <- Res <- AngEtyCom */
    public static final String AngEtyCom_FKI_Res = "Res";
    /** FSysEty023: AngDbmTbl <- CtxTbl <- AngEtyCom */
    public static final String AngEtyCom_FKI_CtxTbl = "CtxTbl";

    /** Visibilità di commenti su entity */
    public static final String AngEtyComVis = "AngEtyComVis";
    /** FSysEty025: AngRes <- Res <- AngEtyComVis */
    public static final String AngEtyComVis_FKI_Res = "Res";
    /** FSysEty027: AngGrp <- Grp <- AngEtyComVis */
    public static final String AngEtyComVis_FKI_Grp = "Grp";
    /** FSysEty029: AngEtyCom <- Com <- AngEtyComVis */
    public static final String AngEtyComVis_FKI_Com = "Com";

    /** Documenti su entity */
    public static final String AngEtyDoc = "AngEtyDoc";
    /** FSysEty032: AngEtyDoc -> EtyAttLst -> AngEtyAtt */
    public static final String AngEtyDoc_FKO_EtyAttLst = "EtyAttLst";
    /** FSysEty034: AngEtyDoc -> DupDocLst -> AngEtyDoc */
    public static final String AngEtyDoc_FKO_DupDocLst = "DupDocLst";
    /** FSysDoc020: SysDocCls <- DocCls <- AngEtyDoc */
    public static final String AngEtyDoc_FKI_DocCls = "DocCls";
    /** FSysEty031: AngEty <- Ety <- AngEtyDoc */
    public static final String AngEtyDoc_FKI_Ety = "Ety";
    /** FSysEty034: AngEtyDoc <- SrcDoc <- AngEtyDoc */
    public static final String AngEtyDoc_FKI_SrcDoc = "SrcDoc";

    /** Links su entity */
    public static final String AngEtyExtLnk = "AngEtyExtLnk";
    /** FSysEty007: AngEty <- Ety <- AngEtyExtLnk */
    public static final String AngEtyExtLnk_FKI_Ety = "Ety";
    /** FSysEty008: AngRes <- Res <- AngEtyExtLnk */
    public static final String AngEtyExtLnk_FKI_Res = "Res";

    /** Likes su entity */
    public static final String AngEtyLik = "AngEtyLik";
    /** FSysEty009: AngEty <- Ety <- AngEtyLik */
    public static final String AngEtyLik_FKI_Ety = "Ety";
    /** FSysEty010: AngRes <- Res <- AngEtyLik */
    public static final String AngEtyLik_FKI_Res = "Res";

    /** Collegamenti tra entity */
    public static final String AngEtyLnk = "AngEtyLnk";
    /** FSysEty002: AngEty <- EtySrc <- AngEtyLnk */
    public static final String AngEtyLnk_FKI_EtySrc = "EtySrc";
    /** FSysEty003: AngEty <- EtyTrg <- AngEtyLnk */
    public static final String AngEtyLnk_FKI_EtyTrg = "EtyTrg";
    /** FSysEty004: AngEtyLnkTyp <- Typ <- AngEtyLnk */
    public static final String AngEtyLnk_FKI_Typ = "Typ";
    /** FSysEty020: AngRes <- Res <- AngEtyLnk */
    public static final String AngEtyLnk_FKI_Res = "Res";

    /** Entity link type */
    public static final String AngEtyLnkTyp = "AngEtyLnkTyp";
    /** FLng000199: AngEtyLnkTyp -> LngLst -> AngEtyLnkTypLng */
    public static final String AngEtyLnkTyp_FKO_LngLst = "LngLst";
    /** FSysEty004: AngEtyLnkTyp -> LnkLst -> AngEtyLnk */
    public static final String AngEtyLnkTyp_FKO_LnkLst = "LnkLst";

    /** Traduzioni per AngEtyLnkTyp */
    public static final String AngEtyLnkTypLng = "AngEtyLnkTypLng";
    /** FLng000199: AngEtyLnkTyp <- Rec <- AngEtyLnkTypLng */
    public static final String AngEtyLnkTypLng_FKI_Rec = "Rec";
    /** FLng000200: AngLng <- Lng <- AngEtyLnkTypLng */
    public static final String AngEtyLnkTypLng_FKI_Lng = "Lng";

    /** Menzioni su entity */
    public static final String AngEtyMen = "AngEtyMen";
    /** FSysEty011: AngEty <- Ety <- AngEtyMen */
    public static final String AngEtyMen_FKI_Ety = "Ety";
    /** FSysEty012: AngRes <- ResCrt <- AngEtyMen */
    public static final String AngEtyMen_FKI_ResCrt = "ResCrt";
    /** FSysEty013: AngRes <- Res <- AngEtyMen */
    public static final String AngEtyMen_FKI_Res = "Res";

    /** Watchers/followers su entity */
    public static final String AngEtyWtc = "AngEtyWtc";
    /** FSysEty017: AngEty <- Ety <- AngEtyWtc */
    public static final String AngEtyWtc_FKI_Ety = "Ety";
    /** FSysEty018: AngRes <- Res <- AngEtyWtc */
    public static final String AngEtyWtc_FKI_Res = "Res";

    /** Gruppi risorse */
    public static final String AngGrp = "AngGrp";
    /** FDvzRep002: AngGrp -> RepLst -> DvzRepGrp */
    public static final String AngGrp_FKO_RepLst = "RepLst";
    /** FLng000055: AngGrp -> LngLst -> AngGrpLng */
    public static final String AngGrp_FKO_LngLst = "LngLst";
    /** FSysApp001: AngGrp -> AppLst -> SysApp */
    public static final String AngGrp_FKO_AppLst = "AppLst";
    /** FSysBas007: AngGrp -> CusLst -> AngCusGrp */
    public static final String AngGrp_FKO_CusLst = "CusLst";
    /** FSysEma004: AngGrp -> EmaEleLst -> EmaLstEle */
    public static final String AngGrp_FKO_EmaEleLst = "EmaEleLst";
    /** FSysEty026: AngGrp -> EtyAttVisLst -> AngEtyAttVis */
    public static final String AngGrp_FKO_EtyAttVisLst = "EtyAttVisLst";
    /** FSysEty027: AngGrp -> EtyComVisLst -> AngEtyComVis */
    public static final String AngGrp_FKO_EtyComVisLst = "EtyComVisLst";
    /** FSysGrp001: AngGrp -> GrpFunLst -> AngGrpFun */
    public static final String AngGrp_FKO_GrpFunLst = "GrpFunLst";
    /** FSysGrp002: AngGrp -> GrpFunMbrLst -> AngGrpFun */
    public static final String AngGrp_FKO_GrpFunMbrLst = "GrpFunMbrLst";
    /** FSysGrp003: AngGrp -> GrpFunResLst -> AngGrpResFun */
    public static final String AngGrp_FKO_GrpFunResLst = "GrpFunResLst";
    /** FSysGrp005: AngGrp -> ResGrpLst -> AngResGrp */
    public static final String AngGrp_FKO_ResGrpLst = "ResGrpLst";
    /** FSysGrp007: AngGrp -> PrdCycOprPlnLst -> AngPrdCycOpr */
    public static final String AngGrp_FKO_PrdCycOprPlnLst = "PrdCycOprPlnLst";
    /** FSysOrg010: AngGrp -> ManLvlLst -> OrgLvlManGrp */
    public static final String AngGrp_FKO_ManLvlLst = "ManLvlLst";
    /** FSysOrg056: AngGrp -> LvlLst -> OrgLvlGrp */
    public static final String AngGrp_FKO_LvlLst = "LvlLst";
    /** FSysOrg062: AngGrp -> LvlRepLst -> OrgLvl */
    public static final String AngGrp_FKO_LvlRepLst = "LvlRepLst";
    /** FSysOrg064: AngGrp -> GenLvlLst -> GenOrgLvlGrp */
    public static final String AngGrp_FKO_GenLvlLst = "GenLvlLst";
    /** FSysQry045: AngGrp -> QryColLst -> AngQryColGrp */
    public static final String AngGrp_FKO_QryColLst = "QryColLst";
    /** FSysRep003: AngGrp -> RepMdlLst -> RepMdl */
    public static final String AngGrp_FKO_RepMdlLst = "RepMdlLst";
    /** FSysUif003: AngGrp -> MnuLst -> SysMnu */
    public static final String AngGrp_FKO_MnuLst = "MnuLst";
    /** FSysWks005: AngGrp -> GrpLst -> SysWksGrp */
    public static final String AngGrp_FKO_GrpLst = "GrpLst";
    /** FSysGrp008: AngGrpCat <- GrpCat <- AngGrp */
    public static final String AngGrp_FKI_GrpCat = "GrpCat";

    /** Categorie gruppi */
    public static final String AngGrpCat = "AngGrpCat";
    /** FLng000057: AngGrpCat -> LngLst -> AngGrpCatLng */
    public static final String AngGrpCat_FKO_LngLst = "LngLst";
    /** FSysGrp008: AngGrpCat -> GrpLst -> AngGrp */
    public static final String AngGrpCat_FKO_GrpLst = "GrpLst";

    /** Traduzioni per AngGrpCat */
    public static final String AngGrpCatLng = "AngGrpCatLng";
    /** FLng000057: AngGrpCat <- Rec <- AngGrpCatLng */
    public static final String AngGrpCatLng_FKI_Rec = "Rec";
    /** FLng000058: AngLng <- Lng <- AngGrpCatLng */
    public static final String AngGrpCatLng_FKI_Lng = "Lng";

    /** Membri funzioni di calcolo gruppi */
    public static final String AngGrpFun = "AngGrpFun";
    /** FSysGrp001: AngGrp <- Grp <- AngGrpFun */
    public static final String AngGrpFun_FKI_Grp = "Grp";
    /** FSysGrp002: AngGrp <- GrpMbr <- AngGrpFun */
    public static final String AngGrpFun_FKI_GrpMbr = "GrpMbr";

    /** Traduzioni per AngGrp */
    public static final String AngGrpLng = "AngGrpLng";
    /** FLng000055: AngGrp <- Rec <- AngGrpLng */
    public static final String AngGrpLng_FKI_Rec = "Rec";
    /** FLng000056: AngLng <- Lng <- AngGrpLng */
    public static final String AngGrpLng_FKI_Lng = "Lng";

    /** Membri risorse di calcolo gruppi */
    public static final String AngGrpResFun = "AngGrpResFun";
    /** FSysGrp003: AngGrp <- Grp <- AngGrpResFun */
    public static final String AngGrpResFun_FKI_Grp = "Grp";
    /** FSysGrp004: AngRes <- Res <- AngGrpResFun */
    public static final String AngGrpResFun_FKI_Res = "Res";

    /** Anagrafica script installer lanciati */
    public static final String AngInsSpt = "AngInsSpt";

    /** Articoli */
    public static final String AngItm = "AngItm";
    /** FLng000075: AngItm -> LngLst -> AngItmLng */
    public static final String AngItm_FKO_LngLst = "LngLst";
    /** FSysItm001: AngItm -> PrdCycLst -> AngPrdCyc */
    public static final String AngItm_FKO_PrdCycLst = "PrdCycLst";
    /** FSysItm004: AngItm -> ItmNtlRef -> AngItm */
    public static final String AngItm_FKO_ItmNtlRef = "ItmNtlRef";
    /** FSysItm005: AngItm -> ItmTmlRef -> AngItm */
    public static final String AngItm_FKO_ItmTmlRef = "ItmTmlRef";
    /** FSysItm011: AngItm -> BomLst -> AngBom */
    public static final String AngItm_FKO_BomLst = "BomLst";
    /** FSysItm012: AngItm -> ItmLst -> ItmSerNum */
    public static final String AngItm_FKO_ItmLst = "ItmLst";
    /** FSysItm116: AngItm -> ItmComLst -> AngItm */
    public static final String AngItm_FKO_ItmComLst = "ItmComLst";
    /** FSysItm121: AngItm -> ItmDimLst -> AngItmDim */
    public static final String AngItm_FKO_ItmDimLst = "ItmDimLst";
    /** FSysItm127: AngItm -> ItmVrnLst -> AngItmVrn */
    public static final String AngItm_FKO_ItmVrnLst = "ItmVrnLst";
    /** FSysItm129: AngItm -> ItmMdlLst -> AngItmMdl */
    public static final String AngItm_FKO_ItmMdlLst = "ItmMdlLst";
    /** FSysItm132: AngItm -> ItmLvlSugLst -> AngItmLvlSug */
    public static final String AngItm_FKO_ItmLvlSugLst = "ItmLvlSugLst";
    /** FSysItm136: AngItm -> PrdBomLst -> AngBom */
    public static final String AngItm_FKO_PrdBomLst = "PrdBomLst";
    /** FMulOrg002: AngOrgCom <- OrgCom <- AngItm */
    public static final String AngItm_FKI_OrgCom = "OrgCom";
    /** FSysItm003: AngUniMea <- UniMeaAlt <- AngItm */
    public static final String AngItm_FKI_UniMeaAlt = "UniMeaAlt";
    /** FSysItm004: AngItm <- ItmNtl <- AngItm */
    public static final String AngItm_FKI_ItmNtl = "ItmNtl";
    /** FSysItm005: AngItm <- ItmTml <- AngItm */
    public static final String AngItm_FKI_ItmTml = "ItmTml";
    /** FSysItm006: AngVat <- Vat <- AngItm */
    public static final String AngItm_FKI_Vat = "Vat";
    /** FSysItm007: AngSup <- Sup <- AngItm */
    public static final String AngItm_FKI_Sup = "Sup";
    /** FSysItm008: AngUniMea <- UniMea <- AngItm */
    public static final String AngItm_FKI_UniMea = "UniMea";
    /** FSysItm043: AngItmCls001 <- ClsItm001 <- AngItm */
    public static final String AngItm_FKI_ClsItm001 = "ClsItm001";
    /** FSysItm044: AngItmCls002 <- ClsItm002 <- AngItm */
    public static final String AngItm_FKI_ClsItm002 = "ClsItm002";
    /** FSysItm045: AngItmCls003 <- ClsItm003 <- AngItm */
    public static final String AngItm_FKI_ClsItm003 = "ClsItm003";
    /** FSysItm046: AngItmCls004 <- ClsItm004 <- AngItm */
    public static final String AngItm_FKI_ClsItm004 = "ClsItm004";
    /** FSysItm047: AngItmCls005 <- ClsItm005 <- AngItm */
    public static final String AngItm_FKI_ClsItm005 = "ClsItm005";
    /** FSysItm048: AngItmCls006 <- ClsItm006 <- AngItm */
    public static final String AngItm_FKI_ClsItm006 = "ClsItm006";
    /** FSysItm049: AngItmCls007 <- ClsItm007 <- AngItm */
    public static final String AngItm_FKI_ClsItm007 = "ClsItm007";
    /** FSysItm050: AngItmCls008 <- ClsItm008 <- AngItm */
    public static final String AngItm_FKI_ClsItm008 = "ClsItm008";
    /** FSysItm051: AngItmCls009 <- ClsItm009 <- AngItm */
    public static final String AngItm_FKI_ClsItm009 = "ClsItm009";
    /** FSysItm052: AngItmCls010 <- ClsItm010 <- AngItm */
    public static final String AngItm_FKI_ClsItm010 = "ClsItm010";
    /** FSysItm053: AngItmCls011 <- ClsItm011 <- AngItm */
    public static final String AngItm_FKI_ClsItm011 = "ClsItm011";
    /** FSysItm054: AngItmCls012 <- ClsItm012 <- AngItm */
    public static final String AngItm_FKI_ClsItm012 = "ClsItm012";
    /** FSysItm055: AngItmCls013 <- ClsItm013 <- AngItm */
    public static final String AngItm_FKI_ClsItm013 = "ClsItm013";
    /** FSysItm056: AngItmCls014 <- ClsItm014 <- AngItm */
    public static final String AngItm_FKI_ClsItm014 = "ClsItm014";
    /** FSysItm057: AngItmCls015 <- ClsItm015 <- AngItm */
    public static final String AngItm_FKI_ClsItm015 = "ClsItm015";
    /** FSysItm058: AngItmSts <- ItmSts <- AngItm */
    public static final String AngItm_FKI_ItmSts = "ItmSts";
    /** FSysItm061: AngItmCat <- ItmCat <- AngItm */
    public static final String AngItm_FKI_ItmCat = "ItmCat";
    /** FSysItm101: AngItmCls016 <- ClsItm016 <- AngItm */
    public static final String AngItm_FKI_ClsItm016 = "ClsItm016";
    /** FSysItm102: AngItmCls017 <- ClsItm017 <- AngItm */
    public static final String AngItm_FKI_ClsItm017 = "ClsItm017";
    /** FSysItm103: AngItmCls018 <- ClsItm018 <- AngItm */
    public static final String AngItm_FKI_ClsItm018 = "ClsItm018";
    /** FSysItm104: AngItmCls019 <- ClsItm019 <- AngItm */
    public static final String AngItm_FKI_ClsItm019 = "ClsItm019";
    /** FSysItm105: AngItmCls020 <- ClsItm020 <- AngItm */
    public static final String AngItm_FKI_ClsItm020 = "ClsItm020";
    /** FSysItm106: AngItmCls021 <- ClsItm021 <- AngItm */
    public static final String AngItm_FKI_ClsItm021 = "ClsItm021";
    /** FSysItm107: AngItmCls022 <- ClsItm022 <- AngItm */
    public static final String AngItm_FKI_ClsItm022 = "ClsItm022";
    /** FSysItm108: AngItmCls023 <- ClsItm023 <- AngItm */
    public static final String AngItm_FKI_ClsItm023 = "ClsItm023";
    /** FSysItm109: AngItmCls024 <- ClsItm024 <- AngItm */
    public static final String AngItm_FKI_ClsItm024 = "ClsItm024";
    /** FSysItm110: AngItmCls025 <- ClsItm025 <- AngItm */
    public static final String AngItm_FKI_ClsItm025 = "ClsItm025";
    /** FSysItm111: AngItmCls026 <- ClsItm026 <- AngItm */
    public static final String AngItm_FKI_ClsItm026 = "ClsItm026";
    /** FSysItm112: AngItmCls027 <- ClsItm027 <- AngItm */
    public static final String AngItm_FKI_ClsItm027 = "ClsItm027";
    /** FSysItm113: AngItmCls028 <- ClsItm028 <- AngItm */
    public static final String AngItm_FKI_ClsItm028 = "ClsItm028";
    /** FSysItm114: AngItmCls029 <- ClsItm029 <- AngItm */
    public static final String AngItm_FKI_ClsItm029 = "ClsItm029";
    /** FSysItm115: AngItmCls030 <- ClsItm030 <- AngItm */
    public static final String AngItm_FKI_ClsItm030 = "ClsItm030";
    /** FSysItm116: AngItm <- ComItm <- AngItm */
    public static final String AngItm_FKI_ComItm = "ComItm";
    /** FSysItm118: AngItmTypPrd <- Typ <- AngItm */
    public static final String AngItm_FKI_Typ = "Typ";
    /** FSysItm119: AngWhs <- Whs <- AngItm */
    public static final String AngItm_FKI_Whs = "Whs";
    /** FSysItm120: AngItmOwn <- Own <- AngItm */
    public static final String AngItm_FKI_Own = "Own";

    /** Categoria articolo */
    public static final String AngItmCat = "AngItmCat";
    /** FLng000161: AngItmCat -> LngLst -> AngItmCatLng */
    public static final String AngItmCat_FKO_LngLst = "LngLst";
    /** FSysItm061: AngItmCat -> ItmLst -> AngItm */
    public static final String AngItmCat_FKO_ItmLst = "ItmLst";

    /** Traduzioni per AngItmCat */
    public static final String AngItmCatLng = "AngItmCatLng";
    /** FLng000161: AngItmCat <- Rec <- AngItmCatLng */
    public static final String AngItmCatLng_FKI_Rec = "Rec";
    /** FLng000162: AngLng <- Lng <- AngItmCatLng */
    public static final String AngItmCatLng_FKI_Lng = "Lng";

    /** Classifica 1 */
    public static final String AngItmCls001 = "AngItmCls001";
    /** FLng000081: AngItmCls001 -> LngLst -> AngItmCls001Lng */
    public static final String AngItmCls001_FKO_LngLst = "LngLst";
    /** FSysItm013: AngItmCls001 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls001_FKO_ClsLst = "ClsLst";
    /** FSysItm028: AngItmCls001 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls001_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm043: AngItmCls001 -> ItmLst -> AngItm */
    public static final String AngItmCls001_FKO_ItmLst = "ItmLst";
    /** FSysOrg030: AngItmCls001 -> RecRulLst -> SysReaRulRol */
    public static final String AngItmCls001_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngItmCls001 */
    public static final String AngItmCls001Lng = "AngItmCls001Lng";
    /** FLng000081: AngItmCls001 <- Rec <- AngItmCls001Lng */
    public static final String AngItmCls001Lng_FKI_Rec = "Rec";
    /** FLng000082: AngLng <- Lng <- AngItmCls001Lng */
    public static final String AngItmCls001Lng_FKI_Lng = "Lng";

    /** Classifica 2 */
    public static final String AngItmCls002 = "AngItmCls002";
    /** FLng000083: AngItmCls002 -> LngLst -> AngItmCls002Lng */
    public static final String AngItmCls002_FKO_LngLst = "LngLst";
    /** FSysItm014: AngItmCls002 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls002_FKO_ClsLst = "ClsLst";
    /** FSysItm029: AngItmCls002 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls002_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm044: AngItmCls002 -> ItmLst -> AngItm */
    public static final String AngItmCls002_FKO_ItmLst = "ItmLst";
    /** FSysOrg031: AngItmCls002 -> RecRulLst -> SysReaRulRol */
    public static final String AngItmCls002_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngItmCls002 */
    public static final String AngItmCls002Lng = "AngItmCls002Lng";
    /** FLng000083: AngItmCls002 <- Rec <- AngItmCls002Lng */
    public static final String AngItmCls002Lng_FKI_Rec = "Rec";
    /** FLng000084: AngLng <- Lng <- AngItmCls002Lng */
    public static final String AngItmCls002Lng_FKI_Lng = "Lng";

    /** Classifica 3 */
    public static final String AngItmCls003 = "AngItmCls003";
    /** FLng000085: AngItmCls003 -> LngLst -> AngItmCls003Lng */
    public static final String AngItmCls003_FKO_LngLst = "LngLst";
    /** FSysItm015: AngItmCls003 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls003_FKO_ClsLst = "ClsLst";
    /** FSysItm030: AngItmCls003 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls003_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm045: AngItmCls003 -> ItmLst -> AngItm */
    public static final String AngItmCls003_FKO_ItmLst = "ItmLst";
    /** FSysOrg032: AngItmCls003 -> RecRulLst -> SysReaRulRol */
    public static final String AngItmCls003_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngItmCls003 */
    public static final String AngItmCls003Lng = "AngItmCls003Lng";
    /** FLng000085: AngItmCls003 <- Rec <- AngItmCls003Lng */
    public static final String AngItmCls003Lng_FKI_Rec = "Rec";
    /** FLng000086: AngLng <- Lng <- AngItmCls003Lng */
    public static final String AngItmCls003Lng_FKI_Lng = "Lng";

    /** Classifica 4 */
    public static final String AngItmCls004 = "AngItmCls004";
    /** FLng000087: AngItmCls004 -> LngLst -> AngItmCls004Lng */
    public static final String AngItmCls004_FKO_LngLst = "LngLst";
    /** FSysItm016: AngItmCls004 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls004_FKO_ClsLst = "ClsLst";
    /** FSysItm031: AngItmCls004 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls004_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm046: AngItmCls004 -> ItmLst -> AngItm */
    public static final String AngItmCls004_FKO_ItmLst = "ItmLst";
    /** FSysOrg033: AngItmCls004 -> RecRulLst -> SysReaRulRol */
    public static final String AngItmCls004_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngItmCls004 */
    public static final String AngItmCls004Lng = "AngItmCls004Lng";
    /** FLng000087: AngItmCls004 <- Rec <- AngItmCls004Lng */
    public static final String AngItmCls004Lng_FKI_Rec = "Rec";
    /** FLng000088: AngLng <- Lng <- AngItmCls004Lng */
    public static final String AngItmCls004Lng_FKI_Lng = "Lng";

    /** Classifica 5 */
    public static final String AngItmCls005 = "AngItmCls005";
    /** FLng000089: AngItmCls005 -> LngLst -> AngItmCls005Lng */
    public static final String AngItmCls005_FKO_LngLst = "LngLst";
    /** FSysItm017: AngItmCls005 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls005_FKO_ClsLst = "ClsLst";
    /** FSysItm032: AngItmCls005 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls005_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm047: AngItmCls005 -> ItmLst -> AngItm */
    public static final String AngItmCls005_FKO_ItmLst = "ItmLst";
    /** FSysOrg034: AngItmCls005 -> RecRulLst -> SysReaRulRol */
    public static final String AngItmCls005_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngItmCls005 */
    public static final String AngItmCls005Lng = "AngItmCls005Lng";
    /** FLng000089: AngItmCls005 <- Rec <- AngItmCls005Lng */
    public static final String AngItmCls005Lng_FKI_Rec = "Rec";
    /** FLng000090: AngLng <- Lng <- AngItmCls005Lng */
    public static final String AngItmCls005Lng_FKI_Lng = "Lng";

    /** Classifica 6 */
    public static final String AngItmCls006 = "AngItmCls006";
    /** FLng000091: AngItmCls006 -> LngLst -> AngItmCls006Lng */
    public static final String AngItmCls006_FKO_LngLst = "LngLst";
    /** FSysItm018: AngItmCls006 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls006_FKO_ClsLst = "ClsLst";
    /** FSysItm033: AngItmCls006 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls006_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm048: AngItmCls006 -> ItmLst -> AngItm */
    public static final String AngItmCls006_FKO_ItmLst = "ItmLst";
    /** FSysOrg035: AngItmCls006 -> RecRulLst -> SysReaRulRol */
    public static final String AngItmCls006_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngItmCls006 */
    public static final String AngItmCls006Lng = "AngItmCls006Lng";
    /** FLng000091: AngItmCls006 <- Rec <- AngItmCls006Lng */
    public static final String AngItmCls006Lng_FKI_Rec = "Rec";
    /** FLng000092: AngLng <- Lng <- AngItmCls006Lng */
    public static final String AngItmCls006Lng_FKI_Lng = "Lng";

    /** Classifica 7 */
    public static final String AngItmCls007 = "AngItmCls007";
    /** FLng000093: AngItmCls007 -> LngLst -> AngItmCls007Lng */
    public static final String AngItmCls007_FKO_LngLst = "LngLst";
    /** FSysItm019: AngItmCls007 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls007_FKO_ClsLst = "ClsLst";
    /** FSysItm034: AngItmCls007 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls007_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm049: AngItmCls007 -> ItmLst -> AngItm */
    public static final String AngItmCls007_FKO_ItmLst = "ItmLst";
    /** FSysOrg036: AngItmCls007 -> RecRulLst -> SysReaRulRol */
    public static final String AngItmCls007_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngItmCls007 */
    public static final String AngItmCls007Lng = "AngItmCls007Lng";
    /** FLng000093: AngItmCls007 <- Rec <- AngItmCls007Lng */
    public static final String AngItmCls007Lng_FKI_Rec = "Rec";
    /** FLng000094: AngLng <- Lng <- AngItmCls007Lng */
    public static final String AngItmCls007Lng_FKI_Lng = "Lng";

    /** Classifica 8 */
    public static final String AngItmCls008 = "AngItmCls008";
    /** FLng000095: AngItmCls008 -> LngLst -> AngItmCls008Lng */
    public static final String AngItmCls008_FKO_LngLst = "LngLst";
    /** FSysItm020: AngItmCls008 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls008_FKO_ClsLst = "ClsLst";
    /** FSysItm035: AngItmCls008 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls008_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm050: AngItmCls008 -> ItmLst -> AngItm */
    public static final String AngItmCls008_FKO_ItmLst = "ItmLst";
    /** FSysOrg037: AngItmCls008 -> RecRulLst -> SysReaRulRol */
    public static final String AngItmCls008_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngItmCls008 */
    public static final String AngItmCls008Lng = "AngItmCls008Lng";
    /** FLng000095: AngItmCls008 <- Rec <- AngItmCls008Lng */
    public static final String AngItmCls008Lng_FKI_Rec = "Rec";
    /** FLng000096: AngLng <- Lng <- AngItmCls008Lng */
    public static final String AngItmCls008Lng_FKI_Lng = "Lng";

    /** Classifica 9 */
    public static final String AngItmCls009 = "AngItmCls009";
    /** FLng000097: AngItmCls009 -> LngLst -> AngItmCls009Lng */
    public static final String AngItmCls009_FKO_LngLst = "LngLst";
    /** FSysItm021: AngItmCls009 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls009_FKO_ClsLst = "ClsLst";
    /** FSysItm036: AngItmCls009 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls009_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm051: AngItmCls009 -> ItmLst -> AngItm */
    public static final String AngItmCls009_FKO_ItmLst = "ItmLst";
    /** FSysOrg038: AngItmCls009 -> RecRulLst -> SysReaRulRol */
    public static final String AngItmCls009_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngItmCls009 */
    public static final String AngItmCls009Lng = "AngItmCls009Lng";
    /** FLng000097: AngItmCls009 <- Rec <- AngItmCls009Lng */
    public static final String AngItmCls009Lng_FKI_Rec = "Rec";
    /** FLng000098: AngLng <- Lng <- AngItmCls009Lng */
    public static final String AngItmCls009Lng_FKI_Lng = "Lng";

    /** Classifica 10 */
    public static final String AngItmCls010 = "AngItmCls010";
    /** FLng000099: AngItmCls010 -> LngLst -> AngItmCls010Lng */
    public static final String AngItmCls010_FKO_LngLst = "LngLst";
    /** FSysItm022: AngItmCls010 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls010_FKO_ClsLst = "ClsLst";
    /** FSysItm037: AngItmCls010 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls010_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm052: AngItmCls010 -> ItmLst -> AngItm */
    public static final String AngItmCls010_FKO_ItmLst = "ItmLst";
    /** FSysOrg039: AngItmCls010 -> RecRulLst -> SysReaRulRol */
    public static final String AngItmCls010_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngItmCls010 */
    public static final String AngItmCls010Lng = "AngItmCls010Lng";
    /** FLng000099: AngItmCls010 <- Rec <- AngItmCls010Lng */
    public static final String AngItmCls010Lng_FKI_Rec = "Rec";
    /** FLng000100: AngLng <- Lng <- AngItmCls010Lng */
    public static final String AngItmCls010Lng_FKI_Lng = "Lng";

    /** Classifica 11 */
    public static final String AngItmCls011 = "AngItmCls011";
    /** FLng000101: AngItmCls011 -> LngLst -> AngItmCls011Lng */
    public static final String AngItmCls011_FKO_LngLst = "LngLst";
    /** FSysItm023: AngItmCls011 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls011_FKO_ClsLst = "ClsLst";
    /** FSysItm038: AngItmCls011 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls011_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm053: AngItmCls011 -> ItmLst -> AngItm */
    public static final String AngItmCls011_FKO_ItmLst = "ItmLst";
    /** FSysOrg040: AngItmCls011 -> RecRulLst -> SysReaRulRol */
    public static final String AngItmCls011_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngItmCls011 */
    public static final String AngItmCls011Lng = "AngItmCls011Lng";
    /** FLng000101: AngItmCls011 <- Rec <- AngItmCls011Lng */
    public static final String AngItmCls011Lng_FKI_Rec = "Rec";
    /** FLng000102: AngLng <- Lng <- AngItmCls011Lng */
    public static final String AngItmCls011Lng_FKI_Lng = "Lng";

    /** Classifica 12 */
    public static final String AngItmCls012 = "AngItmCls012";
    /** FLng000103: AngItmCls012 -> LngLst -> AngItmCls012Lng */
    public static final String AngItmCls012_FKO_LngLst = "LngLst";
    /** FSysItm024: AngItmCls012 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls012_FKO_ClsLst = "ClsLst";
    /** FSysItm039: AngItmCls012 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls012_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm054: AngItmCls012 -> ItmLst -> AngItm */
    public static final String AngItmCls012_FKO_ItmLst = "ItmLst";
    /** FSysOrg041: AngItmCls012 -> RecRulLst -> SysReaRulRol */
    public static final String AngItmCls012_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngItmCls012 */
    public static final String AngItmCls012Lng = "AngItmCls012Lng";
    /** FLng000103: AngItmCls012 <- Rec <- AngItmCls012Lng */
    public static final String AngItmCls012Lng_FKI_Rec = "Rec";
    /** FLng000104: AngLng <- Lng <- AngItmCls012Lng */
    public static final String AngItmCls012Lng_FKI_Lng = "Lng";

    /** Classifica 13 */
    public static final String AngItmCls013 = "AngItmCls013";
    /** FLng000105: AngItmCls013 -> LngLst -> AngItmCls013Lng */
    public static final String AngItmCls013_FKO_LngLst = "LngLst";
    /** FSysItm025: AngItmCls013 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls013_FKO_ClsLst = "ClsLst";
    /** FSysItm040: AngItmCls013 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls013_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm055: AngItmCls013 -> ItmLst -> AngItm */
    public static final String AngItmCls013_FKO_ItmLst = "ItmLst";
    /** FSysOrg042: AngItmCls013 -> RecRulLst -> SysReaRulRol */
    public static final String AngItmCls013_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngItmCls013 */
    public static final String AngItmCls013Lng = "AngItmCls013Lng";
    /** FLng000105: AngItmCls013 <- Rec <- AngItmCls013Lng */
    public static final String AngItmCls013Lng_FKI_Rec = "Rec";
    /** FLng000106: AngLng <- Lng <- AngItmCls013Lng */
    public static final String AngItmCls013Lng_FKI_Lng = "Lng";

    /** Classifica 14 */
    public static final String AngItmCls014 = "AngItmCls014";
    /** FLng000107: AngItmCls014 -> LngLst -> AngItmCls014Lng */
    public static final String AngItmCls014_FKO_LngLst = "LngLst";
    /** FSysItm026: AngItmCls014 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls014_FKO_ClsLst = "ClsLst";
    /** FSysItm041: AngItmCls014 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls014_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm056: AngItmCls014 -> ItmLst -> AngItm */
    public static final String AngItmCls014_FKO_ItmLst = "ItmLst";
    /** FSysOrg043: AngItmCls014 -> RecRulLst -> SysReaRulRol */
    public static final String AngItmCls014_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngItmCls014 */
    public static final String AngItmCls014Lng = "AngItmCls014Lng";
    /** FLng000107: AngItmCls014 <- Rec <- AngItmCls014Lng */
    public static final String AngItmCls014Lng_FKI_Rec = "Rec";
    /** FLng000108: AngLng <- Lng <- AngItmCls014Lng */
    public static final String AngItmCls014Lng_FKI_Lng = "Lng";

    /** Classifica 15 */
    public static final String AngItmCls015 = "AngItmCls015";
    /** FLng000109: AngItmCls015 -> LngLst -> AngItmCls015Lng */
    public static final String AngItmCls015_FKO_LngLst = "LngLst";
    /** FSysItm027: AngItmCls015 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls015_FKO_ClsLst = "ClsLst";
    /** FSysItm042: AngItmCls015 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls015_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm057: AngItmCls015 -> ItmLst -> AngItm */
    public static final String AngItmCls015_FKO_ItmLst = "ItmLst";
    /** FSysOrg044: AngItmCls015 -> RecRulLst -> SysReaRulRol */
    public static final String AngItmCls015_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngItmCls015 */
    public static final String AngItmCls015Lng = "AngItmCls015Lng";
    /** FLng000109: AngItmCls015 <- Rec <- AngItmCls015Lng */
    public static final String AngItmCls015Lng_FKI_Rec = "Rec";
    /** FLng000110: AngLng <- Lng <- AngItmCls015Lng */
    public static final String AngItmCls015Lng_FKI_Lng = "Lng";

    /** Classifica 16 */
    public static final String AngItmCls016 = "AngItmCls016";
    /** FLng000111: AngItmCls016 -> LngLst -> AngItmCls016Lng */
    public static final String AngItmCls016_FKO_LngLst = "LngLst";
    /** FSysItm071: AngItmCls016 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls016_FKO_ClsLst = "ClsLst";
    /** FSysItm086: AngItmCls016 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls016_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm101: AngItmCls016 -> ItmLst -> AngItm */
    public static final String AngItmCls016_FKO_ItmLst = "ItmLst";

    /** Traduzioni per AngItmCls016 */
    public static final String AngItmCls016Lng = "AngItmCls016Lng";
    /** FLng000111: AngItmCls016 <- Rec <- AngItmCls016Lng */
    public static final String AngItmCls016Lng_FKI_Rec = "Rec";
    /** FLng000112: AngLng <- Lng <- AngItmCls016Lng */
    public static final String AngItmCls016Lng_FKI_Lng = "Lng";

    /** Classifica 17 */
    public static final String AngItmCls017 = "AngItmCls017";
    /** FLng000113: AngItmCls017 -> LngLst -> AngItmCls017Lng */
    public static final String AngItmCls017_FKO_LngLst = "LngLst";
    /** FSysItm072: AngItmCls017 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls017_FKO_ClsLst = "ClsLst";
    /** FSysItm087: AngItmCls017 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls017_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm102: AngItmCls017 -> ItmLst -> AngItm */
    public static final String AngItmCls017_FKO_ItmLst = "ItmLst";

    /** Traduzioni per AngItmCls017 */
    public static final String AngItmCls017Lng = "AngItmCls017Lng";
    /** FLng000113: AngItmCls017 <- Rec <- AngItmCls017Lng */
    public static final String AngItmCls017Lng_FKI_Rec = "Rec";
    /** FLng000114: AngLng <- Lng <- AngItmCls017Lng */
    public static final String AngItmCls017Lng_FKI_Lng = "Lng";

    /** Classifica 18 */
    public static final String AngItmCls018 = "AngItmCls018";
    /** FLng000115: AngItmCls018 -> LngLst -> AngItmCls018Lng */
    public static final String AngItmCls018_FKO_LngLst = "LngLst";
    /** FSysItm073: AngItmCls018 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls018_FKO_ClsLst = "ClsLst";
    /** FSysItm088: AngItmCls018 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls018_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm103: AngItmCls018 -> ItmLst -> AngItm */
    public static final String AngItmCls018_FKO_ItmLst = "ItmLst";

    /** Traduzioni per AngItmCls018 */
    public static final String AngItmCls018Lng = "AngItmCls018Lng";
    /** FLng000115: AngItmCls018 <- Rec <- AngItmCls018Lng */
    public static final String AngItmCls018Lng_FKI_Rec = "Rec";
    /** FLng000116: AngLng <- Lng <- AngItmCls018Lng */
    public static final String AngItmCls018Lng_FKI_Lng = "Lng";

    /** Classifica 19 */
    public static final String AngItmCls019 = "AngItmCls019";
    /** FLng000117: AngItmCls019 -> LngLst -> AngItmCls019Lng */
    public static final String AngItmCls019_FKO_LngLst = "LngLst";
    /** FSysItm074: AngItmCls019 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls019_FKO_ClsLst = "ClsLst";
    /** FSysItm089: AngItmCls019 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls019_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm104: AngItmCls019 -> ItmLst -> AngItm */
    public static final String AngItmCls019_FKO_ItmLst = "ItmLst";

    /** Traduzioni per AngItmCls019 */
    public static final String AngItmCls019Lng = "AngItmCls019Lng";
    /** FLng000117: AngItmCls019 <- Rec <- AngItmCls019Lng */
    public static final String AngItmCls019Lng_FKI_Rec = "Rec";
    /** FLng000118: AngLng <- Lng <- AngItmCls019Lng */
    public static final String AngItmCls019Lng_FKI_Lng = "Lng";

    /** Classifica 20 */
    public static final String AngItmCls020 = "AngItmCls020";
    /** FLng000119: AngItmCls020 -> LngLst -> AngItmCls020Lng */
    public static final String AngItmCls020_FKO_LngLst = "LngLst";
    /** FSysItm075: AngItmCls020 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls020_FKO_ClsLst = "ClsLst";
    /** FSysItm090: AngItmCls020 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls020_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm105: AngItmCls020 -> ItmLst -> AngItm */
    public static final String AngItmCls020_FKO_ItmLst = "ItmLst";

    /** Traduzioni per AngItmCls020 */
    public static final String AngItmCls020Lng = "AngItmCls020Lng";
    /** FLng000119: AngItmCls020 <- Rec <- AngItmCls020Lng */
    public static final String AngItmCls020Lng_FKI_Rec = "Rec";
    /** FLng000120: AngLng <- Lng <- AngItmCls020Lng */
    public static final String AngItmCls020Lng_FKI_Lng = "Lng";

    /** Classifica 21 */
    public static final String AngItmCls021 = "AngItmCls021";
    /** FLng000121: AngItmCls021 -> LngLst -> AngItmCls021Lng */
    public static final String AngItmCls021_FKO_LngLst = "LngLst";
    /** FSysItm076: AngItmCls021 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls021_FKO_ClsLst = "ClsLst";
    /** FSysItm091: AngItmCls021 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls021_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm106: AngItmCls021 -> ItmLst -> AngItm */
    public static final String AngItmCls021_FKO_ItmLst = "ItmLst";

    /** Traduzioni per AngItmCls021 */
    public static final String AngItmCls021Lng = "AngItmCls021Lng";
    /** FLng000121: AngItmCls021 <- Rec <- AngItmCls021Lng */
    public static final String AngItmCls021Lng_FKI_Rec = "Rec";
    /** FLng000122: AngLng <- Lng <- AngItmCls021Lng */
    public static final String AngItmCls021Lng_FKI_Lng = "Lng";

    /** Classifica 22 */
    public static final String AngItmCls022 = "AngItmCls022";
    /** FLng000123: AngItmCls022 -> LngLst -> AngItmCls022Lng */
    public static final String AngItmCls022_FKO_LngLst = "LngLst";
    /** FSysItm077: AngItmCls022 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls022_FKO_ClsLst = "ClsLst";
    /** FSysItm092: AngItmCls022 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls022_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm107: AngItmCls022 -> ItmLst -> AngItm */
    public static final String AngItmCls022_FKO_ItmLst = "ItmLst";

    /** Traduzioni per AngItmCls022 */
    public static final String AngItmCls022Lng = "AngItmCls022Lng";
    /** FLng000123: AngItmCls022 <- Rec <- AngItmCls022Lng */
    public static final String AngItmCls022Lng_FKI_Rec = "Rec";
    /** FLng000124: AngLng <- Lng <- AngItmCls022Lng */
    public static final String AngItmCls022Lng_FKI_Lng = "Lng";

    /** Classifica 23 */
    public static final String AngItmCls023 = "AngItmCls023";
    /** FLng000125: AngItmCls023 -> LngLst -> AngItmCls023Lng */
    public static final String AngItmCls023_FKO_LngLst = "LngLst";
    /** FSysItm078: AngItmCls023 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls023_FKO_ClsLst = "ClsLst";
    /** FSysItm093: AngItmCls023 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls023_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm108: AngItmCls023 -> ItmLst -> AngItm */
    public static final String AngItmCls023_FKO_ItmLst = "ItmLst";

    /** Traduzioni per AngItmCls023 */
    public static final String AngItmCls023Lng = "AngItmCls023Lng";
    /** FLng000125: AngItmCls023 <- Rec <- AngItmCls023Lng */
    public static final String AngItmCls023Lng_FKI_Rec = "Rec";
    /** FLng000126: AngLng <- Lng <- AngItmCls023Lng */
    public static final String AngItmCls023Lng_FKI_Lng = "Lng";

    /** Classifica 24 */
    public static final String AngItmCls024 = "AngItmCls024";
    /** FLng000127: AngItmCls024 -> LngLst -> AngItmCls024Lng */
    public static final String AngItmCls024_FKO_LngLst = "LngLst";
    /** FSysItm079: AngItmCls024 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls024_FKO_ClsLst = "ClsLst";
    /** FSysItm094: AngItmCls024 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls024_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm109: AngItmCls024 -> ItmLst -> AngItm */
    public static final String AngItmCls024_FKO_ItmLst = "ItmLst";

    /** Traduzioni per AngItmCls024 */
    public static final String AngItmCls024Lng = "AngItmCls024Lng";
    /** FLng000127: AngItmCls024 <- Rec <- AngItmCls024Lng */
    public static final String AngItmCls024Lng_FKI_Rec = "Rec";
    /** FLng000128: AngLng <- Lng <- AngItmCls024Lng */
    public static final String AngItmCls024Lng_FKI_Lng = "Lng";

    /** Classifica 25 */
    public static final String AngItmCls025 = "AngItmCls025";
    /** FLng000129: AngItmCls025 -> LngLst -> AngItmCls025Lng */
    public static final String AngItmCls025_FKO_LngLst = "LngLst";
    /** FSysItm080: AngItmCls025 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls025_FKO_ClsLst = "ClsLst";
    /** FSysItm095: AngItmCls025 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls025_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm110: AngItmCls025 -> ItmLst -> AngItm */
    public static final String AngItmCls025_FKO_ItmLst = "ItmLst";

    /** Traduzioni per AngItmCls025 */
    public static final String AngItmCls025Lng = "AngItmCls025Lng";
    /** FLng000129: AngItmCls025 <- Rec <- AngItmCls025Lng */
    public static final String AngItmCls025Lng_FKI_Rec = "Rec";
    /** FLng000130: AngLng <- Lng <- AngItmCls025Lng */
    public static final String AngItmCls025Lng_FKI_Lng = "Lng";

    /** Classifica 26 */
    public static final String AngItmCls026 = "AngItmCls026";
    /** FLng000131: AngItmCls026 -> LngLst -> AngItmCls026Lng */
    public static final String AngItmCls026_FKO_LngLst = "LngLst";
    /** FSysItm081: AngItmCls026 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls026_FKO_ClsLst = "ClsLst";
    /** FSysItm096: AngItmCls026 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls026_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm111: AngItmCls026 -> ItmLst -> AngItm */
    public static final String AngItmCls026_FKO_ItmLst = "ItmLst";

    /** Traduzioni per AngItmCls026 */
    public static final String AngItmCls026Lng = "AngItmCls026Lng";
    /** FLng000131: AngItmCls026 <- Rec <- AngItmCls026Lng */
    public static final String AngItmCls026Lng_FKI_Rec = "Rec";
    /** FLng000132: AngLng <- Lng <- AngItmCls026Lng */
    public static final String AngItmCls026Lng_FKI_Lng = "Lng";

    /** Classifica 27 */
    public static final String AngItmCls027 = "AngItmCls027";
    /** FLng000133: AngItmCls027 -> LngLst -> AngItmCls027Lng */
    public static final String AngItmCls027_FKO_LngLst = "LngLst";
    /** FSysItm082: AngItmCls027 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls027_FKO_ClsLst = "ClsLst";
    /** FSysItm097: AngItmCls027 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls027_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm112: AngItmCls027 -> ItmLst -> AngItm */
    public static final String AngItmCls027_FKO_ItmLst = "ItmLst";

    /** Traduzioni per AngItmCls027 */
    public static final String AngItmCls027Lng = "AngItmCls027Lng";
    /** FLng000133: AngItmCls027 <- Rec <- AngItmCls027Lng */
    public static final String AngItmCls027Lng_FKI_Rec = "Rec";
    /** FLng000134: AngLng <- Lng <- AngItmCls027Lng */
    public static final String AngItmCls027Lng_FKI_Lng = "Lng";

    /** Classifica 28 */
    public static final String AngItmCls028 = "AngItmCls028";
    /** FLng000135: AngItmCls028 -> LngLst -> AngItmCls028Lng */
    public static final String AngItmCls028_FKO_LngLst = "LngLst";
    /** FSysItm083: AngItmCls028 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls028_FKO_ClsLst = "ClsLst";
    /** FSysItm098: AngItmCls028 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls028_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm113: AngItmCls028 -> ItmLst -> AngItm */
    public static final String AngItmCls028_FKO_ItmLst = "ItmLst";

    /** Traduzioni per AngItmCls028 */
    public static final String AngItmCls028Lng = "AngItmCls028Lng";
    /** FLng000135: AngItmCls028 <- Rec <- AngItmCls028Lng */
    public static final String AngItmCls028Lng_FKI_Rec = "Rec";
    /** FLng000136: AngLng <- Lng <- AngItmCls028Lng */
    public static final String AngItmCls028Lng_FKI_Lng = "Lng";

    /** Classifica 29 */
    public static final String AngItmCls029 = "AngItmCls029";
    /** FLng000137: AngItmCls029 -> LngLst -> AngItmCls029Lng */
    public static final String AngItmCls029_FKO_LngLst = "LngLst";
    /** FSysItm084: AngItmCls029 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls029_FKO_ClsLst = "ClsLst";
    /** FSysItm099: AngItmCls029 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls029_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm114: AngItmCls029 -> ItmLst -> AngItm */
    public static final String AngItmCls029_FKO_ItmLst = "ItmLst";

    /** Traduzioni per AngItmCls029 */
    public static final String AngItmCls029Lng = "AngItmCls029Lng";
    /** FLng000137: AngItmCls029 <- Rec <- AngItmCls029Lng */
    public static final String AngItmCls029Lng_FKI_Rec = "Rec";
    /** FLng000138: AngLng <- Lng <- AngItmCls029Lng */
    public static final String AngItmCls029Lng_FKI_Lng = "Lng";

    /** Classifica 30 */
    public static final String AngItmCls030 = "AngItmCls030";
    /** FLng000139: AngItmCls030 -> LngLst -> AngItmCls030Lng */
    public static final String AngItmCls030_FKO_LngLst = "LngLst";
    /** FSysItm085: AngItmCls030 -> ClsLst -> AngItmClsRef */
    public static final String AngItmCls030_FKO_ClsLst = "ClsLst";
    /** FSysItm100: AngItmCls030 -> ClsRefLst -> AngItmClsRef */
    public static final String AngItmCls030_FKO_ClsRefLst = "ClsRefLst";
    /** FSysItm115: AngItmCls030 -> ItmLst -> AngItm */
    public static final String AngItmCls030_FKO_ItmLst = "ItmLst";

    /** Traduzioni per AngItmCls030 */
    public static final String AngItmCls030Lng = "AngItmCls030Lng";
    /** FLng000139: AngItmCls030 <- Rec <- AngItmCls030Lng */
    public static final String AngItmCls030Lng_FKI_Rec = "Rec";
    /** FLng000140: AngLng <- Lng <- AngItmCls030Lng */
    public static final String AngItmCls030Lng_FKI_Lng = "Lng";

    /** Classifica multipla 1 */
    public static final String AngItmClsMul001 = "AngItmClsMul001";
    /** FLng000141: AngItmClsMul001 -> LngLst -> AngItmClsMul001Lng */
    public static final String AngItmClsMul001_FKO_LngLst = "LngLst";
    /** FSysOrg045: AngItmClsMul001 -> RecRulLst -> SysReaRulRol */
    public static final String AngItmClsMul001_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngItmClsMul001 */
    public static final String AngItmClsMul001Lng = "AngItmClsMul001Lng";
    /** FLng000141: AngItmClsMul001 <- Rec <- AngItmClsMul001Lng */
    public static final String AngItmClsMul001Lng_FKI_Rec = "Rec";
    /** FLng000142: AngLng <- Lng <- AngItmClsMul001Lng */
    public static final String AngItmClsMul001Lng_FKI_Lng = "Lng";

    /** Classifica multipla 2 */
    public static final String AngItmClsMul002 = "AngItmClsMul002";
    /** FLng000143: AngItmClsMul002 -> LngLst -> AngItmClsMul002Lng */
    public static final String AngItmClsMul002_FKO_LngLst = "LngLst";
    /** FSysOrg046: AngItmClsMul002 -> RecRulLst -> SysReaRulRol */
    public static final String AngItmClsMul002_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngItmClsMul002 */
    public static final String AngItmClsMul002Lng = "AngItmClsMul002Lng";
    /** FLng000143: AngItmClsMul002 <- Rec <- AngItmClsMul002Lng */
    public static final String AngItmClsMul002Lng_FKI_Rec = "Rec";
    /** FLng000144: AngLng <- Lng <- AngItmClsMul002Lng */
    public static final String AngItmClsMul002Lng_FKI_Lng = "Lng";

    /** Classifica multipla 3 */
    public static final String AngItmClsMul003 = "AngItmClsMul003";
    /** FLng000145: AngItmClsMul003 -> LngLst -> AngItmClsMul003Lng */
    public static final String AngItmClsMul003_FKO_LngLst = "LngLst";
    /** FSysOrg047: AngItmClsMul003 -> RecRulLst -> SysReaRulRol */
    public static final String AngItmClsMul003_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngItmClsMul003 */
    public static final String AngItmClsMul003Lng = "AngItmClsMul003Lng";
    /** FLng000145: AngItmClsMul003 <- Rec <- AngItmClsMul003Lng */
    public static final String AngItmClsMul003Lng_FKI_Rec = "Rec";
    /** FLng000146: AngLng <- Lng <- AngItmClsMul003Lng */
    public static final String AngItmClsMul003Lng_FKI_Lng = "Lng";

    /** Classifica multipla 4 */
    public static final String AngItmClsMul004 = "AngItmClsMul004";
    /** FLng000147: AngItmClsMul004 -> LngLst -> AngItmClsMul004Lng */
    public static final String AngItmClsMul004_FKO_LngLst = "LngLst";
    /** FSysOrg048: AngItmClsMul004 -> RecRulLst -> SysReaRulRol */
    public static final String AngItmClsMul004_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngItmClsMul004 */
    public static final String AngItmClsMul004Lng = "AngItmClsMul004Lng";
    /** FLng000147: AngItmClsMul004 <- Rec <- AngItmClsMul004Lng */
    public static final String AngItmClsMul004Lng_FKI_Rec = "Rec";
    /** FLng000148: AngLng <- Lng <- AngItmClsMul004Lng */
    public static final String AngItmClsMul004Lng_FKI_Lng = "Lng";

    /** Classifica multipla 5 */
    public static final String AngItmClsMul005 = "AngItmClsMul005";
    /** FLng000149: AngItmClsMul005 -> LngLst -> AngItmClsMul005Lng */
    public static final String AngItmClsMul005_FKO_LngLst = "LngLst";
    /** FSysOrg049: AngItmClsMul005 -> RecRulLst -> SysReaRulRol */
    public static final String AngItmClsMul005_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngItmClsMul005 */
    public static final String AngItmClsMul005Lng = "AngItmClsMul005Lng";
    /** FLng000149: AngItmClsMul005 <- Rec <- AngItmClsMul005Lng */
    public static final String AngItmClsMul005Lng_FKI_Rec = "Rec";
    /** FLng000150: AngLng <- Lng <- AngItmClsMul005Lng */
    public static final String AngItmClsMul005Lng_FKI_Lng = "Lng";

    /** Riferimento classifica */
    public static final String AngItmClsRef = "AngItmClsRef";
    /** FSysItm013: AngItmCls001 <- Cls001 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls001 = "Cls001";
    /** FSysItm014: AngItmCls002 <- Cls002 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls002 = "Cls002";
    /** FSysItm015: AngItmCls003 <- Cls003 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls003 = "Cls003";
    /** FSysItm016: AngItmCls004 <- Cls004 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls004 = "Cls004";
    /** FSysItm017: AngItmCls005 <- Cls005 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls005 = "Cls005";
    /** FSysItm018: AngItmCls006 <- Cls006 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls006 = "Cls006";
    /** FSysItm019: AngItmCls007 <- Cls007 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls007 = "Cls007";
    /** FSysItm020: AngItmCls008 <- Cls008 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls008 = "Cls008";
    /** FSysItm021: AngItmCls009 <- Cls009 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls009 = "Cls009";
    /** FSysItm022: AngItmCls010 <- Cls010 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls010 = "Cls010";
    /** FSysItm023: AngItmCls011 <- Cls011 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls011 = "Cls011";
    /** FSysItm024: AngItmCls012 <- Cls012 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls012 = "Cls012";
    /** FSysItm025: AngItmCls013 <- Cls013 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls013 = "Cls013";
    /** FSysItm026: AngItmCls014 <- Cls014 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls014 = "Cls014";
    /** FSysItm027: AngItmCls015 <- Cls015 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls015 = "Cls015";
    /** FSysItm028: AngItmCls001 <- ClsRef001 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef001 = "ClsRef001";
    /** FSysItm029: AngItmCls002 <- ClsRef002 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef002 = "ClsRef002";
    /** FSysItm030: AngItmCls003 <- ClsRef003 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef003 = "ClsRef003";
    /** FSysItm031: AngItmCls004 <- ClsRef004 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef004 = "ClsRef004";
    /** FSysItm032: AngItmCls005 <- ClsRef005 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef005 = "ClsRef005";
    /** FSysItm033: AngItmCls006 <- ClsRef006 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef006 = "ClsRef006";
    /** FSysItm034: AngItmCls007 <- ClsRef007 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef007 = "ClsRef007";
    /** FSysItm035: AngItmCls008 <- ClsRef008 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef008 = "ClsRef008";
    /** FSysItm036: AngItmCls009 <- ClsRef009 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef009 = "ClsRef009";
    /** FSysItm037: AngItmCls010 <- ClsRef010 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef010 = "ClsRef010";
    /** FSysItm038: AngItmCls011 <- ClsRef011 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef011 = "ClsRef011";
    /** FSysItm039: AngItmCls012 <- ClsRef012 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef012 = "ClsRef012";
    /** FSysItm040: AngItmCls013 <- ClsRef013 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef013 = "ClsRef013";
    /** FSysItm041: AngItmCls014 <- ClsRef014 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef014 = "ClsRef014";
    /** FSysItm042: AngItmCls015 <- ClsRef015 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef015 = "ClsRef015";
    /** FSysItm071: AngItmCls016 <- Cls016 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls016 = "Cls016";
    /** FSysItm072: AngItmCls017 <- Cls017 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls017 = "Cls017";
    /** FSysItm073: AngItmCls018 <- Cls018 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls018 = "Cls018";
    /** FSysItm074: AngItmCls019 <- Cls019 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls019 = "Cls019";
    /** FSysItm075: AngItmCls020 <- Cls020 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls020 = "Cls020";
    /** FSysItm076: AngItmCls021 <- Cls021 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls021 = "Cls021";
    /** FSysItm077: AngItmCls022 <- Cls022 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls022 = "Cls022";
    /** FSysItm078: AngItmCls023 <- Cls023 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls023 = "Cls023";
    /** FSysItm079: AngItmCls024 <- Cls024 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls024 = "Cls024";
    /** FSysItm080: AngItmCls025 <- Cls025 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls025 = "Cls025";
    /** FSysItm081: AngItmCls026 <- Cls026 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls026 = "Cls026";
    /** FSysItm082: AngItmCls027 <- Cls027 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls027 = "Cls027";
    /** FSysItm083: AngItmCls028 <- Cls028 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls028 = "Cls028";
    /** FSysItm084: AngItmCls029 <- Cls029 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls029 = "Cls029";
    /** FSysItm085: AngItmCls030 <- Cls030 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_Cls030 = "Cls030";
    /** FSysItm086: AngItmCls016 <- ClsRef016 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef016 = "ClsRef016";
    /** FSysItm087: AngItmCls017 <- ClsRef017 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef017 = "ClsRef017";
    /** FSysItm088: AngItmCls018 <- ClsRef018 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef018 = "ClsRef018";
    /** FSysItm089: AngItmCls019 <- ClsRef019 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef019 = "ClsRef019";
    /** FSysItm090: AngItmCls020 <- ClsRef020 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef020 = "ClsRef020";
    /** FSysItm091: AngItmCls021 <- ClsRef021 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef021 = "ClsRef021";
    /** FSysItm092: AngItmCls022 <- ClsRef022 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef022 = "ClsRef022";
    /** FSysItm093: AngItmCls023 <- ClsRef023 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef023 = "ClsRef023";
    /** FSysItm094: AngItmCls024 <- ClsRef024 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef024 = "ClsRef024";
    /** FSysItm095: AngItmCls025 <- ClsRef025 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef025 = "ClsRef025";
    /** FSysItm096: AngItmCls026 <- ClsRef026 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef026 = "ClsRef026";
    /** FSysItm097: AngItmCls027 <- ClsRef027 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef027 = "ClsRef027";
    /** FSysItm098: AngItmCls028 <- ClsRef028 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef028 = "ClsRef028";
    /** FSysItm099: AngItmCls029 <- ClsRef029 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef029 = "ClsRef029";
    /** FSysItm100: AngItmCls030 <- ClsRef030 <- AngItmClsRef */
    public static final String AngItmClsRef_FKI_ClsRef030 = "ClsRef030";

    /** Dimensioni articoli */
    public static final String AngItmDim = "AngItmDim";
    /** FSysItm121: AngItm <- Itm <- AngItmDim */
    public static final String AngItmDim_FKI_Itm = "Itm";
    /** FSysItm122: AngItmTypDim <- ItmTypDim <- AngItmDim */
    public static final String AngItmDim_FKI_ItmTypDim = "ItmTypDim";
    /** FSysItm123: AngUniMea <- UniMea <- AngItmDim */
    public static final String AngItmDim_FKI_UniMea = "UniMea";

    /** Traduzioni per AngItm */
    public static final String AngItmLng = "AngItmLng";
    /** FLng000075: AngItm <- Rec <- AngItmLng */
    public static final String AngItmLng_FKI_Rec = "Rec";
    /** FLng000076: AngLng <- Lng <- AngItmLng */
    public static final String AngItmLng_FKI_Lng = "Lng";

    /** Suggerimenti articoli */
    public static final String AngItmLvlSug = "AngItmLvlSug";
    /** FSysItm132: AngItm <- Itm <- AngItmLvlSug */
    public static final String AngItmLvlSug_FKI_Itm = "Itm";
    /** FSysItm133: AngItmMdl <- Mdl <- AngItmLvlSug */
    public static final String AngItmLvlSug_FKI_Mdl = "Mdl";
    /** FSysItm134: AngPrdCyc <- PrdCyc <- AngItmLvlSug */
    public static final String AngItmLvlSug_FKI_PrdCyc = "PrdCyc";
    /** FSysItm135: OrgLvl <- OrgLvl <- AngItmLvlSug */
    public static final String AngItmLvlSug_FKI_OrgLvl = "OrgLvl";

    /** Modelli di articoli */
    public static final String AngItmMdl = "AngItmMdl";
    /** FLng000177: AngItmMdl -> LngLst -> AngItmMdlLng */
    public static final String AngItmMdl_FKO_LngLst = "LngLst";
    /** FSysItm131: AngItmMdl -> ItmMdlVrnLst -> AngItmMdlVrn */
    public static final String AngItmMdl_FKO_ItmMdlVrnLst = "ItmMdlVrnLst";
    /** FSysItm133: AngItmMdl -> ItmLvlSugLst -> AngItmLvlSug */
    public static final String AngItmMdl_FKO_ItmLvlSugLst = "ItmLvlSugLst";
    /** FSysItm129: AngItm <- Itm <- AngItmMdl */
    public static final String AngItmMdl_FKI_Itm = "Itm";

    /** Traduzioni per AngItmMdl */
    public static final String AngItmMdlLng = "AngItmMdlLng";
    /** FLng000177: AngItmMdl <- Rec <- AngItmMdlLng */
    public static final String AngItmMdlLng_FKI_Rec = "Rec";
    /** FLng000178: AngLng <- Lng <- AngItmMdlLng */
    public static final String AngItmMdlLng_FKI_Lng = "Lng";

    /** Varianti di modelli di articoli */
    public static final String AngItmMdlVrn = "AngItmMdlVrn";
    /** FSysItm130: AngItmVrn <- ItmVrn <- AngItmMdlVrn */
    public static final String AngItmMdlVrn_FKI_ItmVrn = "ItmVrn";
    /** FSysItm131: AngItmMdl <- Mdl <- AngItmMdlVrn */
    public static final String AngItmMdlVrn_FKI_Mdl = "Mdl";

    /** Proprietà articolo */
    public static final String AngItmOwn = "AngItmOwn";
    /** FLng000167: AngItmOwn -> LngLst -> AngItmOwnLng */
    public static final String AngItmOwn_FKO_LngLst = "LngLst";
    /** FSysItm120: AngItmOwn -> ItmLst -> AngItm */
    public static final String AngItmOwn_FKO_ItmLst = "ItmLst";

    /** Traduzioni per AngItmOwn */
    public static final String AngItmOwnLng = "AngItmOwnLng";
    /** FLng000167: AngItmOwn <- Rec <- AngItmOwnLng */
    public static final String AngItmOwnLng_FKI_Rec = "Rec";
    /** FLng000168: AngLng <- Lng <- AngItmOwnLng */
    public static final String AngItmOwnLng_FKI_Lng = "Lng";

    /** Stato Articolo */
    public static final String AngItmSts = "AngItmSts";
    /** FLng000151: AngItmSts -> LngLst -> AngItmStsLng */
    public static final String AngItmSts_FKO_LngLst = "LngLst";
    /** FSysItm058: AngItmSts -> ItmLst -> AngItm */
    public static final String AngItmSts_FKO_ItmLst = "ItmLst";

    /** Traduzioni per AngItmSts */
    public static final String AngItmStsLng = "AngItmStsLng";
    /** FLng000151: AngItmSts <- Rec <- AngItmStsLng */
    public static final String AngItmStsLng_FKI_Rec = "Rec";
    /** FLng000152: AngLng <- Lng <- AngItmStsLng */
    public static final String AngItmStsLng_FKI_Lng = "Lng";

    /** Tipologia dimensioni articoli */
    public static final String AngItmTypDim = "AngItmTypDim";
    /** FLng000169: AngItmTypDim -> LngLst -> AngItmTypDimLng */
    public static final String AngItmTypDim_FKO_LngLst = "LngLst";
    /** FSysItm122: AngItmTypDim -> ItmDimLst -> AngItmDim */
    public static final String AngItmTypDim_FKO_ItmDimLst = "ItmDimLst";

    /** Traduzioni per AngItmTypDim */
    public static final String AngItmTypDimLng = "AngItmTypDimLng";
    /** FLng000169: AngItmTypDim <- Rec <- AngItmTypDimLng */
    public static final String AngItmTypDimLng_FKI_Rec = "Rec";
    /** FLng000170: AngLng <- Lng <- AngItmTypDimLng */
    public static final String AngItmTypDimLng_FKI_Lng = "Lng";

    /** Tipi articolo */
    public static final String AngItmTypPrd = "AngItmTypPrd";
    /** FLng000165: AngItmTypPrd -> LngLst -> AngItmTypPrdLng */
    public static final String AngItmTypPrd_FKO_LngLst = "LngLst";
    /** FSysItm118: AngItmTypPrd -> ItmLst -> AngItm */
    public static final String AngItmTypPrd_FKO_ItmLst = "ItmLst";

    /** Traduzioni per AngItmTypPrd */
    public static final String AngItmTypPrdLng = "AngItmTypPrdLng";
    /** FLng000165: AngItmTypPrd <- Rec <- AngItmTypPrdLng */
    public static final String AngItmTypPrdLng_FKI_Rec = "Rec";
    /** FLng000166: AngLng <- Lng <- AngItmTypPrdLng */
    public static final String AngItmTypPrdLng_FKI_Lng = "Lng";

    /** Varianti di articoli */
    public static final String AngItmVrn = "AngItmVrn";
    /** FSysItm130: AngItmVrn -> ItmMdlVrnLst -> AngItmMdlVrn */
    public static final String AngItmVrn_FKO_ItmMdlVrnLst = "ItmMdlVrnLst";
    /** FSysItm137: AngItmVrn -> BomLst -> AngBom */
    public static final String AngItmVrn_FKO_BomLst = "BomLst";
    /** FSysItm138: AngItmVrn -> PrdCycOprLst -> AngPrdCycOpr */
    public static final String AngItmVrn_FKO_PrdCycOprLst = "PrdCycOprLst";
    /** FSysItm127: AngItm <- Itm <- AngItmVrn */
    public static final String AngItmVrn_FKI_Itm = "Itm";
    /** FSysItm128: AngPrdVrn <- Vrn <- AngItmVrn */
    public static final String AngItmVrn_FKI_Vrn = "Vrn";

    /** Commesse */
    public static final String AngJob = "AngJob";
    /** FSysJob001: AngJob -> SubJobLst -> AngSubJob */
    public static final String AngJob_FKO_SubJobLst = "SubJobLst";

    /** Regole login */
    public static final String AngLgnRul = "AngLgnRul";
    /** FSysEnv005: AngRemSrv <- Srv <- AngLgnRul */
    public static final String AngLgnRul_FKI_Srv = "Srv";
    /** FSysEnv009: AngLgnTyp <- Typ <- AngLgnRul */
    public static final String AngLgnRul_FKI_Typ = "Typ";
    /** FSysEnv010: AngSrvSrc <- Src <- AngLgnRul */
    public static final String AngLgnRul_FKI_Src = "Src";
    /** FSysEnv011: AngSrcPrp <- Prp <- AngLgnRul */
    public static final String AngLgnRul_FKI_Prp = "Prp";

    /** Classi login */
    public static final String AngLgnTyp = "AngLgnTyp";
    /** FSysEnv009: AngLgnTyp -> LgnRulLst -> AngLgnRul */
    public static final String AngLgnTyp_FKO_LgnRulLst = "LgnRulLst";

    /** Anagrafe lingue */
    public static final String AngLng = "AngLng";
    /** FLng000002: AngLng -> AngCurLst -> AngCurLng */
    public static final String AngLng_FKO_AngCurLst = "AngCurLst";
    /** FLng000004: AngLng -> AngAddTypLst -> AngAddTypLng */
    public static final String AngLng_FKO_AngAddTypLst = "AngAddTypLst";
    /** FLng000006: AngLng -> AngZonLst -> AngZonLng */
    public static final String AngLng_FKO_AngZonLst = "AngZonLst";
    /** FLng000008: AngLng -> AngPlcLst -> AngPlcLng */
    public static final String AngLng_FKO_AngPlcLst = "AngPlcLst";
    /** FLng000010: AngLng -> AngBnkLst -> AngBnkLng */
    public static final String AngLng_FKO_AngBnkLst = "AngBnkLst";
    /** FLng000012: AngLng -> AngUniMeaTmpLst -> AngUniMeaTmpLng */
    public static final String AngLng_FKO_AngUniMeaTmpLst = "AngUniMeaTmpLst";
    /** FLng000014: AngLng -> AngCauMovTmpLst -> AngCauMovTmpLng */
    public static final String AngLng_FKO_AngCauMovTmpLst = "AngCauMovTmpLst";
    /** FLng000016: AngLng -> AngPayMetLst -> AngPayMetLng */
    public static final String AngLng_FKO_AngPayMetLst = "AngPayMetLst";
    /** FLng000018: AngLng -> AngShpMetLst -> AngShpMetLng */
    public static final String AngLng_FKO_AngShpMetLst = "AngShpMetLst";
    /** FLng000020: AngLng -> AngTrpMetLst -> AngTrpMetLng */
    public static final String AngLng_FKO_AngTrpMetLst = "AngTrpMetLst";
    /** FLng000022: AngLng -> AngPckLst -> AngPckLng */
    public static final String AngLng_FKO_AngPckLst = "AngPckLst";
    /** FLng000024: AngLng -> AngPayTypLst -> AngPayTypLng */
    public static final String AngLng_FKO_AngPayTypLst = "AngPayTypLst";
    /** FLng000026: AngLng -> AngVatLst -> AngVatLng */
    public static final String AngLng_FKO_AngVatLst = "AngVatLst";
    /** FLng000028: AngLng -> AngPlnLst -> AngPlnLng */
    public static final String AngLng_FKO_AngPlnLst = "AngPlnLst";
    /** FLng000030: AngLng -> SysTraMsgLst -> SysTraMsgLng */
    public static final String AngLng_FKO_SysTraMsgLst = "SysTraMsgLst";
    /** FLng000032: AngLng -> SysTraLblLst -> SysTraLblLng */
    public static final String AngLng_FKO_SysTraLblLst = "SysTraLblLst";
    /** FLng000034: AngLng -> AngRskLvlLst -> AngRskLvlLng */
    public static final String AngLng_FKO_AngRskLvlLst = "AngRskLvlLst";
    /** FLng000036: AngLng -> AngRskLvlCatLst -> AngRskLvlCatLng */
    public static final String AngLng_FKO_AngRskLvlCatLst = "AngRskLvlCatLst";
    /** FLng000038: AngLng -> AngSysActLst -> AngSysActLng */
    public static final String AngLng_FKO_AngSysActLst = "AngSysActLst";
    /** FLng000040: AngLng -> SysActGrpLst -> SysActGrpLng */
    public static final String AngLng_FKO_SysActGrpLst = "SysActGrpLst";
    /** FLng000042: AngLng -> AngEtlSrvLst -> AngEtlSrvLng */
    public static final String AngLng_FKO_AngEtlSrvLst = "AngEtlSrvLst";
    /** FLng000044: AngLng -> AngEtlJobLst -> AngEtlJobLng */
    public static final String AngLng_FKO_AngEtlJobLst = "AngEtlJobLst";
    /** FLng000046: AngLng -> AngEtlJobPrmLst -> AngEtlJobPrmLng */
    public static final String AngLng_FKO_AngEtlJobPrmLst = "AngEtlJobPrmLst";
    /** FLng000048: AngLng -> AngResMacTypLst -> AngResMacTypLng */
    public static final String AngLng_FKO_AngResMacTypLst = "AngResMacTypLst";
    /** FLng000050: AngLng -> AngResTypLst -> AngResTypLng */
    public static final String AngLng_FKO_AngResTypLst = "AngResTypLst";
    /** FLng000052: AngLng -> AngBdgTypLst -> AngBdgTypLng */
    public static final String AngLng_FKO_AngBdgTypLst = "AngBdgTypLst";
    /** FLng000054: AngLng -> AngSalLst -> AngSalLng */
    public static final String AngLng_FKO_AngSalLst = "AngSalLst";
    /** FLng000056: AngLng -> AngGrpLst -> AngGrpLng */
    public static final String AngLng_FKO_AngGrpLst = "AngGrpLst";
    /** FLng000058: AngLng -> AngGrpCatLst -> AngGrpCatLng */
    public static final String AngLng_FKO_AngGrpCatLst = "AngGrpCatLst";
    /** FLng000060: AngLng -> AngOrgRolLst -> AngOrgRolLng */
    public static final String AngLng_FKO_AngOrgRolLst = "AngOrgRolLst";
    /** FLng000062: AngLng -> AngOrgTypLst -> AngOrgTypLng */
    public static final String AngLng_FKO_AngOrgTypLst = "AngOrgTypLst";
    /** FLng000064: AngLng -> AngBusUniLst -> AngBusUniLng */
    public static final String AngLng_FKO_AngBusUniLst = "AngBusUniLst";
    /** FLng000066: AngLng -> AngRolLst -> AngRolLng */
    public static final String AngLng_FKO_AngRolLst = "AngRolLst";
    /** FLng000068: AngLng -> AngCstCenLst -> AngCstCenLng */
    public static final String AngLng_FKO_AngCstCenLst = "AngCstCenLst";
    /** FLng000070: AngLng -> AngCstCenTypLst -> AngCstCenTypLng */
    public static final String AngLng_FKO_AngCstCenTypLst = "AngCstCenTypLst";
    /** FLng000072: AngLng -> AngWrcLst -> AngWrcLng */
    public static final String AngLng_FKO_AngWrcLst = "AngWrcLst";
    /** FLng000074: AngLng -> AngCstRatLst -> AngCstRatLng */
    public static final String AngLng_FKO_AngCstRatLst = "AngCstRatLst";
    /** FLng000076: AngLng -> AngItmLst -> AngItmLng */
    public static final String AngLng_FKO_AngItmLst = "AngItmLst";
    /** FLng000078: AngLng -> AngPrdCycTypLst -> AngPrdCycTypLng */
    public static final String AngLng_FKO_AngPrdCycTypLst = "AngPrdCycTypLst";
    /** FLng000080: AngLng -> ItmSerNumLst -> ItmSerNumLng */
    public static final String AngLng_FKO_ItmSerNumLst = "ItmSerNumLst";
    /** FLng000082: AngLng -> AngItmCls001Lst -> AngItmCls001Lng */
    public static final String AngLng_FKO_AngItmCls001Lst = "AngItmCls001Lst";
    /** FLng000084: AngLng -> AngItmCls002Lst -> AngItmCls002Lng */
    public static final String AngLng_FKO_AngItmCls002Lst = "AngItmCls002Lst";
    /** FLng000086: AngLng -> AngItmCls003Lst -> AngItmCls003Lng */
    public static final String AngLng_FKO_AngItmCls003Lst = "AngItmCls003Lst";
    /** FLng000088: AngLng -> AngItmCls004Lst -> AngItmCls004Lng */
    public static final String AngLng_FKO_AngItmCls004Lst = "AngItmCls004Lst";
    /** FLng000090: AngLng -> AngItmCls005Lst -> AngItmCls005Lng */
    public static final String AngLng_FKO_AngItmCls005Lst = "AngItmCls005Lst";
    /** FLng000092: AngLng -> AngItmCls006Lst -> AngItmCls006Lng */
    public static final String AngLng_FKO_AngItmCls006Lst = "AngItmCls006Lst";
    /** FLng000094: AngLng -> AngItmCls007Lst -> AngItmCls007Lng */
    public static final String AngLng_FKO_AngItmCls007Lst = "AngItmCls007Lst";
    /** FLng000096: AngLng -> AngItmCls008Lst -> AngItmCls008Lng */
    public static final String AngLng_FKO_AngItmCls008Lst = "AngItmCls008Lst";
    /** FLng000098: AngLng -> AngItmCls009Lst -> AngItmCls009Lng */
    public static final String AngLng_FKO_AngItmCls009Lst = "AngItmCls009Lst";
    /** FLng000100: AngLng -> AngItmCls010Lst -> AngItmCls010Lng */
    public static final String AngLng_FKO_AngItmCls010Lst = "AngItmCls010Lst";
    /** FLng000102: AngLng -> AngItmCls011Lst -> AngItmCls011Lng */
    public static final String AngLng_FKO_AngItmCls011Lst = "AngItmCls011Lst";
    /** FLng000104: AngLng -> AngItmCls012Lst -> AngItmCls012Lng */
    public static final String AngLng_FKO_AngItmCls012Lst = "AngItmCls012Lst";
    /** FLng000106: AngLng -> AngItmCls013Lst -> AngItmCls013Lng */
    public static final String AngLng_FKO_AngItmCls013Lst = "AngItmCls013Lst";
    /** FLng000108: AngLng -> AngItmCls014Lst -> AngItmCls014Lng */
    public static final String AngLng_FKO_AngItmCls014Lst = "AngItmCls014Lst";
    /** FLng000110: AngLng -> AngItmCls015Lst -> AngItmCls015Lng */
    public static final String AngLng_FKO_AngItmCls015Lst = "AngItmCls015Lst";
    /** FLng000112: AngLng -> AngItmCls016Lst -> AngItmCls016Lng */
    public static final String AngLng_FKO_AngItmCls016Lst = "AngItmCls016Lst";
    /** FLng000114: AngLng -> AngItmCls017Lst -> AngItmCls017Lng */
    public static final String AngLng_FKO_AngItmCls017Lst = "AngItmCls017Lst";
    /** FLng000116: AngLng -> AngItmCls018Lst -> AngItmCls018Lng */
    public static final String AngLng_FKO_AngItmCls018Lst = "AngItmCls018Lst";
    /** FLng000118: AngLng -> AngItmCls019Lst -> AngItmCls019Lng */
    public static final String AngLng_FKO_AngItmCls019Lst = "AngItmCls019Lst";
    /** FLng000120: AngLng -> AngItmCls020Lst -> AngItmCls020Lng */
    public static final String AngLng_FKO_AngItmCls020Lst = "AngItmCls020Lst";
    /** FLng000122: AngLng -> AngItmCls021Lst -> AngItmCls021Lng */
    public static final String AngLng_FKO_AngItmCls021Lst = "AngItmCls021Lst";
    /** FLng000124: AngLng -> AngItmCls022Lst -> AngItmCls022Lng */
    public static final String AngLng_FKO_AngItmCls022Lst = "AngItmCls022Lst";
    /** FLng000126: AngLng -> AngItmCls023Lst -> AngItmCls023Lng */
    public static final String AngLng_FKO_AngItmCls023Lst = "AngItmCls023Lst";
    /** FLng000128: AngLng -> AngItmCls024Lst -> AngItmCls024Lng */
    public static final String AngLng_FKO_AngItmCls024Lst = "AngItmCls024Lst";
    /** FLng000130: AngLng -> AngItmCls025Lst -> AngItmCls025Lng */
    public static final String AngLng_FKO_AngItmCls025Lst = "AngItmCls025Lst";
    /** FLng000132: AngLng -> AngItmCls026Lst -> AngItmCls026Lng */
    public static final String AngLng_FKO_AngItmCls026Lst = "AngItmCls026Lst";
    /** FLng000134: AngLng -> AngItmCls027Lst -> AngItmCls027Lng */
    public static final String AngLng_FKO_AngItmCls027Lst = "AngItmCls027Lst";
    /** FLng000136: AngLng -> AngItmCls028Lst -> AngItmCls028Lng */
    public static final String AngLng_FKO_AngItmCls028Lst = "AngItmCls028Lst";
    /** FLng000138: AngLng -> AngItmCls029Lst -> AngItmCls029Lng */
    public static final String AngLng_FKO_AngItmCls029Lst = "AngItmCls029Lst";
    /** FLng000140: AngLng -> AngItmCls030Lst -> AngItmCls030Lng */
    public static final String AngLng_FKO_AngItmCls030Lst = "AngItmCls030Lst";
    /** FLng000142: AngLng -> AngItmClsMul001Lst -> AngItmClsMul001Lng */
    public static final String AngLng_FKO_AngItmClsMul001Lst = "AngItmClsMul001Lst";
    /** FLng000144: AngLng -> AngItmClsMul002Lst -> AngItmClsMul002Lng */
    public static final String AngLng_FKO_AngItmClsMul002Lst = "AngItmClsMul002Lst";
    /** FLng000146: AngLng -> AngItmClsMul003Lst -> AngItmClsMul003Lng */
    public static final String AngLng_FKO_AngItmClsMul003Lst = "AngItmClsMul003Lst";
    /** FLng000148: AngLng -> AngItmClsMul004Lst -> AngItmClsMul004Lng */
    public static final String AngLng_FKO_AngItmClsMul004Lst = "AngItmClsMul004Lst";
    /** FLng000150: AngLng -> AngItmClsMul005Lst -> AngItmClsMul005Lng */
    public static final String AngLng_FKO_AngItmClsMul005Lst = "AngItmClsMul005Lst";
    /** FLng000152: AngLng -> AngItmStsLst -> AngItmStsLng */
    public static final String AngLng_FKO_AngItmStsLst = "AngItmStsLst";
    /** FLng000154: AngLng -> AngPrdWrkLst -> AngPrdWrkLng */
    public static final String AngLng_FKO_AngPrdWrkLst = "AngPrdWrkLst";
    /** FLng000156: AngLng -> AngPrdPrcLst -> AngPrdPrcLng */
    public static final String AngLng_FKO_AngPrdPrcLst = "AngPrdPrcLst";
    /** FLng000158: AngLng -> AngPrdWrkCatLst -> AngPrdWrkCatLng */
    public static final String AngLng_FKO_AngPrdWrkCatLst = "AngPrdWrkCatLst";
    /** FLng000160: AngLng -> AngUniMeaLst -> AngUniMeaLng */
    public static final String AngLng_FKO_AngUniMeaLst = "AngUniMeaLst";
    /** FLng000162: AngLng -> AngItmCatLst -> AngItmCatLng */
    public static final String AngLng_FKO_AngItmCatLst = "AngItmCatLst";
    /** FLng000164: AngLng -> AngBomLnkTypLst -> AngBomLnkTypLng */
    public static final String AngLng_FKO_AngBomLnkTypLst = "AngBomLnkTypLst";
    /** FLng000166: AngLng -> AngItmTypPrdLst -> AngItmTypPrdLng */
    public static final String AngLng_FKO_AngItmTypPrdLst = "AngItmTypPrdLst";
    /** FLng000168: AngLng -> AngItmOwnLst -> AngItmOwnLng */
    public static final String AngLng_FKO_AngItmOwnLst = "AngItmOwnLst";
    /** FLng000170: AngLng -> AngItmTypDimLst -> AngItmTypDimLng */
    public static final String AngLng_FKO_AngItmTypDimLst = "AngItmTypDimLst";
    /** FLng000172: AngLng -> AngUniMeaCatLst -> AngUniMeaCatLng */
    public static final String AngLng_FKO_AngUniMeaCatLst = "AngUniMeaCatLst";
    /** FLng000174: AngLng -> AngPrdVrnCatLst -> AngPrdVrnCatLng */
    public static final String AngLng_FKO_AngPrdVrnCatLst = "AngPrdVrnCatLst";
    /** FLng000176: AngLng -> AngPrdVrnLst -> AngPrdVrnLng */
    public static final String AngLng_FKO_AngPrdVrnLst = "AngPrdVrnLst";
    /** FLng000178: AngLng -> AngItmMdlLst -> AngItmMdlLng */
    public static final String AngLng_FKO_AngItmMdlLst = "AngItmMdlLst";
    /** FLng000180: AngLng -> SysAppLst -> SysAppLng */
    public static final String AngLng_FKO_SysAppLst = "SysAppLst";
    /** FLng000182: AngLng -> SysCtxLst -> SysCtxLng */
    public static final String AngLng_FKO_SysCtxLst = "SysCtxLst";
    /** FLng000184: AngLng -> SysFrmLst -> SysFrmLng */
    public static final String AngLng_FKO_SysFrmLst = "SysFrmLst";
    /** FLng000186: AngLng -> SysPrmLst -> SysPrmLng */
    public static final String AngLng_FKO_SysPrmLst = "SysPrmLst";
    /** FLng000188: AngLng -> AngSrcPrpLst -> AngSrcPrpLng */
    public static final String AngLng_FKO_AngSrcPrpLst = "AngSrcPrpLst";
    /** FLng000190: AngLng -> DefWzdLst -> DefWzdLng */
    public static final String AngLng_FKO_DefWzdLst = "DefWzdLst";
    /** FLng000192: AngLng -> DefWzdStpLst -> DefWzdStpLng */
    public static final String AngLng_FKO_DefWzdStpLst = "DefWzdStpLst";
    /** FLng000194: AngLng -> AngLstLst -> AngLstLng */
    public static final String AngLng_FKO_AngLstLst = "AngLstLst";
    /** FLng000196: AngLng -> AngLstValLst -> AngLstValLng */
    public static final String AngLng_FKO_AngLstValLst = "AngLstValLst";
    /** FLng000198: AngLng -> AngLstRemLst -> AngLstRemLng */
    public static final String AngLng_FKO_AngLstRemLst = "AngLstRemLst";
    /** FLng000200: AngLng -> AngEtyLnkTypLst -> AngEtyLnkTypLng */
    public static final String AngLng_FKO_AngEtyLnkTypLst = "AngEtyLnkTypLst";
    /** FLng000202: AngLng -> AngEtyAttTypLst -> AngEtyAttTypLng */
    public static final String AngLng_FKO_AngEtyAttTypLst = "AngEtyAttTypLst";
    /** FLng000204: AngLng -> AngEtyAttCatLst -> AngEtyAttCatLng */
    public static final String AngLng_FKO_AngEtyAttCatLst = "AngEtyAttCatLst";
    /** FLng000206: AngLng -> AngQryLst -> AngQryLng */
    public static final String AngLng_FKO_AngQryLst = "AngQryLst";
    /** FLng000208: AngLng -> AngQryLytLst -> AngQryLytLng */
    public static final String AngLng_FKO_AngQryLytLst = "AngQryLytLst";
    /** FLng000210: AngLng -> AngScmSrcTypLst -> AngScmSrcTypLng */
    public static final String AngLng_FKO_AngScmSrcTypLst = "AngScmSrcTypLst";
    /** FLng000212: AngLng -> AngScmLst -> AngScmLng */
    public static final String AngLng_FKO_AngScmLst = "AngScmLst";
    /** FLng000220: AngLng -> SysMnuLst -> SysMnuLng */
    public static final String AngLng_FKO_SysMnuLst = "SysMnuLst";
    /** FLng000222: AngLng -> SysFrmDsgLst -> SysFrmDsgLng */
    public static final String AngLng_FKO_SysFrmDsgLst = "SysFrmDsgLst";
    /** FLng000224: AngLng -> AngThmLst -> AngThmLng */
    public static final String AngLng_FKO_AngThmLst = "AngThmLst";
    /** FLng000226: AngLng -> AngNotTypCatLst -> AngNotTypCatLng */
    public static final String AngLng_FKO_AngNotTypCatLst = "AngNotTypCatLst";
    /** FLng000228: AngLng -> AngNotTypLst -> AngNotTypLng */
    public static final String AngLng_FKO_AngNotTypLst = "AngNotTypLst";
    /** FLng000230: AngLng -> AngCalDayShfLst -> AngCalDayShfLng */
    public static final String AngLng_FKO_AngCalDayShfLst = "AngCalDayShfLst";
    /** FLng000232: AngLng -> AngCalEvtTypLst -> AngCalEvtTypLng */
    public static final String AngLng_FKO_AngCalEvtTypLst = "AngCalEvtTypLst";
    /** FLng000234: AngLng -> AngCalEvtInvStsLst -> AngCalEvtInvStsLng */
    public static final String AngLng_FKO_AngCalEvtInvStsLst = "AngCalEvtInvStsLst";
    /** FLng000236: AngLng -> AngCalEvtInvTypLst -> AngCalEvtInvTypLng */
    public static final String AngLng_FKO_AngCalEvtInvTypLst = "AngCalEvtInvTypLst";
    /** FLng000238: AngLng -> AngCalEvtStsLst -> AngCalEvtStsLng */
    public static final String AngLng_FKO_AngCalEvtStsLst = "AngCalEvtStsLst";
    /** FLng000240: AngLng -> AngCalDayShfTypLst -> AngCalDayShfTypLng */
    public static final String AngLng_FKO_AngCalDayShfTypLst = "AngCalDayShfTypLst";
    /** FLng000242: AngLng -> AngCalEvtCls001Lst -> AngCalEvtCls001Lng */
    public static final String AngLng_FKO_AngCalEvtCls001Lst = "AngCalEvtCls001Lst";
    /** FLng000244: AngLng -> AngCalEvtCls002Lst -> AngCalEvtCls002Lng */
    public static final String AngLng_FKO_AngCalEvtCls002Lst = "AngCalEvtCls002Lst";
    /** FLng000246: AngLng -> AngCalEvtCls003Lst -> AngCalEvtCls003Lng */
    public static final String AngLng_FKO_AngCalEvtCls003Lst = "AngCalEvtCls003Lst";
    /** FLng000248: AngLng -> AngCalEvtCls004Lst -> AngCalEvtCls004Lng */
    public static final String AngLng_FKO_AngCalEvtCls004Lst = "AngCalEvtCls004Lst";
    /** FLng000250: AngLng -> AngCalEvtCls005Lst -> AngCalEvtCls005Lng */
    public static final String AngLng_FKO_AngCalEvtCls005Lst = "AngCalEvtCls005Lst";
    /** FLng000252: AngLng -> AngCalEvtCls006Lst -> AngCalEvtCls006Lng */
    public static final String AngLng_FKO_AngCalEvtCls006Lst = "AngCalEvtCls006Lst";
    /** FLng000254: AngLng -> AngCalEvtCls007Lst -> AngCalEvtCls007Lng */
    public static final String AngLng_FKO_AngCalEvtCls007Lst = "AngCalEvtCls007Lst";
    /** FLng000256: AngLng -> AngCalEvtCls008Lst -> AngCalEvtCls008Lng */
    public static final String AngLng_FKO_AngCalEvtCls008Lst = "AngCalEvtCls008Lst";
    /** FLng000258: AngLng -> AngCalEvtCls009Lst -> AngCalEvtCls009Lng */
    public static final String AngLng_FKO_AngCalEvtCls009Lst = "AngCalEvtCls009Lst";
    /** FLng000260: AngLng -> AngCalEvtCls010Lst -> AngCalEvtCls010Lng */
    public static final String AngLng_FKO_AngCalEvtCls010Lst = "AngCalEvtCls010Lst";
    /** FLng000262: AngLng -> AngCalEvtCls011Lst -> AngCalEvtCls011Lng */
    public static final String AngLng_FKO_AngCalEvtCls011Lst = "AngCalEvtCls011Lst";
    /** FLng000264: AngLng -> AngCalEvtCls012Lst -> AngCalEvtCls012Lng */
    public static final String AngLng_FKO_AngCalEvtCls012Lst = "AngCalEvtCls012Lst";
    /** FLng000266: AngLng -> AngCalEvtCls013Lst -> AngCalEvtCls013Lng */
    public static final String AngLng_FKO_AngCalEvtCls013Lst = "AngCalEvtCls013Lst";
    /** FLng000268: AngLng -> AngCalEvtCls014Lst -> AngCalEvtCls014Lng */
    public static final String AngLng_FKO_AngCalEvtCls014Lst = "AngCalEvtCls014Lst";
    /** FLng000270: AngLng -> AngCalEvtCls015Lst -> AngCalEvtCls015Lng */
    public static final String AngLng_FKO_AngCalEvtCls015Lst = "AngCalEvtCls015Lst";
    /** FLng000272: AngLng -> AngCalEvtCls016Lst -> AngCalEvtCls016Lng */
    public static final String AngLng_FKO_AngCalEvtCls016Lst = "AngCalEvtCls016Lst";
    /** FLng000274: AngLng -> AngCalEvtCls017Lst -> AngCalEvtCls017Lng */
    public static final String AngLng_FKO_AngCalEvtCls017Lst = "AngCalEvtCls017Lst";
    /** FLng000276: AngLng -> AngCalEvtCls018Lst -> AngCalEvtCls018Lng */
    public static final String AngLng_FKO_AngCalEvtCls018Lst = "AngCalEvtCls018Lst";
    /** FLng000278: AngLng -> AngCalEvtCls019Lst -> AngCalEvtCls019Lng */
    public static final String AngLng_FKO_AngCalEvtCls019Lst = "AngCalEvtCls019Lst";
    /** FLng000280: AngLng -> AngCalEvtCls020Lst -> AngCalEvtCls020Lng */
    public static final String AngLng_FKO_AngCalEvtCls020Lst = "AngCalEvtCls020Lst";
    /** FLng000282: AngLng -> AngCalEvtCls021Lst -> AngCalEvtCls021Lng */
    public static final String AngLng_FKO_AngCalEvtCls021Lst = "AngCalEvtCls021Lst";
    /** FLng000284: AngLng -> AngCalEvtCls022Lst -> AngCalEvtCls022Lng */
    public static final String AngLng_FKO_AngCalEvtCls022Lst = "AngCalEvtCls022Lst";
    /** FLng000286: AngLng -> AngCalEvtCls023Lst -> AngCalEvtCls023Lng */
    public static final String AngLng_FKO_AngCalEvtCls023Lst = "AngCalEvtCls023Lst";
    /** FLng000288: AngLng -> AngCalEvtCls024Lst -> AngCalEvtCls024Lng */
    public static final String AngLng_FKO_AngCalEvtCls024Lst = "AngCalEvtCls024Lst";
    /** FLng000290: AngLng -> AngCalEvtCls025Lst -> AngCalEvtCls025Lng */
    public static final String AngLng_FKO_AngCalEvtCls025Lst = "AngCalEvtCls025Lst";
    /** FLng000292: AngLng -> AngCalEvtCls026Lst -> AngCalEvtCls026Lng */
    public static final String AngLng_FKO_AngCalEvtCls026Lst = "AngCalEvtCls026Lst";
    /** FLng000294: AngLng -> AngCalEvtCls027Lst -> AngCalEvtCls027Lng */
    public static final String AngLng_FKO_AngCalEvtCls027Lst = "AngCalEvtCls027Lst";
    /** FLng000296: AngLng -> AngCalEvtCls028Lst -> AngCalEvtCls028Lng */
    public static final String AngLng_FKO_AngCalEvtCls028Lst = "AngCalEvtCls028Lst";
    /** FLng000298: AngLng -> AngCalEvtCls029Lst -> AngCalEvtCls029Lng */
    public static final String AngLng_FKO_AngCalEvtCls029Lst = "AngCalEvtCls029Lst";
    /** FLng000300: AngLng -> AngCalEvtCls030Lst -> AngCalEvtCls030Lng */
    public static final String AngLng_FKO_AngCalEvtCls030Lst = "AngCalEvtCls030Lst";
    /** FLng000302: AngLng -> AngCalEvtClsMul001Lst -> AngCalEvtClsMul001Lng */
    public static final String AngLng_FKO_AngCalEvtClsMul001Lst = "AngCalEvtClsMul001Lst";
    /** FLng000304: AngLng -> AngCalEvtClsMul002Lst -> AngCalEvtClsMul002Lng */
    public static final String AngLng_FKO_AngCalEvtClsMul002Lst = "AngCalEvtClsMul002Lst";
    /** FLng000306: AngLng -> AngCalEvtClsMul003Lst -> AngCalEvtClsMul003Lng */
    public static final String AngLng_FKO_AngCalEvtClsMul003Lst = "AngCalEvtClsMul003Lst";
    /** FLng000308: AngLng -> AngCalEvtClsMul004Lst -> AngCalEvtClsMul004Lng */
    public static final String AngLng_FKO_AngCalEvtClsMul004Lst = "AngCalEvtClsMul004Lst";
    /** FLng000310: AngLng -> AngCalEvtClsMul005Lst -> AngCalEvtClsMul005Lng */
    public static final String AngLng_FKO_AngCalEvtClsMul005Lst = "AngCalEvtClsMul005Lst";
    /** FLng000312: AngLng -> CalOrgComAbsLst -> CalOrgComAbsLng */
    public static final String AngLng_FKO_CalOrgComAbsLst = "CalOrgComAbsLst";
    /** FLng000314: AngLng -> CalPlnAbsLst -> CalPlnAbsLng */
    public static final String AngLng_FKO_CalPlnAbsLst = "CalPlnAbsLst";
    /** FLng000318: AngLng -> SysWksLst -> SysWksLng */
    public static final String AngLng_FKO_SysWksLst = "SysWksLst";
    /** FLng000320: AngLng -> SysWksTabLst -> SysWksTabLng */
    public static final String AngLng_FKO_SysWksTabLst = "SysWksTabLst";
    /** FLng000322: AngLng -> SysWksWdgLst -> SysWksWdgLng */
    public static final String AngLng_FKO_SysWksWdgLst = "SysWksWdgLst";
    /** FLng000324: AngLng -> SysWksBtnLst -> SysWksBtnLng */
    public static final String AngLng_FKO_SysWksBtnLst = "SysWksBtnLst";
    /** FLng000326: AngLng -> AngSysWksActLst -> AngSysWksActLng */
    public static final String AngLng_FKO_AngSysWksActLst = "AngSysWksActLst";
    /** FLng000328: AngLng -> SysWksWdgTypLst -> SysWksWdgTypLng */
    public static final String AngLng_FKO_SysWksWdgTypLst = "SysWksWdgTypLst";
    /** FLng000330: AngLng -> AngSysWksWdgCfgLst -> AngSysWksWdgCfgLng */
    public static final String AngLng_FKO_AngSysWksWdgCfgLst = "AngSysWksWdgCfgLst";
    /** FLng000332: AngLng -> SysWksTypLst -> SysWksTypLng */
    public static final String AngLng_FKO_SysWksTypLst = "SysWksTypLst";
    /** FLng000334: AngLng -> SysWksSldLst -> SysWksSldLng */
    public static final String AngLng_FKO_SysWksSldLst = "SysWksSldLst";
    /** FLng000336: AngLng -> AngDatSetStpTypLst -> AngDatSetStpTypLng */
    public static final String AngLng_FKO_AngDatSetStpTypLst = "AngDatSetStpTypLst";
    /** FLng000338: AngLng -> AngDatSetLst -> AngDatSetLng */
    public static final String AngLng_FKO_AngDatSetLst = "AngDatSetLst";
    /** FLng000340: AngLng -> AngDatSetPrmLst -> AngDatSetPrmLng */
    public static final String AngLng_FKO_AngDatSetPrmLst = "AngDatSetPrmLst";
    /** FLng000342: AngLng -> RepMdlLst -> RepMdlLng */
    public static final String AngLng_FKO_RepMdlLst = "RepMdlLst";
    /** FLng000344: AngLng -> AngRepMdlTypLst -> AngRepMdlTypLng */
    public static final String AngLng_FKO_AngRepMdlTypLst = "AngRepMdlTypLst";
    /** FLng000346: AngLng -> SysDocClsLst -> SysDocClsLng */
    public static final String AngLng_FKO_SysDocClsLst = "SysDocClsLst";
    /** FLng000348: AngLng -> SysDocCtxLst -> SysDocCtxLng */
    public static final String AngLng_FKO_SysDocCtxLst = "SysDocCtxLst";
    /** FLng000350: AngLng -> AngDvzChrMacTypLst -> AngDvzChrMacTypLng */
    public static final String AngLng_FKO_AngDvzChrMacTypLst = "AngDvzChrMacTypLst";
    /** FLng000352: AngLng -> AngDvzChrTypLst -> AngDvzChrTypLng */
    public static final String AngLng_FKO_AngDvzChrTypLst = "AngDvzChrTypLst";
    /** FLng000354: AngLng -> AngDvzGntLayTypLst -> AngDvzGntLayTypLng */
    public static final String AngLng_FKO_AngDvzGntLayTypLst = "AngDvzGntLayTypLst";
    /** FLng000356: AngLng -> DvzWksQryLst -> DvzWksQryLng */
    public static final String AngLng_FKO_DvzWksQryLst = "DvzWksQryLst";
    /** FLng000358: AngLng -> DvzWksQryDsgLst -> DvzWksQryDsgLng */
    public static final String AngLng_FKO_DvzWksQryDsgLst = "DvzWksQryDsgLst";
    /** FLng000360: AngLng -> DvzWksQryDsgStyLst -> DvzWksQryDsgStyLng */
    public static final String AngLng_FKO_DvzWksQryDsgStyLst = "DvzWksQryDsgStyLst";
    /** FLng000362: AngLng -> DvzWksChrAxyLst -> DvzWksChrAxyLng */
    public static final String AngLng_FKO_DvzWksChrAxyLst = "DvzWksChrAxyLst";
    /** FLng000364: AngLng -> DvzWksGntLayLst -> DvzWksGntLayLng */
    public static final String AngLng_FKO_DvzWksGntLayLst = "DvzWksGntLayLst";
    /** FLng000366: AngLng -> AngBecFltLst -> AngBecFltLng */
    public static final String AngLng_FKO_AngBecFltLst = "AngBecFltLst";
    /** FLng000368: AngLng -> AngEmaSrvLst -> AngEmaSrvLng */
    public static final String AngLng_FKO_AngEmaSrvLst = "AngEmaSrvLst";
    /** FLng000370: AngLng -> EmaLstLst -> EmaLstLng */
    public static final String AngLng_FKO_EmaLstLst = "EmaLstLst";
    /** FLng000372: AngLng -> EmaLogLst -> EmaLogLng */
    public static final String AngLng_FKO_EmaLogLst = "EmaLogLst";
    /** FLng000374: AngLng -> DvzRepLst -> DvzRepLng */
    public static final String AngLng_FKO_DvzRepLst = "DvzRepLst";
    /** FLng000376: AngLng -> DvzRepQryLst -> DvzRepQryLng */
    public static final String AngLng_FKO_DvzRepQryLst = "DvzRepQryLst";
    /** FLng000378: AngLng -> DvzRepQryDsgLst -> DvzRepQryDsgLng */
    public static final String AngLng_FKO_DvzRepQryDsgLst = "DvzRepQryDsgLst";
    /** FLng000380: AngLng -> DvzRepQryDsgStyLst -> DvzRepQryDsgStyLng */
    public static final String AngLng_FKO_DvzRepQryDsgStyLst = "DvzRepQryDsgStyLst";
    /** FLng000382: AngLng -> DvzRepChrLst -> DvzRepChrLng */
    public static final String AngLng_FKO_DvzRepChrLst = "DvzRepChrLst";
    /** FLng000384: AngLng -> DvzRepChrAxyLst -> DvzRepChrAxyLng */
    public static final String AngLng_FKO_DvzRepChrAxyLst = "DvzRepChrAxyLst";
    /** FLng000386: AngLng -> DvzChrTypLst -> DvzChrTypLng */
    public static final String AngLng_FKO_DvzChrTypLst = "DvzChrTypLst";
    /** FLng000388: AngLng -> DvzRepGntLst -> DvzRepGntLng */
    public static final String AngLng_FKO_DvzRepGntLst = "DvzRepGntLst";
    /** FLng000390: AngLng -> DvzGntLayTypLst -> DvzGntLayTypLng */
    public static final String AngLng_FKO_DvzGntLayTypLst = "DvzGntLayTypLst";
    /** FLng000392: AngLng -> DvzRepGntLayLst -> DvzRepGntLayLng */
    public static final String AngLng_FKO_DvzRepGntLayLst = "DvzRepGntLayLst";
    /** FLng000394: AngLng -> DvzChrMacTypLst -> DvzChrMacTypLng */
    public static final String AngLng_FKO_DvzChrMacTypLst = "DvzChrMacTypLst";
    /** FSysBas004: AngLng -> SupLst -> AngSup */
    public static final String AngLng_FKO_SupLst = "SupLst";
    /** FSysEnv002: AngLng -> SrvSrcLst -> AngSrvSrc */
    public static final String AngLng_FKO_SrvSrcLst = "SrvSrcLst";
    /** FSysJst003: AngLng -> JobLst -> JstJob */
    public static final String AngLng_FKO_JobLst = "JobLst";
    /** FSysMnc009: AngLng -> BotLst -> AngMobBot */
    public static final String AngLng_FKO_BotLst = "BotLst";
    /** FSysRep005: AngLng -> RepMdlLngLst -> RepMdlLngVrs */
    public static final String AngLng_FKO_RepMdlLngLst = "RepMdlLngLst";
    /** FSysRes004: AngLng -> UsrFavLst -> AngRes */
    public static final String AngLng_FKO_UsrFavLst = "UsrFavLst";
    /** FSysTra003: AngLng -> MsnLst -> SysTraMsn */
    public static final String AngLng_FKO_MsnLst = "MsnLst";

    /** Configurazione log per tabelle */
    public static final String AngLogTbl = "AngLogTbl";
    /** FSysLog001: AngDbmTbl <- Tbl <- AngLogTbl */
    public static final String AngLogTbl_FKI_Tbl = "Tbl";

    /** Liste */
    public static final String AngLst = "AngLst";
    /** FLng000193: AngLst -> LngLst -> AngLstLng */
    public static final String AngLst_FKO_LngLst = "LngLst";
    /** FSysLst002: AngLst -> ValLst -> AngLstVal */
    public static final String AngLst_FKO_ValLst = "ValLst";
    /** FSysLst001: AngOrgCom <- OrgCom <- AngLst */
    public static final String AngLst_FKI_OrgCom = "OrgCom";

    /** Traduzioni per AngLst */
    public static final String AngLstLng = "AngLstLng";
    /** FLng000193: AngLst <- Rec <- AngLstLng */
    public static final String AngLstLng_FKI_Rec = "Rec";
    /** FLng000194: AngLng <- Lng <- AngLstLng */
    public static final String AngLstLng_FKI_Lng = "Lng";

    /** Liste remote */
    public static final String AngLstRem = "AngLstRem";
    /** FLng000197: AngLstRem -> LngLst -> AngLstRemLng */
    public static final String AngLstRem_FKO_LngLst = "LngLst";
    /** FSysLst004: AngLstRem -> LstRemFldLst -> AngLstRemFld */
    public static final String AngLstRem_FKO_LstRemFldLst = "LstRemFldLst";
    /** FSysUif018: AngLstRem -> FldFrmLst -> SysFrmDsgFld */
    public static final String AngLstRem_FKO_FldFrmLst = "FldFrmLst";
    /** FSysUpf046: AngLstRem -> UpfLst -> UpfDef */
    public static final String AngLstRem_FKO_UpfLst = "UpfLst";
    /** FSysLst003: AngRemSrv <- RemSrv <- AngLstRem */
    public static final String AngLstRem_FKI_RemSrv = "RemSrv";

    /** Campi liste remote */
    public static final String AngLstRemFld = "AngLstRemFld";
    /** FSysLst004: AngLstRem <- LstRem <- AngLstRemFld */
    public static final String AngLstRemFld_FKI_LstRem = "LstRem";
    /** FSysLst005: SysTraLbl <- Lbl <- AngLstRemFld */
    public static final String AngLstRemFld_FKI_Lbl = "Lbl";

    /** Traduzioni per AngLstRem */
    public static final String AngLstRemLng = "AngLstRemLng";
    /** FLng000197: AngLstRem <- Rec <- AngLstRemLng */
    public static final String AngLstRemLng_FKI_Rec = "Rec";
    /** FLng000198: AngLng <- Lng <- AngLstRemLng */
    public static final String AngLstRemLng_FKI_Lng = "Lng";

    /** Valori liste */
    public static final String AngLstVal = "AngLstVal";
    /** FLng000195: AngLstVal -> LngLst -> AngLstValLng */
    public static final String AngLstVal_FKO_LngLst = "LngLst";
    /** FSysUpf026: AngLstVal -> UpfIstLst_01 -> UpfIst */
    public static final String AngLstVal_FKO_UpfIstLst_01 = "UpfIstLst_01";
    /** FSysUpf027: AngLstVal -> UpfIstLst_02 -> UpfIst */
    public static final String AngLstVal_FKO_UpfIstLst_02 = "UpfIstLst_02";
    /** FSysUpf028: AngLstVal -> UpfIstLst_03 -> UpfIst */
    public static final String AngLstVal_FKO_UpfIstLst_03 = "UpfIstLst_03";
    /** FSysUpf029: AngLstVal -> UpfIstLst_04 -> UpfIst */
    public static final String AngLstVal_FKO_UpfIstLst_04 = "UpfIstLst_04";
    /** FSysUpf030: AngLstVal -> UpfIstLst_05 -> UpfIst */
    public static final String AngLstVal_FKO_UpfIstLst_05 = "UpfIstLst_05";
    /** FSysUpf031: AngLstVal -> UpfIstLst_06 -> UpfIst */
    public static final String AngLstVal_FKO_UpfIstLst_06 = "UpfIstLst_06";
    /** FSysUpf032: AngLstVal -> UpfIstLst_07 -> UpfIst */
    public static final String AngLstVal_FKO_UpfIstLst_07 = "UpfIstLst_07";
    /** FSysUpf033: AngLstVal -> UpfIstLst_08 -> UpfIst */
    public static final String AngLstVal_FKO_UpfIstLst_08 = "UpfIstLst_08";
    /** FSysUpf034: AngLstVal -> UpfIstLst_09 -> UpfIst */
    public static final String AngLstVal_FKO_UpfIstLst_09 = "UpfIstLst_09";
    /** FSysUpf035: AngLstVal -> UpfIstLst_10 -> UpfIst */
    public static final String AngLstVal_FKO_UpfIstLst_10 = "UpfIstLst_10";
    /** FSysUpf036: AngLstVal -> UpfIstLst_11 -> UpfIst */
    public static final String AngLstVal_FKO_UpfIstLst_11 = "UpfIstLst_11";
    /** FSysUpf037: AngLstVal -> UpfIstLst_12 -> UpfIst */
    public static final String AngLstVal_FKO_UpfIstLst_12 = "UpfIstLst_12";
    /** FSysUpf038: AngLstVal -> UpfIstLst_13 -> UpfIst */
    public static final String AngLstVal_FKO_UpfIstLst_13 = "UpfIstLst_13";
    /** FSysUpf039: AngLstVal -> UpfIstLst_14 -> UpfIst */
    public static final String AngLstVal_FKO_UpfIstLst_14 = "UpfIstLst_14";
    /** FSysUpf040: AngLstVal -> UpfIstLst_15 -> UpfIst */
    public static final String AngLstVal_FKO_UpfIstLst_15 = "UpfIstLst_15";
    /** FSysUpf041: AngLstVal -> UpfIstLst_16 -> UpfIst */
    public static final String AngLstVal_FKO_UpfIstLst_16 = "UpfIstLst_16";
    /** FSysUpf042: AngLstVal -> UpfIstLst_17 -> UpfIst */
    public static final String AngLstVal_FKO_UpfIstLst_17 = "UpfIstLst_17";
    /** FSysUpf043: AngLstVal -> UpfIstLst_18 -> UpfIst */
    public static final String AngLstVal_FKO_UpfIstLst_18 = "UpfIstLst_18";
    /** FSysUpf044: AngLstVal -> UpfIstLst_19 -> UpfIst */
    public static final String AngLstVal_FKO_UpfIstLst_19 = "UpfIstLst_19";
    /** FSysUpf045: AngLstVal -> UpfIstLst_20 -> UpfIst */
    public static final String AngLstVal_FKO_UpfIstLst_20 = "UpfIstLst_20";
    /** FSysLst002: AngLst <- Lst <- AngLstVal */
    public static final String AngLstVal_FKI_Lst = "Lst";

    /** Traduzioni per AngLstVal */
    public static final String AngLstValLng = "AngLstValLng";
    /** FLng000195: AngLstVal <- Rec <- AngLstValLng */
    public static final String AngLstValLng_FKI_Rec = "Rec";
    /** FLng000196: AngLng <- Lng <- AngLstValLng */
    public static final String AngLstValLng_FKI_Lng = "Lng";

    /** Anagrafe moduli */
    public static final String AngMdl = "AngMdl";
    /** FSys001: AngMdl -> PrsLst -> AngPrs */
    public static final String AngMdl_FKO_PrsLst = "PrsLst";
    /** FSys003: AngMdl -> ChdMdlLst -> AngMdlDep */
    public static final String AngMdl_FKO_ChdMdlLst = "ChdMdlLst";
    /** FSys004: AngMdl -> PrtMdlLst -> AngMdlDep */
    public static final String AngMdl_FKO_PrtMdlLst = "PrtMdlLst";
    /** FSys005: AngMdl -> TblLst -> AngDbmTbl */
    public static final String AngMdl_FKO_TblLst = "TblLst";
    /** FSys019: AngMdl -> ColLst -> AngDbmTblCol */
    public static final String AngMdl_FKO_ColLst = "ColLst";
    /** FSys020: AngMdl -> RfkLst -> AngDbmRfk */
    public static final String AngMdl_FKO_RfkLst = "RfkLst";
    /** FSysTra001: AngMdl -> MsgLst -> SysTraMsg */
    public static final String AngMdl_FKO_MsgLst = "MsgLst";
    /** FSysUif001: AngMdl -> MnuLst -> SysMnu */
    public static final String AngMdl_FKO_MnuLst = "MnuLst";

    /** Anagrafe dipendenze moduli */
    public static final String AngMdlDep = "AngMdlDep";
    /** FSys003: AngMdl <- PrtMdl <- AngMdlDep */
    public static final String AngMdlDep_FKI_PrtMdl = "PrtMdl";
    /** FSys004: AngMdl <- ChdMdl <- AngMdlDep */
    public static final String AngMdlDep_FKI_ChdMdl = "ChdMdl";

    /** Mobile apps */
    public static final String AngMobApp = "AngMobApp";
    /** FSysMnc001: AngMobApp -> MobAppTknLst -> MobAppTkn */
    public static final String AngMobApp_FKO_MobAppTknLst = "MobAppTknLst";

    /** Bot */
    public static final String AngMobBot = "AngMobBot";
    /** FSysMnc010: AngMobBot -> PrmLst -> AngMobBotPrm */
    public static final String AngMobBot_FKO_PrmLst = "PrmLst";
    /** FSysMnc013: AngMobBot -> ResCntLst -> ResCnt */
    public static final String AngMobBot_FKO_ResCntLst = "ResCntLst";
    /** FSysMnc008: AngRes <- Res <- AngMobBot */
    public static final String AngMobBot_FKI_Res = "Res";
    /** FSysMnc009: AngLng <- Lng <- AngMobBot */
    public static final String AngMobBot_FKI_Lng = "Lng";

    /** Parametri bot */
    public static final String AngMobBotPrm = "AngMobBotPrm";
    /** FSysMnc010: AngMobBot <- Bot <- AngMobBotPrm */
    public static final String AngMobBotPrm_FKI_Bot = "Bot";

    /** Tipi notifiche */
    public static final String AngNotTyp = "AngNotTyp";
    /** FLng000227: AngNotTyp -> LngLst -> AngNotTypLng */
    public static final String AngNotTyp_FKO_LngLst = "LngLst";
    /** FSysMnc006: AngNotTyp -> NotMncLst -> MncNot */
    public static final String AngNotTyp_FKO_NotMncLst = "NotMncLst";
    /** FSysMnc015: AngNotTyp -> NotTypLst -> AngResNotTyp */
    public static final String AngNotTyp_FKO_NotTypLst = "NotTypLst";
    /** FSysMnc004: AngNotTypCat <- Cat <- AngNotTyp */
    public static final String AngNotTyp_FKI_Cat = "Cat";

    /** Categorie tipi notifiche */
    public static final String AngNotTypCat = "AngNotTypCat";
    /** FLng000225: AngNotTypCat -> LngLst -> AngNotTypCatLng */
    public static final String AngNotTypCat_FKO_LngLst = "LngLst";
    /** FSysMnc004: AngNotTypCat -> NotTypLst -> AngNotTyp */
    public static final String AngNotTypCat_FKO_NotTypLst = "NotTypLst";
    /** FSysMnc003: SysApp <- App <- AngNotTypCat */
    public static final String AngNotTypCat_FKI_App = "App";

    /** Traduzioni per AngNotTypCat */
    public static final String AngNotTypCatLng = "AngNotTypCatLng";
    /** FLng000225: AngNotTypCat <- Rec <- AngNotTypCatLng */
    public static final String AngNotTypCatLng_FKI_Rec = "Rec";
    /** FLng000226: AngLng <- Lng <- AngNotTypCatLng */
    public static final String AngNotTypCatLng_FKI_Lng = "Lng";

    /** Traduzioni per AngNotTyp */
    public static final String AngNotTypLng = "AngNotTypLng";
    /** FLng000227: AngNotTyp <- Rec <- AngNotTypLng */
    public static final String AngNotTypLng_FKI_Rec = "Rec";
    /** FLng000228: AngLng <- Lng <- AngNotTypLng */
    public static final String AngNotTypLng_FKI_Lng = "Lng";

    /** Multiazienda */
    public static final String AngOrgCom = "AngOrgCom";
    /** FMulOrg001: AngOrgCom -> AngResLst -> AngRes */
    public static final String AngOrgCom_FKO_AngResLst = "AngResLst";
    /** FMulOrg002: AngOrgCom -> AngItmLst -> AngItm */
    public static final String AngOrgCom_FKO_AngItmLst = "AngItmLst";
    /** FMulOrg007: AngOrgCom -> AngPlnLst -> AngPln */
    public static final String AngOrgCom_FKO_AngPlnLst = "AngPlnLst";
    /** FSysCal133: AngOrgCom -> AbsLst -> CalOrgComAbs */
    public static final String AngOrgCom_FKO_AbsLst = "AbsLst";
    /** FSysCod001: AngOrgCom -> SysCodRulLst -> AngCodRul */
    public static final String AngOrgCom_FKO_SysCodRulLst = "SysCodRulLst";
    /** FSysEnv013: AngOrgCom -> RemSrvLst -> AngRemSrvOrg */
    public static final String AngOrgCom_FKO_RemSrvLst = "RemSrvLst";
    /** FSysLst001: AngOrgCom -> LstLst -> AngLst */
    public static final String AngOrgCom_FKO_LstLst = "LstLst";
    /** FSysOrg052: AngOrgCom -> CstCenLst -> AngCstCen */
    public static final String AngOrgCom_FKO_CstCenLst = "CstCenLst";
    /** FSysOrg066: AngOrgCom -> BusUniLst -> AngBusUniOrgCom */
    public static final String AngOrgCom_FKO_BusUniLst = "BusUniLst";
    /** FSysCom001: AngPlc <- OrgComPlc <- AngOrgCom */
    public static final String AngOrgCom_FKI_OrgComPlc = "OrgComPlc";
    /** FSysCom002: AngCal <- Cal <- AngOrgCom */
    public static final String AngOrgCom_FKI_Cal = "Cal";

    /** Tipi livelli organigramma */
    public static final String AngOrgLvlTyp = "AngOrgLvlTyp";
    /** FSysOrg002: AngOrgLvlTyp -> LvlLst -> OrgLvl */
    public static final String AngOrgLvlTyp_FKO_LvlLst = "LvlLst";

    /** Ruoli organigramma */
    public static final String AngOrgRol = "AngOrgRol";
    /** FLng000059: AngOrgRol -> LngLst -> AngOrgRolLng */
    public static final String AngOrgRol_FKO_LngLst = "LngLst";
    /** FSysOrg008: AngOrgRol -> ManResLst -> OrgLvlManRes */
    public static final String AngOrgRol_FKO_ManResLst = "ManResLst";
    /** FSysOrg011: AngOrgRol -> ManGrpLst -> OrgLvlManGrp */
    public static final String AngOrgRol_FKO_ManGrpLst = "ManGrpLst";

    /** Traduzioni per AngOrgRol */
    public static final String AngOrgRolLng = "AngOrgRolLng";
    /** FLng000059: AngOrgRol <- Rec <- AngOrgRolLng */
    public static final String AngOrgRolLng_FKI_Rec = "Rec";
    /** FLng000060: AngLng <- Lng <- AngOrgRolLng */
    public static final String AngOrgRolLng_FKI_Lng = "Lng";

    /** Tipi organigramma */
    public static final String AngOrgTyp = "AngOrgTyp";
    /** FLng000061: AngOrgTyp -> LngLst -> AngOrgTypLng */
    public static final String AngOrgTyp_FKO_LngLst = "LngLst";
    /** FSysOrg014: AngOrgTyp -> OrgLst -> Org */
    public static final String AngOrgTyp_FKO_OrgLst = "OrgLst";

    /** Traduzioni per AngOrgTyp */
    public static final String AngOrgTypLng = "AngOrgTypLng";
    /** FLng000061: AngOrgTyp <- Rec <- AngOrgTypLng */
    public static final String AngOrgTypLng_FKI_Rec = "Rec";
    /** FLng000062: AngLng <- Lng <- AngOrgTypLng */
    public static final String AngOrgTypLng_FKI_Lng = "Lng";

    /** Modalità di pagamento */
    public static final String AngPayMet = "AngPayMet";
    /** FLng000015: AngPayMet -> LngLst -> AngPayMetLng */
    public static final String AngPayMet_FKO_LngLst = "LngLst";
    /** FSysOrg024: AngPayMet -> RecRulLst -> SysReaRulRol */
    public static final String AngPayMet_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngPayMet */
    public static final String AngPayMetLng = "AngPayMetLng";
    /** FLng000015: AngPayMet <- Rec <- AngPayMetLng */
    public static final String AngPayMetLng_FKI_Rec = "Rec";
    /** FLng000016: AngLng <- Lng <- AngPayMetLng */
    public static final String AngPayMetLng_FKI_Lng = "Lng";

    /** Tipi Pagamento */
    public static final String AngPayTyp = "AngPayTyp";
    /** FLng000023: AngPayTyp -> LngLst -> AngPayTypLng */
    public static final String AngPayTyp_FKO_LngLst = "LngLst";
    /** FSysOrg028: AngPayTyp -> RecRulLst -> SysReaRulRol */
    public static final String AngPayTyp_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngPayTyp */
    public static final String AngPayTypLng = "AngPayTypLng";
    /** FLng000023: AngPayTyp <- Rec <- AngPayTypLng */
    public static final String AngPayTypLng_FKI_Rec = "Rec";
    /** FLng000024: AngLng <- Lng <- AngPayTypLng */
    public static final String AngPayTypLng_FKI_Lng = "Lng";

    /** Imballo */
    public static final String AngPck = "AngPck";
    /** FLng000021: AngPck -> LngLst -> AngPckLng */
    public static final String AngPck_FKO_LngLst = "LngLst";
    /** FSysOrg027: AngPck -> RecRulLst -> SysReaRulRol */
    public static final String AngPck_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngPck */
    public static final String AngPckLng = "AngPckLng";
    /** FLng000021: AngPck <- Rec <- AngPckLng */
    public static final String AngPckLng_FKI_Rec = "Rec";
    /** FLng000022: AngLng <- Lng <- AngPckLng */
    public static final String AngPckLng_FKI_Lng = "Lng";

    /** Luoghi */
    public static final String AngPlc = "AngPlc";
    /** FLng000007: AngPlc -> LngLst -> AngPlcLng */
    public static final String AngPlc_FKO_LngLst = "LngLst";
    /** FSysCom001: AngPlc -> OrgComLst -> AngOrgCom */
    public static final String AngPlc_FKO_OrgComLst = "OrgComLst";
    /** FSysGeo004: AngPlc -> BnkStaLst -> AngBnk */
    public static final String AngPlc_FKO_BnkStaLst = "BnkStaLst";
    /** FSysGeo005: AngPlc -> BnkPrvLst -> AngBnk */
    public static final String AngPlc_FKO_BnkPrvLst = "BnkPrvLst";
    /** FSysGeo008: AngPlc -> ChdPlcLst -> AngPlc */
    public static final String AngPlc_FKO_ChdPlcLst = "ChdPlcLst";
    /** FSysGeo007: AngZon <- Zon <- AngPlc */
    public static final String AngPlc_FKI_Zon = "Zon";
    /** FSysGeo008: AngPlc <- Plc <- AngPlc */
    public static final String AngPlc_FKI_Plc = "Plc";

    /** Traduzioni per AngPlc */
    public static final String AngPlcLng = "AngPlcLng";
    /** FLng000007: AngPlc <- Rec <- AngPlcLng */
    public static final String AngPlcLng_FKI_Rec = "Rec";
    /** FLng000008: AngLng <- Lng <- AngPlcLng */
    public static final String AngPlcLng_FKI_Lng = "Lng";

    /** Stabilimenti */
    public static final String AngPln = "AngPln";
    /** FLng000027: AngPln -> LngLst -> AngPlnLng */
    public static final String AngPln_FKO_LngLst = "LngLst";
    /** FSysCal135: AngPln -> AbsLst -> CalPlnAbs */
    public static final String AngPln_FKO_AbsLst = "AbsLst";
    /** FSysLgs001: AngPln -> WhsLst -> AngWhs */
    public static final String AngPln_FKO_WhsLst = "WhsLst";
    /** FMulOrg007: AngOrgCom <- OrgCom <- AngPln */
    public static final String AngPln_FKI_OrgCom = "OrgCom";
    /** FSysLgs002: AngCal <- Cal <- AngPln */
    public static final String AngPln_FKI_Cal = "Cal";

    /** Traduzioni per AngPln */
    public static final String AngPlnLng = "AngPlnLng";
    /** FLng000027: AngPln <- Rec <- AngPlnLng */
    public static final String AngPlnLng_FKI_Rec = "Rec";
    /** FLng000028: AngLng <- Lng <- AngPlnLng */
    public static final String AngPlnLng_FKI_Lng = "Lng";

    /** Cicli produttivi */
    public static final String AngPrdCyc = "AngPrdCyc";
    /** FSysItm009: AngPrdCyc -> OprLst -> AngPrdCycOpr */
    public static final String AngPrdCyc_FKO_OprLst = "OprLst";
    /** FSysItm134: AngPrdCyc -> ItmLvlSugLst -> AngItmLvlSug */
    public static final String AngPrdCyc_FKO_ItmLvlSugLst = "ItmLvlSugLst";
    /** FSysItm001: AngItm <- Itm <- AngPrdCyc */
    public static final String AngPrdCyc_FKI_Itm = "Itm";
    /** FSysItm002: AngPrdCycTyp <- Typ <- AngPrdCyc */
    public static final String AngPrdCyc_FKI_Typ = "Typ";
    /** FSysItm064: AngPrdPrc <- PrdPrc <- AngPrdCyc */
    public static final String AngPrdCyc_FKI_PrdPrc = "PrdPrc";

    /** Fasi cicli produttivi */
    public static final String AngPrdCycOpr = "AngPrdCycOpr";
    /** FSysItm059: AngPrdCycOpr -> PrePrdCycOprLnkLst -> AngPrdCycOprLnk */
    public static final String AngPrdCycOpr_FKO_PrePrdCycOprLnkLst = "PrePrdCycOprLnkLst";
    /** FSysItm060: AngPrdCycOpr -> NxtPrdCycOprLnkLst -> AngPrdCycOprLnk */
    public static final String AngPrdCycOpr_FKO_NxtPrdCycOprLnkLst = "NxtPrdCycOprLnkLst";
    /** FSysGrp007: AngGrp <- PlnGrp <- AngPrdCycOpr */
    public static final String AngPrdCycOpr_FKI_PlnGrp = "PlnGrp";
    /** FSysItm009: AngPrdCyc <- PrdCyc <- AngPrdCycOpr */
    public static final String AngPrdCycOpr_FKI_PrdCyc = "PrdCyc";
    /** FSysItm062: AngPrdWrk <- PrdWrk <- AngPrdCycOpr */
    public static final String AngPrdCycOpr_FKI_PrdWrk = "PrdWrk";
    /** FSysItm138: AngItmVrn <- ItmVrn <- AngPrdCycOpr */
    public static final String AngPrdCycOpr_FKI_ItmVrn = "ItmVrn";

    /** Dipendenze tra cicli fase di lavoro */
    public static final String AngPrdCycOprLnk = "AngPrdCycOprLnk";
    /** FSysItm059: AngPrdCycOpr <- PrePrdCycOpr <- AngPrdCycOprLnk */
    public static final String AngPrdCycOprLnk_FKI_PrePrdCycOpr = "PrePrdCycOpr";
    /** FSysItm060: AngPrdCycOpr <- NxtPrdCycOpr <- AngPrdCycOprLnk */
    public static final String AngPrdCycOprLnk_FKI_NxtPrdCycOpr = "NxtPrdCycOpr";

    /** Tipologie ciclo */
    public static final String AngPrdCycTyp = "AngPrdCycTyp";
    /** FLng000077: AngPrdCycTyp -> LngLst -> AngPrdCycTypLng */
    public static final String AngPrdCycTyp_FKO_LngLst = "LngLst";
    /** FSysItm002: AngPrdCycTyp -> PrdCycLst -> AngPrdCyc */
    public static final String AngPrdCycTyp_FKO_PrdCycLst = "PrdCycLst";

    /** Traduzioni per AngPrdCycTyp */
    public static final String AngPrdCycTypLng = "AngPrdCycTypLng";
    /** FLng000077: AngPrdCycTyp <- Rec <- AngPrdCycTypLng */
    public static final String AngPrdCycTypLng_FKI_Rec = "Rec";
    /** FLng000078: AngLng <- Lng <- AngPrdCycTypLng */
    public static final String AngPrdCycTypLng_FKI_Lng = "Lng";

    /** Processi produttivi */
    public static final String AngPrdPrc = "AngPrdPrc";
    /** FLng000155: AngPrdPrc -> LngLst -> AngPrdPrcLng */
    public static final String AngPrdPrc_FKO_LngLst = "LngLst";
    /** FSysItm064: AngPrdPrc -> PrdCycLst -> AngPrdCyc */
    public static final String AngPrdPrc_FKO_PrdCycLst = "PrdCycLst";
    /** FSysItm063: OrgLvl <- OrgLvl <- AngPrdPrc */
    public static final String AngPrdPrc_FKI_OrgLvl = "OrgLvl";

    /** Traduzioni per AngPrdPrc */
    public static final String AngPrdPrcLng = "AngPrdPrcLng";
    /** FLng000155: AngPrdPrc <- Rec <- AngPrdPrcLng */
    public static final String AngPrdPrcLng_FKI_Rec = "Rec";
    /** FLng000156: AngLng <- Lng <- AngPrdPrcLng */
    public static final String AngPrdPrcLng_FKI_Lng = "Lng";

    /** Varianti */
    public static final String AngPrdVrn = "AngPrdVrn";
    /** FLng000175: AngPrdVrn -> LngLst -> AngPrdVrnLng */
    public static final String AngPrdVrn_FKO_LngLst = "LngLst";
    /** FSysItm128: AngPrdVrn -> ItmVrnLst -> AngItmVrn */
    public static final String AngPrdVrn_FKO_ItmVrnLst = "ItmVrnLst";
    /** FSysItm126: AngPrdVrnCat <- Cat <- AngPrdVrn */
    public static final String AngPrdVrn_FKI_Cat = "Cat";

    /** Categorie varianti */
    public static final String AngPrdVrnCat = "AngPrdVrnCat";
    /** FLng000173: AngPrdVrnCat -> LngLst -> AngPrdVrnCatLng */
    public static final String AngPrdVrnCat_FKO_LngLst = "LngLst";
    /** FSysItm126: AngPrdVrnCat -> VrnLst -> AngPrdVrn */
    public static final String AngPrdVrnCat_FKO_VrnLst = "VrnLst";

    /** Traduzioni per AngPrdVrnCat */
    public static final String AngPrdVrnCatLng = "AngPrdVrnCatLng";
    /** FLng000173: AngPrdVrnCat <- Rec <- AngPrdVrnCatLng */
    public static final String AngPrdVrnCatLng_FKI_Rec = "Rec";
    /** FLng000174: AngLng <- Lng <- AngPrdVrnCatLng */
    public static final String AngPrdVrnCatLng_FKI_Lng = "Lng";

    /** Traduzioni per AngPrdVrn */
    public static final String AngPrdVrnLng = "AngPrdVrnLng";
    /** FLng000175: AngPrdVrn <- Rec <- AngPrdVrnLng */
    public static final String AngPrdVrnLng_FKI_Rec = "Rec";
    /** FLng000176: AngLng <- Lng <- AngPrdVrnLng */
    public static final String AngPrdVrnLng_FKI_Lng = "Lng";

    /** Lavorazioni */
    public static final String AngPrdWrk = "AngPrdWrk";
    /** FLng000153: AngPrdWrk -> LngLst -> AngPrdWrkLng */
    public static final String AngPrdWrk_FKO_LngLst = "LngLst";
    /** FSysItm062: AngPrdWrk -> OprLst -> AngPrdCycOpr */
    public static final String AngPrdWrk_FKO_OprLst = "OprLst";
    /** FSysItm065: AngPrdWrkCat <- PrdWrkCat <- AngPrdWrk */
    public static final String AngPrdWrk_FKI_PrdWrkCat = "PrdWrkCat";
    /** FSysItm066: AngCstCen <- CstCen <- AngPrdWrk */
    public static final String AngPrdWrk_FKI_CstCen = "CstCen";
    /** FSysItm067: AngWrc <- Wrc <- AngPrdWrk */
    public static final String AngPrdWrk_FKI_Wrc = "Wrc";
    /** FSysItm068: AngRes <- Res <- AngPrdWrk */
    public static final String AngPrdWrk_FKI_Res = "Res";
    /** FSysItm069: AngUniMeaTmp <- UniMeaTmp <- AngPrdWrk */
    public static final String AngPrdWrk_FKI_UniMeaTmp = "UniMeaTmp";
    /** FSysItm070: AngUniMea <- ExtPhsUniMea <- AngPrdWrk */
    public static final String AngPrdWrk_FKI_ExtPhsUniMea = "ExtPhsUniMea";
    /** FSysItm117: AngSup <- Sup <- AngPrdWrk */
    public static final String AngPrdWrk_FKI_Sup = "Sup";

    /** Categorie di lavorazione */
    public static final String AngPrdWrkCat = "AngPrdWrkCat";
    /** FLng000157: AngPrdWrkCat -> LngLst -> AngPrdWrkCatLng */
    public static final String AngPrdWrkCat_FKO_LngLst = "LngLst";
    /** FSysItm065: AngPrdWrkCat -> PrdWrkLst -> AngPrdWrk */
    public static final String AngPrdWrkCat_FKO_PrdWrkLst = "PrdWrkLst";

    /** Traduzioni per AngPrdWrkCat */
    public static final String AngPrdWrkCatLng = "AngPrdWrkCatLng";
    /** FLng000157: AngPrdWrkCat <- Rec <- AngPrdWrkCatLng */
    public static final String AngPrdWrkCatLng_FKI_Rec = "Rec";
    /** FLng000158: AngLng <- Lng <- AngPrdWrkCatLng */
    public static final String AngPrdWrkCatLng_FKI_Lng = "Lng";

    /** Traduzioni per AngPrdWrk */
    public static final String AngPrdWrkLng = "AngPrdWrkLng";
    /** FLng000153: AngPrdWrk <- Rec <- AngPrdWrkLng */
    public static final String AngPrdWrkLng_FKI_Rec = "Rec";
    /** FLng000154: AngLng <- Lng <- AngPrdWrkLng */
    public static final String AngPrdWrkLng_FKI_Lng = "Lng";

    /** Anagrafe personalizzazioni */
    public static final String AngPrs = "AngPrs";
    /** FSys002: AngPrs -> ChdPrsLst -> AngPrs */
    public static final String AngPrs_FKO_ChdPrsLst = "ChdPrsLst";
    /** FSys006: AngPrs -> TblLst -> AngDbmTbl */
    public static final String AngPrs_FKO_TblLst = "TblLst";
    /** FSys007: AngPrs -> SeqLst -> AngDbmSeq */
    public static final String AngPrs_FKO_SeqLst = "SeqLst";
    /** FSys009: AngPrs -> ColLst -> AngDbmTblCol */
    public static final String AngPrs_FKO_ColLst = "ColLst";
    /** FSys014: AngPrs -> RfkLst -> AngDbmRfk */
    public static final String AngPrs_FKO_RfkLst = "RfkLst";
    /** FSysWzd003: AngPrs -> WzdLst -> DefWzdRev */
    public static final String AngPrs_FKO_WzdLst = "WzdLst";
    /** FSys001: AngMdl <- MdlRef <- AngPrs */
    public static final String AngPrs_FKI_MdlRef = "MdlRef";
    /** FSys002: AngPrs <- PrtPrs <- AngPrs */
    public static final String AngPrs_FKI_PrtPrs = "PrtPrs";

    /** Query */
    public static final String AngQry = "AngQry";
    /** FDvzRep004: AngQry -> RepLst -> DvzRepQry */
    public static final String AngQry_FKO_RepLst = "RepLst";
    /** FDvzWks004: AngQry -> DvzQryLst -> DvzWksQry */
    public static final String AngQry_FKO_DvzQryLst = "DvzQryLst";
    /** FLng000205: AngQry -> LngLst -> AngQryLng */
    public static final String AngQry_FKO_LngLst = "LngLst";
    /** FSysDoc007: AngQry -> DocCtxLst -> SysDocCtx */
    public static final String AngQry_FKO_DocCtxLst = "DocCtxLst";
    /** FSysDts006: AngQry -> DatSetStpLst -> AngDatSetStp */
    public static final String AngQry_FKO_DatSetStpLst = "DatSetStpLst";
    /** FSysEcm003: AngQry -> EcmClsQryLst -> SysEcmClsQry */
    public static final String AngQry_FKO_EcmClsQryLst = "EcmClsQryLst";
    /** FSysQry003: AngQry -> JoiLst -> AngQryJoi */
    public static final String AngQry_FKO_JoiLst = "JoiLst";
    /** FSysQry004: AngQry -> ResDefLst -> AngQryResDef */
    public static final String AngQry_FKO_ResDefLst = "ResDefLst";
    /** FSysQry006: AngQry -> ColLst -> AngQryDbmTblCol */
    public static final String AngQry_FKO_ColLst = "ColLst";
    /** FSysQry009: AngQry -> SrtLst -> AngQrySrt */
    public static final String AngQry_FKO_SrtLst = "SrtLst";
    /** FSysQry010: AngQry -> LytLst -> AngQryLyt */
    public static final String AngQry_FKO_LytLst = "LytLst";
    /** FSysQry019: AngQry -> ClcLst -> AngQryClcCol */
    public static final String AngQry_FKO_ClcLst = "ClcLst";
    /** FSysQry040: AngQry -> FldLst -> AngQryFld */
    public static final String AngQry_FKO_FldLst = "FldLst";
    /** FSysWks008: AngQry -> WdgLst -> SysWksWdg */
    public static final String AngQry_FKO_WdgLst = "WdgLst";
    /** FSysWks030: AngQry -> SysWksPrmQryLst -> SysWksPrm */
    public static final String AngQry_FKO_SysWksPrmQryLst = "SysWksPrmQryLst";
    /** FSysQry001: AngDbmTbl <- Tbl <- AngQry */
    public static final String AngQry_FKI_Tbl = "Tbl";
    /** FSysQry031: AngScmMdl <- ScmMdl <- AngQry */
    public static final String AngQry_FKI_ScmMdl = "ScmMdl";

    /** Funzioni di aggregazione */
    public static final String AngQryAggFun = "AngQryAggFun";
    /** FDvzWks016: AngQryAggFun -> DvzQryFmtLst -> DvzWksQryFmt */
    public static final String AngQryAggFun_FKO_DvzQryFmtLst = "DvzQryFmtLst";
    /** FDvzWks040: AngQryAggFun -> DvzChrAxyLst -> DvzWksChrAxy */
    public static final String AngQryAggFun_FKO_DvzChrAxyLst = "DvzChrAxyLst";

    /** Query alternative */
    public static final String AngQryAlt = "AngQryAlt";

    /** Colonna calcolata */
    public static final String AngQryClcCol = "AngQryClcCol";
    /** FDvzWks008: AngQryClcCol -> DvzQryPrmLst -> DvzWksQryPrm */
    public static final String AngQryClcCol_FKO_DvzQryPrmLst = "DvzQryPrmLst";
    /** FDvzWks015: AngQryClcCol -> DvzQryFmtLst -> DvzWksQryFmt */
    public static final String AngQryClcCol_FKO_DvzQryFmtLst = "DvzQryFmtLst";
    /** FDvzWks020: AngQryClcCol -> DvzQryDsgStyLst -> DvzWksQryDsgSty */
    public static final String AngQryClcCol_FKO_DvzQryDsgStyLst = "DvzQryDsgStyLst";
    /** FDvzWks023: AngQryClcCol -> DvzQryDsgFltLst -> DvzWksQryDsgFlt */
    public static final String AngQryClcCol_FKO_DvzQryDsgFltLst = "DvzQryDsgFltLst";
    /** FDvzWks025: AngQryClcCol -> DvzQryDsgFltValLst -> DvzWksQryDsgFlt */
    public static final String AngQryClcCol_FKO_DvzQryDsgFltValLst = "DvzQryDsgFltValLst";
    /** FDvzWks032: AngQryClcCol -> DvzChrAxxLst -> DvzWksChrAxx */
    public static final String AngQryClcCol_FKO_DvzChrAxxLst = "DvzChrAxxLst";
    /** FDvzWks034: AngQryClcCol -> DvzChrAxxClrLst -> DvzWksChrAxx */
    public static final String AngQryClcCol_FKO_DvzChrAxxClrLst = "DvzChrAxxClrLst";
    /** FDvzWks036: AngQryClcCol -> DvzChrAxxDscLst -> DvzWksChrAxx */
    public static final String AngQryClcCol_FKO_DvzChrAxxDscLst = "DvzChrAxxDscLst";
    /** FDvzWks039: AngQryClcCol -> DvzChrAxyLst -> DvzWksChrAxy */
    public static final String AngQryClcCol_FKO_DvzChrAxyLst = "DvzChrAxyLst";
    /** FDvzWks044: AngQryClcCol -> DvzGntStrLst -> DvzWksGnt */
    public static final String AngQryClcCol_FKO_DvzGntStrLst = "DvzGntStrLst";
    /** FDvzWks046: AngQryClcCol -> DvzGntEndLst -> DvzWksGnt */
    public static final String AngQryClcCol_FKO_DvzGntEndLst = "DvzGntEndLst";
    /** FDvzWks048: AngQryClcCol -> DvzGntClrLst -> DvzWksGnt */
    public static final String AngQryClcCol_FKO_DvzGntClrLst = "DvzGntClrLst";
    /** FDvzWks050: AngQryClcCol -> DvzGntDayLst -> DvzWksGnt */
    public static final String AngQryClcCol_FKO_DvzGntDayLst = "DvzGntDayLst";
    /** FDvzWks053: AngQryClcCol -> DvzGntColLst -> DvzWksGntCol */
    public static final String AngQryClcCol_FKO_DvzGntColLst = "DvzGntColLst";
    /** FDvzWks056: AngQryClcCol -> DvzGntGrpLst -> DvzWksGntGrp */
    public static final String AngQryClcCol_FKO_DvzGntGrpLst = "DvzGntGrpLst";
    /** FDvzWks058: AngQryClcCol -> DvzGntGrpDscLst -> DvzWksGntGrp */
    public static final String AngQryClcCol_FKO_DvzGntGrpDscLst = "DvzGntGrpDscLst";
    /** FDvzWks062: AngQryClcCol -> DvzGntLayTssLst -> DvzWksGntLay */
    public static final String AngQryClcCol_FKO_DvzGntLayTssLst = "DvzGntLayTssLst";
    /** FDvzWks064: AngQryClcCol -> DvzGntLayDayLst -> DvzWksGntLay */
    public static final String AngQryClcCol_FKO_DvzGntLayDayLst = "DvzGntLayDayLst";
    /** FDvzWks066: AngQryClcCol -> DvzGntLblLftLst -> DvzWksGnt */
    public static final String AngQryClcCol_FKO_DvzGntLblLftLst = "DvzGntLblLftLst";
    /** FDvzWks068: AngQryClcCol -> DvzGntLblMidLst -> DvzWksGnt */
    public static final String AngQryClcCol_FKO_DvzGntLblMidLst = "DvzGntLblMidLst";
    /** FDvzWks070: AngQryClcCol -> DvzGntLblRgtLst -> DvzWksGnt */
    public static final String AngQryClcCol_FKO_DvzGntLblRgtLst = "DvzGntLblRgtLst";
    /** FSysDoc019: AngQryClcCol -> DocClsCtxFltLst -> SysDocClsCtxFlt */
    public static final String AngQryClcCol_FKO_DocClsCtxFltLst = "DocClsCtxFltLst";
    /** FSysQry020: AngQryClcCol -> QryColLst -> AngQryDbmTblCol */
    public static final String AngQryClcCol_FKO_QryColLst = "QryColLst";
    /** FSysQry022: AngQryClcCol -> QryColClrLst -> AngQryDbmTblCol */
    public static final String AngQryClcCol_FKO_QryColClrLst = "QryColClrLst";
    /** FSysQry023: AngQryClcCol -> QryColDscLst -> AngQryDbmTblCol */
    public static final String AngQryClcCol_FKO_QryColDscLst = "QryColDscLst";
    /** FSysQry024: AngQryClcCol -> QryColClrBkdLst -> AngQryDbmTblCol */
    public static final String AngQryClcCol_FKO_QryColClrBkdLst = "QryColClrBkdLst";
    /** FSysQry043: AngQryClcCol -> QryFldLst -> AngQryFld */
    public static final String AngQryClcCol_FKO_QryFldLst = "QryFldLst";
    /** FSysWks027: AngQryClcCol -> SysWksPrmDscClcLst -> SysWksPrm */
    public static final String AngQryClcCol_FKO_SysWksPrmDscClcLst = "SysWksPrmDscClcLst";
    /** FSysWks039: AngQryClcCol -> WksWdgPrmLst -> SysWksWdgPrm */
    public static final String AngQryClcCol_FKO_WksWdgPrmLst = "WksWdgPrmLst";
    /** FSysQry019: AngQry <- Qry <- AngQryClcCol */
    public static final String AngQryClcCol_FKI_Qry = "Qry";

    /** Gruppi autorizzativi su colonna query */
    public static final String AngQryColGrp = "AngQryColGrp";
    /** FSysQry044: AngQryDbmTblCol <- QryCol <- AngQryColGrp */
    public static final String AngQryColGrp_FKI_QryCol = "QryCol";
    /** FSysQry045: AngGrp <- Grp <- AngQryColGrp */
    public static final String AngQryColGrp_FKI_Grp = "Grp";

    /** Colonne query */
    public static final String AngQryDbmTblCol = "AngQryDbmTblCol";
    /** FBecFlt001: AngQryDbmTblCol -> BecFltLst -> AngBecFlt */
    public static final String AngQryDbmTblCol_FKO_BecFltLst = "BecFltLst";
    /** FDvzRep010: AngQryDbmTblCol -> RepQryAggLst -> DvzRepQryAgg */
    public static final String AngQryDbmTblCol_FKO_RepQryAggLst = "RepQryAggLst";
    /** FDvzRep014: AngQryDbmTblCol -> RepStyLst -> DvzRepQryDsgSty */
    public static final String AngQryDbmTblCol_FKO_RepStyLst = "RepStyLst";
    /** FDvzRep027: AngQryDbmTblCol -> RepQryFmtLst -> DvzRepQryFmt */
    public static final String AngQryDbmTblCol_FKO_RepQryFmtLst = "RepQryFmtLst";
    /** FSysEcm005: AngQryDbmTblCol -> EcmClsAttLst -> SysEcmClsAtt */
    public static final String AngQryDbmTblCol_FKO_EcmClsAttLst = "EcmClsAttLst";
    /** FSysQry012: AngQryDbmTblCol -> LytColLst -> AngQryLytCol */
    public static final String AngQryDbmTblCol_FKO_LytColLst = "LytColLst";
    /** FSysQry044: AngQryDbmTblCol -> GrpLst -> AngQryColGrp */
    public static final String AngQryDbmTblCol_FKO_GrpLst = "GrpLst";
    /** FSysQry006: AngQry <- Qry <- AngQryDbmTblCol */
    public static final String AngQryDbmTblCol_FKI_Qry = "Qry";
    /** FSysQry007: AngDbmTblCol <- Col <- AngQryDbmTblCol */
    public static final String AngQryDbmTblCol_FKI_Col = "Col";
    /** FSysQry008: SysTraLbl <- Lbl <- AngQryDbmTblCol */
    public static final String AngQryDbmTblCol_FKI_Lbl = "Lbl";
    /** FSysQry020: AngQryClcCol <- Clc <- AngQryDbmTblCol */
    public static final String AngQryDbmTblCol_FKI_Clc = "Clc";
    /** FSysQry022: AngQryClcCol <- ClrClc <- AngQryDbmTblCol */
    public static final String AngQryDbmTblCol_FKI_ClrClc = "ClrClc";
    /** FSysQry023: AngQryClcCol <- DscClc <- AngQryDbmTblCol */
    public static final String AngQryDbmTblCol_FKI_DscClc = "DscClc";
    /** FSysQry024: AngQryClcCol <- ClrBkdClc <- AngQryDbmTblCol */
    public static final String AngQryDbmTblCol_FKI_ClrBkdClc = "ClrBkdClc";
    /** FSysQry032: AngScmMdlFld <- ScmFld <- AngQryDbmTblCol */
    public static final String AngQryDbmTblCol_FKI_ScmFld = "ScmFld";
    /** FSysQry033: AngScmMdlFld <- ClrFld <- AngQryDbmTblCol */
    public static final String AngQryDbmTblCol_FKI_ClrFld = "ClrFld";
    /** FSysQry034: AngScmMdlFld <- DscFld <- AngQryDbmTblCol */
    public static final String AngQryDbmTblCol_FKI_DscFld = "DscFld";
    /** FSysQry035: AngScmMdlFld <- ClrBkdFld <- AngQryDbmTblCol */
    public static final String AngQryDbmTblCol_FKI_ClrBkdFld = "ClrBkdFld";

    /** Campi query */
    public static final String AngQryFld = "AngQryFld";
    /** FSysDts008: AngQryFld -> DatSetFltLst -> AngDatSetStpQryFlt */
    public static final String AngQryFld_FKO_DatSetFltLst = "DatSetFltLst";
    /** FSysDts011: AngQryFld -> DatSetFltValLst -> AngDatSetStpQryFlt */
    public static final String AngQryFld_FKO_DatSetFltValLst = "DatSetFltValLst";
    /** FSysQry040: AngQry <- Qry <- AngQryFld */
    public static final String AngQryFld_FKI_Qry = "Qry";
    /** FSysQry041: AngDbmTblCol <- DbmCol <- AngQryFld */
    public static final String AngQryFld_FKI_DbmCol = "DbmCol";
    /** FSysQry042: AngScmMdlFld <- ScmFld <- AngQryFld */
    public static final String AngQryFld_FKI_ScmFld = "ScmFld";
    /** FSysQry043: AngQryClcCol <- ClcCol <- AngQryFld */
    public static final String AngQryFld_FKI_ClcCol = "ClcCol";

    /** Filtri di query */
    public static final String AngQryFlt = "AngQryFlt";
    /** FSysQry015: AngQryLyt <- Lyt <- AngQryFlt */
    public static final String AngQryFlt_FKI_Lyt = "Lyt";
    /** FSysQry016: AngDbmTblCol <- FltCol <- AngQryFlt */
    public static final String AngQryFlt_FKI_FltCol = "FltCol";
    /** FSysQry017: AngDbmTblCol <- ValCol <- AngQryFlt */
    public static final String AngQryFlt_FKI_ValCol = "ValCol";
    /** FSysQry037: AngScmMdlFld <- FltFld <- AngQryFlt */
    public static final String AngQryFlt_FKI_FltFld = "FltFld";
    /** FSysQry038: AngScmMdlFld <- ValFld <- AngQryFlt */
    public static final String AngQryFlt_FKI_ValFld = "ValFld";

    /** Query join */
    public static final String AngQryJoi = "AngQryJoi";
    /** FSysQry002: AngDbmRfk <- Rfk <- AngQryJoi */
    public static final String AngQryJoi_FKI_Rfk = "Rfk";
    /** FSysQry003: AngQry <- Qry <- AngQryJoi */
    public static final String AngQryJoi_FKI_Qry = "Qry";

    /** Traduzioni per AngQry */
    public static final String AngQryLng = "AngQryLng";
    /** FLng000205: AngQry <- Rec <- AngQryLng */
    public static final String AngQryLng_FKI_Rec = "Rec";
    /** FLng000206: AngLng <- Lng <- AngQryLng */
    public static final String AngQryLng_FKI_Lng = "Lng";

    /** Layout query */
    public static final String AngQryLyt = "AngQryLyt";
    /** FLng000207: AngQryLyt -> LngLst -> AngQryLytLng */
    public static final String AngQryLyt_FKO_LngLst = "LngLst";
    /** FSysQry011: AngQryLyt -> LytColLst -> AngQryLytCol */
    public static final String AngQryLyt_FKO_LytColLst = "LytColLst";
    /** FSysQry014: AngQryLyt -> ResLst -> AngQryLytResDef */
    public static final String AngQryLyt_FKO_ResLst = "ResLst";
    /** FSysQry015: AngQryLyt -> FltLst -> AngQryFlt */
    public static final String AngQryLyt_FKO_FltLst = "FltLst";
    /** FSysQry018: AngQryLyt -> LytSrtLst -> AngQryLytSrt */
    public static final String AngQryLyt_FKO_LytSrtLst = "LytSrtLst";
    /** FSysQry010: AngQry <- Qry <- AngQryLyt */
    public static final String AngQryLyt_FKI_Qry = "Qry";

    /** Layout di colonna di query */
    public static final String AngQryLytCol = "AngQryLytCol";
    /** FSysQry011: AngQryLyt <- Lyt <- AngQryLytCol */
    public static final String AngQryLytCol_FKI_Lyt = "Lyt";
    /** FSysQry012: AngQryDbmTblCol <- QryCol <- AngQryLytCol */
    public static final String AngQryLytCol_FKI_QryCol = "QryCol";

    /** Traduzioni per AngQryLyt */
    public static final String AngQryLytLng = "AngQryLytLng";
    /** FLng000207: AngQryLyt <- Rec <- AngQryLytLng */
    public static final String AngQryLytLng_FKI_Rec = "Rec";
    /** FLng000208: AngLng <- Lng <- AngQryLytLng */
    public static final String AngQryLytLng_FKI_Lng = "Lng";

    /** Layout di query di default per risorsa */
    public static final String AngQryLytResDef = "AngQryLytResDef";
    /** FSysQry013: AngRes <- Res <- AngQryLytResDef */
    public static final String AngQryLytResDef_FKI_Res = "Res";
    /** FSysQry014: AngQryLyt <- Lyt <- AngQryLytResDef */
    public static final String AngQryLytResDef_FKI_Lyt = "Lyt";

    /** Ordinamento query su layout */
    public static final String AngQryLytSrt = "AngQryLytSrt";
    /** FSysQry018: AngQryLyt <- Lyt <- AngQryLytSrt */
    public static final String AngQryLytSrt_FKI_Lyt = "Lyt";
    /** FSysQry021: AngDbmTblCol <- Col <- AngQryLytSrt */
    public static final String AngQryLytSrt_FKI_Col = "Col";
    /** FSysQry039: AngScmMdlFld <- ScmFld <- AngQryLytSrt */
    public static final String AngQryLytSrt_FKI_ScmFld = "ScmFld";

    /** Query default per risorsa */
    public static final String AngQryResDef = "AngQryResDef";
    /** FSysQry004: AngQry <- Qry <- AngQryResDef */
    public static final String AngQryResDef_FKI_Qry = "Qry";
    /** FSysQry005: AngRes <- Res <- AngQryResDef */
    public static final String AngQryResDef_FKI_Res = "Res";

    /** Query sort */
    public static final String AngQrySrt = "AngQrySrt";
    /** FSysQry009: AngQry <- Qry <- AngQrySrt */
    public static final String AngQrySrt_FKI_Qry = "Qry";
    /** FSysQry036: AngScmMdlFld <- ScmFld <- AngQrySrt */
    public static final String AngQrySrt_FKI_ScmFld = "ScmFld";

    /** Connessione cartelle remote */
    public static final String AngRemFldCon = "AngRemFldCon";

    /** Server remoti */
    public static final String AngRemSrv = "AngRemSrv";
    /** FSysEnv005: AngRemSrv -> LgnRulLst -> AngLgnRul */
    public static final String AngRemSrv_FKO_LgnRulLst = "LgnRulLst";
    /** FSysEnv012: AngRemSrv -> SrvPrpLst -> RemSrvPrp */
    public static final String AngRemSrv_FKO_SrvPrpLst = "SrvPrpLst";
    /** FSysEnv014: AngRemSrv -> OrgLst -> AngRemSrvOrg */
    public static final String AngRemSrv_FKO_OrgLst = "OrgLst";
    /** FSysLst003: AngRemSrv -> LstRemLst -> AngLstRem */
    public static final String AngRemSrv_FKO_LstRemLst = "LstRemLst";
    /** FSysQry026: AngRemSrv -> ScmLst -> AngScm */
    public static final String AngRemSrv_FKO_ScmLst = "ScmLst";
    /** FSysEnv015: AngRemSrvTyp <- SrvTyp <- AngRemSrv */
    public static final String AngRemSrv_FKI_SrvTyp = "SrvTyp";
    /** FSysEnv016: AngSrvSrc <- SrvSrc <- AngRemSrv */
    public static final String AngRemSrv_FKI_SrvSrc = "SrvSrc";

    /** Server per organizzazioni */
    public static final String AngRemSrvOrg = "AngRemSrvOrg";
    /** FSysEnv013: AngOrgCom <- Org <- AngRemSrvOrg */
    public static final String AngRemSrvOrg_FKI_Org = "Org";
    /** FSysEnv014: AngRemSrv <- RemSrv <- AngRemSrvOrg */
    public static final String AngRemSrvOrg_FKI_RemSrv = "RemSrv";

    /** Tipologia server */
    public static final String AngRemSrvTyp = "AngRemSrvTyp";
    /** FSysEnv015: AngRemSrvTyp -> RemSrvLst -> AngRemSrv */
    public static final String AngRemSrvTyp_FKO_RemSrvLst = "RemSrvLst";
    /** FSysEnv017: SysFrmDsg <- FrmDsg <- AngRemSrvTyp */
    public static final String AngRemSrvTyp_FKI_FrmDsg = "FrmDsg";

    /** Motore di generazione report */
    public static final String AngRepGenEng = "AngRepGenEng";
    /** FSysRep007: AngRepGenEng -> RepMdlLst -> RepMdl */
    public static final String AngRepGenEng_FKO_RepMdlLst = "RepMdlLst";

    /** Tipo modello di report */
    public static final String AngRepMdlTyp = "AngRepMdlTyp";
    /** FLng000343: AngRepMdlTyp -> LngLst -> AngRepMdlTypLng */
    public static final String AngRepMdlTyp_FKO_LngLst = "LngLst";

    /** Traduzioni per AngRepMdlTyp */
    public static final String AngRepMdlTypLng = "AngRepMdlTypLng";
    /** FLng000343: AngRepMdlTyp <- Rec <- AngRepMdlTypLng */
    public static final String AngRepMdlTypLng_FKI_Rec = "Rec";
    /** FLng000344: AngLng <- Lng <- AngRepMdlTypLng */
    public static final String AngRepMdlTypLng_FKI_Lng = "Lng";

    /** Risorse */
    public static final String AngRes = "AngRes";
    /** FSysApp012: AngRes -> AppHomLst -> SysAppHom */
    public static final String AngRes_FKO_AppHomLst = "AppHomLst";
    /** FSysCal014: AngRes -> AbsLst -> CalResAbs */
    public static final String AngRes_FKO_AbsLst = "AbsLst";
    /** FSysCal015: AngRes -> AvlLst -> GenCalAvl */
    public static final String AngRes_FKO_AvlLst = "AvlLst";
    /** FSysCal026: AngRes -> EvtManLst -> CalEvt */
    public static final String AngRes_FKO_EvtManLst = "EvtManLst";
    /** FSysCal030: AngRes -> CalEvtInvLst -> CalEvtRes */
    public static final String AngRes_FKO_CalEvtInvLst = "CalEvtInvLst";
    /** FSysCal036: AngRes -> ShfTypResFavLst -> AngCalDayShfTypResFav */
    public static final String AngRes_FKO_ShfTypResFavLst = "ShfTypResFavLst";
    /** FSysCal039: AngRes -> CalEvtResLst -> CalEvtSubRes */
    public static final String AngRes_FKO_CalEvtResLst = "CalEvtResLst";
    /** FSysCal040: AngRes -> CalEvtSubResLst -> CalEvtSubRes */
    public static final String AngRes_FKO_CalEvtSubResLst = "CalEvtSubResLst";
    /** FSysEma003: AngRes -> EmaEleLst -> EmaLstEle */
    public static final String AngRes_FKO_EmaEleLst = "EmaEleLst";
    /** FSysEnv001: AngRes -> SrvSrcLst -> AngSrvSrc */
    public static final String AngRes_FKO_SrvSrcLst = "SrvSrcLst";
    /** FSysEnv004: AngRes -> SrcCodLst -> AngSrcRes */
    public static final String AngRes_FKO_SrcCodLst = "SrcCodLst";
    /** FSysEty006: AngRes -> EtyComLst -> AngEtyCom */
    public static final String AngRes_FKO_EtyComLst = "EtyComLst";
    /** FSysEty008: AngRes -> EtyExtLnkLst -> AngEtyExtLnk */
    public static final String AngRes_FKO_EtyExtLnkLst = "EtyExtLnkLst";
    /** FSysEty010: AngRes -> EtyLikLst -> AngEtyLik */
    public static final String AngRes_FKO_EtyLikLst = "EtyLikLst";
    /** FSysEty012: AngRes -> EtyMenCrtLst -> AngEtyMen */
    public static final String AngRes_FKO_EtyMenCrtLst = "EtyMenCrtLst";
    /** FSysEty013: AngRes -> EtyMenLst -> AngEtyMen */
    public static final String AngRes_FKO_EtyMenLst = "EtyMenLst";
    /** FSysEty018: AngRes -> EtyWtcLst -> AngEtyWtc */
    public static final String AngRes_FKO_EtyWtcLst = "EtyWtcLst";
    /** FSysEty020: AngRes -> EtyLnkLst -> AngEtyLnk */
    public static final String AngRes_FKO_EtyLnkLst = "EtyLnkLst";
    /** FSysEty021: AngRes -> EtyAttLst -> AngEtyAtt */
    public static final String AngRes_FKO_EtyAttLst = "EtyAttLst";
    /** FSysEty024: AngRes -> EtyAttVisLst -> AngEtyAttVis */
    public static final String AngRes_FKO_EtyAttVisLst = "EtyAttVisLst";
    /** FSysEty025: AngRes -> EtyComVisLst -> AngEtyComVis */
    public static final String AngRes_FKO_EtyComVisLst = "EtyComVisLst";
    /** FSysEty030: AngRes -> EtyAttObsLst -> AngEtyAtt */
    public static final String AngRes_FKO_EtyAttObsLst = "EtyAttObsLst";
    /** FSysGrp004: AngRes -> GrpFunResLst -> AngGrpResFun */
    public static final String AngRes_FKO_GrpFunResLst = "GrpFunResLst";
    /** FSysGrp006: AngRes -> GrpResLst -> AngResGrp */
    public static final String AngRes_FKO_GrpResLst = "GrpResLst";
    /** FSysItm068: AngRes -> ResLst -> AngPrdWrk */
    public static final String AngRes_FKO_ResLst = "ResLst";
    /** FSysJst002: AngRes -> JobLst -> JstJob */
    public static final String AngRes_FKO_JobLst = "JobLst";
    /** FSysMnc002: AngRes -> MobAppTknLst -> MobAppTkn */
    public static final String AngRes_FKO_MobAppTknLst = "MobAppTknLst";
    /** FSysMnc005: AngRes -> NotMncLst -> MncNot */
    public static final String AngRes_FKO_NotMncLst = "NotMncLst";
    /** FSysMnc008: AngRes -> BotLst -> AngMobBot */
    public static final String AngRes_FKO_BotLst = "BotLst";
    /** FSysMnc011: AngRes -> CntLst -> ResCnt */
    public static final String AngRes_FKO_CntLst = "CntLst";
    /** FSysMnc014: AngRes -> NotTypLst -> AngResNotTyp */
    public static final String AngRes_FKO_NotTypLst = "NotTypLst";
    /** FSysMnc020: AngRes -> NotMncTknPshLst -> MncNotPshTkn */
    public static final String AngRes_FKO_NotMncTknPshLst = "NotMncTknPshLst";
    /** FSysOpt001: AngRes -> OptLst -> AngResOpt */
    public static final String AngRes_FKO_OptLst = "OptLst";
    /** FSysOrg005: AngRes -> LvlLst -> OrgLvlRes */
    public static final String AngRes_FKO_LvlLst = "LvlLst";
    /** FSysOrg007: AngRes -> ManLvlLst -> OrgLvlManRes */
    public static final String AngRes_FKO_ManLvlLst = "ManLvlLst";
    /** FSysOrg013: AngRes -> GenManLvlLst -> GenOrgLvlMan */
    public static final String AngRes_FKO_GenManLvlLst = "GenManLvlLst";
    /** FSysOrg015: AngRes -> GenResLvlLst -> GenOrgLvlRes */
    public static final String AngRes_FKO_GenResLvlLst = "GenResLvlLst";
    /** FSysOrg059: AngRes -> CstWrkCenResLst -> CstWrkCen */
    public static final String AngRes_FKO_CstWrkCenResLst = "CstWrkCenResLst";
    /** FSysOrg061: AngRes -> LvlRepLst -> OrgLvl */
    public static final String AngRes_FKO_LvlRepLst = "LvlRepLst";
    /** FSysQry005: AngRes -> QryDefLst -> AngQryResDef */
    public static final String AngRes_FKO_QryDefLst = "QryDefLst";
    /** FSysQry013: AngRes -> QryLytDefLst -> AngQryLytResDef */
    public static final String AngRes_FKO_QryLytDefLst = "QryLytDefLst";
    /** FSysRes003: AngRes -> CodLst -> AngResCod */
    public static final String AngRes_FKO_CodLst = "CodLst";
    /** FSysRes008: AngRes -> RolLst -> AngResRol */
    public static final String AngRes_FKO_RolLst = "RolLst";
    /** FSysRes010: AngRes -> ResPswLst -> ResPswLog */
    public static final String AngRes_FKO_ResPswLst = "ResPswLst";
    /** FSysRes011: AngRes -> ResSubLst -> AngResSub */
    public static final String AngRes_FKO_ResSubLst = "ResSubLst";
    /** FSysRes012: AngRes -> OwnSubLst -> AngResSub */
    public static final String AngRes_FKO_OwnSubLst = "OwnSubLst";
    /** FSysRes013: AngRes -> EmlLst -> AngResEml */
    public static final String AngRes_FKO_EmlLst = "EmlLst";
    /** FSysTst001: AngRes -> TstRunLst -> TstRun */
    public static final String AngRes_FKO_TstRunLst = "TstRunLst";
    /** FSysUif004: AngRes -> MnuFavLst -> SysMnuResFav */
    public static final String AngRes_FKO_MnuFavLst = "MnuFavLst";
    /** FSysWks003: AngRes -> SysWksTabLst -> SysWksTab */
    public static final String AngRes_FKO_SysWksTabLst = "SysWksTabLst";
    /** FSysWks020: AngRes -> WdgCfgLst -> SysWksWdgCfg */
    public static final String AngRes_FKO_WdgCfgLst = "WdgCfgLst";
    /** FSysWks053: AngRes -> WksLytLst -> SysWksLyt */
    public static final String AngRes_FKO_WksLytLst = "WksLytLst";
    /** FMulOrg001: AngOrgCom <- OrgCom <- AngRes */
    public static final String AngRes_FKI_OrgCom = "OrgCom";
    /** FSysCal022: AngCal <- Cal <- AngRes */
    public static final String AngRes_FKI_Cal = "Cal";
    /** FSysOrg057: AngWrc <- Wrc <- AngRes */
    public static final String AngRes_FKI_Wrc = "Wrc";
    /** FSysRes002: AngResTyp <- Typ <- AngRes */
    public static final String AngRes_FKI_Typ = "Typ";
    /** FSysRes004: AngLng <- FavLng <- AngRes */
    public static final String AngRes_FKI_FavLng = "FavLng";
    /** FSysRes007: AngBdg <- Bdg <- AngRes */
    public static final String AngRes_FKI_Bdg = "Bdg";
    /** FSysRes009: AngTimZon <- TimZon <- AngRes */
    public static final String AngRes_FKI_TimZon = "TimZon";

    /** Range ip autenticazione a due fattori */
    public static final String AngRes2faIppRng = "AngRes2faIppRng";

    /** Codici risorse */
    public static final String AngResCod = "AngResCod";
    /** FSysRes003: AngRes <- Res <- AngResCod */
    public static final String AngResCod_FKI_Res = "Res";

    /** Indirizzi e-mail aggiuntivi */
    public static final String AngResEml = "AngResEml";
    /** FSysRes013: AngRes <- Res <- AngResEml */
    public static final String AngResEml_FKI_Res = "Res";

    /** Associazione risorse gruppi */
    public static final String AngResGrp = "AngResGrp";
    /** FSysGrp005: AngGrp <- Grp <- AngResGrp */
    public static final String AngResGrp_FKI_Grp = "Grp";
    /** FSysGrp006: AngRes <- Res <- AngResGrp */
    public static final String AngResGrp_FKI_Res = "Res";

    /** Macro tipi risorse */
    public static final String AngResMacTyp = "AngResMacTyp";
    /** FLng000047: AngResMacTyp -> LngLst -> AngResMacTypLng */
    public static final String AngResMacTyp_FKO_LngLst = "LngLst";
    /** FSysRes001: AngResMacTyp -> TypLst -> AngResTyp */
    public static final String AngResMacTyp_FKO_TypLst = "TypLst";
    /** FSysRes005: AngResMacTyp -> BdgTypLst -> AngBdgTyp */
    public static final String AngResMacTyp_FKO_BdgTypLst = "BdgTypLst";

    /** Traduzioni per AngResMacTyp */
    public static final String AngResMacTypLng = "AngResMacTypLng";
    /** FLng000047: AngResMacTyp <- Rec <- AngResMacTypLng */
    public static final String AngResMacTypLng_FKI_Rec = "Rec";
    /** FLng000048: AngLng <- Lng <- AngResMacTypLng */
    public static final String AngResMacTypLng_FKI_Lng = "Lng";

    /** Tipo notifica per risorsa */
    public static final String AngResNotTyp = "AngResNotTyp";
    /** FSysMnc014: AngRes <- Res <- AngResNotTyp */
    public static final String AngResNotTyp_FKI_Res = "Res";
    /** FSysMnc015: AngNotTyp <- NotTyp <- AngResNotTyp */
    public static final String AngResNotTyp_FKI_NotTyp = "NotTyp";

    /** Opzioni risorsa */
    public static final String AngResOpt = "AngResOpt";
    /** FSysOpt001: AngRes <- Res <- AngResOpt */
    public static final String AngResOpt_FKI_Res = "Res";

    /** Ruoli risorse */
    public static final String AngResRol = "AngResRol";
    /** FSysApp010: SysApp <- App <- AngResRol */
    public static final String AngResRol_FKI_App = "App";
    /** FSysOrg018: AngRol <- Rol <- AngResRol */
    public static final String AngResRol_FKI_Rol = "Rol";
    /** FSysRes008: AngRes <- Res <- AngResRol */
    public static final String AngResRol_FKI_Res = "Res";

    /** Sostituti risorsa */
    public static final String AngResSub = "AngResSub";
    /** FSysRes011: AngRes <- Res <- AngResSub */
    public static final String AngResSub_FKI_Res = "Res";
    /** FSysRes012: AngRes <- Sub <- AngResSub */
    public static final String AngResSub_FKI_Sub = "Sub";

    /** Tipi risorse */
    public static final String AngResTyp = "AngResTyp";
    /** FLng000049: AngResTyp -> LngLst -> AngResTypLng */
    public static final String AngResTyp_FKO_LngLst = "LngLst";
    /** FSysRes002: AngResTyp -> ResLst -> AngRes */
    public static final String AngResTyp_FKO_ResLst = "ResLst";
    /** FSysRes001: AngResMacTyp <- MacTyp <- AngResTyp */
    public static final String AngResTyp_FKI_MacTyp = "MacTyp";

    /** Traduzioni per AngResTyp */
    public static final String AngResTypLng = "AngResTypLng";
    /** FLng000049: AngResTyp <- Rec <- AngResTypLng */
    public static final String AngResTypLng_FKI_Rec = "Rec";
    /** FLng000050: AngLng <- Lng <- AngResTypLng */
    public static final String AngResTypLng_FKI_Lng = "Lng";

    /** Ruoli */
    public static final String AngRol = "AngRol";
    /** FLng000065: AngRol -> LngLst -> AngRolLng */
    public static final String AngRol_FKO_LngLst = "LngLst";
    /** FSysApp014: AngRol -> AppHomLst -> SysAppHom */
    public static final String AngRol_FKO_AppHomLst = "AppHomLst";
    /** FSysOrg017: AngRol -> RolRefLst -> AngRol */
    public static final String AngRol_FKO_RolRefLst = "RolRefLst";
    /** FSysOrg018: AngRol -> ResLst -> AngResRol */
    public static final String AngRol_FKO_ResLst = "ResLst";
    /** FSysOrg020: AngRol -> TblCudLst -> SysRolCud */
    public static final String AngRol_FKO_TblCudLst = "TblCudLst";
    /** FSysOrg022: AngRol -> SysReaRulRolLst -> SysReaRulRol */
    public static final String AngRol_FKO_SysReaRulRolLst = "SysReaRulRolLst";
    /** FSysUif012: AngRol -> FldRolLst -> SysFrmDsgFldRol */
    public static final String AngRol_FKO_FldRolLst = "FldRolLst";
    /** FSysOrg017: AngRol <- Rol <- AngRol */
    public static final String AngRol_FKI_Rol = "Rol";

    /** Traduzioni per AngRol */
    public static final String AngRolLng = "AngRolLng";
    /** FLng000065: AngRol <- Rec <- AngRolLng */
    public static final String AngRolLng_FKI_Rec = "Rec";
    /** FLng000066: AngLng <- Lng <- AngRolLng */
    public static final String AngRolLng_FKI_Lng = "Lng";

    /** Livelli di rischio */
    public static final String AngRskLvl = "AngRskLvl";
    /** FLng000033: AngRskLvl -> LngLst -> AngRskLvlLng */
    public static final String AngRskLvl_FKO_LngLst = "LngLst";
    /** FSysRsk001: AngRskLvlCat <- Cat <- AngRskLvl */
    public static final String AngRskLvl_FKI_Cat = "Cat";

    /** Categorie livelli di rischio */
    public static final String AngRskLvlCat = "AngRskLvlCat";
    /** FLng000035: AngRskLvlCat -> LngLst -> AngRskLvlCatLng */
    public static final String AngRskLvlCat_FKO_LngLst = "LngLst";
    /** FSysRsk001: AngRskLvlCat -> RskLvlLst -> AngRskLvl */
    public static final String AngRskLvlCat_FKO_RskLvlLst = "RskLvlLst";

    /** Traduzioni per AngRskLvlCat */
    public static final String AngRskLvlCatLng = "AngRskLvlCatLng";
    /** FLng000035: AngRskLvlCat <- Rec <- AngRskLvlCatLng */
    public static final String AngRskLvlCatLng_FKI_Rec = "Rec";
    /** FLng000036: AngLng <- Lng <- AngRskLvlCatLng */
    public static final String AngRskLvlCatLng_FKI_Lng = "Lng";

    /** Traduzioni per AngRskLvl */
    public static final String AngRskLvlLng = "AngRskLvlLng";
    /** FLng000033: AngRskLvl <- Rec <- AngRskLvlLng */
    public static final String AngRskLvlLng_FKI_Rec = "Rec";
    /** FLng000034: AngLng <- Lng <- AngRskLvlLng */
    public static final String AngRskLvlLng_FKI_Lng = "Lng";

    /** Forma di saluto */
    public static final String AngSal = "AngSal";
    /** FLng000053: AngSal -> LngLst -> AngSalLng */
    public static final String AngSal_FKO_LngLst = "LngLst";

    /** Traduzioni per AngSal */
    public static final String AngSalLng = "AngSalLng";
    /** FLng000053: AngSal <- Rec <- AngSalLng */
    public static final String AngSalLng_FKI_Rec = "Rec";
    /** FLng000054: AngLng <- Lng <- AngSalLng */
    public static final String AngSalLng_FKI_Lng = "Lng";

    /** Schema dati */
    public static final String AngScm = "AngScm";
    /** FLng000211: AngScm -> LngLst -> AngScmLng */
    public static final String AngScm_FKO_LngLst = "LngLst";
    /** FSysQry027: AngScm -> TypLst -> AngScmMdl */
    public static final String AngScm_FKO_TypLst = "TypLst";
    /** FSysQry025: AngScmSrcTyp <- SrcTyp <- AngScm */
    public static final String AngScm_FKI_SrcTyp = "SrcTyp";
    /** FSysQry026: AngRemSrv <- RemSrv <- AngScm */
    public static final String AngScm_FKI_RemSrv = "RemSrv";

    /** Traduzioni per AngScm */
    public static final String AngScmLng = "AngScmLng";
    /** FLng000211: AngScm <- Rec <- AngScmLng */
    public static final String AngScmLng_FKI_Rec = "Rec";
    /** FLng000212: AngLng <- Lng <- AngScmLng */
    public static final String AngScmLng_FKI_Lng = "Lng";

    /** Modello schema dati */
    public static final String AngScmMdl = "AngScmMdl";
    /** FSysQry028: AngScmMdl -> FldLst -> AngScmMdlFld */
    public static final String AngScmMdl_FKO_FldLst = "FldLst";
    /** FSysQry031: AngScmMdl -> QryLst -> AngQry */
    public static final String AngScmMdl_FKO_QryLst = "QryLst";
    /** FSysQry027: AngScm <- Scm <- AngScmMdl */
    public static final String AngScmMdl_FKI_Scm = "Scm";

    /** Campo modello schema */
    public static final String AngScmMdlFld = "AngScmMdlFld";
    /** FDvzWks071: AngScmMdlFld -> DvzQryPrmLst -> DvzWksQryPrm */
    public static final String AngScmMdlFld_FKO_DvzQryPrmLst = "DvzQryPrmLst";
    /** FDvzWks072: AngScmMdlFld -> DvzQryFltLst -> DvzWksQryFlt */
    public static final String AngScmMdlFld_FKO_DvzQryFltLst = "DvzQryFltLst";
    /** FDvzWks073: AngScmMdlFld -> DvzQryFltValLst -> DvzWksQryFlt */
    public static final String AngScmMdlFld_FKO_DvzQryFltValLst = "DvzQryFltValLst";
    /** FDvzWks074: AngScmMdlFld -> DvzQryFmtLst -> DvzWksQryFmt */
    public static final String AngScmMdlFld_FKO_DvzQryFmtLst = "DvzQryFmtLst";
    /** FDvzWks075: AngScmMdlFld -> DvzQryDsgStyLst -> DvzWksQryDsgSty */
    public static final String AngScmMdlFld_FKO_DvzQryDsgStyLst = "DvzQryDsgStyLst";
    /** FDvzWks076: AngScmMdlFld -> DvzQryDsgFltLst -> DvzWksQryDsgFlt */
    public static final String AngScmMdlFld_FKO_DvzQryDsgFltLst = "DvzQryDsgFltLst";
    /** FDvzWks077: AngScmMdlFld -> DvzQryDsgFltValLst -> DvzWksQryDsgFlt */
    public static final String AngScmMdlFld_FKO_DvzQryDsgFltValLst = "DvzQryDsgFltValLst";
    /** FDvzWks078: AngScmMdlFld -> DvzChrAxxLst -> DvzWksChrAxx */
    public static final String AngScmMdlFld_FKO_DvzChrAxxLst = "DvzChrAxxLst";
    /** FDvzWks079: AngScmMdlFld -> DvzChrAxxClrLst -> DvzWksChrAxx */
    public static final String AngScmMdlFld_FKO_DvzChrAxxClrLst = "DvzChrAxxClrLst";
    /** FDvzWks080: AngScmMdlFld -> DvzChrAxxDscLst -> DvzWksChrAxx */
    public static final String AngScmMdlFld_FKO_DvzChrAxxDscLst = "DvzChrAxxDscLst";
    /** FDvzWks081: AngScmMdlFld -> DvzChrAxyLst -> DvzWksChrAxy */
    public static final String AngScmMdlFld_FKO_DvzChrAxyLst = "DvzChrAxyLst";
    /** FDvzWks082: AngScmMdlFld -> DvzGntStrLst -> DvzWksGnt */
    public static final String AngScmMdlFld_FKO_DvzGntStrLst = "DvzGntStrLst";
    /** FDvzWks083: AngScmMdlFld -> DvzGntEndLst -> DvzWksGnt */
    public static final String AngScmMdlFld_FKO_DvzGntEndLst = "DvzGntEndLst";
    /** FDvzWks084: AngScmMdlFld -> DvzGntClrLst -> DvzWksGnt */
    public static final String AngScmMdlFld_FKO_DvzGntClrLst = "DvzGntClrLst";
    /** FDvzWks085: AngScmMdlFld -> DvzGntDayLst -> DvzWksGnt */
    public static final String AngScmMdlFld_FKO_DvzGntDayLst = "DvzGntDayLst";
    /** FDvzWks086: AngScmMdlFld -> DvzGntColLst -> DvzWksGntCol */
    public static final String AngScmMdlFld_FKO_DvzGntColLst = "DvzGntColLst";
    /** FDvzWks087: AngScmMdlFld -> DvzGntGrpLst -> DvzWksGntGrp */
    public static final String AngScmMdlFld_FKO_DvzGntGrpLst = "DvzGntGrpLst";
    /** FDvzWks088: AngScmMdlFld -> DvzGntGrpDscLst -> DvzWksGntGrp */
    public static final String AngScmMdlFld_FKO_DvzGntGrpDscLst = "DvzGntGrpDscLst";
    /** FDvzWks089: AngScmMdlFld -> DvzGntLayTssLst -> DvzWksGntLay */
    public static final String AngScmMdlFld_FKO_DvzGntLayTssLst = "DvzGntLayTssLst";
    /** FDvzWks090: AngScmMdlFld -> DvzGntLayDayLst -> DvzWksGntLay */
    public static final String AngScmMdlFld_FKO_DvzGntLayDayLst = "DvzGntLayDayLst";
    /** FDvzWks091: AngScmMdlFld -> DvzGntLblLftLst -> DvzWksGnt */
    public static final String AngScmMdlFld_FKO_DvzGntLblLftLst = "DvzGntLblLftLst";
    /** FDvzWks092: AngScmMdlFld -> DvzGntLblMidLst -> DvzWksGnt */
    public static final String AngScmMdlFld_FKO_DvzGntLblMidLst = "DvzGntLblMidLst";
    /** FDvzWks093: AngScmMdlFld -> DvzGntLblRgtLst -> DvzWksGnt */
    public static final String AngScmMdlFld_FKO_DvzGntLblRgtLst = "DvzGntLblRgtLst";
    /** FSysDoc018: AngScmMdlFld -> DocClsCtxFltLst -> SysDocClsCtxFlt */
    public static final String AngScmMdlFld_FKO_DocClsCtxFltLst = "DocClsCtxFltLst";
    /** FSysQry029: AngScmMdlFld -> ChdFldLst -> AngScmMdlFld */
    public static final String AngScmMdlFld_FKO_ChdFldLst = "ChdFldLst";
    /** FSysQry032: AngScmMdlFld -> QryColLst -> AngQryDbmTblCol */
    public static final String AngScmMdlFld_FKO_QryColLst = "QryColLst";
    /** FSysQry033: AngScmMdlFld -> QryColClrLst -> AngQryDbmTblCol */
    public static final String AngScmMdlFld_FKO_QryColClrLst = "QryColClrLst";
    /** FSysQry034: AngScmMdlFld -> QryColDscLst -> AngQryDbmTblCol */
    public static final String AngScmMdlFld_FKO_QryColDscLst = "QryColDscLst";
    /** FSysQry035: AngScmMdlFld -> QryColClrBkdLst -> AngQryDbmTblCol */
    public static final String AngScmMdlFld_FKO_QryColClrBkdLst = "QryColClrBkdLst";
    /** FSysQry036: AngScmMdlFld -> QrySrtLst -> AngQrySrt */
    public static final String AngScmMdlFld_FKO_QrySrtLst = "QrySrtLst";
    /** FSysQry037: AngScmMdlFld -> FltLst -> AngQryFlt */
    public static final String AngScmMdlFld_FKO_FltLst = "FltLst";
    /** FSysQry038: AngScmMdlFld -> FltValLst -> AngQryFlt */
    public static final String AngScmMdlFld_FKO_FltValLst = "FltValLst";
    /** FSysQry039: AngScmMdlFld -> QryLytSrtLst -> AngQryLytSrt */
    public static final String AngScmMdlFld_FKO_QryLytSrtLst = "QryLytSrtLst";
    /** FSysQry042: AngScmMdlFld -> QryFldLst -> AngQryFld */
    public static final String AngScmMdlFld_FKO_QryFldLst = "QryFldLst";
    /** FSysWks031: AngScmMdlFld -> SysWksPrmUidFldLst -> SysWksPrm */
    public static final String AngScmMdlFld_FKO_SysWksPrmUidFldLst = "SysWksPrmUidFldLst";
    /** FSysWks032: AngScmMdlFld -> SysWksPrmCodFldLst -> SysWksPrm */
    public static final String AngScmMdlFld_FKO_SysWksPrmCodFldLst = "SysWksPrmCodFldLst";
    /** FSysWks033: AngScmMdlFld -> SysWksPrmDscFldLst -> SysWksPrm */
    public static final String AngScmMdlFld_FKO_SysWksPrmDscFldLst = "SysWksPrmDscFldLst";
    /** FSysWks044: AngScmMdlFld -> WksWdgFltLst -> SysWksWdgFlt */
    public static final String AngScmMdlFld_FKO_WksWdgFltLst = "WksWdgFltLst";
    /** FSysWks045: AngScmMdlFld -> WksWdgFltValLst -> SysWksWdgFlt */
    public static final String AngScmMdlFld_FKO_WksWdgFltValLst = "WksWdgFltValLst";
    /** FSysWks046: AngScmMdlFld -> WksWdgPrmLst -> SysWksWdgPrm */
    public static final String AngScmMdlFld_FKO_WksWdgPrmLst = "WksWdgPrmLst";
    /** FSysQry028: AngScmMdl <- ScmMdl <- AngScmMdlFld */
    public static final String AngScmMdlFld_FKI_ScmMdl = "ScmMdl";
    /** FSysQry029: AngScmMdlFld <- RefFld <- AngScmMdlFld */
    public static final String AngScmMdlFld_FKI_RefFld = "RefFld";
    /** FSysQry030: SysTraLbl <- Lbl <- AngScmMdlFld */
    public static final String AngScmMdlFld_FKI_Lbl = "Lbl";

    /** Tipo sorgente schema dati */
    public static final String AngScmSrcTyp = "AngScmSrcTyp";
    /** FLng000209: AngScmSrcTyp -> LngLst -> AngScmSrcTypLng */
    public static final String AngScmSrcTyp_FKO_LngLst = "LngLst";
    /** FSysQry025: AngScmSrcTyp -> ScmLst -> AngScm */
    public static final String AngScmSrcTyp_FKO_ScmLst = "ScmLst";

    /** Traduzioni per AngScmSrcTyp */
    public static final String AngScmSrcTypLng = "AngScmSrcTypLng";
    /** FLng000209: AngScmSrcTyp <- Rec <- AngScmSrcTypLng */
    public static final String AngScmSrcTypLng_FKI_Rec = "Rec";
    /** FLng000210: AngLng <- Lng <- AngScmSrcTypLng */
    public static final String AngScmSrcTypLng_FKI_Lng = "Lng";

    /** Modalità di spedizione */
    public static final String AngShpMet = "AngShpMet";
    /** FLng000017: AngShpMet -> LngLst -> AngShpMetLng */
    public static final String AngShpMet_FKO_LngLst = "LngLst";
    /** FSysOrg025: AngShpMet -> RecRulLst -> SysReaRulRol */
    public static final String AngShpMet_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngShpMet */
    public static final String AngShpMetLng = "AngShpMetLng";
    /** FLng000017: AngShpMet <- Rec <- AngShpMetLng */
    public static final String AngShpMetLng_FKI_Rec = "Rec";
    /** FLng000018: AngLng <- Lng <- AngShpMetLng */
    public static final String AngShpMetLng_FKI_Lng = "Lng";

    /** Proprieta origine */
    public static final String AngSrcPrp = "AngSrcPrp";
    /** FLng000187: AngSrcPrp -> LngLst -> AngSrcPrpLng */
    public static final String AngSrcPrp_FKO_LngLst = "LngLst";
    /** FSysEnv007: AngSrcPrp -> ValLst -> AngSrcPrpVal */
    public static final String AngSrcPrp_FKO_ValLst = "ValLst";
    /** FSysEnv011: AngSrcPrp -> LgnRulLst -> AngLgnRul */
    public static final String AngSrcPrp_FKO_LgnRulLst = "LgnRulLst";
    /** FSysEnv006: AngDbmTbl <- Tbl <- AngSrcPrp */
    public static final String AngSrcPrp_FKI_Tbl = "Tbl";

    /** Traduzioni per AngSrcPrp */
    public static final String AngSrcPrpLng = "AngSrcPrpLng";
    /** FLng000187: AngSrcPrp <- Rec <- AngSrcPrpLng */
    public static final String AngSrcPrpLng_FKI_Rec = "Rec";
    /** FLng000188: AngLng <- Lng <- AngSrcPrpLng */
    public static final String AngSrcPrpLng_FKI_Lng = "Lng";

    /** Valori proprieta sorgente */
    public static final String AngSrcPrpVal = "AngSrcPrpVal";
    /** FSysEnv007: AngSrcPrp <- Prp <- AngSrcPrpVal */
    public static final String AngSrcPrpVal_FKI_Prp = "Prp";
    /** FSysEnv008: AngSrvSrc <- Src <- AngSrcPrpVal */
    public static final String AngSrcPrpVal_FKI_Src = "Src";

    /** Codici risorse da servizi */
    public static final String AngSrcRes = "AngSrcRes";
    /** FSysEnv003: AngSrvSrc <- Src <- AngSrcRes */
    public static final String AngSrcRes_FKI_Src = "Src";
    /** FSysEnv004: AngRes <- Res <- AngSrcRes */
    public static final String AngSrcRes_FKI_Res = "Res";

    /** Origini servizi */
    public static final String AngSrvSrc = "AngSrvSrc";
    /** FSysCal021: AngSrvSrc -> AbsLst -> CalResAbs */
    public static final String AngSrvSrc_FKO_AbsLst = "AbsLst";
    /** FSysCal025: AngSrvSrc -> EvtLst -> CalEvt */
    public static final String AngSrvSrc_FKO_EvtLst = "EvtLst";
    /** FSysEnv003: AngSrvSrc -> ResCodLst -> AngSrcRes */
    public static final String AngSrvSrc_FKO_ResCodLst = "ResCodLst";
    /** FSysEnv008: AngSrvSrc -> PrpValLst -> AngSrcPrpVal */
    public static final String AngSrvSrc_FKO_PrpValLst = "PrpValLst";
    /** FSysEnv010: AngSrvSrc -> LgnRulLst -> AngLgnRul */
    public static final String AngSrvSrc_FKO_LgnRulLst = "LgnRulLst";
    /** FSysEnv016: AngSrvSrc -> RemSrvLst -> AngRemSrv */
    public static final String AngSrvSrc_FKO_RemSrvLst = "RemSrvLst";
    /** FSysEnv001: AngRes <- SrvRes <- AngSrvSrc */
    public static final String AngSrvSrc_FKI_SrvRes = "SrvRes";
    /** FSysEnv002: AngLng <- SrvLng <- AngSrvSrc */
    public static final String AngSrvSrc_FKI_SrvLng = "SrvLng";

    /** Sottocommesse */
    public static final String AngSubJob = "AngSubJob";
    /** FSysJob001: AngJob <- Job <- AngSubJob */
    public static final String AngSubJob_FKI_Job = "Job";

    /** Fornitori */
    public static final String AngSup = "AngSup";
    /** FSysItm007: AngSup -> SupItmLst -> AngItm */
    public static final String AngSup_FKO_SupItmLst = "SupItmLst";
    /** FSysItm117: AngSup -> SupPrdLst -> AngPrdWrk */
    public static final String AngSup_FKO_SupPrdLst = "SupPrdLst";
    /** FSysBas004: AngLng <- SupLng <- AngSup */
    public static final String AngSup_FKI_SupLng = "SupLng";

    /** Azione */
    public static final String AngSysAct = "AngSysAct";
    /** FLng000037: AngSysAct -> LngLst -> AngSysActLng */
    public static final String AngSysAct_FKO_LngLst = "LngLst";
    /** FSysAct002: AngSysAct -> GrpDetLst -> SysActGrpDet */
    public static final String AngSysAct_FKO_GrpDetLst = "GrpDetLst";

    /** Traduzioni per AngSysAct */
    public static final String AngSysActLng = "AngSysActLng";
    /** FLng000037: AngSysAct <- Rec <- AngSysActLng */
    public static final String AngSysActLng_FKI_Rec = "Rec";
    /** FLng000038: AngLng <- Lng <- AngSysActLng */
    public static final String AngSysActLng_FKI_Lng = "Lng";

    /** Anagrafica azione */
    public static final String AngSysWksAct = "AngSysWksAct";
    /** FLng000325: AngSysWksAct -> LngLst -> AngSysWksActLng */
    public static final String AngSysWksAct_FKO_LngLst = "LngLst";
    /** FSysWks015: AngSysWksAct -> BtnActLst -> SysWksBtnAct */
    public static final String AngSysWksAct_FKO_BtnActLst = "BtnActLst";
    /** FSysWks021: SysWksTyp <- WksTyp <- AngSysWksAct */
    public static final String AngSysWksAct_FKI_WksTyp = "WksTyp";

    /** Traduzioni per AngSysWksAct */
    public static final String AngSysWksActLng = "AngSysWksActLng";
    /** FLng000325: AngSysWksAct <- Rec <- AngSysWksActLng */
    public static final String AngSysWksActLng_FKI_Rec = "Rec";
    /** FLng000326: AngLng <- Lng <- AngSysWksActLng */
    public static final String AngSysWksActLng_FKI_Lng = "Lng";

    /** Anagrafica configurazione */
    public static final String AngSysWksWdgCfg = "AngSysWksWdgCfg";
    /** FLng000329: AngSysWksWdgCfg -> LngLst -> AngSysWksWdgCfgLng */
    public static final String AngSysWksWdgCfg_FKO_LngLst = "LngLst";
    /** FSysWks019: AngSysWksWdgCfg -> WdgCfgLst -> SysWksWdgCfg */
    public static final String AngSysWksWdgCfg_FKO_WdgCfgLst = "WdgCfgLst";
    /** FSysWks017: SysWksWdgTyp <- WdgTyp <- AngSysWksWdgCfg */
    public static final String AngSysWksWdgCfg_FKI_WdgTyp = "WdgTyp";

    /** Traduzioni per AngSysWksWdgCfg */
    public static final String AngSysWksWdgCfgLng = "AngSysWksWdgCfgLng";
    /** FLng000329: AngSysWksWdgCfg <- Rec <- AngSysWksWdgCfgLng */
    public static final String AngSysWksWdgCfgLng_FKI_Rec = "Rec";
    /** FLng000330: AngLng <- Lng <- AngSysWksWdgCfgLng */
    public static final String AngSysWksWdgCfgLng_FKI_Lng = "Lng";

    /** Tabella temi */
    public static final String AngThm = "AngThm";
    /** FLng000223: AngThm -> LngLst -> AngThmLng */
    public static final String AngThm_FKO_LngLst = "LngLst";
    /** FSysApp011: AngThm -> AppLst -> SysApp */
    public static final String AngThm_FKO_AppLst = "AppLst";

    /** Traduzioni per AngThm */
    public static final String AngThmLng = "AngThmLng";
    /** FLng000223: AngThm <- Rec <- AngThmLng */
    public static final String AngThmLng_FKI_Rec = "Rec";
    /** FLng000224: AngLng <- Lng <- AngThmLng */
    public static final String AngThmLng_FKI_Lng = "Lng";

    /** Timezone */
    public static final String AngTimZon = "AngTimZon";
    /** FSysBas005: AngTimZon -> TimZonLst -> AngTimZon */
    public static final String AngTimZon_FKO_TimZonLst = "TimZonLst";
    /** FSysCal038: AngTimZon -> CalEvtLst -> CalEvt */
    public static final String AngTimZon_FKO_CalEvtLst = "CalEvtLst";
    /** FSysCal041: AngTimZon -> CalEvtEndLst -> CalEvt */
    public static final String AngTimZon_FKO_CalEvtEndLst = "CalEvtEndLst";
    /** FSysRes009: AngTimZon -> ResLst -> AngRes */
    public static final String AngTimZon_FKO_ResLst = "ResLst";
    /** FSysBas005: AngTimZon <- RefTimZon <- AngTimZon */
    public static final String AngTimZon_FKI_RefTimZon = "RefTimZon";

    /** Modalità di trasporto */
    public static final String AngTrpMet = "AngTrpMet";
    /** FLng000019: AngTrpMet -> LngLst -> AngTrpMetLng */
    public static final String AngTrpMet_FKO_LngLst = "LngLst";
    /** FSysOrg026: AngTrpMet -> RecRulLst -> SysReaRulRol */
    public static final String AngTrpMet_FKO_RecRulLst = "RecRulLst";

    /** Traduzioni per AngTrpMet */
    public static final String AngTrpMetLng = "AngTrpMetLng";
    /** FLng000019: AngTrpMet <- Rec <- AngTrpMetLng */
    public static final String AngTrpMetLng_FKI_Rec = "Rec";
    /** FLng000020: AngLng <- Lng <- AngTrpMetLng */
    public static final String AngTrpMetLng_FKI_Lng = "Lng";

    /** Unità di misura */
    public static final String AngUniMea = "AngUniMea";
    /** FLng000159: AngUniMea -> LngLst -> AngUniMeaLng */
    public static final String AngUniMea_FKO_LngLst = "LngLst";
    /** FSysItm003: AngUniMea -> ItmAltLst -> AngItm */
    public static final String AngUniMea_FKO_ItmAltLst = "ItmAltLst";
    /** FSysItm008: AngUniMea -> ItmLst -> AngItm */
    public static final String AngUniMea_FKO_ItmLst = "ItmLst";
    /** FSysItm070: AngUniMea -> ExtPhsUniMeaLst -> AngPrdWrk */
    public static final String AngUniMea_FKO_ExtPhsUniMeaLst = "ExtPhsUniMeaLst";
    /** FSysItm123: AngUniMea -> ItmDimLst -> AngItmDim */
    public static final String AngUniMea_FKO_ItmDimLst = "ItmDimLst";
    /** FSysItm124: AngUniMea -> DefCatLst -> AngUniMeaCat */
    public static final String AngUniMea_FKO_DefCatLst = "DefCatLst";
    /** FSysItm125: AngUniMeaCat <- Cat <- AngUniMea */
    public static final String AngUniMea_FKI_Cat = "Cat";

    /** Categoria unità di misura */
    public static final String AngUniMeaCat = "AngUniMeaCat";
    /** FLng000171: AngUniMeaCat -> LngLst -> AngUniMeaCatLng */
    public static final String AngUniMeaCat_FKO_LngLst = "LngLst";
    /** FSysItm125: AngUniMeaCat -> UniMeaLst -> AngUniMea */
    public static final String AngUniMeaCat_FKO_UniMeaLst = "UniMeaLst";
    /** FSysItm124: AngUniMea <- UniMea <- AngUniMeaCat */
    public static final String AngUniMeaCat_FKI_UniMea = "UniMea";

    /** Traduzioni per AngUniMeaCat */
    public static final String AngUniMeaCatLng = "AngUniMeaCatLng";
    /** FLng000171: AngUniMeaCat <- Rec <- AngUniMeaCatLng */
    public static final String AngUniMeaCatLng_FKI_Rec = "Rec";
    /** FLng000172: AngLng <- Lng <- AngUniMeaCatLng */
    public static final String AngUniMeaCatLng_FKI_Lng = "Lng";

    /** Traduzioni per AngUniMea */
    public static final String AngUniMeaLng = "AngUniMeaLng";
    /** FLng000159: AngUniMea <- Rec <- AngUniMeaLng */
    public static final String AngUniMeaLng_FKI_Rec = "Rec";
    /** FLng000160: AngLng <- Lng <- AngUniMeaLng */
    public static final String AngUniMeaLng_FKI_Lng = "Lng";

    /** Unità di misura temp. */
    public static final String AngUniMeaTmp = "AngUniMeaTmp";
    /** FLng000011: AngUniMeaTmp -> LngLst -> AngUniMeaTmpLng */
    public static final String AngUniMeaTmp_FKO_LngLst = "LngLst";
    /** FSysBas001: AngUniMeaTmp -> UniMeaTmpErpLst -> AngUniMeaTmpErp */
    public static final String AngUniMeaTmp_FKO_UniMeaTmpErpLst = "UniMeaTmpErpLst";
    /** FSysItm069: AngUniMeaTmp -> UniMeaTmpLst -> AngPrdWrk */
    public static final String AngUniMeaTmp_FKO_UniMeaTmpLst = "UniMeaTmpLst";
    /** FSysOrg054: AngUniMeaTmp -> CstCenLst -> AngCstCen */
    public static final String AngUniMeaTmp_FKO_CstCenLst = "CstCenLst";

    /** Unità di misura temp. ERP */
    public static final String AngUniMeaTmpErp = "AngUniMeaTmpErp";
    /** FSysBas001: AngUniMeaTmp <- UniMeaTmp <- AngUniMeaTmpErp */
    public static final String AngUniMeaTmpErp_FKI_UniMeaTmp = "UniMeaTmp";

    /** Traduzioni per AngUniMeaTmp */
    public static final String AngUniMeaTmpLng = "AngUniMeaTmpLng";
    /** FLng000011: AngUniMeaTmp <- Rec <- AngUniMeaTmpLng */
    public static final String AngUniMeaTmpLng_FKI_Rec = "Rec";
    /** FLng000012: AngLng <- Lng <- AngUniMeaTmpLng */
    public static final String AngUniMeaTmpLng_FKI_Lng = "Lng";

    /** IVA */
    public static final String AngVat = "AngVat";
    /** FLng000025: AngVat -> LngLst -> AngVatLng */
    public static final String AngVat_FKO_LngLst = "LngLst";
    /** FSysItm006: AngVat -> ItmLst -> AngItm */
    public static final String AngVat_FKO_ItmLst = "ItmLst";
    /** FSysOrg029: AngVat -> RecRulLst -> SysReaRulRol */
    public static final String AngVat_FKO_RecRulLst = "RecRulLst";
    /** FSysTac001: AngVat -> VatRatLst -> VatRat */
    public static final String AngVat_FKO_VatRatLst = "VatRatLst";

    /** Traduzioni per AngVat */
    public static final String AngVatLng = "AngVatLng";
    /** FLng000025: AngVat <- Rec <- AngVatLng */
    public static final String AngVatLng_FKI_Rec = "Rec";
    /** FLng000026: AngLng <- Lng <- AngVatLng */
    public static final String AngVatLng_FKI_Lng = "Lng";

    /** Magazzini */
    public static final String AngWhs = "AngWhs";
    /** FSysItm119: AngWhs -> ItmLst -> AngItm */
    public static final String AngWhs_FKO_ItmLst = "ItmLst";
    /** FSysLgs001: AngPln <- Pln <- AngWhs */
    public static final String AngWhs_FKI_Pln = "Pln";

    /** Anagrafica centro di lavoro */
    public static final String AngWrc = "AngWrc";
    /** FLng000071: AngWrc -> LngLst -> AngWrcLng */
    public static final String AngWrc_FKO_LngLst = "LngLst";
    /** FSysItm067: AngWrc -> WrcWrkLst -> AngPrdWrk */
    public static final String AngWrc_FKO_WrcWrkLst = "WrcWrkLst";
    /** FSysOrg057: AngWrc -> WrcLst -> AngRes */
    public static final String AngWrc_FKO_WrcLst = "WrcLst";
    /** FSysOrg058: AngWrc -> CstWrkCenLst -> CstWrkCen */
    public static final String AngWrc_FKO_CstWrkCenLst = "CstWrkCenLst";

    /** Traduzioni per AngWrc */
    public static final String AngWrcLng = "AngWrcLng";
    /** FLng000071: AngWrc <- Rec <- AngWrcLng */
    public static final String AngWrcLng_FKI_Rec = "Rec";
    /** FLng000072: AngLng <- Lng <- AngWrcLng */
    public static final String AngWrcLng_FKI_Lng = "Lng";

    /** Zona */
    public static final String AngZon = "AngZon";
    /** FLng000005: AngZon -> LngLst -> AngZonLng */
    public static final String AngZon_FKO_LngLst = "LngLst";
    /** FSysBas002: AngZon -> CusLst -> AngCus */
    public static final String AngZon_FKO_CusLst = "CusLst";
    /** FSysGeo003: AngZon -> ZonRef -> AngZon */
    public static final String AngZon_FKO_ZonRef = "ZonRef";
    /** FSysGeo007: AngZon -> AngPlcLst -> AngPlc */
    public static final String AngZon_FKO_AngPlcLst = "AngPlcLst";
    /** FSysGeo003: AngZon <- Zon <- AngZon */
    public static final String AngZon_FKI_Zon = "Zon";

    /** Traduzioni per AngZon */
    public static final String AngZonLng = "AngZonLng";
    /** FLng000005: AngZon <- Rec <- AngZonLng */
    public static final String AngZonLng_FKI_Rec = "Rec";
    /** FLng000006: AngLng <- Lng <- AngZonLng */
    public static final String AngZonLng_FKI_Lng = "Lng";

    /** Informazioni versione BEC */
    public static final String BecVrsInf = "BecVrsInf";

    /** [virtual] Serie Storica */
    public static final String BecVrtHisSrs = "BecVrtHisSrs";

    /** Eventi calendario */
    public static final String CalEvt = "CalEvt";
    /** FSysCal027: CalEvt -> EvtRepLst -> CalEvt */
    public static final String CalEvt_FKO_EvtRepLst = "EvtRepLst";
    /** FSysCal029: CalEvt -> InvLst -> CalEvtRes */
    public static final String CalEvt_FKO_InvLst = "InvLst";
    /** FSysCal033: CalEvt -> PrpLst -> CalEvtPrp */
    public static final String CalEvt_FKO_PrpLst = "PrpLst";
    /** FSysCal042: CalEvt -> CalEvtCls -> CalEvtCls */
    public static final String CalEvt_FKO_CalEvtCls = "CalEvtCls";
    /** FSysCal024: AngCalEvtTyp <- EvtTyp <- CalEvt */
    public static final String CalEvt_FKI_EvtTyp = "EvtTyp";
    /** FSysCal025: AngSrvSrc <- EvtSrc <- CalEvt */
    public static final String CalEvt_FKI_EvtSrc = "EvtSrc";
    /** FSysCal026: AngRes <- EvtMan <- CalEvt */
    public static final String CalEvt_FKI_EvtMan = "EvtMan";
    /** FSysCal027: CalEvt <- EvtOrg <- CalEvt */
    public static final String CalEvt_FKI_EvtOrg = "EvtOrg";
    /** FSysCal028: AngCalEvtSts <- EvtSts <- CalEvt */
    public static final String CalEvt_FKI_EvtSts = "EvtSts";
    /** FSysCal037: AngEty <- Ety <- CalEvt */
    public static final String CalEvt_FKI_Ety = "Ety";
    /** FSysCal038: AngTimZon <- TimZon <- CalEvt */
    public static final String CalEvt_FKI_TimZon = "TimZon";
    /** FSysCal041: AngTimZon <- TimZonEnd <- CalEvt */
    public static final String CalEvt_FKI_TimZonEnd = "TimZonEnd";

    /** Eventi calendario */
    public static final String CalEvtCls = "CalEvtCls";
    /** FSysCal042: CalEvt <- CalEvt <- CalEvtCls */
    public static final String CalEvtCls_FKI_CalEvt = "CalEvt";
    /** FSysCal103: AngCalEvtCls001 <- ClsCalEvt001 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt001 = "ClsCalEvt001";
    /** FSysCal104: AngCalEvtCls002 <- ClsCalEvt002 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt002 = "ClsCalEvt002";
    /** FSysCal105: AngCalEvtCls003 <- ClsCalEvt003 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt003 = "ClsCalEvt003";
    /** FSysCal106: AngCalEvtCls004 <- ClsCalEvt004 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt004 = "ClsCalEvt004";
    /** FSysCal107: AngCalEvtCls005 <- ClsCalEvt005 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt005 = "ClsCalEvt005";
    /** FSysCal108: AngCalEvtCls006 <- ClsCalEvt006 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt006 = "ClsCalEvt006";
    /** FSysCal109: AngCalEvtCls007 <- ClsCalEvt007 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt007 = "ClsCalEvt007";
    /** FSysCal110: AngCalEvtCls008 <- ClsCalEvt008 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt008 = "ClsCalEvt008";
    /** FSysCal111: AngCalEvtCls009 <- ClsCalEvt009 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt009 = "ClsCalEvt009";
    /** FSysCal112: AngCalEvtCls010 <- ClsCalEvt010 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt010 = "ClsCalEvt010";
    /** FSysCal113: AngCalEvtCls011 <- ClsCalEvt011 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt011 = "ClsCalEvt011";
    /** FSysCal114: AngCalEvtCls012 <- ClsCalEvt012 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt012 = "ClsCalEvt012";
    /** FSysCal115: AngCalEvtCls013 <- ClsCalEvt013 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt013 = "ClsCalEvt013";
    /** FSysCal116: AngCalEvtCls014 <- ClsCalEvt014 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt014 = "ClsCalEvt014";
    /** FSysCal117: AngCalEvtCls015 <- ClsCalEvt015 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt015 = "ClsCalEvt015";
    /** FSysCal118: AngCalEvtCls016 <- ClsCalEvt016 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt016 = "ClsCalEvt016";
    /** FSysCal119: AngCalEvtCls017 <- ClsCalEvt017 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt017 = "ClsCalEvt017";
    /** FSysCal120: AngCalEvtCls018 <- ClsCalEvt018 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt018 = "ClsCalEvt018";
    /** FSysCal121: AngCalEvtCls019 <- ClsCalEvt019 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt019 = "ClsCalEvt019";
    /** FSysCal122: AngCalEvtCls020 <- ClsCalEvt020 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt020 = "ClsCalEvt020";
    /** FSysCal123: AngCalEvtCls021 <- ClsCalEvt021 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt021 = "ClsCalEvt021";
    /** FSysCal124: AngCalEvtCls022 <- ClsCalEvt022 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt022 = "ClsCalEvt022";
    /** FSysCal125: AngCalEvtCls023 <- ClsCalEvt023 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt023 = "ClsCalEvt023";
    /** FSysCal126: AngCalEvtCls024 <- ClsCalEvt024 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt024 = "ClsCalEvt024";
    /** FSysCal127: AngCalEvtCls025 <- ClsCalEvt025 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt025 = "ClsCalEvt025";
    /** FSysCal128: AngCalEvtCls026 <- ClsCalEvt026 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt026 = "ClsCalEvt026";
    /** FSysCal129: AngCalEvtCls027 <- ClsCalEvt027 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt027 = "ClsCalEvt027";
    /** FSysCal130: AngCalEvtCls028 <- ClsCalEvt028 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt028 = "ClsCalEvt028";
    /** FSysCal131: AngCalEvtCls029 <- ClsCalEvt029 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt029 = "ClsCalEvt029";
    /** FSysCal132: AngCalEvtCls030 <- ClsCalEvt030 <- CalEvtCls */
    public static final String CalEvtCls_FKI_ClsCalEvt030 = "ClsCalEvt030";

    /** Prop. aggiuntive */
    public static final String CalEvtPrp = "CalEvtPrp";
    /** FSysCal033: CalEvt <- Evt <- CalEvtPrp */
    public static final String CalEvtPrp_FKI_Evt = "Evt";

    /** Invitati eventi */
    public static final String CalEvtRes = "CalEvtRes";
    /** FSysCal029: CalEvt <- Evt <- CalEvtRes */
    public static final String CalEvtRes_FKI_Evt = "Evt";
    /** FSysCal030: AngRes <- Res <- CalEvtRes */
    public static final String CalEvtRes_FKI_Res = "Res";
    /** FSysCal031: AngCalEvtInvSts <- InvSts <- CalEvtRes */
    public static final String CalEvtRes_FKI_InvSts = "InvSts";
    /** FSysCal032: AngCalEvtInvTyp <- InvTyp <- CalEvtRes */
    public static final String CalEvtRes_FKI_InvTyp = "InvTyp";

    /** Calendari risorse sottoscritti */
    public static final String CalEvtSubRes = "CalEvtSubRes";
    /** FSysCal039: AngRes <- Res <- CalEvtSubRes */
    public static final String CalEvtSubRes_FKI_Res = "Res";
    /** FSysCal040: AngRes <- SubRes <- CalEvtSubRes */
    public static final String CalEvtSubRes_FKI_SubRes = "SubRes";

    /** Assenze organizzazioni */
    public static final String CalOrgComAbs = "CalOrgComAbs";
    /** FLng000311: CalOrgComAbs -> LngLst -> CalOrgComAbsLng */
    public static final String CalOrgComAbs_FKO_LngLst = "LngLst";
    /** FSysCal133: AngOrgCom <- OrgCom <- CalOrgComAbs */
    public static final String CalOrgComAbs_FKI_OrgCom = "OrgCom";
    /** FSysCal134: AngDay <- Day <- CalOrgComAbs */
    public static final String CalOrgComAbs_FKI_Day = "Day";

    /** Traduzioni per CalOrgComAbs */
    public static final String CalOrgComAbsLng = "CalOrgComAbsLng";
    /** FLng000311: CalOrgComAbs <- Rec <- CalOrgComAbsLng */
    public static final String CalOrgComAbsLng_FKI_Rec = "Rec";
    /** FLng000312: AngLng <- Lng <- CalOrgComAbsLng */
    public static final String CalOrgComAbsLng_FKI_Lng = "Lng";

    /** Assenze stabilimenti */
    public static final String CalPlnAbs = "CalPlnAbs";
    /** FLng000313: CalPlnAbs -> LngLst -> CalPlnAbsLng */
    public static final String CalPlnAbs_FKO_LngLst = "LngLst";
    /** FSysCal135: AngPln <- Pln <- CalPlnAbs */
    public static final String CalPlnAbs_FKI_Pln = "Pln";
    /** FSysCal136: AngDay <- Day <- CalPlnAbs */
    public static final String CalPlnAbs_FKI_Day = "Day";

    /** Traduzioni per CalPlnAbs */
    public static final String CalPlnAbsLng = "CalPlnAbsLng";
    /** FLng000313: CalPlnAbs <- Rec <- CalPlnAbsLng */
    public static final String CalPlnAbsLng_FKI_Rec = "Rec";
    /** FLng000314: AngLng <- Lng <- CalPlnAbsLng */
    public static final String CalPlnAbsLng_FKI_Lng = "Lng";

    /** Assenze risorse */
    public static final String CalResAbs = "CalResAbs";
    /** FSysCal014: AngRes <- Res <- CalResAbs */
    public static final String CalResAbs_FKI_Res = "Res";
    /** FSysCal016: AngDay <- Day <- CalResAbs */
    public static final String CalResAbs_FKI_Day = "Day";
    /** FSysCal021: AngSrvSrc <- AbsSrc <- CalResAbs */
    public static final String CalResAbs_FKI_AbsSrc = "AbsSrc";

    /** Costi orari centri di lavoro */
    public static final String CstWrkCen = "CstWrkCen";
    /** FSysOrg058: AngWrc <- Wrc <- CstWrkCen */
    public static final String CstWrkCen_FKI_Wrc = "Wrc";
    /** FSysOrg059: AngRes <- Mac <- CstWrkCen */
    public static final String CstWrkCen_FKI_Mac = "Mac";
    /** FSysOrg060: AngCstRat <- CstRat <- CstWrkCen */
    public static final String CstWrkCen_FKI_CstRat = "CstRat";

    /** Wizard */
    public static final String DefWzd = "DefWzd";
    /** FLng000189: DefWzd -> LngLst -> DefWzdLng */
    public static final String DefWzd_FKO_LngLst = "LngLst";
    /** FSysWzd001: DefWzd -> RevLst -> DefWzdRev */
    public static final String DefWzd_FKO_RevLst = "RevLst";

    /** Traduzioni per DefWzd */
    public static final String DefWzdLng = "DefWzdLng";
    /** FLng000189: DefWzd <- Rec <- DefWzdLng */
    public static final String DefWzdLng_FKI_Rec = "Rec";
    /** FLng000190: AngLng <- Lng <- DefWzdLng */
    public static final String DefWzdLng_FKI_Lng = "Lng";

    /** Percorsi wizard */
    public static final String DefWzdPat = "DefWzdPat";
    /** FSysWzd007: DefWzdStp <- Src <- DefWzdPat */
    public static final String DefWzdPat_FKI_Src = "Src";
    /** FSysWzd008: DefWzdStp <- Trg <- DefWzdPat */
    public static final String DefWzdPat_FKI_Trg = "Trg";

    /** Revisioni wizard */
    public static final String DefWzdRev = "DefWzdRev";
    /** FSysWzd002: DefWzdRev -> TrgLst -> DefWzdRev */
    public static final String DefWzdRev_FKO_TrgLst = "TrgLst";
    /** FSysWzd004: DefWzdRev -> PrmLst -> DefWzdRevPrm */
    public static final String DefWzdRev_FKO_PrmLst = "PrmLst";
    /** FSysWzd005: DefWzdRev -> StpLst -> DefWzdStp */
    public static final String DefWzdRev_FKO_StpLst = "StpLst";
    /** FSysWzd001: DefWzd <- Wzd <- DefWzdRev */
    public static final String DefWzdRev_FKI_Wzd = "Wzd";
    /** FSysWzd002: DefWzdRev <- Src <- DefWzdRev */
    public static final String DefWzdRev_FKI_Src = "Src";
    /** FSysWzd003: AngPrs <- Prs <- DefWzdRev */
    public static final String DefWzdRev_FKI_Prs = "Prs";

    /** Parametri revisione */
    public static final String DefWzdRevPrm = "DefWzdRevPrm";
    /** FSysWzd004: DefWzdRev <- Rev <- DefWzdRevPrm */
    public static final String DefWzdRevPrm_FKI_Rev = "Rev";

    /** Step wizard */
    public static final String DefWzdStp = "DefWzdStp";
    /** FLng000191: DefWzdStp -> LngLst -> DefWzdStpLng */
    public static final String DefWzdStp_FKO_LngLst = "LngLst";
    /** FSysWzd006: DefWzdStp -> PrmLst -> DefWzdStpPrm */
    public static final String DefWzdStp_FKO_PrmLst = "PrmLst";
    /** FSysWzd007: DefWzdStp -> OutLst -> DefWzdPat */
    public static final String DefWzdStp_FKO_OutLst = "OutLst";
    /** FSysWzd008: DefWzdStp -> IncLst -> DefWzdPat */
    public static final String DefWzdStp_FKO_IncLst = "IncLst";
    /** FSysWzd005: DefWzdRev <- Rev <- DefWzdStp */
    public static final String DefWzdStp_FKI_Rev = "Rev";

    /** Traduzioni per DefWzdStp */
    public static final String DefWzdStpLng = "DefWzdStpLng";
    /** FLng000191: DefWzdStp <- Rec <- DefWzdStpLng */
    public static final String DefWzdStpLng_FKI_Rec = "Rec";
    /** FLng000192: AngLng <- Lng <- DefWzdStpLng */
    public static final String DefWzdStpLng_FKI_Lng = "Lng";

    /** Parametri task */
    public static final String DefWzdStpPrm = "DefWzdStpPrm";
    /** FSysWzd006: DefWzdStp <- Tsk <- DefWzdStpPrm */
    public static final String DefWzdStpPrm_FKI_Tsk = "Tsk";

    /** Funzioni di aggregazione */
    public static final String DvzAggFun = "DvzAggFun";
    /** FDvzRep011: DvzAggFun -> RepQryLst -> DvzRepQryAgg */
    public static final String DvzAggFun_FKO_RepQryLst = "RepQryLst";
    /** FDvzRep025: DvzAggFun -> RepChrAxyLst -> DvzRepChrAxy */
    public static final String DvzAggFun_FKO_RepChrAxyLst = "RepChrAxyLst";

    /** Macro tipo grafico */
    public static final String DvzChrMacTyp = "DvzChrMacTyp";
    /** FDvzRep050: DvzChrMacTyp -> TypLst -> DvzChrTyp */
    public static final String DvzChrMacTyp_FKO_TypLst = "TypLst";
    /** FLng000393: DvzChrMacTyp -> LngLst -> DvzChrMacTypLng */
    public static final String DvzChrMacTyp_FKO_LngLst = "LngLst";

    /** Traduzioni per DvzChrMacTyp */
    public static final String DvzChrMacTypLng = "DvzChrMacTypLng";
    /** FLng000393: DvzChrMacTyp <- Rec <- DvzChrMacTypLng */
    public static final String DvzChrMacTypLng_FKI_Rec = "Rec";
    /** FLng000394: AngLng <- Lng <- DvzChrMacTypLng */
    public static final String DvzChrMacTypLng_FKI_Lng = "Lng";

    /** Tipo grafico */
    public static final String DvzChrTyp = "DvzChrTyp";
    /** FDvzRep020: DvzChrTyp -> ChrLst -> DvzRepChr */
    public static final String DvzChrTyp_FKO_ChrLst = "ChrLst";
    /** FLng000385: DvzChrTyp -> LngLst -> DvzChrTypLng */
    public static final String DvzChrTyp_FKO_LngLst = "LngLst";
    /** FDvzRep050: DvzChrMacTyp <- MacTyp <- DvzChrTyp */
    public static final String DvzChrTyp_FKI_MacTyp = "MacTyp";

    /** Traduzioni per DvzChrTyp */
    public static final String DvzChrTypLng = "DvzChrTypLng";
    /** FLng000385: DvzChrTyp <- Rec <- DvzChrTypLng */
    public static final String DvzChrTypLng_FKI_Rec = "Rec";
    /** FLng000386: AngLng <- Lng <- DvzChrTypLng */
    public static final String DvzChrTypLng_FKI_Lng = "Lng";

    /** Tipo gantt layer */
    public static final String DvzGntLayTyp = "DvzGntLayTyp";
    /** FDvzRep047: DvzGntLayTyp -> RepGntLayLst -> DvzRepGntLay */
    public static final String DvzGntLayTyp_FKO_RepGntLayLst = "RepGntLayLst";
    /** FLng000389: DvzGntLayTyp -> LngLst -> DvzGntLayTypLng */
    public static final String DvzGntLayTyp_FKO_LngLst = "LngLst";

    /** Traduzioni per DvzGntLayTyp */
    public static final String DvzGntLayTypLng = "DvzGntLayTypLng";
    /** FLng000389: DvzGntLayTyp <- Rec <- DvzGntLayTypLng */
    public static final String DvzGntLayTypLng_FKI_Rec = "Rec";
    /** FLng000390: AngLng <- Lng <- DvzGntLayTypLng */
    public static final String DvzGntLayTypLng_FKI_Lng = "Lng";

    /** Report synergy */
    public static final String DvzRep = "DvzRep";
    /** FDvzRep001: DvzRep -> GrpLst -> DvzRepGrp */
    public static final String DvzRep_FKO_GrpLst = "GrpLst";
    /** FDvzRep003: DvzRep -> QryLst -> DvzRepQry */
    public static final String DvzRep_FKO_QryLst = "QryLst";
    /** FLng000373: DvzRep -> LngLst -> DvzRepLng */
    public static final String DvzRep_FKO_LngLst = "LngLst";

    /** Grafico di report */
    public static final String DvzRepChr = "DvzRepChr";
    /** FDvzRep021: DvzRepChr -> AxxLst -> DvzRepChrAxx */
    public static final String DvzRepChr_FKO_AxxLst = "AxxLst";
    /** FDvzRep023: DvzRepChr -> AxyLst -> DvzRepChrAxy */
    public static final String DvzRepChr_FKO_AxyLst = "AxyLst";
    /** FLng000381: DvzRepChr -> LngLst -> DvzRepChrLng */
    public static final String DvzRepChr_FKO_LngLst = "LngLst";
    /** FDvzRep019: DvzRepQry <- RepQry <- DvzRepChr */
    public static final String DvzRepChr_FKI_RepQry = "RepQry";
    /** FDvzRep020: DvzChrTyp <- ChrTyp <- DvzRepChr */
    public static final String DvzRepChr_FKI_ChrTyp = "ChrTyp";

    /** Variabile x grafico */
    public static final String DvzRepChrAxx = "DvzRepChrAxx";
    /** FDvzRep021: DvzRepChr <- Chr <- DvzRepChrAxx */
    public static final String DvzRepChrAxx_FKI_Chr = "Chr";
    /** FDvzRep022: AngDbmTblCol <- DbmCol <- DvzRepChrAxx */
    public static final String DvzRepChrAxx_FKI_DbmCol = "DbmCol";
    /** FDvzRep034: AngDbmTblCol <- ClrCol <- DvzRepChrAxx */
    public static final String DvzRepChrAxx_FKI_ClrCol = "ClrCol";
    /** FDvzRep035: AngDbmTblCol <- DscCol <- DvzRepChrAxx */
    public static final String DvzRepChrAxx_FKI_DscCol = "DscCol";

    /** Variabile y grafico */
    public static final String DvzRepChrAxy = "DvzRepChrAxy";
    /** FLng000383: DvzRepChrAxy -> LngLst -> DvzRepChrAxyLng */
    public static final String DvzRepChrAxy_FKO_LngLst = "LngLst";
    /** FDvzRep023: DvzRepChr <- Chr <- DvzRepChrAxy */
    public static final String DvzRepChrAxy_FKI_Chr = "Chr";
    /** FDvzRep024: AngDbmTblCol <- DbmCol <- DvzRepChrAxy */
    public static final String DvzRepChrAxy_FKI_DbmCol = "DbmCol";
    /** FDvzRep025: DvzAggFun <- Agg <- DvzRepChrAxy */
    public static final String DvzRepChrAxy_FKI_Agg = "Agg";

    /** Traduzioni per DvzRepChrAxy */
    public static final String DvzRepChrAxyLng = "DvzRepChrAxyLng";
    /** FLng000383: DvzRepChrAxy <- Rec <- DvzRepChrAxyLng */
    public static final String DvzRepChrAxyLng_FKI_Rec = "Rec";
    /** FLng000384: AngLng <- Lng <- DvzRepChrAxyLng */
    public static final String DvzRepChrAxyLng_FKI_Lng = "Lng";

    /** Traduzioni per DvzRepChr */
    public static final String DvzRepChrLng = "DvzRepChrLng";
    /** FLng000381: DvzRepChr <- Rec <- DvzRepChrLng */
    public static final String DvzRepChrLng_FKI_Rec = "Rec";
    /** FLng000382: AngLng <- Lng <- DvzRepChrLng */
    public static final String DvzRepChrLng_FKI_Lng = "Lng";

    /** Gantt di report */
    public static final String DvzRepGnt = "DvzRepGnt";
    /** FDvzRep043: DvzRepGnt -> GrpLst -> DvzRepGntGrp */
    public static final String DvzRepGnt_FKO_GrpLst = "GrpLst";
    /** FDvzRep046: DvzRepGnt -> LayLst -> DvzRepGntLay */
    public static final String DvzRepGnt_FKO_LayLst = "LayLst";
    /** FLng000387: DvzRepGnt -> LngLst -> DvzRepGntLng */
    public static final String DvzRepGnt_FKO_LngLst = "LngLst";
    /** FDvzRep036: DvzRepQry <- RepQry <- DvzRepGnt */
    public static final String DvzRepGnt_FKI_RepQry = "RepQry";
    /** FDvzRep037: AngDbmTblCol <- StrCol <- DvzRepGnt */
    public static final String DvzRepGnt_FKI_StrCol = "StrCol";
    /** FDvzRep038: AngDbmTblCol <- EndCol <- DvzRepGnt */
    public static final String DvzRepGnt_FKI_EndCol = "EndCol";
    /** FDvzRep039: AngDbmTblCol <- CodCol <- DvzRepGnt */
    public static final String DvzRepGnt_FKI_CodCol = "CodCol";
    /** FDvzRep040: AngDbmTblCol <- DscCol <- DvzRepGnt */
    public static final String DvzRepGnt_FKI_DscCol = "DscCol";
    /** FDvzRep041: AngDbmTblCol <- ClrCol <- DvzRepGnt */
    public static final String DvzRepGnt_FKI_ClrCol = "ClrCol";
    /** FDvzRep042: AngDbmTblCol <- DayCol <- DvzRepGnt */
    public static final String DvzRepGnt_FKI_DayCol = "DayCol";

    /** Raggruppamento di gantt di report */
    public static final String DvzRepGntGrp = "DvzRepGntGrp";
    /** FDvzRep043: DvzRepGnt <- Gnt <- DvzRepGntGrp */
    public static final String DvzRepGntGrp_FKI_Gnt = "Gnt";
    /** FDvzRep044: AngDbmTblCol <- GrpCol <- DvzRepGntGrp */
    public static final String DvzRepGntGrp_FKI_GrpCol = "GrpCol";
    /** FDvzRep045: AngDbmTblCol <- DscCol <- DvzRepGntGrp */
    public static final String DvzRepGntGrp_FKI_DscCol = "DscCol";

    /** Layer di gantt */
    public static final String DvzRepGntLay = "DvzRepGntLay";
    /** FLng000391: DvzRepGntLay -> LngLst -> DvzRepGntLayLng */
    public static final String DvzRepGntLay_FKO_LngLst = "LngLst";
    /** FDvzRep046: DvzRepGnt <- Gnt <- DvzRepGntLay */
    public static final String DvzRepGntLay_FKI_Gnt = "Gnt";
    /** FDvzRep047: DvzGntLayTyp <- GntLayTyp <- DvzRepGntLay */
    public static final String DvzRepGntLay_FKI_GntLayTyp = "GntLayTyp";
    /** FDvzRep048: AngDbmTblCol <- TssCol <- DvzRepGntLay */
    public static final String DvzRepGntLay_FKI_TssCol = "TssCol";
    /** FDvzRep049: AngDbmTblCol <- DayCol <- DvzRepGntLay */
    public static final String DvzRepGntLay_FKI_DayCol = "DayCol";

    /** Traduzioni per DvzRepGntLay */
    public static final String DvzRepGntLayLng = "DvzRepGntLayLng";
    /** FLng000391: DvzRepGntLay <- Rec <- DvzRepGntLayLng */
    public static final String DvzRepGntLayLng_FKI_Rec = "Rec";
    /** FLng000392: AngLng <- Lng <- DvzRepGntLayLng */
    public static final String DvzRepGntLayLng_FKI_Lng = "Lng";

    /** Traduzioni per DvzRepGnt */
    public static final String DvzRepGntLng = "DvzRepGntLng";
    /** FLng000387: DvzRepGnt <- Rec <- DvzRepGntLng */
    public static final String DvzRepGntLng_FKI_Rec = "Rec";
    /** FLng000388: AngLng <- Lng <- DvzRepGntLng */
    public static final String DvzRepGntLng_FKI_Lng = "Lng";

    /** Gruppi autorizzati report */
    public static final String DvzRepGrp = "DvzRepGrp";
    /** FDvzRep001: DvzRep <- Rep <- DvzRepGrp */
    public static final String DvzRepGrp_FKI_Rep = "Rep";
    /** FDvzRep002: AngGrp <- Grp <- DvzRepGrp */
    public static final String DvzRepGrp_FKI_Grp = "Grp";

    /** Traduzioni per DvzRep */
    public static final String DvzRepLng = "DvzRepLng";
    /** FLng000373: DvzRep <- Rec <- DvzRepLng */
    public static final String DvzRepLng_FKI_Rec = "Rec";
    /** FLng000374: AngLng <- Lng <- DvzRepLng */
    public static final String DvzRepLng_FKI_Lng = "Lng";

    /** Query di report */
    public static final String DvzRepQry = "DvzRepQry";
    /** FDvzRep005: DvzRepQry -> FltLst -> DvzRepQryFlt */
    public static final String DvzRepQry_FKO_FltLst = "FltLst";
    /** FDvzRep008: DvzRepQry -> DerFltLst -> DvzRepQryFlt */
    public static final String DvzRepQry_FKO_DerFltLst = "DerFltLst";
    /** FDvzRep009: DvzRepQry -> AggLst -> DvzRepQryAgg */
    public static final String DvzRepQry_FKO_AggLst = "AggLst";
    /** FDvzRep012: DvzRepQry -> DsgLst -> DvzRepQryDsg */
    public static final String DvzRepQry_FKO_DsgLst = "DsgLst";
    /** FDvzRep018: DvzRepQry -> DerDsgFltLst -> DvzRepQryDsgFlt */
    public static final String DvzRepQry_FKO_DerDsgFltLst = "DerDsgFltLst";
    /** FDvzRep019: DvzRepQry -> ChrLst -> DvzRepChr */
    public static final String DvzRepQry_FKO_ChrLst = "ChrLst";
    /** FDvzRep026: DvzRepQry -> FmtLst -> DvzRepQryFmt */
    public static final String DvzRepQry_FKO_FmtLst = "FmtLst";
    /** FDvzRep029: DvzRepQry -> CnvLst -> DvzRepQryCnv */
    public static final String DvzRepQry_FKO_CnvLst = "CnvLst";
    /** FDvzRep036: DvzRepQry -> GntLst -> DvzRepGnt */
    public static final String DvzRepQry_FKO_GntLst = "GntLst";
    /** FLng000375: DvzRepQry -> LngLst -> DvzRepQryLng */
    public static final String DvzRepQry_FKO_LngLst = "LngLst";
    /** FDvzRep003: DvzRep <- Rep <- DvzRepQry */
    public static final String DvzRepQry_FKI_Rep = "Rep";
    /** FDvzRep004: AngQry <- Qry <- DvzRepQry */
    public static final String DvzRepQry_FKI_Qry = "Qry";

    /** Funzioni di aggregazione delle tabelle */
    public static final String DvzRepQryAgg = "DvzRepQryAgg";
    /** FDvzRep009: DvzRepQry <- RepQry <- DvzRepQryAgg */
    public static final String DvzRepQryAgg_FKI_RepQry = "RepQry";
    /** FDvzRep010: AngQryDbmTblCol <- QryCol <- DvzRepQryAgg */
    public static final String DvzRepQryAgg_FKI_QryCol = "QryCol";
    /** FDvzRep011: DvzAggFun <- Agg <- DvzRepQryAgg */
    public static final String DvzRepQryAgg_FKI_Agg = "Agg";
    /** FDvzRep033: SysTraLbl <- FmtLbl <- DvzRepQryAgg */
    public static final String DvzRepQryAgg_FKI_FmtLbl = "FmtLbl";

    /** Conversione colonne */
    public static final String DvzRepQryCnv = "DvzRepQryCnv";
    /** FDvzRep029: DvzRepQry <- RepQry <- DvzRepQryCnv */
    public static final String DvzRepQryCnv_FKI_RepQry = "RepQry";
    /** FDvzRep030: AngDbmTblCol <- DbmCol <- DvzRepQryCnv */
    public static final String DvzRepQryCnv_FKI_DbmCol = "DbmCol";
    /** FDvzRep031: SysTraLbl <- CnvLbl <- DvzRepQryCnv */
    public static final String DvzRepQryCnv_FKI_CnvLbl = "CnvLbl";

    /** Design condizionali di tabelle di report */
    public static final String DvzRepQryDsg = "DvzRepQryDsg";
    /** FDvzRep013: DvzRepQryDsg -> StyLst -> DvzRepQryDsgSty */
    public static final String DvzRepQryDsg_FKO_StyLst = "StyLst";
    /** FLng000377: DvzRepQryDsg -> LngLst -> DvzRepQryDsgLng */
    public static final String DvzRepQryDsg_FKO_LngLst = "LngLst";
    /** FDvzRep012: DvzRepQry <- RepQry <- DvzRepQryDsg */
    public static final String DvzRepQryDsg_FKI_RepQry = "RepQry";

    /** Condizioni di stile di tabelle di report */
    public static final String DvzRepQryDsgFlt = "DvzRepQryDsgFlt";
    /** FDvzRep015: DvzRepQryDsgSty <- Sty <- DvzRepQryDsgFlt */
    public static final String DvzRepQryDsgFlt_FKI_Sty = "Sty";
    /** FDvzRep016: AngDbmTblCol <- FltCol <- DvzRepQryDsgFlt */
    public static final String DvzRepQryDsgFlt_FKI_FltCol = "FltCol";
    /** FDvzRep017: AngDbmTblCol <- ValCol <- DvzRepQryDsgFlt */
    public static final String DvzRepQryDsgFlt_FKI_ValCol = "ValCol";
    /** FDvzRep018: DvzRepQry <- ValRepQry <- DvzRepQryDsgFlt */
    public static final String DvzRepQryDsgFlt_FKI_ValRepQry = "ValRepQry";

    /** Traduzioni per DvzRepQryDsg */
    public static final String DvzRepQryDsgLng = "DvzRepQryDsgLng";
    /** FLng000377: DvzRepQryDsg <- Rec <- DvzRepQryDsgLng */
    public static final String DvzRepQryDsgLng_FKI_Rec = "Rec";
    /** FLng000378: AngLng <- Lng <- DvzRepQryDsgLng */
    public static final String DvzRepQryDsgLng_FKI_Lng = "Lng";

    /** Stili condizionali di tabelle di report */
    public static final String DvzRepQryDsgSty = "DvzRepQryDsgSty";
    /** FDvzRep015: DvzRepQryDsgSty -> FltLst -> DvzRepQryDsgFlt */
    public static final String DvzRepQryDsgSty_FKO_FltLst = "FltLst";
    /** FLng000379: DvzRepQryDsgSty -> LngLst -> DvzRepQryDsgStyLng */
    public static final String DvzRepQryDsgSty_FKO_LngLst = "LngLst";
    /** FDvzRep013: DvzRepQryDsg <- Dsg <- DvzRepQryDsgSty */
    public static final String DvzRepQryDsgSty_FKI_Dsg = "Dsg";
    /** FDvzRep014: AngQryDbmTblCol <- QryCol <- DvzRepQryDsgSty */
    public static final String DvzRepQryDsgSty_FKI_QryCol = "QryCol";

    /** Traduzioni per DvzRepQryDsgSty */
    public static final String DvzRepQryDsgStyLng = "DvzRepQryDsgStyLng";
    /** FLng000379: DvzRepQryDsgSty <- Rec <- DvzRepQryDsgStyLng */
    public static final String DvzRepQryDsgStyLng_FKI_Rec = "Rec";
    /** FLng000380: AngLng <- Lng <- DvzRepQryDsgStyLng */
    public static final String DvzRepQryDsgStyLng_FKI_Lng = "Lng";

    /** Filtri per query di report */
    public static final String DvzRepQryFlt = "DvzRepQryFlt";
    /** FDvzRep005: DvzRepQry <- RepQry <- DvzRepQryFlt */
    public static final String DvzRepQryFlt_FKI_RepQry = "RepQry";
    /** FDvzRep006: AngDbmTblCol <- FltCol <- DvzRepQryFlt */
    public static final String DvzRepQryFlt_FKI_FltCol = "FltCol";
    /** FDvzRep007: AngDbmTblCol <- ValCol <- DvzRepQryFlt */
    public static final String DvzRepQryFlt_FKI_ValCol = "ValCol";
    /** FDvzRep008: DvzRepQry <- ValRepQry <- DvzRepQryFlt */
    public static final String DvzRepQryFlt_FKI_ValRepQry = "ValRepQry";

    /** Formattazione colonne */
    public static final String DvzRepQryFmt = "DvzRepQryFmt";
    /** FDvzRep026: DvzRepQry <- RepQry <- DvzRepQryFmt */
    public static final String DvzRepQryFmt_FKI_RepQry = "RepQry";
    /** FDvzRep027: AngQryDbmTblCol <- QryCol <- DvzRepQryFmt */
    public static final String DvzRepQryFmt_FKI_QryCol = "QryCol";
    /** FDvzRep028: AngDbmTblCol <- RefCol <- DvzRepQryFmt */
    public static final String DvzRepQryFmt_FKI_RefCol = "RefCol";
    /** FDvzRep032: SysTraLbl <- FmtLbl <- DvzRepQryFmt */
    public static final String DvzRepQryFmt_FKI_FmtLbl = "FmtLbl";

    /** Traduzioni per DvzRepQry */
    public static final String DvzRepQryLng = "DvzRepQryLng";
    /** FLng000375: DvzRepQry <- Rec <- DvzRepQryLng */
    public static final String DvzRepQryLng_FKI_Rec = "Rec";
    /** FLng000376: AngLng <- Lng <- DvzRepQryLng */
    public static final String DvzRepQryLng_FKI_Lng = "Lng";

    /** Informazioni versione DVZ */
    public static final String DvzVrsInf = "DvzVrsInf";

    /** Grafico Dataviz */
    public static final String DvzWksChr = "DvzWksChr";
    /** FDvzWks030: DvzWksChr -> AxxLst -> DvzWksChrAxx */
    public static final String DvzWksChr_FKO_AxxLst = "AxxLst";
    /** FDvzWks037: DvzWksChr -> AxyLst -> DvzWksChrAxy */
    public static final String DvzWksChr_FKO_AxyLst = "AxyLst";
    /** FDvzWks027: SysWksWdg <- Wdg <- DvzWksChr */
    public static final String DvzWksChr_FKI_Wdg = "Wdg";
    /** FDvzWks028: DvzWksQry <- DvzQry <- DvzWksChr */
    public static final String DvzWksChr_FKI_DvzQry = "DvzQry";
    /** FDvzWks029: AngDvzChrTyp <- ChrTyp <- DvzWksChr */
    public static final String DvzWksChr_FKI_ChrTyp = "ChrTyp";

    /** Asse X grafico Dataviz */
    public static final String DvzWksChrAxx = "DvzWksChrAxx";
    /** FDvzWks030: DvzWksChr <- DvzChr <- DvzWksChrAxx */
    public static final String DvzWksChrAxx_FKI_DvzChr = "DvzChr";
    /** FDvzWks031: AngDbmTblCol <- AxxCol <- DvzWksChrAxx */
    public static final String DvzWksChrAxx_FKI_AxxCol = "AxxCol";
    /** FDvzWks032: AngQryClcCol <- AxxClc <- DvzWksChrAxx */
    public static final String DvzWksChrAxx_FKI_AxxClc = "AxxClc";
    /** FDvzWks033: AngDbmTblCol <- ClrCol <- DvzWksChrAxx */
    public static final String DvzWksChrAxx_FKI_ClrCol = "ClrCol";
    /** FDvzWks034: AngQryClcCol <- ClrClc <- DvzWksChrAxx */
    public static final String DvzWksChrAxx_FKI_ClrClc = "ClrClc";
    /** FDvzWks035: AngDbmTblCol <- DscCol <- DvzWksChrAxx */
    public static final String DvzWksChrAxx_FKI_DscCol = "DscCol";
    /** FDvzWks036: AngQryClcCol <- DscClc <- DvzWksChrAxx */
    public static final String DvzWksChrAxx_FKI_DscClc = "DscClc";
    /** FDvzWks078: AngScmMdlFld <- AxxFld <- DvzWksChrAxx */
    public static final String DvzWksChrAxx_FKI_AxxFld = "AxxFld";
    /** FDvzWks079: AngScmMdlFld <- ClrFld <- DvzWksChrAxx */
    public static final String DvzWksChrAxx_FKI_ClrFld = "ClrFld";
    /** FDvzWks080: AngScmMdlFld <- DscFld <- DvzWksChrAxx */
    public static final String DvzWksChrAxx_FKI_DscFld = "DscFld";
    /** FDvzWks094: DvzWksQry <- DvzQry <- DvzWksChrAxx */
    public static final String DvzWksChrAxx_FKI_DvzQry = "DvzQry";

    /** Asse Y grafico Dataviz */
    public static final String DvzWksChrAxy = "DvzWksChrAxy";
    /** FDvzWks096: DvzWksChrAxy -> ClrRngLst -> DvzWksChrAxyClrRng */
    public static final String DvzWksChrAxy_FKO_ClrRngLst = "ClrRngLst";
    /** FLng000361: DvzWksChrAxy -> LngLst -> DvzWksChrAxyLng */
    public static final String DvzWksChrAxy_FKO_LngLst = "LngLst";
    /** FDvzWks037: DvzWksChr <- DvzChr <- DvzWksChrAxy */
    public static final String DvzWksChrAxy_FKI_DvzChr = "DvzChr";
    /** FDvzWks038: AngDbmTblCol <- AxyCol <- DvzWksChrAxy */
    public static final String DvzWksChrAxy_FKI_AxyCol = "AxyCol";
    /** FDvzWks039: AngQryClcCol <- AxyClc <- DvzWksChrAxy */
    public static final String DvzWksChrAxy_FKI_AxyClc = "AxyClc";
    /** FDvzWks040: AngQryAggFun <- Agg <- DvzWksChrAxy */
    public static final String DvzWksChrAxy_FKI_Agg = "Agg";
    /** FDvzWks081: AngScmMdlFld <- AxyFld <- DvzWksChrAxy */
    public static final String DvzWksChrAxy_FKI_AxyFld = "AxyFld";
    /** FDvzWks095: DvzWksQry <- DvzQry <- DvzWksChrAxy */
    public static final String DvzWksChrAxy_FKI_DvzQry = "DvzQry";

    /** Colorazione range asse Y */
    public static final String DvzWksChrAxyClrRng = "DvzWksChrAxyClrRng";
    /** FDvzWks096: DvzWksChrAxy <- ChrAxy <- DvzWksChrAxyClrRng */
    public static final String DvzWksChrAxyClrRng_FKI_ChrAxy = "ChrAxy";

    /** Traduzioni per DvzWksChrAxy */
    public static final String DvzWksChrAxyLng = "DvzWksChrAxyLng";
    /** FLng000361: DvzWksChrAxy <- Rec <- DvzWksChrAxyLng */
    public static final String DvzWksChrAxyLng_FKI_Rec = "Rec";
    /** FLng000362: AngLng <- Lng <- DvzWksChrAxyLng */
    public static final String DvzWksChrAxyLng_FKI_Lng = "Lng";

    /** Gantt Dataviz */
    public static final String DvzWksGnt = "DvzWksGnt";
    /** FDvzWks051: DvzWksGnt -> GntColLst -> DvzWksGntCol */
    public static final String DvzWksGnt_FKO_GntColLst = "GntColLst";
    /** FDvzWks054: DvzWksGnt -> GrpLst -> DvzWksGntGrp */
    public static final String DvzWksGnt_FKO_GrpLst = "GrpLst";
    /** FDvzWks059: DvzWksGnt -> LayLst -> DvzWksGntLay */
    public static final String DvzWksGnt_FKO_LayLst = "LayLst";
    /** FDvzWks041: SysWksWdg <- Wdg <- DvzWksGnt */
    public static final String DvzWksGnt_FKI_Wdg = "Wdg";
    /** FDvzWks042: DvzWksQry <- DvzQry <- DvzWksGnt */
    public static final String DvzWksGnt_FKI_DvzQry = "DvzQry";
    /** FDvzWks043: AngDbmTblCol <- StrCol <- DvzWksGnt */
    public static final String DvzWksGnt_FKI_StrCol = "StrCol";
    /** FDvzWks044: AngQryClcCol <- StrClc <- DvzWksGnt */
    public static final String DvzWksGnt_FKI_StrClc = "StrClc";
    /** FDvzWks045: AngDbmTblCol <- EndCol <- DvzWksGnt */
    public static final String DvzWksGnt_FKI_EndCol = "EndCol";
    /** FDvzWks046: AngQryClcCol <- EndClc <- DvzWksGnt */
    public static final String DvzWksGnt_FKI_EndClc = "EndClc";
    /** FDvzWks047: AngDbmTblCol <- ClrCol <- DvzWksGnt */
    public static final String DvzWksGnt_FKI_ClrCol = "ClrCol";
    /** FDvzWks048: AngQryClcCol <- ClrClc <- DvzWksGnt */
    public static final String DvzWksGnt_FKI_ClrClc = "ClrClc";
    /** FDvzWks049: AngDbmTblCol <- DayCol <- DvzWksGnt */
    public static final String DvzWksGnt_FKI_DayCol = "DayCol";
    /** FDvzWks050: AngQryClcCol <- DayClc <- DvzWksGnt */
    public static final String DvzWksGnt_FKI_DayClc = "DayClc";
    /** FDvzWks065: AngDbmTblCol <- LblLftCol <- DvzWksGnt */
    public static final String DvzWksGnt_FKI_LblLftCol = "LblLftCol";
    /** FDvzWks066: AngQryClcCol <- LblLftClc <- DvzWksGnt */
    public static final String DvzWksGnt_FKI_LblLftClc = "LblLftClc";
    /** FDvzWks067: AngDbmTblCol <- LblMidCol <- DvzWksGnt */
    public static final String DvzWksGnt_FKI_LblMidCol = "LblMidCol";
    /** FDvzWks068: AngQryClcCol <- LblMidClc <- DvzWksGnt */
    public static final String DvzWksGnt_FKI_LblMidClc = "LblMidClc";
    /** FDvzWks069: AngDbmTblCol <- LblRgtCol <- DvzWksGnt */
    public static final String DvzWksGnt_FKI_LblRgtCol = "LblRgtCol";
    /** FDvzWks070: AngQryClcCol <- LblRgtClc <- DvzWksGnt */
    public static final String DvzWksGnt_FKI_LblRgtClc = "LblRgtClc";
    /** FDvzWks082: AngScmMdlFld <- StrFld <- DvzWksGnt */
    public static final String DvzWksGnt_FKI_StrFld = "StrFld";
    /** FDvzWks083: AngScmMdlFld <- EndFld <- DvzWksGnt */
    public static final String DvzWksGnt_FKI_EndFld = "EndFld";
    /** FDvzWks084: AngScmMdlFld <- ClrFld <- DvzWksGnt */
    public static final String DvzWksGnt_FKI_ClrFld = "ClrFld";
    /** FDvzWks085: AngScmMdlFld <- DayFld <- DvzWksGnt */
    public static final String DvzWksGnt_FKI_DayFld = "DayFld";
    /** FDvzWks091: AngScmMdlFld <- LblLftFld <- DvzWksGnt */
    public static final String DvzWksGnt_FKI_LblLftFld = "LblLftFld";
    /** FDvzWks092: AngScmMdlFld <- LblMidFld <- DvzWksGnt */
    public static final String DvzWksGnt_FKI_LblMidFld = "LblMidFld";
    /** FDvzWks093: AngScmMdlFld <- LblRgtFld <- DvzWksGnt */
    public static final String DvzWksGnt_FKI_LblRgtFld = "LblRgtFld";

    /** Colonna gantt Dataviz */
    public static final String DvzWksGntCol = "DvzWksGntCol";
    /** FDvzWks051: DvzWksGnt <- DvzGnt <- DvzWksGntCol */
    public static final String DvzWksGntCol_FKI_DvzGnt = "DvzGnt";
    /** FDvzWks052: AngDbmTblCol <- GntColCol <- DvzWksGntCol */
    public static final String DvzWksGntCol_FKI_GntColCol = "GntColCol";
    /** FDvzWks053: AngQryClcCol <- GntColClc <- DvzWksGntCol */
    public static final String DvzWksGntCol_FKI_GntColClc = "GntColClc";
    /** FDvzWks086: AngScmMdlFld <- GntColFld <- DvzWksGntCol */
    public static final String DvzWksGntCol_FKI_GntColFld = "GntColFld";

    /** Raggruppamento gantt Dataviz */
    public static final String DvzWksGntGrp = "DvzWksGntGrp";
    /** FDvzWks054: DvzWksGnt <- DvzGnt <- DvzWksGntGrp */
    public static final String DvzWksGntGrp_FKI_DvzGnt = "DvzGnt";
    /** FDvzWks055: AngDbmTblCol <- GrpCol <- DvzWksGntGrp */
    public static final String DvzWksGntGrp_FKI_GrpCol = "GrpCol";
    /** FDvzWks056: AngQryClcCol <- GrpClc <- DvzWksGntGrp */
    public static final String DvzWksGntGrp_FKI_GrpClc = "GrpClc";
    /** FDvzWks057: AngDbmTblCol <- DscCol <- DvzWksGntGrp */
    public static final String DvzWksGntGrp_FKI_DscCol = "DscCol";
    /** FDvzWks058: AngQryClcCol <- DscClc <- DvzWksGntGrp */
    public static final String DvzWksGntGrp_FKI_DscClc = "DscClc";
    /** FDvzWks087: AngScmMdlFld <- GrpFld <- DvzWksGntGrp */
    public static final String DvzWksGntGrp_FKI_GrpFld = "GrpFld";
    /** FDvzWks088: AngScmMdlFld <- DscFld <- DvzWksGntGrp */
    public static final String DvzWksGntGrp_FKI_DscFld = "DscFld";

    /** Layer gantt Dataviz */
    public static final String DvzWksGntLay = "DvzWksGntLay";
    /** FLng000363: DvzWksGntLay -> LngLst -> DvzWksGntLayLng */
    public static final String DvzWksGntLay_FKO_LngLst = "LngLst";
    /** FDvzWks059: DvzWksGnt <- DvzGnt <- DvzWksGntLay */
    public static final String DvzWksGntLay_FKI_DvzGnt = "DvzGnt";
    /** FDvzWks060: AngDvzGntLayTyp <- GntLayTyp <- DvzWksGntLay */
    public static final String DvzWksGntLay_FKI_GntLayTyp = "GntLayTyp";
    /** FDvzWks061: AngDbmTblCol <- TssCol <- DvzWksGntLay */
    public static final String DvzWksGntLay_FKI_TssCol = "TssCol";
    /** FDvzWks062: AngQryClcCol <- TssClc <- DvzWksGntLay */
    public static final String DvzWksGntLay_FKI_TssClc = "TssClc";
    /** FDvzWks063: AngDbmTblCol <- DayCol <- DvzWksGntLay */
    public static final String DvzWksGntLay_FKI_DayCol = "DayCol";
    /** FDvzWks064: AngQryClcCol <- DayClc <- DvzWksGntLay */
    public static final String DvzWksGntLay_FKI_DayClc = "DayClc";
    /** FDvzWks089: AngScmMdlFld <- TssFld <- DvzWksGntLay */
    public static final String DvzWksGntLay_FKI_TssFld = "TssFld";
    /** FDvzWks090: AngScmMdlFld <- DayFld <- DvzWksGntLay */
    public static final String DvzWksGntLay_FKI_DayFld = "DayFld";

    /** Traduzioni per DvzWksGntLay */
    public static final String DvzWksGntLayLng = "DvzWksGntLayLng";
    /** FLng000363: DvzWksGntLay <- Rec <- DvzWksGntLayLng */
    public static final String DvzWksGntLayLng_FKI_Rec = "Rec";
    /** FLng000364: AngLng <- Lng <- DvzWksGntLayLng */
    public static final String DvzWksGntLayLng_FKI_Lng = "Lng";

    /** Provider Dataviz */
    public static final String DvzWksQry = "DvzWksQry";
    /** FDvzWks005: DvzWksQry -> PrmLst -> DvzWksQryPrm */
    public static final String DvzWksQry_FKO_PrmLst = "PrmLst";
    /** FDvzWks009: DvzWksQry -> FltLst -> DvzWksQryFlt */
    public static final String DvzWksQry_FKO_FltLst = "FltLst";
    /** FDvzWks013: DvzWksQry -> FmtLst -> DvzWksQryFmt */
    public static final String DvzWksQry_FKO_FmtLst = "FmtLst";
    /** FDvzWks017: DvzWksQry -> DsgLst -> DvzWksQryDsg */
    public static final String DvzWksQry_FKO_DsgLst = "DsgLst";
    /** FDvzWks028: DvzWksQry -> ChrLst -> DvzWksChr */
    public static final String DvzWksQry_FKO_ChrLst = "ChrLst";
    /** FDvzWks042: DvzWksQry -> GntLst -> DvzWksGnt */
    public static final String DvzWksQry_FKO_GntLst = "GntLst";
    /** FDvzWks094: DvzWksQry -> ChrAxxLst -> DvzWksChrAxx */
    public static final String DvzWksQry_FKO_ChrAxxLst = "ChrAxxLst";
    /** FDvzWks095: DvzWksQry -> ChrAxyLst -> DvzWksChrAxy */
    public static final String DvzWksQry_FKO_ChrAxyLst = "ChrAxyLst";
    /** FLng000355: DvzWksQry -> LngLst -> DvzWksQryLng */
    public static final String DvzWksQry_FKO_LngLst = "LngLst";
    /** FDvzWks002: SysWksWdg <- Wdg <- DvzWksQry */
    public static final String DvzWksQry_FKI_Wdg = "Wdg";
    /** FDvzWks003: SysWks <- Wks <- DvzWksQry */
    public static final String DvzWksQry_FKI_Wks = "Wks";
    /** FDvzWks004: AngQry <- Qry <- DvzWksQry */
    public static final String DvzWksQry_FKI_Qry = "Qry";

    /** Design condizionale tabella Dataviz */
    public static final String DvzWksQryDsg = "DvzWksQryDsg";
    /** FDvzWks018: DvzWksQryDsg -> StyLst -> DvzWksQryDsgSty */
    public static final String DvzWksQryDsg_FKO_StyLst = "StyLst";
    /** FLng000357: DvzWksQryDsg -> LngLst -> DvzWksQryDsgLng */
    public static final String DvzWksQryDsg_FKO_LngLst = "LngLst";
    /** FDvzWks017: DvzWksQry <- DvzQry <- DvzWksQryDsg */
    public static final String DvzWksQryDsg_FKI_DvzQry = "DvzQry";

    /** Condizione di stile tabella Dataviz */
    public static final String DvzWksQryDsgFlt = "DvzWksQryDsgFlt";
    /** FDvzWks021: DvzWksQryDsgSty <- DvzSty <- DvzWksQryDsgFlt */
    public static final String DvzWksQryDsgFlt_FKI_DvzSty = "DvzSty";
    /** FDvzWks022: AngDbmTblCol <- FltCol <- DvzWksQryDsgFlt */
    public static final String DvzWksQryDsgFlt_FKI_FltCol = "FltCol";
    /** FDvzWks023: AngQryClcCol <- FltClc <- DvzWksQryDsgFlt */
    public static final String DvzWksQryDsgFlt_FKI_FltClc = "FltClc";
    /** FDvzWks024: AngDbmTblCol <- ValCol <- DvzWksQryDsgFlt */
    public static final String DvzWksQryDsgFlt_FKI_ValCol = "ValCol";
    /** FDvzWks025: AngQryClcCol <- ValClc <- DvzWksQryDsgFlt */
    public static final String DvzWksQryDsgFlt_FKI_ValClc = "ValClc";
    /** FDvzWks026: SysWksPrm <- ValWksPrm <- DvzWksQryDsgFlt */
    public static final String DvzWksQryDsgFlt_FKI_ValWksPrm = "ValWksPrm";
    /** FDvzWks076: AngScmMdlFld <- FltFld <- DvzWksQryDsgFlt */
    public static final String DvzWksQryDsgFlt_FKI_FltFld = "FltFld";
    /** FDvzWks077: AngScmMdlFld <- ValFld <- DvzWksQryDsgFlt */
    public static final String DvzWksQryDsgFlt_FKI_ValFld = "ValFld";

    /** Traduzioni per DvzWksQryDsg */
    public static final String DvzWksQryDsgLng = "DvzWksQryDsgLng";
    /** FLng000357: DvzWksQryDsg <- Rec <- DvzWksQryDsgLng */
    public static final String DvzWksQryDsgLng_FKI_Rec = "Rec";
    /** FLng000358: AngLng <- Lng <- DvzWksQryDsgLng */
    public static final String DvzWksQryDsgLng_FKI_Lng = "Lng";

    /** Stile condizionale tabella Dataviz */
    public static final String DvzWksQryDsgSty = "DvzWksQryDsgSty";
    /** FDvzWks021: DvzWksQryDsgSty -> FltLst -> DvzWksQryDsgFlt */
    public static final String DvzWksQryDsgSty_FKO_FltLst = "FltLst";
    /** FLng000359: DvzWksQryDsgSty -> LngLst -> DvzWksQryDsgStyLng */
    public static final String DvzWksQryDsgSty_FKO_LngLst = "LngLst";
    /** FDvzWks018: DvzWksQryDsg <- DvzDsg <- DvzWksQryDsgSty */
    public static final String DvzWksQryDsgSty_FKI_DvzDsg = "DvzDsg";
    /** FDvzWks019: AngDbmTblCol <- StyCol <- DvzWksQryDsgSty */
    public static final String DvzWksQryDsgSty_FKI_StyCol = "StyCol";
    /** FDvzWks020: AngQryClcCol <- StyClc <- DvzWksQryDsgSty */
    public static final String DvzWksQryDsgSty_FKI_StyClc = "StyClc";
    /** FDvzWks075: AngScmMdlFld <- StyFld <- DvzWksQryDsgSty */
    public static final String DvzWksQryDsgSty_FKI_StyFld = "StyFld";

    /** Traduzioni per DvzWksQryDsgSty */
    public static final String DvzWksQryDsgStyLng = "DvzWksQryDsgStyLng";
    /** FLng000359: DvzWksQryDsgSty <- Rec <- DvzWksQryDsgStyLng */
    public static final String DvzWksQryDsgStyLng_FKI_Rec = "Rec";
    /** FLng000360: AngLng <- Lng <- DvzWksQryDsgStyLng */
    public static final String DvzWksQryDsgStyLng_FKI_Lng = "Lng";

    /** Filtro provider Dataviz */
    public static final String DvzWksQryFlt = "DvzWksQryFlt";
    /** FDvzWks009: DvzWksQry <- DvzQry <- DvzWksQryFlt */
    public static final String DvzWksQryFlt_FKI_DvzQry = "DvzQry";
    /** FDvzWks010: AngDbmTblCol <- FltCol <- DvzWksQryFlt */
    public static final String DvzWksQryFlt_FKI_FltCol = "FltCol";
    /** FDvzWks011: AngDbmTblCol <- ValCol <- DvzWksQryFlt */
    public static final String DvzWksQryFlt_FKI_ValCol = "ValCol";
    /** FDvzWks012: SysWksPrm <- ValWksPrm <- DvzWksQryFlt */
    public static final String DvzWksQryFlt_FKI_ValWksPrm = "ValWksPrm";
    /** FDvzWks072: AngScmMdlFld <- FltFld <- DvzWksQryFlt */
    public static final String DvzWksQryFlt_FKI_FltFld = "FltFld";
    /** FDvzWks073: AngScmMdlFld <- ValFld <- DvzWksQryFlt */
    public static final String DvzWksQryFlt_FKI_ValFld = "ValFld";

    /** Formattazione provider Dataviz */
    public static final String DvzWksQryFmt = "DvzWksQryFmt";
    /** FDvzWks013: DvzWksQry <- DvzQry <- DvzWksQryFmt */
    public static final String DvzWksQryFmt_FKI_DvzQry = "DvzQry";
    /** FDvzWks014: AngDbmTblCol <- FmtCol <- DvzWksQryFmt */
    public static final String DvzWksQryFmt_FKI_FmtCol = "FmtCol";
    /** FDvzWks015: AngQryClcCol <- FmtClc <- DvzWksQryFmt */
    public static final String DvzWksQryFmt_FKI_FmtClc = "FmtClc";
    /** FDvzWks016: AngQryAggFun <- Agg <- DvzWksQryFmt */
    public static final String DvzWksQryFmt_FKI_Agg = "Agg";
    /** FDvzWks074: AngScmMdlFld <- FmtFld <- DvzWksQryFmt */
    public static final String DvzWksQryFmt_FKI_FmtFld = "FmtFld";

    /** Traduzioni per DvzWksQry */
    public static final String DvzWksQryLng = "DvzWksQryLng";
    /** FLng000355: DvzWksQry <- Rec <- DvzWksQryLng */
    public static final String DvzWksQryLng_FKI_Rec = "Rec";
    /** FLng000356: AngLng <- Lng <- DvzWksQryLng */
    public static final String DvzWksQryLng_FKI_Lng = "Lng";

    /** Parametro popolati da Dataviz */
    public static final String DvzWksQryPrm = "DvzWksQryPrm";
    /** FDvzWks005: DvzWksQry <- DvzQry <- DvzWksQryPrm */
    public static final String DvzWksQryPrm_FKI_DvzQry = "DvzQry";
    /** FDvzWks006: SysWksPrm <- WksPrm <- DvzWksQryPrm */
    public static final String DvzWksQryPrm_FKI_WksPrm = "WksPrm";
    /** FDvzWks007: AngDbmTblCol <- PrmCol <- DvzWksQryPrm */
    public static final String DvzWksQryPrm_FKI_PrmCol = "PrmCol";
    /** FDvzWks008: AngQryClcCol <- PrmClc <- DvzWksQryPrm */
    public static final String DvzWksQryPrm_FKI_PrmClc = "PrmClc";
    /** FDvzWks071: AngScmMdlFld <- PrmFld <- DvzWksQryPrm */
    public static final String DvzWksQryPrm_FKI_PrmFld = "PrmFld";

    /** Elemento mailing list */
    public static final String EmaCro = "EmaCro";
    /** FSysEma009: EmaCro -> PrmLst -> EmaCroPrm */
    public static final String EmaCro_FKO_PrmLst = "PrmLst";
    /** FSysEma005: AngDatSet <- DatSet <- EmaCro */
    public static final String EmaCro_FKI_DatSet = "DatSet";
    /** FSysEma006: EmaLst <- EmaLst <- EmaCro */
    public static final String EmaCro_FKI_EmaLst = "EmaLst";
    /** FSysEma007: AngEmaSrv <- Srv <- EmaCro */
    public static final String EmaCro_FKI_Srv = "Srv";
    /** FSysEma008: EmaCroTpl <- Tpl <- EmaCro */
    public static final String EmaCro_FKI_Tpl = "Tpl";

    /** Parametro data-set email periodica */
    public static final String EmaCroPrm = "EmaCroPrm";
    /** FSysEma009: EmaCro <- EmaCro <- EmaCroPrm */
    public static final String EmaCroPrm_FKI_EmaCro = "EmaCro";
    /** FSysEma010: AngDatSetPrm <- DatSetPrm <- EmaCroPrm */
    public static final String EmaCroPrm_FKI_DatSetPrm = "DatSetPrm";

    /** Template email periodica */
    public static final String EmaCroTpl = "EmaCroTpl";
    /** FSysEma008: EmaCroTpl -> EmaCroLst -> EmaCro */
    public static final String EmaCroTpl_FKO_EmaCroLst = "EmaCroLst";

    /** Log invio email */
    public static final String EmaLog = "EmaLog";
    /** FLng000371: EmaLog -> LngLst -> EmaLogLng */
    public static final String EmaLog_FKO_LngLst = "LngLst";

    /** Traduzioni per EmaLog */
    public static final String EmaLogLng = "EmaLogLng";
    /** FLng000371: EmaLog <- Rec <- EmaLogLng */
    public static final String EmaLogLng_FKI_Rec = "Rec";
    /** FLng000372: AngLng <- Lng <- EmaLogLng */
    public static final String EmaLogLng_FKI_Lng = "Lng";

    /** Mailing list */
    public static final String EmaLst = "EmaLst";
    /** FLng000369: EmaLst -> LngLst -> EmaLstLng */
    public static final String EmaLst_FKO_LngLst = "LngLst";
    /** FSysEma002: EmaLst -> EleLst -> EmaLstEle */
    public static final String EmaLst_FKO_EleLst = "EleLst";
    /** FSysEma006: EmaLst -> CroLst -> EmaCro */
    public static final String EmaLst_FKO_CroLst = "CroLst";

    /** Elemento mailing list */
    public static final String EmaLstEle = "EmaLstEle";
    /** FSysEma002: EmaLst <- EmaLst <- EmaLstEle */
    public static final String EmaLstEle_FKI_EmaLst = "EmaLst";
    /** FSysEma003: AngRes <- Res <- EmaLstEle */
    public static final String EmaLstEle_FKI_Res = "Res";
    /** FSysEma004: AngGrp <- Grp <- EmaLstEle */
    public static final String EmaLstEle_FKI_Grp = "Grp";

    /** Traduzioni per EmaLst */
    public static final String EmaLstLng = "EmaLstLng";
    /** FLng000369: EmaLst <- Rec <- EmaLstLng */
    public static final String EmaLstLng_FKI_Rec = "Rec";
    /** FLng000370: AngLng <- Lng <- EmaLstLng */
    public static final String EmaLstLng_FKI_Lng = "Lng";

    /** Esplosione calendari progetto */
    public static final String GenCal = "GenCal";
    /** FSysCal012: AngDay <- Day <- GenCal */
    public static final String GenCal_FKI_Day = "Day";
    /** FSysCal013: AngCal <- Cal <- GenCal */
    public static final String GenCal_FKI_Cal = "Cal";

    /** Disponibilità calendari */
    public static final String GenCalAvl = "GenCalAvl";
    /** FSysCal015: AngRes <- Res <- GenCalAvl */
    public static final String GenCalAvl_FKI_Res = "Res";
    /** FSysCal017: AngDay <- Day <- GenCalAvl */
    public static final String GenCalAvl_FKI_Day = "Day";
    /** FSysCal018: AngCal <- Cal <- GenCalAvl */
    public static final String GenCalAvl_FKI_Cal = "Cal";

    /** Valori codifica */
    public static final String GenCodVal = "GenCodVal";
    /** FSysCod002: AngCodRul <- CodRul <- GenCodVal */
    public static final String GenCodVal_FKI_CodRul = "CodRul";

    /** Cambi valute */
    public static final String GenCurDayExc = "GenCurDayExc";
    /** FSysGeo001: AngCur <- SrcCur <- GenCurDayExc */
    public static final String GenCurDayExc_FKI_SrcCur = "SrcCur";
    /** FSysGeo002: AngCur <- TrgCur <- GenCurDayExc */
    public static final String GenCurDayExc_FKI_TrgCur = "TrgCur";

    /** Membri gruppo per livello */
    public static final String GenOrgLvlGrp = "GenOrgLvlGrp";
    /** FSysOrg063: OrgLvl <- Lvl <- GenOrgLvlGrp */
    public static final String GenOrgLvlGrp_FKI_Lvl = "Lvl";
    /** FSysOrg064: AngGrp <- Grp <- GenOrgLvlGrp */
    public static final String GenOrgLvlGrp_FKI_Grp = "Grp";

    /** Risorse responsabili per livello */
    public static final String GenOrgLvlMan = "GenOrgLvlMan";
    /** FSysOrg012: OrgLvl <- Lvl <- GenOrgLvlMan */
    public static final String GenOrgLvlMan_FKI_Lvl = "Lvl";
    /** FSysOrg013: AngRes <- Res <- GenOrgLvlMan */
    public static final String GenOrgLvlMan_FKI_Res = "Res";

    /** Membri risorsa per livello */
    public static final String GenOrgLvlRes = "GenOrgLvlRes";
    /** FSysOrg015: AngRes <- Res <- GenOrgLvlRes */
    public static final String GenOrgLvlRes_FKI_Res = "Res";
    /** FSysOrg016: OrgLvl <- Lvl <- GenOrgLvlRes */
    public static final String GenOrgLvlRes_FKI_Lvl = "Lvl";

    /** Matricola */
    public static final String ItmSerNum = "ItmSerNum";
    /** FLng000079: ItmSerNum -> LngLst -> ItmSerNumLng */
    public static final String ItmSerNum_FKO_LngLst = "LngLst";
    /** FSysItm012: AngItm <- Itm <- ItmSerNum */
    public static final String ItmSerNum_FKI_Itm = "Itm";

    /** Traduzioni per ItmSerNum */
    public static final String ItmSerNumLng = "ItmSerNumLng";
    /** FLng000079: ItmSerNum <- Rec <- ItmSerNumLng */
    public static final String ItmSerNumLng_FKI_Rec = "Rec";
    /** FLng000080: AngLng <- Lng <- ItmSerNumLng */
    public static final String ItmSerNumLng_FKI_Lng = "Lng";

    /** Gruppi */
    public static final String JstGrp = "JstGrp";
    /** FSysJst001: JstGrp -> JobLst -> JstJob */
    public static final String JstGrp_FKO_JobLst = "JobLst";
    /** FSysJst004: JstGrp -> TrgLst -> JstTrg */
    public static final String JstGrp_FKO_TrgLst = "TrgLst";

    /** Jobs */
    public static final String JstJob = "JstJob";
    /** FSysJst005: JstJob -> Sta -> JstJobSts */
    public static final String JstJob_FKO_Sta = "Sta";
    /** FSysJst009: JstJob -> PrmLst -> JstJobPrm */
    public static final String JstJob_FKO_PrmLst = "PrmLst";
    /** FSysJst010: JstJob -> LogLst -> JstJobLog */
    public static final String JstJob_FKO_LogLst = "LogLst";
    /** FSysJst011: JstJob -> TrgLst -> JstTrgJob */
    public static final String JstJob_FKO_TrgLst = "TrgLst";
    /** FSysJst001: JstGrp <- Grp <- JstJob */
    public static final String JstJob_FKI_Grp = "Grp";
    /** FSysJst002: AngRes <- Res <- JstJob */
    public static final String JstJob_FKI_Res = "Res";
    /** FSysJst003: AngLng <- Lng <- JstJob */
    public static final String JstJob_FKI_Lng = "Lng";

    /** Logs Jobs */
    public static final String JstJobLog = "JstJobLog";
    /** FSysJst010: JstJob <- Job <- JstJobLog */
    public static final String JstJobLog_FKI_Job = "Job";

    /** Parametri Jobs */
    public static final String JstJobPrm = "JstJobPrm";
    /** FSysJst009: JstJob <- Job <- JstJobPrm */
    public static final String JstJobPrm_FKI_Job = "Job";

    /** Statistiche Jobs */
    public static final String JstJobSts = "JstJobSts";
    /** FSysJst005: JstJob <- Job <- JstJobSts */
    public static final String JstJobSts_FKI_Job = "Job";
    /** FSysJst006: JstTrg <- LstTrg <- JstJobSts */
    public static final String JstJobSts_FKI_LstTrg = "LstTrg";
    /** FSysJst007: JstTrg <- FaiTrg <- JstJobSts */
    public static final String JstJobSts_FKI_FaiTrg = "FaiTrg";
    /** FSysJst008: JstTrg <- MaxTrg <- JstJobSts */
    public static final String JstJobSts_FKI_MaxTrg = "MaxTrg";

    /** Triggers */
    public static final String JstTrg = "JstTrg";
    /** FSysJst006: JstTrg -> StsLstLst -> JstJobSts */
    public static final String JstTrg_FKO_StsLstLst = "StsLstLst";
    /** FSysJst007: JstTrg -> StsFaiLst -> JstJobSts */
    public static final String JstTrg_FKO_StsFaiLst = "StsFaiLst";
    /** FSysJst008: JstTrg -> StsMaxLst -> JstJobSts */
    public static final String JstTrg_FKO_StsMaxLst = "StsMaxLst";
    /** FSysJst012: JstTrg -> JobLst -> JstTrgJob */
    public static final String JstTrg_FKO_JobLst = "JobLst";
    /** FSysJst004: JstGrp <- Grp <- JstTrg */
    public static final String JstTrg_FKI_Grp = "Grp";

    /** Trigger-Job */
    public static final String JstTrgJob = "JstTrgJob";
    /** FSysJst011: JstJob <- Job <- JstTrgJob */
    public static final String JstTrgJob_FKI_Job = "Job";
    /** FSysJst012: JstTrg <- Trg <- JstTrgJob */
    public static final String JstTrgJob_FKI_Trg = "Trg";

    /** Notifiche */
    public static final String MncNot = "MncNot";
    /** FSysMnc016: MncNot -> QueNotLst -> QueMncNot */
    public static final String MncNot_FKO_QueNotLst = "QueNotLst";
    /** FSysMnc017: MncNot -> EtyAttNotLst -> MncNotEtyAtt */
    public static final String MncNot_FKO_EtyAttNotLst = "EtyAttNotLst";
    /** FSysMnc005: AngRes <- Res <- MncNot */
    public static final String MncNot_FKI_Res = "Res";
    /** FSysMnc006: AngNotTyp <- Typ <- MncNot */
    public static final String MncNot_FKI_Typ = "Typ";
    /** FSysMnc007: AngDbmTbl <- Tbl <- MncNot */
    public static final String MncNot_FKI_Tbl = "Tbl";

    /** Associazione notifica/allegato */
    public static final String MncNotEtyAtt = "MncNotEtyAtt";
    /** FSysMnc017: MncNot <- Not <- MncNotEtyAtt */
    public static final String MncNotEtyAtt_FKI_Not = "Not";
    /** FSysMnc018: AngEtyAtt <- Att <- MncNotEtyAtt */
    public static final String MncNotEtyAtt_FKI_Att = "Att";

    /** Token notifiche push */
    public static final String MncNotPshTkn = "MncNotPshTkn";
    /** FSysMnc020: AngRes <- Res <- MncNotPshTkn */
    public static final String MncNotPshTkn_FKI_Res = "Res";

    /** Mobile app tokens */
    public static final String MobAppTkn = "MobAppTkn";
    /** FSysMnc001: AngMobApp <- App <- MobAppTkn */
    public static final String MobAppTkn_FKI_App = "App";
    /** FSysMnc002: AngRes <- Res <- MobAppTkn */
    public static final String MobAppTkn_FKI_Res = "Res";

    /** Organigrammi */
    public static final String Org = "Org";
    /** FSysOrg001: Org -> LvlLst -> OrgLvl */
    public static final String Org_FKO_LvlLst = "LvlLst";
    /** FSysOrg014: AngOrgTyp <- Typ <- Org */
    public static final String Org_FKI_Typ = "Typ";

    /** Livelli organigramma */
    public static final String OrgLvl = "OrgLvl";
    /** FSysItm063: OrgLvl -> PrdPrcLst -> AngPrdPrc */
    public static final String OrgLvl_FKO_PrdPrcLst = "PrdPrcLst";
    /** FSysItm135: OrgLvl -> ItmLvlSugLst -> AngItmLvlSug */
    public static final String OrgLvl_FKO_ItmLvlSugLst = "ItmLvlSugLst";
    /** FSysOpt002: OrgLvl -> OptLst -> OrgLvlOpt */
    public static final String OrgLvl_FKO_OptLst = "OptLst";
    /** FSysOrg003: OrgLvl -> LvlLst -> OrgLvl */
    public static final String OrgLvl_FKO_LvlLst = "LvlLst";
    /** FSysOrg004: OrgLvl -> ResLst -> OrgLvlRes */
    public static final String OrgLvl_FKO_ResLst = "ResLst";
    /** FSysOrg006: OrgLvl -> ManResLst -> OrgLvlManRes */
    public static final String OrgLvl_FKO_ManResLst = "ManResLst";
    /** FSysOrg009: OrgLvl -> ManGrpLst -> OrgLvlManGrp */
    public static final String OrgLvl_FKO_ManGrpLst = "ManGrpLst";
    /** FSysOrg012: OrgLvl -> GenManResLst -> GenOrgLvlMan */
    public static final String OrgLvl_FKO_GenManResLst = "GenManResLst";
    /** FSysOrg016: OrgLvl -> GenResResLst -> GenOrgLvlRes */
    public static final String OrgLvl_FKO_GenResResLst = "GenResResLst";
    /** FSysOrg055: OrgLvl -> GrpLst -> OrgLvlGrp */
    public static final String OrgLvl_FKO_GrpLst = "GrpLst";
    /** FSysOrg063: OrgLvl -> GenGrpLst -> GenOrgLvlGrp */
    public static final String OrgLvl_FKO_GenGrpLst = "GenGrpLst";
    /** FSysOrg001: Org <- Org <- OrgLvl */
    public static final String OrgLvl_FKI_Org = "Org";
    /** FSysOrg002: AngOrgLvlTyp <- LvlTyp <- OrgLvl */
    public static final String OrgLvl_FKI_LvlTyp = "LvlTyp";
    /** FSysOrg003: OrgLvl <- LvlRef <- OrgLvl */
    public static final String OrgLvl_FKI_LvlRef = "LvlRef";
    /** FSysOrg061: AngRes <- RepRes <- OrgLvl */
    public static final String OrgLvl_FKI_RepRes = "RepRes";
    /** FSysOrg062: AngGrp <- RepGrp <- OrgLvl */
    public static final String OrgLvl_FKI_RepGrp = "RepGrp";

    /** Gruppi membri per livello organigramma */
    public static final String OrgLvlGrp = "OrgLvlGrp";
    /** FSysOrg055: OrgLvl <- Lvl <- OrgLvlGrp */
    public static final String OrgLvlGrp_FKI_Lvl = "Lvl";
    /** FSysOrg056: AngGrp <- Grp <- OrgLvlGrp */
    public static final String OrgLvlGrp_FKI_Grp = "Grp";

    /** Gruppi responsabili organigramma */
    public static final String OrgLvlManGrp = "OrgLvlManGrp";
    /** FSysOrg009: OrgLvl <- Lvl <- OrgLvlManGrp */
    public static final String OrgLvlManGrp_FKI_Lvl = "Lvl";
    /** FSysOrg010: AngGrp <- Grp <- OrgLvlManGrp */
    public static final String OrgLvlManGrp_FKI_Grp = "Grp";
    /** FSysOrg011: AngOrgRol <- Rol <- OrgLvlManGrp */
    public static final String OrgLvlManGrp_FKI_Rol = "Rol";

    /** Risorse responsabili organigramma */
    public static final String OrgLvlManRes = "OrgLvlManRes";
    /** FSysOrg006: OrgLvl <- Lvl <- OrgLvlManRes */
    public static final String OrgLvlManRes_FKI_Lvl = "Lvl";
    /** FSysOrg007: AngRes <- Res <- OrgLvlManRes */
    public static final String OrgLvlManRes_FKI_Res = "Res";
    /** FSysOrg008: AngOrgRol <- Rol <- OrgLvlManRes */
    public static final String OrgLvlManRes_FKI_Rol = "Rol";

    /** Opzioni livello */
    public static final String OrgLvlOpt = "OrgLvlOpt";
    /** FSysOpt002: OrgLvl <- Lvl <- OrgLvlOpt */
    public static final String OrgLvlOpt_FKI_Lvl = "Lvl";

    /** Membri livelli organigramma */
    public static final String OrgLvlRes = "OrgLvlRes";
    /** FSysOrg004: OrgLvl <- Lvl <- OrgLvlRes */
    public static final String OrgLvlRes_FKI_Lvl = "Lvl";
    /** FSysOrg005: AngRes <- Res <- OrgLvlRes */
    public static final String OrgLvlRes_FKI_Res = "Res";

    /** Coda notifiche da inviare */
    public static final String QueMncNot = "QueMncNot";
    /** FSysMnc016: MncNot <- Not <- QueMncNot */
    public static final String QueMncNot_FKI_Not = "Not";

    /** Proprietà server remoti */
    public static final String RemSrvPrp = "RemSrvPrp";
    /** FSysEnv012: AngRemSrv <- Srv <- RemSrvPrp */
    public static final String RemSrvPrp_FKI_Srv = "Srv";

    /** Modello di report */
    public static final String RepMdl = "RepMdl";
    /** FLng000341: RepMdl -> LngLst -> RepMdlLng */
    public static final String RepMdl_FKO_LngLst = "LngLst";
    /** FSysRep004: RepMdl -> RepMdlLngLst -> RepMdlLngVrs */
    public static final String RepMdl_FKO_RepMdlLngLst = "RepMdlLngLst";
    /** FSysRep008: RepMdl -> PrmLst -> RepMdlPrm */
    public static final String RepMdl_FKO_PrmLst = "PrmLst";
    /** FSysRep001: AngDbmTbl <- DbmTbl <- RepMdl */
    public static final String RepMdl_FKI_DbmTbl = "DbmTbl";
    /** FSysRep002: AngDatSet <- DatSet <- RepMdl */
    public static final String RepMdl_FKI_DatSet = "DatSet";
    /** FSysRep003: AngGrp <- AthGrp <- RepMdl */
    public static final String RepMdl_FKI_AthGrp = "AthGrp";
    /** FSysRep007: AngRepGenEng <- GenEng <- RepMdl */
    public static final String RepMdl_FKI_GenEng = "GenEng";

    /** Traduzioni per RepMdl */
    public static final String RepMdlLng = "RepMdlLng";
    /** FLng000341: RepMdl <- Rec <- RepMdlLng */
    public static final String RepMdlLng_FKI_Rec = "Rec";
    /** FLng000342: AngLng <- Lng <- RepMdlLng */
    public static final String RepMdlLng_FKI_Lng = "Lng";

    /** Versione modello di report in lingua */
    public static final String RepMdlLngVrs = "RepMdlLngVrs";
    /** FSysRep004: RepMdl <- RepMdl <- RepMdlLngVrs */
    public static final String RepMdlLngVrs_FKI_RepMdl = "RepMdl";
    /** FSysRep005: AngLng <- Lng <- RepMdlLngVrs */
    public static final String RepMdlLngVrs_FKI_Lng = "Lng";
    /** FSysRep006: AngEty <- Ety <- RepMdlLngVrs */
    public static final String RepMdlLngVrs_FKI_Ety = "Ety";

    /** Parametri del modello di report */
    public static final String RepMdlPrm = "RepMdlPrm";
    /** FSysRep008: RepMdl <- RepMdl <- RepMdlPrm */
    public static final String RepMdlPrm_FKI_RepMdl = "RepMdl";

    /** Contatti risorsa */
    public static final String ResCnt = "ResCnt";
    /** FSysMnc011: AngRes <- Res <- ResCnt */
    public static final String ResCnt_FKI_Res = "Res";
    /** FSysMnc012: AngCntTyp <- CntTyp <- ResCnt */
    public static final String ResCnt_FKI_CntTyp = "CntTyp";
    /** FSysMnc013: AngMobBot <- Bot <- ResCnt */
    public static final String ResCnt_FKI_Bot = "Bot";

    /** Storico password */
    public static final String ResPswLog = "ResPswLog";
    /** FSysRes010: AngRes <- Res <- ResPswLog */
    public static final String ResPswLog_FKI_Res = "Res";

    /** Gruppo di azioni */
    public static final String SysActGrp = "SysActGrp";
    /** FLng000039: SysActGrp -> LngLst -> SysActGrpLng */
    public static final String SysActGrp_FKO_LngLst = "LngLst";
    /** FSysAct001: SysActGrp -> GrpDetLst -> SysActGrpDet */
    public static final String SysActGrp_FKO_GrpDetLst = "GrpDetLst";
    /** FSysWks035: SysActGrp -> WksBtnActLst -> SysWksBtnAct */
    public static final String SysActGrp_FKO_WksBtnActLst = "WksBtnActLst";

    /** Azioni del gruppo */
    public static final String SysActGrpDet = "SysActGrpDet";
    /** FSysAct001: SysActGrp <- Grp <- SysActGrpDet */
    public static final String SysActGrpDet_FKI_Grp = "Grp";
    /** FSysAct002: AngSysAct <- Act <- SysActGrpDet */
    public static final String SysActGrpDet_FKI_Act = "Act";

    /** Traduzioni per SysActGrp */
    public static final String SysActGrpLng = "SysActGrpLng";
    /** FLng000039: SysActGrp <- Rec <- SysActGrpLng */
    public static final String SysActGrpLng_FKI_Rec = "Rec";
    /** FLng000040: AngLng <- Lng <- SysActGrpLng */
    public static final String SysActGrpLng_FKI_Lng = "Lng";

    /** Applicazioni */
    public static final String SysApp = "SysApp";
    /** FLng000179: SysApp -> LngLst -> SysAppLng */
    public static final String SysApp_FKO_LngLst = "LngLst";
    /** FSysApp002: SysApp -> CtxLst -> SysCtx */
    public static final String SysApp_FKO_CtxLst = "CtxLst";
    /** FSysApp004: SysApp -> PrmLst -> SysAppPrm */
    public static final String SysApp_FKO_PrmLst = "PrmLst";
    /** FSysApp010: SysApp -> RolLst -> AngResRol */
    public static final String SysApp_FKO_RolLst = "RolLst";
    /** FSysApp013: SysApp -> AppHomLst -> SysAppHom */
    public static final String SysApp_FKO_AppHomLst = "AppHomLst";
    /** FSysMnc003: SysApp -> NotTypCatLst -> AngNotTypCat */
    public static final String SysApp_FKO_NotTypCatLst = "NotTypCatLst";
    /** FSysUif006: SysApp -> MnuLst -> SysMnuApp */
    public static final String SysApp_FKO_MnuLst = "MnuLst";
    /** FSysUif013: SysApp -> FrmDsgLst -> SysFrmDsg */
    public static final String SysApp_FKO_FrmDsgLst = "FrmDsgLst";
    /** FSysUif015: SysApp -> DefMnuLst -> SysMnu */
    public static final String SysApp_FKO_DefMnuLst = "DefMnuLst";
    /** FSysUif016: SysApp -> MnuFavLst -> SysMnuResFav */
    public static final String SysApp_FKO_MnuFavLst = "MnuFavLst";
    /** FSysWks024: SysApp -> WksTypLst -> SysWksTypApp */
    public static final String SysApp_FKO_WksTypLst = "WksTypLst";
    /** FSysWks034: SysApp -> WksBtnActLst -> SysWksBtnAct */
    public static final String SysApp_FKO_WksBtnActLst = "WksBtnActLst";
    /** FSysApp001: AngGrp <- Grp <- SysApp */
    public static final String SysApp_FKI_Grp = "Grp";
    /** FSysApp011: AngThm <- Thm <- SysApp */
    public static final String SysApp_FKI_Thm = "Thm";

    /** Home page di una app */
    public static final String SysAppHom = "SysAppHom";
    /** FSysApp012: AngRes <- Res <- SysAppHom */
    public static final String SysAppHom_FKI_Res = "Res";
    /** FSysApp013: SysApp <- App <- SysAppHom */
    public static final String SysAppHom_FKI_App = "App";
    /** FSysApp014: AngRol <- Rol <- SysAppHom */
    public static final String SysAppHom_FKI_Rol = "Rol";

    /** Traduzioni per SysApp */
    public static final String SysAppLng = "SysAppLng";
    /** FLng000179: SysApp <- Rec <- SysAppLng */
    public static final String SysAppLng_FKI_Rec = "Rec";
    /** FLng000180: AngLng <- Lng <- SysAppLng */
    public static final String SysAppLng_FKI_Lng = "Lng";

    /** Parametri applicazione */
    public static final String SysAppPrm = "SysAppPrm";
    /** FSysApp004: SysApp <- App <- SysAppPrm */
    public static final String SysAppPrm_FKI_App = "App";
    /** FSysApp005: SysPrm <- Prm <- SysAppPrm */
    public static final String SysAppPrm_FKI_Prm = "Prm";

    /** Configurazione gerarchia classifiche */
    public static final String SysClsRefCfg = "SysClsRefCfg";
    /** FSysBas003: AngDbmTbl <- Tbl <- SysClsRefCfg */
    public static final String SysClsRefCfg_FKI_Tbl = "Tbl";

    /** Conti bancari azienda */
    public static final String SysCmpBnk = "SysCmpBnk";
    /** FSysGeo006: AngBnk <- Bnk <- SysCmpBnk */
    public static final String SysCmpBnk_FKI_Bnk = "Bnk";

    /** Contesto applicativo */
    public static final String SysCtx = "SysCtx";
    /** FLng000181: SysCtx -> LngLst -> SysCtxLng */
    public static final String SysCtx_FKO_LngLst = "LngLst";
    /** FSysApp003: SysCtx -> FrmLst -> SysFrm */
    public static final String SysCtx_FKO_FrmLst = "FrmLst";
    /** FSysApp006: SysCtx -> PrmLst -> SysCtxPrm */
    public static final String SysCtx_FKO_PrmLst = "PrmLst";
    /** FSysApp002: SysApp <- App <- SysCtx */
    public static final String SysCtx_FKI_App = "App";

    /** Traduzioni per SysCtx */
    public static final String SysCtxLng = "SysCtxLng";
    /** FLng000181: SysCtx <- Rec <- SysCtxLng */
    public static final String SysCtxLng_FKI_Rec = "Rec";
    /** FLng000182: AngLng <- Lng <- SysCtxLng */
    public static final String SysCtxLng_FKI_Lng = "Lng";

    /** Parametri contesto */
    public static final String SysCtxPrm = "SysCtxPrm";
    /** FSysApp006: SysCtx <- Ctx <- SysCtxPrm */
    public static final String SysCtxPrm_FKI_Ctx = "Ctx";
    /** FSysApp007: SysPrm <- Prm <- SysCtxPrm */
    public static final String SysCtxPrm_FKI_Prm = "Prm";

    /** Classi documentali */
    public static final String SysDocCls = "SysDocCls";
    /** FLng000345: SysDocCls -> LngLst -> SysDocClsLng */
    public static final String SysDocCls_FKO_LngLst = "LngLst";
    /** FSysDoc001: SysDocCls -> ExtLst -> SysDocClsExt */
    public static final String SysDocCls_FKO_ExtLst = "ExtLst";
    /** FSysDoc002: SysDocCls -> AttLst -> SysDocClsAtt */
    public static final String SysDocCls_FKO_AttLst = "AttLst";
    /** FSysDoc005: SysDocCls -> DocCtxLst -> SysDocClsCtx */
    public static final String SysDocCls_FKO_DocCtxLst = "DocCtxLst";
    /** FSysDoc020: SysDocCls -> DocLst -> AngEtyDoc */
    public static final String SysDocCls_FKO_DocLst = "DocLst";

    /** Attributi classe documentale */
    public static final String SysDocClsAtt = "SysDocClsAtt";
    /** FSysDoc011: SysDocClsAtt -> DocCtxLst -> SysDocClsCtxAtt */
    public static final String SysDocClsAtt_FKO_DocCtxLst = "DocCtxLst";
    /** FSysDoc015: SysDocClsAtt -> FltLst -> SysDocClsCtxFlt */
    public static final String SysDocClsAtt_FKO_FltLst = "FltLst";
    /** FSysDoc002: SysDocCls <- SysDocCls <- SysDocClsAtt */
    public static final String SysDocClsAtt_FKI_SysDocCls = "SysDocCls";
    /** FSysDoc003: SysTraLbl <- SysTraLbl <- SysDocClsAtt */
    public static final String SysDocClsAtt_FKI_SysTraLbl = "SysTraLbl";

    /** Associazione contesto classe documentale */
    public static final String SysDocClsCtx = "SysDocClsCtx";
    /** FSysDoc010: SysDocClsCtx -> AttLst -> SysDocClsCtxAtt */
    public static final String SysDocClsCtx_FKO_AttLst = "AttLst";
    /** FSysDoc014: SysDocClsCtx -> FltLst -> SysDocClsCtxFlt */
    public static final String SysDocClsCtx_FKO_FltLst = "FltLst";
    /** FSysDoc004: SysDocCtx <- DocCtx <- SysDocClsCtx */
    public static final String SysDocClsCtx_FKI_DocCtx = "DocCtx";
    /** FSysDoc005: SysDocCls <- DocCls <- SysDocClsCtx */
    public static final String SysDocClsCtx_FKI_DocCls = "DocCls";
    /** FSysDoc008: AngDatSet <- DatSet <- SysDocClsCtx */
    public static final String SysDocClsCtx_FKI_DatSet = "DatSet";
    /** FSysDoc009: SysFrmDsg <- FrmDsg <- SysDocClsCtx */
    public static final String SysDocClsCtx_FKI_FrmDsg = "FrmDsg";

    /** Attributi in form per classe documentale e contesto */
    public static final String SysDocClsCtxAtt = "SysDocClsCtxAtt";
    /** FSysDoc010: SysDocClsCtx <- DocClsCtx <- SysDocClsCtxAtt */
    public static final String SysDocClsCtxAtt_FKI_DocClsCtx = "DocClsCtx";
    /** FSysDoc011: SysDocClsAtt <- DocClsAtt <- SysDocClsCtxAtt */
    public static final String SysDocClsCtxAtt_FKI_DocClsAtt = "DocClsAtt";
    /** FSysDoc012: SysFrmDsgFld <- FrmDsgFld <- SysDocClsCtxAtt */
    public static final String SysDocClsCtxAtt_FKI_FrmDsgFld = "FrmDsgFld";
    /** FSysDoc013: AngDbmTblCol <- DefDbmCol <- SysDocClsCtxAtt */
    public static final String SysDocClsCtxAtt_FKI_DefDbmCol = "DefDbmCol";

    /** Filtri per classe documentale e contesto */
    public static final String SysDocClsCtxFlt = "SysDocClsCtxFlt";
    /** FSysDoc014: SysDocClsCtx <- DocClsCtx <- SysDocClsCtxFlt */
    public static final String SysDocClsCtxFlt_FKI_DocClsCtx = "DocClsCtx";
    /** FSysDoc015: SysDocClsAtt <- FltAtt <- SysDocClsCtxFlt */
    public static final String SysDocClsCtxFlt_FKI_FltAtt = "FltAtt";
    /** FSysDoc016: AngDbmTblCol <- ValDbmTblCol <- SysDocClsCtxFlt */
    public static final String SysDocClsCtxFlt_FKI_ValDbmTblCol = "ValDbmTblCol";
    /** FSysDoc017: AngDbmTblCol <- ValQryCol <- SysDocClsCtxFlt */
    public static final String SysDocClsCtxFlt_FKI_ValQryCol = "ValQryCol";
    /** FSysDoc018: AngScmMdlFld <- ValQryFld <- SysDocClsCtxFlt */
    public static final String SysDocClsCtxFlt_FKI_ValQryFld = "ValQryFld";
    /** FSysDoc019: AngQryClcCol <- ValQryClc <- SysDocClsCtxFlt */
    public static final String SysDocClsCtxFlt_FKI_ValQryClc = "ValQryClc";

    /** Estensioni dei documenti caricabili per la classe documentale */
    public static final String SysDocClsExt = "SysDocClsExt";
    /** FSysDoc001: SysDocCls <- SysDocCls <- SysDocClsExt */
    public static final String SysDocClsExt_FKI_SysDocCls = "SysDocCls";

    /** Traduzioni per SysDocCls */
    public static final String SysDocClsLng = "SysDocClsLng";
    /** FLng000345: SysDocCls <- Rec <- SysDocClsLng */
    public static final String SysDocClsLng_FKI_Rec = "Rec";
    /** FLng000346: AngLng <- Lng <- SysDocClsLng */
    public static final String SysDocClsLng_FKI_Lng = "Lng";

    /** Contesto documentale */
    public static final String SysDocCtx = "SysDocCtx";
    /** FLng000347: SysDocCtx -> LngLst -> SysDocCtxLng */
    public static final String SysDocCtx_FKO_LngLst = "LngLst";
    /** FSysDoc004: SysDocCtx -> DocClsLst -> SysDocClsCtx */
    public static final String SysDocCtx_FKO_DocClsLst = "DocClsLst";
    /** FSysDoc021: SysDocCtx -> CatAttLst -> SysDocCtxCatAtt */
    public static final String SysDocCtx_FKO_CatAttLst = "CatAttLst";
    /** FSysDoc006: AngDbmTbl <- Tbl <- SysDocCtx */
    public static final String SysDocCtx_FKI_Tbl = "Tbl";
    /** FSysDoc007: AngQry <- Qry <- SysDocCtx */
    public static final String SysDocCtx_FKI_Qry = "Qry";

    /** Contesto documentale */
    public static final String SysDocCtxCatAtt = "SysDocCtxCatAtt";
    /** FSysDoc021: SysDocCtx <- DocCtx <- SysDocCtxCatAtt */
    public static final String SysDocCtxCatAtt_FKI_DocCtx = "DocCtx";
    /** FSysDoc022: AngEtyAttCat <- CatAtt <- SysDocCtxCatAtt */
    public static final String SysDocCtxCatAtt_FKI_CatAtt = "CatAtt";

    /** Traduzioni per SysDocCtx */
    public static final String SysDocCtxLng = "SysDocCtxLng";
    /** FLng000347: SysDocCtx <- Rec <- SysDocCtxLng */
    public static final String SysDocCtxLng_FKI_Rec = "Rec";
    /** FLng000348: AngLng <- Lng <- SysDocCtxLng */
    public static final String SysDocCtxLng_FKI_Lng = "Lng";

    /** Profili classi documentali ECM */
    public static final String SysEcmCls = "SysEcmCls";
    /** FSysEcm002: SysEcmCls -> EcmClsQryLst -> SysEcmClsQry */
    public static final String SysEcmCls_FKO_EcmClsQryLst = "EcmClsQryLst";

    /** Attributi classi documentali ECM */
    public static final String SysEcmClsAtt = "SysEcmClsAtt";
    /** FSysEcm004: SysEcmClsQry <- EcmClsQry <- SysEcmClsAtt */
    public static final String SysEcmClsAtt_FKI_EcmClsQry = "EcmClsQry";
    /** FSysEcm005: AngQryDbmTblCol <- QryCol <- SysEcmClsAtt */
    public static final String SysEcmClsAtt_FKI_QryCol = "QryCol";

    /** Associazione query classi documentali ECM */
    public static final String SysEcmClsQry = "SysEcmClsQry";
    /** FSysEcm004: SysEcmClsQry -> EcmClsAttLst -> SysEcmClsAtt */
    public static final String SysEcmClsQry_FKO_EcmClsAttLst = "EcmClsAttLst";
    /** FSysEcm002: SysEcmCls <- EcmCls <- SysEcmClsQry */
    public static final String SysEcmClsQry_FKI_EcmCls = "EcmCls";
    /** FSysEcm003: AngQry <- Qry <- SysEcmClsQry */
    public static final String SysEcmClsQry_FKI_Qry = "Qry";

    /** Parametri lavoro ETL per pulsante azione */
    public static final String SysEtlJobWksBtnActPrm = "SysEtlJobWksBtnActPrm";
    /** FSysEtlWks001: SysWksBtnAct <- SysWksBtnAct <- SysEtlJobWksBtnActPrm */
    public static final String SysEtlJobWksBtnActPrm_FKI_SysWksBtnAct = "SysWksBtnAct";
    /** FSysEtlWks002: AngEtlJobPrm <- EtlJobPrm <- SysEtlJobWksBtnActPrm */
    public static final String SysEtlJobWksBtnActPrm_FKI_EtlJobPrm = "EtlJobPrm";
    /** FSysEtlWks003: SysWksPrm <- SysWksPrm <- SysEtlJobWksBtnActPrm */
    public static final String SysEtlJobWksBtnActPrm_FKI_SysWksPrm = "SysWksPrm";

    /** Form contestuale */
    public static final String SysFrm = "SysFrm";
    /** FLng000183: SysFrm -> LngLst -> SysFrmLng */
    public static final String SysFrm_FKO_LngLst = "LngLst";
    /** FSysApp008: SysFrm -> PrmLst -> SysFrmPrm */
    public static final String SysFrm_FKO_PrmLst = "PrmLst";
    /** FSysApp003: SysCtx <- Ctx <- SysFrm */
    public static final String SysFrm_FKI_Ctx = "Ctx";

    /** Form design */
    public static final String SysFrmDsg = "SysFrmDsg";
    /** FLng000221: SysFrmDsg -> LngLst -> SysFrmDsgLng */
    public static final String SysFrmDsg_FKO_LngLst = "LngLst";
    /** FSysDoc009: SysFrmDsg -> DocClsCtxLst -> SysDocClsCtx */
    public static final String SysFrmDsg_FKO_DocClsCtxLst = "DocClsCtxLst";
    /** FSysEnv017: SysFrmDsg -> SrvTypLst -> AngRemSrvTyp */
    public static final String SysFrmDsg_FKO_SrvTypLst = "SrvTypLst";
    /** FSysUif007: SysFrmDsg -> DsgTabLst -> SysFrmDsgTab */
    public static final String SysFrmDsg_FKO_DsgTabLst = "DsgTabLst";
    /** FSysUif010: SysFrmDsg -> FldFrmLst -> SysFrmDsgFld */
    public static final String SysFrmDsg_FKO_FldFrmLst = "FldFrmLst";
    /** FSysUif013: SysApp <- App <- SysFrmDsg */
    public static final String SysFrmDsg_FKI_App = "App";

    /** Form design field */
    public static final String SysFrmDsgFld = "SysFrmDsgFld";
    /** FSysDoc012: SysFrmDsgFld -> DocClsCtxAttLst -> SysDocClsCtxAtt */
    public static final String SysFrmDsgFld_FKO_DocClsCtxAttLst = "DocClsCtxAttLst";
    /** FSysUif011: SysFrmDsgFld -> FldRolLst -> SysFrmDsgFldRol */
    public static final String SysFrmDsgFld_FKO_FldRolLst = "FldRolLst";
    /** FSysUif017: SysFrmDsgFld -> ActLst -> SysFrmDsgFld */
    public static final String SysFrmDsgFld_FKO_ActLst = "ActLst";
    /** FSysUif008: SysFrmDsgTab <- Tab <- SysFrmDsgFld */
    public static final String SysFrmDsgFld_FKI_Tab = "Tab";
    /** FSysUif009: AngDbmTblCol <- DbmCol <- SysFrmDsgFld */
    public static final String SysFrmDsgFld_FKI_DbmCol = "DbmCol";
    /** FSysUif010: SysFrmDsg <- DsgRef <- SysFrmDsgFld */
    public static final String SysFrmDsgFld_FKI_DsgRef = "DsgRef";
    /** FSysUif017: SysFrmDsgFld <- ActFld <- SysFrmDsgFld */
    public static final String SysFrmDsgFld_FKI_ActFld = "ActFld";
    /** FSysUif018: AngLstRem <- LstRem <- SysFrmDsgFld */
    public static final String SysFrmDsgFld_FKI_LstRem = "LstRem";

    /** Ruoli form design field */
    public static final String SysFrmDsgFldRol = "SysFrmDsgFldRol";
    /** FSysUif011: SysFrmDsgFld <- Fld <- SysFrmDsgFldRol */
    public static final String SysFrmDsgFldRol_FKI_Fld = "Fld";
    /** FSysUif012: AngRol <- Rol <- SysFrmDsgFldRol */
    public static final String SysFrmDsgFldRol_FKI_Rol = "Rol";

    /** Traduzioni per SysFrmDsg */
    public static final String SysFrmDsgLng = "SysFrmDsgLng";
    /** FLng000221: SysFrmDsg <- Rec <- SysFrmDsgLng */
    public static final String SysFrmDsgLng_FKI_Rec = "Rec";
    /** FLng000222: AngLng <- Lng <- SysFrmDsgLng */
    public static final String SysFrmDsgLng_FKI_Lng = "Lng";

    /** Form design tab */
    public static final String SysFrmDsgTab = "SysFrmDsgTab";
    /** FSysUif008: SysFrmDsgTab -> FldLst -> SysFrmDsgFld */
    public static final String SysFrmDsgTab_FKO_FldLst = "FldLst";
    /** FSysUif007: SysFrmDsg <- FrmDsg <- SysFrmDsgTab */
    public static final String SysFrmDsgTab_FKI_FrmDsg = "FrmDsg";

    /** Traduzioni per SysFrm */
    public static final String SysFrmLng = "SysFrmLng";
    /** FLng000183: SysFrm <- Rec <- SysFrmLng */
    public static final String SysFrmLng_FKI_Rec = "Rec";
    /** FLng000184: AngLng <- Lng <- SysFrmLng */
    public static final String SysFrmLng_FKI_Lng = "Lng";

    /** Parametri form */
    public static final String SysFrmPrm = "SysFrmPrm";
    /** FSysApp008: SysFrm <- Frm <- SysFrmPrm */
    public static final String SysFrmPrm_FKI_Frm = "Frm";
    /** FSysApp009: SysPrm <- Prm <- SysFrmPrm */
    public static final String SysFrmPrm_FKI_Prm = "Prm";

    /** Icone */
    public static final String SysIco = "SysIco";

    /** Menù */
    public static final String SysMnu = "SysMnu";
    /** FLng000219: SysMnu -> LngLst -> SysMnuLng */
    public static final String SysMnu_FKO_LngLst = "LngLst";
    /** FSysUif002: SysMnu -> ChdLst -> SysMnu */
    public static final String SysMnu_FKO_ChdLst = "ChdLst";
    /** FSysUif005: SysMnu -> ResFavLst -> SysMnuResFav */
    public static final String SysMnu_FKO_ResFavLst = "ResFavLst";
    /** FSysUif014: SysMnu -> AppLst -> SysMnuApp */
    public static final String SysMnu_FKO_AppLst = "AppLst";
    /** FSysUif001: AngMdl <- Mdl <- SysMnu */
    public static final String SysMnu_FKI_Mdl = "Mdl";
    /** FSysUif002: SysMnu <- Prt <- SysMnu */
    public static final String SysMnu_FKI_Prt = "Prt";
    /** FSysUif003: AngGrp <- Grp <- SysMnu */
    public static final String SysMnu_FKI_Grp = "Grp";
    /** FSysUif015: SysApp <- DefApp <- SysMnu */
    public static final String SysMnu_FKI_DefApp = "DefApp";

    /** Menù */
    public static final String SysMnuApp = "SysMnuApp";
    /** FSysUif006: SysApp <- App <- SysMnuApp */
    public static final String SysMnuApp_FKI_App = "App";
    /** FSysUif014: SysMnu <- Mnu <- SysMnuApp */
    public static final String SysMnuApp_FKI_Mnu = "Mnu";

    /** Traduzioni per SysMnu */
    public static final String SysMnuLng = "SysMnuLng";
    /** FLng000219: SysMnu <- Rec <- SysMnuLng */
    public static final String SysMnuLng_FKI_Rec = "Rec";
    /** FLng000220: AngLng <- Lng <- SysMnuLng */
    public static final String SysMnuLng_FKI_Lng = "Lng";

    /** Menù preferiti per risorsa */
    public static final String SysMnuResFav = "SysMnuResFav";
    /** FSysUif004: AngRes <- Res <- SysMnuResFav */
    public static final String SysMnuResFav_FKI_Res = "Res";
    /** FSysUif005: SysMnu <- Mnu <- SysMnuResFav */
    public static final String SysMnuResFav_FKI_Mnu = "Mnu";
    /** FSysUif016: SysApp <- App <- SysMnuResFav */
    public static final String SysMnuResFav_FKI_App = "App";

    /** Opzioni */
    public static final String SysOpt = "SysOpt";

    /** Parametri configurabili */
    public static final String SysPrm = "SysPrm";
    /** FLng000185: SysPrm -> LngLst -> SysPrmLng */
    public static final String SysPrm_FKO_LngLst = "LngLst";
    /** FSysApp005: SysPrm -> AppLst -> SysAppPrm */
    public static final String SysPrm_FKO_AppLst = "AppLst";
    /** FSysApp007: SysPrm -> CtxLst -> SysCtxPrm */
    public static final String SysPrm_FKO_CtxLst = "CtxLst";
    /** FSysApp009: SysPrm -> FrmLst -> SysFrmPrm */
    public static final String SysPrm_FKO_FrmLst = "FrmLst";

    /** Traduzioni per SysPrm */
    public static final String SysPrmLng = "SysPrmLng";
    /** FLng000185: SysPrm <- Rec <- SysPrmLng */
    public static final String SysPrmLng_FKI_Rec = "Rec";
    /** FLng000186: AngLng <- Lng <- SysPrmLng */
    public static final String SysPrmLng_FKI_Lng = "Lng";

    /** Regole di visibilità anagrafiche per ruolo. */
    public static final String SysReaRulRol = "SysReaRulRol";
    /** FSysOrg021: AngDbmTbl <- Tbl <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_Tbl = "Tbl";
    /** FSysOrg022: AngRol <- Rol <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_Rol = "Rol";
    /** FSysOrg023: AngCur <- AngCurRec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngCurRec = "AngCurRec";
    /** FSysOrg024: AngPayMet <- AngPayMetRec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngPayMetRec = "AngPayMetRec";
    /** FSysOrg025: AngShpMet <- AngShpMetRec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngShpMetRec = "AngShpMetRec";
    /** FSysOrg026: AngTrpMet <- AngTrpMetRec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngTrpMetRec = "AngTrpMetRec";
    /** FSysOrg027: AngPck <- AngPckRec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngPckRec = "AngPckRec";
    /** FSysOrg028: AngPayTyp <- AngPayTypRec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngPayTypRec = "AngPayTypRec";
    /** FSysOrg029: AngVat <- AngVatRec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngVatRec = "AngVatRec";
    /** FSysOrg030: AngItmCls001 <- AngItmCls001Rec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngItmCls001Rec = "AngItmCls001Rec";
    /** FSysOrg031: AngItmCls002 <- AngItmCls002Rec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngItmCls002Rec = "AngItmCls002Rec";
    /** FSysOrg032: AngItmCls003 <- AngItmCls003Rec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngItmCls003Rec = "AngItmCls003Rec";
    /** FSysOrg033: AngItmCls004 <- AngItmCls004Rec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngItmCls004Rec = "AngItmCls004Rec";
    /** FSysOrg034: AngItmCls005 <- AngItmCls005Rec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngItmCls005Rec = "AngItmCls005Rec";
    /** FSysOrg035: AngItmCls006 <- AngItmCls006Rec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngItmCls006Rec = "AngItmCls006Rec";
    /** FSysOrg036: AngItmCls007 <- AngItmCls007Rec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngItmCls007Rec = "AngItmCls007Rec";
    /** FSysOrg037: AngItmCls008 <- AngItmCls008Rec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngItmCls008Rec = "AngItmCls008Rec";
    /** FSysOrg038: AngItmCls009 <- AngItmCls009Rec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngItmCls009Rec = "AngItmCls009Rec";
    /** FSysOrg039: AngItmCls010 <- AngItmCls010Rec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngItmCls010Rec = "AngItmCls010Rec";
    /** FSysOrg040: AngItmCls011 <- AngItmCls011Rec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngItmCls011Rec = "AngItmCls011Rec";
    /** FSysOrg041: AngItmCls012 <- AngItmCls012Rec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngItmCls012Rec = "AngItmCls012Rec";
    /** FSysOrg042: AngItmCls013 <- AngItmCls013Rec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngItmCls013Rec = "AngItmCls013Rec";
    /** FSysOrg043: AngItmCls014 <- AngItmCls014Rec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngItmCls014Rec = "AngItmCls014Rec";
    /** FSysOrg044: AngItmCls015 <- AngItmCls015Rec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngItmCls015Rec = "AngItmCls015Rec";
    /** FSysOrg045: AngItmClsMul001 <- AngItmClsMul001Rec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngItmClsMul001Rec = "AngItmClsMul001Rec";
    /** FSysOrg046: AngItmClsMul002 <- AngItmClsMul002Rec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngItmClsMul002Rec = "AngItmClsMul002Rec";
    /** FSysOrg047: AngItmClsMul003 <- AngItmClsMul003Rec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngItmClsMul003Rec = "AngItmClsMul003Rec";
    /** FSysOrg048: AngItmClsMul004 <- AngItmClsMul004Rec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngItmClsMul004Rec = "AngItmClsMul004Rec";
    /** FSysOrg049: AngItmClsMul005 <- AngItmClsMul005Rec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngItmClsMul005Rec = "AngItmClsMul005Rec";
    /** FSysOrg050: AngAddTyp <- AngAddTypRec <- SysReaRulRol */
    public static final String SysReaRulRol_FKI_AngAddTypRec = "AngAddTypRec";

    /** Permessi in scrittura per ruolo */
    public static final String SysRolCud = "SysRolCud";
    /** FSysOrg019: AngDbmTbl <- Tbl <- SysRolCud */
    public static final String SysRolCud_FKI_Tbl = "Tbl";
    /** FSysOrg020: AngRol <- Rol <- SysRolCud */
    public static final String SysRolCud_FKI_Rol = "Rol";

    /** Etichette */
    public static final String SysTraLbl = "SysTraLbl";
    /** FDvzRep031: SysTraLbl -> RepQryCnvLst -> DvzRepQryCnv */
    public static final String SysTraLbl_FKO_RepQryCnvLst = "RepQryCnvLst";
    /** FDvzRep032: SysTraLbl -> RepQryFmtLst -> DvzRepQryFmt */
    public static final String SysTraLbl_FKO_RepQryFmtLst = "RepQryFmtLst";
    /** FDvzRep033: SysTraLbl -> RepQryAggFmtLst -> DvzRepQryAgg */
    public static final String SysTraLbl_FKO_RepQryAggFmtLst = "RepQryAggFmtLst";
    /** FLng000031: SysTraLbl -> LngLst -> SysTraLblLng */
    public static final String SysTraLbl_FKO_LngLst = "LngLst";
    /** FSysDoc003: SysTraLbl -> DocClsAttLst -> SysDocClsAtt */
    public static final String SysTraLbl_FKO_DocClsAttLst = "DocClsAttLst";
    /** FSysLst005: SysTraLbl -> LstRemFldLst -> AngLstRemFld */
    public static final String SysTraLbl_FKO_LstRemFldLst = "LstRemFldLst";
    /** FSysQry008: SysTraLbl -> QryColLst -> AngQryDbmTblCol */
    public static final String SysTraLbl_FKO_QryColLst = "QryColLst";
    /** FSysQry030: SysTraLbl -> ScmTypFldLst -> AngScmMdlFld */
    public static final String SysTraLbl_FKO_ScmTypFldLst = "ScmTypFldLst";
    /** FSysTra002: SysTraLbl -> TblLst -> AngDbmTbl */
    public static final String SysTraLbl_FKO_TblLst = "TblLst";
    /** FSysTra004: SysTraLbl -> ColLst -> AngDbmTblCol */
    public static final String SysTraLbl_FKO_ColLst = "ColLst";
    /** FSysUpf025: SysTraLbl -> UpfDefLst -> UpfDef */
    public static final String SysTraLbl_FKO_UpfDefLst = "UpfDefLst";

    /** Traduzioni per SysTraLbl */
    public static final String SysTraLblLng = "SysTraLblLng";
    /** FLng000031: SysTraLbl <- Rec <- SysTraLblLng */
    public static final String SysTraLblLng_FKI_Rec = "Rec";
    /** FLng000032: AngLng <- Lng <- SysTraLblLng */
    public static final String SysTraLblLng_FKI_Lng = "Lng";

    /** Messaggi */
    public static final String SysTraMsg = "SysTraMsg";
    /** FLng000029: SysTraMsg -> LngLst -> SysTraMsgLng */
    public static final String SysTraMsg_FKO_LngLst = "LngLst";
    /** FSysTra001: AngMdl <- Mdl <- SysTraMsg */
    public static final String SysTraMsg_FKI_Mdl = "Mdl";

    /** Traduzioni per SysTraMsg */
    public static final String SysTraMsgLng = "SysTraMsgLng";
    /** FLng000029: SysTraMsg <- Rec <- SysTraMsgLng */
    public static final String SysTraMsgLng_FKI_Rec = "Rec";
    /** FLng000030: AngLng <- Lng <- SysTraMsgLng */
    public static final String SysTraMsgLng_FKI_Lng = "Lng";

    /** Mess. o Eti. Mancanti */
    public static final String SysTraMsn = "SysTraMsn";
    /** FSysTra003: AngLng <- Lng <- SysTraMsn */
    public static final String SysTraMsn_FKI_Lng = "Lng";

    /** [virtual] Clienti */
    public static final String SysVrtAngCus = "SysVrtAngCus";

    /** [virtual] Articoli */
    public static final String SysVrtAngItm = "SysVrtAngItm";

    /** [virtual] Commesse */
    public static final String SysVrtAngJob = "SysVrtAngJob";

    /** [virtual] Cicli produttivi */
    public static final String SysVrtAngPrdCyc = "SysVrtAngPrdCyc";

    /** [virtual] SottoCommesse */
    public static final String SysVrtAngSubJob = "SysVrtAngSubJob";

    /** [virtual] Causali movimento tempo */
    public static final String SysVrtCauMovTmp = "SysVrtCauMovTmp";

    /** [virtual] Codici lavorazioni */
    public static final String SysVrtCodWrk = "SysVrtCodWrk";

    /** Workspace */
    public static final String SysWks = "SysWks";
    /** FDvzWks003: SysWks -> DvzQryLst -> DvzWksQry */
    public static final String SysWks_FKO_DvzQryLst = "DvzQryLst";
    /** FLng000317: SysWks -> LngLst -> SysWksLng */
    public static final String SysWks_FKO_LngLst = "LngLst";
    /** FSysWks002: SysWks -> TabLst -> SysWksTab */
    public static final String SysWks_FKO_TabLst = "TabLst";
    /** FSysWks004: SysWks -> GrpLst -> SysWksGrp */
    public static final String SysWks_FKO_GrpLst = "GrpLst";
    /** FSysWks006: SysWks -> WdgLst -> SysWksWdg */
    public static final String SysWks_FKO_WdgLst = "WdgLst";
    /** FSysWks011: SysWks -> BtnLst -> SysWksBtn */
    public static final String SysWks_FKO_BtnLst = "BtnLst";
    /** FSysWks016: SysWks -> BtnActLst -> SysWksBtnAct */
    public static final String SysWks_FKO_BtnActLst = "BtnActLst";
    /** FSysWks023: SysWks -> PrmLst -> SysWksPrm */
    public static final String SysWks_FKO_PrmLst = "PrmLst";
    /** FSysWks052: SysWks -> LytLst -> SysWksLyt */
    public static final String SysWks_FKO_LytLst = "LytLst";
    /** FSysWks001: SysWksTyp <- WksTyp <- SysWks */
    public static final String SysWks_FKI_WksTyp = "WksTyp";

    /** Pulsante */
    public static final String SysWksBtn = "SysWksBtn";
    /** FLng000323: SysWksBtn -> LngLst -> SysWksBtnLng */
    public static final String SysWksBtn_FKO_LngLst = "LngLst";
    /** FSysWks013: SysWksBtn -> BtnLst -> SysWksBtn */
    public static final String SysWksBtn_FKO_BtnLst = "BtnLst";
    /** FSysWks014: SysWksBtn -> BtnActLst -> SysWksBtnAct */
    public static final String SysWksBtn_FKO_BtnActLst = "BtnActLst";
    /** FSysWks011: SysWks <- Wks <- SysWksBtn */
    public static final String SysWksBtn_FKI_Wks = "Wks";
    /** FSysWks012: SysWksWdg <- Wdg <- SysWksBtn */
    public static final String SysWksBtn_FKI_Wdg = "Wdg";
    /** FSysWks013: SysWksBtn <- Btn <- SysWksBtn */
    public static final String SysWksBtn_FKI_Btn = "Btn";

    /** Associazione del pulsante ad azioni */
    public static final String SysWksBtnAct = "SysWksBtnAct";
    /** FSysEtlWks001: SysWksBtnAct -> EtlJobPrmLst -> SysEtlJobWksBtnActPrm */
    public static final String SysWksBtnAct_FKO_EtlJobPrmLst = "EtlJobPrmLst";
    /** FSysEtlWks004: AngEtlJob <- EtlJob <- SysWksBtnAct */
    public static final String SysWksBtnAct_FKI_EtlJob = "EtlJob";
    /** FSysWks014: SysWksBtn <- Btn <- SysWksBtnAct */
    public static final String SysWksBtnAct_FKI_Btn = "Btn";
    /** FSysWks015: AngSysWksAct <- Act <- SysWksBtnAct */
    public static final String SysWksBtnAct_FKI_Act = "Act";
    /** FSysWks016: SysWks <- Wks <- SysWksBtnAct */
    public static final String SysWksBtnAct_FKI_Wks = "Wks";
    /** FSysWks034: SysApp <- App <- SysWksBtnAct */
    public static final String SysWksBtnAct_FKI_App = "App";
    /** FSysWks035: SysActGrp <- ActGrp <- SysWksBtnAct */
    public static final String SysWksBtnAct_FKI_ActGrp = "ActGrp";

    /** Traduzioni per SysWksBtn */
    public static final String SysWksBtnLng = "SysWksBtnLng";
    /** FLng000323: SysWksBtn <- Rec <- SysWksBtnLng */
    public static final String SysWksBtnLng_FKI_Rec = "Rec";
    /** FLng000324: AngLng <- Lng <- SysWksBtnLng */
    public static final String SysWksBtnLng_FKI_Lng = "Lng";

    /** Autorizzazione workspace per gruppo */
    public static final String SysWksGrp = "SysWksGrp";
    /** FSysWks004: SysWks <- Wks <- SysWksGrp */
    public static final String SysWksGrp_FKI_Wks = "Wks";
    /** FSysWks005: AngGrp <- AngGrp <- SysWksGrp */
    public static final String SysWksGrp_FKI_AngGrp = "AngGrp";

    /** Traduzioni per SysWks */
    public static final String SysWksLng = "SysWksLng";
    /** FLng000317: SysWks <- Rec <- SysWksLng */
    public static final String SysWksLng_FKI_Rec = "Rec";
    /** FLng000318: AngLng <- Lng <- SysWksLng */
    public static final String SysWksLng_FKI_Lng = "Lng";

    /** Layout workspace */
    public static final String SysWksLyt = "SysWksLyt";
    /** FSysWks052: SysWks <- Wks <- SysWksLyt */
    public static final String SysWksLyt_FKI_Wks = "Wks";
    /** FSysWks053: AngRes <- Res <- SysWksLyt */
    public static final String SysWksLyt_FKI_Res = "Res";

    /** Parametro workspace */
    public static final String SysWksPrm = "SysWksPrm";
    /** FDvzWks006: SysWksPrm -> DvzQryLst -> DvzWksQryPrm */
    public static final String SysWksPrm_FKO_DvzQryLst = "DvzQryLst";
    /** FDvzWks012: SysWksPrm -> DvzQryFltLst -> DvzWksQryFlt */
    public static final String SysWksPrm_FKO_DvzQryFltLst = "DvzQryFltLst";
    /** FDvzWks026: SysWksPrm -> DvzQryDsgFltValLst -> DvzWksQryDsgFlt */
    public static final String SysWksPrm_FKO_DvzQryDsgFltValLst = "DvzQryDsgFltValLst";
    /** FSysEtlWks003: SysWksPrm -> EtlJobWksBtnActPrmLst -> SysEtlJobWksBtnActPrm */
    public static final String SysWksPrm_FKO_EtlJobWksBtnActPrmLst = "EtlJobWksBtnActPrmLst";
    /** FSysWks037: SysWksPrm -> WksWdgLst -> SysWksWdgPrm */
    public static final String SysWksPrm_FKO_WksWdgLst = "WksWdgLst";
    /** FSysWks043: SysWksPrm -> WksWdgFltLst -> SysWksWdgFlt */
    public static final String SysWksPrm_FKO_WksWdgFltLst = "WksWdgFltLst";
    /** FSysWks048: SysWksPrm -> ViwFltLst -> SysWksWdgViwFltPrm */
    public static final String SysWksPrm_FKO_ViwFltLst = "ViwFltLst";
    /** FSysWks023: SysWks <- Wks <- SysWksPrm */
    public static final String SysWksPrm_FKI_Wks = "Wks";
    /** FSysWks026: AngDbmTblCol <- PrmQryDscCol <- SysWksPrm */
    public static final String SysWksPrm_FKI_PrmQryDscCol = "PrmQryDscCol";
    /** FSysWks027: AngQryClcCol <- PrmQryDscClc <- SysWksPrm */
    public static final String SysWksPrm_FKI_PrmQryDscClc = "PrmQryDscClc";
    /** FSysWks028: AngDbmTblCol <- PrmQryUidCol <- SysWksPrm */
    public static final String SysWksPrm_FKI_PrmQryUidCol = "PrmQryUidCol";
    /** FSysWks029: AngDbmTblCol <- PrmQryCodCol <- SysWksPrm */
    public static final String SysWksPrm_FKI_PrmQryCodCol = "PrmQryCodCol";
    /** FSysWks030: AngQry <- PrmQry <- SysWksPrm */
    public static final String SysWksPrm_FKI_PrmQry = "PrmQry";
    /** FSysWks031: AngScmMdlFld <- PrmQryUidFld <- SysWksPrm */
    public static final String SysWksPrm_FKI_PrmQryUidFld = "PrmQryUidFld";
    /** FSysWks032: AngScmMdlFld <- PrmQryCodFld <- SysWksPrm */
    public static final String SysWksPrm_FKI_PrmQryCodFld = "PrmQryCodFld";
    /** FSysWks033: AngScmMdlFld <- PrmQryDscFld <- SysWksPrm */
    public static final String SysWksPrm_FKI_PrmQryDscFld = "PrmQryDscFld";

    /** Slider di workspace */
    public static final String SysWksSld = "SysWksSld";
    /** FLng000333: SysWksSld -> LngLst -> SysWksSldLng */
    public static final String SysWksSld_FKO_LngLst = "LngLst";
    /** FSysWks050: SysWksSld -> WksTabLst -> SysWksSldTab */
    public static final String SysWksSld_FKO_WksTabLst = "WksTabLst";
    /** FSysWks049: SysWksTyp <- WksTyp <- SysWksSld */
    public static final String SysWksSld_FKI_WksTyp = "WksTyp";

    /** Traduzioni per SysWksSld */
    public static final String SysWksSldLng = "SysWksSldLng";
    /** FLng000333: SysWksSld <- Rec <- SysWksSldLng */
    public static final String SysWksSldLng_FKI_Rec = "Rec";
    /** FLng000334: AngLng <- Lng <- SysWksSldLng */
    public static final String SysWksSldLng_FKI_Lng = "Lng";

    /** Tab slider workspace */
    public static final String SysWksSldTab = "SysWksSldTab";
    /** FSysWks050: SysWksSld <- Sld <- SysWksSldTab */
    public static final String SysWksSldTab_FKI_Sld = "Sld";
    /** FSysWks051: SysWksTab <- WksTab <- SysWksSldTab */
    public static final String SysWksSldTab_FKI_WksTab = "WksTab";

    /** Tab workspace */
    public static final String SysWksTab = "SysWksTab";
    /** FLng000319: SysWksTab -> LngLst -> SysWksTabLng */
    public static final String SysWksTab_FKO_LngLst = "LngLst";
    /** FSysWks010: SysWksTab -> TabWdgLst -> SysWksTabWdg */
    public static final String SysWksTab_FKO_TabWdgLst = "TabWdgLst";
    /** FSysWks051: SysWksTab -> SldLst -> SysWksSldTab */
    public static final String SysWksTab_FKO_SldLst = "SldLst";
    /** FSysWks002: SysWks <- Wks <- SysWksTab */
    public static final String SysWksTab_FKI_Wks = "Wks";
    /** FSysWks003: AngRes <- Res <- SysWksTab */
    public static final String SysWksTab_FKI_Res = "Res";

    /** Traduzioni per SysWksTab */
    public static final String SysWksTabLng = "SysWksTabLng";
    /** FLng000319: SysWksTab <- Rec <- SysWksTabLng */
    public static final String SysWksTabLng_FKI_Rec = "Rec";
    /** FLng000320: AngLng <- Lng <- SysWksTabLng */
    public static final String SysWksTabLng_FKI_Lng = "Lng";

    /** Associazione tab widget */
    public static final String SysWksTabWdg = "SysWksTabWdg";
    /** FSysWks009: SysWksWdg <- Wdg <- SysWksTabWdg */
    public static final String SysWksTabWdg_FKI_Wdg = "Wdg";
    /** FSysWks010: SysWksTab <- Tab <- SysWksTabWdg */
    public static final String SysWksTabWdg_FKI_Tab = "Tab";

    /** Tipo workspace */
    public static final String SysWksTyp = "SysWksTyp";
    /** FLng000331: SysWksTyp -> LngLst -> SysWksTypLng */
    public static final String SysWksTyp_FKO_LngLst = "LngLst";
    /** FSysWks001: SysWksTyp -> WksLst -> SysWks */
    public static final String SysWksTyp_FKO_WksLst = "WksLst";
    /** FSysWks021: SysWksTyp -> ActLst -> AngSysWksAct */
    public static final String SysWksTyp_FKO_ActLst = "ActLst";
    /** FSysWks022: SysWksTyp -> WdgTypLst -> SysWksWdgTyp */
    public static final String SysWksTyp_FKO_WdgTypLst = "WdgTypLst";
    /** FSysWks025: SysWksTyp -> AppLst -> SysWksTypApp */
    public static final String SysWksTyp_FKO_AppLst = "AppLst";
    /** FSysWks049: SysWksTyp -> SldLst -> SysWksSld */
    public static final String SysWksTyp_FKO_SldLst = "SldLst";

    /** Associazione Tipo workspace e applicazione */
    public static final String SysWksTypApp = "SysWksTypApp";
    /** FSysWks024: SysApp <- App <- SysWksTypApp */
    public static final String SysWksTypApp_FKI_App = "App";
    /** FSysWks025: SysWksTyp <- WksTyp <- SysWksTypApp */
    public static final String SysWksTypApp_FKI_WksTyp = "WksTyp";

    /** Traduzioni per SysWksTyp */
    public static final String SysWksTypLng = "SysWksTypLng";
    /** FLng000331: SysWksTyp <- Rec <- SysWksTypLng */
    public static final String SysWksTypLng_FKI_Rec = "Rec";
    /** FLng000332: AngLng <- Lng <- SysWksTypLng */
    public static final String SysWksTypLng_FKI_Lng = "Lng";

    /** Widget */
    public static final String SysWksWdg = "SysWksWdg";
    /** FDvzWks002: SysWksWdg -> DvzQry -> DvzWksQry */
    public static final String SysWksWdg_FKO_DvzQry = "DvzQry";
    /** FDvzWks027: SysWksWdg -> DvzChr -> DvzWksChr */
    public static final String SysWksWdg_FKO_DvzChr = "DvzChr";
    /** FDvzWks041: SysWksWdg -> DvzGnt -> DvzWksGnt */
    public static final String SysWksWdg_FKO_DvzGnt = "DvzGnt";
    /** FLng000321: SysWksWdg -> LngLst -> SysWksWdgLng */
    public static final String SysWksWdg_FKO_LngLst = "LngLst";
    /** FSysWks009: SysWksWdg -> TabWdgLst -> SysWksTabWdg */
    public static final String SysWksWdg_FKO_TabWdgLst = "TabWdgLst";
    /** FSysWks012: SysWksWdg -> BtnLst -> SysWksBtn */
    public static final String SysWksWdg_FKO_BtnLst = "BtnLst";
    /** FSysWks018: SysWksWdg -> WdgCfgLst -> SysWksWdgCfg */
    public static final String SysWksWdg_FKO_WdgCfgLst = "WdgCfgLst";
    /** FSysWks036: SysWksWdg -> PrmLst -> SysWksWdgPrm */
    public static final String SysWksWdg_FKO_PrmLst = "PrmLst";
    /** FSysWks040: SysWksWdg -> FltLst -> SysWksWdgFlt */
    public static final String SysWksWdg_FKO_FltLst = "FltLst";
    /** FSysWks047: SysWksWdg -> ViwFltPrmLst -> SysWksWdgViwFltPrm */
    public static final String SysWksWdg_FKO_ViwFltPrmLst = "ViwFltPrmLst";
    /** FSysWks006: SysWks <- Wks <- SysWksWdg */
    public static final String SysWksWdg_FKI_Wks = "Wks";
    /** FSysWks007: SysWksWdgTyp <- WdgTyp <- SysWksWdg */
    public static final String SysWksWdg_FKI_WdgTyp = "WdgTyp";
    /** FSysWks008: AngQry <- Qry <- SysWksWdg */
    public static final String SysWksWdg_FKI_Qry = "Qry";

    /** Configurazione widget */
    public static final String SysWksWdgCfg = "SysWksWdgCfg";
    /** FSysWks018: SysWksWdg <- Wdg <- SysWksWdgCfg */
    public static final String SysWksWdgCfg_FKI_Wdg = "Wdg";
    /** FSysWks019: AngSysWksWdgCfg <- AngWdgCfg <- SysWksWdgCfg */
    public static final String SysWksWdgCfg_FKI_AngWdgCfg = "AngWdgCfg";
    /** FSysWks020: AngRes <- Res <- SysWksWdgCfg */
    public static final String SysWksWdgCfg_FKI_Res = "Res";

    /** Filtri sul widget */
    public static final String SysWksWdgFlt = "SysWksWdgFlt";
    /** FSysWks040: SysWksWdg <- WksWdg <- SysWksWdgFlt */
    public static final String SysWksWdgFlt_FKI_WksWdg = "WksWdg";
    /** FSysWks041: AngDbmTblCol <- FltCol <- SysWksWdgFlt */
    public static final String SysWksWdgFlt_FKI_FltCol = "FltCol";
    /** FSysWks042: AngDbmTblCol <- ValCol <- SysWksWdgFlt */
    public static final String SysWksWdgFlt_FKI_ValCol = "ValCol";
    /** FSysWks043: SysWksPrm <- ValWksPrm <- SysWksWdgFlt */
    public static final String SysWksWdgFlt_FKI_ValWksPrm = "ValWksPrm";
    /** FSysWks044: AngScmMdlFld <- FltFld <- SysWksWdgFlt */
    public static final String SysWksWdgFlt_FKI_FltFld = "FltFld";
    /** FSysWks045: AngScmMdlFld <- ValFld <- SysWksWdgFlt */
    public static final String SysWksWdgFlt_FKI_ValFld = "ValFld";

    /** Traduzioni per SysWksWdg */
    public static final String SysWksWdgLng = "SysWksWdgLng";
    /** FLng000321: SysWksWdg <- Rec <- SysWksWdgLng */
    public static final String SysWksWdgLng_FKI_Rec = "Rec";
    /** FLng000322: AngLng <- Lng <- SysWksWdgLng */
    public static final String SysWksWdgLng_FKI_Lng = "Lng";

    /** Parametri popolati dal widget */
    public static final String SysWksWdgPrm = "SysWksWdgPrm";
    /** FSysWks036: SysWksWdg <- WksWdg <- SysWksWdgPrm */
    public static final String SysWksWdgPrm_FKI_WksWdg = "WksWdg";
    /** FSysWks037: SysWksPrm <- WksPrm <- SysWksWdgPrm */
    public static final String SysWksWdgPrm_FKI_WksPrm = "WksPrm";
    /** FSysWks038: AngDbmTblCol <- PrmCol <- SysWksWdgPrm */
    public static final String SysWksWdgPrm_FKI_PrmCol = "PrmCol";
    /** FSysWks039: AngQryClcCol <- PrmClc <- SysWksWdgPrm */
    public static final String SysWksWdgPrm_FKI_PrmClc = "PrmClc";
    /** FSysWks046: AngScmMdlFld <- PrmFld <- SysWksWdgPrm */
    public static final String SysWksWdgPrm_FKI_PrmFld = "PrmFld";

    /** Tipo widget */
    public static final String SysWksWdgTyp = "SysWksWdgTyp";
    /** FLng000327: SysWksWdgTyp -> LngLst -> SysWksWdgTypLng */
    public static final String SysWksWdgTyp_FKO_LngLst = "LngLst";
    /** FSysWks007: SysWksWdgTyp -> WdgLst -> SysWksWdg */
    public static final String SysWksWdgTyp_FKO_WdgLst = "WdgLst";
    /** FSysWks017: SysWksWdgTyp -> WdgCfgLst -> AngSysWksWdgCfg */
    public static final String SysWksWdgTyp_FKO_WdgCfgLst = "WdgCfgLst";
    /** FSysWks022: SysWksTyp <- WksTyp <- SysWksWdgTyp */
    public static final String SysWksWdgTyp_FKI_WksTyp = "WksTyp";

    /** Traduzioni per SysWksWdgTyp */
    public static final String SysWksWdgTypLng = "SysWksWdgTypLng";
    /** FLng000327: SysWksWdgTyp <- Rec <- SysWksWdgTypLng */
    public static final String SysWksWdgTypLng_FKI_Rec = "Rec";
    /** FLng000328: AngLng <- Lng <- SysWksWdgTypLng */
    public static final String SysWksWdgTypLng_FKI_Lng = "Lng";

    /** Parametri per widget filtro */
    public static final String SysWksWdgViwFltPrm = "SysWksWdgViwFltPrm";
    /** FSysWks047: SysWksWdg <- WdgViwFlt <- SysWksWdgViwFltPrm */
    public static final String SysWksWdgViwFltPrm_FKI_WdgViwFlt = "WdgViwFlt";
    /** FSysWks048: SysWksPrm <- ViwFltPrm <- SysWksWdgViwFltPrm */
    public static final String SysWksWdgViwFltPrm_FKI_ViwFltPrm = "ViwFltPrm";

    /** Esecuzioni test */
    public static final String TstRun = "TstRun";
    /** FSysTst002: TstRun -> TstLst -> TstRunTst */
    public static final String TstRun_FKO_TstLst = "TstLst";
    /** FSysTst001: AngRes <- Res <- TstRun */
    public static final String TstRun_FKI_Res = "Res";

    /** Singoli test */
    public static final String TstRunTst = "TstRunTst";
    /** FSysTst002: TstRun <- TstRun <- TstRunTst */
    public static final String TstRunTst_FKI_TstRun = "TstRun";

    /** Definizione campi utente personalizzati */
    public static final String UpfDef = "UpfDef";
    /** FSysUpf001: AngDbmTbl <- Tbl <- UpfDef */
    public static final String UpfDef_FKI_Tbl = "Tbl";
    /** FSysUpf025: SysTraLbl <- Lbl <- UpfDef */
    public static final String UpfDef_FKI_Lbl = "Lbl";
    /** FSysUpf046: AngLstRem <- LstRem <- UpfDef */
    public static final String UpfDef_FKI_LstRem = "LstRem";

    /** Record campi personalizzati */
    public static final String UpfIst = "UpfIst";
    /** FSysUpf004: AngDbmTbl <- Tbl <- UpfIst */
    public static final String UpfIst_FKI_Tbl = "Tbl";
    /** FSysUpf026: AngLstVal <- RefLst_01 <- UpfIst */
    public static final String UpfIst_FKI_RefLst_01 = "RefLst_01";
    /** FSysUpf027: AngLstVal <- RefLst_02 <- UpfIst */
    public static final String UpfIst_FKI_RefLst_02 = "RefLst_02";
    /** FSysUpf028: AngLstVal <- RefLst_03 <- UpfIst */
    public static final String UpfIst_FKI_RefLst_03 = "RefLst_03";
    /** FSysUpf029: AngLstVal <- RefLst_04 <- UpfIst */
    public static final String UpfIst_FKI_RefLst_04 = "RefLst_04";
    /** FSysUpf030: AngLstVal <- RefLst_05 <- UpfIst */
    public static final String UpfIst_FKI_RefLst_05 = "RefLst_05";
    /** FSysUpf031: AngLstVal <- RefLst_06 <- UpfIst */
    public static final String UpfIst_FKI_RefLst_06 = "RefLst_06";
    /** FSysUpf032: AngLstVal <- RefLst_07 <- UpfIst */
    public static final String UpfIst_FKI_RefLst_07 = "RefLst_07";
    /** FSysUpf033: AngLstVal <- RefLst_08 <- UpfIst */
    public static final String UpfIst_FKI_RefLst_08 = "RefLst_08";
    /** FSysUpf034: AngLstVal <- RefLst_09 <- UpfIst */
    public static final String UpfIst_FKI_RefLst_09 = "RefLst_09";
    /** FSysUpf035: AngLstVal <- RefLst_10 <- UpfIst */
    public static final String UpfIst_FKI_RefLst_10 = "RefLst_10";
    /** FSysUpf036: AngLstVal <- RefLst_11 <- UpfIst */
    public static final String UpfIst_FKI_RefLst_11 = "RefLst_11";
    /** FSysUpf037: AngLstVal <- RefLst_12 <- UpfIst */
    public static final String UpfIst_FKI_RefLst_12 = "RefLst_12";
    /** FSysUpf038: AngLstVal <- RefLst_13 <- UpfIst */
    public static final String UpfIst_FKI_RefLst_13 = "RefLst_13";
    /** FSysUpf039: AngLstVal <- RefLst_14 <- UpfIst */
    public static final String UpfIst_FKI_RefLst_14 = "RefLst_14";
    /** FSysUpf040: AngLstVal <- RefLst_15 <- UpfIst */
    public static final String UpfIst_FKI_RefLst_15 = "RefLst_15";
    /** FSysUpf041: AngLstVal <- RefLst_16 <- UpfIst */
    public static final String UpfIst_FKI_RefLst_16 = "RefLst_16";
    /** FSysUpf042: AngLstVal <- RefLst_17 <- UpfIst */
    public static final String UpfIst_FKI_RefLst_17 = "RefLst_17";
    /** FSysUpf043: AngLstVal <- RefLst_18 <- UpfIst */
    public static final String UpfIst_FKI_RefLst_18 = "RefLst_18";
    /** FSysUpf044: AngLstVal <- RefLst_19 <- UpfIst */
    public static final String UpfIst_FKI_RefLst_19 = "RefLst_19";
    /** FSysUpf045: AngLstVal <- RefLst_20 <- UpfIst */
    public static final String UpfIst_FKI_RefLst_20 = "RefLst_20";

    /** Aliquote IVA per data */
    public static final String VatRat = "VatRat";
    /** FSysTac001: AngVat <- Vat <- VatRat */
    public static final String VatRat_FKI_Vat = "Vat";



} // SAlias
