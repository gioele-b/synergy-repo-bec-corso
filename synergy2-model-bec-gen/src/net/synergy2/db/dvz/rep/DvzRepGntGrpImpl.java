package net.synergy2.db.dvz.rep;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzRepGntGrpImpl extends DvzRepGntGrp {

    protected DvzRepGntGrpImpl () { super (); }

    public enum DvzRepGntGrpFields implements ISField {
        Uid, GntUid, GrpTblAls, GrpColUid, DscColUid, GrpSrt, GrpIni, RngLen, RngTmpUni, GrpClpIni, Tsi, Tsu, Rsi, Rsu;
    } // DvzRepGntGrpFields
    
    private static String baseUrl = "/rest/dvz/rep/DvzRepGntGrp";


    @Override public String getModelClassName () { return "DvzRepGntGrpImpl"; }




    
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
        str.append ("GntUid[").append (getGntUid ()).append ("] ");
        str.append ("GrpTblAls[").append (getGrpTblAls ()).append ("] ");
        str.append ("GrpColUid[").append (getGrpColUid ()).append ("] ");
        if (full) { if (Objects.nonNull (getDscColUid ())) { str.append ("DscColUid[").append (getDscColUid ()).append ("] "); } }
        if (full) { str.append ("GrpSrt[").append (getGrpSrt ()).append ("] "); }
        if (full) { str.append ("GrpIni[").append (getGrpIni ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRngLen ())) { str.append ("RngLen[").append (getRngLen ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRngTmpUni ())) { str.append ("RngTmpUni[").append (getRngTmpUni ()).append ("] "); } }
        if (full) { str.append ("GrpClpIni[").append (getGrpClpIni ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getGnt () != null) { str.append ("\n").append (indent).append ("Gnt: \n").append (getGnt ().debug (full, true, indent + "    ")); }
        if (getGrpCol () != null) { str.append ("\n").append (indent).append ("GrpCol: \n").append (getGrpCol ().debug (full, true, indent + "    ")); }
        if (getDscCol () != null) { str.append ("\n").append (indent).append ("DscCol: \n").append (getDscCol ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzRepGntGrpImpl newEmptyInstance () { return (DvzRepGntGrpImpl) newInstance (); }
    
    @Override public DvzRepGntGrpImpl getCopy () {
        return (DvzRepGntGrpImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (DvzRepGntGrp _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DvzRepGntGrpImpl.baseUrl (); }
    public static String baseUrl () { return DvzRepGntGrpImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzRepGntGrpImpl.baseUrl = baseUrl; } 

    @Override public List<DvzRepGntGrpFields> getFields () { return Arrays.asList (DvzRepGntGrpFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzRepGntGrpImpl
