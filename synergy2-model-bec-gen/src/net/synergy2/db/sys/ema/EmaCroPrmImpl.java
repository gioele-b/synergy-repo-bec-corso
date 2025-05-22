package net.synergy2.db.sys.ema;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class EmaCroPrmImpl extends EmaCroPrm {

    protected EmaCroPrmImpl () { super (); }

    public enum EmaCroPrmFields implements ISField {
        Uid, DatSetPrmUid, EmaCroUid, PrmVal, Tsi, Tsu, Rsi, Rsu;
    } // EmaCroPrmFields
    
    private static String baseUrl = "/rest/sys/ema/EmaCroPrm";


    @Override public String getModelClassName () { return "EmaCroPrmImpl"; }




    
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
        if (full) { str.append ("DatSetPrmUid[").append (getDatSetPrmUid ()).append ("] "); }
        if (full) { str.append ("EmaCroUid[").append (getEmaCroUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getPrmVal ())) { str.append ("PrmVal[").append (getPrmVal ()).append ("] "); } }
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
        if (getEmaCro () != null) { str.append ("\n").append (indent).append ("EmaCro: \n").append (getEmaCro ().debug (full, true, indent + "    ")); }
        if (getDatSetPrm () != null) { str.append ("\n").append (indent).append ("DatSetPrm: \n").append (getDatSetPrm ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public EmaCroPrmImpl newEmptyInstance () { return (EmaCroPrmImpl) newInstance (); }
    
    @Override public EmaCroPrmImpl getCopy () {
        return (EmaCroPrmImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (EmaCroPrm _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return EmaCroPrmImpl.baseUrl (); }
    public static String baseUrl () { return EmaCroPrmImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { EmaCroPrmImpl.baseUrl = baseUrl; } 

    @Override public List<EmaCroPrmFields> getFields () { return Arrays.asList (EmaCroPrmFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // EmaCroPrmImpl
