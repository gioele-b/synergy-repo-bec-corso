package net.synergy2.db.dvz.rep;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzRepGntImpl extends DvzRepGnt {

    protected DvzRepGntImpl () { super (); }

    public enum DvzRepGntFields implements ISField {
        Uid, RepQryUid, WdgCod, WdgDsc, WdgPosHrz, WdgPosVrt, WdgSpnHrz, WdgSpnVrt, TssTblAls, DscTblAls, CodTblAls, StrColUid, EndColUid, CodColUid, DscColUid, ClrTblAls, ClrColUid, DayTblAls, DayColUid, TmpScaIni, WdgHid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // DvzRepGntFields
    
    private static String baseUrl = "/rest/dvz/rep/DvzRepGnt";


    @Override public String getModelClassName () { return "DvzRepGntImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public DvzRepGntImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("RepQryUid[").append (getRepQryUid ()).append ("] ");
        str.append ("WdgCod[").append (getWdgCod ()).append ("] ");
        str.append ("WdgDsc[").append (getWdgDsc ()).append ("] ");
        if (full) { str.append ("WdgPosHrz[").append (getWdgPosHrz ()).append ("] "); }
        if (full) { str.append ("WdgPosVrt[").append (getWdgPosVrt ()).append ("] "); }
        if (full) { str.append ("WdgSpnHrz[").append (getWdgSpnHrz ()).append ("] "); }
        if (full) { str.append ("WdgSpnVrt[").append (getWdgSpnVrt ()).append ("] "); }
        if (full) { str.append ("TssTblAls[").append (getTssTblAls ()).append ("] "); }
        if (full) { if (Objects.nonNull (getDscTblAls ())) { str.append ("DscTblAls[").append (getDscTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCodTblAls ())) { str.append ("CodTblAls[").append (getCodTblAls ()).append ("] "); } }
        if (full) { str.append ("StrColUid[").append (getStrColUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getEndColUid ())) { str.append ("EndColUid[").append (getEndColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCodColUid ())) { str.append ("CodColUid[").append (getCodColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDscColUid ())) { str.append ("DscColUid[").append (getDscColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClrTblAls ())) { str.append ("ClrTblAls[").append (getClrTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClrColUid ())) { str.append ("ClrColUid[").append (getClrColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDayTblAls ())) { str.append ("DayTblAls[").append (getDayTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDayColUid ())) { str.append ("DayColUid[").append (getDayColUid ()).append ("] "); } }
        if (full) { str.append ("TmpScaIni[").append (getTmpScaIni ()).append ("] "); }
        if (full) { str.append ("WdgHid[").append (getWdgHid ()).append ("] "); }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getGrpLst () != null) { str.append ("\n").append (indent).append ("GrpLst (").append (getGrpLst ().size ()).append ("):"); for (var model : getGrpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLayLst () != null) { str.append ("\n").append (indent).append ("LayLst (").append (getLayLst ().size ()).append ("):"); for (var model : getLayLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepQry () != null) { str.append ("\n").append (indent).append ("RepQry: \n").append (getRepQry ().debug (full, true, indent + "    ")); }
        if (getStrCol () != null) { str.append ("\n").append (indent).append ("StrCol: \n").append (getStrCol ().debug (full, true, indent + "    ")); }
        if (getEndCol () != null) { str.append ("\n").append (indent).append ("EndCol: \n").append (getEndCol ().debug (full, true, indent + "    ")); }
        if (getCodCol () != null) { str.append ("\n").append (indent).append ("CodCol: \n").append (getCodCol ().debug (full, true, indent + "    ")); }
        if (getDscCol () != null) { str.append ("\n").append (indent).append ("DscCol: \n").append (getDscCol ().debug (full, true, indent + "    ")); }
        if (getClrCol () != null) { str.append ("\n").append (indent).append ("ClrCol: \n").append (getClrCol ().debug (full, true, indent + "    ")); }
        if (getDayCol () != null) { str.append ("\n").append (indent).append ("DayCol: \n").append (getDayCol ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzRepGntImpl newEmptyInstance () { return (DvzRepGntImpl) newInstance (); }
    
    @Override public DvzRepGntImpl getCopy () {
        var toReturn = (DvzRepGntImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (DvzRepGnt _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return DvzRepGntImpl.baseUrl (); }
    public static String baseUrl () { return DvzRepGntImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzRepGntImpl.baseUrl = baseUrl; } 

    @Override public List<DvzRepGntFields> getFields () { return Arrays.asList (DvzRepGntFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzRepGntImpl
