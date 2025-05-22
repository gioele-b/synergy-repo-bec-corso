package net.synergy2.db.dvz.rep;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzRepQryFmtImpl extends DvzRepQryFmt {

    protected DvzRepQryFmtImpl () { super (); }

    public enum DvzRepQryFmtFields implements ISField {
        Uid, RepQryUid, QryColUid, CelFmt, CelFmtRefAls, CelFmtRefColUid, CelFmtLblUid, Tsi, Tsu, Rsi, Rsu;
    } // DvzRepQryFmtFields
    
    private static String baseUrl = "/rest/dvz/rep/DvzRepQryFmt";


    @Override public String getModelClassName () { return "DvzRepQryFmtImpl"; }




    
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
        if (full) { str.append ("CelFmt[").append (getCelFmt ()).append ("] "); }
        if (full) { if (Objects.nonNull (getCelFmtRefAls ())) { str.append ("CelFmtRefAls[").append (getCelFmtRefAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCelFmtRefColUid ())) { str.append ("CelFmtRefColUid[").append (getCelFmtRefColUid ()).append ("] "); } }
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
        if (getRefCol () != null) { str.append ("\n").append (indent).append ("RefCol: \n").append (getRefCol ().debug (full, true, indent + "    ")); }
        if (getFmtLbl () != null) { str.append ("\n").append (indent).append ("FmtLbl: \n").append (getFmtLbl ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzRepQryFmtImpl newEmptyInstance () { return (DvzRepQryFmtImpl) newInstance (); }
    
    @Override public DvzRepQryFmtImpl getCopy () {
        return (DvzRepQryFmtImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (DvzRepQryFmt _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DvzRepQryFmtImpl.baseUrl (); }
    public static String baseUrl () { return DvzRepQryFmtImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzRepQryFmtImpl.baseUrl = baseUrl; } 

    @Override public List<DvzRepQryFmtFields> getFields () { return Arrays.asList (DvzRepQryFmtFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzRepQryFmtImpl
