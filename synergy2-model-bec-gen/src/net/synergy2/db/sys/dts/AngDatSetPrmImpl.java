package net.synergy2.db.sys.dts;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngDatSetPrmImpl extends AngDatSetPrm {

    protected AngDatSetPrmImpl () { super (); }

    public enum AngDatSetPrmFields implements ISField {
        Uid, DatSetUid, PrmNam, PrmDsc, PrmSrt, PrmTyp, PrmSubTyp, DbmColUid, Tsi, Tsu, Rsi, Rsu;
    } // AngDatSetPrmFields
    
    private static String baseUrl = "/rest/sys/dts/AngDatSetPrm";


    @Override public String getModelClassName () { return "AngDatSetPrmImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngDatSetPrmImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("DatSetUid[").append (getDatSetUid ()).append ("] ");
        str.append ("PrmNam[").append (getPrmNam ()).append ("] ");
        str.append ("PrmDsc[").append (getPrmDsc ()).append ("] ");
        if (full) { str.append ("PrmSrt[").append (getPrmSrt ()).append ("] "); }
        if (full) { str.append ("PrmTyp[").append (getPrmTyp ()).append ("] "); }
        if (full) { if (Objects.nonNull (getPrmSubTyp ())) { str.append ("PrmSubTyp[").append (getPrmSubTyp ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDbmColUid ())) { str.append ("DbmColUid[").append (getDbmColUid ()).append ("] "); } }
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
        if (getQryFltLst () != null) { str.append ("\n").append (indent).append ("QryFltLst (").append (getQryFltLst ().size ()).append ("):"); for (var model : getQryFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEmaCroPrmLst () != null) { str.append ("\n").append (indent).append ("EmaCroPrmLst (").append (getEmaCroPrmLst ().size ()).append ("):"); for (var model : getEmaCroPrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDatSet () != null) { str.append ("\n").append (indent).append ("DatSet: \n").append (getDatSet ().debug (full, true, indent + "    ")); }
        if (getDbmCol () != null) { str.append ("\n").append (indent).append ("DbmCol: \n").append (getDbmCol ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngDatSetPrmImpl newEmptyInstance () { return (AngDatSetPrmImpl) newInstance (); }
    
    @Override public AngDatSetPrmImpl getCopy () {
        var toReturn = (AngDatSetPrmImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngDatSetPrm _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngDatSetPrmImpl.baseUrl (); }
    public static String baseUrl () { return AngDatSetPrmImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngDatSetPrmImpl.baseUrl = baseUrl; } 

    @Override public List<AngDatSetPrmFields> getFields () { return Arrays.asList (AngDatSetPrmFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngDatSetPrmImpl
