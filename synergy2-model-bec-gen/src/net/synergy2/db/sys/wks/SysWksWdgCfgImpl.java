package net.synergy2.db.sys.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysWksWdgCfgImpl extends SysWksWdgCfg {

    protected SysWksWdgCfgImpl () { super (); }

    public enum SysWksWdgCfgFields implements ISField {
        Uid, WdgUid, ResUid, WdgCfgUid, FlgVal, StrVal, IntVal, DecVal, TssVal, Tsi, Tsu, Rsi, Rsu;
    } // SysWksWdgCfgFields
    
    private static String baseUrl = "/rest/sys/wks/SysWksWdgCfg";


    @Override public String getModelClassName () { return "SysWksWdgCfgImpl"; }




    
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
        str.append ("WdgUid[").append (getWdgUid ()).append ("] ");
        if (Objects.nonNull (getResUid ())) { str.append ("ResUid[").append (getResUid ()).append ("] "); }
        str.append ("WdgCfgUid[").append (getWdgCfgUid ()).append ("] ");
        if (full) { if (Objects.nonNull (getFlgVal ())) { str.append ("FlgVal[").append (getFlgVal ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStrVal ())) { str.append ("StrVal[").append (getStrVal ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getIntVal ())) { str.append ("IntVal[").append (getIntVal ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDecVal ())) { str.append ("DecVal[").append (getDecVal ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTssVal ())) { str.append ("TssVal[").append (getTssVal ()).append ("] "); } }
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
        if (getWdg () != null) { str.append ("\n").append (indent).append ("Wdg: \n").append (getWdg ().debug (full, true, indent + "    ")); }
        if (getAngWdgCfg () != null) { str.append ("\n").append (indent).append ("AngWdgCfg: \n").append (getAngWdgCfg ().debug (full, true, indent + "    ")); }
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysWksWdgCfgImpl newEmptyInstance () { return (SysWksWdgCfgImpl) newInstance (); }
    
    @Override public SysWksWdgCfgImpl getCopy () {
        return (SysWksWdgCfgImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysWksWdgCfg _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysWksWdgCfgImpl.baseUrl (); }
    public static String baseUrl () { return SysWksWdgCfgImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysWksWdgCfgImpl.baseUrl = baseUrl; } 

    @Override public List<SysWksWdgCfgFields> getFields () { return Arrays.asList (SysWksWdgCfgFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysWksWdgCfgImpl
