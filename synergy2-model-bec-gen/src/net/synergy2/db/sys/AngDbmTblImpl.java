package net.synergy2.db.sys;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngDbmTblImpl extends AngDbmTbl {

    protected AngDbmTblImpl () { super (); }

    public enum AngDbmTblFields implements ISField {
        Uid, DbmTblNam, MnyMny, TblShtDsc, TblLngDsc, MdlUid, PrsUid, TblTra, TblPerTra, TblWitPtr, TblPerPtr, TblLog, TblUpf, TblVrt, TblDaoImplCls, TblDatSrc, TblLblUid, TblIco, TblAut, TblAutEnb, TblPerAut, Tsi, Tsu, Rsi, Rsu, WrtPerRol, EnbIns, EnbUpd, EnbDel, SqlTyp;
    } // AngDbmTblFields
    
    private static String baseUrl = "/rest/sys/AngDbmTbl";


    @Override public String getModelClassName () { return "AngDbmTblImpl"; }




    
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
        str.append ("DbmTblNam[").append (getDbmTblNam ()).append ("] ");
        if (full) { str.append ("MnyMny[").append (getMnyMny ()).append ("] "); }
        if (full) { str.append ("TblShtDsc[").append (getTblShtDsc ()).append ("] "); }
        str.append ("TblLngDsc[").append (getTblLngDsc ()).append ("] ");
        if (full) { str.append ("MdlUid[").append (getMdlUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getPrsUid ())) { str.append ("PrsUid[").append (getPrsUid ()).append ("] "); } }
        if (full) { str.append ("TblTra[").append (getTblTra ()).append ("] "); }
        if (full) { str.append ("TblPerTra[").append (getTblPerTra ()).append ("] "); }
        if (full) { str.append ("TblWitPtr[").append (getTblWitPtr ()).append ("] "); }
        if (full) { str.append ("TblPerPtr[").append (getTblPerPtr ()).append ("] "); }
        if (full) { str.append ("TblLog[").append (getTblLog ()).append ("] "); }
        if (full) { str.append ("TblUpf[").append (getTblUpf ()).append ("] "); }
        if (full) { str.append ("TblVrt[").append (getTblVrt ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTblDaoImplCls ())) { str.append ("TblDaoImplCls[").append (getTblDaoImplCls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTblDatSrc ())) { str.append ("TblDatSrc[").append (getTblDatSrc ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTblLblUid ())) { str.append ("TblLblUid[").append (getTblLblUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTblIco ())) { str.append ("TblIco[").append (getTblIco ()).append ("] "); } }
        if (full) { str.append ("TblAut[").append (getTblAut ()).append ("] "); }
        if (full) { str.append ("TblAutEnb[").append (getTblAutEnb ()).append ("] "); }
        if (full) { str.append ("TblPerAut[").append (getTblPerAut ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { str.append ("WrtPerRol[").append (getWrtPerRol ()).append ("] "); }
        if (full) { str.append ("EnbIns[").append (getEnbIns ()).append ("] "); }
        if (full) { str.append ("EnbUpd[").append (getEnbUpd ()).append ("] "); }
        if (full) { str.append ("EnbDel[").append (getEnbDel ()).append ("] "); }
        if (full) { if (Objects.nonNull (getSqlTyp ())) { str.append ("SqlTyp[").append (getSqlTyp ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getColLst () != null) { str.append ("\n").append (indent).append ("ColLst (").append (getColLst ().size ()).append ("):"); for (var model : getColLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getChdRfkLst () != null) { str.append ("\n").append (indent).append ("ChdRfkLst (").append (getChdRfkLst ().size ()).append ("):"); for (var model : getChdRfkLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getPrtRfkLst () != null) { str.append ("\n").append (indent).append ("PrtRfkLst (").append (getPrtRfkLst ().size ()).append ("):"); for (var model : getPrtRfkLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysClsRefCfg () != null) { str.append ("\n").append (indent).append ("SysClsRefCfg : "); str.append ("\n").append (getSysClsRefCfg ().debug (full, true, indent + "    ")); } 
        if (getCodRulTblLst () != null) { str.append ("\n").append (indent).append ("CodRulTblLst (").append (getCodRulTblLst ().size ()).append ("):"); for (var model : getCodRulTblLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDocCtxLst () != null) { str.append ("\n").append (indent).append ("DocCtxLst (").append (getDocCtxLst ().size ()).append ("):"); for (var model : getDocCtxLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDatSetLst () != null) { str.append ("\n").append (indent).append ("DatSetLst (").append (getDatSetLst ().size ()).append ("):"); for (var model : getDatSetLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSrcPrpLst () != null) { str.append ("\n").append (indent).append ("SrcPrpLst (").append (getSrcPrpLst ().size ()).append ("):"); for (var model : getSrcPrpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEtyLst () != null) { str.append ("\n").append (indent).append ("EtyLst (").append (getEtyLst ().size ()).append ("):"); for (var model : getEtyLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEtyAttCtxLst () != null) { str.append ("\n").append (indent).append ("EtyAttCtxLst (").append (getEtyAttCtxLst ().size ()).append ("):"); for (var model : getEtyAttCtxLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEtyComCtxLst () != null) { str.append ("\n").append (indent).append ("EtyComCtxLst (").append (getEtyComCtxLst ().size ()).append ("):"); for (var model : getEtyComCtxLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLogLst () != null) { str.append ("\n").append (indent).append ("LogLst (").append (getLogLst ().size ()).append ("):"); for (var model : getLogLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getNotMncLst () != null) { str.append ("\n").append (indent).append ("NotMncLst (").append (getNotMncLst ().size ()).append ("):"); for (var model : getNotMncLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRolCudLst () != null) { str.append ("\n").append (indent).append ("RolCudLst (").append (getRolCudLst ().size ()).append ("):"); for (var model : getRolCudLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysReaRulRolLst () != null) { str.append ("\n").append (indent).append ("SysReaRulRolLst (").append (getSysReaRulRolLst ().size ()).append ("):"); for (var model : getSysReaRulRolLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQryLst () != null) { str.append ("\n").append (indent).append ("QryLst (").append (getQryLst ().size ()).append ("):"); for (var model : getQryLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepMdlLst () != null) { str.append ("\n").append (indent).append ("RepMdlLst (").append (getRepMdlLst ().size ()).append ("):"); for (var model : getRepMdlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUpfLst () != null) { str.append ("\n").append (indent).append ("UpfLst (").append (getUpfLst ().size ()).append ("):"); for (var model : getUpfLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUpfIstLst () != null) { str.append ("\n").append (indent).append ("UpfIstLst (").append (getUpfIstLst ().size ()).append ("):"); for (var model : getUpfIstLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getMdlRef () != null) { str.append ("\n").append (indent).append ("MdlRef: \n").append (getMdlRef ().debug (full, true, indent + "    ")); }
        if (getPrs () != null) { str.append ("\n").append (indent).append ("Prs: \n").append (getPrs ().debug (full, true, indent + "    ")); }
        if (getLbl () != null) { str.append ("\n").append (indent).append ("Lbl: \n").append (getLbl ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngDbmTblImpl newEmptyInstance () { return (AngDbmTblImpl) newInstance (); }
    
    @Override public AngDbmTblImpl getCopy () {
        return (AngDbmTblImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngDbmTbl _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngDbmTblImpl.baseUrl (); }
    public static String baseUrl () { return AngDbmTblImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngDbmTblImpl.baseUrl = baseUrl; } 

    @Override public List<AngDbmTblFields> getFields () { return Arrays.asList (AngDbmTblFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngDbmTblImpl
