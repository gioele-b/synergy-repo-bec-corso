package net.synergy2.db.sys.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysWksSldTabImpl extends SysWksSldTab {

    protected SysWksSldTabImpl () { super (); }

    public enum SysWksSldTabFields implements ISField {
        Uid, SldUid, WksTabUid, RolSrt, Tsi, Tsu, Rsi, Rsu;
    } // SysWksSldTabFields
    
    private static String baseUrl = "/rest/sys/wks/SysWksSldTab";


    @Override public String getModelClassName () { return "SysWksSldTabImpl"; }




    
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
        if (full) { str.append ("SldUid[").append (getSldUid ()).append ("] "); }
        if (full) { str.append ("WksTabUid[").append (getWksTabUid ()).append ("] "); }
        if (full) { str.append ("RolSrt[").append (getRolSrt ()).append ("] "); }
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
        if (getSld () != null) { str.append ("\n").append (indent).append ("Sld: \n").append (getSld ().debug (full, true, indent + "    ")); }
        if (getWksTab () != null) { str.append ("\n").append (indent).append ("WksTab: \n").append (getWksTab ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysWksSldTabImpl newEmptyInstance () { return (SysWksSldTabImpl) newInstance (); }
    
    @Override public SysWksSldTabImpl getCopy () {
        return (SysWksSldTabImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysWksSldTab _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysWksSldTabImpl.baseUrl (); }
    public static String baseUrl () { return SysWksSldTabImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysWksSldTabImpl.baseUrl = baseUrl; } 

    @Override public List<SysWksSldTabFields> getFields () { return Arrays.asList (SysWksSldTabFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysWksSldTabImpl
