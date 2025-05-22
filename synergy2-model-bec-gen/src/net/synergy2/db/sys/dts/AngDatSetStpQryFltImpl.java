package net.synergy2.db.sys.dts;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngDatSetStpQryFltImpl extends AngDatSetStpQryFlt {

    protected AngDatSetStpQryFltImpl () { super (); }

    public enum AngDatSetStpQryFltFields implements ISField {
        Uid, StpUid, FltSrt, FltTyp, OprLog, OprAri, FltFldUid, FltOpr, Val, ValPrmUid, ValStpUid, ValQryFldUid, ValOpt, Tsi, Tsu, Rsi, Rsu;
    } // AngDatSetStpQryFltFields
    
    private static String baseUrl = "/rest/sys/dts/AngDatSetStpQryFlt";


    @Override public String getModelClassName () { return "AngDatSetStpQryFltImpl"; }




    
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
        str.append ("StpUid[").append (getStpUid ()).append ("] ");
        str.append ("FltSrt[").append (getFltSrt ()).append ("] ");
        if (full) { str.append ("FltTyp[").append (getFltTyp ()).append ("] "); }
        if (full) { if (Objects.nonNull (getOprLog ())) { str.append ("OprLog[").append (getOprLog ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getOprAri ())) { str.append ("OprAri[").append (getOprAri ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFltFldUid ())) { str.append ("FltFldUid[").append (getFltFldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFltOpr ())) { str.append ("FltOpr[").append (getFltOpr ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getVal ())) { str.append ("Val[").append (getVal ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValPrmUid ())) { str.append ("ValPrmUid[").append (getValPrmUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValStpUid ())) { str.append ("ValStpUid[").append (getValStpUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValQryFldUid ())) { str.append ("ValQryFldUid[").append (getValQryFldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValOpt ())) { str.append ("ValOpt[").append (getValOpt ()).append ("] "); } }
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
        if (getStp () != null) { str.append ("\n").append (indent).append ("Stp: \n").append (getStp ().debug (full, true, indent + "    ")); }
        if (getFltFld () != null) { str.append ("\n").append (indent).append ("FltFld: \n").append (getFltFld ().debug (full, true, indent + "    ")); }
        if (getValPrm () != null) { str.append ("\n").append (indent).append ("ValPrm: \n").append (getValPrm ().debug (full, true, indent + "    ")); }
        if (getValStp () != null) { str.append ("\n").append (indent).append ("ValStp: \n").append (getValStp ().debug (full, true, indent + "    ")); }
        if (getValQryFld () != null) { str.append ("\n").append (indent).append ("ValQryFld: \n").append (getValQryFld ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngDatSetStpQryFltImpl newEmptyInstance () { return (AngDatSetStpQryFltImpl) newInstance (); }
    
    @Override public AngDatSetStpQryFltImpl getCopy () {
        return (AngDatSetStpQryFltImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngDatSetStpQryFlt _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngDatSetStpQryFltImpl.baseUrl (); }
    public static String baseUrl () { return AngDatSetStpQryFltImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngDatSetStpQryFltImpl.baseUrl = baseUrl; } 

    @Override public List<AngDatSetStpQryFltFields> getFields () { return Arrays.asList (AngDatSetStpQryFltFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngDatSetStpQryFltImpl
