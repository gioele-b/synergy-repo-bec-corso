package net.synergy2.db.sys.rep;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class RepMdlLngImpl extends RepMdlLng {

    protected RepMdlLngImpl () { super (); }

    public enum RepMdlLngFields implements ISField {
        RecUid, LngUid, MdlDsc, Tsi, Tsu, Rsi, Rsu;
    } // RepMdlLngFields
    
    private static String baseUrl = "/rest/sys/rep/RepMdlLng";


    @Override public String getModelClassName () { return "RepMdlLngImpl"; }




    
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
        str.append ("RecUid[").append (getRecUid ()).append ("] ");
        str.append ("LngUid[").append (getLngUid ()).append ("] ");
        if (Objects.nonNull (getMdlDsc ())) { str.append ("MdlDsc[").append (getMdlDsc ()).append ("] "); }
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
        if (getRec () != null) { str.append ("\n").append (indent).append ("Rec: \n").append (getRec ().debug (full, true, indent + "    ")); }
        if (getLng () != null) { str.append ("\n").append (indent).append ("Lng: \n").append (getLng ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getRecUid () + "#" + getLngUid (); }

    @Override public RepMdlLngImpl newEmptyInstance () { return (RepMdlLngImpl) newInstance (); }
    
    @Override public RepMdlLngImpl getCopy () {
        return (RepMdlLngImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (RepMdlLng _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return RepMdlLngImpl.baseUrl (); }
    public static String baseUrl () { return RepMdlLngImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { RepMdlLngImpl.baseUrl = baseUrl; } 

    @Override public List<RepMdlLngFields> getFields () { return Arrays.asList (RepMdlLngFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // RepMdlLngImpl
