package net.synergy2.db.sys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.bec.flt.AngBecFltLng;
import net.synergy2.db.bec.flt.AngBecFltLngImpl;
import net.synergy2.db.dvz.rep.DvzChrMacTypLng;
import net.synergy2.db.dvz.rep.DvzChrMacTypLngImpl;
import net.synergy2.db.dvz.rep.DvzChrTypLng;
import net.synergy2.db.dvz.rep.DvzChrTypLngImpl;
import net.synergy2.db.dvz.rep.DvzGntLayTypLng;
import net.synergy2.db.dvz.rep.DvzGntLayTypLngImpl;
import net.synergy2.db.dvz.rep.DvzRepChrAxyLng;
import net.synergy2.db.dvz.rep.DvzRepChrAxyLngImpl;
import net.synergy2.db.dvz.rep.DvzRepChrLng;
import net.synergy2.db.dvz.rep.DvzRepChrLngImpl;
import net.synergy2.db.dvz.rep.DvzRepGntLayLng;
import net.synergy2.db.dvz.rep.DvzRepGntLayLngImpl;
import net.synergy2.db.dvz.rep.DvzRepGntLng;
import net.synergy2.db.dvz.rep.DvzRepGntLngImpl;
import net.synergy2.db.dvz.rep.DvzRepLng;
import net.synergy2.db.dvz.rep.DvzRepLngImpl;
import net.synergy2.db.dvz.rep.DvzRepQryDsgLng;
import net.synergy2.db.dvz.rep.DvzRepQryDsgLngImpl;
import net.synergy2.db.dvz.rep.DvzRepQryDsgStyLng;
import net.synergy2.db.dvz.rep.DvzRepQryDsgStyLngImpl;
import net.synergy2.db.dvz.rep.DvzRepQryLng;
import net.synergy2.db.dvz.rep.DvzRepQryLngImpl;
import net.synergy2.db.dvz.wks.AngDvzChrMacTypLng;
import net.synergy2.db.dvz.wks.AngDvzChrMacTypLngImpl;
import net.synergy2.db.dvz.wks.AngDvzChrTypLng;
import net.synergy2.db.dvz.wks.AngDvzChrTypLngImpl;
import net.synergy2.db.dvz.wks.AngDvzGntLayTypLng;
import net.synergy2.db.dvz.wks.AngDvzGntLayTypLngImpl;
import net.synergy2.db.dvz.wks.DvzWksChrAxyLng;
import net.synergy2.db.dvz.wks.DvzWksChrAxyLngImpl;
import net.synergy2.db.dvz.wks.DvzWksGntLayLng;
import net.synergy2.db.dvz.wks.DvzWksGntLayLngImpl;
import net.synergy2.db.dvz.wks.DvzWksQryDsgLng;
import net.synergy2.db.dvz.wks.DvzWksQryDsgLngImpl;
import net.synergy2.db.dvz.wks.DvzWksQryDsgStyLng;
import net.synergy2.db.dvz.wks.DvzWksQryDsgStyLngImpl;
import net.synergy2.db.dvz.wks.DvzWksQryLng;
import net.synergy2.db.dvz.wks.DvzWksQryLngImpl;

public class AngLngImpl extends AngLng {

    protected AngLngImpl () { super (); }

    public enum AngLngFields implements ISField {
        Uid, LngCod, LngTyp, LngDsc, LngIsoCod, LngStd, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, LngForUif;
    } // AngLngFields
    
    private static String baseUrl = "/rest/sys/AngLng";


    @Override public String getModelClassName () { return "AngLngImpl"; }



    private List<AngDvzChrMacTypLng> _AngDvzChrMacTypLst = null;
    public List<AngDvzChrMacTypLng> getAngDvzChrMacTypLst () { return this._AngDvzChrMacTypLst; }
    public AngLng setAngDvzChrMacTypLst (List<AngDvzChrMacTypLng> obj) { this._AngDvzChrMacTypLst = obj; return this; }
    public AngLng addAngDvzChrMacTypLst (AngDvzChrMacTypLng obj) {
        if (_AngDvzChrMacTypLst == null) { _AngDvzChrMacTypLst = new ArrayList<> (); }
        _AngDvzChrMacTypLst.add (obj);
        return this;
    } // addAngDvzChrMacTypLst

    private List<AngDvzChrTypLng> _AngDvzChrTypLst = null;
    public List<AngDvzChrTypLng> getAngDvzChrTypLst () { return this._AngDvzChrTypLst; }
    public AngLng setAngDvzChrTypLst (List<AngDvzChrTypLng> obj) { this._AngDvzChrTypLst = obj; return this; }
    public AngLng addAngDvzChrTypLst (AngDvzChrTypLng obj) {
        if (_AngDvzChrTypLst == null) { _AngDvzChrTypLst = new ArrayList<> (); }
        _AngDvzChrTypLst.add (obj);
        return this;
    } // addAngDvzChrTypLst

    private List<AngDvzGntLayTypLng> _AngDvzGntLayTypLst = null;
    public List<AngDvzGntLayTypLng> getAngDvzGntLayTypLst () { return this._AngDvzGntLayTypLst; }
    public AngLng setAngDvzGntLayTypLst (List<AngDvzGntLayTypLng> obj) { this._AngDvzGntLayTypLst = obj; return this; }
    public AngLng addAngDvzGntLayTypLst (AngDvzGntLayTypLng obj) {
        if (_AngDvzGntLayTypLst == null) { _AngDvzGntLayTypLst = new ArrayList<> (); }
        _AngDvzGntLayTypLst.add (obj);
        return this;
    } // addAngDvzGntLayTypLst

    private List<DvzWksQryLng> _DvzWksQryLst = null;
    public List<DvzWksQryLng> getDvzWksQryLst () { return this._DvzWksQryLst; }
    public AngLng setDvzWksQryLst (List<DvzWksQryLng> obj) { this._DvzWksQryLst = obj; return this; }
    public AngLng addDvzWksQryLst (DvzWksQryLng obj) {
        if (_DvzWksQryLst == null) { _DvzWksQryLst = new ArrayList<> (); }
        _DvzWksQryLst.add (obj);
        return this;
    } // addDvzWksQryLst

    private List<DvzWksQryDsgLng> _DvzWksQryDsgLst = null;
    public List<DvzWksQryDsgLng> getDvzWksQryDsgLst () { return this._DvzWksQryDsgLst; }
    public AngLng setDvzWksQryDsgLst (List<DvzWksQryDsgLng> obj) { this._DvzWksQryDsgLst = obj; return this; }
    public AngLng addDvzWksQryDsgLst (DvzWksQryDsgLng obj) {
        if (_DvzWksQryDsgLst == null) { _DvzWksQryDsgLst = new ArrayList<> (); }
        _DvzWksQryDsgLst.add (obj);
        return this;
    } // addDvzWksQryDsgLst

    private List<DvzWksQryDsgStyLng> _DvzWksQryDsgStyLst = null;
    public List<DvzWksQryDsgStyLng> getDvzWksQryDsgStyLst () { return this._DvzWksQryDsgStyLst; }
    public AngLng setDvzWksQryDsgStyLst (List<DvzWksQryDsgStyLng> obj) { this._DvzWksQryDsgStyLst = obj; return this; }
    public AngLng addDvzWksQryDsgStyLst (DvzWksQryDsgStyLng obj) {
        if (_DvzWksQryDsgStyLst == null) { _DvzWksQryDsgStyLst = new ArrayList<> (); }
        _DvzWksQryDsgStyLst.add (obj);
        return this;
    } // addDvzWksQryDsgStyLst

    private List<DvzWksChrAxyLng> _DvzWksChrAxyLst = null;
    public List<DvzWksChrAxyLng> getDvzWksChrAxyLst () { return this._DvzWksChrAxyLst; }
    public AngLng setDvzWksChrAxyLst (List<DvzWksChrAxyLng> obj) { this._DvzWksChrAxyLst = obj; return this; }
    public AngLng addDvzWksChrAxyLst (DvzWksChrAxyLng obj) {
        if (_DvzWksChrAxyLst == null) { _DvzWksChrAxyLst = new ArrayList<> (); }
        _DvzWksChrAxyLst.add (obj);
        return this;
    } // addDvzWksChrAxyLst

    private List<DvzWksGntLayLng> _DvzWksGntLayLst = null;
    public List<DvzWksGntLayLng> getDvzWksGntLayLst () { return this._DvzWksGntLayLst; }
    public AngLng setDvzWksGntLayLst (List<DvzWksGntLayLng> obj) { this._DvzWksGntLayLst = obj; return this; }
    public AngLng addDvzWksGntLayLst (DvzWksGntLayLng obj) {
        if (_DvzWksGntLayLst == null) { _DvzWksGntLayLst = new ArrayList<> (); }
        _DvzWksGntLayLst.add (obj);
        return this;
    } // addDvzWksGntLayLst

    private List<AngBecFltLng> _AngBecFltLst = null;
    public List<AngBecFltLng> getAngBecFltLst () { return this._AngBecFltLst; }
    public AngLng setAngBecFltLst (List<AngBecFltLng> obj) { this._AngBecFltLst = obj; return this; }
    public AngLng addAngBecFltLst (AngBecFltLng obj) {
        if (_AngBecFltLst == null) { _AngBecFltLst = new ArrayList<> (); }
        _AngBecFltLst.add (obj);
        return this;
    } // addAngBecFltLst

    private List<DvzRepLng> _DvzRepLst = null;
    public List<DvzRepLng> getDvzRepLst () { return this._DvzRepLst; }
    public AngLng setDvzRepLst (List<DvzRepLng> obj) { this._DvzRepLst = obj; return this; }
    public AngLng addDvzRepLst (DvzRepLng obj) {
        if (_DvzRepLst == null) { _DvzRepLst = new ArrayList<> (); }
        _DvzRepLst.add (obj);
        return this;
    } // addDvzRepLst

    private List<DvzRepQryLng> _DvzRepQryLst = null;
    public List<DvzRepQryLng> getDvzRepQryLst () { return this._DvzRepQryLst; }
    public AngLng setDvzRepQryLst (List<DvzRepQryLng> obj) { this._DvzRepQryLst = obj; return this; }
    public AngLng addDvzRepQryLst (DvzRepQryLng obj) {
        if (_DvzRepQryLst == null) { _DvzRepQryLst = new ArrayList<> (); }
        _DvzRepQryLst.add (obj);
        return this;
    } // addDvzRepQryLst

    private List<DvzRepQryDsgLng> _DvzRepQryDsgLst = null;
    public List<DvzRepQryDsgLng> getDvzRepQryDsgLst () { return this._DvzRepQryDsgLst; }
    public AngLng setDvzRepQryDsgLst (List<DvzRepQryDsgLng> obj) { this._DvzRepQryDsgLst = obj; return this; }
    public AngLng addDvzRepQryDsgLst (DvzRepQryDsgLng obj) {
        if (_DvzRepQryDsgLst == null) { _DvzRepQryDsgLst = new ArrayList<> (); }
        _DvzRepQryDsgLst.add (obj);
        return this;
    } // addDvzRepQryDsgLst

    private List<DvzRepQryDsgStyLng> _DvzRepQryDsgStyLst = null;
    public List<DvzRepQryDsgStyLng> getDvzRepQryDsgStyLst () { return this._DvzRepQryDsgStyLst; }
    public AngLng setDvzRepQryDsgStyLst (List<DvzRepQryDsgStyLng> obj) { this._DvzRepQryDsgStyLst = obj; return this; }
    public AngLng addDvzRepQryDsgStyLst (DvzRepQryDsgStyLng obj) {
        if (_DvzRepQryDsgStyLst == null) { _DvzRepQryDsgStyLst = new ArrayList<> (); }
        _DvzRepQryDsgStyLst.add (obj);
        return this;
    } // addDvzRepQryDsgStyLst

    private List<DvzRepChrLng> _DvzRepChrLst = null;
    public List<DvzRepChrLng> getDvzRepChrLst () { return this._DvzRepChrLst; }
    public AngLng setDvzRepChrLst (List<DvzRepChrLng> obj) { this._DvzRepChrLst = obj; return this; }
    public AngLng addDvzRepChrLst (DvzRepChrLng obj) {
        if (_DvzRepChrLst == null) { _DvzRepChrLst = new ArrayList<> (); }
        _DvzRepChrLst.add (obj);
        return this;
    } // addDvzRepChrLst

    private List<DvzRepChrAxyLng> _DvzRepChrAxyLst = null;
    public List<DvzRepChrAxyLng> getDvzRepChrAxyLst () { return this._DvzRepChrAxyLst; }
    public AngLng setDvzRepChrAxyLst (List<DvzRepChrAxyLng> obj) { this._DvzRepChrAxyLst = obj; return this; }
    public AngLng addDvzRepChrAxyLst (DvzRepChrAxyLng obj) {
        if (_DvzRepChrAxyLst == null) { _DvzRepChrAxyLst = new ArrayList<> (); }
        _DvzRepChrAxyLst.add (obj);
        return this;
    } // addDvzRepChrAxyLst

    private List<DvzChrTypLng> _DvzChrTypLst = null;
    public List<DvzChrTypLng> getDvzChrTypLst () { return this._DvzChrTypLst; }
    public AngLng setDvzChrTypLst (List<DvzChrTypLng> obj) { this._DvzChrTypLst = obj; return this; }
    public AngLng addDvzChrTypLst (DvzChrTypLng obj) {
        if (_DvzChrTypLst == null) { _DvzChrTypLst = new ArrayList<> (); }
        _DvzChrTypLst.add (obj);
        return this;
    } // addDvzChrTypLst

    private List<DvzRepGntLng> _DvzRepGntLst = null;
    public List<DvzRepGntLng> getDvzRepGntLst () { return this._DvzRepGntLst; }
    public AngLng setDvzRepGntLst (List<DvzRepGntLng> obj) { this._DvzRepGntLst = obj; return this; }
    public AngLng addDvzRepGntLst (DvzRepGntLng obj) {
        if (_DvzRepGntLst == null) { _DvzRepGntLst = new ArrayList<> (); }
        _DvzRepGntLst.add (obj);
        return this;
    } // addDvzRepGntLst

    private List<DvzGntLayTypLng> _DvzGntLayTypLst = null;
    public List<DvzGntLayTypLng> getDvzGntLayTypLst () { return this._DvzGntLayTypLst; }
    public AngLng setDvzGntLayTypLst (List<DvzGntLayTypLng> obj) { this._DvzGntLayTypLst = obj; return this; }
    public AngLng addDvzGntLayTypLst (DvzGntLayTypLng obj) {
        if (_DvzGntLayTypLst == null) { _DvzGntLayTypLst = new ArrayList<> (); }
        _DvzGntLayTypLst.add (obj);
        return this;
    } // addDvzGntLayTypLst

    private List<DvzRepGntLayLng> _DvzRepGntLayLst = null;
    public List<DvzRepGntLayLng> getDvzRepGntLayLst () { return this._DvzRepGntLayLst; }
    public AngLng setDvzRepGntLayLst (List<DvzRepGntLayLng> obj) { this._DvzRepGntLayLst = obj; return this; }
    public AngLng addDvzRepGntLayLst (DvzRepGntLayLng obj) {
        if (_DvzRepGntLayLst == null) { _DvzRepGntLayLst = new ArrayList<> (); }
        _DvzRepGntLayLst.add (obj);
        return this;
    } // addDvzRepGntLayLst

    private List<DvzChrMacTypLng> _DvzChrMacTypLst = null;
    public List<DvzChrMacTypLng> getDvzChrMacTypLst () { return this._DvzChrMacTypLst; }
    public AngLng setDvzChrMacTypLst (List<DvzChrMacTypLng> obj) { this._DvzChrMacTypLst = obj; return this; }
    public AngLng addDvzChrMacTypLst (DvzChrMacTypLng obj) {
        if (_DvzChrMacTypLst == null) { _DvzChrMacTypLst = new ArrayList<> (); }
        _DvzChrMacTypLst.add (obj);
        return this;
    } // addDvzChrMacTypLst


    
    @Override public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        switch (fieldName) {
            case "AngDvzChrMacTypLst" -> addAngDvzChrMacTypLst ((AngDvzChrMacTypLngImpl) value); 
            case "AngDvzChrTypLst" -> addAngDvzChrTypLst ((AngDvzChrTypLngImpl) value); 
            case "AngDvzGntLayTypLst" -> addAngDvzGntLayTypLst ((AngDvzGntLayTypLngImpl) value); 
            case "DvzWksQryLst" -> addDvzWksQryLst ((DvzWksQryLngImpl) value); 
            case "DvzWksQryDsgLst" -> addDvzWksQryDsgLst ((DvzWksQryDsgLngImpl) value); 
            case "DvzWksQryDsgStyLst" -> addDvzWksQryDsgStyLst ((DvzWksQryDsgStyLngImpl) value); 
            case "DvzWksChrAxyLst" -> addDvzWksChrAxyLst ((DvzWksChrAxyLngImpl) value); 
            case "DvzWksGntLayLst" -> addDvzWksGntLayLst ((DvzWksGntLayLngImpl) value); 
            case "AngBecFltLst" -> addAngBecFltLst ((AngBecFltLngImpl) value); 
            case "DvzRepLst" -> addDvzRepLst ((DvzRepLngImpl) value); 
            case "DvzRepQryLst" -> addDvzRepQryLst ((DvzRepQryLngImpl) value); 
            case "DvzRepQryDsgLst" -> addDvzRepQryDsgLst ((DvzRepQryDsgLngImpl) value); 
            case "DvzRepQryDsgStyLst" -> addDvzRepQryDsgStyLst ((DvzRepQryDsgStyLngImpl) value); 
            case "DvzRepChrLst" -> addDvzRepChrLst ((DvzRepChrLngImpl) value); 
            case "DvzRepChrAxyLst" -> addDvzRepChrAxyLst ((DvzRepChrAxyLngImpl) value); 
            case "DvzChrTypLst" -> addDvzChrTypLst ((DvzChrTypLngImpl) value); 
            case "DvzRepGntLst" -> addDvzRepGntLst ((DvzRepGntLngImpl) value); 
            case "DvzGntLayTypLst" -> addDvzGntLayTypLst ((DvzGntLayTypLngImpl) value); 
            case "DvzRepGntLayLst" -> addDvzRepGntLayLst ((DvzRepGntLayLngImpl) value); 
            case "DvzChrMacTypLst" -> addDvzChrMacTypLst ((DvzChrMacTypLngImpl) value); 

            default -> {
                if (!settedSuper) { throw new SQueryException ("No reference specification found for field [" + fieldName + "]."); }
            }
        } // switch
        return true;
    } // set
    
    @Override public String debug (boolean full, boolean cascade, String indent) {
        StringBuilder str = new StringBuilder (indent).append (getModelClassName ()).append (" = {");
        str.append ("Uid[").append (getUid ()).append ("] ");
        str.append ("LngCod[").append (getLngCod ()).append ("] ");
        str.append ("LngTyp[").append (getLngTyp ()).append ("] ");
        str.append ("LngDsc[").append (getLngDsc ()).append ("] ");
        if (full) { str.append ("LngIsoCod[").append (getLngIsoCod ()).append ("] "); }
        if (full) { str.append ("LngStd[").append (getLngStd ()).append ("] "); }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { str.append ("LngForUif[").append (getLngForUif ()).append ("] "); }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getAngCurLst () != null) { str.append ("\n").append (indent).append ("AngCurLst (").append (getAngCurLst ().size ()).append ("):"); for (var model : getAngCurLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngAddTypLst () != null) { str.append ("\n").append (indent).append ("AngAddTypLst (").append (getAngAddTypLst ().size ()).append ("):"); for (var model : getAngAddTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngZonLst () != null) { str.append ("\n").append (indent).append ("AngZonLst (").append (getAngZonLst ().size ()).append ("):"); for (var model : getAngZonLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngPlcLst () != null) { str.append ("\n").append (indent).append ("AngPlcLst (").append (getAngPlcLst ().size ()).append ("):"); for (var model : getAngPlcLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngBnkLst () != null) { str.append ("\n").append (indent).append ("AngBnkLst (").append (getAngBnkLst ().size ()).append ("):"); for (var model : getAngBnkLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngUniMeaTmpLst () != null) { str.append ("\n").append (indent).append ("AngUniMeaTmpLst (").append (getAngUniMeaTmpLst ().size ()).append ("):"); for (var model : getAngUniMeaTmpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCauMovTmpLst () != null) { str.append ("\n").append (indent).append ("AngCauMovTmpLst (").append (getAngCauMovTmpLst ().size ()).append ("):"); for (var model : getAngCauMovTmpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngPayMetLst () != null) { str.append ("\n").append (indent).append ("AngPayMetLst (").append (getAngPayMetLst ().size ()).append ("):"); for (var model : getAngPayMetLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngShpMetLst () != null) { str.append ("\n").append (indent).append ("AngShpMetLst (").append (getAngShpMetLst ().size ()).append ("):"); for (var model : getAngShpMetLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngTrpMetLst () != null) { str.append ("\n").append (indent).append ("AngTrpMetLst (").append (getAngTrpMetLst ().size ()).append ("):"); for (var model : getAngTrpMetLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngPckLst () != null) { str.append ("\n").append (indent).append ("AngPckLst (").append (getAngPckLst ().size ()).append ("):"); for (var model : getAngPckLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngPayTypLst () != null) { str.append ("\n").append (indent).append ("AngPayTypLst (").append (getAngPayTypLst ().size ()).append ("):"); for (var model : getAngPayTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngVatLst () != null) { str.append ("\n").append (indent).append ("AngVatLst (").append (getAngVatLst ().size ()).append ("):"); for (var model : getAngVatLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngPlnLst () != null) { str.append ("\n").append (indent).append ("AngPlnLst (").append (getAngPlnLst ().size ()).append ("):"); for (var model : getAngPlnLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysTraMsgLst () != null) { str.append ("\n").append (indent).append ("SysTraMsgLst (").append (getSysTraMsgLst ().size ()).append ("):"); for (var model : getSysTraMsgLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysTraLblLst () != null) { str.append ("\n").append (indent).append ("SysTraLblLst (").append (getSysTraLblLst ().size ()).append ("):"); for (var model : getSysTraLblLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngRskLvlLst () != null) { str.append ("\n").append (indent).append ("AngRskLvlLst (").append (getAngRskLvlLst ().size ()).append ("):"); for (var model : getAngRskLvlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngRskLvlCatLst () != null) { str.append ("\n").append (indent).append ("AngRskLvlCatLst (").append (getAngRskLvlCatLst ().size ()).append ("):"); for (var model : getAngRskLvlCatLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngSysActLst () != null) { str.append ("\n").append (indent).append ("AngSysActLst (").append (getAngSysActLst ().size ()).append ("):"); for (var model : getAngSysActLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysActGrpLst () != null) { str.append ("\n").append (indent).append ("SysActGrpLst (").append (getSysActGrpLst ().size ()).append ("):"); for (var model : getSysActGrpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngEtlSrvLst () != null) { str.append ("\n").append (indent).append ("AngEtlSrvLst (").append (getAngEtlSrvLst ().size ()).append ("):"); for (var model : getAngEtlSrvLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngEtlJobLst () != null) { str.append ("\n").append (indent).append ("AngEtlJobLst (").append (getAngEtlJobLst ().size ()).append ("):"); for (var model : getAngEtlJobLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngEtlJobPrmLst () != null) { str.append ("\n").append (indent).append ("AngEtlJobPrmLst (").append (getAngEtlJobPrmLst ().size ()).append ("):"); for (var model : getAngEtlJobPrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngResMacTypLst () != null) { str.append ("\n").append (indent).append ("AngResMacTypLst (").append (getAngResMacTypLst ().size ()).append ("):"); for (var model : getAngResMacTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngResTypLst () != null) { str.append ("\n").append (indent).append ("AngResTypLst (").append (getAngResTypLst ().size ()).append ("):"); for (var model : getAngResTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngBdgTypLst () != null) { str.append ("\n").append (indent).append ("AngBdgTypLst (").append (getAngBdgTypLst ().size ()).append ("):"); for (var model : getAngBdgTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngSalLst () != null) { str.append ("\n").append (indent).append ("AngSalLst (").append (getAngSalLst ().size ()).append ("):"); for (var model : getAngSalLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngGrpLst () != null) { str.append ("\n").append (indent).append ("AngGrpLst (").append (getAngGrpLst ().size ()).append ("):"); for (var model : getAngGrpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngGrpCatLst () != null) { str.append ("\n").append (indent).append ("AngGrpCatLst (").append (getAngGrpCatLst ().size ()).append ("):"); for (var model : getAngGrpCatLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngOrgRolLst () != null) { str.append ("\n").append (indent).append ("AngOrgRolLst (").append (getAngOrgRolLst ().size ()).append ("):"); for (var model : getAngOrgRolLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngOrgTypLst () != null) { str.append ("\n").append (indent).append ("AngOrgTypLst (").append (getAngOrgTypLst ().size ()).append ("):"); for (var model : getAngOrgTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngBusUniLst () != null) { str.append ("\n").append (indent).append ("AngBusUniLst (").append (getAngBusUniLst ().size ()).append ("):"); for (var model : getAngBusUniLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngRolLst () != null) { str.append ("\n").append (indent).append ("AngRolLst (").append (getAngRolLst ().size ()).append ("):"); for (var model : getAngRolLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCstCenLst () != null) { str.append ("\n").append (indent).append ("AngCstCenLst (").append (getAngCstCenLst ().size ()).append ("):"); for (var model : getAngCstCenLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCstCenTypLst () != null) { str.append ("\n").append (indent).append ("AngCstCenTypLst (").append (getAngCstCenTypLst ().size ()).append ("):"); for (var model : getAngCstCenTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngWrcLst () != null) { str.append ("\n").append (indent).append ("AngWrcLst (").append (getAngWrcLst ().size ()).append ("):"); for (var model : getAngWrcLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCstRatLst () != null) { str.append ("\n").append (indent).append ("AngCstRatLst (").append (getAngCstRatLst ().size ()).append ("):"); for (var model : getAngCstRatLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmLst () != null) { str.append ("\n").append (indent).append ("AngItmLst (").append (getAngItmLst ().size ()).append ("):"); for (var model : getAngItmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngPrdCycTypLst () != null) { str.append ("\n").append (indent).append ("AngPrdCycTypLst (").append (getAngPrdCycTypLst ().size ()).append ("):"); for (var model : getAngPrdCycTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getItmSerNumLst () != null) { str.append ("\n").append (indent).append ("ItmSerNumLst (").append (getItmSerNumLst ().size ()).append ("):"); for (var model : getItmSerNumLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls001Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls001Lst (").append (getAngItmCls001Lst ().size ()).append ("):"); for (var model : getAngItmCls001Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls002Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls002Lst (").append (getAngItmCls002Lst ().size ()).append ("):"); for (var model : getAngItmCls002Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls003Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls003Lst (").append (getAngItmCls003Lst ().size ()).append ("):"); for (var model : getAngItmCls003Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls004Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls004Lst (").append (getAngItmCls004Lst ().size ()).append ("):"); for (var model : getAngItmCls004Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls005Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls005Lst (").append (getAngItmCls005Lst ().size ()).append ("):"); for (var model : getAngItmCls005Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls006Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls006Lst (").append (getAngItmCls006Lst ().size ()).append ("):"); for (var model : getAngItmCls006Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls007Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls007Lst (").append (getAngItmCls007Lst ().size ()).append ("):"); for (var model : getAngItmCls007Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls008Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls008Lst (").append (getAngItmCls008Lst ().size ()).append ("):"); for (var model : getAngItmCls008Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls009Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls009Lst (").append (getAngItmCls009Lst ().size ()).append ("):"); for (var model : getAngItmCls009Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls010Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls010Lst (").append (getAngItmCls010Lst ().size ()).append ("):"); for (var model : getAngItmCls010Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls011Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls011Lst (").append (getAngItmCls011Lst ().size ()).append ("):"); for (var model : getAngItmCls011Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls012Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls012Lst (").append (getAngItmCls012Lst ().size ()).append ("):"); for (var model : getAngItmCls012Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls013Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls013Lst (").append (getAngItmCls013Lst ().size ()).append ("):"); for (var model : getAngItmCls013Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls014Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls014Lst (").append (getAngItmCls014Lst ().size ()).append ("):"); for (var model : getAngItmCls014Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls015Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls015Lst (").append (getAngItmCls015Lst ().size ()).append ("):"); for (var model : getAngItmCls015Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls016Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls016Lst (").append (getAngItmCls016Lst ().size ()).append ("):"); for (var model : getAngItmCls016Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls017Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls017Lst (").append (getAngItmCls017Lst ().size ()).append ("):"); for (var model : getAngItmCls017Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls018Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls018Lst (").append (getAngItmCls018Lst ().size ()).append ("):"); for (var model : getAngItmCls018Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls019Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls019Lst (").append (getAngItmCls019Lst ().size ()).append ("):"); for (var model : getAngItmCls019Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls020Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls020Lst (").append (getAngItmCls020Lst ().size ()).append ("):"); for (var model : getAngItmCls020Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls021Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls021Lst (").append (getAngItmCls021Lst ().size ()).append ("):"); for (var model : getAngItmCls021Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls022Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls022Lst (").append (getAngItmCls022Lst ().size ()).append ("):"); for (var model : getAngItmCls022Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls023Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls023Lst (").append (getAngItmCls023Lst ().size ()).append ("):"); for (var model : getAngItmCls023Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls024Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls024Lst (").append (getAngItmCls024Lst ().size ()).append ("):"); for (var model : getAngItmCls024Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls025Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls025Lst (").append (getAngItmCls025Lst ().size ()).append ("):"); for (var model : getAngItmCls025Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls026Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls026Lst (").append (getAngItmCls026Lst ().size ()).append ("):"); for (var model : getAngItmCls026Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls027Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls027Lst (").append (getAngItmCls027Lst ().size ()).append ("):"); for (var model : getAngItmCls027Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls028Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls028Lst (").append (getAngItmCls028Lst ().size ()).append ("):"); for (var model : getAngItmCls028Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls029Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls029Lst (").append (getAngItmCls029Lst ().size ()).append ("):"); for (var model : getAngItmCls029Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCls030Lst () != null) { str.append ("\n").append (indent).append ("AngItmCls030Lst (").append (getAngItmCls030Lst ().size ()).append ("):"); for (var model : getAngItmCls030Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmClsMul001Lst () != null) { str.append ("\n").append (indent).append ("AngItmClsMul001Lst (").append (getAngItmClsMul001Lst ().size ()).append ("):"); for (var model : getAngItmClsMul001Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmClsMul002Lst () != null) { str.append ("\n").append (indent).append ("AngItmClsMul002Lst (").append (getAngItmClsMul002Lst ().size ()).append ("):"); for (var model : getAngItmClsMul002Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmClsMul003Lst () != null) { str.append ("\n").append (indent).append ("AngItmClsMul003Lst (").append (getAngItmClsMul003Lst ().size ()).append ("):"); for (var model : getAngItmClsMul003Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmClsMul004Lst () != null) { str.append ("\n").append (indent).append ("AngItmClsMul004Lst (").append (getAngItmClsMul004Lst ().size ()).append ("):"); for (var model : getAngItmClsMul004Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmClsMul005Lst () != null) { str.append ("\n").append (indent).append ("AngItmClsMul005Lst (").append (getAngItmClsMul005Lst ().size ()).append ("):"); for (var model : getAngItmClsMul005Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmStsLst () != null) { str.append ("\n").append (indent).append ("AngItmStsLst (").append (getAngItmStsLst ().size ()).append ("):"); for (var model : getAngItmStsLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngPrdWrkLst () != null) { str.append ("\n").append (indent).append ("AngPrdWrkLst (").append (getAngPrdWrkLst ().size ()).append ("):"); for (var model : getAngPrdWrkLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngPrdPrcLst () != null) { str.append ("\n").append (indent).append ("AngPrdPrcLst (").append (getAngPrdPrcLst ().size ()).append ("):"); for (var model : getAngPrdPrcLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngPrdWrkCatLst () != null) { str.append ("\n").append (indent).append ("AngPrdWrkCatLst (").append (getAngPrdWrkCatLst ().size ()).append ("):"); for (var model : getAngPrdWrkCatLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngUniMeaLst () != null) { str.append ("\n").append (indent).append ("AngUniMeaLst (").append (getAngUniMeaLst ().size ()).append ("):"); for (var model : getAngUniMeaLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmCatLst () != null) { str.append ("\n").append (indent).append ("AngItmCatLst (").append (getAngItmCatLst ().size ()).append ("):"); for (var model : getAngItmCatLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngBomLnkTypLst () != null) { str.append ("\n").append (indent).append ("AngBomLnkTypLst (").append (getAngBomLnkTypLst ().size ()).append ("):"); for (var model : getAngBomLnkTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmTypPrdLst () != null) { str.append ("\n").append (indent).append ("AngItmTypPrdLst (").append (getAngItmTypPrdLst ().size ()).append ("):"); for (var model : getAngItmTypPrdLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmOwnLst () != null) { str.append ("\n").append (indent).append ("AngItmOwnLst (").append (getAngItmOwnLst ().size ()).append ("):"); for (var model : getAngItmOwnLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmTypDimLst () != null) { str.append ("\n").append (indent).append ("AngItmTypDimLst (").append (getAngItmTypDimLst ().size ()).append ("):"); for (var model : getAngItmTypDimLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngUniMeaCatLst () != null) { str.append ("\n").append (indent).append ("AngUniMeaCatLst (").append (getAngUniMeaCatLst ().size ()).append ("):"); for (var model : getAngUniMeaCatLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngPrdVrnCatLst () != null) { str.append ("\n").append (indent).append ("AngPrdVrnCatLst (").append (getAngPrdVrnCatLst ().size ()).append ("):"); for (var model : getAngPrdVrnCatLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngPrdVrnLst () != null) { str.append ("\n").append (indent).append ("AngPrdVrnLst (").append (getAngPrdVrnLst ().size ()).append ("):"); for (var model : getAngPrdVrnLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmMdlLst () != null) { str.append ("\n").append (indent).append ("AngItmMdlLst (").append (getAngItmMdlLst ().size ()).append ("):"); for (var model : getAngItmMdlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysAppLst () != null) { str.append ("\n").append (indent).append ("SysAppLst (").append (getSysAppLst ().size ()).append ("):"); for (var model : getSysAppLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysCtxLst () != null) { str.append ("\n").append (indent).append ("SysCtxLst (").append (getSysCtxLst ().size ()).append ("):"); for (var model : getSysCtxLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysFrmLst () != null) { str.append ("\n").append (indent).append ("SysFrmLst (").append (getSysFrmLst ().size ()).append ("):"); for (var model : getSysFrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysPrmLst () != null) { str.append ("\n").append (indent).append ("SysPrmLst (").append (getSysPrmLst ().size ()).append ("):"); for (var model : getSysPrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngSrcPrpLst () != null) { str.append ("\n").append (indent).append ("AngSrcPrpLst (").append (getAngSrcPrpLst ().size ()).append ("):"); for (var model : getAngSrcPrpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDefWzdLst () != null) { str.append ("\n").append (indent).append ("DefWzdLst (").append (getDefWzdLst ().size ()).append ("):"); for (var model : getDefWzdLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDefWzdStpLst () != null) { str.append ("\n").append (indent).append ("DefWzdStpLst (").append (getDefWzdStpLst ().size ()).append ("):"); for (var model : getDefWzdStpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngLstLst () != null) { str.append ("\n").append (indent).append ("AngLstLst (").append (getAngLstLst ().size ()).append ("):"); for (var model : getAngLstLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngLstValLst () != null) { str.append ("\n").append (indent).append ("AngLstValLst (").append (getAngLstValLst ().size ()).append ("):"); for (var model : getAngLstValLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngLstRemLst () != null) { str.append ("\n").append (indent).append ("AngLstRemLst (").append (getAngLstRemLst ().size ()).append ("):"); for (var model : getAngLstRemLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngEtyLnkTypLst () != null) { str.append ("\n").append (indent).append ("AngEtyLnkTypLst (").append (getAngEtyLnkTypLst ().size ()).append ("):"); for (var model : getAngEtyLnkTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngEtyAttTypLst () != null) { str.append ("\n").append (indent).append ("AngEtyAttTypLst (").append (getAngEtyAttTypLst ().size ()).append ("):"); for (var model : getAngEtyAttTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngEtyAttCatLst () != null) { str.append ("\n").append (indent).append ("AngEtyAttCatLst (").append (getAngEtyAttCatLst ().size ()).append ("):"); for (var model : getAngEtyAttCatLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngQryLst () != null) { str.append ("\n").append (indent).append ("AngQryLst (").append (getAngQryLst ().size ()).append ("):"); for (var model : getAngQryLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngQryLytLst () != null) { str.append ("\n").append (indent).append ("AngQryLytLst (").append (getAngQryLytLst ().size ()).append ("):"); for (var model : getAngQryLytLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngScmSrcTypLst () != null) { str.append ("\n").append (indent).append ("AngScmSrcTypLst (").append (getAngScmSrcTypLst ().size ()).append ("):"); for (var model : getAngScmSrcTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngScmLst () != null) { str.append ("\n").append (indent).append ("AngScmLst (").append (getAngScmLst ().size ()).append ("):"); for (var model : getAngScmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysMnuLst () != null) { str.append ("\n").append (indent).append ("SysMnuLst (").append (getSysMnuLst ().size ()).append ("):"); for (var model : getSysMnuLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysFrmDsgLst () != null) { str.append ("\n").append (indent).append ("SysFrmDsgLst (").append (getSysFrmDsgLst ().size ()).append ("):"); for (var model : getSysFrmDsgLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngThmLst () != null) { str.append ("\n").append (indent).append ("AngThmLst (").append (getAngThmLst ().size ()).append ("):"); for (var model : getAngThmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngNotTypCatLst () != null) { str.append ("\n").append (indent).append ("AngNotTypCatLst (").append (getAngNotTypCatLst ().size ()).append ("):"); for (var model : getAngNotTypCatLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngNotTypLst () != null) { str.append ("\n").append (indent).append ("AngNotTypLst (").append (getAngNotTypLst ().size ()).append ("):"); for (var model : getAngNotTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalDayShfLst () != null) { str.append ("\n").append (indent).append ("AngCalDayShfLst (").append (getAngCalDayShfLst ().size ()).append ("):"); for (var model : getAngCalDayShfLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtTypLst () != null) { str.append ("\n").append (indent).append ("AngCalEvtTypLst (").append (getAngCalEvtTypLst ().size ()).append ("):"); for (var model : getAngCalEvtTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtInvStsLst () != null) { str.append ("\n").append (indent).append ("AngCalEvtInvStsLst (").append (getAngCalEvtInvStsLst ().size ()).append ("):"); for (var model : getAngCalEvtInvStsLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtInvTypLst () != null) { str.append ("\n").append (indent).append ("AngCalEvtInvTypLst (").append (getAngCalEvtInvTypLst ().size ()).append ("):"); for (var model : getAngCalEvtInvTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtStsLst () != null) { str.append ("\n").append (indent).append ("AngCalEvtStsLst (").append (getAngCalEvtStsLst ().size ()).append ("):"); for (var model : getAngCalEvtStsLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalDayShfTypLst () != null) { str.append ("\n").append (indent).append ("AngCalDayShfTypLst (").append (getAngCalDayShfTypLst ().size ()).append ("):"); for (var model : getAngCalDayShfTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls001Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls001Lst (").append (getAngCalEvtCls001Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls001Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls002Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls002Lst (").append (getAngCalEvtCls002Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls002Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls003Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls003Lst (").append (getAngCalEvtCls003Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls003Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls004Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls004Lst (").append (getAngCalEvtCls004Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls004Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls005Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls005Lst (").append (getAngCalEvtCls005Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls005Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls006Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls006Lst (").append (getAngCalEvtCls006Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls006Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls007Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls007Lst (").append (getAngCalEvtCls007Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls007Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls008Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls008Lst (").append (getAngCalEvtCls008Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls008Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls009Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls009Lst (").append (getAngCalEvtCls009Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls009Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls010Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls010Lst (").append (getAngCalEvtCls010Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls010Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls011Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls011Lst (").append (getAngCalEvtCls011Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls011Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls012Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls012Lst (").append (getAngCalEvtCls012Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls012Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls013Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls013Lst (").append (getAngCalEvtCls013Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls013Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls014Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls014Lst (").append (getAngCalEvtCls014Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls014Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls015Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls015Lst (").append (getAngCalEvtCls015Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls015Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls016Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls016Lst (").append (getAngCalEvtCls016Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls016Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls017Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls017Lst (").append (getAngCalEvtCls017Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls017Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls018Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls018Lst (").append (getAngCalEvtCls018Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls018Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls019Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls019Lst (").append (getAngCalEvtCls019Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls019Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls020Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls020Lst (").append (getAngCalEvtCls020Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls020Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls021Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls021Lst (").append (getAngCalEvtCls021Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls021Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls022Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls022Lst (").append (getAngCalEvtCls022Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls022Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls023Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls023Lst (").append (getAngCalEvtCls023Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls023Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls024Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls024Lst (").append (getAngCalEvtCls024Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls024Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls025Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls025Lst (").append (getAngCalEvtCls025Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls025Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls026Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls026Lst (").append (getAngCalEvtCls026Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls026Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls027Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls027Lst (").append (getAngCalEvtCls027Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls027Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls028Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls028Lst (").append (getAngCalEvtCls028Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls028Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls029Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls029Lst (").append (getAngCalEvtCls029Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls029Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtCls030Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtCls030Lst (").append (getAngCalEvtCls030Lst ().size ()).append ("):"); for (var model : getAngCalEvtCls030Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtClsMul001Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtClsMul001Lst (").append (getAngCalEvtClsMul001Lst ().size ()).append ("):"); for (var model : getAngCalEvtClsMul001Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtClsMul002Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtClsMul002Lst (").append (getAngCalEvtClsMul002Lst ().size ()).append ("):"); for (var model : getAngCalEvtClsMul002Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtClsMul003Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtClsMul003Lst (").append (getAngCalEvtClsMul003Lst ().size ()).append ("):"); for (var model : getAngCalEvtClsMul003Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtClsMul004Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtClsMul004Lst (").append (getAngCalEvtClsMul004Lst ().size ()).append ("):"); for (var model : getAngCalEvtClsMul004Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCalEvtClsMul005Lst () != null) { str.append ("\n").append (indent).append ("AngCalEvtClsMul005Lst (").append (getAngCalEvtClsMul005Lst ().size ()).append ("):"); for (var model : getAngCalEvtClsMul005Lst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCalOrgComAbsLst () != null) { str.append ("\n").append (indent).append ("CalOrgComAbsLst (").append (getCalOrgComAbsLst ().size ()).append ("):"); for (var model : getCalOrgComAbsLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCalPlnAbsLst () != null) { str.append ("\n").append (indent).append ("CalPlnAbsLst (").append (getCalPlnAbsLst ().size ()).append ("):"); for (var model : getCalPlnAbsLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysWksLst () != null) { str.append ("\n").append (indent).append ("SysWksLst (").append (getSysWksLst ().size ()).append ("):"); for (var model : getSysWksLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysWksTabLst () != null) { str.append ("\n").append (indent).append ("SysWksTabLst (").append (getSysWksTabLst ().size ()).append ("):"); for (var model : getSysWksTabLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysWksWdgLst () != null) { str.append ("\n").append (indent).append ("SysWksWdgLst (").append (getSysWksWdgLst ().size ()).append ("):"); for (var model : getSysWksWdgLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysWksBtnLst () != null) { str.append ("\n").append (indent).append ("SysWksBtnLst (").append (getSysWksBtnLst ().size ()).append ("):"); for (var model : getSysWksBtnLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngSysWksActLst () != null) { str.append ("\n").append (indent).append ("AngSysWksActLst (").append (getAngSysWksActLst ().size ()).append ("):"); for (var model : getAngSysWksActLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysWksWdgTypLst () != null) { str.append ("\n").append (indent).append ("SysWksWdgTypLst (").append (getSysWksWdgTypLst ().size ()).append ("):"); for (var model : getSysWksWdgTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngSysWksWdgCfgLst () != null) { str.append ("\n").append (indent).append ("AngSysWksWdgCfgLst (").append (getAngSysWksWdgCfgLst ().size ()).append ("):"); for (var model : getAngSysWksWdgCfgLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysWksTypLst () != null) { str.append ("\n").append (indent).append ("SysWksTypLst (").append (getSysWksTypLst ().size ()).append ("):"); for (var model : getSysWksTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysWksSldLst () != null) { str.append ("\n").append (indent).append ("SysWksSldLst (").append (getSysWksSldLst ().size ()).append ("):"); for (var model : getSysWksSldLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngDatSetStpTypLst () != null) { str.append ("\n").append (indent).append ("AngDatSetStpTypLst (").append (getAngDatSetStpTypLst ().size ()).append ("):"); for (var model : getAngDatSetStpTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngDatSetLst () != null) { str.append ("\n").append (indent).append ("AngDatSetLst (").append (getAngDatSetLst ().size ()).append ("):"); for (var model : getAngDatSetLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngDatSetPrmLst () != null) { str.append ("\n").append (indent).append ("AngDatSetPrmLst (").append (getAngDatSetPrmLst ().size ()).append ("):"); for (var model : getAngDatSetPrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepMdlLst () != null) { str.append ("\n").append (indent).append ("RepMdlLst (").append (getRepMdlLst ().size ()).append ("):"); for (var model : getRepMdlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngRepMdlTypLst () != null) { str.append ("\n").append (indent).append ("AngRepMdlTypLst (").append (getAngRepMdlTypLst ().size ()).append ("):"); for (var model : getAngRepMdlTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysDocClsLst () != null) { str.append ("\n").append (indent).append ("SysDocClsLst (").append (getSysDocClsLst ().size ()).append ("):"); for (var model : getSysDocClsLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysDocCtxLst () != null) { str.append ("\n").append (indent).append ("SysDocCtxLst (").append (getSysDocCtxLst ().size ()).append ("):"); for (var model : getSysDocCtxLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngDvzChrMacTypLst () != null) { str.append ("\n").append (indent).append ("AngDvzChrMacTypLst (").append (getAngDvzChrMacTypLst ().size ()).append ("):"); for (var model : getAngDvzChrMacTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngDvzChrTypLst () != null) { str.append ("\n").append (indent).append ("AngDvzChrTypLst (").append (getAngDvzChrTypLst ().size ()).append ("):"); for (var model : getAngDvzChrTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngDvzGntLayTypLst () != null) { str.append ("\n").append (indent).append ("AngDvzGntLayTypLst (").append (getAngDvzGntLayTypLst ().size ()).append ("):"); for (var model : getAngDvzGntLayTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzWksQryLst () != null) { str.append ("\n").append (indent).append ("DvzWksQryLst (").append (getDvzWksQryLst ().size ()).append ("):"); for (var model : getDvzWksQryLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzWksQryDsgLst () != null) { str.append ("\n").append (indent).append ("DvzWksQryDsgLst (").append (getDvzWksQryDsgLst ().size ()).append ("):"); for (var model : getDvzWksQryDsgLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzWksQryDsgStyLst () != null) { str.append ("\n").append (indent).append ("DvzWksQryDsgStyLst (").append (getDvzWksQryDsgStyLst ().size ()).append ("):"); for (var model : getDvzWksQryDsgStyLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzWksChrAxyLst () != null) { str.append ("\n").append (indent).append ("DvzWksChrAxyLst (").append (getDvzWksChrAxyLst ().size ()).append ("):"); for (var model : getDvzWksChrAxyLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzWksGntLayLst () != null) { str.append ("\n").append (indent).append ("DvzWksGntLayLst (").append (getDvzWksGntLayLst ().size ()).append ("):"); for (var model : getDvzWksGntLayLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngBecFltLst () != null) { str.append ("\n").append (indent).append ("AngBecFltLst (").append (getAngBecFltLst ().size ()).append ("):"); for (var model : getAngBecFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngEmaSrvLst () != null) { str.append ("\n").append (indent).append ("AngEmaSrvLst (").append (getAngEmaSrvLst ().size ()).append ("):"); for (var model : getAngEmaSrvLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEmaLstLst () != null) { str.append ("\n").append (indent).append ("EmaLstLst (").append (getEmaLstLst ().size ()).append ("):"); for (var model : getEmaLstLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEmaLogLst () != null) { str.append ("\n").append (indent).append ("EmaLogLst (").append (getEmaLogLst ().size ()).append ("):"); for (var model : getEmaLogLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzRepLst () != null) { str.append ("\n").append (indent).append ("DvzRepLst (").append (getDvzRepLst ().size ()).append ("):"); for (var model : getDvzRepLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzRepQryLst () != null) { str.append ("\n").append (indent).append ("DvzRepQryLst (").append (getDvzRepQryLst ().size ()).append ("):"); for (var model : getDvzRepQryLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzRepQryDsgLst () != null) { str.append ("\n").append (indent).append ("DvzRepQryDsgLst (").append (getDvzRepQryDsgLst ().size ()).append ("):"); for (var model : getDvzRepQryDsgLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzRepQryDsgStyLst () != null) { str.append ("\n").append (indent).append ("DvzRepQryDsgStyLst (").append (getDvzRepQryDsgStyLst ().size ()).append ("):"); for (var model : getDvzRepQryDsgStyLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzRepChrLst () != null) { str.append ("\n").append (indent).append ("DvzRepChrLst (").append (getDvzRepChrLst ().size ()).append ("):"); for (var model : getDvzRepChrLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzRepChrAxyLst () != null) { str.append ("\n").append (indent).append ("DvzRepChrAxyLst (").append (getDvzRepChrAxyLst ().size ()).append ("):"); for (var model : getDvzRepChrAxyLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzChrTypLst () != null) { str.append ("\n").append (indent).append ("DvzChrTypLst (").append (getDvzChrTypLst ().size ()).append ("):"); for (var model : getDvzChrTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzRepGntLst () != null) { str.append ("\n").append (indent).append ("DvzRepGntLst (").append (getDvzRepGntLst ().size ()).append ("):"); for (var model : getDvzRepGntLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzGntLayTypLst () != null) { str.append ("\n").append (indent).append ("DvzGntLayTypLst (").append (getDvzGntLayTypLst ().size ()).append ("):"); for (var model : getDvzGntLayTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzRepGntLayLst () != null) { str.append ("\n").append (indent).append ("DvzRepGntLayLst (").append (getDvzRepGntLayLst ().size ()).append ("):"); for (var model : getDvzRepGntLayLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzChrMacTypLst () != null) { str.append ("\n").append (indent).append ("DvzChrMacTypLst (").append (getDvzChrMacTypLst ().size ()).append ("):"); for (var model : getDvzChrMacTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSupLst () != null) { str.append ("\n").append (indent).append ("SupLst (").append (getSupLst ().size ()).append ("):"); for (var model : getSupLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSrvSrcLst () != null) { str.append ("\n").append (indent).append ("SrvSrcLst (").append (getSrvSrcLst ().size ()).append ("):"); for (var model : getSrvSrcLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getJobLst () != null) { str.append ("\n").append (indent).append ("JobLst (").append (getJobLst ().size ()).append ("):"); for (var model : getJobLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getBotLst () != null) { str.append ("\n").append (indent).append ("BotLst (").append (getBotLst ().size ()).append ("):"); for (var model : getBotLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepMdlLngLst () != null) { str.append ("\n").append (indent).append ("RepMdlLngLst (").append (getRepMdlLngLst ().size ()).append ("):"); for (var model : getRepMdlLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUsrFavLst () != null) { str.append ("\n").append (indent).append ("UsrFavLst (").append (getUsrFavLst ().size ()).append ("):"); for (var model : getUsrFavLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getMsnLst () != null) { str.append ("\n").append (indent).append ("MsnLst (").append (getMsnLst ().size ()).append ("):"); for (var model : getMsnLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngLngImpl newEmptyInstance () { return (AngLngImpl) newInstance (); }
    
    @Override public AngLngImpl getCopy () {
        return (AngLngImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngLng _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngLngImpl.baseUrl (); }
    public static String baseUrl () { return AngLngImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngLngImpl.baseUrl = baseUrl; } 

    @Override public List<AngLngFields> getFields () { return Arrays.asList (AngLngFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        var field = super.getByFieldName (fieldName);
        if (field != null) { return field; }
            return switch (fieldName) {
                case "AngBecFltLst" -> getAngBecFltLst (); 
                case "AngDvzChrMacTypLst" -> getAngDvzChrMacTypLst (); 
                case "AngDvzChrTypLst" -> getAngDvzChrTypLst (); 
                case "AngDvzGntLayTypLst" -> getAngDvzGntLayTypLst (); 
                case "DvzChrMacTypLst" -> getDvzChrMacTypLst (); 
                case "DvzChrTypLst" -> getDvzChrTypLst (); 
                case "DvzGntLayTypLst" -> getDvzGntLayTypLst (); 
                case "DvzRepChrAxyLst" -> getDvzRepChrAxyLst (); 
                case "DvzRepChrLst" -> getDvzRepChrLst (); 
                case "DvzRepGntLayLst" -> getDvzRepGntLayLst (); 
                case "DvzRepGntLst" -> getDvzRepGntLst (); 
                case "DvzRepLst" -> getDvzRepLst (); 
                case "DvzRepQryDsgLst" -> getDvzRepQryDsgLst (); 
                case "DvzRepQryDsgStyLst" -> getDvzRepQryDsgStyLst (); 
                case "DvzRepQryLst" -> getDvzRepQryLst (); 
                case "DvzWksChrAxyLst" -> getDvzWksChrAxyLst (); 
                case "DvzWksGntLayLst" -> getDvzWksGntLayLst (); 
                case "DvzWksQryDsgLst" -> getDvzWksQryDsgLst (); 
                case "DvzWksQryDsgStyLst" -> getDvzWksQryDsgStyLst (); 
                case "DvzWksQryLst" -> getDvzWksQryLst (); 

            default -> null;
        }; // switch

    } // getByFieldName

} // AngLngImpl
