package net.synergy2.db.sys.cal;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class CalEvtSubResImpl extends CalEvtSubRes {

    protected CalEvtSubResImpl () { super (); }

    public enum CalEvtSubResFields implements ISField {
        Uid, ResUid, SubResUid, SubEnb, Tsi, Tsu, Rsi, Rsu;
    } // CalEvtSubResFields
    
    private static String baseUrl = "/rest/sys/cal/CalEvtSubRes";


    @Override public String getModelClassName () { return "CalEvtSubResImpl"; }




    
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
        str.append ("ResUid[").append (getResUid ()).append ("] ");
        str.append ("SubResUid[").append (getSubResUid ()).append ("] ");
        str.append ("SubEnb[").append (getSubEnb ()).append ("] ");
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
        if (getSubRes () != null) { str.append ("\n").append (indent).append ("SubRes: \n").append (getSubRes ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public CalEvtSubResImpl newEmptyInstance () { return (CalEvtSubResImpl) newInstance (); }
    
    @Override public CalEvtSubResImpl getCopy () {
        return (CalEvtSubResImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (CalEvtSubRes _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return CalEvtSubResImpl.baseUrl (); }
    public static String baseUrl () { return CalEvtSubResImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { CalEvtSubResImpl.baseUrl = baseUrl; } 

    @Override public List<CalEvtSubResFields> getFields () { return Arrays.asList (CalEvtSubResFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // CalEvtSubResImpl
