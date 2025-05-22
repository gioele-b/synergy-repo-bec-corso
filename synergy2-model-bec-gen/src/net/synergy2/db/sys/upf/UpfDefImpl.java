package net.synergy2.db.sys.upf;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class UpfDefImpl extends UpfDef {

    protected UpfDefImpl () { super (); }

    public enum UpfDefFields implements ISField {
        Uid, TblUid, FldNam, FldSrt, FldTyp, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, FldSubTyp, LblUid, LstCod, FldHid, FldReaOnl, FldQckFrm, FldReq, FldDefVal, FldMaxSizPri, FldMaxSizSec, FldTag, LstRemUid;
    } // UpfDefFields
    
    private static String baseUrl = "/rest/sys/upf/UpfDef";


    @Override public String getModelClassName () { return "UpfDefImpl"; }




    
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
        str.append ("TblUid[").append (getTblUid ()).append ("] ");
        str.append ("FldNam[").append (getFldNam ()).append ("] ");
        if (full) { str.append ("FldSrt[").append (getFldSrt ()).append ("] "); }
        if (full) { str.append ("FldTyp[").append (getFldTyp ()).append ("] "); }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFldSubTyp ())) { str.append ("FldSubTyp[").append (getFldSubTyp ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLblUid ())) { str.append ("LblUid[").append (getLblUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLstCod ())) { str.append ("LstCod[").append (getLstCod ()).append ("] "); } }
        if (full) { str.append ("FldHid[").append (getFldHid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getFldReaOnl ())) { str.append ("FldReaOnl[").append (getFldReaOnl ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFldQckFrm ())) { str.append ("FldQckFrm[").append (getFldQckFrm ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFldReq ())) { str.append ("FldReq[").append (getFldReq ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFldDefVal ())) { str.append ("FldDefVal[").append (getFldDefVal ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFldMaxSizPri ())) { str.append ("FldMaxSizPri[").append (getFldMaxSizPri ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFldMaxSizSec ())) { str.append ("FldMaxSizSec[").append (getFldMaxSizSec ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFldTag ())) { str.append ("FldTag[").append (getFldTag ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLstRemUid ())) { str.append ("LstRemUid[").append (getLstRemUid ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getTbl () != null) { str.append ("\n").append (indent).append ("Tbl: \n").append (getTbl ().debug (full, true, indent + "    ")); }
        if (getLbl () != null) { str.append ("\n").append (indent).append ("Lbl: \n").append (getLbl ().debug (full, true, indent + "    ")); }
        if (getLstRem () != null) { str.append ("\n").append (indent).append ("LstRem: \n").append (getLstRem ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public UpfDefImpl newEmptyInstance () { return (UpfDefImpl) newInstance (); }
    
    @Override public UpfDefImpl getCopy () {
        return (UpfDefImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (UpfDef _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return UpfDefImpl.baseUrl (); }
    public static String baseUrl () { return UpfDefImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { UpfDefImpl.baseUrl = baseUrl; } 

    @Override public List<UpfDefFields> getFields () { return Arrays.asList (UpfDefFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // UpfDefImpl
