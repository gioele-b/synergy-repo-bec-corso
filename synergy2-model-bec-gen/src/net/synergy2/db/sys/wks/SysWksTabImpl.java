package net.synergy2.db.sys.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysWksTabImpl extends SysWksTab {

    protected SysWksTabImpl () { super (); }

    public enum SysWksTabFields implements ISField {
        Uid, TabDsc, WksUid, TabSrt, ResUid, Tsi, Tsu, Rsi, Rsu;
    } // SysWksTabFields
    
    private static String baseUrl = "/rest/sys/wks/SysWksTab";


    @Override public String getModelClassName () { return "SysWksTabImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public SysWksTabImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("TabDsc[").append (getTabDsc ()).append ("] ");
        str.append ("WksUid[").append (getWksUid ()).append ("] ");
        str.append ("TabSrt[").append (getTabSrt ()).append ("] ");
        if (Objects.nonNull (getResUid ())) { str.append ("ResUid[").append (getResUid ()).append ("] "); }
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
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getTabWdgLst () != null) { str.append ("\n").append (indent).append ("TabWdgLst (").append (getTabWdgLst ().size ()).append ("):"); for (var model : getTabWdgLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSldLst () != null) { str.append ("\n").append (indent).append ("SldLst (").append (getSldLst ().size ()).append ("):"); for (var model : getSldLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWks () != null) { str.append ("\n").append (indent).append ("Wks: \n").append (getWks ().debug (full, true, indent + "    ")); }
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysWksTabImpl newEmptyInstance () { return (SysWksTabImpl) newInstance (); }
    
    @Override public SysWksTabImpl getCopy () {
        var toReturn = (SysWksTabImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (SysWksTab _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysWksTabImpl.baseUrl (); }
    public static String baseUrl () { return SysWksTabImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysWksTabImpl.baseUrl = baseUrl; } 

    @Override public List<SysWksTabFields> getFields () { return Arrays.asList (SysWksTabFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysWksTabImpl
