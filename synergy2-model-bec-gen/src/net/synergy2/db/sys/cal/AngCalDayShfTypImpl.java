package net.synergy2.db.sys.cal;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class AngCalDayShfTypImpl extends AngCalDayShfTyp {

    protected AngCalDayShfTypImpl () { super (); }

    public enum AngCalDayShfTypFields implements ISField {
        Uid, ShfTypCod, ShfTypDsc, EtyUid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, ShfTypClr;
    } // AngCalDayShfTypFields
    
    private static String baseUrl = "/rest/sys/cal/AngCalDayShfTyp";


    @Override public String getModelClassName () { return "AngCalDayShfTypImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngCalDayShfTypImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("ShfTypCod[").append (getShfTypCod ()).append ("] ");
        str.append ("ShfTypDsc[").append (getShfTypDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { str.append ("ShfTypClr[").append (getShfTypClr ()).append ("] "); }
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
        if (getShfLst () != null) { str.append ("\n").append (indent).append ("ShfLst (").append (getShfLst ().size ()).append ("):"); for (var model : getShfLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getShfTypResFavLst () != null) { str.append ("\n").append (indent).append ("ShfTypResFavLst (").append (getShfTypResFavLst ().size ()).append ("):"); for (var model : getShfTypResFavLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngCalDayShfTypImpl newEmptyInstance () { return (AngCalDayShfTypImpl) newInstance (); }
    
    @Override public AngCalDayShfTypImpl getCopy () {
        var toReturn = (AngCalDayShfTypImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngCalDayShfTyp _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngCalDayShfTypImpl.baseUrl (); }
    public static String baseUrl () { return AngCalDayShfTypImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngCalDayShfTypImpl.baseUrl = baseUrl; } 

    @Override public List<AngCalDayShfTypFields> getFields () { return Arrays.asList (AngCalDayShfTypFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngCalDayShfTypImpl
