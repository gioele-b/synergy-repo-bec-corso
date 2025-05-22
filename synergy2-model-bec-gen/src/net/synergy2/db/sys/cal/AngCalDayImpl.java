package net.synergy2.db.sys.cal;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class AngCalDayImpl extends AngCalDay {

    protected AngCalDayImpl () { super (); }

    public enum AngCalDayFields implements ISField {
        Uid, DayCod, DayDsc, DayPub, EtyUid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // AngCalDayFields
    
    private static String baseUrl = "/rest/sys/cal/AngCalDay";


    @Override public String getModelClassName () { return "AngCalDayImpl"; }




    
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
        str.append ("DayCod[").append (getDayCod ()).append ("] ");
        str.append ("DayDsc[").append (getDayDsc ()).append ("] ");
        if (full) { str.append ("DayPub[").append (getDayPub ()).append ("] "); }
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
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
        if (getShfLst () != null) { str.append ("\n").append (indent).append ("ShfLst (").append (getShfLst ().size ()).append ("):"); for (var model : getShfLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCalMonLst () != null) { str.append ("\n").append (indent).append ("CalMonLst (").append (getCalMonLst ().size ()).append ("):"); for (var model : getCalMonLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCalTueLst () != null) { str.append ("\n").append (indent).append ("CalTueLst (").append (getCalTueLst ().size ()).append ("):"); for (var model : getCalTueLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCalWedLst () != null) { str.append ("\n").append (indent).append ("CalWedLst (").append (getCalWedLst ().size ()).append ("):"); for (var model : getCalWedLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCalThuLst () != null) { str.append ("\n").append (indent).append ("CalThuLst (").append (getCalThuLst ().size ()).append ("):"); for (var model : getCalThuLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCalFriLst () != null) { str.append ("\n").append (indent).append ("CalFriLst (").append (getCalFriLst ().size ()).append ("):"); for (var model : getCalFriLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCalSatLst () != null) { str.append ("\n").append (indent).append ("CalSatLst (").append (getCalSatLst ().size ()).append ("):"); for (var model : getCalSatLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCalSunLst () != null) { str.append ("\n").append (indent).append ("CalSunLst (").append (getCalSunLst ().size ()).append ("):"); for (var model : getCalSunLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngCalDayImpl newEmptyInstance () { return (AngCalDayImpl) newInstance (); }
    
    @Override public AngCalDayImpl getCopy () {
        return (AngCalDayImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngCalDay _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngCalDayImpl.baseUrl (); }
    public static String baseUrl () { return AngCalDayImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngCalDayImpl.baseUrl = baseUrl; } 

    @Override public List<AngCalDayFields> getFields () { return Arrays.asList (AngCalDayFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngCalDayImpl
