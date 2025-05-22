package net.synergy2.db.sys.ety;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngEtyAttImpl extends AngEtyAtt {

    protected AngEtyAttImpl () { super (); }

    public enum AngEtyAttFields implements ISField {
        Uid, RefEtyUid, ResUid, AttNam, AttDsc, AttTypUid, AttCatUid, EtyComUid, AttDatTyp, AttUplDat, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, CtxRecUid, CtxTblUid, NotCfm, Prv, NotCfmSes, ObsResUid, Obs, ObsMsg, TssObs, DocUid, SrcAttUid;
    } // AngEtyAttFields
    
    private static String baseUrl = "/rest/sys/ety/AngEtyAtt";


    @Override public String getModelClassName () { return "AngEtyAttImpl"; }




    
    @Override public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        switch (fieldName) {

            default -> {
                if (!settedSuper) { throw new SQueryException ("No reference specification found for field [" + fieldName + "]."); }
            }
        } // switch
        return true;
    } // set
    
    @Override public String debug (boolean full, boolean cascade, String indent) {
        StringBuilder str = new StringBuilder (indent).append (getModelClassName ()).append (" = {");
        str.append ("Uid[").append (getUid ()).append ("] ");
        if (full) { str.append ("RefEtyUid[").append (getRefEtyUid ()).append ("] "); }
        if (full) { str.append ("ResUid[").append (getResUid ()).append ("] "); }
        str.append ("AttNam[").append (getAttNam ()).append ("] ");
        if (full) { str.append ("AttDsc[").append (getAttDsc ()).append ("] "); }
        if (full) { str.append ("AttTypUid[").append (getAttTypUid ()).append ("] "); }
        if (full) { str.append ("AttCatUid[").append (getAttCatUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getEtyComUid ())) { str.append ("EtyComUid[").append (getEtyComUid ()).append ("] "); } }
        if (full) { str.append ("AttDatTyp[").append (getAttDatTyp ()).append ("] "); }
        if (full) { str.append ("AttUplDat[").append (getAttUplDat ()).append ("] "); }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCtxRecUid ())) { str.append ("CtxRecUid[").append (getCtxRecUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCtxTblUid ())) { str.append ("CtxTblUid[").append (getCtxTblUid ()).append ("] "); } }
        if (full) { str.append ("NotCfm[").append (getNotCfm ()).append ("] "); }
        if (full) { str.append ("Prv[").append (getPrv ()).append ("] "); }
        if (full) { if (Objects.nonNull (getNotCfmSes ())) { str.append ("NotCfmSes[").append (getNotCfmSes ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getObsResUid ())) { str.append ("ObsResUid[").append (getObsResUid ()).append ("] "); } }
        if (full) { str.append ("Obs[").append (getObs ()).append ("] "); }
        if (Objects.nonNull (getObsMsg ())) { str.append ("ObsMsg[").append (getObsMsg ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTssObs ())) { str.append ("TssObs[").append (getTssObs ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDocUid ())) { str.append ("DocUid[").append (getDocUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getSrcAttUid ())) { str.append ("SrcAttUid[").append (getSrcAttUid ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getVisLst () != null) { str.append ("\n").append (indent).append ("VisLst (").append (getVisLst ().size ()).append ("):"); for (var model : getVisLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDupAttLst () != null) { str.append ("\n").append (indent).append ("DupAttLst (").append (getDupAttLst ().size ()).append ("):"); for (var model : getDupAttLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getNotEtyAttLst () != null) { str.append ("\n").append (indent).append ("NotEtyAttLst (").append (getNotEtyAttLst ().size ()).append ("):"); for (var model : getNotEtyAttLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEty () != null) { str.append ("\n").append (indent).append ("Ety: \n").append (getEty ().debug (full, true, indent + "    ")); }
        if (getTyp () != null) { str.append ("\n").append (indent).append ("Typ: \n").append (getTyp ().debug (full, true, indent + "    ")); }
        if (getCat () != null) { str.append ("\n").append (indent).append ("Cat: \n").append (getCat ().debug (full, true, indent + "    ")); }
        if (getCom () != null) { str.append ("\n").append (indent).append ("Com: \n").append (getCom ().debug (full, true, indent + "    ")); }
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        if (getCtxTbl () != null) { str.append ("\n").append (indent).append ("CtxTbl: \n").append (getCtxTbl ().debug (full, true, indent + "    ")); }
        if (getObsRes () != null) { str.append ("\n").append (indent).append ("ObsRes: \n").append (getObsRes ().debug (full, true, indent + "    ")); }
        if (getDocEty () != null) { str.append ("\n").append (indent).append ("DocEty: \n").append (getDocEty ().debug (full, true, indent + "    ")); }
        if (getSrcAtt () != null) { str.append ("\n").append (indent).append ("SrcAtt: \n").append (getSrcAtt ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngEtyAttImpl newEmptyInstance () { return (AngEtyAttImpl) newInstance (); }
    
    @Override public AngEtyAttImpl getCopy () {
        return (AngEtyAttImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngEtyAtt _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngEtyAttImpl.baseUrl (); }
    public static String baseUrl () { return AngEtyAttImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngEtyAttImpl.baseUrl = baseUrl; } 

    @Override public List<AngEtyAttFields> getFields () { return Arrays.asList (AngEtyAttFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngEtyAttImpl
