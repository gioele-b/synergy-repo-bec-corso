package net.synergy2.db.dvz.rep;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzRepChrAxyImpl extends DvzRepChrAxy {

    protected DvzRepChrAxyImpl () { super (); }

    public enum DvzRepChrAxyFields implements ISField {
        Uid, ChrUid, DbmColUid, AggUid, TblAls, NumMin, NumMax, AxySrt, DatSetClr, DatSetDsc, AggCum, Tsi, Tsu, Rsi, Rsu;
    } // DvzRepChrAxyFields
    
    private static String baseUrl = "/rest/dvz/rep/DvzRepChrAxy";


    @Override public String getModelClassName () { return "DvzRepChrAxyImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public DvzRepChrAxyImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        if (full) { str.append ("ChrUid[").append (getChrUid ()).append ("] "); }
        if (full) { str.append ("DbmColUid[").append (getDbmColUid ()).append ("] "); }
        if (full) { str.append ("AggUid[").append (getAggUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTblAls ())) { str.append ("TblAls[").append (getTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getNumMin ())) { str.append ("NumMin[").append (getNumMin ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getNumMax ())) { str.append ("NumMax[").append (getNumMax ()).append ("] "); } }
        if (full) { str.append ("AxySrt[").append (getAxySrt ()).append ("] "); }
        if (full) { if (Objects.nonNull (getDatSetClr ())) { str.append ("DatSetClr[").append (getDatSetClr ()).append ("] "); } }
        if (Objects.nonNull (getDatSetDsc ())) { str.append ("DatSetDsc[").append (getDatSetDsc ()).append ("] "); }
        if (full) { if (Objects.nonNull (getAggCum ())) { str.append ("AggCum[").append (getAggCum ()).append ("] "); } }
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
        if (getChr () != null) { str.append ("\n").append (indent).append ("Chr: \n").append (getChr ().debug (full, true, indent + "    ")); }
        if (getDbmCol () != null) { str.append ("\n").append (indent).append ("DbmCol: \n").append (getDbmCol ().debug (full, true, indent + "    ")); }
        if (getAgg () != null) { str.append ("\n").append (indent).append ("Agg: \n").append (getAgg ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzRepChrAxyImpl newEmptyInstance () { return (DvzRepChrAxyImpl) newInstance (); }
    
    @Override public DvzRepChrAxyImpl getCopy () {
        var toReturn = (DvzRepChrAxyImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (DvzRepChrAxy _other, boolean checkUid, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DvzRepChrAxyImpl.baseUrl (); }
    public static String baseUrl () { return DvzRepChrAxyImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzRepChrAxyImpl.baseUrl = baseUrl; } 

    @Override public List<DvzRepChrAxyFields> getFields () { return Arrays.asList (DvzRepChrAxyFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzRepChrAxyImpl
