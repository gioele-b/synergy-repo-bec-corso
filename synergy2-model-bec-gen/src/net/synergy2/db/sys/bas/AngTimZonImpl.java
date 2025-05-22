package net.synergy2.db.sys.bas;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngTimZonImpl extends AngTimZon {

    protected AngTimZonImpl () { super (); }

    public enum AngTimZonFields implements ISField {
        Uid, TimZonCod, TimZonDsc, TimZonSig, TimZon365, Tsi, Tsu, Rsi, Rsu, TimZonGoo, LogDel, RefTimZonUid, TimZonHou, TimZonMin, Tsd, Rsd;
    } // AngTimZonFields
    
    private static String baseUrl = "/rest/sys/bas/AngTimZon";


    @Override public String getModelClassName () { return "AngTimZonImpl"; }




    
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
        str.append ("TimZonCod[").append (getTimZonCod ()).append ("] ");
        str.append ("TimZonDsc[").append (getTimZonDsc ()).append ("] ");
        if (full) { str.append ("TimZonSig[").append (getTimZonSig ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTimZon365 ())) { str.append ("TimZon365[").append (getTimZon365 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTimZonGoo ())) { str.append ("TimZonGoo[").append (getTimZonGoo ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getRefTimZonUid ())) { str.append ("RefTimZonUid[").append (getRefTimZonUid ()).append ("] "); } }
        if (full) { str.append ("TimZonHou[").append (getTimZonHou ()).append ("] "); }
        if (full) { str.append ("TimZonMin[").append (getTimZonMin ()).append ("] "); }
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
        if (getTimZonLst () != null) { str.append ("\n").append (indent).append ("TimZonLst (").append (getTimZonLst ().size ()).append ("):"); for (var model : getTimZonLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCalEvtLst () != null) { str.append ("\n").append (indent).append ("CalEvtLst (").append (getCalEvtLst ().size ()).append ("):"); for (var model : getCalEvtLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCalEvtEndLst () != null) { str.append ("\n").append (indent).append ("CalEvtEndLst (").append (getCalEvtEndLst ().size ()).append ("):"); for (var model : getCalEvtEndLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getResLst () != null) { str.append ("\n").append (indent).append ("ResLst (").append (getResLst ().size ()).append ("):"); for (var model : getResLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRefTimZon () != null) { str.append ("\n").append (indent).append ("RefTimZon: \n").append (getRefTimZon ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngTimZonImpl newEmptyInstance () { return (AngTimZonImpl) newInstance (); }
    
    @Override public AngTimZonImpl getCopy () {
        return (AngTimZonImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngTimZon _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngTimZonImpl.baseUrl (); }
    public static String baseUrl () { return AngTimZonImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngTimZonImpl.baseUrl = baseUrl; } 

    @Override public List<AngTimZonFields> getFields () { return Arrays.asList (AngTimZonFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngTimZonImpl
