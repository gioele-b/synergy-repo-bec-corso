package net.synergy2.db.sys.lst;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngLstValImpl extends AngLstVal {

    protected AngLstValImpl () { super (); }

    public enum AngLstValFields implements ISField {
        Uid, LstUid, ValSrt, ValCod, ValDsc, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, ValClr, ValIco, ValClrBck;
    } // AngLstValFields
    
    private static String baseUrl = "/rest/sys/lst/AngLstVal";


    @Override public String getModelClassName () { return "AngLstValImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngLstValImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("LstUid[").append (getLstUid ()).append ("] ");
        if (full) { str.append ("ValSrt[").append (getValSrt ()).append ("] "); }
        str.append ("ValCod[").append (getValCod ()).append ("] ");
        if (Objects.nonNull (getValDsc ())) { str.append ("ValDsc[").append (getValDsc ()).append ("] "); }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValClr ())) { str.append ("ValClr[").append (getValClr ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValIco ())) { str.append ("ValIco[").append (getValIco ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValClrBck ())) { str.append ("ValClrBck[").append (getValClrBck ()).append ("] "); } }
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
        if (getUpfIstLst_01 () != null) { str.append ("\n").append (indent).append ("UpfIstLst_01 (").append (getUpfIstLst_01 ().size ()).append ("):"); for (var model : getUpfIstLst_01 ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUpfIstLst_02 () != null) { str.append ("\n").append (indent).append ("UpfIstLst_02 (").append (getUpfIstLst_02 ().size ()).append ("):"); for (var model : getUpfIstLst_02 ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUpfIstLst_03 () != null) { str.append ("\n").append (indent).append ("UpfIstLst_03 (").append (getUpfIstLst_03 ().size ()).append ("):"); for (var model : getUpfIstLst_03 ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUpfIstLst_04 () != null) { str.append ("\n").append (indent).append ("UpfIstLst_04 (").append (getUpfIstLst_04 ().size ()).append ("):"); for (var model : getUpfIstLst_04 ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUpfIstLst_05 () != null) { str.append ("\n").append (indent).append ("UpfIstLst_05 (").append (getUpfIstLst_05 ().size ()).append ("):"); for (var model : getUpfIstLst_05 ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUpfIstLst_06 () != null) { str.append ("\n").append (indent).append ("UpfIstLst_06 (").append (getUpfIstLst_06 ().size ()).append ("):"); for (var model : getUpfIstLst_06 ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUpfIstLst_07 () != null) { str.append ("\n").append (indent).append ("UpfIstLst_07 (").append (getUpfIstLst_07 ().size ()).append ("):"); for (var model : getUpfIstLst_07 ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUpfIstLst_08 () != null) { str.append ("\n").append (indent).append ("UpfIstLst_08 (").append (getUpfIstLst_08 ().size ()).append ("):"); for (var model : getUpfIstLst_08 ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUpfIstLst_09 () != null) { str.append ("\n").append (indent).append ("UpfIstLst_09 (").append (getUpfIstLst_09 ().size ()).append ("):"); for (var model : getUpfIstLst_09 ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUpfIstLst_10 () != null) { str.append ("\n").append (indent).append ("UpfIstLst_10 (").append (getUpfIstLst_10 ().size ()).append ("):"); for (var model : getUpfIstLst_10 ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUpfIstLst_11 () != null) { str.append ("\n").append (indent).append ("UpfIstLst_11 (").append (getUpfIstLst_11 ().size ()).append ("):"); for (var model : getUpfIstLst_11 ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUpfIstLst_12 () != null) { str.append ("\n").append (indent).append ("UpfIstLst_12 (").append (getUpfIstLst_12 ().size ()).append ("):"); for (var model : getUpfIstLst_12 ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUpfIstLst_13 () != null) { str.append ("\n").append (indent).append ("UpfIstLst_13 (").append (getUpfIstLst_13 ().size ()).append ("):"); for (var model : getUpfIstLst_13 ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUpfIstLst_14 () != null) { str.append ("\n").append (indent).append ("UpfIstLst_14 (").append (getUpfIstLst_14 ().size ()).append ("):"); for (var model : getUpfIstLst_14 ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUpfIstLst_15 () != null) { str.append ("\n").append (indent).append ("UpfIstLst_15 (").append (getUpfIstLst_15 ().size ()).append ("):"); for (var model : getUpfIstLst_15 ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUpfIstLst_16 () != null) { str.append ("\n").append (indent).append ("UpfIstLst_16 (").append (getUpfIstLst_16 ().size ()).append ("):"); for (var model : getUpfIstLst_16 ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUpfIstLst_17 () != null) { str.append ("\n").append (indent).append ("UpfIstLst_17 (").append (getUpfIstLst_17 ().size ()).append ("):"); for (var model : getUpfIstLst_17 ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUpfIstLst_18 () != null) { str.append ("\n").append (indent).append ("UpfIstLst_18 (").append (getUpfIstLst_18 ().size ()).append ("):"); for (var model : getUpfIstLst_18 ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUpfIstLst_19 () != null) { str.append ("\n").append (indent).append ("UpfIstLst_19 (").append (getUpfIstLst_19 ().size ()).append ("):"); for (var model : getUpfIstLst_19 ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUpfIstLst_20 () != null) { str.append ("\n").append (indent).append ("UpfIstLst_20 (").append (getUpfIstLst_20 ().size ()).append ("):"); for (var model : getUpfIstLst_20 ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLst () != null) { str.append ("\n").append (indent).append ("Lst: \n").append (getLst ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngLstValImpl newEmptyInstance () { return (AngLstValImpl) newInstance (); }
    
    @Override public AngLstValImpl getCopy () {
        var toReturn = (AngLstValImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngLstVal _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngLstValImpl.baseUrl (); }
    public static String baseUrl () { return AngLstValImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngLstValImpl.baseUrl = baseUrl; } 

    @Override public List<AngLstValFields> getFields () { return Arrays.asList (AngLstValFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngLstValImpl
