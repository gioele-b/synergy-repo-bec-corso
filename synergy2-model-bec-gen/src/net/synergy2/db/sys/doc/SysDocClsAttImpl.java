package net.synergy2.db.sys.doc;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysDocClsAttImpl extends SysDocClsAtt {

    protected SysDocClsAttImpl () { super (); }

    public enum SysDocClsAttFields implements ISField {
        Uid, DocClsUid, AttSrt, AttDsc, LblUid, RemAtt, AttTyp, AttSubTyp, AttLst, AttHid, AttReaOnl, AttReq, AttMaxSizPri, AttMaxSizSec, AttFlt, Tsi, Tsu, Rsi, Rsu;
    } // SysDocClsAttFields
    
    private static String baseUrl = "/rest/sys/doc/SysDocClsAtt";


    @Override public String getModelClassName () { return "SysDocClsAttImpl"; }




    
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
        str.append ("DocClsUid[").append (getDocClsUid ()).append ("] ");
        if (full) { str.append ("AttSrt[").append (getAttSrt ()).append ("] "); }
        if (Objects.nonNull (getAttDsc ())) { str.append ("AttDsc[").append (getAttDsc ()).append ("] "); }
        if (full) { if (Objects.nonNull (getLblUid ())) { str.append ("LblUid[").append (getLblUid ()).append ("] "); } }
        str.append ("RemAtt[").append (getRemAtt ()).append ("] ");
        if (full) { str.append ("AttTyp[").append (getAttTyp ()).append ("] "); }
        if (full) { if (Objects.nonNull (getAttSubTyp ())) { str.append ("AttSubTyp[").append (getAttSubTyp ()).append ("] "); } }
        if (full) { str.append ("AttLst[").append (getAttLst ()).append ("] "); }
        if (full) { str.append ("AttHid[").append (getAttHid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getAttReaOnl ())) { str.append ("AttReaOnl[").append (getAttReaOnl ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getAttReq ())) { str.append ("AttReq[").append (getAttReq ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getAttMaxSizPri ())) { str.append ("AttMaxSizPri[").append (getAttMaxSizPri ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getAttMaxSizSec ())) { str.append ("AttMaxSizSec[").append (getAttMaxSizSec ()).append ("] "); } }
        if (full) { str.append ("AttFlt[").append (getAttFlt ()).append ("] "); }
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
        if (getDocCtxLst () != null) { str.append ("\n").append (indent).append ("DocCtxLst (").append (getDocCtxLst ().size ()).append ("):"); for (var model : getDocCtxLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getFltLst () != null) { str.append ("\n").append (indent).append ("FltLst (").append (getFltLst ().size ()).append ("):"); for (var model : getFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysDocCls () != null) { str.append ("\n").append (indent).append ("SysDocCls: \n").append (getSysDocCls ().debug (full, true, indent + "    ")); }
        if (getSysTraLbl () != null) { str.append ("\n").append (indent).append ("SysTraLbl: \n").append (getSysTraLbl ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysDocClsAttImpl newEmptyInstance () { return (SysDocClsAttImpl) newInstance (); }
    
    @Override public SysDocClsAttImpl getCopy () {
        return (SysDocClsAttImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysDocClsAtt _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysDocClsAttImpl.baseUrl (); }
    public static String baseUrl () { return SysDocClsAttImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysDocClsAttImpl.baseUrl = baseUrl; } 

    @Override public List<SysDocClsAttFields> getFields () { return Arrays.asList (SysDocClsAttFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysDocClsAttImpl
