package net.synergy2.db.sys.qry;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngQrySrtImpl extends AngQrySrt {

    protected AngQrySrtImpl () { super (); }

    public enum AngQrySrtFields implements ISField {
        Uid, QryUid, SrtOrd, TblAls, DbmColNam, SrtAsc, ColTra, Tsi, Tsu, Rsi, Rsu, SpcSrt, ScmFldUid;
    } // AngQrySrtFields
    
    private static String baseUrl = "/rest/sys/qry/AngQrySrt";


    @Override public String getModelClassName () { return "AngQrySrtImpl"; }




    
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
        str.append ("QryUid[").append (getQryUid ()).append ("] ");
        str.append ("SrtOrd[").append (getSrtOrd ()).append ("] ");
        if (full) { if (Objects.nonNull (getTblAls ())) { str.append ("TblAls[").append (getTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDbmColNam ())) { str.append ("DbmColNam[").append (getDbmColNam ()).append ("] "); } }
        if (full) { str.append ("SrtAsc[").append (getSrtAsc ()).append ("] "); }
        if (full) { str.append ("ColTra[").append (getColTra ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getSpcSrt ())) { str.append ("SpcSrt[").append (getSpcSrt ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getScmFldUid ())) { str.append ("ScmFldUid[").append (getScmFldUid ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getQry () != null) { str.append ("\n").append (indent).append ("Qry: \n").append (getQry ().debug (full, true, indent + "    ")); }
        if (getScmFld () != null) { str.append ("\n").append (indent).append ("ScmFld: \n").append (getScmFld ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngQrySrtImpl newEmptyInstance () { return (AngQrySrtImpl) newInstance (); }
    
    @Override public AngQrySrtImpl getCopy () {
        return (AngQrySrtImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngQrySrt _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngQrySrtImpl.baseUrl (); }
    public static String baseUrl () { return AngQrySrtImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngQrySrtImpl.baseUrl = baseUrl; } 

    @Override public List<AngQrySrtFields> getFields () { return Arrays.asList (AngQrySrtFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngQrySrtImpl
