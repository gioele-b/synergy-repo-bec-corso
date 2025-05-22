package net.synergy2.db.sys.res;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class AngResImpl extends AngRes {

    protected AngResImpl () { super (); }

    public enum AngResFields implements ISField {
        Uid, EtyUid, ResTypUid, ResCod, ResNam, ResSur, ResDsc, ResShtDsc, LogDel, ResIco, ResTpl, LgnUsr, EmlAdd, LgnCrpPwd, LgnIpa, DtsVal, DteVal, OrgComUid, OrgComFlt, OrgComShwGlb, OrgComEdtGlb, UsrFavLngUid, AgnCod, BdgUid, CalUid, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, CalPrv, TimZonUid, ChgPswEnb, ChgPswNxtLgn, LstPswChgTss, CalSyn, ResClr, WrcUid, Lgn2FaEnb, Lgn2FaKey, Lgn2faEnbBlc;
    } // AngResFields
    
    private static String baseUrl = "/rest/sys/res/AngRes";


    @Override public String getModelClassName () { return "AngResImpl"; }




    
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
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
        if (full) { str.append ("ResTypUid[").append (getResTypUid ()).append ("] "); }
        str.append ("ResCod[").append (getResCod ()).append ("] ");
        if (full) { if (Objects.nonNull (getResNam ())) { str.append ("ResNam[").append (getResNam ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getResSur ())) { str.append ("ResSur[").append (getResSur ()).append ("] "); } }
        str.append ("ResDsc[").append (getResDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getResShtDsc ())) { str.append ("ResShtDsc[").append (getResShtDsc ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { str.append ("ResIco[").append (getResIco ()).append ("] "); }
        if (full) { str.append ("ResTpl[").append (getResTpl ()).append ("] "); }
        if (full) { if (Objects.nonNull (getLgnUsr ())) { str.append ("LgnUsr[").append (getLgnUsr ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEmlAdd ())) { str.append ("EmlAdd[").append (getEmlAdd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLgnCrpPwd ())) { str.append ("LgnCrpPwd[").append (getLgnCrpPwd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLgnIpa ())) { str.append ("LgnIpa[").append (getLgnIpa ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDtsVal ())) { str.append ("DtsVal[").append (getDtsVal ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDteVal ())) { str.append ("DteVal[").append (getDteVal ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getOrgComUid ())) { str.append ("OrgComUid[").append (getOrgComUid ()).append ("] "); } }
        if (full) { str.append ("OrgComFlt[").append (getOrgComFlt ()).append ("] "); }
        if (full) { str.append ("OrgComShwGlb[").append (getOrgComShwGlb ()).append ("] "); }
        if (full) { str.append ("OrgComEdtGlb[").append (getOrgComEdtGlb ()).append ("] "); }
        if (full) { if (Objects.nonNull (getUsrFavLngUid ())) { str.append ("UsrFavLngUid[").append (getUsrFavLngUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getAgnCod ())) { str.append ("AgnCod[").append (getAgnCod ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getBdgUid ())) { str.append ("BdgUid[").append (getBdgUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCalUid ())) { str.append ("CalUid[").append (getCalUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { str.append ("CalPrv[").append (getCalPrv ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTimZonUid ())) { str.append ("TimZonUid[").append (getTimZonUid ()).append ("] "); } }
        if (full) { str.append ("ChgPswEnb[").append (getChgPswEnb ()).append ("] "); }
        if (full) { str.append ("ChgPswNxtLgn[").append (getChgPswNxtLgn ()).append ("] "); }
        if (full) { if (Objects.nonNull (getLstPswChgTss ())) { str.append ("LstPswChgTss[").append (getLstPswChgTss ()).append ("] "); } }
        if (full) { str.append ("CalSyn[").append (getCalSyn ()).append ("] "); }
        if (full) { if (Objects.nonNull (getResClr ())) { str.append ("ResClr[").append (getResClr ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getWrcUid ())) { str.append ("WrcUid[").append (getWrcUid ()).append ("] "); } }
        if (full) { str.append ("Lgn2FaEnb[").append (getLgn2FaEnb ()).append ("] "); }
        if (full) { if (Objects.nonNull (getLgn2FaKey ())) { str.append ("Lgn2FaKey[").append (getLgn2FaKey ()).append ("] "); } }
        if (full) { str.append ("Lgn2faEnbBlc[").append (getLgn2faEnbBlc ()).append ("] "); }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getAppHomLst () != null) { str.append ("\n").append (indent).append ("AppHomLst (").append (getAppHomLst ().size ()).append ("):"); for (var model : getAppHomLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAbsLst () != null) { str.append ("\n").append (indent).append ("AbsLst (").append (getAbsLst ().size ()).append ("):"); for (var model : getAbsLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAvlLst () != null) { str.append ("\n").append (indent).append ("AvlLst (").append (getAvlLst ().size ()).append ("):"); for (var model : getAvlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEvtManLst () != null) { str.append ("\n").append (indent).append ("EvtManLst (").append (getEvtManLst ().size ()).append ("):"); for (var model : getEvtManLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCalEvtInvLst () != null) { str.append ("\n").append (indent).append ("CalEvtInvLst (").append (getCalEvtInvLst ().size ()).append ("):"); for (var model : getCalEvtInvLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getShfTypResFavLst () != null) { str.append ("\n").append (indent).append ("ShfTypResFavLst (").append (getShfTypResFavLst ().size ()).append ("):"); for (var model : getShfTypResFavLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCalEvtResLst () != null) { str.append ("\n").append (indent).append ("CalEvtResLst (").append (getCalEvtResLst ().size ()).append ("):"); for (var model : getCalEvtResLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCalEvtSubResLst () != null) { str.append ("\n").append (indent).append ("CalEvtSubResLst (").append (getCalEvtSubResLst ().size ()).append ("):"); for (var model : getCalEvtSubResLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEmaEleLst () != null) { str.append ("\n").append (indent).append ("EmaEleLst (").append (getEmaEleLst ().size ()).append ("):"); for (var model : getEmaEleLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSrvSrcLst () != null) { str.append ("\n").append (indent).append ("SrvSrcLst (").append (getSrvSrcLst ().size ()).append ("):"); for (var model : getSrvSrcLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSrcCodLst () != null) { str.append ("\n").append (indent).append ("SrcCodLst (").append (getSrcCodLst ().size ()).append ("):"); for (var model : getSrcCodLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEtyComLst () != null) { str.append ("\n").append (indent).append ("EtyComLst (").append (getEtyComLst ().size ()).append ("):"); for (var model : getEtyComLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEtyExtLnkLst () != null) { str.append ("\n").append (indent).append ("EtyExtLnkLst (").append (getEtyExtLnkLst ().size ()).append ("):"); for (var model : getEtyExtLnkLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEtyLikLst () != null) { str.append ("\n").append (indent).append ("EtyLikLst (").append (getEtyLikLst ().size ()).append ("):"); for (var model : getEtyLikLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEtyMenCrtLst () != null) { str.append ("\n").append (indent).append ("EtyMenCrtLst (").append (getEtyMenCrtLst ().size ()).append ("):"); for (var model : getEtyMenCrtLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEtyMenLst () != null) { str.append ("\n").append (indent).append ("EtyMenLst (").append (getEtyMenLst ().size ()).append ("):"); for (var model : getEtyMenLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEtyWtcLst () != null) { str.append ("\n").append (indent).append ("EtyWtcLst (").append (getEtyWtcLst ().size ()).append ("):"); for (var model : getEtyWtcLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEtyLnkLst () != null) { str.append ("\n").append (indent).append ("EtyLnkLst (").append (getEtyLnkLst ().size ()).append ("):"); for (var model : getEtyLnkLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEtyAttLst () != null) { str.append ("\n").append (indent).append ("EtyAttLst (").append (getEtyAttLst ().size ()).append ("):"); for (var model : getEtyAttLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEtyAttVisLst () != null) { str.append ("\n").append (indent).append ("EtyAttVisLst (").append (getEtyAttVisLst ().size ()).append ("):"); for (var model : getEtyAttVisLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEtyComVisLst () != null) { str.append ("\n").append (indent).append ("EtyComVisLst (").append (getEtyComVisLst ().size ()).append ("):"); for (var model : getEtyComVisLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEtyAttObsLst () != null) { str.append ("\n").append (indent).append ("EtyAttObsLst (").append (getEtyAttObsLst ().size ()).append ("):"); for (var model : getEtyAttObsLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getGrpFunResLst () != null) { str.append ("\n").append (indent).append ("GrpFunResLst (").append (getGrpFunResLst ().size ()).append ("):"); for (var model : getGrpFunResLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getGrpResLst () != null) { str.append ("\n").append (indent).append ("GrpResLst (").append (getGrpResLst ().size ()).append ("):"); for (var model : getGrpResLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getResLst () != null) { str.append ("\n").append (indent).append ("ResLst (").append (getResLst ().size ()).append ("):"); for (var model : getResLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getJobLst () != null) { str.append ("\n").append (indent).append ("JobLst (").append (getJobLst ().size ()).append ("):"); for (var model : getJobLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getMobAppTknLst () != null) { str.append ("\n").append (indent).append ("MobAppTknLst (").append (getMobAppTknLst ().size ()).append ("):"); for (var model : getMobAppTknLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getNotMncLst () != null) { str.append ("\n").append (indent).append ("NotMncLst (").append (getNotMncLst ().size ()).append ("):"); for (var model : getNotMncLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getBotLst () != null) { str.append ("\n").append (indent).append ("BotLst (").append (getBotLst ().size ()).append ("):"); for (var model : getBotLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCntLst () != null) { str.append ("\n").append (indent).append ("CntLst (").append (getCntLst ().size ()).append ("):"); for (var model : getCntLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getNotTypLst () != null) { str.append ("\n").append (indent).append ("NotTypLst (").append (getNotTypLst ().size ()).append ("):"); for (var model : getNotTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getNotMncTknPshLst () != null) { str.append ("\n").append (indent).append ("NotMncTknPshLst (").append (getNotMncTknPshLst ().size ()).append ("):"); for (var model : getNotMncTknPshLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getOptLst () != null) { str.append ("\n").append (indent).append ("OptLst (").append (getOptLst ().size ()).append ("):"); for (var model : getOptLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLvlLst () != null) { str.append ("\n").append (indent).append ("LvlLst (").append (getLvlLst ().size ()).append ("):"); for (var model : getLvlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getManLvlLst () != null) { str.append ("\n").append (indent).append ("ManLvlLst (").append (getManLvlLst ().size ()).append ("):"); for (var model : getManLvlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getGenManLvlLst () != null) { str.append ("\n").append (indent).append ("GenManLvlLst (").append (getGenManLvlLst ().size ()).append ("):"); for (var model : getGenManLvlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getGenResLvlLst () != null) { str.append ("\n").append (indent).append ("GenResLvlLst (").append (getGenResLvlLst ().size ()).append ("):"); for (var model : getGenResLvlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCstWrkCenResLst () != null) { str.append ("\n").append (indent).append ("CstWrkCenResLst (").append (getCstWrkCenResLst ().size ()).append ("):"); for (var model : getCstWrkCenResLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLvlRepLst () != null) { str.append ("\n").append (indent).append ("LvlRepLst (").append (getLvlRepLst ().size ()).append ("):"); for (var model : getLvlRepLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQryDefLst () != null) { str.append ("\n").append (indent).append ("QryDefLst (").append (getQryDefLst ().size ()).append ("):"); for (var model : getQryDefLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQryLytDefLst () != null) { str.append ("\n").append (indent).append ("QryLytDefLst (").append (getQryLytDefLst ().size ()).append ("):"); for (var model : getQryLytDefLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCodLst () != null) { str.append ("\n").append (indent).append ("CodLst (").append (getCodLst ().size ()).append ("):"); for (var model : getCodLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRolLst () != null) { str.append ("\n").append (indent).append ("RolLst (").append (getRolLst ().size ()).append ("):"); for (var model : getRolLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getResPswLst () != null) { str.append ("\n").append (indent).append ("ResPswLst (").append (getResPswLst ().size ()).append ("):"); for (var model : getResPswLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getResSubLst () != null) { str.append ("\n").append (indent).append ("ResSubLst (").append (getResSubLst ().size ()).append ("):"); for (var model : getResSubLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getOwnSubLst () != null) { str.append ("\n").append (indent).append ("OwnSubLst (").append (getOwnSubLst ().size ()).append ("):"); for (var model : getOwnSubLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEmlLst () != null) { str.append ("\n").append (indent).append ("EmlLst (").append (getEmlLst ().size ()).append ("):"); for (var model : getEmlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getTstRunLst () != null) { str.append ("\n").append (indent).append ("TstRunLst (").append (getTstRunLst ().size ()).append ("):"); for (var model : getTstRunLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getMnuFavLst () != null) { str.append ("\n").append (indent).append ("MnuFavLst (").append (getMnuFavLst ().size ()).append ("):"); for (var model : getMnuFavLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysWksTabLst () != null) { str.append ("\n").append (indent).append ("SysWksTabLst (").append (getSysWksTabLst ().size ()).append ("):"); for (var model : getSysWksTabLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWdgCfgLst () != null) { str.append ("\n").append (indent).append ("WdgCfgLst (").append (getWdgCfgLst ().size ()).append ("):"); for (var model : getWdgCfgLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWksLytLst () != null) { str.append ("\n").append (indent).append ("WksLytLst (").append (getWksLytLst ().size ()).append ("):"); for (var model : getWksLytLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getOrgCom () != null) { str.append ("\n").append (indent).append ("OrgCom: \n").append (getOrgCom ().debug (full, true, indent + "    ")); }
        if (getCal () != null) { str.append ("\n").append (indent).append ("Cal: \n").append (getCal ().debug (full, true, indent + "    ")); }
        if (getWrc () != null) { str.append ("\n").append (indent).append ("Wrc: \n").append (getWrc ().debug (full, true, indent + "    ")); }
        if (getTyp () != null) { str.append ("\n").append (indent).append ("Typ: \n").append (getTyp ().debug (full, true, indent + "    ")); }
        if (getFavLng () != null) { str.append ("\n").append (indent).append ("FavLng: \n").append (getFavLng ().debug (full, true, indent + "    ")); }
        if (getBdg () != null) { str.append ("\n").append (indent).append ("Bdg: \n").append (getBdg ().debug (full, true, indent + "    ")); }
        if (getTimZon () != null) { str.append ("\n").append (indent).append ("TimZon: \n").append (getTimZon ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngResImpl newEmptyInstance () { return (AngResImpl) newInstance (); }
    
    @Override public AngResImpl getCopy () {
        return (AngResImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngRes _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngResImpl.baseUrl (); }
    public static String baseUrl () { return AngResImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngResImpl.baseUrl = baseUrl; } 

    @Override public List<AngResFields> getFields () { return Arrays.asList (AngResFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngResImpl
