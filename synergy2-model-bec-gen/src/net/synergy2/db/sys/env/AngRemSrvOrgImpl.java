package net.synergy2.db.sys.env;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngRemSrvOrgImpl extends AngRemSrvOrg {

    protected AngRemSrvOrgImpl () { super (); }

    public enum AngRemSrvOrgFields implements ISField {
        Uid, OrgRefUid, RemOrgLnkCod, SrvUid, RemOrgLnkDsc, Tsi, Tsu, Rsi, Rsu;
    } // AngRemSrvOrgFields
    
    private static String baseUrl = "/rest/sys/env/AngRemSrvOrg";


    @Override public String getModelClassName () { return "AngRemSrvOrgImpl"; }




    
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
        str.append ("OrgRefUid[").append (getOrgRefUid ()).append ("] ");
        str.append ("RemOrgLnkCod[").append (getRemOrgLnkCod ()).append ("] ");
        if (full) { str.append ("SrvUid[").append (getSrvUid ()).append ("] "); }
        str.append ("RemOrgLnkDsc[").append (getRemOrgLnkDsc ()).append ("] ");
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
        if (getOrg () != null) { str.append ("\n").append (indent).append ("Org: \n").append (getOrg ().debug (full, true, indent + "    ")); }
        if (getRemSrv () != null) { str.append ("\n").append (indent).append ("RemSrv: \n").append (getRemSrv ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngRemSrvOrgImpl newEmptyInstance () { return (AngRemSrvOrgImpl) newInstance (); }
    
    @Override public AngRemSrvOrgImpl getCopy () {
        return (AngRemSrvOrgImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngRemSrvOrg _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngRemSrvOrgImpl.baseUrl (); }
    public static String baseUrl () { return AngRemSrvOrgImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngRemSrvOrgImpl.baseUrl = baseUrl; } 

    @Override public List<AngRemSrvOrgFields> getFields () { return Arrays.asList (AngRemSrvOrgFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngRemSrvOrgImpl
