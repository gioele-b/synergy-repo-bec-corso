package net.synergy2.db.sys.wks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.dvz.wks.DvzWksQry;
import net.synergy2.db.dvz.wks.DvzWksQryImpl;
import net.synergy2.db.sys.ety.AngEty;

public class SysWksImpl extends SysWks {

    protected SysWksImpl () { super (); }

    public enum SysWksFields implements ISField {
        Uid, WksCod, WksDsc, WksTypUid, WksSrt, WksHid, WksIco, EtyUid, Tsi, Tsu, Rsi, Rsu, WksRfs, WksClr;
    } // SysWksFields
    
    private static String baseUrl = "/rest/sys/wks/SysWks";


    @Override public String getModelClassName () { return "SysWksImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public SysWksImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }



    private List<DvzWksQry> _DvzQryLst = null;
    public List<DvzWksQry> getDvzQryLst () { return this._DvzQryLst; }
    public SysWks setDvzQryLst (List<DvzWksQry> obj) { this._DvzQryLst = obj; return this; }
    public SysWks addDvzQryLst (DvzWksQry obj) {
        if (_DvzQryLst == null) { _DvzQryLst = new ArrayList<> (); }
        _DvzQryLst.add (obj);
        return this;
    } // addDvzQryLst


    
    @Override public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        switch (fieldName) {
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
        str.append ("WksCod[").append (getWksCod ()).append ("] ");
        str.append ("WksDsc[").append (getWksDsc ()).append ("] ");
        str.append ("WksTypUid[").append (getWksTypUid ()).append ("] ");
        if (full) { str.append ("WksSrt[").append (getWksSrt ()).append ("] "); }
        if (full) { str.append ("WksHid[").append (getWksHid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getWksIco ())) { str.append ("WksIco[").append (getWksIco ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getWksRfs ())) { str.append ("WksRfs[").append (getWksRfs ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getWksClr ())) { str.append ("WksClr[").append (getWksClr ()).append ("] "); } }
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
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getTabLst () != null) { str.append ("\n").append (indent).append ("TabLst (").append (getTabLst ().size ()).append ("):"); for (var model : getTabLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getGrpLst () != null) { str.append ("\n").append (indent).append ("GrpLst (").append (getGrpLst ().size ()).append ("):"); for (var model : getGrpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWdgLst () != null) { str.append ("\n").append (indent).append ("WdgLst (").append (getWdgLst ().size ()).append ("):"); for (var model : getWdgLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getBtnLst () != null) { str.append ("\n").append (indent).append ("BtnLst (").append (getBtnLst ().size ()).append ("):"); for (var model : getBtnLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getBtnActLst () != null) { str.append ("\n").append (indent).append ("BtnActLst (").append (getBtnActLst ().size ()).append ("):"); for (var model : getBtnActLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getPrmLst () != null) { str.append ("\n").append (indent).append ("PrmLst (").append (getPrmLst ().size ()).append ("):"); for (var model : getPrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLytLst () != null) { str.append ("\n").append (indent).append ("LytLst (").append (getLytLst ().size ()).append ("):"); for (var model : getLytLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWksTyp () != null) { str.append ("\n").append (indent).append ("WksTyp: \n").append (getWksTyp ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysWksImpl newEmptyInstance () { return (SysWksImpl) newInstance (); }
    
    @Override public SysWksImpl getCopy () {
        var toReturn = (SysWksImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (SysWks _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysWksImpl.baseUrl (); }
    public static String baseUrl () { return SysWksImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysWksImpl.baseUrl = baseUrl; } 

    @Override public List<SysWksFields> getFields () { return Arrays.asList (SysWksFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        var field = super.getByFieldName (fieldName);
        if (field != null) { return field; }
            return switch (fieldName) {
                case "DvzQryLst" -> getDvzQryLst (); 

            default -> null;
        }; // switch

    } // getByFieldName

} // SysWksImpl
