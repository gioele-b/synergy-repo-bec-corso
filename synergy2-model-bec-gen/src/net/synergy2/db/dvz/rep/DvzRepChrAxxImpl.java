package net.synergy2.db.dvz.rep;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzRepChrAxxImpl extends DvzRepChrAxx {

    protected DvzRepChrAxxImpl () { super (); }

    public enum DvzRepChrAxxFields implements ISField {
        Uid, ChrUid, DbmColUid, TblAls, AxxSrt, RngLen, RngTmpUni, NumMin, NumMax, ClrColUid, DscColUid, Tsi, Tsu, Rsi, Rsu;
    } // DvzRepChrAxxFields
    
    private static String baseUrl = "/rest/dvz/rep/DvzRepChrAxx";


    @Override public String getModelClassName () { return "DvzRepChrAxxImpl"; }




    
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
        str.append ("ChrUid[").append (getChrUid ()).append ("] ");
        str.append ("DbmColUid[").append (getDbmColUid ()).append ("] ");
        str.append ("TblAls[").append (getTblAls ()).append ("] ");
        if (full) { str.append ("AxxSrt[").append (getAxxSrt ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRngLen ())) { str.append ("RngLen[").append (getRngLen ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRngTmpUni ())) { str.append ("RngTmpUni[").append (getRngTmpUni ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getNumMin ())) { str.append ("NumMin[").append (getNumMin ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getNumMax ())) { str.append ("NumMax[").append (getNumMax ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClrColUid ())) { str.append ("ClrColUid[").append (getClrColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDscColUid ())) { str.append ("DscColUid[").append (getDscColUid ()).append ("] "); } }
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
        if (getChr () != null) { str.append ("\n").append (indent).append ("Chr: \n").append (getChr ().debug (full, true, indent + "    ")); }
        if (getDbmCol () != null) { str.append ("\n").append (indent).append ("DbmCol: \n").append (getDbmCol ().debug (full, true, indent + "    ")); }
        if (getClrCol () != null) { str.append ("\n").append (indent).append ("ClrCol: \n").append (getClrCol ().debug (full, true, indent + "    ")); }
        if (getDscCol () != null) { str.append ("\n").append (indent).append ("DscCol: \n").append (getDscCol ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzRepChrAxxImpl newEmptyInstance () { return (DvzRepChrAxxImpl) newInstance (); }
    
    @Override public DvzRepChrAxxImpl getCopy () {
        return (DvzRepChrAxxImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (DvzRepChrAxx _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DvzRepChrAxxImpl.baseUrl (); }
    public static String baseUrl () { return DvzRepChrAxxImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzRepChrAxxImpl.baseUrl = baseUrl; } 

    @Override public List<DvzRepChrAxxFields> getFields () { return Arrays.asList (DvzRepChrAxxFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzRepChrAxxImpl
