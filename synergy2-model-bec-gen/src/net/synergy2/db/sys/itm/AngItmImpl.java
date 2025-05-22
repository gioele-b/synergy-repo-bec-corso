package net.synergy2.db.sys.itm;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class AngItmImpl extends AngItm {

    protected AngItmImpl () { super (); }

    public enum AngItmFields implements ISField {
        Uid, ItmCod, ItmDsc, UniMeaBasCod, ItmLngDsc, OrgComUid, ItmIco, ItmClr, IgnMis, DlvBufDay, MinStkLvl, MinBtc, MaxBtc, SupOnl, ItmCst, MinBomQty, SrtQty, AdvDay, CovDay, JobPln, MulBat, SupUid, UniMeaUid, Str001, Str002, Str003, Str004, Str005, Dec001, Dec002, Cls001Uid, Cls002Uid, Cls003Uid, Cls004Uid, Cls005Uid, Cls006Uid, Cls007Uid, Cls008Uid, Cls009Uid, Cls010Uid, Cls011Uid, Cls012Uid, Cls013Uid, Cls014Uid, Cls015Uid, ClsFre001, ClsFre002, ClsFre003, ClsFre004, ClsFre005, ClsFre006, ClsFre007, ClsFre008, ClsFre009, ClsFre010, ClsFre011, ClsFre012, ClsFre013, ClsFre014, ClsFre015, ClsMul001Uid, ClsMul002Uid, ClsMul003Uid, ClsMul004Uid, ClsMul005Uid, ItmAcr, UniMeaAltUid, CnvRat, ItmCfg, ItmNtlUid, ItmTmlUid, VatUid, ItmStsUid, ItmExtDsc, EtyUid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, ItmCatUid, Cls016Uid, Cls017Uid, Cls018Uid, Cls019Uid, Cls020Uid, Cls021Uid, Cls022Uid, Cls023Uid, Cls024Uid, Cls025Uid, Cls026Uid, Cls027Uid, Cls028Uid, Cls029Uid, Cls030Uid, ClsFre016, ClsFre017, ClsFre018, ClsFre019, ClsFre020, ClsFre021, ClsFre022, ClsFre023, ClsFre024, ClsFre025, ClsFre026, ClsFre027, ClsFre028, ClsFre029, ClsFre030, ComItmUid, ItmTypPrdUid, ItmWhsUid, ItmOwnUid;
    } // AngItmFields
    
    private static String baseUrl = "/rest/sys/itm/AngItm";


    @Override public String getModelClassName () { return "AngItmImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngItmImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
    @Override public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        switch (fieldName) {
            case SAlias.ENTITY -> setEntity ((AngEty) value); 

            default -> {
                if (!settedSuper) { throw new SQueryException ("No reference specification found for field [" + fieldName + "]."); }
            }
        } // switch
        return true;
    } // set
    
    @Override public String debug (boolean full, boolean cascade, String indent) {
        StringBuilder str = new StringBuilder (indent).append (getModelClassName ()).append (" = {");
        str.append ("Uid[").append (getUid ()).append ("] ");
        str.append ("ItmCod[").append (getItmCod ()).append ("] ");
        str.append ("ItmDsc[").append (getItmDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getUniMeaBasCod ())) { str.append ("UniMeaBasCod[").append (getUniMeaBasCod ()).append ("] "); } }
        str.append ("ItmLngDsc[").append (getItmLngDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getOrgComUid ())) { str.append ("OrgComUid[").append (getOrgComUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getItmIco ())) { str.append ("ItmIco[").append (getItmIco ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getItmClr ())) { str.append ("ItmClr[").append (getItmClr ()).append ("] "); } }
        if (full) { str.append ("IgnMis[").append (getIgnMis ()).append ("] "); }
        if (full) { if (Objects.nonNull (getDlvBufDay ())) { str.append ("DlvBufDay[").append (getDlvBufDay ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getMinStkLvl ())) { str.append ("MinStkLvl[").append (getMinStkLvl ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getMinBtc ())) { str.append ("MinBtc[").append (getMinBtc ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getMaxBtc ())) { str.append ("MaxBtc[").append (getMaxBtc ()).append ("] "); } }
        if (full) { str.append ("SupOnl[").append (getSupOnl ()).append ("] "); }
        if (full) { if (Objects.nonNull (getItmCst ())) { str.append ("ItmCst[").append (getItmCst ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getMinBomQty ())) { str.append ("MinBomQty[").append (getMinBomQty ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getSrtQty ())) { str.append ("SrtQty[").append (getSrtQty ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getAdvDay ())) { str.append ("AdvDay[").append (getAdvDay ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCovDay ())) { str.append ("CovDay[").append (getCovDay ()).append ("] "); } }
        if (full) { str.append ("JobPln[").append (getJobPln ()).append ("] "); }
        if (full) { str.append ("MulBat[").append (getMulBat ()).append ("] "); }
        if (full) { if (Objects.nonNull (getSupUid ())) { str.append ("SupUid[").append (getSupUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getUniMeaUid ())) { str.append ("UniMeaUid[").append (getUniMeaUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr001 ())) { str.append ("Str001[").append (getStr001 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr002 ())) { str.append ("Str002[").append (getStr002 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr003 ())) { str.append ("Str003[").append (getStr003 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr004 ())) { str.append ("Str004[").append (getStr004 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr005 ())) { str.append ("Str005[").append (getStr005 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDec001 ())) { str.append ("Dec001[").append (getDec001 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDec002 ())) { str.append ("Dec002[").append (getDec002 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls001Uid ())) { str.append ("Cls001Uid[").append (getCls001Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls002Uid ())) { str.append ("Cls002Uid[").append (getCls002Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls003Uid ())) { str.append ("Cls003Uid[").append (getCls003Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls004Uid ())) { str.append ("Cls004Uid[").append (getCls004Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls005Uid ())) { str.append ("Cls005Uid[").append (getCls005Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls006Uid ())) { str.append ("Cls006Uid[").append (getCls006Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls007Uid ())) { str.append ("Cls007Uid[").append (getCls007Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls008Uid ())) { str.append ("Cls008Uid[").append (getCls008Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls009Uid ())) { str.append ("Cls009Uid[").append (getCls009Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls010Uid ())) { str.append ("Cls010Uid[").append (getCls010Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls011Uid ())) { str.append ("Cls011Uid[").append (getCls011Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls012Uid ())) { str.append ("Cls012Uid[").append (getCls012Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls013Uid ())) { str.append ("Cls013Uid[").append (getCls013Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls014Uid ())) { str.append ("Cls014Uid[").append (getCls014Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls015Uid ())) { str.append ("Cls015Uid[").append (getCls015Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre001 ())) { str.append ("ClsFre001[").append (getClsFre001 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre002 ())) { str.append ("ClsFre002[").append (getClsFre002 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre003 ())) { str.append ("ClsFre003[").append (getClsFre003 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre004 ())) { str.append ("ClsFre004[").append (getClsFre004 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre005 ())) { str.append ("ClsFre005[").append (getClsFre005 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre006 ())) { str.append ("ClsFre006[").append (getClsFre006 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre007 ())) { str.append ("ClsFre007[").append (getClsFre007 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre008 ())) { str.append ("ClsFre008[").append (getClsFre008 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre009 ())) { str.append ("ClsFre009[").append (getClsFre009 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre010 ())) { str.append ("ClsFre010[").append (getClsFre010 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre011 ())) { str.append ("ClsFre011[").append (getClsFre011 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre012 ())) { str.append ("ClsFre012[").append (getClsFre012 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre013 ())) { str.append ("ClsFre013[").append (getClsFre013 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre014 ())) { str.append ("ClsFre014[").append (getClsFre014 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre015 ())) { str.append ("ClsFre015[").append (getClsFre015 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsMul001Uid ())) { str.append ("ClsMul001Uid[").append (getClsMul001Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsMul002Uid ())) { str.append ("ClsMul002Uid[").append (getClsMul002Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsMul003Uid ())) { str.append ("ClsMul003Uid[").append (getClsMul003Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsMul004Uid ())) { str.append ("ClsMul004Uid[").append (getClsMul004Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsMul005Uid ())) { str.append ("ClsMul005Uid[").append (getClsMul005Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getItmAcr ())) { str.append ("ItmAcr[").append (getItmAcr ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getUniMeaAltUid ())) { str.append ("UniMeaAltUid[").append (getUniMeaAltUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCnvRat ())) { str.append ("CnvRat[").append (getCnvRat ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getItmCfg ())) { str.append ("ItmCfg[").append (getItmCfg ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getItmNtlUid ())) { str.append ("ItmNtlUid[").append (getItmNtlUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getItmTmlUid ())) { str.append ("ItmTmlUid[").append (getItmTmlUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getVatUid ())) { str.append ("VatUid[").append (getVatUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getItmStsUid ())) { str.append ("ItmStsUid[").append (getItmStsUid ()).append ("] "); } }
        if (Objects.nonNull (getItmExtDsc ())) { str.append ("ItmExtDsc[").append (getItmExtDsc ()).append ("] "); }
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getItmCatUid ())) { str.append ("ItmCatUid[").append (getItmCatUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls016Uid ())) { str.append ("Cls016Uid[").append (getCls016Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls017Uid ())) { str.append ("Cls017Uid[").append (getCls017Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls018Uid ())) { str.append ("Cls018Uid[").append (getCls018Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls019Uid ())) { str.append ("Cls019Uid[").append (getCls019Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls020Uid ())) { str.append ("Cls020Uid[").append (getCls020Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls021Uid ())) { str.append ("Cls021Uid[").append (getCls021Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls022Uid ())) { str.append ("Cls022Uid[").append (getCls022Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls023Uid ())) { str.append ("Cls023Uid[").append (getCls023Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls024Uid ())) { str.append ("Cls024Uid[").append (getCls024Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls025Uid ())) { str.append ("Cls025Uid[").append (getCls025Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls026Uid ())) { str.append ("Cls026Uid[").append (getCls026Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls027Uid ())) { str.append ("Cls027Uid[").append (getCls027Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls028Uid ())) { str.append ("Cls028Uid[").append (getCls028Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls029Uid ())) { str.append ("Cls029Uid[").append (getCls029Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls030Uid ())) { str.append ("Cls030Uid[").append (getCls030Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre016 ())) { str.append ("ClsFre016[").append (getClsFre016 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre017 ())) { str.append ("ClsFre017[").append (getClsFre017 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre018 ())) { str.append ("ClsFre018[").append (getClsFre018 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre019 ())) { str.append ("ClsFre019[").append (getClsFre019 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre020 ())) { str.append ("ClsFre020[").append (getClsFre020 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre021 ())) { str.append ("ClsFre021[").append (getClsFre021 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre022 ())) { str.append ("ClsFre022[").append (getClsFre022 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre023 ())) { str.append ("ClsFre023[").append (getClsFre023 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre024 ())) { str.append ("ClsFre024[").append (getClsFre024 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre025 ())) { str.append ("ClsFre025[").append (getClsFre025 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre026 ())) { str.append ("ClsFre026[").append (getClsFre026 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre027 ())) { str.append ("ClsFre027[").append (getClsFre027 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre028 ())) { str.append ("ClsFre028[").append (getClsFre028 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre029 ())) { str.append ("ClsFre029[").append (getClsFre029 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre030 ())) { str.append ("ClsFre030[").append (getClsFre030 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getComItmUid ())) { str.append ("ComItmUid[").append (getComItmUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getItmTypPrdUid ())) { str.append ("ItmTypPrdUid[").append (getItmTypPrdUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getItmWhsUid ())) { str.append ("ItmWhsUid[").append (getItmWhsUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getItmOwnUid ())) { str.append ("ItmOwnUid[").append (getItmOwnUid ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getPrdCycLst () != null) { str.append ("\n").append (indent).append ("PrdCycLst (").append (getPrdCycLst ().size ()).append ("):"); for (var model : getPrdCycLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getItmNtlRef () != null) { str.append ("\n").append (indent).append ("ItmNtlRef : "); str.append ("\n").append (getItmNtlRef ().debug (full, true, indent + "    ")); } 
        if (getItmTmlRef () != null) { str.append ("\n").append (indent).append ("ItmTmlRef : "); str.append ("\n").append (getItmTmlRef ().debug (full, true, indent + "    ")); } 
        if (getBomLst () != null) { str.append ("\n").append (indent).append ("BomLst (").append (getBomLst ().size ()).append ("):"); for (var model : getBomLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getItmLst () != null) { str.append ("\n").append (indent).append ("ItmLst (").append (getItmLst ().size ()).append ("):"); for (var model : getItmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getItmComLst () != null) { str.append ("\n").append (indent).append ("ItmComLst (").append (getItmComLst ().size ()).append ("):"); for (var model : getItmComLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getItmDimLst () != null) { str.append ("\n").append (indent).append ("ItmDimLst (").append (getItmDimLst ().size ()).append ("):"); for (var model : getItmDimLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getItmVrnLst () != null) { str.append ("\n").append (indent).append ("ItmVrnLst (").append (getItmVrnLst ().size ()).append ("):"); for (var model : getItmVrnLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getItmMdlLst () != null) { str.append ("\n").append (indent).append ("ItmMdlLst (").append (getItmMdlLst ().size ()).append ("):"); for (var model : getItmMdlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getItmLvlSugLst () != null) { str.append ("\n").append (indent).append ("ItmLvlSugLst (").append (getItmLvlSugLst ().size ()).append ("):"); for (var model : getItmLvlSugLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getPrdBomLst () != null) { str.append ("\n").append (indent).append ("PrdBomLst (").append (getPrdBomLst ().size ()).append ("):"); for (var model : getPrdBomLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getOrgCom () != null) { str.append ("\n").append (indent).append ("OrgCom: \n").append (getOrgCom ().debug (full, true, indent + "    ")); }
        if (getUniMeaAlt () != null) { str.append ("\n").append (indent).append ("UniMeaAlt: \n").append (getUniMeaAlt ().debug (full, true, indent + "    ")); }
        if (getItmNtl () != null) { str.append ("\n").append (indent).append ("ItmNtl: \n").append (getItmNtl ().debug (full, true, indent + "    ")); }
        if (getItmTml () != null) { str.append ("\n").append (indent).append ("ItmTml: \n").append (getItmTml ().debug (full, true, indent + "    ")); }
        if (getVat () != null) { str.append ("\n").append (indent).append ("Vat: \n").append (getVat ().debug (full, true, indent + "    ")); }
        if (getSup () != null) { str.append ("\n").append (indent).append ("Sup: \n").append (getSup ().debug (full, true, indent + "    ")); }
        if (getUniMea () != null) { str.append ("\n").append (indent).append ("UniMea: \n").append (getUniMea ().debug (full, true, indent + "    ")); }
        if (getClsItm001 () != null) { str.append ("\n").append (indent).append ("ClsItm001: \n").append (getClsItm001 ().debug (full, true, indent + "    ")); }
        if (getClsItm002 () != null) { str.append ("\n").append (indent).append ("ClsItm002: \n").append (getClsItm002 ().debug (full, true, indent + "    ")); }
        if (getClsItm003 () != null) { str.append ("\n").append (indent).append ("ClsItm003: \n").append (getClsItm003 ().debug (full, true, indent + "    ")); }
        if (getClsItm004 () != null) { str.append ("\n").append (indent).append ("ClsItm004: \n").append (getClsItm004 ().debug (full, true, indent + "    ")); }
        if (getClsItm005 () != null) { str.append ("\n").append (indent).append ("ClsItm005: \n").append (getClsItm005 ().debug (full, true, indent + "    ")); }
        if (getClsItm006 () != null) { str.append ("\n").append (indent).append ("ClsItm006: \n").append (getClsItm006 ().debug (full, true, indent + "    ")); }
        if (getClsItm007 () != null) { str.append ("\n").append (indent).append ("ClsItm007: \n").append (getClsItm007 ().debug (full, true, indent + "    ")); }
        if (getClsItm008 () != null) { str.append ("\n").append (indent).append ("ClsItm008: \n").append (getClsItm008 ().debug (full, true, indent + "    ")); }
        if (getClsItm009 () != null) { str.append ("\n").append (indent).append ("ClsItm009: \n").append (getClsItm009 ().debug (full, true, indent + "    ")); }
        if (getClsItm010 () != null) { str.append ("\n").append (indent).append ("ClsItm010: \n").append (getClsItm010 ().debug (full, true, indent + "    ")); }
        if (getClsItm011 () != null) { str.append ("\n").append (indent).append ("ClsItm011: \n").append (getClsItm011 ().debug (full, true, indent + "    ")); }
        if (getClsItm012 () != null) { str.append ("\n").append (indent).append ("ClsItm012: \n").append (getClsItm012 ().debug (full, true, indent + "    ")); }
        if (getClsItm013 () != null) { str.append ("\n").append (indent).append ("ClsItm013: \n").append (getClsItm013 ().debug (full, true, indent + "    ")); }
        if (getClsItm014 () != null) { str.append ("\n").append (indent).append ("ClsItm014: \n").append (getClsItm014 ().debug (full, true, indent + "    ")); }
        if (getClsItm015 () != null) { str.append ("\n").append (indent).append ("ClsItm015: \n").append (getClsItm015 ().debug (full, true, indent + "    ")); }
        if (getItmSts () != null) { str.append ("\n").append (indent).append ("ItmSts: \n").append (getItmSts ().debug (full, true, indent + "    ")); }
        if (getItmCat () != null) { str.append ("\n").append (indent).append ("ItmCat: \n").append (getItmCat ().debug (full, true, indent + "    ")); }
        if (getClsItm016 () != null) { str.append ("\n").append (indent).append ("ClsItm016: \n").append (getClsItm016 ().debug (full, true, indent + "    ")); }
        if (getClsItm017 () != null) { str.append ("\n").append (indent).append ("ClsItm017: \n").append (getClsItm017 ().debug (full, true, indent + "    ")); }
        if (getClsItm018 () != null) { str.append ("\n").append (indent).append ("ClsItm018: \n").append (getClsItm018 ().debug (full, true, indent + "    ")); }
        if (getClsItm019 () != null) { str.append ("\n").append (indent).append ("ClsItm019: \n").append (getClsItm019 ().debug (full, true, indent + "    ")); }
        if (getClsItm020 () != null) { str.append ("\n").append (indent).append ("ClsItm020: \n").append (getClsItm020 ().debug (full, true, indent + "    ")); }
        if (getClsItm021 () != null) { str.append ("\n").append (indent).append ("ClsItm021: \n").append (getClsItm021 ().debug (full, true, indent + "    ")); }
        if (getClsItm022 () != null) { str.append ("\n").append (indent).append ("ClsItm022: \n").append (getClsItm022 ().debug (full, true, indent + "    ")); }
        if (getClsItm023 () != null) { str.append ("\n").append (indent).append ("ClsItm023: \n").append (getClsItm023 ().debug (full, true, indent + "    ")); }
        if (getClsItm024 () != null) { str.append ("\n").append (indent).append ("ClsItm024: \n").append (getClsItm024 ().debug (full, true, indent + "    ")); }
        if (getClsItm025 () != null) { str.append ("\n").append (indent).append ("ClsItm025: \n").append (getClsItm025 ().debug (full, true, indent + "    ")); }
        if (getClsItm026 () != null) { str.append ("\n").append (indent).append ("ClsItm026: \n").append (getClsItm026 ().debug (full, true, indent + "    ")); }
        if (getClsItm027 () != null) { str.append ("\n").append (indent).append ("ClsItm027: \n").append (getClsItm027 ().debug (full, true, indent + "    ")); }
        if (getClsItm028 () != null) { str.append ("\n").append (indent).append ("ClsItm028: \n").append (getClsItm028 ().debug (full, true, indent + "    ")); }
        if (getClsItm029 () != null) { str.append ("\n").append (indent).append ("ClsItm029: \n").append (getClsItm029 ().debug (full, true, indent + "    ")); }
        if (getClsItm030 () != null) { str.append ("\n").append (indent).append ("ClsItm030: \n").append (getClsItm030 ().debug (full, true, indent + "    ")); }
        if (getComItm () != null) { str.append ("\n").append (indent).append ("ComItm: \n").append (getComItm ().debug (full, true, indent + "    ")); }
        if (getTyp () != null) { str.append ("\n").append (indent).append ("Typ: \n").append (getTyp ().debug (full, true, indent + "    ")); }
        if (getWhs () != null) { str.append ("\n").append (indent).append ("Whs: \n").append (getWhs ().debug (full, true, indent + "    ")); }
        if (getOwn () != null) { str.append ("\n").append (indent).append ("Own: \n").append (getOwn ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngItmImpl newEmptyInstance () { return (AngItmImpl) newInstance (); }
    
    @Override public AngItmImpl getCopy () {
        var toReturn = (AngItmImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngItm _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngItmImpl.baseUrl (); }
    public static String baseUrl () { return AngItmImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngItmImpl.baseUrl = baseUrl; } 

    @Override public List<AngItmFields> getFields () { return Arrays.asList (AngItmFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngItmImpl
