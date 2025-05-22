package net.synergy2.db.sys.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysWksTypImpl extends SysWksTyp {

    protected SysWksTypImpl () { super (); }

    public enum SysWksTypFields implements ISField {
        Uid, TypCod, TypDsc, LogDel, Hid, Url, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, CtxReq;
    } // SysWksTypFields
    
    private static String baseUrl = "/rest/sys/wks/SysWksTyp";


    @Override public String getModelClassName () { return "SysWksTypImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public SysWksTypImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("TypCod[").append (getTypCod ()).append ("] ");
        str.append ("TypDsc[").append (getTypDsc ()).append ("] ");
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { str.append ("Hid[").append (getHid ()).append ("] "); }
        if (full) { str.append ("Url[").append (getUrl ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { str.append ("CtxReq[").append (getCtxReq ()).append ("] "); }
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
        if (getWksLst () != null) { str.append ("\n").append (indent).append ("WksLst (").append (getWksLst ().size ()).append ("):"); for (var model : getWksLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getActLst () != null) { str.append ("\n").append (indent).append ("ActLst (").append (getActLst ().size ()).append ("):"); for (var model : getActLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWdgTypLst () != null) { str.append ("\n").append (indent).append ("WdgTypLst (").append (getWdgTypLst ().size ()).append ("):"); for (var model : getWdgTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAppLst () != null) { str.append ("\n").append (indent).append ("AppLst (").append (getAppLst ().size ()).append ("):"); for (var model : getAppLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSldLst () != null) { str.append ("\n").append (indent).append ("SldLst (").append (getSldLst ().size ()).append ("):"); for (var model : getSldLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysWksTypImpl newEmptyInstance () { return (SysWksTypImpl) newInstance (); }
    
    @Override public SysWksTypImpl getCopy () {
        var toReturn = (SysWksTypImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (SysWksTyp _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return SysWksTypImpl.baseUrl (); }
    public static String baseUrl () { return SysWksTypImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysWksTypImpl.baseUrl = baseUrl; } 

    @Override public List<SysWksTypFields> getFields () { return Arrays.asList (SysWksTypFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysWksTypImpl
