package net.synergy2.db.sys.grp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.dvz.rep.DvzRepGrp;
import net.synergy2.db.dvz.rep.DvzRepGrpImpl;
import net.synergy2.db.sys.ety.AngEty;

public class AngGrpImpl extends AngGrp {

    protected AngGrpImpl () { super (); }

    public enum AngGrpFields implements ISField {
        Uid, GrpCod, EtyUid, GrpPblUsg, GrpTyp, GrpDsc, GrpIco, EmlAdd, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, GrpCatUid;
    } // AngGrpFields
    
    private static String baseUrl = "/rest/sys/grp/AngGrp";


    @Override public String getModelClassName () { return "AngGrpImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngGrpImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }



    private List<DvzRepGrp> _RepLst = null;
    public List<DvzRepGrp> getRepLst () { return this._RepLst; }
    public AngGrp setRepLst (List<DvzRepGrp> obj) { this._RepLst = obj; return this; }
    public AngGrp addRepLst (DvzRepGrp obj) {
        if (_RepLst == null) { _RepLst = new ArrayList<> (); }
        _RepLst.add (obj);
        return this;
    } // addRepLst


    
    @Override public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        switch (fieldName) {
            case "RepLst" -> addRepLst ((DvzRepGrpImpl) value); 
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
        str.append ("GrpCod[").append (getGrpCod ()).append ("] ");
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
        if (full) { str.append ("GrpPblUsg[").append (getGrpPblUsg ()).append ("] "); }
        if (full) { str.append ("GrpTyp[").append (getGrpTyp ()).append ("] "); }
        str.append ("GrpDsc[").append (getGrpDsc ()).append ("] ");
        if (full) { str.append ("GrpIco[").append (getGrpIco ()).append ("] "); }
        if (full) { if (Objects.nonNull (getEmlAdd ())) { str.append ("EmlAdd[").append (getEmlAdd ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getGrpCatUid ())) { str.append ("GrpCatUid[").append (getGrpCatUid ()).append ("] "); } }
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
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAppLst () != null) { str.append ("\n").append (indent).append ("AppLst (").append (getAppLst ().size ()).append ("):"); for (var model : getAppLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCusLst () != null) { str.append ("\n").append (indent).append ("CusLst (").append (getCusLst ().size ()).append ("):"); for (var model : getCusLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEmaEleLst () != null) { str.append ("\n").append (indent).append ("EmaEleLst (").append (getEmaEleLst ().size ()).append ("):"); for (var model : getEmaEleLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEtyAttVisLst () != null) { str.append ("\n").append (indent).append ("EtyAttVisLst (").append (getEtyAttVisLst ().size ()).append ("):"); for (var model : getEtyAttVisLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEtyComVisLst () != null) { str.append ("\n").append (indent).append ("EtyComVisLst (").append (getEtyComVisLst ().size ()).append ("):"); for (var model : getEtyComVisLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getGrpFunLst () != null) { str.append ("\n").append (indent).append ("GrpFunLst (").append (getGrpFunLst ().size ()).append ("):"); for (var model : getGrpFunLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getGrpFunMbrLst () != null) { str.append ("\n").append (indent).append ("GrpFunMbrLst (").append (getGrpFunMbrLst ().size ()).append ("):"); for (var model : getGrpFunMbrLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getGrpFunResLst () != null) { str.append ("\n").append (indent).append ("GrpFunResLst (").append (getGrpFunResLst ().size ()).append ("):"); for (var model : getGrpFunResLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getResGrpLst () != null) { str.append ("\n").append (indent).append ("ResGrpLst (").append (getResGrpLst ().size ()).append ("):"); for (var model : getResGrpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getPrdCycOprPlnLst () != null) { str.append ("\n").append (indent).append ("PrdCycOprPlnLst (").append (getPrdCycOprPlnLst ().size ()).append ("):"); for (var model : getPrdCycOprPlnLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getManLvlLst () != null) { str.append ("\n").append (indent).append ("ManLvlLst (").append (getManLvlLst ().size ()).append ("):"); for (var model : getManLvlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLvlLst () != null) { str.append ("\n").append (indent).append ("LvlLst (").append (getLvlLst ().size ()).append ("):"); for (var model : getLvlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLvlRepLst () != null) { str.append ("\n").append (indent).append ("LvlRepLst (").append (getLvlRepLst ().size ()).append ("):"); for (var model : getLvlRepLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getGenLvlLst () != null) { str.append ("\n").append (indent).append ("GenLvlLst (").append (getGenLvlLst ().size ()).append ("):"); for (var model : getGenLvlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQryColLst () != null) { str.append ("\n").append (indent).append ("QryColLst (").append (getQryColLst ().size ()).append ("):"); for (var model : getQryColLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepMdlLst () != null) { str.append ("\n").append (indent).append ("RepMdlLst (").append (getRepMdlLst ().size ()).append ("):"); for (var model : getRepMdlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getMnuLst () != null) { str.append ("\n").append (indent).append ("MnuLst (").append (getMnuLst ().size ()).append ("):"); for (var model : getMnuLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getGrpLst () != null) { str.append ("\n").append (indent).append ("GrpLst (").append (getGrpLst ().size ()).append ("):"); for (var model : getGrpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getGrpCat () != null) { str.append ("\n").append (indent).append ("GrpCat: \n").append (getGrpCat ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngGrpImpl newEmptyInstance () { return (AngGrpImpl) newInstance (); }
    
    @Override public AngGrpImpl getCopy () {
        var toReturn = (AngGrpImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngGrp _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngGrpImpl.baseUrl (); }
    public static String baseUrl () { return AngGrpImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngGrpImpl.baseUrl = baseUrl; } 

    @Override public List<AngGrpFields> getFields () { return Arrays.asList (AngGrpFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        var field = super.getByFieldName (fieldName);
        if (field != null) { return field; }
            return switch (fieldName) {
                case "RepLst" -> getRepLst (); 

            default -> null;
        }; // switch

    } // getByFieldName

} // AngGrpImpl
