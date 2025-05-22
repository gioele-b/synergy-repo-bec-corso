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
import net.synergy2.db.dvz.wks.DvzWksQryFmt;
import net.synergy2.db.dvz.wks.DvzWksQryFmtImpl;
import net.synergy2.db.dvz.wks.DvzWksQryPrm;
import net.synergy2.db.dvz.wks.DvzWksQryPrmImpl;

public class AngQryClcColImpl extends AngQryClcCol {

    protected AngQryClcColImpl () { super (); }

    public enum AngQryClcColFields implements ISField {
        Uid, QryUid, ColCod, ColDsc, ColTyp, ColSubTyp, ClcSrcCod, Tsi, Tsu, Rsi, Rsu, ClcMet;
    } // AngQryClcColFields
    
    private static String baseUrl = "/rest/sys/qry/AngQryClcCol";


    @Override public String getModelClassName () { return "AngQryClcColImpl"; }



    private List<DvzWksQryPrm> _DvzQryPrmLst = null;
    public List<DvzWksQryPrm> getDvzQryPrmLst () { return this._DvzQryPrmLst; }
    public AngQryClcCol setDvzQryPrmLst (List<DvzWksQryPrm> obj) { this._DvzQryPrmLst = obj; return this; }
    public AngQryClcCol addDvzQryPrmLst (DvzWksQryPrm obj) {
        if (_DvzQryPrmLst == null) { _DvzQryPrmLst = new ArrayList<> (); }
        _DvzQryPrmLst.add (obj);
        return this;
    } // addDvzQryPrmLst

    private List<DvzWksQryFmt> _DvzQryFmtLst = null;
    public List<DvzWksQryFmt> getDvzQryFmtLst () { return this._DvzQryFmtLst; }
    public AngQryClcCol setDvzQryFmtLst (List<DvzWksQryFmt> obj) { this._DvzQryFmtLst = obj; return this; }
    public AngQryClcCol addDvzQryFmtLst (DvzWksQryFmt obj) {
        if (_DvzQryFmtLst == null) { _DvzQryFmtLst = new ArrayList<> (); }
        _DvzQryFmtLst.add (obj);
        return this;
    } // addDvzQryFmtLst

    private List<DvzWksQryDsgSty> _DvzQryDsgStyLst = null;
    public List<DvzWksQryDsgSty> getDvzQryDsgStyLst () { return this._DvzQryDsgStyLst; }
    public AngQryClcCol setDvzQryDsgStyLst (List<DvzWksQryDsgSty> obj) { this._DvzQryDsgStyLst = obj; return this; }
    public AngQryClcCol addDvzQryDsgStyLst (DvzWksQryDsgSty obj) {
        if (_DvzQryDsgStyLst == null) { _DvzQryDsgStyLst = new ArrayList<> (); }
        _DvzQryDsgStyLst.add (obj);
        return this;
    } // addDvzQryDsgStyLst

    private List<DvzWksQryDsgFlt> _DvzQryDsgFltLst = null;
    public List<DvzWksQryDsgFlt> getDvzQryDsgFltLst () { return this._DvzQryDsgFltLst; }
    public AngQryClcCol setDvzQryDsgFltLst (List<DvzWksQryDsgFlt> obj) { this._DvzQryDsgFltLst = obj; return this; }
    public AngQryClcCol addDvzQryDsgFltLst (DvzWksQryDsgFlt obj) {
        if (_DvzQryDsgFltLst == null) { _DvzQryDsgFltLst = new ArrayList<> (); }
        _DvzQryDsgFltLst.add (obj);
        return this;
    } // addDvzQryDsgFltLst

    private List<DvzWksQryDsgFlt> _DvzQryDsgFltValLst = null;
    public List<DvzWksQryDsgFlt> getDvzQryDsgFltValLst () { return this._DvzQryDsgFltValLst; }
    public AngQryClcCol setDvzQryDsgFltValLst (List<DvzWksQryDsgFlt> obj) { this._DvzQryDsgFltValLst = obj; return this; }
    public AngQryClcCol addDvzQryDsgFltValLst (DvzWksQryDsgFlt obj) {
        if (_DvzQryDsgFltValLst == null) { _DvzQryDsgFltValLst = new ArrayList<> (); }
        _DvzQryDsgFltValLst.add (obj);
        return this;
    } // addDvzQryDsgFltValLst

    private List<DvzWksChrAxx> _DvzChrAxxLst = null;
    public List<DvzWksChrAxx> getDvzChrAxxLst () { return this._DvzChrAxxLst; }
    public AngQryClcCol setDvzChrAxxLst (List<DvzWksChrAxx> obj) { this._DvzChrAxxLst = obj; return this; }
    public AngQryClcCol addDvzChrAxxLst (DvzWksChrAxx obj) {
        if (_DvzChrAxxLst == null) { _DvzChrAxxLst = new ArrayList<> (); }
        _DvzChrAxxLst.add (obj);
        return this;
    } // addDvzChrAxxLst

    private List<DvzWksChrAxx> _DvzChrAxxClrLst = null;
    public List<DvzWksChrAxx> getDvzChrAxxClrLst () { return this._DvzChrAxxClrLst; }
    public AngQryClcCol setDvzChrAxxClrLst (List<DvzWksChrAxx> obj) { this._DvzChrAxxClrLst = obj; return this; }
    public AngQryClcCol addDvzChrAxxClrLst (DvzWksChrAxx obj) {
        if (_DvzChrAxxClrLst == null) { _DvzChrAxxClrLst = new ArrayList<> (); }
        _DvzChrAxxClrLst.add (obj);
        return this;
    } // addDvzChrAxxClrLst

    private List<DvzWksChrAxx> _DvzChrAxxDscLst = null;
    public List<DvzWksChrAxx> getDvzChrAxxDscLst () { return this._DvzChrAxxDscLst; }
    public AngQryClcCol setDvzChrAxxDscLst (List<DvzWksChrAxx> obj) { this._DvzChrAxxDscLst = obj; return this; }
    public AngQryClcCol addDvzChrAxxDscLst (DvzWksChrAxx obj) {
        if (_DvzChrAxxDscLst == null) { _DvzChrAxxDscLst = new ArrayList<> (); }
        _DvzChrAxxDscLst.add (obj);
        return this;
    } // addDvzChrAxxDscLst

    private List<DvzWksChrAxy> _DvzChrAxyLst = null;
    public List<DvzWksChrAxy> getDvzChrAxyLst () { return this._DvzChrAxyLst; }
    public AngQryClcCol setDvzChrAxyLst (List<DvzWksChrAxy> obj) { this._DvzChrAxyLst = obj; return this; }
    public AngQryClcCol addDvzChrAxyLst (DvzWksChrAxy obj) {
        if (_DvzChrAxyLst == null) { _DvzChrAxyLst = new ArrayList<> (); }
        _DvzChrAxyLst.add (obj);
        return this;
    } // addDvzChrAxyLst

    private List<DvzWksGnt> _DvzGntStrLst = null;
    public List<DvzWksGnt> getDvzGntStrLst () { return this._DvzGntStrLst; }
    public AngQryClcCol setDvzGntStrLst (List<DvzWksGnt> obj) { this._DvzGntStrLst = obj; return this; }
    public AngQryClcCol addDvzGntStrLst (DvzWksGnt obj) {
        if (_DvzGntStrLst == null) { _DvzGntStrLst = new ArrayList<> (); }
        _DvzGntStrLst.add (obj);
        return this;
    } // addDvzGntStrLst

    private List<DvzWksGnt> _DvzGntEndLst = null;
    public List<DvzWksGnt> getDvzGntEndLst () { return this._DvzGntEndLst; }
    public AngQryClcCol setDvzGntEndLst (List<DvzWksGnt> obj) { this._DvzGntEndLst = obj; return this; }
    public AngQryClcCol addDvzGntEndLst (DvzWksGnt obj) {
        if (_DvzGntEndLst == null) { _DvzGntEndLst = new ArrayList<> (); }
        _DvzGntEndLst.add (obj);
        return this;
    } // addDvzGntEndLst

    private List<DvzWksGnt> _DvzGntClrLst = null;
    public List<DvzWksGnt> getDvzGntClrLst () { return this._DvzGntClrLst; }
    public AngQryClcCol setDvzGntClrLst (List<DvzWksGnt> obj) { this._DvzGntClrLst = obj; return this; }
    public AngQryClcCol addDvzGntClrLst (DvzWksGnt obj) {
        if (_DvzGntClrLst == null) { _DvzGntClrLst = new ArrayList<> (); }
        _DvzGntClrLst.add (obj);
        return this;
    } // addDvzGntClrLst

    private List<DvzWksGnt> _DvzGntDayLst = null;
    public List<DvzWksGnt> getDvzGntDayLst () { return this._DvzGntDayLst; }
    public AngQryClcCol setDvzGntDayLst (List<DvzWksGnt> obj) { this._DvzGntDayLst = obj; return this; }
    public AngQryClcCol addDvzGntDayLst (DvzWksGnt obj) {
        if (_DvzGntDayLst == null) { _DvzGntDayLst = new ArrayList<> (); }
        _DvzGntDayLst.add (obj);
        return this;
    } // addDvzGntDayLst

    private List<DvzWksGntCol> _DvzGntColLst = null;
    public List<DvzWksGntCol> getDvzGntColLst () { return this._DvzGntColLst; }
    public AngQryClcCol setDvzGntColLst (List<DvzWksGntCol> obj) { this._DvzGntColLst = obj; return this; }
    public AngQryClcCol addDvzGntColLst (DvzWksGntCol obj) {
        if (_DvzGntColLst == null) { _DvzGntColLst = new ArrayList<> (); }
        _DvzGntColLst.add (obj);
        return this;
    } // addDvzGntColLst

    private List<DvzWksGntGrp> _DvzGntGrpLst = null;
    public List<DvzWksGntGrp> getDvzGntGrpLst () { return this._DvzGntGrpLst; }
    public AngQryClcCol setDvzGntGrpLst (List<DvzWksGntGrp> obj) { this._DvzGntGrpLst = obj; return this; }
    public AngQryClcCol addDvzGntGrpLst (DvzWksGntGrp obj) {
        if (_DvzGntGrpLst == null) { _DvzGntGrpLst = new ArrayList<> (); }
        _DvzGntGrpLst.add (obj);
        return this;
    } // addDvzGntGrpLst

    private List<DvzWksGntGrp> _DvzGntGrpDscLst = null;
    public List<DvzWksGntGrp> getDvzGntGrpDscLst () { return this._DvzGntGrpDscLst; }
    public AngQryClcCol setDvzGntGrpDscLst (List<DvzWksGntGrp> obj) { this._DvzGntGrpDscLst = obj; return this; }
    public AngQryClcCol addDvzGntGrpDscLst (DvzWksGntGrp obj) {
        if (_DvzGntGrpDscLst == null) { _DvzGntGrpDscLst = new ArrayList<> (); }
        _DvzGntGrpDscLst.add (obj);
        return this;
    } // addDvzGntGrpDscLst

    private List<DvzWksGntLay> _DvzGntLayTssLst = null;
    public List<DvzWksGntLay> getDvzGntLayTssLst () { return this._DvzGntLayTssLst; }
    public AngQryClcCol setDvzGntLayTssLst (List<DvzWksGntLay> obj) { this._DvzGntLayTssLst = obj; return this; }
    public AngQryClcCol addDvzGntLayTssLst (DvzWksGntLay obj) {
        if (_DvzGntLayTssLst == null) { _DvzGntLayTssLst = new ArrayList<> (); }
        _DvzGntLayTssLst.add (obj);
        return this;
    } // addDvzGntLayTssLst

    private List<DvzWksGntLay> _DvzGntLayDayLst = null;
    public List<DvzWksGntLay> getDvzGntLayDayLst () { return this._DvzGntLayDayLst; }
    public AngQryClcCol setDvzGntLayDayLst (List<DvzWksGntLay> obj) { this._DvzGntLayDayLst = obj; return this; }
    public AngQryClcCol addDvzGntLayDayLst (DvzWksGntLay obj) {
        if (_DvzGntLayDayLst == null) { _DvzGntLayDayLst = new ArrayList<> (); }
        _DvzGntLayDayLst.add (obj);
        return this;
    } // addDvzGntLayDayLst

    private List<DvzWksGnt> _DvzGntLblLftLst = null;
    public List<DvzWksGnt> getDvzGntLblLftLst () { return this._DvzGntLblLftLst; }
    public AngQryClcCol setDvzGntLblLftLst (List<DvzWksGnt> obj) { this._DvzGntLblLftLst = obj; return this; }
    public AngQryClcCol addDvzGntLblLftLst (DvzWksGnt obj) {
        if (_DvzGntLblLftLst == null) { _DvzGntLblLftLst = new ArrayList<> (); }
        _DvzGntLblLftLst.add (obj);
        return this;
    } // addDvzGntLblLftLst

    private List<DvzWksGnt> _DvzGntLblMidLst = null;
    public List<DvzWksGnt> getDvzGntLblMidLst () { return this._DvzGntLblMidLst; }
    public AngQryClcCol setDvzGntLblMidLst (List<DvzWksGnt> obj) { this._DvzGntLblMidLst = obj; return this; }
    public AngQryClcCol addDvzGntLblMidLst (DvzWksGnt obj) {
        if (_DvzGntLblMidLst == null) { _DvzGntLblMidLst = new ArrayList<> (); }
        _DvzGntLblMidLst.add (obj);
        return this;
    } // addDvzGntLblMidLst

    private List<DvzWksGnt> _DvzGntLblRgtLst = null;
    public List<DvzWksGnt> getDvzGntLblRgtLst () { return this._DvzGntLblRgtLst; }
    public AngQryClcCol setDvzGntLblRgtLst (List<DvzWksGnt> obj) { this._DvzGntLblRgtLst = obj; return this; }
    public AngQryClcCol addDvzGntLblRgtLst (DvzWksGnt obj) {
        if (_DvzGntLblRgtLst == null) { _DvzGntLblRgtLst = new ArrayList<> (); }
        _DvzGntLblRgtLst.add (obj);
        return this;
    } // addDvzGntLblRgtLst


    
    @Override public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        switch (fieldName) {
            case "DvzQryPrmLst" -> addDvzQryPrmLst ((DvzWksQryPrmImpl) value); 
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
        str.append ("QryUid[").append (getQryUid ()).append ("] ");
        str.append ("ColCod[").append (getColCod ()).append ("] ");
        str.append ("ColDsc[").append (getColDsc ()).append ("] ");
        if (full) { str.append ("ColTyp[").append (getColTyp ()).append ("] "); }
        if (full) { if (Objects.nonNull (getColSubTyp ())) { str.append ("ColSubTyp[").append (getColSubTyp ()).append ("] "); } }
        if (full) { str.append ("ClcSrcCod[").append (getClcSrcCod ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { str.append ("ClcMet[").append (getClcMet ()).append ("] "); }
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
        if (getQryColLst () != null) { str.append ("\n").append (indent).append ("QryColLst (").append (getQryColLst ().size ()).append ("):"); for (var model : getQryColLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQryColClrLst () != null) { str.append ("\n").append (indent).append ("QryColClrLst (").append (getQryColClrLst ().size ()).append ("):"); for (var model : getQryColClrLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQryColDscLst () != null) { str.append ("\n").append (indent).append ("QryColDscLst (").append (getQryColDscLst ().size ()).append ("):"); for (var model : getQryColDscLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQryColClrBkdLst () != null) { str.append ("\n").append (indent).append ("QryColClrBkdLst (").append (getQryColClrBkdLst ().size ()).append ("):"); for (var model : getQryColClrBkdLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQryFldLst () != null) { str.append ("\n").append (indent).append ("QryFldLst (").append (getQryFldLst ().size ()).append ("):"); for (var model : getQryFldLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysWksPrmDscClcLst () != null) { str.append ("\n").append (indent).append ("SysWksPrmDscClcLst (").append (getSysWksPrmDscClcLst ().size ()).append ("):"); for (var model : getSysWksPrmDscClcLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWksWdgPrmLst () != null) { str.append ("\n").append (indent).append ("WksWdgPrmLst (").append (getWksWdgPrmLst ().size ()).append ("):"); for (var model : getWksWdgPrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQry () != null) { str.append ("\n").append (indent).append ("Qry: \n").append (getQry ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngQryClcColImpl newEmptyInstance () { return (AngQryClcColImpl) newInstance (); }
    
    @Override public AngQryClcColImpl getCopy () {
        return (AngQryClcColImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngQryClcCol _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngQryClcColImpl.baseUrl (); }
    public static String baseUrl () { return AngQryClcColImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngQryClcColImpl.baseUrl = baseUrl; } 

    @Override public List<AngQryClcColFields> getFields () { return Arrays.asList (AngQryClcColFields.values ()); }

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
                case "DvzQryFmtLst" -> getDvzQryFmtLst (); 
                case "DvzQryPrmLst" -> getDvzQryPrmLst (); 

            default -> null;
        }; // switch

    } // getByFieldName

} // AngQryClcColImpl
