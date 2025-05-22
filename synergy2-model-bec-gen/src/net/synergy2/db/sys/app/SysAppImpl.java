package net.synergy2.db.sys.app;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class SysAppImpl extends SysApp {

    protected SysAppImpl () { super (); }

    public enum SysAppFields implements ISField {
        Uid, AppCod, AppDsc, AppCtx, GrpUid, StrMdlWeb, AppIco, AppCol, AppEnb, ThmUid, EtyUid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // SysAppFields
    
    private static String baseUrl = "/rest/sys/app/SysApp";


    @Override public String getModelClassName () { return "SysAppImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public SysAppImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("AppCod[").append (getAppCod ()).append ("] ");
        str.append ("AppDsc[").append (getAppDsc ()).append ("] ");
        if (full) { str.append ("AppCtx[").append (getAppCtx ()).append ("] "); }
        if (full) { if (Objects.nonNull (getGrpUid ())) { str.append ("GrpUid[").append (getGrpUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStrMdlWeb ())) { str.append ("StrMdlWeb[").append (getStrMdlWeb ()).append ("] "); } }
        if (full) { str.append ("AppIco[").append (getAppIco ()).append ("] "); }
        if (full) { str.append ("AppCol[").append (getAppCol ()).append ("] "); }
        if (full) { str.append ("AppEnb[").append (getAppEnb ()).append ("] "); }
        if (full) { str.append ("ThmUid[").append (getThmUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
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
        if (getCtxLst () != null) { str.append ("\n").append (indent).append ("CtxLst (").append (getCtxLst ().size ()).append ("):"); for (var model : getCtxLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getPrmLst () != null) { str.append ("\n").append (indent).append ("PrmLst (").append (getPrmLst ().size ()).append ("):"); for (var model : getPrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRolLst () != null) { str.append ("\n").append (indent).append ("RolLst (").append (getRolLst ().size ()).append ("):"); for (var model : getRolLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAppHomLst () != null) { str.append ("\n").append (indent).append ("AppHomLst (").append (getAppHomLst ().size ()).append ("):"); for (var model : getAppHomLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getNotTypCatLst () != null) { str.append ("\n").append (indent).append ("NotTypCatLst (").append (getNotTypCatLst ().size ()).append ("):"); for (var model : getNotTypCatLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getMnuLst () != null) { str.append ("\n").append (indent).append ("MnuLst (").append (getMnuLst ().size ()).append ("):"); for (var model : getMnuLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getFrmDsgLst () != null) { str.append ("\n").append (indent).append ("FrmDsgLst (").append (getFrmDsgLst ().size ()).append ("):"); for (var model : getFrmDsgLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDefMnuLst () != null) { str.append ("\n").append (indent).append ("DefMnuLst (").append (getDefMnuLst ().size ()).append ("):"); for (var model : getDefMnuLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getMnuFavLst () != null) { str.append ("\n").append (indent).append ("MnuFavLst (").append (getMnuFavLst ().size ()).append ("):"); for (var model : getMnuFavLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWksTypLst () != null) { str.append ("\n").append (indent).append ("WksTypLst (").append (getWksTypLst ().size ()).append ("):"); for (var model : getWksTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWksBtnActLst () != null) { str.append ("\n").append (indent).append ("WksBtnActLst (").append (getWksBtnActLst ().size ()).append ("):"); for (var model : getWksBtnActLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getGrp () != null) { str.append ("\n").append (indent).append ("Grp: \n").append (getGrp ().debug (full, true, indent + "    ")); }
        if (getThm () != null) { str.append ("\n").append (indent).append ("Thm: \n").append (getThm ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysAppImpl newEmptyInstance () { return (SysAppImpl) newInstance (); }
    
    @Override public SysAppImpl getCopy () {
        var toReturn = (SysAppImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (SysApp _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return SysAppImpl.baseUrl (); }
    public static String baseUrl () { return SysAppImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysAppImpl.baseUrl = baseUrl; } 

    @Override public List<SysAppFields> getFields () { return Arrays.asList (SysAppFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysAppImpl
