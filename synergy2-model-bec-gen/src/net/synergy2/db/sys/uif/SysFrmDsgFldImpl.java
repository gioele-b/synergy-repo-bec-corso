package net.synergy2.db.sys.uif;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysFrmDsgFldImpl extends SysFrmDsgFld {

    protected SysFrmDsgFldImpl () { super (); }

    public enum SysFrmDsgFldFields implements ISField {
        Uid, FldCod, LblCod, FldSrt, FldHid, FldReaOnl, FldQckFrm, FldReq, FldDefVal, FldTyp, FldCmpTyp, FldColSiz, AltLblCod, DbmColUid, TabUid, DsgRefUid, FldDefValEnb, SmtWdg, Tsi, Tsu, Rsi, Rsu, FldIns, FldDel, FldInsLckUpd, FldIco, DefValKey, LstCod, ActFldRefUid, LstRemUid;
    } // SysFrmDsgFldFields
    
    private static String baseUrl = "/rest/sys/uif/SysFrmDsgFld";


    @Override public String getModelClassName () { return "SysFrmDsgFldImpl"; }




    
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
        if (Objects.nonNull (getFldCod ())) { str.append ("FldCod[").append (getFldCod ()).append ("] "); }
        if (full) { if (Objects.nonNull (getLblCod ())) { str.append ("LblCod[").append (getLblCod ()).append ("] "); } }
        if (full) { str.append ("FldSrt[").append (getFldSrt ()).append ("] "); }
        if (full) { str.append ("FldHid[").append (getFldHid ()).append ("] "); }
        if (full) { str.append ("FldReaOnl[").append (getFldReaOnl ()).append ("] "); }
        if (full) { str.append ("FldQckFrm[").append (getFldQckFrm ()).append ("] "); }
        if (full) { str.append ("FldReq[").append (getFldReq ()).append ("] "); }
        if (full) { if (Objects.nonNull (getFldDefVal ())) { str.append ("FldDefVal[").append (getFldDefVal ()).append ("] "); } }
        if (full) { str.append ("FldTyp[").append (getFldTyp ()).append ("] "); }
        if (full) { if (Objects.nonNull (getFldCmpTyp ())) { str.append ("FldCmpTyp[").append (getFldCmpTyp ()).append ("] "); } }
        if (full) { str.append ("FldColSiz[").append (getFldColSiz ()).append ("] "); }
        if (full) { if (Objects.nonNull (getAltLblCod ())) { str.append ("AltLblCod[").append (getAltLblCod ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDbmColUid ())) { str.append ("DbmColUid[").append (getDbmColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTabUid ())) { str.append ("TabUid[").append (getTabUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDsgRefUid ())) { str.append ("DsgRefUid[").append (getDsgRefUid ()).append ("] "); } }
        if (full) { str.append ("FldDefValEnb[").append (getFldDefValEnb ()).append ("] "); }
        if (full) { str.append ("SmtWdg[").append (getSmtWdg ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { str.append ("FldIns[").append (getFldIns ()).append ("] "); }
        if (full) { str.append ("FldDel[").append (getFldDel ()).append ("] "); }
        if (full) { str.append ("FldInsLckUpd[").append (getFldInsLckUpd ()).append ("] "); }
        if (full) { if (Objects.nonNull (getFldIco ())) { str.append ("FldIco[").append (getFldIco ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDefValKey ())) { str.append ("DefValKey[").append (getDefValKey ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLstCod ())) { str.append ("LstCod[").append (getLstCod ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getActFldRefUid ())) { str.append ("ActFldRefUid[").append (getActFldRefUid ()).append ("] "); } }
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
        if (getDocClsCtxAttLst () != null) { str.append ("\n").append (indent).append ("DocClsCtxAttLst (").append (getDocClsCtxAttLst ().size ()).append ("):"); for (var model : getDocClsCtxAttLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getFldRolLst () != null) { str.append ("\n").append (indent).append ("FldRolLst (").append (getFldRolLst ().size ()).append ("):"); for (var model : getFldRolLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getActLst () != null) { str.append ("\n").append (indent).append ("ActLst (").append (getActLst ().size ()).append ("):"); for (var model : getActLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getTab () != null) { str.append ("\n").append (indent).append ("Tab: \n").append (getTab ().debug (full, true, indent + "    ")); }
        if (getDbmCol () != null) { str.append ("\n").append (indent).append ("DbmCol: \n").append (getDbmCol ().debug (full, true, indent + "    ")); }
        if (getDsgRef () != null) { str.append ("\n").append (indent).append ("DsgRef: \n").append (getDsgRef ().debug (full, true, indent + "    ")); }
        if (getActFld () != null) { str.append ("\n").append (indent).append ("ActFld: \n").append (getActFld ().debug (full, true, indent + "    ")); }
        if (getLstRem () != null) { str.append ("\n").append (indent).append ("LstRem: \n").append (getLstRem ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysFrmDsgFldImpl newEmptyInstance () { return (SysFrmDsgFldImpl) newInstance (); }
    
    @Override public SysFrmDsgFldImpl getCopy () {
        return (SysFrmDsgFldImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysFrmDsgFld _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysFrmDsgFldImpl.baseUrl (); }
    public static String baseUrl () { return SysFrmDsgFldImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysFrmDsgFldImpl.baseUrl = baseUrl; } 

    @Override public List<SysFrmDsgFldFields> getFields () { return Arrays.asList (SysFrmDsgFldFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysFrmDsgFldImpl
