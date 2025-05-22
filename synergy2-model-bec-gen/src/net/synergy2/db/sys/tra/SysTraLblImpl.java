package net.synergy2.db.sys.tra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.dvz.rep.DvzRepQryAgg;
import net.synergy2.db.dvz.rep.DvzRepQryAggImpl;
import net.synergy2.db.dvz.rep.DvzRepQryCnv;
import net.synergy2.db.dvz.rep.DvzRepQryCnvImpl;
import net.synergy2.db.dvz.rep.DvzRepQryFmt;
import net.synergy2.db.dvz.rep.DvzRepQryFmtImpl;

public class SysTraLblImpl extends SysTraLbl {

    protected SysTraLblImpl () { super (); }

    public enum SysTraLblFields implements ISField {
        Uid, LblCod, LblTxt, LblShtTxt, LblPrs, Tsi, Tsu, Rsi, Rsu;
    } // SysTraLblFields
    
    private static String baseUrl = "/rest/sys/tra/SysTraLbl";


    @Override public String getModelClassName () { return "SysTraLblImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public SysTraLblImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }



    private List<DvzRepQryCnv> _RepQryCnvLst = null;
    public List<DvzRepQryCnv> getRepQryCnvLst () { return this._RepQryCnvLst; }
    public SysTraLbl setRepQryCnvLst (List<DvzRepQryCnv> obj) { this._RepQryCnvLst = obj; return this; }
    public SysTraLbl addRepQryCnvLst (DvzRepQryCnv obj) {
        if (_RepQryCnvLst == null) { _RepQryCnvLst = new ArrayList<> (); }
        _RepQryCnvLst.add (obj);
        return this;
    } // addRepQryCnvLst

    private List<DvzRepQryFmt> _RepQryFmtLst = null;
    public List<DvzRepQryFmt> getRepQryFmtLst () { return this._RepQryFmtLst; }
    public SysTraLbl setRepQryFmtLst (List<DvzRepQryFmt> obj) { this._RepQryFmtLst = obj; return this; }
    public SysTraLbl addRepQryFmtLst (DvzRepQryFmt obj) {
        if (_RepQryFmtLst == null) { _RepQryFmtLst = new ArrayList<> (); }
        _RepQryFmtLst.add (obj);
        return this;
    } // addRepQryFmtLst

    private List<DvzRepQryAgg> _RepQryAggFmtLst = null;
    public List<DvzRepQryAgg> getRepQryAggFmtLst () { return this._RepQryAggFmtLst; }
    public SysTraLbl setRepQryAggFmtLst (List<DvzRepQryAgg> obj) { this._RepQryAggFmtLst = obj; return this; }
    public SysTraLbl addRepQryAggFmtLst (DvzRepQryAgg obj) {
        if (_RepQryAggFmtLst == null) { _RepQryAggFmtLst = new ArrayList<> (); }
        _RepQryAggFmtLst.add (obj);
        return this;
    } // addRepQryAggFmtLst


    
    @Override public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        switch (fieldName) {
            case "RepQryCnvLst" -> addRepQryCnvLst ((DvzRepQryCnvImpl) value); 
            case "RepQryFmtLst" -> addRepQryFmtLst ((DvzRepQryFmtImpl) value); 
            case "RepQryAggFmtLst" -> addRepQryAggFmtLst ((DvzRepQryAggImpl) value); 

            default -> {
                if (!settedSuper) { throw new SQueryException ("No reference specification found for field [" + fieldName + "]."); }
            }
        } // switch
        return true;
    } // set
    
    @Override public String debug (boolean full, boolean cascade, String indent) {
        StringBuilder str = new StringBuilder (indent).append (getModelClassName ()).append (" = {");
        str.append ("Uid[").append (getUid ()).append ("] ");
        str.append ("LblCod[").append (getLblCod ()).append ("] ");
        str.append ("LblTxt[").append (getLblTxt ()).append ("] ");
        if (full) { if (Objects.nonNull (getLblShtTxt ())) { str.append ("LblShtTxt[").append (getLblShtTxt ()).append ("] "); } }
        if (full) { str.append ("LblPrs[").append (getLblPrs ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getRepQryCnvLst () != null) { str.append ("\n").append (indent).append ("RepQryCnvLst (").append (getRepQryCnvLst ().size ()).append ("):"); for (var model : getRepQryCnvLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepQryFmtLst () != null) { str.append ("\n").append (indent).append ("RepQryFmtLst (").append (getRepQryFmtLst ().size ()).append ("):"); for (var model : getRepQryFmtLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepQryAggFmtLst () != null) { str.append ("\n").append (indent).append ("RepQryAggFmtLst (").append (getRepQryAggFmtLst ().size ()).append ("):"); for (var model : getRepQryAggFmtLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDocClsAttLst () != null) { str.append ("\n").append (indent).append ("DocClsAttLst (").append (getDocClsAttLst ().size ()).append ("):"); for (var model : getDocClsAttLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLstRemFldLst () != null) { str.append ("\n").append (indent).append ("LstRemFldLst (").append (getLstRemFldLst ().size ()).append ("):"); for (var model : getLstRemFldLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQryColLst () != null) { str.append ("\n").append (indent).append ("QryColLst (").append (getQryColLst ().size ()).append ("):"); for (var model : getQryColLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getScmTypFldLst () != null) { str.append ("\n").append (indent).append ("ScmTypFldLst (").append (getScmTypFldLst ().size ()).append ("):"); for (var model : getScmTypFldLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getTblLst () != null) { str.append ("\n").append (indent).append ("TblLst (").append (getTblLst ().size ()).append ("):"); for (var model : getTblLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getColLst () != null) { str.append ("\n").append (indent).append ("ColLst (").append (getColLst ().size ()).append ("):"); for (var model : getColLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUpfDefLst () != null) { str.append ("\n").append (indent).append ("UpfDefLst (").append (getUpfDefLst ().size ()).append ("):"); for (var model : getUpfDefLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysTraLblImpl newEmptyInstance () { return (SysTraLblImpl) newInstance (); }
    
    @Override public SysTraLblImpl getCopy () {
        var toReturn = (SysTraLblImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (SysTraLbl _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysTraLblImpl.baseUrl (); }
    public static String baseUrl () { return SysTraLblImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysTraLblImpl.baseUrl = baseUrl; } 

    @Override public List<SysTraLblFields> getFields () { return Arrays.asList (SysTraLblFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        var field = super.getByFieldName (fieldName);
        if (field != null) { return field; }
            return switch (fieldName) {
                case "RepQryAggFmtLst" -> getRepQryAggFmtLst (); 
                case "RepQryCnvLst" -> getRepQryCnvLst (); 
                case "RepQryFmtLst" -> getRepQryFmtLst (); 

            default -> null;
        }; // switch

    } // getByFieldName

} // SysTraLblImpl
