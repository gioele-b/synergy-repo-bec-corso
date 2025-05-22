package net.synergy2.db.sys.doc;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysDocCtxImpl extends SysDocCtx {

    protected SysDocCtxImpl () { super (); }

    public enum SysDocCtxFields implements ISField {
        Uid, CtxCod, CtxDsc, TblUid, QryUid, CtxNot, CtxApp, SavSys, Tsi, Tsu, Rsi, Rsu;
    } // SysDocCtxFields
    
    private static String baseUrl = "/rest/sys/doc/SysDocCtx";


    @Override public String getModelClassName () { return "SysDocCtxImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public SysDocCtxImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("CtxCod[").append (getCtxCod ()).append ("] ");
        str.append ("CtxDsc[").append (getCtxDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getTblUid ())) { str.append ("TblUid[").append (getTblUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getQryUid ())) { str.append ("QryUid[").append (getQryUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCtxNot ())) { str.append ("CtxNot[").append (getCtxNot ()).append ("] "); } }
        if (full) { str.append ("CtxApp[").append (getCtxApp ()).append ("] "); }
        if (full) { str.append ("SavSys[").append (getSavSys ()).append ("] "); }
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
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDocClsLst () != null) { str.append ("\n").append (indent).append ("DocClsLst (").append (getDocClsLst ().size ()).append ("):"); for (var model : getDocClsLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCatAttLst () != null) { str.append ("\n").append (indent).append ("CatAttLst (").append (getCatAttLst ().size ()).append ("):"); for (var model : getCatAttLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getTbl () != null) { str.append ("\n").append (indent).append ("Tbl: \n").append (getTbl ().debug (full, true, indent + "    ")); }
        if (getQry () != null) { str.append ("\n").append (indent).append ("Qry: \n").append (getQry ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysDocCtxImpl newEmptyInstance () { return (SysDocCtxImpl) newInstance (); }
    
    @Override public SysDocCtxImpl getCopy () {
        var toReturn = (SysDocCtxImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (SysDocCtx _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysDocCtxImpl.baseUrl (); }
    public static String baseUrl () { return SysDocCtxImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysDocCtxImpl.baseUrl = baseUrl; } 

    @Override public List<SysDocCtxFields> getFields () { return Arrays.asList (SysDocCtxFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysDocCtxImpl
