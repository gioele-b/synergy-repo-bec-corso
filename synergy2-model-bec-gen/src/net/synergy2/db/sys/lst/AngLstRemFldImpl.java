package net.synergy2.db.sys.lst;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngLstRemFldImpl extends AngLstRemFld {

    protected AngLstRemFldImpl () { super (); }

    public enum AngLstRemFldFields implements ISField {
        Uid, FldCod, LstRemUid, RemFld, LblUid, FldSrt, FldTyp, FldSubTyp, FlgKey, FlgCod, FlgDsc, EnbFlt, EnbDet, EnbGrd, EnbFltFulTxt, Tsi, Tsu, Rsi, Rsu, ShwLbl;
    } // AngLstRemFldFields
    
    private static String baseUrl = "/rest/sys/lst/AngLstRemFld";


    @Override public String getModelClassName () { return "AngLstRemFldImpl"; }




    
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
        str.append ("FldCod[").append (getFldCod ()).append ("] ");
        str.append ("LstRemUid[").append (getLstRemUid ()).append ("] ");
        if (full) { str.append ("RemFld[").append (getRemFld ()).append ("] "); }
        if (full) { str.append ("LblUid[").append (getLblUid ()).append ("] "); }
        if (full) { str.append ("FldSrt[").append (getFldSrt ()).append ("] "); }
        if (full) { str.append ("FldTyp[").append (getFldTyp ()).append ("] "); }
        if (full) { if (Objects.nonNull (getFldSubTyp ())) { str.append ("FldSubTyp[").append (getFldSubTyp ()).append ("] "); } }
        if (full) { str.append ("FlgKey[").append (getFlgKey ()).append ("] "); }
        if (full) { str.append ("FlgCod[").append (getFlgCod ()).append ("] "); }
        if (full) { str.append ("FlgDsc[").append (getFlgDsc ()).append ("] "); }
        if (full) { str.append ("EnbFlt[").append (getEnbFlt ()).append ("] "); }
        if (full) { str.append ("EnbDet[").append (getEnbDet ()).append ("] "); }
        if (full) { str.append ("EnbGrd[").append (getEnbGrd ()).append ("] "); }
        if (full) { str.append ("EnbFltFulTxt[").append (getEnbFltFulTxt ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { str.append ("ShwLbl[").append (getShwLbl ()).append ("] "); }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getLstRem () != null) { str.append ("\n").append (indent).append ("LstRem: \n").append (getLstRem ().debug (full, true, indent + "    ")); }
        if (getLbl () != null) { str.append ("\n").append (indent).append ("Lbl: \n").append (getLbl ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngLstRemFldImpl newEmptyInstance () { return (AngLstRemFldImpl) newInstance (); }
    
    @Override public AngLstRemFldImpl getCopy () {
        return (AngLstRemFldImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngLstRemFld _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngLstRemFldImpl.baseUrl (); }
    public static String baseUrl () { return AngLstRemFldImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngLstRemFldImpl.baseUrl = baseUrl; } 

    @Override public List<AngLstRemFldFields> getFields () { return Arrays.asList (AngLstRemFldFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngLstRemFldImpl
