package net.synergy2.db.sys.cal;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class CalEvtResImpl extends CalEvtRes {

    protected CalEvtResImpl () { super (); }

    public enum CalEvtResFields implements ISField {
        Uid, EvtUid, ResUid, InvStsUid, InvTypUid, InvSrcUid, Tsi, Tsu, Rsi, Rsu;
    } // CalEvtResFields
    
    private static String baseUrl = "/rest/sys/cal/CalEvtRes";


    @Override public String getModelClassName () { return "CalEvtResImpl"; }




    
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
        str.append ("EvtUid[").append (getEvtUid ()).append ("] ");
        str.append ("ResUid[").append (getResUid ()).append ("] ");
        if (full) { str.append ("InvStsUid[").append (getInvStsUid ()).append ("] "); }
        if (full) { str.append ("InvTypUid[").append (getInvTypUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getInvSrcUid ())) { str.append ("InvSrcUid[").append (getInvSrcUid ()).append ("] "); } }
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
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        if (getInvSts () != null) { str.append ("\n").append (indent).append ("InvSts: \n").append (getInvSts ().debug (full, true, indent + "    ")); }
        if (getInvTyp () != null) { str.append ("\n").append (indent).append ("InvTyp: \n").append (getInvTyp ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public CalEvtResImpl newEmptyInstance () { return (CalEvtResImpl) newInstance (); }
    
    @Override public CalEvtResImpl getCopy () {
        return (CalEvtResImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (CalEvtRes _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return CalEvtResImpl.baseUrl (); }
    public static String baseUrl () { return CalEvtResImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { CalEvtResImpl.baseUrl = baseUrl; } 

    @Override public List<CalEvtResFields> getFields () { return Arrays.asList (CalEvtResFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // CalEvtResImpl
