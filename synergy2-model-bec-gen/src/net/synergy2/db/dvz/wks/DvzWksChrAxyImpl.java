package net.synergy2.db.dvz.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzWksChrAxyImpl extends DvzWksChrAxy {

    protected DvzWksChrAxyImpl () { super (); }

    public enum DvzWksChrAxyFields implements ISField {
        Uid, DvzChrUid, AxyTblAls, AxyColUid, AxyClcUid, AxySrt, AggUid, NumMin, NumMax, DatSetClr, DatSetDsc, AggCum, Tsi, Tsu, Rsi, Rsu, AxyFldUid, DvzQryUid, DatSetTyp, PntShp, PntSiz, LinSty, LinSiz, VisDatSet;
    } // DvzWksChrAxyFields
    
    private static String baseUrl = "/rest/dvz/wks/DvzWksChrAxy";


    @Override public String getModelClassName () { return "DvzWksChrAxyImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public DvzWksChrAxyImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("DvzChrUid[").append (getDvzChrUid ()).append ("] ");
        if (full) { if (Objects.nonNull (getAxyTblAls ())) { str.append ("AxyTblAls[").append (getAxyTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getAxyColUid ())) { str.append ("AxyColUid[").append (getAxyColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getAxyClcUid ())) { str.append ("AxyClcUid[").append (getAxyClcUid ()).append ("] "); } }
        if (full) { str.append ("AxySrt[").append (getAxySrt ()).append ("] "); }
        if (full) { if (Objects.nonNull (getAggUid ())) { str.append ("AggUid[").append (getAggUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getNumMin ())) { str.append ("NumMin[").append (getNumMin ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getNumMax ())) { str.append ("NumMax[").append (getNumMax ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDatSetClr ())) { str.append ("DatSetClr[").append (getDatSetClr ()).append ("] "); } }
        if (Objects.nonNull (getDatSetDsc ())) { str.append ("DatSetDsc[").append (getDatSetDsc ()).append ("] "); }
        if (full) { if (Objects.nonNull (getAggCum ())) { str.append ("AggCum[").append (getAggCum ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getAxyFldUid ())) { str.append ("AxyFldUid[").append (getAxyFldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDvzQryUid ())) { str.append ("DvzQryUid[").append (getDvzQryUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDatSetTyp ())) { str.append ("DatSetTyp[").append (getDatSetTyp ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPntShp ())) { str.append ("PntShp[").append (getPntShp ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPntSiz ())) { str.append ("PntSiz[").append (getPntSiz ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLinSty ())) { str.append ("LinSty[").append (getLinSty ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLinSiz ())) { str.append ("LinSiz[").append (getLinSiz ()).append ("] "); } }
        if (full) { str.append ("VisDatSet[").append (getVisDatSet ()).append ("] "); }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getClrRngLst () != null) { str.append ("\n").append (indent).append ("ClrRngLst (").append (getClrRngLst ().size ()).append ("):"); for (var model : getClrRngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzChr () != null) { str.append ("\n").append (indent).append ("DvzChr: \n").append (getDvzChr ().debug (full, true, indent + "    ")); }
        if (getAxyCol () != null) { str.append ("\n").append (indent).append ("AxyCol: \n").append (getAxyCol ().debug (full, true, indent + "    ")); }
        if (getAxyClc () != null) { str.append ("\n").append (indent).append ("AxyClc: \n").append (getAxyClc ().debug (full, true, indent + "    ")); }
        if (getAgg () != null) { str.append ("\n").append (indent).append ("Agg: \n").append (getAgg ().debug (full, true, indent + "    ")); }
        if (getAxyFld () != null) { str.append ("\n").append (indent).append ("AxyFld: \n").append (getAxyFld ().debug (full, true, indent + "    ")); }
        if (getDvzQry () != null) { str.append ("\n").append (indent).append ("DvzQry: \n").append (getDvzQry ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzWksChrAxyImpl newEmptyInstance () { return (DvzWksChrAxyImpl) newInstance (); }
    
    @Override public DvzWksChrAxyImpl getCopy () {
        var toReturn = (DvzWksChrAxyImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (DvzWksChrAxy _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DvzWksChrAxyImpl.baseUrl (); }
    public static String baseUrl () { return DvzWksChrAxyImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzWksChrAxyImpl.baseUrl = baseUrl; } 

    @Override public List<DvzWksChrAxyFields> getFields () { return Arrays.asList (DvzWksChrAxyFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzWksChrAxyImpl
