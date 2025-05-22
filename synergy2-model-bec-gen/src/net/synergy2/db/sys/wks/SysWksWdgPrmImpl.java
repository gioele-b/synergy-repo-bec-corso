package net.synergy2.db.sys.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysWksWdgPrmImpl extends SysWksWdgPrm {

    protected SysWksWdgPrmImpl () { super (); }

    public enum SysWksWdgPrmFields implements ISField {
        Uid, WksWdgUid, WksPrmUid, PrmTblAls, PrmColUid, PrmFldUid, PrmClcUid, Tsi, Tsu, Rsi, Rsu, PrmNam, PrmTyp, PrmSubTyp;
    } // SysWksWdgPrmFields
    
    private static String baseUrl = "/rest/sys/wks/SysWksWdgPrm";


    @Override public String getModelClassName () { return "SysWksWdgPrmImpl"; }




    
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
        str.append ("WksWdgUid[").append (getWksWdgUid ()).append ("] ");
        str.append ("WksPrmUid[").append (getWksPrmUid ()).append ("] ");
        if (full) { if (Objects.nonNull (getPrmTblAls ())) { str.append ("PrmTblAls[").append (getPrmTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrmColUid ())) { str.append ("PrmColUid[").append (getPrmColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrmFldUid ())) { str.append ("PrmFldUid[").append (getPrmFldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrmClcUid ())) { str.append ("PrmClcUid[").append (getPrmClcUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrmNam ())) { str.append ("PrmNam[").append (getPrmNam ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrmTyp ())) { str.append ("PrmTyp[").append (getPrmTyp ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrmSubTyp ())) { str.append ("PrmSubTyp[").append (getPrmSubTyp ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getWksWdg () != null) { str.append ("\n").append (indent).append ("WksWdg: \n").append (getWksWdg ().debug (full, true, indent + "    ")); }
        if (getWksPrm () != null) { str.append ("\n").append (indent).append ("WksPrm: \n").append (getWksPrm ().debug (full, true, indent + "    ")); }
        if (getPrmCol () != null) { str.append ("\n").append (indent).append ("PrmCol: \n").append (getPrmCol ().debug (full, true, indent + "    ")); }
        if (getPrmClc () != null) { str.append ("\n").append (indent).append ("PrmClc: \n").append (getPrmClc ().debug (full, true, indent + "    ")); }
        if (getPrmFld () != null) { str.append ("\n").append (indent).append ("PrmFld: \n").append (getPrmFld ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysWksWdgPrmImpl newEmptyInstance () { return (SysWksWdgPrmImpl) newInstance (); }
    
    @Override public SysWksWdgPrmImpl getCopy () {
        return (SysWksWdgPrmImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysWksWdgPrm _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysWksWdgPrmImpl.baseUrl (); }
    public static String baseUrl () { return SysWksWdgPrmImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysWksWdgPrmImpl.baseUrl = baseUrl; } 

    @Override public List<SysWksWdgPrmFields> getFields () { return Arrays.asList (SysWksWdgPrmFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysWksWdgPrmImpl
