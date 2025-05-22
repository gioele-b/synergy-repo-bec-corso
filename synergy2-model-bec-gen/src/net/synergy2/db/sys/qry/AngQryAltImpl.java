package net.synergy2.db.sys.qry;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngQryAltImpl extends AngQryAlt {

    protected AngQryAltImpl () { super (); }

    public enum AngQryAltFields implements ISField {
        Uid, QryNam, QryNamAlt, SrtBro, AltDef, AltEnb, Tsi, Tsu, Rsi, Rsu;
    } // AngQryAltFields
    
    private static String baseUrl = "/rest/sys/qry/AngQryAlt";


    @Override public String getModelClassName () { return "AngQryAltImpl"; }




    
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
        str.append ("QryNam[").append (getQryNam ()).append ("] ");
        str.append ("QryNamAlt[").append (getQryNamAlt ()).append ("] ");
        if (full) { str.append ("SrtBro[").append (getSrtBro ()).append ("] "); }
        if (full) { str.append ("AltDef[").append (getAltDef ()).append ("] "); }
        if (full) { str.append ("AltEnb[").append (getAltEnb ()).append ("] "); }
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

        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngQryAltImpl newEmptyInstance () { return (AngQryAltImpl) newInstance (); }
    
    @Override public AngQryAltImpl getCopy () {
        return (AngQryAltImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngQryAlt _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngQryAltImpl.baseUrl (); }
    public static String baseUrl () { return AngQryAltImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngQryAltImpl.baseUrl = baseUrl; } 

    @Override public List<AngQryAltFields> getFields () { return Arrays.asList (AngQryAltFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngQryAltImpl
