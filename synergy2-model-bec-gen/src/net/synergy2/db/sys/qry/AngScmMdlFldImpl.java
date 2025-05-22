package net.synergy2.db.sys.qry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.dvz.wks.DvzWksChrAxx;
import net.synergy2.db.dvz.wks.DvzWksChrAxxImpl;
import net.synergy2.db.dvz.wks.DvzWksChrAxy;
import net.synergy2.db.dvz.wks.DvzWksChrAxyImpl;
import net.synergy2.db.dvz.wks.DvzWksGnt;
import net.synergy2.db.dvz.wks.DvzWksGntCol;
import net.synergy2.db.dvz.wks.DvzWksGntColImpl;
import net.synergy2.db.dvz.wks.DvzWksGntGrp;
import net.synergy2.db.dvz.wks.DvzWksGntGrpImpl;
import net.synergy2.db.dvz.wks.DvzWksGntImpl;
import net.synergy2.db.dvz.wks.DvzWksGntLay;
import net.synergy2.db.dvz.wks.DvzWksGntLayImpl;
import net.synergy2.db.dvz.wks.DvzWksQryDsgFlt;
import net.synergy2.db.dvz.wks.DvzWksQryDsgFltImpl;
import net.synergy2.db.dvz.wks.DvzWksQryDsgSty;
import net.synergy2.db.dvz.wks.DvzWksQryDsgStyImpl;
import net.synergy2.db.dvz.wks.DvzWksQryFlt;
import net.synergy2.db.dvz.wks.DvzWksQryFltImpl;
import net.synergy2.db.dvz.wks.DvzWksQryFmt;
import net.synergy2.db.dvz.wks.DvzWksQryFmtImpl;
import net.synergy2.db.dvz.wks.DvzWksQryPrm;
import net.synergy2.db.dvz.wks.DvzWksQryPrmImpl;

public class AngScmMdlFldImpl extends AngScmMdlFld {

    protected AngScmMdlFldImpl () { super (); }

    public enum AngScmMdlFldFields implements ISField {
        Uid, MdlUid, RefFldUid, FldCod, FldSrt, RemFld, LblUid, ColTyp, ColSubTyp, CmpTyp, EnbRea, EnbFlt, EnbSrt, FldMai, FldKey, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, FldDsc, OutFld;
    } // AngScmMdlFldFields
    
    private static String baseUrl = "/rest/sys/qry/AngScmMdlFld";


    @Override public String getModelClassName () { return "AngScmMdlFldImpl"; }



    private List<DvzWksQryPrm> _DvzQryPrmLst = null;
    public List<DvzWksQryPrm> getDvzQryPrmLst () { return this._DvzQryPrmLst; }
    public AngScmMdlFld setDvzQryPrmLst (List<DvzWksQryPrm> obj) { this._DvzQryPrmLst = obj; return this; }
    public AngScmMdlFld addDvzQryPrmLst (DvzWksQryPrm obj) {
        if (_DvzQryPrmLst == null) { _DvzQryPrmLst = new ArrayList<> (); }
        _DvzQryPrmLst.add (obj);
        return this;
    } // addDvzQryPrmLst

    private List<DvzWksQryFlt> _DvzQryFltLst = null;
    public List<DvzWksQryFlt> getDvzQryFltLst () { return this._DvzQryFltLst; }
    public AngScmMdlFld setDvzQryFltLst (List<DvzWksQryFlt> obj) { this._DvzQryFltLst = obj; return this; }
    public AngScmMdlFld addDvzQryFltLst (DvzWksQryFlt obj) {
        if (_DvzQryFltLst == null) { _DvzQryFltLst = new ArrayList<> (); }
        _DvzQryFltLst.add (obj);
        return this;
    } // addDvzQryFltLst

    private List<DvzWksQryFlt> _DvzQryFltValLst = null;
    public List<DvzWksQryFlt> getDvzQryFltValLst () { return this._DvzQryFltValLst; }
    public AngScmMdlFld setDvzQryFltValLst (List<DvzWksQryFlt> obj) { this._DvzQryFltValLst = obj; return this; }
    public AngScmMdlFld addDvzQryFltValLst (DvzWksQryFlt obj) {
        if (_DvzQryFltValLst == null) { _DvzQryFltValLst = new ArrayList<> (); }
        _DvzQryFltValLst.add (obj);
        return this;
    } // addDvzQryFltValLst

    private List<DvzWksQryFmt> _DvzQryFmtLst = null;
    public List<DvzWksQryFmt> getDvzQryFmtLst () { return this._DvzQryFmtLst; }
    public AngScmMdlFld setDvzQryFmtLst (List<DvzWksQryFmt> obj) { this._DvzQryFmtLst = obj; return this; }
    public AngScmMdlFld addDvzQryFmtLst (DvzWksQryFmt obj) {
        if (_DvzQryFmtLst == null) { _DvzQryFmtLst = new ArrayList<> (); }
        _DvzQryFmtLst.add (obj);
        return this;
    } // addDvzQryFmtLst

    private List<DvzWksQryDsgSty> _DvzQryDsgStyLst = null;
    public List<DvzWksQryDsgSty> getDvzQryDsgStyLst () { return this._DvzQryDsgStyLst; }
    public AngScmMdlFld setDvzQryDsgStyLst (List<DvzWksQryDsgSty> obj) { this._DvzQryDsgStyLst = obj; return this; }
    public AngScmMdlFld addDvzQryDsgStyLst (DvzWksQryDsgSty obj) {
        if (_DvzQryDsgStyLst == null) { _DvzQryDsgStyLst = new ArrayList<> (); }
        _DvzQryDsgStyLst.add (obj);
        return this;
    } // addDvzQryDsgStyLst

    private List<DvzWksQryDsgFlt> _DvzQryDsgFltLst = null;
    public List<DvzWksQryDsgFlt> getDvzQryDsgFltLst () { return this._DvzQryDsgFltLst; }
    public AngScmMdlFld setDvzQryDsgFltLst (List<DvzWksQryDsgFlt> obj) { this._DvzQryDsgFltLst = obj; return this; }
    public AngScmMdlFld addDvzQryDsgFltLst (DvzWksQryDsgFlt obj) {
        if (_DvzQryDsgFltLst == null) { _DvzQryDsgFltLst = new ArrayList<> (); }
        _DvzQryDsgFltLst.add (obj);
        return this;
    } // addDvzQryDsgFltLst

    private List<DvzWksQryDsgFlt> _DvzQryDsgFltValLst = null;
    public List<DvzWksQryDsgFlt> getDvzQryDsgFltValLst () { return this._DvzQryDsgFltValLst; }
    public AngScmMdlFld setDvzQryDsgFltValLst (List<DvzWksQryDsgFlt> obj) { this._DvzQryDsgFltValLst = obj; return this; }
    public AngScmMdlFld addDvzQryDsgFltValLst (DvzWksQryDsgFlt obj) {
        if (_DvzQryDsgFltValLst == null) { _DvzQryDsgFltValLst = new ArrayList<> (); }
        _DvzQryDsgFltValLst.add (obj);
        return this;
    } // addDvzQryDsgFltValLst

    private List<DvzWksChrAxx> _DvzChrAxxLst = null;
    public List<DvzWksChrAxx> getDvzChrAxxLst () { return this._DvzChrAxxLst; }
    public AngScmMdlFld setDvzChrAxxLst (List<DvzWksChrAxx> obj) { this._DvzChrAxxLst = obj; return this; }
    public AngScmMdlFld addDvzChrAxxLst (DvzWksChrAxx obj) {
        if (_DvzChrAxxLst == null) { _DvzChrAxxLst = new ArrayList<> (); }
        _DvzChrAxxLst.add (obj);
        return this;
    } // addDvzChrAxxLst

    private List<DvzWksChrAxx> _DvzChrAxxClrLst = null;
    public List<DvzWksChrAxx> getDvzChrAxxClrLst () { return this._DvzChrAxxClrLst; }
    public AngScmMdlFld setDvzChrAxxClrLst (List<DvzWksChrAxx> obj) { this._DvzChrAxxClrLst = obj; return this; }
    public AngScmMdlFld addDvzChrAxxClrLst (DvzWksChrAxx obj) {
        if (_DvzChrAxxClrLst == null) { _DvzChrAxxClrLst = new ArrayList<> (); }
        _DvzChrAxxClrLst.add (obj);
        return this;
    } // addDvzChrAxxClrLst

    private List<DvzWksChrAxx> _DvzChrAxxDscLst = null;
    public List<DvzWksChrAxx> getDvzChrAxxDscLst () { return this._DvzChrAxxDscLst; }
    public AngScmMdlFld setDvzChrAxxDscLst (List<DvzWksChrAxx> obj) { this._DvzChrAxxDscLst = obj; return this; }
    public AngScmMdlFld addDvzChrAxxDscLst (DvzWksChrAxx obj) {
        if (_DvzChrAxxDscLst == null) { _DvzChrAxxDscLst = new ArrayList<> (); }
        _DvzChrAxxDscLst.add (obj);
        return this;
    } // addDvzChrAxxDscLst

    private List<DvzWksChrAxy> _DvzChrAxyLst = null;
    public List<DvzWksChrAxy> getDvzChrAxyLst () { return this._DvzChrAxyLst; }
    public AngScmMdlFld setDvzChrAxyLst (List<DvzWksChrAxy> obj) { this._DvzChrAxyLst = obj; return this; }
    public AngScmMdlFld addDvzChrAxyLst (DvzWksChrAxy obj) {
        if (_DvzChrAxyLst == null) { _DvzChrAxyLst = new ArrayList<> (); }
        _DvzChrAxyLst.add (obj);
        return this;
    } // addDvzChrAxyLst

    private List<DvzWksGnt> _DvzGntStrLst = null;
    public List<DvzWksGnt> getDvzGntStrLst () { return this._DvzGntStrLst; }
    public AngScmMdlFld setDvzGntStrLst (List<DvzWksGnt> obj) { this._DvzGntStrLst = obj; return this; }
    public AngScmMdlFld addDvzGntStrLst (DvzWksGnt obj) {
        if (_DvzGntStrLst == null) { _DvzGntStrLst = new ArrayList<> (); }
        _DvzGntStrLst.add (obj);
        return this;
    } // addDvzGntStrLst

    private List<DvzWksGnt> _DvzGntEndLst = null;
    public List<DvzWksGnt> getDvzGntEndLst () { return this._DvzGntEndLst; }
    public AngScmMdlFld setDvzGntEndLst (List<DvzWksGnt> obj) { this._DvzGntEndLst = obj; return this; }
    public AngScmMdlFld addDvzGntEndLst (DvzWksGnt obj) {
        if (_DvzGntEndLst == null) { _DvzGntEndLst = new ArrayList<> (); }
        _DvzGntEndLst.add (obj);
        return this;
    } // addDvzGntEndLst

    private List<DvzWksGnt> _DvzGntClrLst = null;
    public List<DvzWksGnt> getDvzGntClrLst () { return this._DvzGntClrLst; }
    public AngScmMdlFld setDvzGntClrLst (List<DvzWksGnt> obj) { this._DvzGntClrLst = obj; return this; }
    public AngScmMdlFld addDvzGntClrLst (DvzWksGnt obj) {
        if (_DvzGntClrLst == null) { _DvzGntClrLst = new ArrayList<> (); }
        _DvzGntClrLst.add (obj);
        return this;
    } // addDvzGntClrLst

    private List<DvzWksGnt> _DvzGntDayLst = null;
    public List<DvzWksGnt> getDvzGntDayLst () { return this._DvzGntDayLst; }
    public AngScmMdlFld setDvzGntDayLst (List<DvzWksGnt> obj) { this._DvzGntDayLst = obj; return this; }
    public AngScmMdlFld addDvzGntDayLst (DvzWksGnt obj) {
        if (_DvzGntDayLst == null) { _DvzGntDayLst = new ArrayList<> (); }
        _DvzGntDayLst.add (obj);
        return this;
    } // addDvzGntDayLst

    private List<DvzWksGntCol> _DvzGntColLst = null;
    public List<DvzWksGntCol> getDvzGntColLst () { return this._DvzGntColLst; }
    public AngScmMdlFld setDvzGntColLst (List<DvzWksGntCol> obj) { this._DvzGntColLst = obj; return this; }
    public AngScmMdlFld addDvzGntColLst (DvzWksGntCol obj) {
        if (_DvzGntColLst == null) { _DvzGntColLst = new ArrayList<> (); }
        _DvzGntColLst.add (obj);
        return this;
    } // addDvzGntColLst

    private List<DvzWksGntGrp> _DvzGntGrpLst = null;
    public List<DvzWksGntGrp> getDvzGntGrpLst () { return this._DvzGntGrpLst; }
    public AngScmMdlFld setDvzGntGrpLst (List<DvzWksGntGrp> obj) { this._DvzGntGrpLst = obj; return this; }
    public AngScmMdlFld addDvzGntGrpLst (DvzWksGntGrp obj) {
        if (_DvzGntGrpLst == null) { _DvzGntGrpLst = new ArrayList<> (); }
        _DvzGntGrpLst.add (obj);
        return this;
    } // addDvzGntGrpLst

    private List<DvzWksGntGrp> _DvzGntGrpDscLst = null;
    public List<DvzWksGntGrp> getDvzGntGrpDscLst () { return this._DvzGntGrpDscLst; }
    public AngScmMdlFld setDvzGntGrpDscLst (List<DvzWksGntGrp> obj) { this._DvzGntGrpDscLst = obj; return this; }
    public AngScmMdlFld addDvzGntGrpDscLst (DvzWksGntGrp obj) {
        if (_DvzGntGrpDscLst == null) { _DvzGntGrpDscLst = new ArrayList<> (); }
        _DvzGntGrpDscLst.add (obj);
        return this;
    } // addDvzGntGrpDscLst

    private List<DvzWksGntLay> _DvzGntLayTssLst = null;
    public List<DvzWksGntLay> getDvzGntLayTssLst () { return this._DvzGntLayTssLst; }
    public AngScmMdlFld setDvzGntLayTssLst (List<DvzWksGntLay> obj) { this._DvzGntLayTssLst = obj; return this; }
    public AngScmMdlFld addDvzGntLayTssLst (DvzWksGntLay obj) {
        if (_DvzGntLayTssLst == null) { _DvzGntLayTssLst = new ArrayList<> (); }
        _DvzGntLayTssLst.add (obj);
        return this;
    } // addDvzGntLayTssLst

    private List<DvzWksGntLay> _DvzGntLayDayLst = null;
    public List<DvzWksGntLay> getDvzGntLayDayLst () { return this._DvzGntLayDayLst; }
    public AngScmMdlFld setDvzGntLayDayLst (List<DvzWksGntLay> obj) { this._DvzGntLayDayLst = obj; return this; }
    public AngScmMdlFld addDvzGntLayDayLst (DvzWksGntLay obj) {
        if (_DvzGntLayDayLst == null) { _DvzGntLayDayLst = new ArrayList<> (); }
        _DvzGntLayDayLst.add (obj);
        return this;
    } // addDvzGntLayDayLst

    private List<DvzWksGnt> _DvzGntLblLftLst = null;
    public List<DvzWksGnt> getDvzGntLblLftLst () { return this._DvzGntLblLftLst; }
    public AngScmMdlFld setDvzGntLblLftLst (List<DvzWksGnt> obj) { this._DvzGntLblLftLst = obj; return this; }
    public AngScmMdlFld addDvzGntLblLftLst (DvzWksGnt obj) {
        if (_DvzGntLblLftLst == null) { _DvzGntLblLftLst = new ArrayList<> (); }
        _DvzGntLblLftLst.add (obj);
        return this;
    } // addDvzGntLblLftLst

    private List<DvzWksGnt> _DvzGntLblMidLst = null;
    public List<DvzWksGnt> getDvzGntLblMidLst () { return this._DvzGntLblMidLst; }
    public AngScmMdlFld setDvzGntLblMidLst (List<DvzWksGnt> obj) { this._DvzGntLblMidLst = obj; return this; }
    public AngScmMdlFld addDvzGntLblMidLst (DvzWksGnt obj) {
        if (_DvzGntLblMidLst == null) { _DvzGntLblMidLst = new ArrayList<> (); }
        _DvzGntLblMidLst.add (obj);
        return this;
    } // addDvzGntLblMidLst

    private List<DvzWksGnt> _DvzGntLblRgtLst = null;
    public List<DvzWksGnt> getDvzGntLblRgtLst () { return this._DvzGntLblRgtLst; }
    public AngScmMdlFld setDvzGntLblRgtLst (List<DvzWksGnt> obj) { this._DvzGntLblRgtLst = obj; return this; }
    public AngScmMdlFld addDvzGntLblRgtLst (DvzWksGnt obj) {
        if (_DvzGntLblRgtLst == null) { _DvzGntLblRgtLst = new ArrayList<> (); }
        _DvzGntLblRgtLst.add (obj);
        return this;
    } // addDvzGntLblRgtLst


    
    @Override public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        switch (fieldName) {
            case "DvzQryPrmLst" -> addDvzQryPrmLst ((DvzWksQryPrmImpl) value); 
            case "DvzQryFltLst" -> addDvzQryFltLst ((DvzWksQryFltImpl) value); 
            case "DvzQryFltValLst" -> addDvzQryFltValLst ((DvzWksQryFltImpl) value); 
            case "DvzQryFmtLst" -> addDvzQryFmtLst ((DvzWksQryFmtImpl) value); 
            case "DvzQryDsgStyLst" -> addDvzQryDsgStyLst ((DvzWksQryDsgStyImpl) value); 
            case "DvzQryDsgFltLst" -> addDvzQryDsgFltLst ((DvzWksQryDsgFltImpl) value); 
            case "DvzQryDsgFltValLst" -> addDvzQryDsgFltValLst ((DvzWksQryDsgFltImpl) value); 
            case "DvzChrAxxLst" -> addDvzChrAxxLst ((DvzWksChrAxxImpl) value); 
            case "DvzChrAxxClrLst" -> addDvzChrAxxClrLst ((DvzWksChrAxxImpl) value); 
            case "DvzChrAxxDscLst" -> addDvzChrAxxDscLst ((DvzWksChrAxxImpl) value); 
            case "DvzChrAxyLst" -> addDvzChrAxyLst ((DvzWksChrAxyImpl) value); 
            case "DvzGntStrLst" -> addDvzGntStrLst ((DvzWksGntImpl) value); 
            case "DvzGntEndLst" -> addDvzGntEndLst ((DvzWksGntImpl) value); 
            case "DvzGntClrLst" -> addDvzGntClrLst ((DvzWksGntImpl) value); 
            case "DvzGntDayLst" -> addDvzGntDayLst ((DvzWksGntImpl) value); 
            case "DvzGntColLst" -> addDvzGntColLst ((DvzWksGntColImpl) value); 
            case "DvzGntGrpLst" -> addDvzGntGrpLst ((DvzWksGntGrpImpl) value); 
            case "DvzGntGrpDscLst" -> addDvzGntGrpDscLst ((DvzWksGntGrpImpl) value); 
            case "DvzGntLayTssLst" -> addDvzGntLayTssLst ((DvzWksGntLayImpl) value); 
            case "DvzGntLayDayLst" -> addDvzGntLayDayLst ((DvzWksGntLayImpl) value); 
            case "DvzGntLblLftLst" -> addDvzGntLblLftLst ((DvzWksGntImpl) value); 
            case "DvzGntLblMidLst" -> addDvzGntLblMidLst ((DvzWksGntImpl) value); 
            case "DvzGntLblRgtLst" -> addDvzGntLblRgtLst ((DvzWksGntImpl) value); 

            default -> {
                if (!settedSuper) { throw new SQueryException ("No reference specification found for field [" + fieldName + "]."); }
            }
        } // switch
        return true;
    } // set
    
    @Override public String debug (boolean full, boolean cascade, String indent) {
        StringBuilder str = new StringBuilder (indent).append (getModelClassName ()).append (" = {");
        str.append ("Uid[").append (getUid ()).append ("] ");
        str.append ("MdlUid[").append (getMdlUid ()).append ("] ");
        if (Objects.nonNull (getRefFldUid ())) { str.append ("RefFldUid[").append (getRefFldUid ()).append ("] "); }
        str.append ("FldCod[").append (getFldCod ()).append ("] ");
        if (full) { str.append ("FldSrt[").append (getFldSrt ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRemFld ())) { str.append ("RemFld[").append (getRemFld ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLblUid ())) { str.append ("LblUid[").append (getLblUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getColTyp ())) { str.append ("ColTyp[").append (getColTyp ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getColSubTyp ())) { str.append ("ColSubTyp[").append (getColSubTyp ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCmpTyp ())) { str.append ("CmpTyp[").append (getCmpTyp ()).append ("] "); } }
        if (full) { str.append ("EnbRea[").append (getEnbRea ()).append ("] "); }
        if (full) { str.append ("EnbFlt[").append (getEnbFlt ()).append ("] "); }
        if (full) { str.append ("EnbSrt[").append (getEnbSrt ()).append ("] "); }
        if (full) { str.append ("FldMai[").append (getFldMai ()).append ("] "); }
        if (full) { str.append ("FldKey[").append (getFldKey ()).append ("] "); }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (Objects.nonNull (getFldDsc ())) { str.append ("FldDsc[").append (getFldDsc ()).append ("] "); }
        if (full) { str.append ("OutFld[").append (getOutFld ()).append ("] "); }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getDvzQryPrmLst () != null) { str.append ("\n").append (indent).append ("DvzQryPrmLst (").append (getDvzQryPrmLst ().size ()).append ("):"); for (var model : getDvzQryPrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzQryFltLst () != null) { str.append ("\n").append (indent).append ("DvzQryFltLst (").append (getDvzQryFltLst ().size ()).append ("):"); for (var model : getDvzQryFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzQryFltValLst () != null) { str.append ("\n").append (indent).append ("DvzQryFltValLst (").append (getDvzQryFltValLst ().size ()).append ("):"); for (var model : getDvzQryFltValLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzQryFmtLst () != null) { str.append ("\n").append (indent).append ("DvzQryFmtLst (").append (getDvzQryFmtLst ().size ()).append ("):"); for (var model : getDvzQryFmtLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzQryDsgStyLst () != null) { str.append ("\n").append (indent).append ("DvzQryDsgStyLst (").append (getDvzQryDsgStyLst ().size ()).append ("):"); for (var model : getDvzQryDsgStyLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzQryDsgFltLst () != null) { str.append ("\n").append (indent).append ("DvzQryDsgFltLst (").append (getDvzQryDsgFltLst ().size ()).append ("):"); for (var model : getDvzQryDsgFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzQryDsgFltValLst () != null) { str.append ("\n").append (indent).append ("DvzQryDsgFltValLst (").append (getDvzQryDsgFltValLst ().size ()).append ("):"); for (var model : getDvzQryDsgFltValLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzChrAxxLst () != null) { str.append ("\n").append (indent).append ("DvzChrAxxLst (").append (getDvzChrAxxLst ().size ()).append ("):"); for (var model : getDvzChrAxxLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzChrAxxClrLst () != null) { str.append ("\n").append (indent).append ("DvzChrAxxClrLst (").append (getDvzChrAxxClrLst ().size ()).append ("):"); for (var model : getDvzChrAxxClrLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzChrAxxDscLst () != null) { str.append ("\n").append (indent).append ("DvzChrAxxDscLst (").append (getDvzChrAxxDscLst ().size ()).append ("):"); for (var model : getDvzChrAxxDscLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzChrAxyLst () != null) { str.append ("\n").append (indent).append ("DvzChrAxyLst (").append (getDvzChrAxyLst ().size ()).append ("):"); for (var model : getDvzChrAxyLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzGntStrLst () != null) { str.append ("\n").append (indent).append ("DvzGntStrLst (").append (getDvzGntStrLst ().size ()).append ("):"); for (var model : getDvzGntStrLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzGntEndLst () != null) { str.append ("\n").append (indent).append ("DvzGntEndLst (").append (getDvzGntEndLst ().size ()).append ("):"); for (var model : getDvzGntEndLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzGntClrLst () != null) { str.append ("\n").append (indent).append ("DvzGntClrLst (").append (getDvzGntClrLst ().size ()).append ("):"); for (var model : getDvzGntClrLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzGntDayLst () != null) { str.append ("\n").append (indent).append ("DvzGntDayLst (").append (getDvzGntDayLst ().size ()).append ("):"); for (var model : getDvzGntDayLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzGntColLst () != null) { str.append ("\n").append (indent).append ("DvzGntColLst (").append (getDvzGntColLst ().size ()).append ("):"); for (var model : getDvzGntColLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzGntGrpLst () != null) { str.append ("\n").append (indent).append ("DvzGntGrpLst (").append (getDvzGntGrpLst ().size ()).append ("):"); for (var model : getDvzGntGrpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzGntGrpDscLst () != null) { str.append ("\n").append (indent).append ("DvzGntGrpDscLst (").append (getDvzGntGrpDscLst ().size ()).append ("):"); for (var model : getDvzGntGrpDscLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzGntLayTssLst () != null) { str.append ("\n").append (indent).append ("DvzGntLayTssLst (").append (getDvzGntLayTssLst ().size ()).append ("):"); for (var model : getDvzGntLayTssLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzGntLayDayLst () != null) { str.append ("\n").append (indent).append ("DvzGntLayDayLst (").append (getDvzGntLayDayLst ().size ()).append ("):"); for (var model : getDvzGntLayDayLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzGntLblLftLst () != null) { str.append ("\n").append (indent).append ("DvzGntLblLftLst (").append (getDvzGntLblLftLst ().size ()).append ("):"); for (var model : getDvzGntLblLftLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzGntLblMidLst () != null) { str.append ("\n").append (indent).append ("DvzGntLblMidLst (").append (getDvzGntLblMidLst ().size ()).append ("):"); for (var model : getDvzGntLblMidLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzGntLblRgtLst () != null) { str.append ("\n").append (indent).append ("DvzGntLblRgtLst (").append (getDvzGntLblRgtLst ().size ()).append ("):"); for (var model : getDvzGntLblRgtLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDocClsCtxFltLst () != null) { str.append ("\n").append (indent).append ("DocClsCtxFltLst (").append (getDocClsCtxFltLst ().size ()).append ("):"); for (var model : getDocClsCtxFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getChdFldLst () != null) { str.append ("\n").append (indent).append ("ChdFldLst (").append (getChdFldLst ().size ()).append ("):"); for (var model : getChdFldLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQryColLst () != null) { str.append ("\n").append (indent).append ("QryColLst (").append (getQryColLst ().size ()).append ("):"); for (var model : getQryColLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQryColClrLst () != null) { str.append ("\n").append (indent).append ("QryColClrLst (").append (getQryColClrLst ().size ()).append ("):"); for (var model : getQryColClrLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQryColDscLst () != null) { str.append ("\n").append (indent).append ("QryColDscLst (").append (getQryColDscLst ().size ()).append ("):"); for (var model : getQryColDscLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQryColClrBkdLst () != null) { str.append ("\n").append (indent).append ("QryColClrBkdLst (").append (getQryColClrBkdLst ().size ()).append ("):"); for (var model : getQryColClrBkdLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQrySrtLst () != null) { str.append ("\n").append (indent).append ("QrySrtLst (").append (getQrySrtLst ().size ()).append ("):"); for (var model : getQrySrtLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getFltLst () != null) { str.append ("\n").append (indent).append ("FltLst (").append (getFltLst ().size ()).append ("):"); for (var model : getFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getFltValLst () != null) { str.append ("\n").append (indent).append ("FltValLst (").append (getFltValLst ().size ()).append ("):"); for (var model : getFltValLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQryLytSrtLst () != null) { str.append ("\n").append (indent).append ("QryLytSrtLst (").append (getQryLytSrtLst ().size ()).append ("):"); for (var model : getQryLytSrtLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQryFldLst () != null) { str.append ("\n").append (indent).append ("QryFldLst (").append (getQryFldLst ().size ()).append ("):"); for (var model : getQryFldLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysWksPrmUidFldLst () != null) { str.append ("\n").append (indent).append ("SysWksPrmUidFldLst (").append (getSysWksPrmUidFldLst ().size ()).append ("):"); for (var model : getSysWksPrmUidFldLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysWksPrmCodFldLst () != null) { str.append ("\n").append (indent).append ("SysWksPrmCodFldLst (").append (getSysWksPrmCodFldLst ().size ()).append ("):"); for (var model : getSysWksPrmCodFldLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysWksPrmDscFldLst () != null) { str.append ("\n").append (indent).append ("SysWksPrmDscFldLst (").append (getSysWksPrmDscFldLst ().size ()).append ("):"); for (var model : getSysWksPrmDscFldLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWksWdgFltLst () != null) { str.append ("\n").append (indent).append ("WksWdgFltLst (").append (getWksWdgFltLst ().size ()).append ("):"); for (var model : getWksWdgFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWksWdgFltValLst () != null) { str.append ("\n").append (indent).append ("WksWdgFltValLst (").append (getWksWdgFltValLst ().size ()).append ("):"); for (var model : getWksWdgFltValLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWksWdgPrmLst () != null) { str.append ("\n").append (indent).append ("WksWdgPrmLst (").append (getWksWdgPrmLst ().size ()).append ("):"); for (var model : getWksWdgPrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getScmMdl () != null) { str.append ("\n").append (indent).append ("ScmMdl: \n").append (getScmMdl ().debug (full, true, indent + "    ")); }
        if (getRefFld () != null) { str.append ("\n").append (indent).append ("RefFld: \n").append (getRefFld ().debug (full, true, indent + "    ")); }
        if (getLbl () != null) { str.append ("\n").append (indent).append ("Lbl: \n").append (getLbl ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngScmMdlFldImpl newEmptyInstance () { return (AngScmMdlFldImpl) newInstance (); }
    
    @Override public AngScmMdlFldImpl getCopy () {
        return (AngScmMdlFldImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngScmMdlFld _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngScmMdlFldImpl.baseUrl (); }
    public static String baseUrl () { return AngScmMdlFldImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngScmMdlFldImpl.baseUrl = baseUrl; } 

    @Override public List<AngScmMdlFldFields> getFields () { return Arrays.asList (AngScmMdlFldFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        var field = super.getByFieldName (fieldName);
        if (field != null) { return field; }
            return switch (fieldName) {
                case "DvzChrAxxClrLst" -> getDvzChrAxxClrLst (); 
                case "DvzChrAxxDscLst" -> getDvzChrAxxDscLst (); 
                case "DvzChrAxxLst" -> getDvzChrAxxLst (); 
                case "DvzChrAxyLst" -> getDvzChrAxyLst (); 
                case "DvzGntClrLst" -> getDvzGntClrLst (); 
                case "DvzGntColLst" -> getDvzGntColLst (); 
                case "DvzGntDayLst" -> getDvzGntDayLst (); 
                case "DvzGntEndLst" -> getDvzGntEndLst (); 
                case "DvzGntGrpDscLst" -> getDvzGntGrpDscLst (); 
                case "DvzGntGrpLst" -> getDvzGntGrpLst (); 
                case "DvzGntLayDayLst" -> getDvzGntLayDayLst (); 
                case "DvzGntLayTssLst" -> getDvzGntLayTssLst (); 
                case "DvzGntLblLftLst" -> getDvzGntLblLftLst (); 
                case "DvzGntLblMidLst" -> getDvzGntLblMidLst (); 
                case "DvzGntLblRgtLst" -> getDvzGntLblRgtLst (); 
                case "DvzGntStrLst" -> getDvzGntStrLst (); 
                case "DvzQryDsgFltLst" -> getDvzQryDsgFltLst (); 
                case "DvzQryDsgFltValLst" -> getDvzQryDsgFltValLst (); 
                case "DvzQryDsgStyLst" -> getDvzQryDsgStyLst (); 
                case "DvzQryFltLst" -> getDvzQryFltLst (); 
                case "DvzQryFltValLst" -> getDvzQryFltValLst (); 
                case "DvzQryFmtLst" -> getDvzQryFmtLst (); 
                case "DvzQryPrmLst" -> getDvzQryPrmLst (); 

            default -> null;
        }; // switch

    } // getByFieldName

} // AngScmMdlFldImpl
