package net.synergy2.db.sys.env;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class AngRemSrvImpl extends AngRemSrv {

    protected AngRemSrvImpl () { super (); }

    public enum AngRemSrvFields implements ISField {
        Uid, SrvCod, SrvDsc, SrvTypUid, FlgEnb, SrvAdd, SrvPrt, SrvUsr, SrvPwd, SrvUrl, SrvDrv, SrvDom, FlgPrs, FlgSsl, EtyUid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, SrvDatSrcCls, SrvSrcUid;
    } // AngRemSrvFields
    
    private static String baseUrl = "/rest/sys/env/AngRemSrv";


    @Override public String getModelClassName () { return "AngRemSrvImpl"; }




    
    @Override public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        switch (fieldName) {
            case SAlias.ENTITY -> setEntity ((AngEty) value); 

            default -> {
                if (!settedSuper) { throw new SQueryException ("No reference specification found for field [" + fieldName + "]."); }
            }
        } // switch
        return true;
    } // set
    
    @Override public String debug (boolean full, boolean cascade, String indent) {
        StringBuilder str = new StringBuilder (indent).append (getModelClassName ()).append (" = {");
        str.append ("Uid[").append (getUid ()).append ("] ");
        str.append ("SrvCod[").append (getSrvCod ()).append ("] ");
        str.append ("SrvDsc[").append (getSrvDsc ()).append ("] ");
        if (full) { str.append ("SrvTypUid[").append (getSrvTypUid ()).append ("] "); }
        if (full) { str.append ("FlgEnb[").append (getFlgEnb ()).append ("] "); }
        if (full) { if (Objects.nonNull (getSrvAdd ())) { str.append ("SrvAdd[").append (getSrvAdd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getSrvPrt ())) { str.append ("SrvPrt[").append (getSrvPrt ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getSrvUsr ())) { str.append ("SrvUsr[").append (getSrvUsr ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getSrvPwd ())) { str.append ("SrvPwd[").append (getSrvPwd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getSrvUrl ())) { str.append ("SrvUrl[").append (getSrvUrl ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getSrvDrv ())) { str.append ("SrvDrv[").append (getSrvDrv ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getSrvDom ())) { str.append ("SrvDom[").append (getSrvDom ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlgPrs ())) { str.append ("FlgPrs[").append (getFlgPrs ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlgSsl ())) { str.append ("FlgSsl[").append (getFlgSsl ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getSrvDatSrcCls ())) { str.append ("SrvDatSrcCls[").append (getSrvDatSrcCls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getSrvSrcUid ())) { str.append ("SrvSrcUid[").append (getSrvSrcUid ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getLgnRulLst () != null) { str.append ("\n").append (indent).append ("LgnRulLst (").append (getLgnRulLst ().size ()).append ("):"); for (var model : getLgnRulLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSrvPrpLst () != null) { str.append ("\n").append (indent).append ("SrvPrpLst (").append (getSrvPrpLst ().size ()).append ("):"); for (var model : getSrvPrpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getOrgLst () != null) { str.append ("\n").append (indent).append ("OrgLst (").append (getOrgLst ().size ()).append ("):"); for (var model : getOrgLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLstRemLst () != null) { str.append ("\n").append (indent).append ("LstRemLst (").append (getLstRemLst ().size ()).append ("):"); for (var model : getLstRemLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getScmLst () != null) { str.append ("\n").append (indent).append ("ScmLst (").append (getScmLst ().size ()).append ("):"); for (var model : getScmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSrvTyp () != null) { str.append ("\n").append (indent).append ("SrvTyp: \n").append (getSrvTyp ().debug (full, true, indent + "    ")); }
        if (getSrvSrc () != null) { str.append ("\n").append (indent).append ("SrvSrc: \n").append (getSrvSrc ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngRemSrvImpl newEmptyInstance () { return (AngRemSrvImpl) newInstance (); }
    
    @Override public AngRemSrvImpl getCopy () {
        return (AngRemSrvImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngRemSrv _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngRemSrvImpl.baseUrl (); }
    public static String baseUrl () { return AngRemSrvImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngRemSrvImpl.baseUrl = baseUrl; } 

    @Override public List<AngRemSrvFields> getFields () { return Arrays.asList (AngRemSrvFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngRemSrvImpl
