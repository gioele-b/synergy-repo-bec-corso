package net.synergy2.db.dvz.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzWksQryPrmImpl extends DvzWksQryPrm {

    protected DvzWksQryPrmImpl () { super (); }

    public enum DvzWksQryPrmFields implements ISField {
        Uid, DvzQryUid, WksPrmUid, PrmTblAls, PrmColUid, PrmClcUid, Tsi, Tsu, Rsi, Rsu, PrmFldUid;
    } // DvzWksQryPrmFields
    
    private static String baseUrl = "/rest/dvz/wks/DvzWksQryPrm";


    @Override public String getModelClassName () { return "DvzWksQryPrmImpl"; }




    
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
        str.append ("WksPrmUid[").append (getWksPrmUid ()).append ("] ");
        if (full) { if (Objects.nonNull (getPrmTblAls ())) { str.append ("PrmTblAls[").append (getPrmTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrmColUid ())) { str.append ("PrmColUid[").append (getPrmColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrmClcUid ())) { str.append ("PrmClcUid[").append (getPrmClcUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrmFldUid ())) { str.append ("PrmFldUid[").append (getPrmFldUid ()).append ("] "); } }
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
        if (getWksPrm () != null) { str.append ("\n").append (indent).append ("WksPrm: \n").append (getWksPrm ().debug (full, true, indent + "    ")); }
        if (getPrmCol () != null) { str.append ("\n").append (indent).append ("PrmCol: \n").append (getPrmCol ().debug (full, true, indent + "    ")); }
        if (getPrmClc () != null) { str.append ("\n").append (indent).append ("PrmClc: \n").append (getPrmClc ().debug (full, true, indent + "    ")); }
        if (getPrmFld () != null) { str.append ("\n").append (indent).append ("PrmFld: \n").append (getPrmFld ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzWksQryPrmImpl newEmptyInstance () { return (DvzWksQryPrmImpl) newInstance (); }
    
    @Override public DvzWksQryPrmImpl getCopy () {
        return (DvzWksQryPrmImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (DvzWksQryPrm _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DvzWksQryPrmImpl.baseUrl (); }
    public static String baseUrl () { return DvzWksQryPrmImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzWksQryPrmImpl.baseUrl = baseUrl; } 

    @Override public List<DvzWksQryPrmFields> getFields () { return Arrays.asList (DvzWksQryPrmFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzWksQryPrmImpl
