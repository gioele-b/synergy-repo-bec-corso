package net.synergy2.db.sys.doc;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysDocClsCtxImpl extends SysDocClsCtx {

    protected SysDocClsCtxImpl () { super (); }

    public enum SysDocClsCtxFields implements ISField {
        Uid, DocCtxUid, DocClsUid, DatSetUid, LoaLstVrs, FrmDsgUid, NumDocMin, NumDocMax, DocClsSrt, Tsi, Tsu, Rsi, Rsu, EnbLoa, EnbAss, VieLnk, VieCom, VieVrs, VieAprHis, VieAprPrc, EnbDftBtn;
    } // SysDocClsCtxFields
    
    private static String baseUrl = "/rest/sys/doc/SysDocClsCtx";


    @Override public String getModelClassName () { return "SysDocClsCtxImpl"; }




    
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
        str.append ("DocCtxUid[").append (getDocCtxUid ()).append ("] ");
        str.append ("DocClsUid[").append (getDocClsUid ()).append ("] ");
        if (Objects.nonNull (getDatSetUid ())) { str.append ("DatSetUid[").append (getDatSetUid ()).append ("] "); }
        if (full) { str.append ("LoaLstVrs[").append (getLoaLstVrs ()).append ("] "); }
        if (full) { if (Objects.nonNull (getFrmDsgUid ())) { str.append ("FrmDsgUid[").append (getFrmDsgUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getNumDocMin ())) { str.append ("NumDocMin[").append (getNumDocMin ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getNumDocMax ())) { str.append ("NumDocMax[").append (getNumDocMax ()).append ("] "); } }
        if (full) { str.append ("DocClsSrt[").append (getDocClsSrt ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { str.append ("EnbLoa[").append (getEnbLoa ()).append ("] "); }
        if (full) { str.append ("EnbAss[").append (getEnbAss ()).append ("] "); }
        if (full) { str.append ("VieLnk[").append (getVieLnk ()).append ("] "); }
        if (full) { str.append ("VieCom[").append (getVieCom ()).append ("] "); }
        if (full) { str.append ("VieVrs[").append (getVieVrs ()).append ("] "); }
        if (full) { str.append ("VieAprHis[").append (getVieAprHis ()).append ("] "); }
        if (full) { str.append ("VieAprPrc[").append (getVieAprPrc ()).append ("] "); }
        if (full) { str.append ("EnbDftBtn[").append (getEnbDftBtn ()).append ("] "); }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getAttLst () != null) { str.append ("\n").append (indent).append ("AttLst (").append (getAttLst ().size ()).append ("):"); for (var model : getAttLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getFltLst () != null) { str.append ("\n").append (indent).append ("FltLst (").append (getFltLst ().size ()).append ("):"); for (var model : getFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDocCtx () != null) { str.append ("\n").append (indent).append ("DocCtx: \n").append (getDocCtx ().debug (full, true, indent + "    ")); }
        if (getDocCls () != null) { str.append ("\n").append (indent).append ("DocCls: \n").append (getDocCls ().debug (full, true, indent + "    ")); }
        if (getDatSet () != null) { str.append ("\n").append (indent).append ("DatSet: \n").append (getDatSet ().debug (full, true, indent + "    ")); }
        if (getFrmDsg () != null) { str.append ("\n").append (indent).append ("FrmDsg: \n").append (getFrmDsg ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysDocClsCtxImpl newEmptyInstance () { return (SysDocClsCtxImpl) newInstance (); }
    
    @Override public SysDocClsCtxImpl getCopy () {
        return (SysDocClsCtxImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysDocClsCtx _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysDocClsCtxImpl.baseUrl (); }
    public static String baseUrl () { return SysDocClsCtxImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysDocClsCtxImpl.baseUrl = baseUrl; } 

    @Override public List<SysDocClsCtxFields> getFields () { return Arrays.asList (SysDocClsCtxFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysDocClsCtxImpl
