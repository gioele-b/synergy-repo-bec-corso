package net.synergy2.db.sys.cal;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class GenCalAvlImpl extends GenCalAvl {

    protected GenCalAvlImpl () { super (); }

    public enum GenCalAvlFields implements ISField {
        Uid, CalUid, DayUid, ResUid, AvlMin, Tsi, Tsu, Rsi, Rsu;
    } // GenCalAvlFields
    
    private static String baseUrl = "/rest/sys/cal/GenCalAvl";


    @Override public String getModelClassName () { return "GenCalAvlImpl"; }




    
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
        if (Objects.nonNull (getResUid ())) { str.append ("ResUid[").append (getResUid ()).append ("] "); }
        if (full) { str.append ("AvlMin[").append (getAvlMin ()).append ("] "); }
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
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        if (getDay () != null) { str.append ("\n").append (indent).append ("Day: \n").append (getDay ().debug (full, true, indent + "    ")); }
        if (getCal () != null) { str.append ("\n").append (indent).append ("Cal: \n").append (getCal ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public GenCalAvlImpl newEmptyInstance () { return (GenCalAvlImpl) newInstance (); }
    
    @Override public GenCalAvlImpl getCopy () {
        return (GenCalAvlImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (GenCalAvl _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return GenCalAvlImpl.baseUrl (); }
    public static String baseUrl () { return GenCalAvlImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { GenCalAvlImpl.baseUrl = baseUrl; } 

    @Override public List<GenCalAvlFields> getFields () { return Arrays.asList (GenCalAvlFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // GenCalAvlImpl
