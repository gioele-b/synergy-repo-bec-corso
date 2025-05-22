package net.synergy2.db.dvz.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzWksQryFmtImpl extends DvzWksQryFmt {

    protected DvzWksQryFmtImpl () { super (); }

    public enum DvzWksQryFmtFields implements ISField {
        Uid, DvzQryUid, FmtTblAls, FmtColUid, FmtClcUid, FmtVal, AggUid, Tsi, Tsu, Rsi, Rsu, FmtFldUid;
    } // DvzWksQryFmtFields
    
    private static String baseUrl = "/rest/dvz/wks/DvzWksQryFmt";


    @Override public String getModelClassName () { return "DvzWksQryFmtImpl"; }




    
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
        if (full) { str.append ("DvzQryUid[").append (getDvzQryUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getFmtTblAls ())) { str.append ("FmtTblAls[").append (getFmtTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFmtColUid ())) { str.append ("FmtColUid[").append (getFmtColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFmtClcUid ())) { str.append ("FmtClcUid[").append (getFmtClcUid ()).append ("] "); } }
        if (full) { str.append ("FmtVal[").append (getFmtVal ()).append ("] "); }
        if (full) { if (Objects.nonNull (getAggUid ())) { str.append ("AggUid[").append (getAggUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFmtFldUid ())) { str.append ("FmtFldUid[").append (getFmtFldUid ()).append ("] "); } }
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
        if (getFmtCol () != null) { str.append ("\n").append (indent).append ("FmtCol: \n").append (getFmtCol ().debug (full, true, indent + "    ")); }
        if (getFmtClc () != null) { str.append ("\n").append (indent).append ("FmtClc: \n").append (getFmtClc ().debug (full, true, indent + "    ")); }
        if (getAgg () != null) { str.append ("\n").append (indent).append ("Agg: \n").append (getAgg ().debug (full, true, indent + "    ")); }
        if (getFmtFld () != null) { str.append ("\n").append (indent).append ("FmtFld: \n").append (getFmtFld ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzWksQryFmtImpl newEmptyInstance () { return (DvzWksQryFmtImpl) newInstance (); }
    
    @Override public DvzWksQryFmtImpl getCopy () {
        return (DvzWksQryFmtImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (DvzWksQryFmt _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DvzWksQryFmtImpl.baseUrl (); }
    public static String baseUrl () { return DvzWksQryFmtImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzWksQryFmtImpl.baseUrl = baseUrl; } 

    @Override public List<DvzWksQryFmtFields> getFields () { return Arrays.asList (DvzWksQryFmtFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzWksQryFmtImpl
