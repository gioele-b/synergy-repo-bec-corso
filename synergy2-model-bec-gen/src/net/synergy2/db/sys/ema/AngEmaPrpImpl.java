package net.synergy2.db.sys.ema;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngEmaPrpImpl extends AngEmaPrp {

    protected AngEmaPrpImpl () { super (); }

    public enum AngEmaPrpFields implements ISField {
        Uid, SrvUid, PrpCod, PrpVal, Tsi, Tsu, Rsi, Rsu;
    } // AngEmaPrpFields
    
    private static String baseUrl = "/rest/sys/ema/AngEmaPrp";


    @Override public String getModelClassName () { return "AngEmaPrpImpl"; }




    
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
        str.append ("SrvUid[").append (getSrvUid ()).append ("] ");
        str.append ("PrpCod[").append (getPrpCod ()).append ("] ");
        if (full) { str.append ("PrpVal[").append (getPrpVal ()).append ("] "); }
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
        if (getSrv () != null) { str.append ("\n").append (indent).append ("Srv: \n").append (getSrv ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngEmaPrpImpl newEmptyInstance () { return (AngEmaPrpImpl) newInstance (); }
    
    @Override public AngEmaPrpImpl getCopy () {
        return (AngEmaPrpImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngEmaPrp _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngEmaPrpImpl.baseUrl (); }
    public static String baseUrl () { return AngEmaPrpImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngEmaPrpImpl.baseUrl = baseUrl; } 

    @Override public List<AngEmaPrpFields> getFields () { return Arrays.asList (AngEmaPrpFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngEmaPrpImpl
