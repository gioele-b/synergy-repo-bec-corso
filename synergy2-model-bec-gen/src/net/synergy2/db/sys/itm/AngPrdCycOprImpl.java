package net.synergy2.db.sys.itm;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class AngPrdCycOprImpl extends AngPrdCycOpr {

    protected AngPrdCycOprImpl () { super (); }

    public enum AngPrdCycOprFields implements ISField {
        Uid, PrdCycUid, OprNum, OprDsc, TrfQty, ValStrDat, ValEndDat, DurSet, DurWrkItm, DurWrkBat, DurMinPre, DurMinNex, DurMaxNex, OprEff, PlnGrpUid, EtyUid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, PrdWrkUid, MinEfr, MaxEfr, DurMinWrkPre, ItmVrnUid, Mtc;
    } // AngPrdCycOprFields
    
    private static String baseUrl = "/rest/sys/itm/AngPrdCycOpr";


    @Override public String getModelClassName () { return "AngPrdCycOprImpl"; }




    
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
        str.append ("PrdCycUid[").append (getPrdCycUid ()).append ("] ");
        str.append ("OprNum[").append (getOprNum ()).append ("] ");
        str.append ("OprDsc[").append (getOprDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getTrfQty ())) { str.append ("TrfQty[").append (getTrfQty ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValStrDat ())) { str.append ("ValStrDat[").append (getValStrDat ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValEndDat ())) { str.append ("ValEndDat[").append (getValEndDat ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDurSet ())) { str.append ("DurSet[").append (getDurSet ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDurWrkItm ())) { str.append ("DurWrkItm[").append (getDurWrkItm ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDurWrkBat ())) { str.append ("DurWrkBat[").append (getDurWrkBat ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDurMinPre ())) { str.append ("DurMinPre[").append (getDurMinPre ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDurMinNex ())) { str.append ("DurMinNex[").append (getDurMinNex ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDurMaxNex ())) { str.append ("DurMaxNex[").append (getDurMaxNex ()).append ("] "); } }
        if (full) { str.append ("OprEff[").append (getOprEff ()).append ("] "); }
        if (full) { if (Objects.nonNull (getPlnGrpUid ())) { str.append ("PlnGrpUid[").append (getPlnGrpUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrdWrkUid ())) { str.append ("PrdWrkUid[").append (getPrdWrkUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getMinEfr ())) { str.append ("MinEfr[").append (getMinEfr ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getMaxEfr ())) { str.append ("MaxEfr[").append (getMaxEfr ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDurMinWrkPre ())) { str.append ("DurMinWrkPre[").append (getDurMinWrkPre ()).append ("] "); } }
        if (Objects.nonNull (getItmVrnUid ())) { str.append ("ItmVrnUid[").append (getItmVrnUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getMtc ())) { str.append ("Mtc[").append (getMtc ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getPrePrdCycOprLnkLst () != null) { str.append ("\n").append (indent).append ("PrePrdCycOprLnkLst (").append (getPrePrdCycOprLnkLst ().size ()).append ("):"); for (var model : getPrePrdCycOprLnkLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getNxtPrdCycOprLnkLst () != null) { str.append ("\n").append (indent).append ("NxtPrdCycOprLnkLst (").append (getNxtPrdCycOprLnkLst ().size ()).append ("):"); for (var model : getNxtPrdCycOprLnkLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getPlnGrp () != null) { str.append ("\n").append (indent).append ("PlnGrp: \n").append (getPlnGrp ().debug (full, true, indent + "    ")); }
        if (getPrdCyc () != null) { str.append ("\n").append (indent).append ("PrdCyc: \n").append (getPrdCyc ().debug (full, true, indent + "    ")); }
        if (getPrdWrk () != null) { str.append ("\n").append (indent).append ("PrdWrk: \n").append (getPrdWrk ().debug (full, true, indent + "    ")); }
        if (getItmVrn () != null) { str.append ("\n").append (indent).append ("ItmVrn: \n").append (getItmVrn ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngPrdCycOprImpl newEmptyInstance () { return (AngPrdCycOprImpl) newInstance (); }
    
    @Override public AngPrdCycOprImpl getCopy () {
        return (AngPrdCycOprImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngPrdCycOpr _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngPrdCycOprImpl.baseUrl (); }
    public static String baseUrl () { return AngPrdCycOprImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngPrdCycOprImpl.baseUrl = baseUrl; } 

    @Override public List<AngPrdCycOprFields> getFields () { return Arrays.asList (AngPrdCycOprFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngPrdCycOprImpl
