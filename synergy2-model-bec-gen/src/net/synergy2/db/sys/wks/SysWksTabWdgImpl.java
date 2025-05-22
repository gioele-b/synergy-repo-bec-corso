package net.synergy2.db.sys.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysWksTabWdgImpl extends SysWksTabWdg {

    protected SysWksTabWdgImpl () { super (); }

    public enum SysWksTabWdgFields implements ISField {
        Uid, WksTabUid, WksWdgUid, WdgPosHrz, WdgPosVrt, WdgSpnHrz, WdgSpnVrt, Tsi, Tsu, Rsi, Rsu;
    } // SysWksTabWdgFields
    
    private static String baseUrl = "/rest/sys/wks/SysWksTabWdg";


    @Override public String getModelClassName () { return "SysWksTabWdgImpl"; }




    
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
        str.append ("WksTabUid[").append (getWksTabUid ()).append ("] ");
        str.append ("WksWdgUid[").append (getWksWdgUid ()).append ("] ");
        if (full) { str.append ("WdgPosHrz[").append (getWdgPosHrz ()).append ("] "); }
        if (full) { str.append ("WdgPosVrt[").append (getWdgPosVrt ()).append ("] "); }
        if (full) { str.append ("WdgSpnHrz[").append (getWdgSpnHrz ()).append ("] "); }
        if (full) { str.append ("WdgSpnVrt[").append (getWdgSpnVrt ()).append ("] "); }
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
        if (getTab () != null) { str.append ("\n").append (indent).append ("Tab: \n").append (getTab ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysWksTabWdgImpl newEmptyInstance () { return (SysWksTabWdgImpl) newInstance (); }
    
    @Override public SysWksTabWdgImpl getCopy () {
        return (SysWksTabWdgImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysWksTabWdg _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysWksTabWdgImpl.baseUrl (); }
    public static String baseUrl () { return SysWksTabWdgImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysWksTabWdgImpl.baseUrl = baseUrl; } 

    @Override public List<SysWksTabWdgFields> getFields () { return Arrays.asList (SysWksTabWdgFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysWksTabWdgImpl
