package net.synergy2.db.sys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.dvz.rep.DvzRepChrAxx;
import net.synergy2.db.dvz.rep.DvzRepChrAxxImpl;
import net.synergy2.db.dvz.rep.DvzRepChrAxy;
import net.synergy2.db.dvz.rep.DvzRepChrAxyImpl;
import net.synergy2.db.dvz.rep.DvzRepGnt;
import net.synergy2.db.dvz.rep.DvzRepGntGrp;
import net.synergy2.db.dvz.rep.DvzRepGntGrpImpl;
import net.synergy2.db.dvz.rep.DvzRepGntImpl;
import net.synergy2.db.dvz.rep.DvzRepGntLay;
import net.synergy2.db.dvz.rep.DvzRepGntLayImpl;
import net.synergy2.db.dvz.rep.DvzRepQryCnv;
import net.synergy2.db.dvz.rep.DvzRepQryCnvImpl;
import net.synergy2.db.dvz.rep.DvzRepQryDsgFlt;
import net.synergy2.db.dvz.rep.DvzRepQryDsgFltImpl;
import net.synergy2.db.dvz.rep.DvzRepQryFlt;
import net.synergy2.db.dvz.rep.DvzRepQryFltImpl;
import net.synergy2.db.dvz.rep.DvzRepQryFmt;
import net.synergy2.db.dvz.rep.DvzRepQryFmtImpl;
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

public class AngDbmTblColImpl extends AngDbmTblCol {

    protected AngDbmTblColImpl () { super (); }

    public enum AngDbmTblColFields implements ISField {
        Uid, TblUid, DbmColNam, ColTyp, ColSizPri, ColSizSec, ColKey, ColShtDsc, ColLngDsc, ColNil, SeqUid, ColDefVal, DicRef, PrsUid, ColCod, ColDsc, ColTra, ColSubTyp, ColLblUid, FldHid, FldReaOnl, FldQckFrm, FldReq, FldDefVal, Tsi, Tsu, Rsi, Rsu, FldMaxSizPri, FldMaxSizSec, FldApxNum, FldTag, MdlUid;
    } // AngDbmTblColFields
    
    private static String baseUrl = "/rest/sys/AngDbmTblCol";


    @Override public String getModelClassName () { return "AngDbmTblColImpl"; }



    private List<DvzRepQryFlt> _RepFltLst = null;
    public List<DvzRepQryFlt> getRepFltLst () { return this._RepFltLst; }
    public AngDbmTblCol setRepFltLst (List<DvzRepQryFlt> obj) { this._RepFltLst = obj; return this; }
    public AngDbmTblCol addRepFltLst (DvzRepQryFlt obj) {
        if (_RepFltLst == null) { _RepFltLst = new ArrayList<> (); }
        _RepFltLst.add (obj);
        return this;
    } // addRepFltLst

    private List<DvzRepQryFlt> _RepValLst = null;
    public List<DvzRepQryFlt> getRepValLst () { return this._RepValLst; }
    public AngDbmTblCol setRepValLst (List<DvzRepQryFlt> obj) { this._RepValLst = obj; return this; }
    public AngDbmTblCol addRepValLst (DvzRepQryFlt obj) {
        if (_RepValLst == null) { _RepValLst = new ArrayList<> (); }
        _RepValLst.add (obj);
        return this;
    } // addRepValLst

    private List<DvzRepQryDsgFlt> _RepDsgFltLst = null;
    public List<DvzRepQryDsgFlt> getRepDsgFltLst () { return this._RepDsgFltLst; }
    public AngDbmTblCol setRepDsgFltLst (List<DvzRepQryDsgFlt> obj) { this._RepDsgFltLst = obj; return this; }
    public AngDbmTblCol addRepDsgFltLst (DvzRepQryDsgFlt obj) {
        if (_RepDsgFltLst == null) { _RepDsgFltLst = new ArrayList<> (); }
        _RepDsgFltLst.add (obj);
        return this;
    } // addRepDsgFltLst

    private List<DvzRepQryDsgFlt> _RepDsgValLst = null;
    public List<DvzRepQryDsgFlt> getRepDsgValLst () { return this._RepDsgValLst; }
    public AngDbmTblCol setRepDsgValLst (List<DvzRepQryDsgFlt> obj) { this._RepDsgValLst = obj; return this; }
    public AngDbmTblCol addRepDsgValLst (DvzRepQryDsgFlt obj) {
        if (_RepDsgValLst == null) { _RepDsgValLst = new ArrayList<> (); }
        _RepDsgValLst.add (obj);
        return this;
    } // addRepDsgValLst

    private List<DvzRepChrAxx> _RepChrAxxLst = null;
    public List<DvzRepChrAxx> getRepChrAxxLst () { return this._RepChrAxxLst; }
    public AngDbmTblCol setRepChrAxxLst (List<DvzRepChrAxx> obj) { this._RepChrAxxLst = obj; return this; }
    public AngDbmTblCol addRepChrAxxLst (DvzRepChrAxx obj) {
        if (_RepChrAxxLst == null) { _RepChrAxxLst = new ArrayList<> (); }
        _RepChrAxxLst.add (obj);
        return this;
    } // addRepChrAxxLst

    private List<DvzRepChrAxy> _RepChrAxyLst = null;
    public List<DvzRepChrAxy> getRepChrAxyLst () { return this._RepChrAxyLst; }
    public AngDbmTblCol setRepChrAxyLst (List<DvzRepChrAxy> obj) { this._RepChrAxyLst = obj; return this; }
    public AngDbmTblCol addRepChrAxyLst (DvzRepChrAxy obj) {
        if (_RepChrAxyLst == null) { _RepChrAxyLst = new ArrayList<> (); }
        _RepChrAxyLst.add (obj);
        return this;
    } // addRepChrAxyLst

    private List<DvzRepQryFmt> _RepQryFmtRefLst = null;
    public List<DvzRepQryFmt> getRepQryFmtRefLst () { return this._RepQryFmtRefLst; }
    public AngDbmTblCol setRepQryFmtRefLst (List<DvzRepQryFmt> obj) { this._RepQryFmtRefLst = obj; return this; }
    public AngDbmTblCol addRepQryFmtRefLst (DvzRepQryFmt obj) {
        if (_RepQryFmtRefLst == null) { _RepQryFmtRefLst = new ArrayList<> (); }
        _RepQryFmtRefLst.add (obj);
        return this;
    } // addRepQryFmtRefLst

    private List<DvzRepQryCnv> _RepQryCnvLst = null;
    public List<DvzRepQryCnv> getRepQryCnvLst () { return this._RepQryCnvLst; }
    public AngDbmTblCol setRepQryCnvLst (List<DvzRepQryCnv> obj) { this._RepQryCnvLst = obj; return this; }
    public AngDbmTblCol addRepQryCnvLst (DvzRepQryCnv obj) {
        if (_RepQryCnvLst == null) { _RepQryCnvLst = new ArrayList<> (); }
        _RepQryCnvLst.add (obj);
        return this;
    } // addRepQryCnvLst

    private List<DvzRepChrAxx> _RepChrAxxClrLst = null;
    public List<DvzRepChrAxx> getRepChrAxxClrLst () { return this._RepChrAxxClrLst; }
    public AngDbmTblCol setRepChrAxxClrLst (List<DvzRepChrAxx> obj) { this._RepChrAxxClrLst = obj; return this; }
    public AngDbmTblCol addRepChrAxxClrLst (DvzRepChrAxx obj) {
        if (_RepChrAxxClrLst == null) { _RepChrAxxClrLst = new ArrayList<> (); }
        _RepChrAxxClrLst.add (obj);
        return this;
    } // addRepChrAxxClrLst

    private List<DvzRepChrAxx> _RepChrAxxDscLst = null;
    public List<DvzRepChrAxx> getRepChrAxxDscLst () { return this._RepChrAxxDscLst; }
    public AngDbmTblCol setRepChrAxxDscLst (List<DvzRepChrAxx> obj) { this._RepChrAxxDscLst = obj; return this; }
    public AngDbmTblCol addRepChrAxxDscLst (DvzRepChrAxx obj) {
        if (_RepChrAxxDscLst == null) { _RepChrAxxDscLst = new ArrayList<> (); }
        _RepChrAxxDscLst.add (obj);
        return this;
    } // addRepChrAxxDscLst

    private List<DvzRepGnt> _RepGntStrLst = null;
    public List<DvzRepGnt> getRepGntStrLst () { return this._RepGntStrLst; }
    public AngDbmTblCol setRepGntStrLst (List<DvzRepGnt> obj) { this._RepGntStrLst = obj; return this; }
    public AngDbmTblCol addRepGntStrLst (DvzRepGnt obj) {
        if (_RepGntStrLst == null) { _RepGntStrLst = new ArrayList<> (); }
        _RepGntStrLst.add (obj);
        return this;
    } // addRepGntStrLst

    private List<DvzRepGnt> _RepGntEndLst = null;
    public List<DvzRepGnt> getRepGntEndLst () { return this._RepGntEndLst; }
    public AngDbmTblCol setRepGntEndLst (List<DvzRepGnt> obj) { this._RepGntEndLst = obj; return this; }
    public AngDbmTblCol addRepGntEndLst (DvzRepGnt obj) {
        if (_RepGntEndLst == null) { _RepGntEndLst = new ArrayList<> (); }
        _RepGntEndLst.add (obj);
        return this;
    } // addRepGntEndLst

    private List<DvzRepGnt> _RepGntCodLst = null;
    public List<DvzRepGnt> getRepGntCodLst () { return this._RepGntCodLst; }
    public AngDbmTblCol setRepGntCodLst (List<DvzRepGnt> obj) { this._RepGntCodLst = obj; return this; }
    public AngDbmTblCol addRepGntCodLst (DvzRepGnt obj) {
        if (_RepGntCodLst == null) { _RepGntCodLst = new ArrayList<> (); }
        _RepGntCodLst.add (obj);
        return this;
    } // addRepGntCodLst

    private List<DvzRepGnt> _RepGntDscLst = null;
    public List<DvzRepGnt> getRepGntDscLst () { return this._RepGntDscLst; }
    public AngDbmTblCol setRepGntDscLst (List<DvzRepGnt> obj) { this._RepGntDscLst = obj; return this; }
    public AngDbmTblCol addRepGntDscLst (DvzRepGnt obj) {
        if (_RepGntDscLst == null) { _RepGntDscLst = new ArrayList<> (); }
        _RepGntDscLst.add (obj);
        return this;
    } // addRepGntDscLst

    private List<DvzRepGnt> _RepGntClrLst = null;
    public List<DvzRepGnt> getRepGntClrLst () { return this._RepGntClrLst; }
    public AngDbmTblCol setRepGntClrLst (List<DvzRepGnt> obj) { this._RepGntClrLst = obj; return this; }
    public AngDbmTblCol addRepGntClrLst (DvzRepGnt obj) {
        if (_RepGntClrLst == null) { _RepGntClrLst = new ArrayList<> (); }
        _RepGntClrLst.add (obj);
        return this;
    } // addRepGntClrLst

    private List<DvzRepGnt> _RepGntDayLst = null;
    public List<DvzRepGnt> getRepGntDayLst () { return this._RepGntDayLst; }
    public AngDbmTblCol setRepGntDayLst (List<DvzRepGnt> obj) { this._RepGntDayLst = obj; return this; }
    public AngDbmTblCol addRepGntDayLst (DvzRepGnt obj) {
        if (_RepGntDayLst == null) { _RepGntDayLst = new ArrayList<> (); }
        _RepGntDayLst.add (obj);
        return this;
    } // addRepGntDayLst

    private List<DvzRepGntGrp> _RepGntGrpLst = null;
    public List<DvzRepGntGrp> getRepGntGrpLst () { return this._RepGntGrpLst; }
    public AngDbmTblCol setRepGntGrpLst (List<DvzRepGntGrp> obj) { this._RepGntGrpLst = obj; return this; }
    public AngDbmTblCol addRepGntGrpLst (DvzRepGntGrp obj) {
        if (_RepGntGrpLst == null) { _RepGntGrpLst = new ArrayList<> (); }
        _RepGntGrpLst.add (obj);
        return this;
    } // addRepGntGrpLst

    private List<DvzRepGntGrp> _RepGntGrpDscLst = null;
    public List<DvzRepGntGrp> getRepGntGrpDscLst () { return this._RepGntGrpDscLst; }
    public AngDbmTblCol setRepGntGrpDscLst (List<DvzRepGntGrp> obj) { this._RepGntGrpDscLst = obj; return this; }
    public AngDbmTblCol addRepGntGrpDscLst (DvzRepGntGrp obj) {
        if (_RepGntGrpDscLst == null) { _RepGntGrpDscLst = new ArrayList<> (); }
        _RepGntGrpDscLst.add (obj);
        return this;
    } // addRepGntGrpDscLst

    private List<DvzRepGntLay> _RepGntLayTssLst = null;
    public List<DvzRepGntLay> getRepGntLayTssLst () { return this._RepGntLayTssLst; }
    public AngDbmTblCol setRepGntLayTssLst (List<DvzRepGntLay> obj) { this._RepGntLayTssLst = obj; return this; }
    public AngDbmTblCol addRepGntLayTssLst (DvzRepGntLay obj) {
        if (_RepGntLayTssLst == null) { _RepGntLayTssLst = new ArrayList<> (); }
        _RepGntLayTssLst.add (obj);
        return this;
    } // addRepGntLayTssLst

    private List<DvzRepGntLay> _RepGntLayDayLst = null;
    public List<DvzRepGntLay> getRepGntLayDayLst () { return this._RepGntLayDayLst; }
    public AngDbmTblCol setRepGntLayDayLst (List<DvzRepGntLay> obj) { this._RepGntLayDayLst = obj; return this; }
    public AngDbmTblCol addRepGntLayDayLst (DvzRepGntLay obj) {
        if (_RepGntLayDayLst == null) { _RepGntLayDayLst = new ArrayList<> (); }
        _RepGntLayDayLst.add (obj);
        return this;
    } // addRepGntLayDayLst

    private List<DvzWksQryPrm> _DvzQryPrmLst = null;
    public List<DvzWksQryPrm> getDvzQryPrmLst () { return this._DvzQryPrmLst; }
    public AngDbmTblCol setDvzQryPrmLst (List<DvzWksQryPrm> obj) { this._DvzQryPrmLst = obj; return this; }
    public AngDbmTblCol addDvzQryPrmLst (DvzWksQryPrm obj) {
        if (_DvzQryPrmLst == null) { _DvzQryPrmLst = new ArrayList<> (); }
        _DvzQryPrmLst.add (obj);
        return this;
    } // addDvzQryPrmLst

    private List<DvzWksQryFlt> _DvzQryFltLst = null;
    public List<DvzWksQryFlt> getDvzQryFltLst () { return this._DvzQryFltLst; }
    public AngDbmTblCol setDvzQryFltLst (List<DvzWksQryFlt> obj) { this._DvzQryFltLst = obj; return this; }
    public AngDbmTblCol addDvzQryFltLst (DvzWksQryFlt obj) {
        if (_DvzQryFltLst == null) { _DvzQryFltLst = new ArrayList<> (); }
        _DvzQryFltLst.add (obj);
        return this;
    } // addDvzQryFltLst

    private List<DvzWksQryFlt> _DvzQryFltValLst = null;
    public List<DvzWksQryFlt> getDvzQryFltValLst () { return this._DvzQryFltValLst; }
    public AngDbmTblCol setDvzQryFltValLst (List<DvzWksQryFlt> obj) { this._DvzQryFltValLst = obj; return this; }
    public AngDbmTblCol addDvzQryFltValLst (DvzWksQryFlt obj) {
        if (_DvzQryFltValLst == null) { _DvzQryFltValLst = new ArrayList<> (); }
        _DvzQryFltValLst.add (obj);
        return this;
    } // addDvzQryFltValLst

    private List<DvzWksQryFmt> _DvzQryFmtLst = null;
    public List<DvzWksQryFmt> getDvzQryFmtLst () { return this._DvzQryFmtLst; }
    public AngDbmTblCol setDvzQryFmtLst (List<DvzWksQryFmt> obj) { this._DvzQryFmtLst = obj; return this; }
    public AngDbmTblCol addDvzQryFmtLst (DvzWksQryFmt obj) {
        if (_DvzQryFmtLst == null) { _DvzQryFmtLst = new ArrayList<> (); }
        _DvzQryFmtLst.add (obj);
        return this;
    } // addDvzQryFmtLst

    private List<DvzWksQryDsgSty> _DvzQryDsgStyLst = null;
    public List<DvzWksQryDsgSty> getDvzQryDsgStyLst () { return this._DvzQryDsgStyLst; }
    public AngDbmTblCol setDvzQryDsgStyLst (List<DvzWksQryDsgSty> obj) { this._DvzQryDsgStyLst = obj; return this; }
    public AngDbmTblCol addDvzQryDsgStyLst (DvzWksQryDsgSty obj) {
        if (_DvzQryDsgStyLst == null) { _DvzQryDsgStyLst = new ArrayList<> (); }
        _DvzQryDsgStyLst.add (obj);
        return this;
    } // addDvzQryDsgStyLst

    private List<DvzWksQryDsgFlt> _DvzQryDsgFltLst = null;
    public List<DvzWksQryDsgFlt> getDvzQryDsgFltLst () { return this._DvzQryDsgFltLst; }
    public AngDbmTblCol setDvzQryDsgFltLst (List<DvzWksQryDsgFlt> obj) { this._DvzQryDsgFltLst = obj; return this; }
    public AngDbmTblCol addDvzQryDsgFltLst (DvzWksQryDsgFlt obj) {
        if (_DvzQryDsgFltLst == null) { _DvzQryDsgFltLst = new ArrayList<> (); }
        _DvzQryDsgFltLst.add (obj);
        return this;
    } // addDvzQryDsgFltLst

    private List<DvzWksQryDsgFlt> _DvzQryDsgFltValLst = null;
    public List<DvzWksQryDsgFlt> getDvzQryDsgFltValLst () { return this._DvzQryDsgFltValLst; }
    public AngDbmTblCol setDvzQryDsgFltValLst (List<DvzWksQryDsgFlt> obj) { this._DvzQryDsgFltValLst = obj; return this; }
    public AngDbmTblCol addDvzQryDsgFltValLst (DvzWksQryDsgFlt obj) {
        if (_DvzQryDsgFltValLst == null) { _DvzQryDsgFltValLst = new ArrayList<> (); }
        _DvzQryDsgFltValLst.add (obj);
        return this;
    } // addDvzQryDsgFltValLst

    private List<DvzWksChrAxx> _DvzChrAxxLst = null;
    public List<DvzWksChrAxx> getDvzChrAxxLst () { return this._DvzChrAxxLst; }
    public AngDbmTblCol setDvzChrAxxLst (List<DvzWksChrAxx> obj) { this._DvzChrAxxLst = obj; return this; }
    public AngDbmTblCol addDvzChrAxxLst (DvzWksChrAxx obj) {
        if (_DvzChrAxxLst == null) { _DvzChrAxxLst = new ArrayList<> (); }
        _DvzChrAxxLst.add (obj);
        return this;
    } // addDvzChrAxxLst

    private List<DvzWksChrAxx> _DvzChrAxxClrLst = null;
    public List<DvzWksChrAxx> getDvzChrAxxClrLst () { return this._DvzChrAxxClrLst; }
    public AngDbmTblCol setDvzChrAxxClrLst (List<DvzWksChrAxx> obj) { this._DvzChrAxxClrLst = obj; return this; }
    public AngDbmTblCol addDvzChrAxxClrLst (DvzWksChrAxx obj) {
        if (_DvzChrAxxClrLst == null) { _DvzChrAxxClrLst = new ArrayList<> (); }
        _DvzChrAxxClrLst.add (obj);
        return this;
    } // addDvzChrAxxClrLst

    private List<DvzWksChrAxx> _DvzChrAxxDscLst = null;
    public List<DvzWksChrAxx> getDvzChrAxxDscLst () { return this._DvzChrAxxDscLst; }
    public AngDbmTblCol setDvzChrAxxDscLst (List<DvzWksChrAxx> obj) { this._DvzChrAxxDscLst = obj; return this; }
    public AngDbmTblCol addDvzChrAxxDscLst (DvzWksChrAxx obj) {
        if (_DvzChrAxxDscLst == null) { _DvzChrAxxDscLst = new ArrayList<> (); }
        _DvzChrAxxDscLst.add (obj);
        return this;
    } // addDvzChrAxxDscLst

    private List<DvzWksChrAxy> _DvzChrAxyLst = null;
    public List<DvzWksChrAxy> getDvzChrAxyLst () { return this._DvzChrAxyLst; }
    public AngDbmTblCol setDvzChrAxyLst (List<DvzWksChrAxy> obj) { this._DvzChrAxyLst = obj; return this; }
    public AngDbmTblCol addDvzChrAxyLst (DvzWksChrAxy obj) {
        if (_DvzChrAxyLst == null) { _DvzChrAxyLst = new ArrayList<> (); }
        _DvzChrAxyLst.add (obj);
        return this;
    } // addDvzChrAxyLst

    private List<DvzWksGnt> _DvzGntStrLst = null;
    public List<DvzWksGnt> getDvzGntStrLst () { return this._DvzGntStrLst; }
    public AngDbmTblCol setDvzGntStrLst (List<DvzWksGnt> obj) { this._DvzGntStrLst = obj; return this; }
    public AngDbmTblCol addDvzGntStrLst (DvzWksGnt obj) {
        if (_DvzGntStrLst == null) { _DvzGntStrLst = new ArrayList<> (); }
        _DvzGntStrLst.add (obj);
        return this;
    } // addDvzGntStrLst

    private List<DvzWksGnt> _DvzGntEndLst = null;
    public List<DvzWksGnt> getDvzGntEndLst () { return this._DvzGntEndLst; }
    public AngDbmTblCol setDvzGntEndLst (List<DvzWksGnt> obj) { this._DvzGntEndLst = obj; return this; }
    public AngDbmTblCol addDvzGntEndLst (DvzWksGnt obj) {
        if (_DvzGntEndLst == null) { _DvzGntEndLst = new ArrayList<> (); }
        _DvzGntEndLst.add (obj);
        return this;
    } // addDvzGntEndLst

    private List<DvzWksGnt> _DvzGntClrLst = null;
    public List<DvzWksGnt> getDvzGntClrLst () { return this._DvzGntClrLst; }
    public AngDbmTblCol setDvzGntClrLst (List<DvzWksGnt> obj) { this._DvzGntClrLst = obj; return this; }
    public AngDbmTblCol addDvzGntClrLst (DvzWksGnt obj) {
        if (_DvzGntClrLst == null) { _DvzGntClrLst = new ArrayList<> (); }
        _DvzGntClrLst.add (obj);
        return this;
    } // addDvzGntClrLst

    private List<DvzWksGnt> _DvzGntDayLst = null;
    public List<DvzWksGnt> getDvzGntDayLst () { return this._DvzGntDayLst; }
    public AngDbmTblCol setDvzGntDayLst (List<DvzWksGnt> obj) { this._DvzGntDayLst = obj; return this; }
    public AngDbmTblCol addDvzGntDayLst (DvzWksGnt obj) {
        if (_DvzGntDayLst == null) { _DvzGntDayLst = new ArrayList<> (); }
        _DvzGntDayLst.add (obj);
        return this;
    } // addDvzGntDayLst

    private List<DvzWksGntCol> _DvzGntColLst = null;
    public List<DvzWksGntCol> getDvzGntColLst () { return this._DvzGntColLst; }
    public AngDbmTblCol setDvzGntColLst (List<DvzWksGntCol> obj) { this._DvzGntColLst = obj; return this; }
    public AngDbmTblCol addDvzGntColLst (DvzWksGntCol obj) {
        if (_DvzGntColLst == null) { _DvzGntColLst = new ArrayList<> (); }
        _DvzGntColLst.add (obj);
        return this;
    } // addDvzGntColLst

    private List<DvzWksGntGrp> _DvzGntGrpLst = null;
    public List<DvzWksGntGrp> getDvzGntGrpLst () { return this._DvzGntGrpLst; }
    public AngDbmTblCol setDvzGntGrpLst (List<DvzWksGntGrp> obj) { this._DvzGntGrpLst = obj; return this; }
    public AngDbmTblCol addDvzGntGrpLst (DvzWksGntGrp obj) {
        if (_DvzGntGrpLst == null) { _DvzGntGrpLst = new ArrayList<> (); }
        _DvzGntGrpLst.add (obj);
        return this;
    } // addDvzGntGrpLst

    private List<DvzWksGntGrp> _DvzGntGrpDscLst = null;
    public List<DvzWksGntGrp> getDvzGntGrpDscLst () { return this._DvzGntGrpDscLst; }
    public AngDbmTblCol setDvzGntGrpDscLst (List<DvzWksGntGrp> obj) { this._DvzGntGrpDscLst = obj; return this; }
    public AngDbmTblCol addDvzGntGrpDscLst (DvzWksGntGrp obj) {
        if (_DvzGntGrpDscLst == null) { _DvzGntGrpDscLst = new ArrayList<> (); }
        _DvzGntGrpDscLst.add (obj);
        return this;
    } // addDvzGntGrpDscLst

    private List<DvzWksGntLay> _DvzGntLayTssLst = null;
    public List<DvzWksGntLay> getDvzGntLayTssLst () { return this._DvzGntLayTssLst; }
    public AngDbmTblCol setDvzGntLayTssLst (List<DvzWksGntLay> obj) { this._DvzGntLayTssLst = obj; return this; }
    public AngDbmTblCol addDvzGntLayTssLst (DvzWksGntLay obj) {
        if (_DvzGntLayTssLst == null) { _DvzGntLayTssLst = new ArrayList<> (); }
        _DvzGntLayTssLst.add (obj);
        return this;
    } // addDvzGntLayTssLst

    private List<DvzWksGntLay> _DvzGntLayDayLst = null;
    public List<DvzWksGntLay> getDvzGntLayDayLst () { return this._DvzGntLayDayLst; }
    public AngDbmTblCol setDvzGntLayDayLst (List<DvzWksGntLay> obj) { this._DvzGntLayDayLst = obj; return this; }
    public AngDbmTblCol addDvzGntLayDayLst (DvzWksGntLay obj) {
        if (_DvzGntLayDayLst == null) { _DvzGntLayDayLst = new ArrayList<> (); }
        _DvzGntLayDayLst.add (obj);
        return this;
    } // addDvzGntLayDayLst

    private List<DvzWksGnt> _DvzGntLblLftLst = null;
    public List<DvzWksGnt> getDvzGntLblLftLst () { return this._DvzGntLblLftLst; }
    public AngDbmTblCol setDvzGntLblLftLst (List<DvzWksGnt> obj) { this._DvzGntLblLftLst = obj; return this; }
    public AngDbmTblCol addDvzGntLblLftLst (DvzWksGnt obj) {
        if (_DvzGntLblLftLst == null) { _DvzGntLblLftLst = new ArrayList<> (); }
        _DvzGntLblLftLst.add (obj);
        return this;
    } // addDvzGntLblLftLst

    private List<DvzWksGnt> _DvzGntLblMidLst = null;
    public List<DvzWksGnt> getDvzGntLblMidLst () { return this._DvzGntLblMidLst; }
    public AngDbmTblCol setDvzGntLblMidLst (List<DvzWksGnt> obj) { this._DvzGntLblMidLst = obj; return this; }
    public AngDbmTblCol addDvzGntLblMidLst (DvzWksGnt obj) {
        if (_DvzGntLblMidLst == null) { _DvzGntLblMidLst = new ArrayList<> (); }
        _DvzGntLblMidLst.add (obj);
        return this;
    } // addDvzGntLblMidLst

    private List<DvzWksGnt> _DvzGntLblRgtLst = null;
    public List<DvzWksGnt> getDvzGntLblRgtLst () { return this._DvzGntLblRgtLst; }
    public AngDbmTblCol setDvzGntLblRgtLst (List<DvzWksGnt> obj) { this._DvzGntLblRgtLst = obj; return this; }
    public AngDbmTblCol addDvzGntLblRgtLst (DvzWksGnt obj) {
        if (_DvzGntLblRgtLst == null) { _DvzGntLblRgtLst = new ArrayList<> (); }
        _DvzGntLblRgtLst.add (obj);
        return this;
    } // addDvzGntLblRgtLst


    
    @Override public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        switch (fieldName) {
            case "RepFltLst" -> addRepFltLst ((DvzRepQryFltImpl) value); 
            case "RepValLst" -> addRepValLst ((DvzRepQryFltImpl) value); 
            case "RepDsgFltLst" -> addRepDsgFltLst ((DvzRepQryDsgFltImpl) value); 
            case "RepDsgValLst" -> addRepDsgValLst ((DvzRepQryDsgFltImpl) value); 
            case "RepChrAxxLst" -> addRepChrAxxLst ((DvzRepChrAxxImpl) value); 
            case "RepChrAxyLst" -> addRepChrAxyLst ((DvzRepChrAxyImpl) value); 
            case "RepQryFmtRefLst" -> addRepQryFmtRefLst ((DvzRepQryFmtImpl) value); 
            case "RepQryCnvLst" -> addRepQryCnvLst ((DvzRepQryCnvImpl) value); 
            case "RepChrAxxClrLst" -> addRepChrAxxClrLst ((DvzRepChrAxxImpl) value); 
            case "RepChrAxxDscLst" -> addRepChrAxxDscLst ((DvzRepChrAxxImpl) value); 
            case "RepGntStrLst" -> addRepGntStrLst ((DvzRepGntImpl) value); 
            case "RepGntEndLst" -> addRepGntEndLst ((DvzRepGntImpl) value); 
            case "RepGntCodLst" -> addRepGntCodLst ((DvzRepGntImpl) value); 
            case "RepGntDscLst" -> addRepGntDscLst ((DvzRepGntImpl) value); 
            case "RepGntClrLst" -> addRepGntClrLst ((DvzRepGntImpl) value); 
            case "RepGntDayLst" -> addRepGntDayLst ((DvzRepGntImpl) value); 
            case "RepGntGrpLst" -> addRepGntGrpLst ((DvzRepGntGrpImpl) value); 
            case "RepGntGrpDscLst" -> addRepGntGrpDscLst ((DvzRepGntGrpImpl) value); 
            case "RepGntLayTssLst" -> addRepGntLayTssLst ((DvzRepGntLayImpl) value); 
            case "RepGntLayDayLst" -> addRepGntLayDayLst ((DvzRepGntLayImpl) value); 
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
        str.append ("TblUid[").append (getTblUid ()).append ("] ");
        str.append ("DbmColNam[").append (getDbmColNam ()).append ("] ");
        if (full) { str.append ("ColTyp[").append (getColTyp ()).append ("] "); }
        if (full) { if (Objects.nonNull (getColSizPri ())) { str.append ("ColSizPri[").append (getColSizPri ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getColSizSec ())) { str.append ("ColSizSec[").append (getColSizSec ()).append ("] "); } }
        if (full) { str.append ("ColKey[").append (getColKey ()).append ("] "); }
        if (full) { str.append ("ColShtDsc[").append (getColShtDsc ()).append ("] "); }
        str.append ("ColLngDsc[").append (getColLngDsc ()).append ("] ");
        if (full) { str.append ("ColNil[").append (getColNil ()).append ("] "); }
        if (full) { if (Objects.nonNull (getSeqUid ())) { str.append ("SeqUid[").append (getSeqUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getColDefVal ())) { str.append ("ColDefVal[").append (getColDefVal ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDicRef ())) { str.append ("DicRef[").append (getDicRef ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrsUid ())) { str.append ("PrsUid[").append (getPrsUid ()).append ("] "); } }
        if (full) { str.append ("ColCod[").append (getColCod ()).append ("] "); }
        if (full) { str.append ("ColDsc[").append (getColDsc ()).append ("] "); }
        if (full) { str.append ("ColTra[").append (getColTra ()).append ("] "); }
        if (full) { if (Objects.nonNull (getColSubTyp ())) { str.append ("ColSubTyp[").append (getColSubTyp ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getColLblUid ())) { str.append ("ColLblUid[").append (getColLblUid ()).append ("] "); } }
        if (full) { str.append ("FldHid[").append (getFldHid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getFldReaOnl ())) { str.append ("FldReaOnl[").append (getFldReaOnl ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFldQckFrm ())) { str.append ("FldQckFrm[").append (getFldQckFrm ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFldReq ())) { str.append ("FldReq[").append (getFldReq ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFldDefVal ())) { str.append ("FldDefVal[").append (getFldDefVal ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFldMaxSizPri ())) { str.append ("FldMaxSizPri[").append (getFldMaxSizPri ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFldMaxSizSec ())) { str.append ("FldMaxSizSec[").append (getFldMaxSizSec ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFldApxNum ())) { str.append ("FldApxNum[").append (getFldApxNum ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFldTag ())) { str.append ("FldTag[").append (getFldTag ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getMdlUid ())) { str.append ("MdlUid[").append (getMdlUid ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getRepFltLst () != null) { str.append ("\n").append (indent).append ("RepFltLst (").append (getRepFltLst ().size ()).append ("):"); for (var model : getRepFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepValLst () != null) { str.append ("\n").append (indent).append ("RepValLst (").append (getRepValLst ().size ()).append ("):"); for (var model : getRepValLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepDsgFltLst () != null) { str.append ("\n").append (indent).append ("RepDsgFltLst (").append (getRepDsgFltLst ().size ()).append ("):"); for (var model : getRepDsgFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepDsgValLst () != null) { str.append ("\n").append (indent).append ("RepDsgValLst (").append (getRepDsgValLst ().size ()).append ("):"); for (var model : getRepDsgValLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepChrAxxLst () != null) { str.append ("\n").append (indent).append ("RepChrAxxLst (").append (getRepChrAxxLst ().size ()).append ("):"); for (var model : getRepChrAxxLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepChrAxyLst () != null) { str.append ("\n").append (indent).append ("RepChrAxyLst (").append (getRepChrAxyLst ().size ()).append ("):"); for (var model : getRepChrAxyLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepQryFmtRefLst () != null) { str.append ("\n").append (indent).append ("RepQryFmtRefLst (").append (getRepQryFmtRefLst ().size ()).append ("):"); for (var model : getRepQryFmtRefLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepQryCnvLst () != null) { str.append ("\n").append (indent).append ("RepQryCnvLst (").append (getRepQryCnvLst ().size ()).append ("):"); for (var model : getRepQryCnvLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepChrAxxClrLst () != null) { str.append ("\n").append (indent).append ("RepChrAxxClrLst (").append (getRepChrAxxClrLst ().size ()).append ("):"); for (var model : getRepChrAxxClrLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepChrAxxDscLst () != null) { str.append ("\n").append (indent).append ("RepChrAxxDscLst (").append (getRepChrAxxDscLst ().size ()).append ("):"); for (var model : getRepChrAxxDscLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepGntStrLst () != null) { str.append ("\n").append (indent).append ("RepGntStrLst (").append (getRepGntStrLst ().size ()).append ("):"); for (var model : getRepGntStrLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepGntEndLst () != null) { str.append ("\n").append (indent).append ("RepGntEndLst (").append (getRepGntEndLst ().size ()).append ("):"); for (var model : getRepGntEndLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepGntCodLst () != null) { str.append ("\n").append (indent).append ("RepGntCodLst (").append (getRepGntCodLst ().size ()).append ("):"); for (var model : getRepGntCodLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepGntDscLst () != null) { str.append ("\n").append (indent).append ("RepGntDscLst (").append (getRepGntDscLst ().size ()).append ("):"); for (var model : getRepGntDscLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepGntClrLst () != null) { str.append ("\n").append (indent).append ("RepGntClrLst (").append (getRepGntClrLst ().size ()).append ("):"); for (var model : getRepGntClrLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepGntDayLst () != null) { str.append ("\n").append (indent).append ("RepGntDayLst (").append (getRepGntDayLst ().size ()).append ("):"); for (var model : getRepGntDayLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepGntGrpLst () != null) { str.append ("\n").append (indent).append ("RepGntGrpLst (").append (getRepGntGrpLst ().size ()).append ("):"); for (var model : getRepGntGrpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepGntGrpDscLst () != null) { str.append ("\n").append (indent).append ("RepGntGrpDscLst (").append (getRepGntGrpDscLst ().size ()).append ("):"); for (var model : getRepGntGrpDscLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepGntLayTssLst () != null) { str.append ("\n").append (indent).append ("RepGntLayTssLst (").append (getRepGntLayTssLst ().size ()).append ("):"); for (var model : getRepGntLayTssLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepGntLayDayLst () != null) { str.append ("\n").append (indent).append ("RepGntLayDayLst (").append (getRepGntLayDayLst ().size ()).append ("):"); for (var model : getRepGntLayDayLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
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
        if (getChdColLst () != null) { str.append ("\n").append (indent).append ("ChdColLst (").append (getChdColLst ().size ()).append ("):"); for (var model : getChdColLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getPrtColLst () != null) { str.append ("\n").append (indent).append ("PrtColLst (").append (getPrtColLst ().size ()).append ("):"); for (var model : getPrtColLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDocClsCtxAttLst () != null) { str.append ("\n").append (indent).append ("DocClsCtxAttLst (").append (getDocClsCtxAttLst ().size ()).append ("):"); for (var model : getDocClsCtxAttLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDocClsCtxFltValLst () != null) { str.append ("\n").append (indent).append ("DocClsCtxFltValLst (").append (getDocClsCtxFltValLst ().size ()).append ("):"); for (var model : getDocClsCtxFltValLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDocClsCtxFltLst () != null) { str.append ("\n").append (indent).append ("DocClsCtxFltLst (").append (getDocClsCtxFltLst ().size ()).append ("):"); for (var model : getDocClsCtxFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDatSetPrmLst () != null) { str.append ("\n").append (indent).append ("DatSetPrmLst (").append (getDatSetPrmLst ().size ()).append ("):"); for (var model : getDatSetPrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQryColLst () != null) { str.append ("\n").append (indent).append ("QryColLst (").append (getQryColLst ().size ()).append ("):"); for (var model : getQryColLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getFltLst () != null) { str.append ("\n").append (indent).append ("FltLst (").append (getFltLst ().size ()).append ("):"); for (var model : getFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getFltValLst () != null) { str.append ("\n").append (indent).append ("FltValLst (").append (getFltValLst ().size ()).append ("):"); for (var model : getFltValLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLytSrtLst () != null) { str.append ("\n").append (indent).append ("LytSrtLst (").append (getLytSrtLst ().size ()).append ("):"); for (var model : getLytSrtLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQryFldLst () != null) { str.append ("\n").append (indent).append ("QryFldLst (").append (getQryFldLst ().size ()).append ("):"); for (var model : getQryFldLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysFrmDsgFldLst () != null) { str.append ("\n").append (indent).append ("SysFrmDsgFldLst (").append (getSysFrmDsgFldLst ().size ()).append ("):"); for (var model : getSysFrmDsgFldLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysWksPrmDscColLst () != null) { str.append ("\n").append (indent).append ("SysWksPrmDscColLst (").append (getSysWksPrmDscColLst ().size ()).append ("):"); for (var model : getSysWksPrmDscColLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysWksPrmUidColLst () != null) { str.append ("\n").append (indent).append ("SysWksPrmUidColLst (").append (getSysWksPrmUidColLst ().size ()).append ("):"); for (var model : getSysWksPrmUidColLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysWksPrmCodColLst () != null) { str.append ("\n").append (indent).append ("SysWksPrmCodColLst (").append (getSysWksPrmCodColLst ().size ()).append ("):"); for (var model : getSysWksPrmCodColLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWksWdgPrmLst () != null) { str.append ("\n").append (indent).append ("WksWdgPrmLst (").append (getWksWdgPrmLst ().size ()).append ("):"); for (var model : getWksWdgPrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWksWdgFltLst () != null) { str.append ("\n").append (indent).append ("WksWdgFltLst (").append (getWksWdgFltLst ().size ()).append ("):"); for (var model : getWksWdgFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWksWdgFltValLst () != null) { str.append ("\n").append (indent).append ("WksWdgFltValLst (").append (getWksWdgFltValLst ().size ()).append ("):"); for (var model : getWksWdgFltValLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getTbl () != null) { str.append ("\n").append (indent).append ("Tbl: \n").append (getTbl ().debug (full, true, indent + "    ")); }
        if (getPrs () != null) { str.append ("\n").append (indent).append ("Prs: \n").append (getPrs ().debug (full, true, indent + "    ")); }
        if (getDic () != null) { str.append ("\n").append (indent).append ("Dic: \n").append (getDic ().debug (full, true, indent + "    ")); }
        if (getSeq () != null) { str.append ("\n").append (indent).append ("Seq: \n").append (getSeq ().debug (full, true, indent + "    ")); }
        if (getMdlRef () != null) { str.append ("\n").append (indent).append ("MdlRef: \n").append (getMdlRef ().debug (full, true, indent + "    ")); }
        if (getLbl () != null) { str.append ("\n").append (indent).append ("Lbl: \n").append (getLbl ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngDbmTblColImpl newEmptyInstance () { return (AngDbmTblColImpl) newInstance (); }
    
    @Override public AngDbmTblColImpl getCopy () {
        return (AngDbmTblColImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngDbmTblCol _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngDbmTblColImpl.baseUrl (); }
    public static String baseUrl () { return AngDbmTblColImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngDbmTblColImpl.baseUrl = baseUrl; } 

    @Override public List<AngDbmTblColFields> getFields () { return Arrays.asList (AngDbmTblColFields.values ()); }

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
                case "RepChrAxxClrLst" -> getRepChrAxxClrLst (); 
                case "RepChrAxxDscLst" -> getRepChrAxxDscLst (); 
                case "RepChrAxxLst" -> getRepChrAxxLst (); 
                case "RepChrAxyLst" -> getRepChrAxyLst (); 
                case "RepDsgFltLst" -> getRepDsgFltLst (); 
                case "RepDsgValLst" -> getRepDsgValLst (); 
                case "RepFltLst" -> getRepFltLst (); 
                case "RepGntClrLst" -> getRepGntClrLst (); 
                case "RepGntCodLst" -> getRepGntCodLst (); 
                case "RepGntDayLst" -> getRepGntDayLst (); 
                case "RepGntDscLst" -> getRepGntDscLst (); 
                case "RepGntEndLst" -> getRepGntEndLst (); 
                case "RepGntGrpDscLst" -> getRepGntGrpDscLst (); 
                case "RepGntGrpLst" -> getRepGntGrpLst (); 
                case "RepGntLayDayLst" -> getRepGntLayDayLst (); 
                case "RepGntLayTssLst" -> getRepGntLayTssLst (); 
                case "RepGntStrLst" -> getRepGntStrLst (); 
                case "RepQryCnvLst" -> getRepQryCnvLst (); 
                case "RepQryFmtRefLst" -> getRepQryFmtRefLst (); 
                case "RepValLst" -> getRepValLst (); 

            default -> null;
        }; // switch

    } // getByFieldName

} // AngDbmTblColImpl
