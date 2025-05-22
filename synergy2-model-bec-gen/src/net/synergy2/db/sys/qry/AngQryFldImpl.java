package net.synergy2.db.sys.qry;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngQryFldImpl extends AngQryFld {

    protected AngQryFldImpl () { super (); }

    public enum AngQryFldFields implements ISField {
        Uid, QryUid, FldCod, FldSrt, TblAls, DbmColUid, ScmFldUid, ClcColUid, Tsi, Tsu, Rsi, Rsu, MulValTblNam, MulValColNam;
    } // AngQryFldFields
    
    private static String baseUrl = "/rest/sys/qry/AngQryFld";


    @Override public String getModelClassName () { return "AngQryFldImpl"; }




    
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
        str.append ("QryUid[").append (getQryUid ()).append ("] ");
        str.append ("FldCod[").append (getFldCod ()).append ("] ");
        if (full) { str.append ("FldSrt[").append (getFldSrt ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTblAls ())) { str.append ("TblAls[").append (getTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDbmColUid ())) { str.append ("DbmColUid[").append (getDbmColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getScmFldUid ())) { str.append ("ScmFldUid[").append (getScmFldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClcColUid ())) { str.append ("ClcColUid[").append (getClcColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getMulValTblNam ())) { str.append ("MulValTblNam[").append (getMulValTblNam ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getMulValColNam ())) { str.append ("MulValColNam[").append (getMulValColNam ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getDatSetFltLst () != null) { str.append ("\n").append (indent).append ("DatSetFltLst (").append (getDatSetFltLst ().size ()).append ("):"); for (var model : getDatSetFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDatSetFltValLst () != null) { str.append ("\n").append (indent).append ("DatSetFltValLst (").append (getDatSetFltValLst ().size ()).append ("):"); for (var model : getDatSetFltValLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQry () != null) { str.append ("\n").append (indent).append ("Qry: \n").append (getQry ().debug (full, true, indent + "    ")); }
        if (getDbmCol () != null) { str.append ("\n").append (indent).append ("DbmCol: \n").append (getDbmCol ().debug (full, true, indent + "    ")); }
        if (getScmFld () != null) { str.append ("\n").append (indent).append ("ScmFld: \n").append (getScmFld ().debug (full, true, indent + "    ")); }
        if (getClcCol () != null) { str.append ("\n").append (indent).append ("ClcCol: \n").append (getClcCol ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngQryFldImpl newEmptyInstance () { return (AngQryFldImpl) newInstance (); }
    
    @Override public AngQryFldImpl getCopy () {
        return (AngQryFldImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngQryFld _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngQryFldImpl.baseUrl (); }
    public static String baseUrl () { return AngQryFldImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngQryFldImpl.baseUrl = baseUrl; } 

    @Override public List<AngQryFldFields> getFields () { return Arrays.asList (AngQryFldFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngQryFldImpl
