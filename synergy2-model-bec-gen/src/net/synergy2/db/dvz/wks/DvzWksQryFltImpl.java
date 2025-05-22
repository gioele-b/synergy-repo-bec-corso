package net.synergy2.db.dvz.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzWksQryFltImpl extends DvzWksQryFlt {

    protected DvzWksQryFltImpl () { super (); }

    public enum DvzWksQryFltFields implements ISField {
        Uid, DvzQryUid, FltSrt, FltTyp, OprLog, OprAri, FltTblAls, FltColUid, FltOpr, Val, ValTblAls, ValColUid, ValWksPrmUid, Tsi, Tsu, Rsi, Rsu, ValWksPrmOpt, FltFldUid, ValFldUid;
    } // DvzWksQryFltFields
    
    private static String baseUrl = "/rest/dvz/wks/DvzWksQryFlt";


    @Override public String getModelClassName () { return "DvzWksQryFltImpl"; }




    
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
        str.append ("DvzQryUid[").append (getDvzQryUid ()).append ("] ");
        str.append ("FltSrt[").append (getFltSrt ()).append ("] ");
        if (full) { str.append ("FltTyp[").append (getFltTyp ()).append ("] "); }
        if (full) { if (Objects.nonNull (getOprLog ())) { str.append ("OprLog[").append (getOprLog ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getOprAri ())) { str.append ("OprAri[").append (getOprAri ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFltTblAls ())) { str.append ("FltTblAls[").append (getFltTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFltColUid ())) { str.append ("FltColUid[").append (getFltColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFltOpr ())) { str.append ("FltOpr[").append (getFltOpr ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getVal ())) { str.append ("Val[").append (getVal ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValTblAls ())) { str.append ("ValTblAls[").append (getValTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValColUid ())) { str.append ("ValColUid[").append (getValColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValWksPrmUid ())) { str.append ("ValWksPrmUid[").append (getValWksPrmUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValWksPrmOpt ())) { str.append ("ValWksPrmOpt[").append (getValWksPrmOpt ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFltFldUid ())) { str.append ("FltFldUid[").append (getFltFldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValFldUid ())) { str.append ("ValFldUid[").append (getValFldUid ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getDvzQry () != null) { str.append ("\n").append (indent).append ("DvzQry: \n").append (getDvzQry ().debug (full, true, indent + "    ")); }
        if (getFltCol () != null) { str.append ("\n").append (indent).append ("FltCol: \n").append (getFltCol ().debug (full, true, indent + "    ")); }
        if (getValCol () != null) { str.append ("\n").append (indent).append ("ValCol: \n").append (getValCol ().debug (full, true, indent + "    ")); }
        if (getValWksPrm () != null) { str.append ("\n").append (indent).append ("ValWksPrm: \n").append (getValWksPrm ().debug (full, true, indent + "    ")); }
        if (getFltFld () != null) { str.append ("\n").append (indent).append ("FltFld: \n").append (getFltFld ().debug (full, true, indent + "    ")); }
        if (getValFld () != null) { str.append ("\n").append (indent).append ("ValFld: \n").append (getValFld ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzWksQryFltImpl newEmptyInstance () { return (DvzWksQryFltImpl) newInstance (); }
    
    @Override public DvzWksQryFltImpl getCopy () {
        return (DvzWksQryFltImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (DvzWksQryFlt _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DvzWksQryFltImpl.baseUrl (); }
    public static String baseUrl () { return DvzWksQryFltImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzWksQryFltImpl.baseUrl = baseUrl; } 

    @Override public List<DvzWksQryFltFields> getFields () { return Arrays.asList (DvzWksQryFltFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzWksQryFltImpl
