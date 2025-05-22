package net.synergy2.db.sys.vrt;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysVrtAngPrdCycImpl extends SysVrtAngPrdCyc {

    protected SysVrtAngPrdCycImpl () { super (); }

    public enum SysVrtAngPrdCycFields implements ISField {
        Uid, PrdCycCod, ItmCod, PrdCycDsc, PrdCycTypUid, PrdCycStd, ValStrDat, ValEndDat;
    } // SysVrtAngPrdCycFields
    
    private static String baseUrl = "/rest/sys/vrt/SysVrtAngPrdCyc";


    @Override public String getModelClassName () { return "SysVrtAngPrdCycImpl"; }




    
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
        str.append ("PrdCycCod[").append (getPrdCycCod ()).append ("] ");
        str.append ("ItmCod[").append (getItmCod ()).append ("] ");
        str.append ("PrdCycDsc[").append (getPrdCycDsc ()).append ("] ");
        if (full) { str.append ("PrdCycTypUid[").append (getPrdCycTypUid ()).append ("] "); }
        if (full) { str.append ("PrdCycStd[").append (getPrdCycStd ()).append ("] "); }
        if (full) { if (Objects.nonNull (getValStrDat ())) { str.append ("ValStrDat[").append (getValStrDat ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValEndDat ())) { str.append ("ValEndDat[").append (getValEndDat ()).append ("] "); } }
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();

        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid ().replace ("*", "**").replace ("#", "*#"); }

    @Override public SysVrtAngPrdCycImpl newEmptyInstance () { return (SysVrtAngPrdCycImpl) newInstance (); }
    
    @Override public SysVrtAngPrdCycImpl getCopy () {
        return (SysVrtAngPrdCycImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysVrtAngPrdCyc _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysVrtAngPrdCycImpl.baseUrl (); }
    public static String baseUrl () { return SysVrtAngPrdCycImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysVrtAngPrdCycImpl.baseUrl = baseUrl; } 

    @Override public List<SysVrtAngPrdCycFields> getFields () { return Arrays.asList (SysVrtAngPrdCycFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysVrtAngPrdCycImpl
