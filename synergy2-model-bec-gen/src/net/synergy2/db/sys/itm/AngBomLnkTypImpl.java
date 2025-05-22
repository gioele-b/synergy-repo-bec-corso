package net.synergy2.db.sys.itm;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngBomLnkTypImpl extends AngBomLnkTyp {

    protected AngBomLnkTypImpl () { super (); }

    public enum AngBomLnkTypFields implements ISField {
        Uid, TypCod, TypDsc, EnbPln, EnbVal, EnbPrc, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // AngBomLnkTypFields
    
    private static String baseUrl = "/rest/sys/itm/AngBomLnkTyp";


    @Override public String getModelClassName () { return "AngBomLnkTypImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngBomLnkTypImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("TypCod[").append (getTypCod ()).append ("] ");
        str.append ("TypDsc[").append (getTypDsc ()).append ("] ");
        if (full) { str.append ("EnbPln[").append (getEnbPln ()).append ("] "); }
        if (full) { str.append ("EnbVal[").append (getEnbVal ()).append ("] "); }
        if (full) { str.append ("EnbPrc[").append (getEnbPrc ()).append ("] "); }
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
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngBomLnkTypImpl newEmptyInstance () { return (AngBomLnkTypImpl) newInstance (); }
    
    @Override public AngBomLnkTypImpl getCopy () {
        var toReturn = (AngBomLnkTypImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngBomLnkTyp _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngBomLnkTypImpl.baseUrl (); }
    public static String baseUrl () { return AngBomLnkTypImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngBomLnkTypImpl.baseUrl = baseUrl; } 

    @Override public List<AngBomLnkTypFields> getFields () { return Arrays.asList (AngBomLnkTypFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngBomLnkTypImpl
