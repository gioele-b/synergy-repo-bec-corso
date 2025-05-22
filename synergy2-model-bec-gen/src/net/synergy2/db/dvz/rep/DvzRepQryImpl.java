package net.synergy2.db.dvz.rep;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzRepQryImpl extends DvzRepQry {

    protected DvzRepQryImpl () { super (); }

    public enum DvzRepQryFields implements ISField {
        Uid, RepUid, WdgCod, WdgDsc, WdgPosHrz, WdgPosVrt, WdgSpnHrz, WdgSpnVrt, QryUid, FltReq, WdgHid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // DvzRepQryFields
    
    private static String baseUrl = "/rest/dvz/rep/DvzRepQry";


    @Override public String getModelClassName () { return "DvzRepQryImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public DvzRepQryImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("RepUid[").append (getRepUid ()).append ("] ");
        str.append ("WdgCod[").append (getWdgCod ()).append ("] ");
        str.append ("WdgDsc[").append (getWdgDsc ()).append ("] ");
        if (full) { str.append ("WdgPosHrz[").append (getWdgPosHrz ()).append ("] "); }
        if (full) { str.append ("WdgPosVrt[").append (getWdgPosVrt ()).append ("] "); }
        if (full) { str.append ("WdgSpnHrz[").append (getWdgSpnHrz ()).append ("] "); }
        if (full) { str.append ("WdgSpnVrt[").append (getWdgSpnVrt ()).append ("] "); }
        if (full) { str.append ("QryUid[").append (getQryUid ()).append ("] "); }
        if (full) { str.append ("FltReq[").append (getFltReq ()).append ("] "); }
        if (full) { str.append ("WdgHid[").append (getWdgHid ()).append ("] "); }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getFltLst () != null) { str.append ("\n").append (indent).append ("FltLst (").append (getFltLst ().size ()).append ("):"); for (var model : getFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDerFltLst () != null) { str.append ("\n").append (indent).append ("DerFltLst (").append (getDerFltLst ().size ()).append ("):"); for (var model : getDerFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAggLst () != null) { str.append ("\n").append (indent).append ("AggLst (").append (getAggLst ().size ()).append ("):"); for (var model : getAggLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDsgLst () != null) { str.append ("\n").append (indent).append ("DsgLst (").append (getDsgLst ().size ()).append ("):"); for (var model : getDsgLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDerDsgFltLst () != null) { str.append ("\n").append (indent).append ("DerDsgFltLst (").append (getDerDsgFltLst ().size ()).append ("):"); for (var model : getDerDsgFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getChrLst () != null) { str.append ("\n").append (indent).append ("ChrLst (").append (getChrLst ().size ()).append ("):"); for (var model : getChrLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getFmtLst () != null) { str.append ("\n").append (indent).append ("FmtLst (").append (getFmtLst ().size ()).append ("):"); for (var model : getFmtLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCnvLst () != null) { str.append ("\n").append (indent).append ("CnvLst (").append (getCnvLst ().size ()).append ("):"); for (var model : getCnvLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getGntLst () != null) { str.append ("\n").append (indent).append ("GntLst (").append (getGntLst ().size ()).append ("):"); for (var model : getGntLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRep () != null) { str.append ("\n").append (indent).append ("Rep: \n").append (getRep ().debug (full, true, indent + "    ")); }
        if (getQry () != null) { str.append ("\n").append (indent).append ("Qry: \n").append (getQry ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzRepQryImpl newEmptyInstance () { return (DvzRepQryImpl) newInstance (); }
    
    @Override public DvzRepQryImpl getCopy () {
        var toReturn = (DvzRepQryImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (DvzRepQry _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return DvzRepQryImpl.baseUrl (); }
    public static String baseUrl () { return DvzRepQryImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzRepQryImpl.baseUrl = baseUrl; } 

    @Override public List<DvzRepQryFields> getFields () { return Arrays.asList (DvzRepQryFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzRepQryImpl
