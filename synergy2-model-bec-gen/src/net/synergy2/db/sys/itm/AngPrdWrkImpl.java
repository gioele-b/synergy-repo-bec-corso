package net.synergy2.db.sys.itm;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class AngPrdWrkImpl extends AngPrdWrk {

    protected AngPrdWrkImpl () { super (); }

    public enum AngPrdWrkFields implements ISField {
        Uid, WrkCod, WrkDsc, EtyUid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, CatUid, CstCenUid, ExtWrk, EnbWrk, WrcUid, MacUid, Seq, WrkStrTss, WrkEndTss, UniMeaTmpUid, StdTmpMacEqp, StdTmpMacWrk, StdTmpManEqp, StdTmpManWrk, StdPecMac, StdPecMan, PrdLot, StdCst, StdLotExtWrk, ExtPhsUniMeaUid, RegSupUid;
    } // AngPrdWrkFields
    
    private static String baseUrl = "/rest/sys/itm/AngPrdWrk";


    @Override public String getModelClassName () { return "AngPrdWrkImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngPrdWrkImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
    @Override public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        switch (fieldName) {
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
        str.append ("WrkCod[").append (getWrkCod ()).append ("] ");
        str.append ("WrkDsc[").append (getWrkDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCatUid ())) { str.append ("CatUid[").append (getCatUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCstCenUid ())) { str.append ("CstCenUid[").append (getCstCenUid ()).append ("] "); } }
        if (full) { str.append ("ExtWrk[").append (getExtWrk ()).append ("] "); }
        if (full) { str.append ("EnbWrk[").append (getEnbWrk ()).append ("] "); }
        if (full) { if (Objects.nonNull (getWrcUid ())) { str.append ("WrcUid[").append (getWrcUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getMacUid ())) { str.append ("MacUid[").append (getMacUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getSeq ())) { str.append ("Seq[").append (getSeq ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getWrkStrTss ())) { str.append ("WrkStrTss[").append (getWrkStrTss ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getWrkEndTss ())) { str.append ("WrkEndTss[").append (getWrkEndTss ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getUniMeaTmpUid ())) { str.append ("UniMeaTmpUid[").append (getUniMeaTmpUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStdTmpMacEqp ())) { str.append ("StdTmpMacEqp[").append (getStdTmpMacEqp ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStdTmpMacWrk ())) { str.append ("StdTmpMacWrk[").append (getStdTmpMacWrk ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStdTmpManEqp ())) { str.append ("StdTmpManEqp[").append (getStdTmpManEqp ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStdTmpManWrk ())) { str.append ("StdTmpManWrk[").append (getStdTmpManWrk ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStdPecMac ())) { str.append ("StdPecMac[").append (getStdPecMac ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStdPecMan ())) { str.append ("StdPecMan[").append (getStdPecMan ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrdLot ())) { str.append ("PrdLot[").append (getPrdLot ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStdCst ())) { str.append ("StdCst[").append (getStdCst ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStdLotExtWrk ())) { str.append ("StdLotExtWrk[").append (getStdLotExtWrk ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getExtPhsUniMeaUid ())) { str.append ("ExtPhsUniMeaUid[").append (getExtPhsUniMeaUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRegSupUid ())) { str.append ("RegSupUid[").append (getRegSupUid ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getOprLst () != null) { str.append ("\n").append (indent).append ("OprLst (").append (getOprLst ().size ()).append ("):"); for (var model : getOprLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getPrdWrkCat () != null) { str.append ("\n").append (indent).append ("PrdWrkCat: \n").append (getPrdWrkCat ().debug (full, true, indent + "    ")); }
        if (getCstCen () != null) { str.append ("\n").append (indent).append ("CstCen: \n").append (getCstCen ().debug (full, true, indent + "    ")); }
        if (getWrc () != null) { str.append ("\n").append (indent).append ("Wrc: \n").append (getWrc ().debug (full, true, indent + "    ")); }
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        if (getUniMeaTmp () != null) { str.append ("\n").append (indent).append ("UniMeaTmp: \n").append (getUniMeaTmp ().debug (full, true, indent + "    ")); }
        if (getExtPhsUniMea () != null) { str.append ("\n").append (indent).append ("ExtPhsUniMea: \n").append (getExtPhsUniMea ().debug (full, true, indent + "    ")); }
        if (getSup () != null) { str.append ("\n").append (indent).append ("Sup: \n").append (getSup ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngPrdWrkImpl newEmptyInstance () { return (AngPrdWrkImpl) newInstance (); }
    
    @Override public AngPrdWrkImpl getCopy () {
        var toReturn = (AngPrdWrkImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngPrdWrk _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngPrdWrkImpl.baseUrl (); }
    public static String baseUrl () { return AngPrdWrkImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngPrdWrkImpl.baseUrl = baseUrl; } 

    @Override public List<AngPrdWrkFields> getFields () { return Arrays.asList (AngPrdWrkFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngPrdWrkImpl
