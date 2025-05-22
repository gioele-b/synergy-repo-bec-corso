package net.synergy2.db.sys;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngDbmRfkImpl extends AngDbmRfk {

    protected AngDbmRfkImpl () { super (); }

    public enum AngDbmRfkFields implements ISField {
        Uid, DbmRfkNam, TblUidSrc, TblUidTrg, RfkLog, RfkMngCls, PrsUid, Als, RevAls, OneOneRfk, RfkCsd, Tsi, Tsu, Rsi, Rsu, MdlUid;
    } // AngDbmRfkFields
    
    private static String baseUrl = "/rest/sys/AngDbmRfk";


    @Override public String getModelClassName () { return "AngDbmRfkImpl"; }




    
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
        str.append ("DbmRfkNam[").append (getDbmRfkNam ()).append ("] ");
        str.append ("TblUidSrc[").append (getTblUidSrc ()).append ("] ");
        str.append ("TblUidTrg[").append (getTblUidTrg ()).append ("] ");
        if (full) { str.append ("RfkLog[").append (getRfkLog ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRfkMngCls ())) { str.append ("RfkMngCls[").append (getRfkMngCls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrsUid ())) { str.append ("PrsUid[").append (getPrsUid ()).append ("] "); } }
        str.append ("Als[").append (getAls ()).append ("] ");
        str.append ("RevAls[").append (getRevAls ()).append ("] ");
        if (full) { str.append ("OneOneRfk[").append (getOneOneRfk ()).append ("] "); }
        if (full) { str.append ("RfkCsd[").append (getRfkCsd ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getMdlUid ())) { str.append ("MdlUid[").append (getMdlUid ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getRfkColLst () != null) { str.append ("\n").append (indent).append ("RfkColLst (").append (getRfkColLst ().size ()).append ("):"); for (var model : getRfkColLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQryJoiLst () != null) { str.append ("\n").append (indent).append ("QryJoiLst (").append (getQryJoiLst ().size ()).append ("):"); for (var model : getQryJoiLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getPrtTbl () != null) { str.append ("\n").append (indent).append ("PrtTbl: \n").append (getPrtTbl ().debug (full, true, indent + "    ")); }
        if (getChdTbl () != null) { str.append ("\n").append (indent).append ("ChdTbl: \n").append (getChdTbl ().debug (full, true, indent + "    ")); }
        if (getPrs () != null) { str.append ("\n").append (indent).append ("Prs: \n").append (getPrs ().debug (full, true, indent + "    ")); }
        if (getMdlRef () != null) { str.append ("\n").append (indent).append ("MdlRef: \n").append (getMdlRef ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngDbmRfkImpl newEmptyInstance () { return (AngDbmRfkImpl) newInstance (); }
    
    @Override public AngDbmRfkImpl getCopy () {
        return (AngDbmRfkImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngDbmRfk _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngDbmRfkImpl.baseUrl (); }
    public static String baseUrl () { return AngDbmRfkImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngDbmRfkImpl.baseUrl = baseUrl; } 

    @Override public List<AngDbmRfkFields> getFields () { return Arrays.asList (AngDbmRfkFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngDbmRfkImpl
