package net.synergy2.db.sys.geo;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class GenCurDayExcImpl extends GenCurDayExc {

    protected GenCurDayExcImpl () { super (); }

    public enum GenCurDayExcFields implements ISField {
        CurSrcUid, CurTrgUid, ExcDay, ExcVal, Tsi, Tsu, Rsi, Rsu;
    } // GenCurDayExcFields
    
    private static String baseUrl = "/rest/sys/geo/GenCurDayExc";


    @Override public String getModelClassName () { return "GenCurDayExcImpl"; }




    
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
        str.append ("CurSrcUid[").append (getCurSrcUid ()).append ("] ");
        str.append ("CurTrgUid[").append (getCurTrgUid ()).append ("] ");
        str.append ("ExcDay[").append (getExcDay ()).append ("] ");
        if (full) { str.append ("ExcVal[").append (getExcVal ()).append ("] "); }
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
        if (getSrcCur () != null) { str.append ("\n").append (indent).append ("SrcCur: \n").append (getSrcCur ().debug (full, true, indent + "    ")); }
        if (getTrgCur () != null) { str.append ("\n").append (indent).append ("TrgCur: \n").append (getTrgCur ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getCurSrcUid () + "#" + getCurTrgUid () + "#" + getExcDay (); }

    @Override public GenCurDayExcImpl newEmptyInstance () { return (GenCurDayExcImpl) newInstance (); }
    
    @Override public GenCurDayExcImpl getCopy () {
        return (GenCurDayExcImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (GenCurDayExc _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return GenCurDayExcImpl.baseUrl (); }
    public static String baseUrl () { return GenCurDayExcImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { GenCurDayExcImpl.baseUrl = baseUrl; } 

    @Override public List<GenCurDayExcFields> getFields () { return Arrays.asList (GenCurDayExcFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // GenCurDayExcImpl
