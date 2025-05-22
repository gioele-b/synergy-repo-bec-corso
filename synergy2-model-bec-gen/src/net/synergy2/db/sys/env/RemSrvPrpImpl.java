package net.synergy2.db.sys.env;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class RemSrvPrpImpl extends RemSrvPrp {

    protected RemSrvPrpImpl () { super (); }

    public enum RemSrvPrpFields implements ISField {
        Uid, SrvUid, PrpCod, PrpVal, PrpDsc, Tsi, Tsu, Rsi, Rsu, FlgPrv;
    } // RemSrvPrpFields
    
    private static String baseUrl = "/rest/sys/env/RemSrvPrp";


    @Override public String getModelClassName () { return "RemSrvPrpImpl"; }




    
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
        str.append ("PrpDsc[").append (getPrpDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { str.append ("FlgPrv[").append (getFlgPrv ()).append ("] "); }
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

    @Override public RemSrvPrpImpl newEmptyInstance () { return (RemSrvPrpImpl) newInstance (); }
    
    @Override public RemSrvPrpImpl getCopy () {
        return (RemSrvPrpImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (RemSrvPrp _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return RemSrvPrpImpl.baseUrl (); }
    public static String baseUrl () { return RemSrvPrpImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { RemSrvPrpImpl.baseUrl = baseUrl; } 

    @Override public List<RemSrvPrpFields> getFields () { return Arrays.asList (RemSrvPrpFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // RemSrvPrpImpl
