package net.synergy2.db.sys.qry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.bec.flt.AngBecFlt;
import net.synergy2.db.bec.flt.AngBecFltImpl;
import net.synergy2.db.dvz.rep.DvzRepQryAgg;
import net.synergy2.db.dvz.rep.DvzRepQryAggImpl;
import net.synergy2.db.dvz.rep.DvzRepQryDsgSty;
import net.synergy2.db.dvz.rep.DvzRepQryDsgStyImpl;
import net.synergy2.db.dvz.rep.DvzRepQryFmt;
import net.synergy2.db.dvz.rep.DvzRepQryFmtImpl;

public class AngQryDbmTblColImpl extends AngQryDbmTblCol {

    protected AngQryDbmTblColImpl () { super (); }

    public enum AngQryDbmTblColFields implements ISField {
        Uid, QryUid, DbmTblColUid, TblAls, ClcColUid, ColSrt, ColFulTxtSrc, LblUid, ClrTblAls, ClrDbmColNam, DscTblAls, DscDbmColNam, MulValTblNam, MulValColNam, ClrBkdTblAls, ClrBkdDbmColNam, Tsi, Tsu, Rsi, Rsu, ClrClcUid, DscClcUid, ClrBkdClcUid, ScmFldUid, ClrFldUid, DscFldUid, ClrBkdFldUid, ColHid, AutGrp;
    } // AngQryDbmTblColFields
    
    private static String baseUrl = "/rest/sys/qry/AngQryDbmTblCol";


    @Override public String getModelClassName () { return "AngQryDbmTblColImpl"; }



    private List<AngBecFlt> _BecFltLst = null;
    public List<AngBecFlt> getBecFltLst () { return this._BecFltLst; }
    public AngQryDbmTblCol setBecFltLst (List<AngBecFlt> obj) { this._BecFltLst = obj; return this; }
    public AngQryDbmTblCol addBecFltLst (AngBecFlt obj) {
        if (_BecFltLst == null) { _BecFltLst = new ArrayList<> (); }
        _BecFltLst.add (obj);
        return this;
    } // addBecFltLst

    private List<DvzRepQryAgg> _RepQryAggLst = null;
    public List<DvzRepQryAgg> getRepQryAggLst () { return this._RepQryAggLst; }
    public AngQryDbmTblCol setRepQryAggLst (List<DvzRepQryAgg> obj) { this._RepQryAggLst = obj; return this; }
    public AngQryDbmTblCol addRepQryAggLst (DvzRepQryAgg obj) {
        if (_RepQryAggLst == null) { _RepQryAggLst = new ArrayList<> (); }
        _RepQryAggLst.add (obj);
        return this;
    } // addRepQryAggLst

    private List<DvzRepQryDsgSty> _RepStyLst = null;
    public List<DvzRepQryDsgSty> getRepStyLst () { return this._RepStyLst; }
    public AngQryDbmTblCol setRepStyLst (List<DvzRepQryDsgSty> obj) { this._RepStyLst = obj; return this; }
    public AngQryDbmTblCol addRepStyLst (DvzRepQryDsgSty obj) {
        if (_RepStyLst == null) { _RepStyLst = new ArrayList<> (); }
        _RepStyLst.add (obj);
        return this;
    } // addRepStyLst

    private List<DvzRepQryFmt> _RepQryFmtLst = null;
    public List<DvzRepQryFmt> getRepQryFmtLst () { return this._RepQryFmtLst; }
    public AngQryDbmTblCol setRepQryFmtLst (List<DvzRepQryFmt> obj) { this._RepQryFmtLst = obj; return this; }
    public AngQryDbmTblCol addRepQryFmtLst (DvzRepQryFmt obj) {
        if (_RepQryFmtLst == null) { _RepQryFmtLst = new ArrayList<> (); }
        _RepQryFmtLst.add (obj);
        return this;
    } // addRepQryFmtLst


    
    @Override public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        switch (fieldName) {
            case "BecFltLst" -> addBecFltLst ((AngBecFltImpl) value); 
            case "RepQryAggLst" -> addRepQryAggLst ((DvzRepQryAggImpl) value); 
            case "RepStyLst" -> addRepStyLst ((DvzRepQryDsgStyImpl) value); 
            case "RepQryFmtLst" -> addRepQryFmtLst ((DvzRepQryFmtImpl) value); 

            default -> {
                if (!settedSuper) { throw new SQueryException ("No reference specification found for field [" + fieldName + "]."); }
            }
        } // switch
        return true;
    } // set
    
    @Override public String debug (boolean full, boolean cascade, String indent) {
        StringBuilder str = new StringBuilder (indent).append (getModelClassName ()).append (" = {");
        str.append ("Uid[").append (getUid ()).append ("] ");
        if (full) { str.append ("QryUid[").append (getQryUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getDbmTblColUid ())) { str.append ("DbmTblColUid[").append (getDbmTblColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTblAls ())) { str.append ("TblAls[").append (getTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClcColUid ())) { str.append ("ClcColUid[").append (getClcColUid ()).append ("] "); } }
        if (full) { str.append ("ColSrt[").append (getColSrt ()).append ("] "); }
        if (full) { str.append ("ColFulTxtSrc[").append (getColFulTxtSrc ()).append ("] "); }
        if (full) { if (Objects.nonNull (getLblUid ())) { str.append ("LblUid[").append (getLblUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClrTblAls ())) { str.append ("ClrTblAls[").append (getClrTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClrDbmColNam ())) { str.append ("ClrDbmColNam[").append (getClrDbmColNam ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDscTblAls ())) { str.append ("DscTblAls[").append (getDscTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDscDbmColNam ())) { str.append ("DscDbmColNam[").append (getDscDbmColNam ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getMulValTblNam ())) { str.append ("MulValTblNam[").append (getMulValTblNam ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getMulValColNam ())) { str.append ("MulValColNam[").append (getMulValColNam ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClrBkdTblAls ())) { str.append ("ClrBkdTblAls[").append (getClrBkdTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClrBkdDbmColNam ())) { str.append ("ClrBkdDbmColNam[").append (getClrBkdDbmColNam ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClrClcUid ())) { str.append ("ClrClcUid[").append (getClrClcUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDscClcUid ())) { str.append ("DscClcUid[").append (getDscClcUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClrBkdClcUid ())) { str.append ("ClrBkdClcUid[").append (getClrBkdClcUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getScmFldUid ())) { str.append ("ScmFldUid[").append (getScmFldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClrFldUid ())) { str.append ("ClrFldUid[").append (getClrFldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDscFldUid ())) { str.append ("DscFldUid[").append (getDscFldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClrBkdFldUid ())) { str.append ("ClrBkdFldUid[").append (getClrBkdFldUid ()).append ("] "); } }
        if (full) { str.append ("ColHid[").append (getColHid ()).append ("] "); }
        if (full) { str.append ("AutGrp[").append (getAutGrp ()).append ("] "); }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getBecFltLst () != null) { str.append ("\n").append (indent).append ("BecFltLst (").append (getBecFltLst ().size ()).append ("):"); for (var model : getBecFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepQryAggLst () != null) { str.append ("\n").append (indent).append ("RepQryAggLst (").append (getRepQryAggLst ().size ()).append ("):"); for (var model : getRepQryAggLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepStyLst () != null) { str.append ("\n").append (indent).append ("RepStyLst (").append (getRepStyLst ().size ()).append ("):"); for (var model : getRepStyLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepQryFmtLst () != null) { str.append ("\n").append (indent).append ("RepQryFmtLst (").append (getRepQryFmtLst ().size ()).append ("):"); for (var model : getRepQryFmtLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEcmClsAttLst () != null) { str.append ("\n").append (indent).append ("EcmClsAttLst (").append (getEcmClsAttLst ().size ()).append ("):"); for (var model : getEcmClsAttLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLytColLst () != null) { str.append ("\n").append (indent).append ("LytColLst (").append (getLytColLst ().size ()).append ("):"); for (var model : getLytColLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getGrpLst () != null) { str.append ("\n").append (indent).append ("GrpLst (").append (getGrpLst ().size ()).append ("):"); for (var model : getGrpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQry () != null) { str.append ("\n").append (indent).append ("Qry: \n").append (getQry ().debug (full, true, indent + "    ")); }
        if (getCol () != null) { str.append ("\n").append (indent).append ("Col: \n").append (getCol ().debug (full, true, indent + "    ")); }
        if (getLbl () != null) { str.append ("\n").append (indent).append ("Lbl: \n").append (getLbl ().debug (full, true, indent + "    ")); }
        if (getClc () != null) { str.append ("\n").append (indent).append ("Clc: \n").append (getClc ().debug (full, true, indent + "    ")); }
        if (getClrClc () != null) { str.append ("\n").append (indent).append ("ClrClc: \n").append (getClrClc ().debug (full, true, indent + "    ")); }
        if (getDscClc () != null) { str.append ("\n").append (indent).append ("DscClc: \n").append (getDscClc ().debug (full, true, indent + "    ")); }
        if (getClrBkdClc () != null) { str.append ("\n").append (indent).append ("ClrBkdClc: \n").append (getClrBkdClc ().debug (full, true, indent + "    ")); }
        if (getScmFld () != null) { str.append ("\n").append (indent).append ("ScmFld: \n").append (getScmFld ().debug (full, true, indent + "    ")); }
        if (getClrFld () != null) { str.append ("\n").append (indent).append ("ClrFld: \n").append (getClrFld ().debug (full, true, indent + "    ")); }
        if (getDscFld () != null) { str.append ("\n").append (indent).append ("DscFld: \n").append (getDscFld ().debug (full, true, indent + "    ")); }
        if (getClrBkdFld () != null) { str.append ("\n").append (indent).append ("ClrBkdFld: \n").append (getClrBkdFld ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngQryDbmTblColImpl newEmptyInstance () { return (AngQryDbmTblColImpl) newInstance (); }
    
    @Override public AngQryDbmTblColImpl getCopy () {
        return (AngQryDbmTblColImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngQryDbmTblCol _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngQryDbmTblColImpl.baseUrl (); }
    public static String baseUrl () { return AngQryDbmTblColImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngQryDbmTblColImpl.baseUrl = baseUrl; } 

    @Override public List<AngQryDbmTblColFields> getFields () { return Arrays.asList (AngQryDbmTblColFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        var field = super.getByFieldName (fieldName);
        if (field != null) { return field; }
            return switch (fieldName) {
                case "BecFltLst" -> getBecFltLst (); 
                case "RepQryAggLst" -> getRepQryAggLst (); 
                case "RepQryFmtLst" -> getRepQryFmtLst (); 
                case "RepStyLst" -> getRepStyLst (); 

            default -> null;
        }; // switch

    } // getByFieldName

} // AngQryDbmTblColImpl
