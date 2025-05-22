package net.synergy2.db.sys.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysWksWdgViwFltPrmImpl extends SysWksWdgViwFltPrm {

    protected SysWksWdgViwFltPrmImpl () { super (); }

    public enum SysWksWdgViwFltPrmFields implements ISField {
        Uid, WdgViwFltUid, WksPrmUid, Tsi, Tsu, Rsi, Rsu;
    } // SysWksWdgViwFltPrmFields
    
    private static String baseUrl = "/rest/sys/wks/SysWksWdgViwFltPrm";


    @Override public String getModelClassName () { return "SysWksWdgViwFltPrmImpl"; }




    
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
        str.append ("WdgViwFltUid[").append (getWdgViwFltUid ()).append ("] ");
        str.append ("WksPrmUid[").append (getWksPrmUid ()).append ("] ");
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
        if (getWdgViwFlt () != null) { str.append ("\n").append (indent).append ("WdgViwFlt: \n").append (getWdgViwFlt ().debug (full, true, indent + "    ")); }
        if (getViwFltPrm () != null) { str.append ("\n").append (indent).append ("ViwFltPrm: \n").append (getViwFltPrm ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysWksWdgViwFltPrmImpl newEmptyInstance () { return (SysWksWdgViwFltPrmImpl) newInstance (); }
    
    @Override public SysWksWdgViwFltPrmImpl getCopy () {
        return (SysWksWdgViwFltPrmImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysWksWdgViwFltPrm _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysWksWdgViwFltPrmImpl.baseUrl (); }
    public static String baseUrl () { return SysWksWdgViwFltPrmImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysWksWdgViwFltPrmImpl.baseUrl = baseUrl; } 

    @Override public List<SysWksWdgViwFltPrmFields> getFields () { return Arrays.asList (SysWksWdgViwFltPrmFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysWksWdgViwFltPrmImpl
