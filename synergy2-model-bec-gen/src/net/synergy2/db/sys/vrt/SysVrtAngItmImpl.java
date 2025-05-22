package net.synergy2.db.sys.vrt;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysVrtAngItmImpl extends SysVrtAngItm {

    protected SysVrtAngItmImpl () { super (); }

    public enum SysVrtAngItmFields implements ISField {
        Uid, ItmCod, ItmDsc, UniMeaBasCod;
    } // SysVrtAngItmFields
    
    private static String baseUrl = "/rest/sys/vrt/SysVrtAngItm";


    @Override public String getModelClassName () { return "SysVrtAngItmImpl"; }




    
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
        if (full) { if (Objects.nonNull (getUniMeaBasCod ())) { str.append ("UniMeaBasCod[").append (getUniMeaBasCod ()).append ("] "); } }
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();

        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid ().replace ("*", "**").replace ("#", "*#"); }

    @Override public SysVrtAngItmImpl newEmptyInstance () { return (SysVrtAngItmImpl) newInstance (); }
    
    @Override public SysVrtAngItmImpl getCopy () {
        return (SysVrtAngItmImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysVrtAngItm _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysVrtAngItmImpl.baseUrl (); }
    public static String baseUrl () { return SysVrtAngItmImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysVrtAngItmImpl.baseUrl = baseUrl; } 

    @Override public List<SysVrtAngItmFields> getFields () { return Arrays.asList (SysVrtAngItmFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysVrtAngItmImpl
