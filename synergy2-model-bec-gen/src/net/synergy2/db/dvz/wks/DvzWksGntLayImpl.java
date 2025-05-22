package net.synergy2.db.dvz.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzWksGntLayImpl extends DvzWksGntLay {

    protected DvzWksGntLayImpl () { super (); }

    public enum DvzWksGntLayFields implements ISField {
        Uid, DvzGntUid, GntLayCod, GntLayDsc, GntLayTypUid, TssTblAls, TssColUid, TssClcUid, GntLayClr, GntLayIco, DayTblAls, DayColUid, DayClcUid, Tsi, Tsu, Rsi, Rsu, TssFldUid, DayFldUid;
    } // DvzWksGntLayFields
    
    private static String baseUrl = "/rest/dvz/wks/DvzWksGntLay";


    @Override public String getModelClassName () { return "DvzWksGntLayImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public DvzWksGntLayImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("DvzGntUid[").append (getDvzGntUid ()).append ("] ");
        str.append ("GntLayCod[").append (getGntLayCod ()).append ("] ");
        str.append ("GntLayDsc[").append (getGntLayDsc ()).append ("] ");
        if (full) { str.append ("GntLayTypUid[").append (getGntLayTypUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTssTblAls ())) { str.append ("TssTblAls[").append (getTssTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTssColUid ())) { str.append ("TssColUid[").append (getTssColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTssClcUid ())) { str.append ("TssClcUid[").append (getTssClcUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getGntLayClr ())) { str.append ("GntLayClr[").append (getGntLayClr ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getGntLayIco ())) { str.append ("GntLayIco[").append (getGntLayIco ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDayTblAls ())) { str.append ("DayTblAls[").append (getDayTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDayColUid ())) { str.append ("DayColUid[").append (getDayColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDayClcUid ())) { str.append ("DayClcUid[").append (getDayClcUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTssFldUid ())) { str.append ("TssFldUid[").append (getTssFldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDayFldUid ())) { str.append ("DayFldUid[").append (getDayFldUid ()).append ("] "); } }
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
        if (getDvzGnt () != null) { str.append ("\n").append (indent).append ("DvzGnt: \n").append (getDvzGnt ().debug (full, true, indent + "    ")); }
        if (getGntLayTyp () != null) { str.append ("\n").append (indent).append ("GntLayTyp: \n").append (getGntLayTyp ().debug (full, true, indent + "    ")); }
        if (getTssCol () != null) { str.append ("\n").append (indent).append ("TssCol: \n").append (getTssCol ().debug (full, true, indent + "    ")); }
        if (getTssClc () != null) { str.append ("\n").append (indent).append ("TssClc: \n").append (getTssClc ().debug (full, true, indent + "    ")); }
        if (getDayCol () != null) { str.append ("\n").append (indent).append ("DayCol: \n").append (getDayCol ().debug (full, true, indent + "    ")); }
        if (getDayClc () != null) { str.append ("\n").append (indent).append ("DayClc: \n").append (getDayClc ().debug (full, true, indent + "    ")); }
        if (getTssFld () != null) { str.append ("\n").append (indent).append ("TssFld: \n").append (getTssFld ().debug (full, true, indent + "    ")); }
        if (getDayFld () != null) { str.append ("\n").append (indent).append ("DayFld: \n").append (getDayFld ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzWksGntLayImpl newEmptyInstance () { return (DvzWksGntLayImpl) newInstance (); }
    
    @Override public DvzWksGntLayImpl getCopy () {
        var toReturn = (DvzWksGntLayImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (DvzWksGntLay _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DvzWksGntLayImpl.baseUrl (); }
    public static String baseUrl () { return DvzWksGntLayImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzWksGntLayImpl.baseUrl = baseUrl; } 

    @Override public List<DvzWksGntLayFields> getFields () { return Arrays.asList (DvzWksGntLayFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzWksGntLayImpl
