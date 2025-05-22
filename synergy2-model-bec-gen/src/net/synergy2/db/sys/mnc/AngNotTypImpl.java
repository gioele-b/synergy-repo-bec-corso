package net.synergy2.db.sys.mnc;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngNotTypImpl extends AngNotTyp {

    protected AngNotTypImpl () { super (); }

    public enum AngNotTypFields implements ISField {
        Uid, CatUid, TypCod, NotTypMsg, NotTypLnk, NotTypSev, FlgEnb, SndMai, SndBot, SndApp, SndWeb, FmtHtm, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, NotTypTit, TypDsc, SndPsh;
    } // AngNotTypFields
    
    private static String baseUrl = "/rest/sys/mnc/AngNotTyp";


    @Override public String getModelClassName () { return "AngNotTypImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngNotTypImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("CatUid[").append (getCatUid ()).append ("] ");
        str.append ("TypCod[").append (getTypCod ()).append ("] ");
        if (full) { if (Objects.nonNull (getNotTypMsg ())) { str.append ("NotTypMsg[").append (getNotTypMsg ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getNotTypLnk ())) { str.append ("NotTypLnk[").append (getNotTypLnk ()).append ("] "); } }
        if (full) { str.append ("NotTypSev[").append (getNotTypSev ()).append ("] "); }
        if (full) { str.append ("FlgEnb[").append (getFlgEnb ()).append ("] "); }
        if (full) { str.append ("SndMai[").append (getSndMai ()).append ("] "); }
        if (full) { str.append ("SndBot[").append (getSndBot ()).append ("] "); }
        if (full) { str.append ("SndApp[").append (getSndApp ()).append ("] "); }
        if (full) { str.append ("SndWeb[").append (getSndWeb ()).append ("] "); }
        if (full) { str.append ("FmtHtm[").append (getFmtHtm ()).append ("] "); }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        str.append ("NotTypTit[").append (getNotTypTit ()).append ("] ");
        if (Objects.nonNull (getTypDsc ())) { str.append ("TypDsc[").append (getTypDsc ()).append ("] "); }
        if (full) { str.append ("SndPsh[").append (getSndPsh ()).append ("] "); }
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
        if (getNotMncLst () != null) { str.append ("\n").append (indent).append ("NotMncLst (").append (getNotMncLst ().size ()).append ("):"); for (var model : getNotMncLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getNotTypLst () != null) { str.append ("\n").append (indent).append ("NotTypLst (").append (getNotTypLst ().size ()).append ("):"); for (var model : getNotTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCat () != null) { str.append ("\n").append (indent).append ("Cat: \n").append (getCat ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngNotTypImpl newEmptyInstance () { return (AngNotTypImpl) newInstance (); }
    
    @Override public AngNotTypImpl getCopy () {
        var toReturn = (AngNotTypImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngNotTyp _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngNotTypImpl.baseUrl (); }
    public static String baseUrl () { return AngNotTypImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngNotTypImpl.baseUrl = baseUrl; } 

    @Override public List<AngNotTypFields> getFields () { return Arrays.asList (AngNotTypFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngNotTypImpl
