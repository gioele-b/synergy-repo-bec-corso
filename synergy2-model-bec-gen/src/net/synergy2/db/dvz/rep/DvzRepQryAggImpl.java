package net.synergy2.db.dvz.rep;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzRepQryAggImpl extends DvzRepQryAgg {

    protected DvzRepQryAggImpl () { super (); }

    public enum DvzRepQryAggFields implements ISField {
        Uid, RepQryUid, QryColUid, AggUid, CelFmt, CelFmtLblUid, Tsi, Tsu, Rsi, Rsu;
    } // DvzRepQryAggFields
    
    private static String baseUrl = "/rest/dvz/rep/DvzRepQryAgg";


    @Override public String getModelClassName () { return "DvzRepQryAggImpl"; }




    
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
        str.append ("RepQryUid[").append (getRepQryUid ()).append ("] ");
        str.append ("QryColUid[").append (getQryColUid ()).append ("] ");
        if (full) { str.append ("AggUid[").append (getAggUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getCelFmt ())) { str.append ("CelFmt[").append (getCelFmt ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCelFmtLblUid ())) { str.append ("CelFmtLblUid[").append (getCelFmtLblUid ()).append ("] "); } }
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
        if (getRepQry () != null) { str.append ("\n").append (indent).append ("RepQry: \n").append (getRepQry ().debug (full, true, indent + "    ")); }
        if (getQryCol () != null) { str.append ("\n").append (indent).append ("QryCol: \n").append (getQryCol ().debug (full, true, indent + "    ")); }
        if (getAgg () != null) { str.append ("\n").append (indent).append ("Agg: \n").append (getAgg ().debug (full, true, indent + "    ")); }
        if (getFmtLbl () != null) { str.append ("\n").append (indent).append ("FmtLbl: \n").append (getFmtLbl ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzRepQryAggImpl newEmptyInstance () { return (DvzRepQryAggImpl) newInstance (); }
    
    @Override public DvzRepQryAggImpl getCopy () {
        return (DvzRepQryAggImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (DvzRepQryAgg _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DvzRepQryAggImpl.baseUrl (); }
    public static String baseUrl () { return DvzRepQryAggImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzRepQryAggImpl.baseUrl = baseUrl; } 

    @Override public List<DvzRepQryAggFields> getFields () { return Arrays.asList (DvzRepQryAggFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzRepQryAggImpl
