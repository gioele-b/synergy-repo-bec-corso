package net.synergy2.db.sys.org;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class CstWrkCenImpl extends CstWrkCen {

    protected CstWrkCenImpl () { super (); }

    public enum CstWrkCenFields implements ISField {
        Uid, WrcUid, MacUid, CstRatUid, CphMacWrk, CphMacEqp, CphManWrk, CphManEqp, Enb, Tmp, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // CstWrkCenFields
    
    private static String baseUrl = "/rest/sys/org/CstWrkCen";


    @Override public String getModelClassName () { return "CstWrkCenImpl"; }




    
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
        str.append ("WrcUid[").append (getWrcUid ()).append ("] ");
        if (Objects.nonNull (getMacUid ())) { str.append ("MacUid[").append (getMacUid ()).append ("] "); }
        str.append ("CstRatUid[").append (getCstRatUid ()).append ("] ");
        if (full) { if (Objects.nonNull (getCphMacWrk ())) { str.append ("CphMacWrk[").append (getCphMacWrk ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCphMacEqp ())) { str.append ("CphMacEqp[").append (getCphMacEqp ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCphManWrk ())) { str.append ("CphManWrk[").append (getCphManWrk ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCphManEqp ())) { str.append ("CphManEqp[").append (getCphManEqp ()).append ("] "); } }
        if (full) { str.append ("Enb[").append (getEnb ()).append ("] "); }
        if (full) { str.append ("Tmp[").append (getTmp ()).append ("] "); }
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
        if (getWrc () != null) { str.append ("\n").append (indent).append ("Wrc: \n").append (getWrc ().debug (full, true, indent + "    ")); }
        if (getMac () != null) { str.append ("\n").append (indent).append ("Mac: \n").append (getMac ().debug (full, true, indent + "    ")); }
        if (getCstRat () != null) { str.append ("\n").append (indent).append ("CstRat: \n").append (getCstRat ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public CstWrkCenImpl newEmptyInstance () { return (CstWrkCenImpl) newInstance (); }
    
    @Override public CstWrkCenImpl getCopy () {
        return (CstWrkCenImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (CstWrkCen _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return CstWrkCenImpl.baseUrl (); }
    public static String baseUrl () { return CstWrkCenImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { CstWrkCenImpl.baseUrl = baseUrl; } 

    @Override public List<CstWrkCenFields> getFields () { return Arrays.asList (CstWrkCenFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // CstWrkCenImpl
