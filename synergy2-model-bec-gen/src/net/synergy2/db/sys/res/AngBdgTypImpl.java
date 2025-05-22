package net.synergy2.db.sys.res;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class AngBdgTypImpl extends AngBdgTyp {

    protected AngBdgTypImpl () { super (); }

    public enum AngBdgTypFields implements ISField {
        Uid, TypCod, EtyUid, TypDsc, TypIco, LogDel, ResMacTypUid, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // AngBdgTypFields
    
    private static String baseUrl = "/rest/sys/res/AngBdgTyp";


    @Override public String getModelClassName () { return "AngBdgTypImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngBdgTypImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
    @Override public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        switch (fieldName) {
            case SAlias.ENTITY -> setEntity ((AngEty) value); 

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
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
        str.append ("TypDsc[").append (getTypDsc ()).append ("] ");
        if (full) { str.append ("TypIco[").append (getTypIco ()).append ("] "); }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { str.append ("ResMacTypUid[").append (getResMacTypUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
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
        if (getBdgLst () != null) { str.append ("\n").append (indent).append ("BdgLst (").append (getBdgLst ().size ()).append ("):"); for (var model : getBdgLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getMacTyp () != null) { str.append ("\n").append (indent).append ("MacTyp: \n").append (getMacTyp ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngBdgTypImpl newEmptyInstance () { return (AngBdgTypImpl) newInstance (); }
    
    @Override public AngBdgTypImpl getCopy () {
        var toReturn = (AngBdgTypImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngBdgTyp _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngBdgTypImpl.baseUrl (); }
    public static String baseUrl () { return AngBdgTypImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngBdgTypImpl.baseUrl = baseUrl; } 

    @Override public List<AngBdgTypFields> getFields () { return Arrays.asList (AngBdgTypFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngBdgTypImpl
