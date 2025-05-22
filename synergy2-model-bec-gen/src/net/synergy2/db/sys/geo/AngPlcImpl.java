package net.synergy2.db.sys.geo;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngPlcImpl extends AngPlc {

    protected AngPlcImpl () { super (); }

    public enum AngPlcFields implements ISField {
        Uid, PlcTyp, PlcCod, PlcDsc, PlcRefUid, PlcDep, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, ZonUid, PlcIsoCod, Cny003Cod, CnyNumCod;
    } // AngPlcFields
    
    private static String baseUrl = "/rest/sys/geo/AngPlc";


    @Override public String getModelClassName () { return "AngPlcImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngPlcImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("PlcTyp[").append (getPlcTyp ()).append ("] ");
        str.append ("PlcCod[").append (getPlcCod ()).append ("] ");
        str.append ("PlcDsc[").append (getPlcDsc ()).append ("] ");
        if (Objects.nonNull (getPlcRefUid ())) { str.append ("PlcRefUid[").append (getPlcRefUid ()).append ("] "); }
        if (full) { str.append ("PlcDep[").append (getPlcDep ()).append ("] "); }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getZonUid ())) { str.append ("ZonUid[").append (getZonUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPlcIsoCod ())) { str.append ("PlcIsoCod[").append (getPlcIsoCod ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCny003Cod ())) { str.append ("Cny003Cod[").append (getCny003Cod ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCnyNumCod ())) { str.append ("CnyNumCod[").append (getCnyNumCod ()).append ("] "); } }
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
        if (getOrgComLst () != null) { str.append ("\n").append (indent).append ("OrgComLst (").append (getOrgComLst ().size ()).append ("):"); for (var model : getOrgComLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getBnkStaLst () != null) { str.append ("\n").append (indent).append ("BnkStaLst (").append (getBnkStaLst ().size ()).append ("):"); for (var model : getBnkStaLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getBnkPrvLst () != null) { str.append ("\n").append (indent).append ("BnkPrvLst (").append (getBnkPrvLst ().size ()).append ("):"); for (var model : getBnkPrvLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getChdPlcLst () != null) { str.append ("\n").append (indent).append ("ChdPlcLst (").append (getChdPlcLst ().size ()).append ("):"); for (var model : getChdPlcLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getZon () != null) { str.append ("\n").append (indent).append ("Zon: \n").append (getZon ().debug (full, true, indent + "    ")); }
        if (getPlc () != null) { str.append ("\n").append (indent).append ("Plc: \n").append (getPlc ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngPlcImpl newEmptyInstance () { return (AngPlcImpl) newInstance (); }
    
    @Override public AngPlcImpl getCopy () {
        var toReturn = (AngPlcImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngPlc _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngPlcImpl.baseUrl (); }
    public static String baseUrl () { return AngPlcImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngPlcImpl.baseUrl = baseUrl; } 

    @Override public List<AngPlcFields> getFields () { return Arrays.asList (AngPlcFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngPlcImpl
