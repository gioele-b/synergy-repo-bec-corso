package net.synergy2.db.dvz.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzWksChrAxxImpl extends DvzWksChrAxx {

    protected DvzWksChrAxxImpl () { super (); }

    public enum DvzWksChrAxxFields implements ISField {
        Uid, DvzChrUid, AxxTblAls, AxxColUid, AxxClcUid, AxxSrt, RngLen, RngTmpUni, NumMin, NumMax, ClrTblAls, ClrColUid, ClrClcUid, DscTblAls, DscColUid, DscClcUid, Tsi, Tsu, Rsi, Rsu, AxxFldUid, ClrFldUid, DscFldUid, DvzQryUid, FmtVal;
    } // DvzWksChrAxxFields
    
    private static String baseUrl = "/rest/dvz/wks/DvzWksChrAxx";


    @Override public String getModelClassName () { return "DvzWksChrAxxImpl"; }




    
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
        str.append ("DvzChrUid[").append (getDvzChrUid ()).append ("] ");
        if (full) { if (Objects.nonNull (getAxxTblAls ())) { str.append ("AxxTblAls[").append (getAxxTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getAxxColUid ())) { str.append ("AxxColUid[").append (getAxxColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getAxxClcUid ())) { str.append ("AxxClcUid[").append (getAxxClcUid ()).append ("] "); } }
        if (full) { str.append ("AxxSrt[").append (getAxxSrt ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRngLen ())) { str.append ("RngLen[").append (getRngLen ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRngTmpUni ())) { str.append ("RngTmpUni[").append (getRngTmpUni ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getNumMin ())) { str.append ("NumMin[").append (getNumMin ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getNumMax ())) { str.append ("NumMax[").append (getNumMax ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClrTblAls ())) { str.append ("ClrTblAls[").append (getClrTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClrColUid ())) { str.append ("ClrColUid[").append (getClrColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClrClcUid ())) { str.append ("ClrClcUid[").append (getClrClcUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDscTblAls ())) { str.append ("DscTblAls[").append (getDscTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDscColUid ())) { str.append ("DscColUid[").append (getDscColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDscClcUid ())) { str.append ("DscClcUid[").append (getDscClcUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getAxxFldUid ())) { str.append ("AxxFldUid[").append (getAxxFldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClrFldUid ())) { str.append ("ClrFldUid[").append (getClrFldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDscFldUid ())) { str.append ("DscFldUid[").append (getDscFldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDvzQryUid ())) { str.append ("DvzQryUid[").append (getDvzQryUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFmtVal ())) { str.append ("FmtVal[").append (getFmtVal ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getDvzChr () != null) { str.append ("\n").append (indent).append ("DvzChr: \n").append (getDvzChr ().debug (full, true, indent + "    ")); }
        if (getAxxCol () != null) { str.append ("\n").append (indent).append ("AxxCol: \n").append (getAxxCol ().debug (full, true, indent + "    ")); }
        if (getAxxClc () != null) { str.append ("\n").append (indent).append ("AxxClc: \n").append (getAxxClc ().debug (full, true, indent + "    ")); }
        if (getClrCol () != null) { str.append ("\n").append (indent).append ("ClrCol: \n").append (getClrCol ().debug (full, true, indent + "    ")); }
        if (getClrClc () != null) { str.append ("\n").append (indent).append ("ClrClc: \n").append (getClrClc ().debug (full, true, indent + "    ")); }
        if (getDscCol () != null) { str.append ("\n").append (indent).append ("DscCol: \n").append (getDscCol ().debug (full, true, indent + "    ")); }
        if (getDscClc () != null) { str.append ("\n").append (indent).append ("DscClc: \n").append (getDscClc ().debug (full, true, indent + "    ")); }
        if (getAxxFld () != null) { str.append ("\n").append (indent).append ("AxxFld: \n").append (getAxxFld ().debug (full, true, indent + "    ")); }
        if (getClrFld () != null) { str.append ("\n").append (indent).append ("ClrFld: \n").append (getClrFld ().debug (full, true, indent + "    ")); }
        if (getDscFld () != null) { str.append ("\n").append (indent).append ("DscFld: \n").append (getDscFld ().debug (full, true, indent + "    ")); }
        if (getDvzQry () != null) { str.append ("\n").append (indent).append ("DvzQry: \n").append (getDvzQry ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzWksChrAxxImpl newEmptyInstance () { return (DvzWksChrAxxImpl) newInstance (); }
    
    @Override public DvzWksChrAxxImpl getCopy () {
        return (DvzWksChrAxxImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (DvzWksChrAxx _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DvzWksChrAxxImpl.baseUrl (); }
    public static String baseUrl () { return DvzWksChrAxxImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzWksChrAxxImpl.baseUrl = baseUrl; } 

    @Override public List<DvzWksChrAxxFields> getFields () { return Arrays.asList (DvzWksChrAxxFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzWksChrAxxImpl
