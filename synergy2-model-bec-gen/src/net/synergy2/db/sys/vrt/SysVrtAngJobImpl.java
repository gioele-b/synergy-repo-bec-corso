package net.synergy2.db.sys.vrt;

import java.util.Arrays;
import java.util.List;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysVrtAngJobImpl extends SysVrtAngJob {

    protected SysVrtAngJobImpl () { super (); }

    public enum SysVrtAngJobFields implements ISField {
        Uid, JobCod, JobDsc;
    } // SysVrtAngJobFields
    
    private static String baseUrl = "/rest/sys/vrt/SysVrtAngJob";


    @Override public String getModelClassName () { return "SysVrtAngJobImpl"; }




    
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
        str.append ("JobCod[").append (getJobCod ()).append ("] ");
        str.append ("JobDsc[").append (getJobDsc ()).append ("] ");
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();

        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid ().replace ("*", "**").replace ("#", "*#"); }

    @Override public SysVrtAngJobImpl newEmptyInstance () { return (SysVrtAngJobImpl) newInstance (); }
    
    @Override public SysVrtAngJobImpl getCopy () {
        return (SysVrtAngJobImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysVrtAngJob _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysVrtAngJobImpl.baseUrl (); }
    public static String baseUrl () { return SysVrtAngJobImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysVrtAngJobImpl.baseUrl = baseUrl; } 

    @Override public List<SysVrtAngJobFields> getFields () { return Arrays.asList (SysVrtAngJobFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysVrtAngJobImpl
