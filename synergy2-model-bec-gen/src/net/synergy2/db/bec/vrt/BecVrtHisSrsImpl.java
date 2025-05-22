package net.synergy2.db.bec.vrt;

import java.util.Arrays;
import java.util.List;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class BecVrtHisSrsImpl extends BecVrtHisSrs {

    protected BecVrtHisSrsImpl () { super (); }

    public enum BecVrtHisSrsFields implements ISField {
        Uid, ItmCod, ItmDsc, CusCod, CusDsc, Month, Qta;
    } // BecVrtHisSrsFields
    
    private static String baseUrl = "/rest/bec/vrt/BecVrtHisSrs";


    @Override public String getModelClassName () { return "BecVrtHisSrsImpl"; }




    
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
        str.append ("ItmCod[").append (getItmCod ()).append ("] ");
        str.append ("ItmDsc[").append (getItmDsc ()).append ("] ");
        str.append ("CusCod[").append (getCusCod ()).append ("] ");
        str.append ("CusDsc[").append (getCusDsc ()).append ("] ");
        if (full) { str.append ("Month[").append (getMonth ()).append ("] "); }
        if (full) { str.append ("Qta[").append (getQta ()).append ("] "); }
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();

        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public BecVrtHisSrsImpl newEmptyInstance () { return (BecVrtHisSrsImpl) newInstance (); }
    
    @Override public BecVrtHisSrsImpl getCopy () {
        return (BecVrtHisSrsImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (BecVrtHisSrs _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return BecVrtHisSrsImpl.baseUrl (); }
    public static String baseUrl () { return BecVrtHisSrsImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { BecVrtHisSrsImpl.baseUrl = baseUrl; } 

    @Override public List<BecVrtHisSrsFields> getFields () { return Arrays.asList (BecVrtHisSrsFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // BecVrtHisSrsImpl
