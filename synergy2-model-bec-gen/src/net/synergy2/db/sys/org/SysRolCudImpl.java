package net.synergy2.db.sys.org;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysRolCudImpl extends SysRolCud {

    protected SysRolCudImpl () { super (); }

    public enum SysRolCudFields implements ISField {
        Uid, TblUid, RolUid, EnbIns, EnbUpd, EnbDel, Tsi, Tsu, Rsi, Rsu;
    } // SysRolCudFields
    
    private static String baseUrl = "/rest/sys/org/SysRolCud";


    @Override public String getModelClassName () { return "SysRolCudImpl"; }




    
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
        str.append ("TblUid[").append (getTblUid ()).append ("] ");
        str.append ("RolUid[").append (getRolUid ()).append ("] ");
        if (full) { str.append ("EnbIns[").append (getEnbIns ()).append ("] "); }
        if (full) { str.append ("EnbUpd[").append (getEnbUpd ()).append ("] "); }
        if (full) { str.append ("EnbDel[").append (getEnbDel ()).append ("] "); }
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
        if (getTbl () != null) { str.append ("\n").append (indent).append ("Tbl: \n").append (getTbl ().debug (full, true, indent + "    ")); }
        if (getRol () != null) { str.append ("\n").append (indent).append ("Rol: \n").append (getRol ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysRolCudImpl newEmptyInstance () { return (SysRolCudImpl) newInstance (); }
    
    @Override public SysRolCudImpl getCopy () {
        return (SysRolCudImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysRolCud _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysRolCudImpl.baseUrl (); }
    public static String baseUrl () { return SysRolCudImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysRolCudImpl.baseUrl = baseUrl; } 

    @Override public List<SysRolCudFields> getFields () { return Arrays.asList (SysRolCudFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysRolCudImpl
