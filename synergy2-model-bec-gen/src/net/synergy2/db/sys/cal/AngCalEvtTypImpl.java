package net.synergy2.db.sys.cal;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class AngCalEvtTypImpl extends AngCalEvtTyp {

    protected AngCalEvtTypImpl () { super (); }

    public enum AngCalEvtTypFields implements ISField {
        Uid, EvtTypCod, EvtTypDsc, RefEvtTypUid, FlgEnb, EvtTypPrv, EvtTypClsNam, EvtTypBckCol, EtyUid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, FlgEnbTsk;
    } // AngCalEvtTypFields
    
    private static String baseUrl = "/rest/sys/cal/AngCalEvtTyp";


    @Override public String getModelClassName () { return "AngCalEvtTypImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngCalEvtTypImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("EvtTypCod[").append (getEvtTypCod ()).append ("] ");
        if (Objects.nonNull (getEvtTypDsc ())) { str.append ("EvtTypDsc[").append (getEvtTypDsc ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRefEvtTypUid ())) { str.append ("RefEvtTypUid[").append (getRefEvtTypUid ()).append ("] "); } }
        if (full) { str.append ("FlgEnb[").append (getFlgEnb ()).append ("] "); }
        if (full) { str.append ("EvtTypPrv[").append (getEvtTypPrv ()).append ("] "); }
        if (full) { if (Objects.nonNull (getEvtTypClsNam ())) { str.append ("EvtTypClsNam[").append (getEvtTypClsNam ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEvtTypBckCol ())) { str.append ("EvtTypBckCol[").append (getEvtTypBckCol ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { str.append ("FlgEnbTsk[").append (getFlgEnbTsk ()).append ("] "); }
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
        if (getEvtTypLst () != null) { str.append ("\n").append (indent).append ("EvtTypLst (").append (getEvtTypLst ().size ()).append ("):"); for (var model : getEvtTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEvtLst () != null) { str.append ("\n").append (indent).append ("EvtLst (").append (getEvtLst ().size ()).append ("):"); for (var model : getEvtLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEvtTypRef () != null) { str.append ("\n").append (indent).append ("EvtTypRef: \n").append (getEvtTypRef ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngCalEvtTypImpl newEmptyInstance () { return (AngCalEvtTypImpl) newInstance (); }
    
    @Override public AngCalEvtTypImpl getCopy () {
        var toReturn = (AngCalEvtTypImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngCalEvtTyp _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngCalEvtTypImpl.baseUrl (); }
    public static String baseUrl () { return AngCalEvtTypImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngCalEvtTypImpl.baseUrl = baseUrl; } 

    @Override public List<AngCalEvtTypFields> getFields () { return Arrays.asList (AngCalEvtTypFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngCalEvtTypImpl
