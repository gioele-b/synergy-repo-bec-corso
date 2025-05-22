package net.synergy2.db.sys.qry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.dvz.rep.DvzRepQry;
import net.synergy2.db.dvz.rep.DvzRepQryImpl;
import net.synergy2.db.dvz.wks.DvzWksQry;
import net.synergy2.db.dvz.wks.DvzWksQryImpl;
import net.synergy2.db.sys.ety.AngEty;

public class AngQryImpl extends AngQry {

    protected AngQryImpl () { super (); }

    public enum AngQryFields implements ISField {
        Uid, Cod, QryDsc, EtyUid, TblStrUid, TblStrAls, QryCpl, QryUpf, QryTpl, QryDef, QryVrt, QryApp, QryEty, IgnAut, AskFlt, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, ScmMdlUid, QryFlt, QryTyp, QryFltPlh, ReaQryCol, ColAutGrp;
    } // AngQryFields
    
    private static String baseUrl = "/rest/sys/qry/AngQry";


    @Override public String getModelClassName () { return "AngQryImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngQryImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }



    private List<DvzRepQry> _RepLst = null;
    public List<DvzRepQry> getRepLst () { return this._RepLst; }
    public AngQry setRepLst (List<DvzRepQry> obj) { this._RepLst = obj; return this; }
    public AngQry addRepLst (DvzRepQry obj) {
        if (_RepLst == null) { _RepLst = new ArrayList<> (); }
        _RepLst.add (obj);
        return this;
    } // addRepLst

    private List<DvzWksQry> _DvzQryLst = null;
    public List<DvzWksQry> getDvzQryLst () { return this._DvzQryLst; }
    public AngQry setDvzQryLst (List<DvzWksQry> obj) { this._DvzQryLst = obj; return this; }
    public AngQry addDvzQryLst (DvzWksQry obj) {
        if (_DvzQryLst == null) { _DvzQryLst = new ArrayList<> (); }
        _DvzQryLst.add (obj);
        return this;
    } // addDvzQryLst


    
    @Override public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        switch (fieldName) {
            case "RepLst" -> addRepLst ((DvzRepQryImpl) value); 
            case "DvzQryLst" -> addDvzQryLst ((DvzWksQryImpl) value); 
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
        if (full) { str.append ("Cod[").append (getCod ()).append ("] "); }
        str.append ("QryDsc[").append (getQryDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTblStrUid ())) { str.append ("TblStrUid[").append (getTblStrUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTblStrAls ())) { str.append ("TblStrAls[").append (getTblStrAls ()).append ("] "); } }
        if (full) { str.append ("QryCpl[").append (getQryCpl ()).append ("] "); }
        if (full) { str.append ("QryUpf[").append (getQryUpf ()).append ("] "); }
        if (full) { str.append ("QryTpl[").append (getQryTpl ()).append ("] "); }
        if (full) { str.append ("QryDef[").append (getQryDef ()).append ("] "); }
        if (full) { str.append ("QryVrt[").append (getQryVrt ()).append ("] "); }
        if (full) { str.append ("QryApp[").append (getQryApp ()).append ("] "); }
        if (full) { str.append ("QryEty[").append (getQryEty ()).append ("] "); }
        if (full) { str.append ("IgnAut[").append (getIgnAut ()).append ("] "); }
        if (full) { if (Objects.nonNull (getAskFlt ())) { str.append ("AskFlt[").append (getAskFlt ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getScmMdlUid ())) { str.append ("ScmMdlUid[").append (getScmMdlUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getQryFlt ())) { str.append ("QryFlt[").append (getQryFlt ()).append ("] "); } }
        if (full) { str.append ("QryTyp[").append (getQryTyp ()).append ("] "); }
        if (full) { str.append ("QryFltPlh[").append (getQryFltPlh ()).append ("] "); }
        if (full) { str.append ("ReaQryCol[").append (getReaQryCol ()).append ("] "); }
        if (full) { str.append ("ColAutGrp[").append (getColAutGrp ()).append ("] "); }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getRepLst () != null) { str.append ("\n").append (indent).append ("RepLst (").append (getRepLst ().size ()).append ("):"); for (var model : getRepLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzQryLst () != null) { str.append ("\n").append (indent).append ("DvzQryLst (").append (getDvzQryLst ().size ()).append ("):"); for (var model : getDvzQryLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDocCtxLst () != null) { str.append ("\n").append (indent).append ("DocCtxLst (").append (getDocCtxLst ().size ()).append ("):"); for (var model : getDocCtxLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDatSetStpLst () != null) { str.append ("\n").append (indent).append ("DatSetStpLst (").append (getDatSetStpLst ().size ()).append ("):"); for (var model : getDatSetStpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEcmClsQryLst () != null) { str.append ("\n").append (indent).append ("EcmClsQryLst (").append (getEcmClsQryLst ().size ()).append ("):"); for (var model : getEcmClsQryLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getJoiLst () != null) { str.append ("\n").append (indent).append ("JoiLst (").append (getJoiLst ().size ()).append ("):"); for (var model : getJoiLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getResDefLst () != null) { str.append ("\n").append (indent).append ("ResDefLst (").append (getResDefLst ().size ()).append ("):"); for (var model : getResDefLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getColLst () != null) { str.append ("\n").append (indent).append ("ColLst (").append (getColLst ().size ()).append ("):"); for (var model : getColLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSrtLst () != null) { str.append ("\n").append (indent).append ("SrtLst (").append (getSrtLst ().size ()).append ("):"); for (var model : getSrtLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLytLst () != null) { str.append ("\n").append (indent).append ("LytLst (").append (getLytLst ().size ()).append ("):"); for (var model : getLytLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getClcLst () != null) { str.append ("\n").append (indent).append ("ClcLst (").append (getClcLst ().size ()).append ("):"); for (var model : getClcLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getFldLst () != null) { str.append ("\n").append (indent).append ("FldLst (").append (getFldLst ().size ()).append ("):"); for (var model : getFldLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWdgLst () != null) { str.append ("\n").append (indent).append ("WdgLst (").append (getWdgLst ().size ()).append ("):"); for (var model : getWdgLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysWksPrmQryLst () != null) { str.append ("\n").append (indent).append ("SysWksPrmQryLst (").append (getSysWksPrmQryLst ().size ()).append ("):"); for (var model : getSysWksPrmQryLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getTbl () != null) { str.append ("\n").append (indent).append ("Tbl: \n").append (getTbl ().debug (full, true, indent + "    ")); }
        if (getScmMdl () != null) { str.append ("\n").append (indent).append ("ScmMdl: \n").append (getScmMdl ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngQryImpl newEmptyInstance () { return (AngQryImpl) newInstance (); }
    
    @Override public AngQryImpl getCopy () {
        var toReturn = (AngQryImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngQry _other, boolean checkUid, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngQryImpl.baseUrl (); }
    public static String baseUrl () { return AngQryImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngQryImpl.baseUrl = baseUrl; } 

    @Override public List<AngQryFields> getFields () { return Arrays.asList (AngQryFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        var field = super.getByFieldName (fieldName);
        if (field != null) { return field; }
            return switch (fieldName) {
                case "DvzQryLst" -> getDvzQryLst (); 
                case "RepLst" -> getRepLst (); 

            default -> null;
        }; // switch

    } // getByFieldName

} // AngQryImpl
