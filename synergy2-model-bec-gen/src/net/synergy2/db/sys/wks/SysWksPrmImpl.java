package net.synergy2.db.sys.wks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.dvz.wks.DvzWksQryDsgFlt;
import net.synergy2.db.dvz.wks.DvzWksQryDsgFltImpl;
import net.synergy2.db.dvz.wks.DvzWksQryFlt;
import net.synergy2.db.dvz.wks.DvzWksQryFltImpl;
import net.synergy2.db.dvz.wks.DvzWksQryPrm;
import net.synergy2.db.dvz.wks.DvzWksQryPrmImpl;

public class SysWksPrmImpl extends SysWksPrm {

    protected SysWksPrmImpl () { super (); }

    public enum SysWksPrmFields implements ISField {
        Uid, WksUid, PrmNam, PrmDsc, PrmTyp, PrmSubTyp, PrmLst, PrmDefVal, Tsi, Tsu, Rsi, Rsu, PrmQryUid, PrmQryUidTblAls, PrmQryUidColUid, PrmQryCodTblAls, PrmQryCodColUid, PrmQryDscTblAls, PrmQryDscColUid, PrmQryDscClcUid, HidFlt, CfgLok, Srt, ReaOnl, PrmQryUidFldUid, PrmQryCodFldUid, PrmQryDscFldUid;
    } // SysWksPrmFields
    
    private static String baseUrl = "/rest/sys/wks/SysWksPrm";


    @Override public String getModelClassName () { return "SysWksPrmImpl"; }



    private List<DvzWksQryPrm> _DvzQryLst = null;
    public List<DvzWksQryPrm> getDvzQryLst () { return this._DvzQryLst; }
    public SysWksPrm setDvzQryLst (List<DvzWksQryPrm> obj) { this._DvzQryLst = obj; return this; }
    public SysWksPrm addDvzQryLst (DvzWksQryPrm obj) {
        if (_DvzQryLst == null) { _DvzQryLst = new ArrayList<> (); }
        _DvzQryLst.add (obj);
        return this;
    } // addDvzQryLst

    private List<DvzWksQryFlt> _DvzQryFltLst = null;
    public List<DvzWksQryFlt> getDvzQryFltLst () { return this._DvzQryFltLst; }
    public SysWksPrm setDvzQryFltLst (List<DvzWksQryFlt> obj) { this._DvzQryFltLst = obj; return this; }
    public SysWksPrm addDvzQryFltLst (DvzWksQryFlt obj) {
        if (_DvzQryFltLst == null) { _DvzQryFltLst = new ArrayList<> (); }
        _DvzQryFltLst.add (obj);
        return this;
    } // addDvzQryFltLst

    private List<DvzWksQryDsgFlt> _DvzQryDsgFltValLst = null;
    public List<DvzWksQryDsgFlt> getDvzQryDsgFltValLst () { return this._DvzQryDsgFltValLst; }
    public SysWksPrm setDvzQryDsgFltValLst (List<DvzWksQryDsgFlt> obj) { this._DvzQryDsgFltValLst = obj; return this; }
    public SysWksPrm addDvzQryDsgFltValLst (DvzWksQryDsgFlt obj) {
        if (_DvzQryDsgFltValLst == null) { _DvzQryDsgFltValLst = new ArrayList<> (); }
        _DvzQryDsgFltValLst.add (obj);
        return this;
    } // addDvzQryDsgFltValLst


    
    @Override public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        switch (fieldName) {
            case "DvzQryLst" -> addDvzQryLst ((DvzWksQryPrmImpl) value); 
            case "DvzQryFltLst" -> addDvzQryFltLst ((DvzWksQryFltImpl) value); 
            case "DvzQryDsgFltValLst" -> addDvzQryDsgFltValLst ((DvzWksQryDsgFltImpl) value); 

            default -> {
                if (!settedSuper) { throw new SQueryException ("No reference specification found for field [" + fieldName + "]."); }
            }
        } // switch
        return true;
    } // set
    
    @Override public String debug (boolean full, boolean cascade, String indent) {
        StringBuilder str = new StringBuilder (indent).append (getModelClassName ()).append (" = {");
        str.append ("Uid[").append (getUid ()).append ("] ");
        str.append ("WksUid[").append (getWksUid ()).append ("] ");
        str.append ("PrmNam[").append (getPrmNam ()).append ("] ");
        str.append ("PrmDsc[").append (getPrmDsc ()).append ("] ");
        if (full) { str.append ("PrmTyp[").append (getPrmTyp ()).append ("] "); }
        if (full) { if (Objects.nonNull (getPrmSubTyp ())) { str.append ("PrmSubTyp[").append (getPrmSubTyp ()).append ("] "); } }
        if (full) { str.append ("PrmLst[").append (getPrmLst ()).append ("] "); }
        if (full) { if (Objects.nonNull (getPrmDefVal ())) { str.append ("PrmDefVal[").append (getPrmDefVal ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrmQryUid ())) { str.append ("PrmQryUid[").append (getPrmQryUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrmQryUidTblAls ())) { str.append ("PrmQryUidTblAls[").append (getPrmQryUidTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrmQryUidColUid ())) { str.append ("PrmQryUidColUid[").append (getPrmQryUidColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrmQryCodTblAls ())) { str.append ("PrmQryCodTblAls[").append (getPrmQryCodTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrmQryCodColUid ())) { str.append ("PrmQryCodColUid[").append (getPrmQryCodColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrmQryDscTblAls ())) { str.append ("PrmQryDscTblAls[").append (getPrmQryDscTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrmQryDscColUid ())) { str.append ("PrmQryDscColUid[").append (getPrmQryDscColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrmQryDscClcUid ())) { str.append ("PrmQryDscClcUid[").append (getPrmQryDscClcUid ()).append ("] "); } }
        if (full) { str.append ("HidFlt[").append (getHidFlt ()).append ("] "); }
        if (full) { str.append ("CfgLok[").append (getCfgLok ()).append ("] "); }
        if (full) { str.append ("Srt[").append (getSrt ()).append ("] "); }
        if (full) { str.append ("ReaOnl[").append (getReaOnl ()).append ("] "); }
        if (full) { if (Objects.nonNull (getPrmQryUidFldUid ())) { str.append ("PrmQryUidFldUid[").append (getPrmQryUidFldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrmQryCodFldUid ())) { str.append ("PrmQryCodFldUid[").append (getPrmQryCodFldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrmQryDscFldUid ())) { str.append ("PrmQryDscFldUid[").append (getPrmQryDscFldUid ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getDvzQryLst () != null) { str.append ("\n").append (indent).append ("DvzQryLst (").append (getDvzQryLst ().size ()).append ("):"); for (var model : getDvzQryLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzQryFltLst () != null) { str.append ("\n").append (indent).append ("DvzQryFltLst (").append (getDvzQryFltLst ().size ()).append ("):"); for (var model : getDvzQryFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzQryDsgFltValLst () != null) { str.append ("\n").append (indent).append ("DvzQryDsgFltValLst (").append (getDvzQryDsgFltValLst ().size ()).append ("):"); for (var model : getDvzQryDsgFltValLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEtlJobWksBtnActPrmLst () != null) { str.append ("\n").append (indent).append ("EtlJobWksBtnActPrmLst (").append (getEtlJobWksBtnActPrmLst ().size ()).append ("):"); for (var model : getEtlJobWksBtnActPrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWksWdgLst () != null) { str.append ("\n").append (indent).append ("WksWdgLst (").append (getWksWdgLst ().size ()).append ("):"); for (var model : getWksWdgLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWksWdgFltLst () != null) { str.append ("\n").append (indent).append ("WksWdgFltLst (").append (getWksWdgFltLst ().size ()).append ("):"); for (var model : getWksWdgFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getViwFltLst () != null) { str.append ("\n").append (indent).append ("ViwFltLst (").append (getViwFltLst ().size ()).append ("):"); for (var model : getViwFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWks () != null) { str.append ("\n").append (indent).append ("Wks: \n").append (getWks ().debug (full, true, indent + "    ")); }
        if (getPrmQryDscCol () != null) { str.append ("\n").append (indent).append ("PrmQryDscCol: \n").append (getPrmQryDscCol ().debug (full, true, indent + "    ")); }
        if (getPrmQryDscClc () != null) { str.append ("\n").append (indent).append ("PrmQryDscClc: \n").append (getPrmQryDscClc ().debug (full, true, indent + "    ")); }
        if (getPrmQryUidCol () != null) { str.append ("\n").append (indent).append ("PrmQryUidCol: \n").append (getPrmQryUidCol ().debug (full, true, indent + "    ")); }
        if (getPrmQryCodCol () != null) { str.append ("\n").append (indent).append ("PrmQryCodCol: \n").append (getPrmQryCodCol ().debug (full, true, indent + "    ")); }
        if (getPrmQry () != null) { str.append ("\n").append (indent).append ("PrmQry: \n").append (getPrmQry ().debug (full, true, indent + "    ")); }
        if (getPrmQryUidFld () != null) { str.append ("\n").append (indent).append ("PrmQryUidFld: \n").append (getPrmQryUidFld ().debug (full, true, indent + "    ")); }
        if (getPrmQryCodFld () != null) { str.append ("\n").append (indent).append ("PrmQryCodFld: \n").append (getPrmQryCodFld ().debug (full, true, indent + "    ")); }
        if (getPrmQryDscFld () != null) { str.append ("\n").append (indent).append ("PrmQryDscFld: \n").append (getPrmQryDscFld ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysWksPrmImpl newEmptyInstance () { return (SysWksPrmImpl) newInstance (); }
    
    @Override public SysWksPrmImpl getCopy () {
        return (SysWksPrmImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysWksPrm _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysWksPrmImpl.baseUrl (); }
    public static String baseUrl () { return SysWksPrmImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysWksPrmImpl.baseUrl = baseUrl; } 

    @Override public List<SysWksPrmFields> getFields () { return Arrays.asList (SysWksPrmFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        var field = super.getByFieldName (fieldName);
        if (field != null) { return field; }
            return switch (fieldName) {
                case "DvzQryDsgFltValLst" -> getDvzQryDsgFltValLst (); 
                case "DvzQryFltLst" -> getDvzQryFltLst (); 
                case "DvzQryLst" -> getDvzQryLst (); 

            default -> null;
        }; // switch

    } // getByFieldName

} // SysWksPrmImpl
