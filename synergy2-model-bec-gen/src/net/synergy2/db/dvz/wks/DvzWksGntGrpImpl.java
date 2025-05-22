package net.synergy2.db.dvz.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzWksGntGrpImpl extends DvzWksGntGrp {

    protected DvzWksGntGrpImpl () { super (); }

    public enum DvzWksGntGrpFields implements ISField {
        Uid, DvzGntUid, GrpTblAls, GrpColUid, GrpClcUid, DscTblAls, DscColUid, DscClcUid, GrpSrt, GrpIni, RngLen, RngTmpUni, GrpClpIni, Tsi, Tsu, Rsi, Rsu, GrpFldUid, DscFldUid;
    } // DvzWksGntGrpFields
    
    private static String baseUrl = "/rest/dvz/wks/DvzWksGntGrp";


    @Override public String getModelClassName () { return "DvzWksGntGrpImpl"; }




    
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
        if (full) { str.append ("DvzGntUid[").append (getDvzGntUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getGrpTblAls ())) { str.append ("GrpTblAls[").append (getGrpTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getGrpColUid ())) { str.append ("GrpColUid[").append (getGrpColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getGrpClcUid ())) { str.append ("GrpClcUid[").append (getGrpClcUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDscTblAls ())) { str.append ("DscTblAls[").append (getDscTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDscColUid ())) { str.append ("DscColUid[").append (getDscColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDscClcUid ())) { str.append ("DscClcUid[").append (getDscClcUid ()).append ("] "); } }
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
        if (full) { if (Objects.nonNull (getGrpFldUid ())) { str.append ("GrpFldUid[").append (getGrpFldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDscFldUid ())) { str.append ("DscFldUid[").append (getDscFldUid ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getDvzGnt () != null) { str.append ("\n").append (indent).append ("DvzGnt: \n").append (getDvzGnt ().debug (full, true, indent + "    ")); }
        if (getGrpCol () != null) { str.append ("\n").append (indent).append ("GrpCol: \n").append (getGrpCol ().debug (full, true, indent + "    ")); }
        if (getGrpClc () != null) { str.append ("\n").append (indent).append ("GrpClc: \n").append (getGrpClc ().debug (full, true, indent + "    ")); }
        if (getDscCol () != null) { str.append ("\n").append (indent).append ("DscCol: \n").append (getDscCol ().debug (full, true, indent + "    ")); }
        if (getDscClc () != null) { str.append ("\n").append (indent).append ("DscClc: \n").append (getDscClc ().debug (full, true, indent + "    ")); }
        if (getGrpFld () != null) { str.append ("\n").append (indent).append ("GrpFld: \n").append (getGrpFld ().debug (full, true, indent + "    ")); }
        if (getDscFld () != null) { str.append ("\n").append (indent).append ("DscFld: \n").append (getDscFld ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzWksGntGrpImpl newEmptyInstance () { return (DvzWksGntGrpImpl) newInstance (); }
    
    @Override public DvzWksGntGrpImpl getCopy () {
        return (DvzWksGntGrpImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (DvzWksGntGrp _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DvzWksGntGrpImpl.baseUrl (); }
    public static String baseUrl () { return DvzWksGntGrpImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzWksGntGrpImpl.baseUrl = baseUrl; } 

    @Override public List<DvzWksGntGrpFields> getFields () { return Arrays.asList (DvzWksGntGrpFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzWksGntGrpImpl
