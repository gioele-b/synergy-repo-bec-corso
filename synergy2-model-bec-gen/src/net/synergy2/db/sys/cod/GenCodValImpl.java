package net.synergy2.db.sys.cod;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class GenCodValImpl extends GenCodVal {

    protected GenCodValImpl () { super (); }

    public enum GenCodValFields implements ISField {
        Uid, CodRulUid, CodYea, CodMon, CodDay, CodNumVal, Tsi, Tsu, Rsi, Rsu;
    } // GenCodValFields
    
    private static String baseUrl = "/rest/sys/cod/GenCodVal";


    @Override public String getModelClassName () { return "GenCodValImpl"; }




    
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
        str.append ("CodRulUid[").append (getCodRulUid ()).append ("] ");
        str.append ("CodYea[").append (getCodYea ()).append ("] ");
        str.append ("CodMon[").append (getCodMon ()).append ("] ");
        str.append ("CodDay[").append (getCodDay ()).append ("] ");
        if (full) { str.append ("CodNumVal[").append (getCodNumVal ()).append ("] "); }
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
        if (getCodRul () != null) { str.append ("\n").append (indent).append ("CodRul: \n").append (getCodRul ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public GenCodValImpl newEmptyInstance () { return (GenCodValImpl) newInstance (); }
    
    @Override public GenCodValImpl getCopy () {
        return (GenCodValImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (GenCodVal _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return GenCodValImpl.baseUrl (); }
    public static String baseUrl () { return GenCodValImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { GenCodValImpl.baseUrl = baseUrl; } 

    @Override public List<GenCodValFields> getFields () { return Arrays.asList (GenCodValFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // GenCodValImpl
