package net.synergy2.db.sys.doc;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysDocClsCtxFltImpl extends SysDocClsCtxFlt {

    protected SysDocClsCtxFltImpl () { super (); }

    public enum SysDocClsCtxFltFields implements ISField {
        Uid, DocClsCtxUid, FltSrt, FltTyp, OprLog, OprAri, FltAttUid, FltOpr, Val, ValDbmColUid, ValQryTblAls, ValQryColUid, ValQryFldUid, ValQryClcUid, ValDtsFldNam, Tsi, Tsu, Rsi, Rsu;
    } // SysDocClsCtxFltFields
    
    private static String baseUrl = "/rest/sys/doc/SysDocClsCtxFlt";


    @Override public String getModelClassName () { return "SysDocClsCtxFltImpl"; }




    
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
        str.append ("DocClsCtxUid[").append (getDocClsCtxUid ()).append ("] ");
        str.append ("FltSrt[").append (getFltSrt ()).append ("] ");
        if (full) { if (Objects.nonNull (getFltTyp ())) { str.append ("FltTyp[").append (getFltTyp ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getOprLog ())) { str.append ("OprLog[").append (getOprLog ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getOprAri ())) { str.append ("OprAri[").append (getOprAri ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFltAttUid ())) { str.append ("FltAttUid[").append (getFltAttUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFltOpr ())) { str.append ("FltOpr[").append (getFltOpr ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getVal ())) { str.append ("Val[").append (getVal ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValDbmColUid ())) { str.append ("ValDbmColUid[").append (getValDbmColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValQryTblAls ())) { str.append ("ValQryTblAls[").append (getValQryTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValQryColUid ())) { str.append ("ValQryColUid[").append (getValQryColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValQryFldUid ())) { str.append ("ValQryFldUid[").append (getValQryFldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValQryClcUid ())) { str.append ("ValQryClcUid[").append (getValQryClcUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValDtsFldNam ())) { str.append ("ValDtsFldNam[").append (getValDtsFldNam ()).append ("] "); } }
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
        if (getDocClsCtx () != null) { str.append ("\n").append (indent).append ("DocClsCtx: \n").append (getDocClsCtx ().debug (full, true, indent + "    ")); }
        if (getFltAtt () != null) { str.append ("\n").append (indent).append ("FltAtt: \n").append (getFltAtt ().debug (full, true, indent + "    ")); }
        if (getValDbmTblCol () != null) { str.append ("\n").append (indent).append ("ValDbmTblCol: \n").append (getValDbmTblCol ().debug (full, true, indent + "    ")); }
        if (getValQryCol () != null) { str.append ("\n").append (indent).append ("ValQryCol: \n").append (getValQryCol ().debug (full, true, indent + "    ")); }
        if (getValQryFld () != null) { str.append ("\n").append (indent).append ("ValQryFld: \n").append (getValQryFld ().debug (full, true, indent + "    ")); }
        if (getValQryClc () != null) { str.append ("\n").append (indent).append ("ValQryClc: \n").append (getValQryClc ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysDocClsCtxFltImpl newEmptyInstance () { return (SysDocClsCtxFltImpl) newInstance (); }
    
    @Override public SysDocClsCtxFltImpl getCopy () {
        return (SysDocClsCtxFltImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysDocClsCtxFlt _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysDocClsCtxFltImpl.baseUrl (); }
    public static String baseUrl () { return SysDocClsCtxFltImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysDocClsCtxFltImpl.baseUrl = baseUrl; } 

    @Override public List<SysDocClsCtxFltFields> getFields () { return Arrays.asList (SysDocClsCtxFltFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysDocClsCtxFltImpl
