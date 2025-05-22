package net.synergy2.db.dvz.rep;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzRepQryCnvImpl extends DvzRepQryCnv {

    protected DvzRepQryCnvImpl () { super (); }

    public enum DvzRepQryCnvFields implements ISField {
        Uid, RepQryUid, TblAls, DbmColUid, SrcVal, CnvLblUid, CnvIco, Tsi, Tsu, Rsi, Rsu;
    } // DvzRepQryCnvFields
    
    private static String baseUrl = "/rest/dvz/rep/DvzRepQryCnv";


    @Override public String getModelClassName () { return "DvzRepQryCnvImpl"; }




    
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
        str.append ("TblAls[").append (getTblAls ()).append ("] ");
        str.append ("DbmColUid[").append (getDbmColUid ()).append ("] ");
        if (Objects.nonNull (getSrcVal ())) { str.append ("SrcVal[").append (getSrcVal ()).append ("] "); }
        if (full) { if (Objects.nonNull (getCnvLblUid ())) { str.append ("CnvLblUid[").append (getCnvLblUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCnvIco ())) { str.append ("CnvIco[").append (getCnvIco ()).append ("] "); } }
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
        if (getDbmCol () != null) { str.append ("\n").append (indent).append ("DbmCol: \n").append (getDbmCol ().debug (full, true, indent + "    ")); }
        if (getCnvLbl () != null) { str.append ("\n").append (indent).append ("CnvLbl: \n").append (getCnvLbl ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzRepQryCnvImpl newEmptyInstance () { return (DvzRepQryCnvImpl) newInstance (); }
    
    @Override public DvzRepQryCnvImpl getCopy () {
        return (DvzRepQryCnvImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (DvzRepQryCnv _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DvzRepQryCnvImpl.baseUrl (); }
    public static String baseUrl () { return DvzRepQryCnvImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzRepQryCnvImpl.baseUrl = baseUrl; } 

    @Override public List<DvzRepQryCnvFields> getFields () { return Arrays.asList (DvzRepQryCnvFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzRepQryCnvImpl
