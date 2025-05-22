package net.synergy2.db.dvz.rep;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzRepQryDsgFltImpl extends DvzRepQryDsgFlt {

    protected DvzRepQryDsgFltImpl () { super (); }

    public enum DvzRepQryDsgFltFields implements ISField {
        Uid, StyUid, FltSrt, FltTyp, OprLog, OprAri, FltTblAls, FltColUid, FltOpr, Val, ValTblAls, ValColUid, ValRepQryUid, Tsi, Tsu, Rsi, Rsu;
    } // DvzRepQryDsgFltFields
    
    private static String baseUrl = "/rest/dvz/rep/DvzRepQryDsgFlt";


    @Override public String getModelClassName () { return "DvzRepQryDsgFltImpl"; }




    
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
        str.append ("StyUid[").append (getStyUid ()).append ("] ");
        str.append ("FltSrt[").append (getFltSrt ()).append ("] ");
        if (full) { if (Objects.nonNull (getFltTyp ())) { str.append ("FltTyp[").append (getFltTyp ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getOprLog ())) { str.append ("OprLog[").append (getOprLog ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getOprAri ())) { str.append ("OprAri[").append (getOprAri ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFltTblAls ())) { str.append ("FltTblAls[").append (getFltTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFltColUid ())) { str.append ("FltColUid[").append (getFltColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFltOpr ())) { str.append ("FltOpr[").append (getFltOpr ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getVal ())) { str.append ("Val[").append (getVal ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValTblAls ())) { str.append ("ValTblAls[").append (getValTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValColUid ())) { str.append ("ValColUid[").append (getValColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValRepQryUid ())) { str.append ("ValRepQryUid[").append (getValRepQryUid ()).append ("] "); } }
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
        if (getSty () != null) { str.append ("\n").append (indent).append ("Sty: \n").append (getSty ().debug (full, true, indent + "    ")); }
        if (getFltCol () != null) { str.append ("\n").append (indent).append ("FltCol: \n").append (getFltCol ().debug (full, true, indent + "    ")); }
        if (getValCol () != null) { str.append ("\n").append (indent).append ("ValCol: \n").append (getValCol ().debug (full, true, indent + "    ")); }
        if (getValRepQry () != null) { str.append ("\n").append (indent).append ("ValRepQry: \n").append (getValRepQry ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzRepQryDsgFltImpl newEmptyInstance () { return (DvzRepQryDsgFltImpl) newInstance (); }
    
    @Override public DvzRepQryDsgFltImpl getCopy () {
        return (DvzRepQryDsgFltImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (DvzRepQryDsgFlt _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DvzRepQryDsgFltImpl.baseUrl (); }
    public static String baseUrl () { return DvzRepQryDsgFltImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzRepQryDsgFltImpl.baseUrl = baseUrl; } 

    @Override public List<DvzRepQryDsgFltFields> getFields () { return Arrays.asList (DvzRepQryDsgFltFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzRepQryDsgFltImpl
