package net.synergy2.db.sys.env;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngSrvSrcImpl extends AngSrvSrc {

    protected AngSrvSrcImpl () { super (); }

    public enum AngSrvSrcFields implements ISField {
        Uid, SrcCod, SrcDsc, FlgEnb, CodResRul, ResSrvUid, LgnTkn, LngDefUid, GenAbsCal, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, Snc365, SncGoo, TknFldNamMch;
    } // AngSrvSrcFields
    
    private static String baseUrl = "/rest/sys/env/AngSrvSrc";


    @Override public String getModelClassName () { return "AngSrvSrcImpl"; }




    
    @Override public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        switch (fieldName) {

            default -> {
                if (!settedSuper) { throw new SQueryException ("No reference specification found for field [" + fieldName + "]."); }
            }
        } // switch
        return true;
    } // set
    
    @Override public String debug (boolean full, boolean cascade, String indent) {
        StringBuilder str = new StringBuilder (indent).append (getModelClassName ()).append (" = {");
        str.append ("Uid[").append (getUid ()).append ("] ");
        str.append ("SrcCod[").append (getSrcCod ()).append ("] ");
        if (full) { if (Objects.nonNull (getSrcDsc ())) { str.append ("SrcDsc[").append (getSrcDsc ()).append ("] "); } }
        if (full) { str.append ("FlgEnb[").append (getFlgEnb ()).append ("] "); }
        if (full) { str.append ("CodResRul[").append (getCodResRul ()).append ("] "); }
        if (full) { str.append ("ResSrvUid[").append (getResSrvUid ()).append ("] "); }
        if (full) { str.append ("LgnTkn[").append (getLgnTkn ()).append ("] "); }
        if (full) { str.append ("LngDefUid[").append (getLngDefUid ()).append ("] "); }
        if (full) { str.append ("GenAbsCal[").append (getGenAbsCal ()).append ("] "); }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { str.append ("Snc365[").append (getSnc365 ()).append ("] "); }
        if (full) { str.append ("SncGoo[").append (getSncGoo ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTknFldNamMch ())) { str.append ("TknFldNamMch[").append (getTknFldNamMch ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getAbsLst () != null) { str.append ("\n").append (indent).append ("AbsLst (").append (getAbsLst ().size ()).append ("):"); for (var model : getAbsLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEvtLst () != null) { str.append ("\n").append (indent).append ("EvtLst (").append (getEvtLst ().size ()).append ("):"); for (var model : getEvtLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getResCodLst () != null) { str.append ("\n").append (indent).append ("ResCodLst (").append (getResCodLst ().size ()).append ("):"); for (var model : getResCodLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getPrpValLst () != null) { str.append ("\n").append (indent).append ("PrpValLst (").append (getPrpValLst ().size ()).append ("):"); for (var model : getPrpValLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLgnRulLst () != null) { str.append ("\n").append (indent).append ("LgnRulLst (").append (getLgnRulLst ().size ()).append ("):"); for (var model : getLgnRulLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRemSrvLst () != null) { str.append ("\n").append (indent).append ("RemSrvLst (").append (getRemSrvLst ().size ()).append ("):"); for (var model : getRemSrvLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSrvRes () != null) { str.append ("\n").append (indent).append ("SrvRes: \n").append (getSrvRes ().debug (full, true, indent + "    ")); }
        if (getSrvLng () != null) { str.append ("\n").append (indent).append ("SrvLng: \n").append (getSrvLng ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngSrvSrcImpl newEmptyInstance () { return (AngSrvSrcImpl) newInstance (); }
    
    @Override public AngSrvSrcImpl getCopy () {
        return (AngSrvSrcImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngSrvSrc _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngSrvSrcImpl.baseUrl (); }
    public static String baseUrl () { return AngSrvSrcImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngSrvSrcImpl.baseUrl = baseUrl; } 

    @Override public List<AngSrvSrcFields> getFields () { return Arrays.asList (AngSrvSrcFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngSrvSrcImpl
