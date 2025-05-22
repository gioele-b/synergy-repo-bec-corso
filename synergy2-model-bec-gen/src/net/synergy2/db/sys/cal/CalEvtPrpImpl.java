package net.synergy2.db.sys.cal;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class CalEvtPrpImpl extends CalEvtPrp {

    protected CalEvtPrpImpl () { super (); }

    public enum CalEvtPrpFields implements ISField {
        EvtUid, EvtPrpNam, EvtPrpVal, Tsi, Tsu, Rsi, Rsu;
    } // CalEvtPrpFields
    
    private static String baseUrl = "/rest/sys/cal/CalEvtPrp";


    @Override public String getModelClassName () { return "CalEvtPrpImpl"; }




    
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
        str.append ("EvtUid[").append (getEvtUid ()).append ("] ");
        str.append ("EvtPrpNam[").append (getEvtPrpNam ()).append ("] ");
        if (full) { str.append ("EvtPrpVal[").append (getEvtPrpVal ()).append ("] "); }
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
        if (getEvt () != null) { str.append ("\n").append (indent).append ("Evt: \n").append (getEvt ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getEvtUid () + "#" + getEvtPrpNam ().replace ("*", "**").replace ("#", "*#"); }

    @Override public CalEvtPrpImpl newEmptyInstance () { return (CalEvtPrpImpl) newInstance (); }
    
    @Override public CalEvtPrpImpl getCopy () {
        return (CalEvtPrpImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (CalEvtPrp _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return CalEvtPrpImpl.baseUrl (); }
    public static String baseUrl () { return CalEvtPrpImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { CalEvtPrpImpl.baseUrl = baseUrl; } 

    @Override public List<CalEvtPrpFields> getFields () { return Arrays.asList (CalEvtPrpFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // CalEvtPrpImpl
