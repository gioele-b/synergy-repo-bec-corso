package net.synergy2.db.sys.bas;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngUniMeaTmpErpImpl extends AngUniMeaTmpErp {

    protected AngUniMeaTmpErpImpl () { super (); }

    public enum AngUniMeaTmpErpFields implements ISField {
        Uid, UniMeaTmpUid, UniMeaTmpErpCod, UniMeaTmpErpDsc, Tsi, Tsu, Rsi, Rsu;
    } // AngUniMeaTmpErpFields
    
    private static String baseUrl = "/rest/sys/bas/AngUniMeaTmpErp";


    @Override public String getModelClassName () { return "AngUniMeaTmpErpImpl"; }




    
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
        str.append ("UniMeaTmpUid[").append (getUniMeaTmpUid ()).append ("] ");
        str.append ("UniMeaTmpErpCod[").append (getUniMeaTmpErpCod ()).append ("] ");
        str.append ("UniMeaTmpErpDsc[").append (getUniMeaTmpErpDsc ()).append ("] ");
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
        if (getUniMeaTmp () != null) { str.append ("\n").append (indent).append ("UniMeaTmp: \n").append (getUniMeaTmp ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngUniMeaTmpErpImpl newEmptyInstance () { return (AngUniMeaTmpErpImpl) newInstance (); }
    
    @Override public AngUniMeaTmpErpImpl getCopy () {
        return (AngUniMeaTmpErpImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngUniMeaTmpErp _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngUniMeaTmpErpImpl.baseUrl (); }
    public static String baseUrl () { return AngUniMeaTmpErpImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngUniMeaTmpErpImpl.baseUrl = baseUrl; } 

    @Override public List<AngUniMeaTmpErpFields> getFields () { return Arrays.asList (AngUniMeaTmpErpFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngUniMeaTmpErpImpl
