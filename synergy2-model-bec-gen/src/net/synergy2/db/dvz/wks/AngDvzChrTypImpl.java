package net.synergy2.db.dvz.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngDvzChrTypImpl extends AngDvzChrTyp {

    protected AngDvzChrTypImpl () { super (); }

    public enum AngDvzChrTypFields implements ISField {
        Uid, TypCod, TypDsc, MacTypUid, MinAxx, MaxAxx, MinAxy, MaxAxy, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, TypSrt;
    } // AngDvzChrTypFields
    
    private static String baseUrl = "/rest/dvz/wks/AngDvzChrTyp";


    @Override public String getModelClassName () { return "AngDvzChrTypImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngDvzChrTypImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        if (full) { str.append ("MacTypUid[").append (getMacTypUid ()).append ("] "); }
        if (full) { str.append ("MinAxx[").append (getMinAxx ()).append ("] "); }
        if (full) { str.append ("MaxAxx[").append (getMaxAxx ()).append ("] "); }
        if (full) { str.append ("MinAxy[").append (getMinAxy ()).append ("] "); }
        if (full) { str.append ("MaxAxy[").append (getMaxAxy ()).append ("] "); }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { str.append ("TypSrt[").append (getTypSrt ()).append ("] "); }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getChrLst () != null) { str.append ("\n").append (indent).append ("ChrLst (").append (getChrLst ().size ()).append ("):"); for (var model : getChrLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getMacTyp () != null) { str.append ("\n").append (indent).append ("MacTyp: \n").append (getMacTyp ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngDvzChrTypImpl newEmptyInstance () { return (AngDvzChrTypImpl) newInstance (); }
    
    @Override public AngDvzChrTypImpl getCopy () {
        var toReturn = (AngDvzChrTypImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngDvzChrTyp _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngDvzChrTypImpl.baseUrl (); }
    public static String baseUrl () { return AngDvzChrTypImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngDvzChrTypImpl.baseUrl = baseUrl; } 

    @Override public List<AngDvzChrTypFields> getFields () { return Arrays.asList (AngDvzChrTypFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngDvzChrTypImpl
