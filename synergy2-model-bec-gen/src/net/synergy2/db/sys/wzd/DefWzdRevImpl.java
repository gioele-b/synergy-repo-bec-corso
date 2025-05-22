package net.synergy2.db.sys.wzd;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DefWzdRevImpl extends DefWzdRev {

    protected DefWzdRevImpl () { super (); }

    public enum DefWzdRevFields implements ISField {
        Uid, WzdUid, WzdRev, WzdRevVer, WzdExeCls, WzdMdlCls, RevRefUid, PrsUid, FlgEnb, Tsi, Tsu, Rsi, Rsu;
    } // DefWzdRevFields
    
    private static String baseUrl = "/rest/sys/wzd/DefWzdRev";


    @Override public String getModelClassName () { return "DefWzdRevImpl"; }




    
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
        str.append ("WzdUid[").append (getWzdUid ()).append ("] ");
        str.append ("WzdRev[").append (getWzdRev ()).append ("] ");
        str.append ("WzdRevVer[").append (getWzdRevVer ()).append ("] ");
        if (full) { str.append ("WzdExeCls[").append (getWzdExeCls ()).append ("] "); }
        if (full) { str.append ("WzdMdlCls[").append (getWzdMdlCls ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRevRefUid ())) { str.append ("RevRefUid[").append (getRevRefUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrsUid ())) { str.append ("PrsUid[").append (getPrsUid ()).append ("] "); } }
        if (full) { str.append ("FlgEnb[").append (getFlgEnb ()).append ("] "); }
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
        if (getTrgLst () != null) { str.append ("\n").append (indent).append ("TrgLst (").append (getTrgLst ().size ()).append ("):"); for (var model : getTrgLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getPrmLst () != null) { str.append ("\n").append (indent).append ("PrmLst (").append (getPrmLst ().size ()).append ("):"); for (var model : getPrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getStpLst () != null) { str.append ("\n").append (indent).append ("StpLst (").append (getStpLst ().size ()).append ("):"); for (var model : getStpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWzd () != null) { str.append ("\n").append (indent).append ("Wzd: \n").append (getWzd ().debug (full, true, indent + "    ")); }
        if (getSrc () != null) { str.append ("\n").append (indent).append ("Src: \n").append (getSrc ().debug (full, true, indent + "    ")); }
        if (getPrs () != null) { str.append ("\n").append (indent).append ("Prs: \n").append (getPrs ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DefWzdRevImpl newEmptyInstance () { return (DefWzdRevImpl) newInstance (); }
    
    @Override public DefWzdRevImpl getCopy () {
        return (DefWzdRevImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (DefWzdRev _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DefWzdRevImpl.baseUrl (); }
    public static String baseUrl () { return DefWzdRevImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DefWzdRevImpl.baseUrl = baseUrl; } 

    @Override public List<DefWzdRevFields> getFields () { return Arrays.asList (DefWzdRevFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DefWzdRevImpl
