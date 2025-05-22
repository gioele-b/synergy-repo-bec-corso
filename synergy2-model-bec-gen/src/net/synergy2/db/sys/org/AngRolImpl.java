package net.synergy2.db.sys.org;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngRolImpl extends AngRol {

    protected AngRolImpl () { super (); }

    public enum AngRolFields implements ISField {
        Uid, RolSrt, RolCod, RolDsc, RolRefUid, RolDep, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // AngRolFields
    
    private static String baseUrl = "/rest/sys/org/AngRol";


    @Override public String getModelClassName () { return "AngRolImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngRolImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        if (full) { str.append ("RolSrt[").append (getRolSrt ()).append ("] "); }
        str.append ("RolCod[").append (getRolCod ()).append ("] ");
        str.append ("RolDsc[").append (getRolDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getRolRefUid ())) { str.append ("RolRefUid[").append (getRolRefUid ()).append ("] "); } }
        if (full) { str.append ("RolDep[").append (getRolDep ()).append ("] "); }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
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
        if (getAppHomLst () != null) { str.append ("\n").append (indent).append ("AppHomLst (").append (getAppHomLst ().size ()).append ("):"); for (var model : getAppHomLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRolRefLst () != null) { str.append ("\n").append (indent).append ("RolRefLst (").append (getRolRefLst ().size ()).append ("):"); for (var model : getRolRefLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getResLst () != null) { str.append ("\n").append (indent).append ("ResLst (").append (getResLst ().size ()).append ("):"); for (var model : getResLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getTblCudLst () != null) { str.append ("\n").append (indent).append ("TblCudLst (").append (getTblCudLst ().size ()).append ("):"); for (var model : getTblCudLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysReaRulRolLst () != null) { str.append ("\n").append (indent).append ("SysReaRulRolLst (").append (getSysReaRulRolLst ().size ()).append ("):"); for (var model : getSysReaRulRolLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getFldRolLst () != null) { str.append ("\n").append (indent).append ("FldRolLst (").append (getFldRolLst ().size ()).append ("):"); for (var model : getFldRolLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRol () != null) { str.append ("\n").append (indent).append ("Rol: \n").append (getRol ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngRolImpl newEmptyInstance () { return (AngRolImpl) newInstance (); }
    
    @Override public AngRolImpl getCopy () {
        var toReturn = (AngRolImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngRol _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngRolImpl.baseUrl (); }
    public static String baseUrl () { return AngRolImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngRolImpl.baseUrl = baseUrl; } 

    @Override public List<AngRolFields> getFields () { return Arrays.asList (AngRolFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngRolImpl
