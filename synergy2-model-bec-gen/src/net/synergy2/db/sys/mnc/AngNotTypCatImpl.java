package net.synergy2.db.sys.mnc;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngNotTypCatImpl extends AngNotTypCat {

    protected AngNotTypCatImpl () { super (); }

    public enum AngNotTypCatFields implements ISField {
        Uid, AppUid, CatCod, CatDsc, FlgEnb, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, PlcLgd, CatIns;
    } // AngNotTypCatFields
    
    private static String baseUrl = "/rest/sys/mnc/AngNotTypCat";


    @Override public String getModelClassName () { return "AngNotTypCatImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngNotTypCatImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("AppUid[").append (getAppUid ()).append ("] ");
        str.append ("CatCod[").append (getCatCod ()).append ("] ");
        str.append ("CatDsc[").append (getCatDsc ()).append ("] ");
        if (full) { str.append ("FlgEnb[").append (getFlgEnb ()).append ("] "); }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (Objects.nonNull (getPlcLgd ())) { str.append ("PlcLgd[").append (getPlcLgd ()).append ("] "); }
        if (full) { str.append ("CatIns[").append (getCatIns ()).append ("] "); }
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
        if (getNotTypLst () != null) { str.append ("\n").append (indent).append ("NotTypLst (").append (getNotTypLst ().size ()).append ("):"); for (var model : getNotTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getApp () != null) { str.append ("\n").append (indent).append ("App: \n").append (getApp ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngNotTypCatImpl newEmptyInstance () { return (AngNotTypCatImpl) newInstance (); }
    
    @Override public AngNotTypCatImpl getCopy () {
        var toReturn = (AngNotTypCatImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngNotTypCat _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngNotTypCatImpl.baseUrl (); }
    public static String baseUrl () { return AngNotTypCatImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngNotTypCatImpl.baseUrl = baseUrl; } 

    @Override public List<AngNotTypCatFields> getFields () { return Arrays.asList (AngNotTypCatFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngNotTypCatImpl
