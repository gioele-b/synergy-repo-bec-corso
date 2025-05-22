package net.synergy2.db.sys.lst;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngLstRemImpl extends AngLstRem {

    protected AngLstRemImpl () { super (); }

    public enum AngLstRemFields implements ISField {
        Uid, LstCod, LstDsc, SrcTyp, RemFrm, Flt001, Flt002, Flt003, Lmt, GrpByy, GrpFlt, OrdByy, RemSrvUid, RemSrvOrgCod, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, EnbCrdSel, EnbCrdGrd, CrdGrdColNum, CrdGrdColNumDsk;
    } // AngLstRemFields
    
    private static String baseUrl = "/rest/sys/lst/AngLstRem";


    @Override public String getModelClassName () { return "AngLstRemImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngLstRemImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("LstCod[").append (getLstCod ()).append ("] ");
        str.append ("LstDsc[").append (getLstDsc ()).append ("] ");
        if (full) { str.append ("SrcTyp[").append (getSrcTyp ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRemFrm ())) { str.append ("RemFrm[").append (getRemFrm ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlt001 ())) { str.append ("Flt001[").append (getFlt001 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlt002 ())) { str.append ("Flt002[").append (getFlt002 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlt003 ())) { str.append ("Flt003[").append (getFlt003 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLmt ())) { str.append ("Lmt[").append (getLmt ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getGrpByy ())) { str.append ("GrpByy[").append (getGrpByy ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getGrpFlt ())) { str.append ("GrpFlt[").append (getGrpFlt ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getOrdByy ())) { str.append ("OrdByy[").append (getOrdByy ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRemSrvUid ())) { str.append ("RemSrvUid[").append (getRemSrvUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRemSrvOrgCod ())) { str.append ("RemSrvOrgCod[").append (getRemSrvOrgCod ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { str.append ("EnbCrdSel[").append (getEnbCrdSel ()).append ("] "); }
        if (full) { str.append ("EnbCrdGrd[").append (getEnbCrdGrd ()).append ("] "); }
        if (full) { if (Objects.nonNull (getCrdGrdColNum ())) { str.append ("CrdGrdColNum[").append (getCrdGrdColNum ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCrdGrdColNumDsk ())) { str.append ("CrdGrdColNumDsk[").append (getCrdGrdColNumDsk ()).append ("] "); } }
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
        if (getLstRemFldLst () != null) { str.append ("\n").append (indent).append ("LstRemFldLst (").append (getLstRemFldLst ().size ()).append ("):"); for (var model : getLstRemFldLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getFldFrmLst () != null) { str.append ("\n").append (indent).append ("FldFrmLst (").append (getFldFrmLst ().size ()).append ("):"); for (var model : getFldFrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUpfLst () != null) { str.append ("\n").append (indent).append ("UpfLst (").append (getUpfLst ().size ()).append ("):"); for (var model : getUpfLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRemSrv () != null) { str.append ("\n").append (indent).append ("RemSrv: \n").append (getRemSrv ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngLstRemImpl newEmptyInstance () { return (AngLstRemImpl) newInstance (); }
    
    @Override public AngLstRemImpl getCopy () {
        var toReturn = (AngLstRemImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngLstRem _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngLstRemImpl.baseUrl (); }
    public static String baseUrl () { return AngLstRemImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngLstRemImpl.baseUrl = baseUrl; } 

    @Override public List<AngLstRemFields> getFields () { return Arrays.asList (AngLstRemFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngLstRemImpl
