package net.synergy2.db.sys.ecm;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysEcmClsAttImpl extends SysEcmClsAtt {

    protected SysEcmClsAttImpl () { super (); }

    public enum SysEcmClsAttFields implements ISField {
        Uid, Asp, Prp, Tsi, Tsu, Rsi, Rsu, ClsQryUid, QryColUid;
    } // SysEcmClsAttFields
    
    private static String baseUrl = "/rest/sys/ecm/SysEcmClsAtt";


    @Override public String getModelClassName () { return "SysEcmClsAttImpl"; }




    
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
        str.append ("Asp[").append (getAsp ()).append ("] ");
        str.append ("Prp[").append (getPrp ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        str.append ("ClsQryUid[").append (getClsQryUid ()).append ("] ");
        if (full) { if (Objects.nonNull (getQryColUid ())) { str.append ("QryColUid[").append (getQryColUid ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getEcmClsQry () != null) { str.append ("\n").append (indent).append ("EcmClsQry: \n").append (getEcmClsQry ().debug (full, true, indent + "    ")); }
        if (getQryCol () != null) { str.append ("\n").append (indent).append ("QryCol: \n").append (getQryCol ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysEcmClsAttImpl newEmptyInstance () { return (SysEcmClsAttImpl) newInstance (); }
    
    @Override public SysEcmClsAttImpl getCopy () {
        return (SysEcmClsAttImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysEcmClsAtt _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysEcmClsAttImpl.baseUrl (); }
    public static String baseUrl () { return SysEcmClsAttImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysEcmClsAttImpl.baseUrl = baseUrl; } 

    @Override public List<SysEcmClsAttFields> getFields () { return Arrays.asList (SysEcmClsAttFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysEcmClsAttImpl
