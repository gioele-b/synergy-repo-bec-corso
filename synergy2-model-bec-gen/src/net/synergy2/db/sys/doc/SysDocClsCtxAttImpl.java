package net.synergy2.db.sys.doc;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysDocClsCtxAttImpl extends SysDocClsCtxAtt {

    protected SysDocClsCtxAttImpl () { super (); }

    public enum SysDocClsCtxAttFields implements ISField {
        Uid, DocClsCtxUid, DocClsAttUid, FrmDsgFldUid, DefDbmColUid, DefVal, DefDatSetFlsNam, DocAttReaOnl, DocAttReq, Tsi, Tsu, Rsi, Rsu;
    } // SysDocClsCtxAttFields
    
    private static String baseUrl = "/rest/sys/doc/SysDocClsCtxAtt";


    @Override public String getModelClassName () { return "SysDocClsCtxAttImpl"; }




    
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
        str.append ("DocClsAttUid[").append (getDocClsAttUid ()).append ("] ");
        if (full) { str.append ("FrmDsgFldUid[").append (getFrmDsgFldUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getDefDbmColUid ())) { str.append ("DefDbmColUid[").append (getDefDbmColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDefVal ())) { str.append ("DefVal[").append (getDefVal ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDefDatSetFlsNam ())) { str.append ("DefDatSetFlsNam[").append (getDefDatSetFlsNam ()).append ("] "); } }
        if (full) { str.append ("DocAttReaOnl[").append (getDocAttReaOnl ()).append ("] "); }
        if (full) { str.append ("DocAttReq[").append (getDocAttReq ()).append ("] "); }
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
        if (getDocClsAtt () != null) { str.append ("\n").append (indent).append ("DocClsAtt: \n").append (getDocClsAtt ().debug (full, true, indent + "    ")); }
        if (getFrmDsgFld () != null) { str.append ("\n").append (indent).append ("FrmDsgFld: \n").append (getFrmDsgFld ().debug (full, true, indent + "    ")); }
        if (getDefDbmCol () != null) { str.append ("\n").append (indent).append ("DefDbmCol: \n").append (getDefDbmCol ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysDocClsCtxAttImpl newEmptyInstance () { return (SysDocClsCtxAttImpl) newInstance (); }
    
    @Override public SysDocClsCtxAttImpl getCopy () {
        return (SysDocClsCtxAttImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysDocClsCtxAtt _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysDocClsCtxAttImpl.baseUrl (); }
    public static String baseUrl () { return SysDocClsCtxAttImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysDocClsCtxAttImpl.baseUrl = baseUrl; } 

    @Override public List<SysDocClsCtxAttFields> getFields () { return Arrays.asList (SysDocClsCtxAttFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysDocClsCtxAttImpl
