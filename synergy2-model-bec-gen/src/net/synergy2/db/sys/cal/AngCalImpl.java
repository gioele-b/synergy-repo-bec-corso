package net.synergy2.db.sys.cal;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class AngCalImpl extends AngCal {

    protected AngCalImpl () { super (); }

    public enum AngCalFields implements ISField {
        Uid, CalCod, CalDsc, MonUid, TueUid, WedUid, ThuUid, FriUid, SatUid, SunUid, TssGenStr, TssGenEnd, HouPerDay, HouPerWek, HouPerMth, CalHldUid, EtyUid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, CalTyp, ObsGenCal;
    } // AngCalFields
    
    private static String baseUrl = "/rest/sys/cal/AngCal";


    @Override public String getModelClassName () { return "AngCalImpl"; }




    
    @Override public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        switch (fieldName) {
            case SAlias.ENTITY -> setEntity ((AngEty) value); 

            default -> {
                if (!settedSuper) { throw new SQueryException ("No reference specification found for field [" + fieldName + "]."); }
            }
        } // switch
        return true;
    } // set
    
    @Override public String debug (boolean full, boolean cascade, String indent) {
        StringBuilder str = new StringBuilder (indent).append (getModelClassName ()).append (" = {");
        str.append ("Uid[").append (getUid ()).append ("] ");
        str.append ("CalCod[").append (getCalCod ()).append ("] ");
        str.append ("CalDsc[").append (getCalDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getMonUid ())) { str.append ("MonUid[").append (getMonUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTueUid ())) { str.append ("TueUid[").append (getTueUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getWedUid ())) { str.append ("WedUid[").append (getWedUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getThuUid ())) { str.append ("ThuUid[").append (getThuUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFriUid ())) { str.append ("FriUid[").append (getFriUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getSatUid ())) { str.append ("SatUid[").append (getSatUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getSunUid ())) { str.append ("SunUid[").append (getSunUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTssGenStr ())) { str.append ("TssGenStr[").append (getTssGenStr ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTssGenEnd ())) { str.append ("TssGenEnd[").append (getTssGenEnd ()).append ("] "); } }
        if (full) { str.append ("HouPerDay[").append (getHouPerDay ()).append ("] "); }
        if (full) { str.append ("HouPerWek[").append (getHouPerWek ()).append ("] "); }
        if (full) { str.append ("HouPerMth[").append (getHouPerMth ()).append ("] "); }
        if (full) { if (Objects.nonNull (getCalHldUid ())) { str.append ("CalHldUid[").append (getCalHldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { str.append ("CalTyp[").append (getCalTyp ()).append ("] "); }
        if (full) { str.append ("ObsGenCal[").append (getObsGenCal ()).append ("] "); }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getExpLst () != null) { str.append ("\n").append (indent).append ("ExpLst (").append (getExpLst ().size ()).append ("):"); for (var model : getExpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getExpRngLst () != null) { str.append ("\n").append (indent).append ("ExpRngLst (").append (getExpRngLst ().size ()).append ("):"); for (var model : getExpRngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSubRngLst () != null) { str.append ("\n").append (indent).append ("SubRngLst (").append (getSubRngLst ().size ()).append ("):"); for (var model : getSubRngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getShfLst () != null) { str.append ("\n").append (indent).append ("ShfLst (").append (getShfLst ().size ()).append ("):"); for (var model : getShfLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAvlLst () != null) { str.append ("\n").append (indent).append ("AvlLst (").append (getAvlLst ().size ()).append ("):"); for (var model : getAvlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getResLst () != null) { str.append ("\n").append (indent).append ("ResLst (").append (getResLst ().size ()).append ("):"); for (var model : getResLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getOrgComLst () != null) { str.append ("\n").append (indent).append ("OrgComLst (").append (getOrgComLst ().size ()).append ("):"); for (var model : getOrgComLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getPlnLst () != null) { str.append ("\n").append (indent).append ("PlnLst (").append (getPlnLst ().size ()).append ("):"); for (var model : getPlnLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getMonSft () != null) { str.append ("\n").append (indent).append ("MonSft: \n").append (getMonSft ().debug (full, true, indent + "    ")); }
        if (getTueSft () != null) { str.append ("\n").append (indent).append ("TueSft: \n").append (getTueSft ().debug (full, true, indent + "    ")); }
        if (getWedSft () != null) { str.append ("\n").append (indent).append ("WedSft: \n").append (getWedSft ().debug (full, true, indent + "    ")); }
        if (getThuSft () != null) { str.append ("\n").append (indent).append ("ThuSft: \n").append (getThuSft ().debug (full, true, indent + "    ")); }
        if (getFriSft () != null) { str.append ("\n").append (indent).append ("FriSft: \n").append (getFriSft ().debug (full, true, indent + "    ")); }
        if (getSatSft () != null) { str.append ("\n").append (indent).append ("SatSft: \n").append (getSatSft ().debug (full, true, indent + "    ")); }
        if (getSunSft () != null) { str.append ("\n").append (indent).append ("SunSft: \n").append (getSunSft ().debug (full, true, indent + "    ")); }
        if (getCalHld () != null) { str.append ("\n").append (indent).append ("CalHld: \n").append (getCalHld ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngCalImpl newEmptyInstance () { return (AngCalImpl) newInstance (); }
    
    @Override public AngCalImpl getCopy () {
        return (AngCalImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngCal _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngCalImpl.baseUrl (); }
    public static String baseUrl () { return AngCalImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngCalImpl.baseUrl = baseUrl; } 

    @Override public List<AngCalFields> getFields () { return Arrays.asList (AngCalFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngCalImpl
