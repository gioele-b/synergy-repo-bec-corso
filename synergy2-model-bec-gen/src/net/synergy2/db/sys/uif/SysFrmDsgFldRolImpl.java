package net.synergy2.db.sys.uif;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysFrmDsgFldRolImpl extends SysFrmDsgFldRol {

    protected SysFrmDsgFldRolImpl () { super (); }

    public enum SysFrmDsgFldRolFields implements ISField {
        Uid, FldHid, FldReaOnl, FldReq, InhFldHid, InhFldReaOnl, InhFldReq, RolUid, FldUid, Tsi, Tsu, Rsi, Rsu;
    } // SysFrmDsgFldRolFields
    
    private static String baseUrl = "/rest/sys/uif/SysFrmDsgFldRol";


    @Override public String getModelClassName () { return "SysFrmDsgFldRolImpl"; }




    
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
        if (full) { if (Objects.nonNull (getFldHid ())) { str.append ("FldHid[").append (getFldHid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFldReaOnl ())) { str.append ("FldReaOnl[").append (getFldReaOnl ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFldReq ())) { str.append ("FldReq[").append (getFldReq ()).append ("] "); } }
        if (full) { str.append ("InhFldHid[").append (getInhFldHid ()).append ("] "); }
        if (full) { str.append ("InhFldReaOnl[").append (getInhFldReaOnl ()).append ("] "); }
        if (full) { str.append ("InhFldReq[").append (getInhFldReq ()).append ("] "); }
        if (Objects.nonNull (getRolUid ())) { str.append ("RolUid[").append (getRolUid ()).append ("] "); }
        if (Objects.nonNull (getFldUid ())) { str.append ("FldUid[").append (getFldUid ()).append ("] "); }
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
        if (getFld () != null) { str.append ("\n").append (indent).append ("Fld: \n").append (getFld ().debug (full, true, indent + "    ")); }
        if (getRol () != null) { str.append ("\n").append (indent).append ("Rol: \n").append (getRol ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysFrmDsgFldRolImpl newEmptyInstance () { return (SysFrmDsgFldRolImpl) newInstance (); }
    
    @Override public SysFrmDsgFldRolImpl getCopy () {
        return (SysFrmDsgFldRolImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysFrmDsgFldRol _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysFrmDsgFldRolImpl.baseUrl (); }
    public static String baseUrl () { return SysFrmDsgFldRolImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysFrmDsgFldRolImpl.baseUrl = baseUrl; } 

    @Override public List<SysFrmDsgFldRolFields> getFields () { return Arrays.asList (SysFrmDsgFldRolFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysFrmDsgFldRolImpl
