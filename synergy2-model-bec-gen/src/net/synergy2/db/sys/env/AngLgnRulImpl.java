package net.synergy2.db.sys.env;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class AngLgnRulImpl extends AngLgnRul {

    protected AngLgnRulImpl () { super (); }

    public enum AngLgnRulFields implements ISField {
        Uid, RulCod, RulDsc, RulLgnTypUid, RulRemSrvUid, RulSrtOrd, RulLgnMan, RulMtcRes, FlgEnb, RulSrvSrcUid, RulSrcPrpUid, LgnLstPrp, EtyUid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, RulLgnTryAnyWay, RulLgnSch;
    } // AngLgnRulFields
    
    private static String baseUrl = "/rest/sys/env/AngLgnRul";


    @Override public String getModelClassName () { return "AngLgnRulImpl"; }




    
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
        str.append ("RulCod[").append (getRulCod ()).append ("] ");
        str.append ("RulDsc[").append (getRulDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getRulLgnTypUid ())) { str.append ("RulLgnTypUid[").append (getRulLgnTypUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRulRemSrvUid ())) { str.append ("RulRemSrvUid[").append (getRulRemSrvUid ()).append ("] "); } }
        if (full) { str.append ("RulSrtOrd[").append (getRulSrtOrd ()).append ("] "); }
        if (full) { str.append ("RulLgnMan[").append (getRulLgnMan ()).append ("] "); }
        if (full) { str.append ("RulMtcRes[").append (getRulMtcRes ()).append ("] "); }
        if (full) { str.append ("FlgEnb[").append (getFlgEnb ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRulSrvSrcUid ())) { str.append ("RulSrvSrcUid[").append (getRulSrvSrcUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRulSrcPrpUid ())) { str.append ("RulSrcPrpUid[").append (getRulSrcPrpUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLgnLstPrp ())) { str.append ("LgnLstPrp[").append (getLgnLstPrp ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { str.append ("RulLgnTryAnyWay[").append (getRulLgnTryAnyWay ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRulLgnSch ())) { str.append ("RulLgnSch[").append (getRulLgnSch ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getSrv () != null) { str.append ("\n").append (indent).append ("Srv: \n").append (getSrv ().debug (full, true, indent + "    ")); }
        if (getTyp () != null) { str.append ("\n").append (indent).append ("Typ: \n").append (getTyp ().debug (full, true, indent + "    ")); }
        if (getSrc () != null) { str.append ("\n").append (indent).append ("Src: \n").append (getSrc ().debug (full, true, indent + "    ")); }
        if (getPrp () != null) { str.append ("\n").append (indent).append ("Prp: \n").append (getPrp ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngLgnRulImpl newEmptyInstance () { return (AngLgnRulImpl) newInstance (); }
    
    @Override public AngLgnRulImpl getCopy () {
        return (AngLgnRulImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngLgnRul _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngLgnRulImpl.baseUrl (); }
    public static String baseUrl () { return AngLgnRulImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngLgnRulImpl.baseUrl = baseUrl; } 

    @Override public List<AngLgnRulFields> getFields () { return Arrays.asList (AngLgnRulFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngLgnRulImpl
