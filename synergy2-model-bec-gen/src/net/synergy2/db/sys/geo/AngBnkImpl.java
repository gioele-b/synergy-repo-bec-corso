package net.synergy2.db.sys.geo;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngBnkImpl extends AngBnk {

    protected AngBnkImpl () { super (); }

    public enum AngBnkFields implements ISField {
        Uid, BnkNam, AgcDsc, AbiCod, CabCod, ErpCod, Str, StrNum, Cty, ZipCod, StaUid, PrvUid, SwfCod, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // AngBnkFields
    
    private static String baseUrl = "/rest/sys/geo/AngBnk";


    @Override public String getModelClassName () { return "AngBnkImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngBnkImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        if (full) { str.append ("BnkNam[").append (getBnkNam ()).append ("] "); }
        if (Objects.nonNull (getAgcDsc ())) { str.append ("AgcDsc[").append (getAgcDsc ()).append ("] "); }
        if (full) { if (Objects.nonNull (getAbiCod ())) { str.append ("AbiCod[").append (getAbiCod ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCabCod ())) { str.append ("CabCod[").append (getCabCod ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getErpCod ())) { str.append ("ErpCod[").append (getErpCod ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr ())) { str.append ("Str[").append (getStr ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStrNum ())) { str.append ("StrNum[").append (getStrNum ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCty ())) { str.append ("Cty[").append (getCty ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getZipCod ())) { str.append ("ZipCod[").append (getZipCod ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStaUid ())) { str.append ("StaUid[").append (getStaUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrvUid ())) { str.append ("PrvUid[").append (getPrvUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getSwfCod ())) { str.append ("SwfCod[").append (getSwfCod ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
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
        if (getCmpBnkLst () != null) { str.append ("\n").append (indent).append ("CmpBnkLst (").append (getCmpBnkLst ().size ()).append ("):"); for (var model : getCmpBnkLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSta () != null) { str.append ("\n").append (indent).append ("Sta: \n").append (getSta ().debug (full, true, indent + "    ")); }
        if (getPrv () != null) { str.append ("\n").append (indent).append ("Prv: \n").append (getPrv ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngBnkImpl newEmptyInstance () { return (AngBnkImpl) newInstance (); }
    
    @Override public AngBnkImpl getCopy () {
        var toReturn = (AngBnkImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngBnk _other, boolean checkUid, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngBnkImpl.baseUrl (); }
    public static String baseUrl () { return AngBnkImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngBnkImpl.baseUrl = baseUrl; } 

    @Override public List<AngBnkFields> getFields () { return Arrays.asList (AngBnkFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngBnkImpl
