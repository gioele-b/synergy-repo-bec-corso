package net.synergy2.db.sys.bas;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class AngDayImpl extends AngDay {

    protected AngDayImpl () { super (); }

    public enum AngDayFields implements ISField {
        Uid, DayCod, DayWee, Mon, Wee, YeaMon, YeaWee, EtyUid, Tsi, Tsu, Rsi, Rsu;
    } // AngDayFields
    
    private static String baseUrl = "/rest/sys/bas/AngDay";


    @Override public String getModelClassName () { return "AngDayImpl"; }




    
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
        if (full) { str.append ("DayWee[").append (getDayWee ()).append ("] "); }
        if (full) { str.append ("Mon[").append (getMon ()).append ("] "); }
        if (full) { str.append ("Wee[").append (getWee ()).append ("] "); }
        if (full) { str.append ("YeaMon[").append (getYeaMon ()).append ("] "); }
        if (full) { str.append ("YeaWee[").append (getYeaWee ()).append ("] "); }
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
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
        if (getShfLst () != null) { str.append ("\n").append (indent).append ("ShfLst (").append (getShfLst ().size ()).append ("):"); for (var model : getShfLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAbsLst () != null) { str.append ("\n").append (indent).append ("AbsLst (").append (getAbsLst ().size ()).append ("):"); for (var model : getAbsLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAvlLst () != null) { str.append ("\n").append (indent).append ("AvlLst (").append (getAvlLst ().size ()).append ("):"); for (var model : getAvlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCalOrgComAbsLst () != null) { str.append ("\n").append (indent).append ("CalOrgComAbsLst (").append (getCalOrgComAbsLst ().size ()).append ("):"); for (var model : getCalOrgComAbsLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCalPlnAbsLst () != null) { str.append ("\n").append (indent).append ("CalPlnAbsLst (").append (getCalPlnAbsLst ().size ()).append ("):"); for (var model : getCalPlnAbsLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngDayImpl newEmptyInstance () { return (AngDayImpl) newInstance (); }
    
    @Override public AngDayImpl getCopy () {
        return (AngDayImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngDay _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngDayImpl.baseUrl (); }
    public static String baseUrl () { return AngDayImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngDayImpl.baseUrl = baseUrl; } 

    @Override public List<AngDayFields> getFields () { return Arrays.asList (AngDayFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngDayImpl
