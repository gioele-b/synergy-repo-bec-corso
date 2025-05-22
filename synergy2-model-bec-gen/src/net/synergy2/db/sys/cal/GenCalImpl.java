package net.synergy2.db.sys.cal;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class GenCalImpl extends GenCal {

    protected GenCalImpl () { super (); }

    public enum GenCalFields implements ISField {
        Uid, CalUid, DayUid, TssStr, TssEnd, DurMin, Tsi, Tsu, Rsi, Rsu;
    } // GenCalFields
    
    private static String baseUrl = "/rest/sys/cal/GenCal";


    @Override public String getModelClassName () { return "GenCalImpl"; }




    
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
        str.append ("CalUid[").append (getCalUid ()).append ("] ");
        str.append ("DayUid[").append (getDayUid ()).append ("] ");
        str.append ("TssStr[").append (getTssStr ()).append ("] ");
        if (full) { str.append ("TssEnd[").append (getTssEnd ()).append ("] "); }
        if (full) { str.append ("DurMin[").append (getDurMin ()).append ("] "); }
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
        if (getDay () != null) { str.append ("\n").append (indent).append ("Day: \n").append (getDay ().debug (full, true, indent + "    ")); }
        if (getCal () != null) { str.append ("\n").append (indent).append ("Cal: \n").append (getCal ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public GenCalImpl newEmptyInstance () { return (GenCalImpl) newInstance (); }
    
    @Override public GenCalImpl getCopy () {
        return (GenCalImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (GenCal _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return GenCalImpl.baseUrl (); }
    public static String baseUrl () { return GenCalImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { GenCalImpl.baseUrl = baseUrl; } 

    @Override public List<GenCalFields> getFields () { return Arrays.asList (GenCalFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // GenCalImpl
