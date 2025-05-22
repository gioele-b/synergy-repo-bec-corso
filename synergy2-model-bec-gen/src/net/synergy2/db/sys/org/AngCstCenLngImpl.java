package net.synergy2.db.sys.org;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngCstCenLngImpl extends AngCstCenLng {

    protected AngCstCenLngImpl () { super (); }

    public enum AngCstCenLngFields implements ISField {
        RecUid, LngUid, CstCenDsc, CstCenNot, Tsi, Tsu, Rsi, Rsu;
    } // AngCstCenLngFields
    
    private static String baseUrl = "/rest/sys/org/AngCstCenLng";


    @Override public String getModelClassName () { return "AngCstCenLngImpl"; }




    
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
        if (Objects.nonNull (getCstCenDsc ())) { str.append ("CstCenDsc[").append (getCstCenDsc ()).append ("] "); }
        if (full) { if (Objects.nonNull (getCstCenNot ())) { str.append ("CstCenNot[").append (getCstCenNot ()).append ("] "); } }
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

    @Override public AngCstCenLngImpl newEmptyInstance () { return (AngCstCenLngImpl) newInstance (); }
    
    @Override public AngCstCenLngImpl getCopy () {
        return (AngCstCenLngImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngCstCenLng _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngCstCenLngImpl.baseUrl (); }
    public static String baseUrl () { return AngCstCenLngImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngCstCenLngImpl.baseUrl = baseUrl; } 

    @Override public List<AngCstCenLngFields> getFields () { return Arrays.asList (AngCstCenLngFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngCstCenLngImpl
