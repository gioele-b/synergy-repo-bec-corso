package net.synergy2.db.dvz.rep;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzRepGntLayImpl extends DvzRepGntLay {

    protected DvzRepGntLayImpl () { super (); }

    public enum DvzRepGntLayFields implements ISField {
        Uid, GntUid, GntLayCod, GntLayDsc, GntLayTypUid, TssTblAls, TssColUid, GntLayClr, GntLayIco, DayTblAls, DayColUid, Tsi, Tsu, Rsi, Rsu;
    } // DvzRepGntLayFields
    
    private static String baseUrl = "/rest/dvz/rep/DvzRepGntLay";


    @Override public String getModelClassName () { return "DvzRepGntLayImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public DvzRepGntLayImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("GntUid[").append (getGntUid ()).append ("] ");
        str.append ("GntLayCod[").append (getGntLayCod ()).append ("] ");
        str.append ("GntLayDsc[").append (getGntLayDsc ()).append ("] ");
        if (full) { str.append ("GntLayTypUid[").append (getGntLayTypUid ()).append ("] "); }
        if (full) { str.append ("TssTblAls[").append (getTssTblAls ()).append ("] "); }
        if (full) { str.append ("TssColUid[").append (getTssColUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getGntLayClr ())) { str.append ("GntLayClr[").append (getGntLayClr ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getGntLayIco ())) { str.append ("GntLayIco[").append (getGntLayIco ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDayTblAls ())) { str.append ("DayTblAls[").append (getDayTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDayColUid ())) { str.append ("DayColUid[").append (getDayColUid ()).append ("] "); } }
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
        if (getGnt () != null) { str.append ("\n").append (indent).append ("Gnt: \n").append (getGnt ().debug (full, true, indent + "    ")); }
        if (getGntLayTyp () != null) { str.append ("\n").append (indent).append ("GntLayTyp: \n").append (getGntLayTyp ().debug (full, true, indent + "    ")); }
        if (getTssCol () != null) { str.append ("\n").append (indent).append ("TssCol: \n").append (getTssCol ().debug (full, true, indent + "    ")); }
        if (getDayCol () != null) { str.append ("\n").append (indent).append ("DayCol: \n").append (getDayCol ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzRepGntLayImpl newEmptyInstance () { return (DvzRepGntLayImpl) newInstance (); }
    
    @Override public DvzRepGntLayImpl getCopy () {
        var toReturn = (DvzRepGntLayImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (DvzRepGntLay _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DvzRepGntLayImpl.baseUrl (); }
    public static String baseUrl () { return DvzRepGntLayImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzRepGntLayImpl.baseUrl = baseUrl; } 

    @Override public List<DvzRepGntLayFields> getFields () { return Arrays.asList (DvzRepGntLayFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzRepGntLayImpl
