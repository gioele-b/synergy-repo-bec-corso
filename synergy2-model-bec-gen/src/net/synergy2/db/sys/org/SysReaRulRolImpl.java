package net.synergy2.db.sys.org;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysReaRulRolImpl extends SysReaRulRol {

    protected SysReaRulRolImpl () { super (); }

    public enum SysReaRulRolFields implements ISField {
        Uid, TblUid, RolUid, RecUid, Tsi, Tsu, Rsi, Rsu;
    } // SysReaRulRolFields
    
    private static String baseUrl = "/rest/sys/org/SysReaRulRol";


    @Override public String getModelClassName () { return "SysReaRulRolImpl"; }




    
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
        str.append ("RecUid[").append (getRecUid ()).append ("] ");
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
        if (getAngCurRec () != null) { str.append ("\n").append (indent).append ("AngCurRec: \n").append (getAngCurRec ().debug (full, true, indent + "    ")); }
        if (getAngPayMetRec () != null) { str.append ("\n").append (indent).append ("AngPayMetRec: \n").append (getAngPayMetRec ().debug (full, true, indent + "    ")); }
        if (getAngShpMetRec () != null) { str.append ("\n").append (indent).append ("AngShpMetRec: \n").append (getAngShpMetRec ().debug (full, true, indent + "    ")); }
        if (getAngTrpMetRec () != null) { str.append ("\n").append (indent).append ("AngTrpMetRec: \n").append (getAngTrpMetRec ().debug (full, true, indent + "    ")); }
        if (getAngPckRec () != null) { str.append ("\n").append (indent).append ("AngPckRec: \n").append (getAngPckRec ().debug (full, true, indent + "    ")); }
        if (getAngPayTypRec () != null) { str.append ("\n").append (indent).append ("AngPayTypRec: \n").append (getAngPayTypRec ().debug (full, true, indent + "    ")); }
        if (getAngVatRec () != null) { str.append ("\n").append (indent).append ("AngVatRec: \n").append (getAngVatRec ().debug (full, true, indent + "    ")); }
        if (getAngItmCls001Rec () != null) { str.append ("\n").append (indent).append ("AngItmCls001Rec: \n").append (getAngItmCls001Rec ().debug (full, true, indent + "    ")); }
        if (getAngItmCls002Rec () != null) { str.append ("\n").append (indent).append ("AngItmCls002Rec: \n").append (getAngItmCls002Rec ().debug (full, true, indent + "    ")); }
        if (getAngItmCls003Rec () != null) { str.append ("\n").append (indent).append ("AngItmCls003Rec: \n").append (getAngItmCls003Rec ().debug (full, true, indent + "    ")); }
        if (getAngItmCls004Rec () != null) { str.append ("\n").append (indent).append ("AngItmCls004Rec: \n").append (getAngItmCls004Rec ().debug (full, true, indent + "    ")); }
        if (getAngItmCls005Rec () != null) { str.append ("\n").append (indent).append ("AngItmCls005Rec: \n").append (getAngItmCls005Rec ().debug (full, true, indent + "    ")); }
        if (getAngItmCls006Rec () != null) { str.append ("\n").append (indent).append ("AngItmCls006Rec: \n").append (getAngItmCls006Rec ().debug (full, true, indent + "    ")); }
        if (getAngItmCls007Rec () != null) { str.append ("\n").append (indent).append ("AngItmCls007Rec: \n").append (getAngItmCls007Rec ().debug (full, true, indent + "    ")); }
        if (getAngItmCls008Rec () != null) { str.append ("\n").append (indent).append ("AngItmCls008Rec: \n").append (getAngItmCls008Rec ().debug (full, true, indent + "    ")); }
        if (getAngItmCls009Rec () != null) { str.append ("\n").append (indent).append ("AngItmCls009Rec: \n").append (getAngItmCls009Rec ().debug (full, true, indent + "    ")); }
        if (getAngItmCls010Rec () != null) { str.append ("\n").append (indent).append ("AngItmCls010Rec: \n").append (getAngItmCls010Rec ().debug (full, true, indent + "    ")); }
        if (getAngItmCls011Rec () != null) { str.append ("\n").append (indent).append ("AngItmCls011Rec: \n").append (getAngItmCls011Rec ().debug (full, true, indent + "    ")); }
        if (getAngItmCls012Rec () != null) { str.append ("\n").append (indent).append ("AngItmCls012Rec: \n").append (getAngItmCls012Rec ().debug (full, true, indent + "    ")); }
        if (getAngItmCls013Rec () != null) { str.append ("\n").append (indent).append ("AngItmCls013Rec: \n").append (getAngItmCls013Rec ().debug (full, true, indent + "    ")); }
        if (getAngItmCls014Rec () != null) { str.append ("\n").append (indent).append ("AngItmCls014Rec: \n").append (getAngItmCls014Rec ().debug (full, true, indent + "    ")); }
        if (getAngItmCls015Rec () != null) { str.append ("\n").append (indent).append ("AngItmCls015Rec: \n").append (getAngItmCls015Rec ().debug (full, true, indent + "    ")); }
        if (getAngItmClsMul001Rec () != null) { str.append ("\n").append (indent).append ("AngItmClsMul001Rec: \n").append (getAngItmClsMul001Rec ().debug (full, true, indent + "    ")); }
        if (getAngItmClsMul002Rec () != null) { str.append ("\n").append (indent).append ("AngItmClsMul002Rec: \n").append (getAngItmClsMul002Rec ().debug (full, true, indent + "    ")); }
        if (getAngItmClsMul003Rec () != null) { str.append ("\n").append (indent).append ("AngItmClsMul003Rec: \n").append (getAngItmClsMul003Rec ().debug (full, true, indent + "    ")); }
        if (getAngItmClsMul004Rec () != null) { str.append ("\n").append (indent).append ("AngItmClsMul004Rec: \n").append (getAngItmClsMul004Rec ().debug (full, true, indent + "    ")); }
        if (getAngItmClsMul005Rec () != null) { str.append ("\n").append (indent).append ("AngItmClsMul005Rec: \n").append (getAngItmClsMul005Rec ().debug (full, true, indent + "    ")); }
        if (getAngAddTypRec () != null) { str.append ("\n").append (indent).append ("AngAddTypRec: \n").append (getAngAddTypRec ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysReaRulRolImpl newEmptyInstance () { return (SysReaRulRolImpl) newInstance (); }
    
    @Override public SysReaRulRolImpl getCopy () {
        return (SysReaRulRolImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysReaRulRol _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysReaRulRolImpl.baseUrl (); }
    public static String baseUrl () { return SysReaRulRolImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysReaRulRolImpl.baseUrl = baseUrl; } 

    @Override public List<SysReaRulRolFields> getFields () { return Arrays.asList (SysReaRulRolFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysReaRulRolImpl
