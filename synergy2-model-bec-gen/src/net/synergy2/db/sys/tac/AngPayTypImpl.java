package net.synergy2.db.sys.tac;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngPayTypImpl extends AngPayTyp {

    protected AngPayTypImpl () { super (); }

    public enum AngPayTypFields implements ISField {
        Uid, PayTypSrt, ErpCod, PayTypDsc, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // AngPayTypFields
    
    private static String baseUrl = "/rest/sys/tac/AngPayTyp";


    @Override public String getModelClassName () { return "AngPayTypImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngPayTypImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        if (full) { str.append ("PayTypSrt[").append (getPayTypSrt ()).append ("] "); }
        if (full) { if (Objects.nonNull (getErpCod ())) { str.append ("ErpCod[").append (getErpCod ()).append ("] "); } }
        str.append ("PayTypDsc[").append (getPayTypDsc ()).append ("] ");
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
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRecRulLst () != null) { str.append ("\n").append (indent).append ("RecRulLst (").append (getRecRulLst ().size ()).append ("):"); for (var model : getRecRulLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngPayTypImpl newEmptyInstance () { return (AngPayTypImpl) newInstance (); }
    
    @Override public AngPayTypImpl getCopy () {
        var toReturn = (AngPayTypImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngPayTyp _other, boolean checkUid, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngPayTypImpl.baseUrl (); }
    public static String baseUrl () { return AngPayTypImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngPayTypImpl.baseUrl = baseUrl; } 

    @Override public List<AngPayTypFields> getFields () { return Arrays.asList (AngPayTypFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngPayTypImpl
