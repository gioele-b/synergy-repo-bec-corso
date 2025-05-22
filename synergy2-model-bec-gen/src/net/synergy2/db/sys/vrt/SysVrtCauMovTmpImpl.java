package net.synergy2.db.sys.vrt;

import java.util.Arrays;
import java.util.List;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysVrtCauMovTmpImpl extends SysVrtCauMovTmp {

    protected SysVrtCauMovTmpImpl () { super (); }

    public enum SysVrtCauMovTmpFields implements ISField {
        Uid, CauCod, CauDsc;
    } // SysVrtCauMovTmpFields
    
    private static String baseUrl = "/rest/sys/vrt/SysVrtCauMovTmp";


    @Override public String getModelClassName () { return "SysVrtCauMovTmpImpl"; }




    
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
        str.append ("CauCod[").append (getCauCod ()).append ("] ");
        str.append ("CauDsc[").append (getCauDsc ()).append ("] ");
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();

        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid ().replace ("*", "**").replace ("#", "*#"); }

    @Override public SysVrtCauMovTmpImpl newEmptyInstance () { return (SysVrtCauMovTmpImpl) newInstance (); }
    
    @Override public SysVrtCauMovTmpImpl getCopy () {
        return (SysVrtCauMovTmpImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysVrtCauMovTmp _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysVrtCauMovTmpImpl.baseUrl (); }
    public static String baseUrl () { return SysVrtCauMovTmpImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysVrtCauMovTmpImpl.baseUrl = baseUrl; } 

    @Override public List<SysVrtCauMovTmpFields> getFields () { return Arrays.asList (SysVrtCauMovTmpFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysVrtCauMovTmpImpl
