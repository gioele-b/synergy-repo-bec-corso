package net.synergy2.db.sys.ema;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class EmaLogImpl extends EmaLog {

    protected EmaLogImpl () { super (); }

    public enum EmaLogFields implements ISField {
        Uid, EmaSnd, EmaRcv, EmaSub, EmaSts, Ema, EmaLogMsg, Tsi, Tsu, Rsi, Rsu;
    } // EmaLogFields
    
    private static String baseUrl = "/rest/sys/ema/EmaLog";


    @Override public String getModelClassName () { return "EmaLogImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public EmaLogImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        if (full) { str.append ("EmaSnd[").append (getEmaSnd ()).append ("] "); }
        if (full) { str.append ("EmaRcv[").append (getEmaRcv ()).append ("] "); }
        if (full) { str.append ("EmaSub[").append (getEmaSub ()).append ("] "); }
        if (full) { str.append ("EmaSts[").append (getEmaSts ()).append ("] "); }
        if (full) { str.append ("Ema[").append (getEma ()).append ("] "); }
        if (full) { if (Objects.nonNull (getEmaLogMsg ())) { str.append ("EmaLogMsg[").append (getEmaLogMsg ()).append ("] "); } }
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
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public EmaLogImpl newEmptyInstance () { return (EmaLogImpl) newInstance (); }
    
    @Override public EmaLogImpl getCopy () {
        var toReturn = (EmaLogImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (EmaLog _other, boolean checkUid, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return EmaLogImpl.baseUrl (); }
    public static String baseUrl () { return EmaLogImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { EmaLogImpl.baseUrl = baseUrl; } 

    @Override public List<EmaLogFields> getFields () { return Arrays.asList (EmaLogFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // EmaLogImpl
