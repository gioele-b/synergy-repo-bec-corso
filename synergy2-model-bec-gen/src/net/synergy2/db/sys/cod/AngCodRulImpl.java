package net.synergy2.db.sys.cod;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngCodRulImpl extends AngCodRul {

    protected AngCodRulImpl () { super (); }

    public enum AngCodRulFields implements ISField {
        Uid, CodRulCod, CodRulDsc, OrgComRefUid, CodRulTyp, CodPreFix, CodPosFix, CodNumLen, Tsi, Tsu, Rsi, Rsu;
    } // AngCodRulFields
    
    private static String baseUrl = "/rest/sys/cod/AngCodRul";


    @Override public String getModelClassName () { return "AngCodRulImpl"; }




    
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
        str.append ("CodRulCod[").append (getCodRulCod ()).append ("] ");
        str.append ("CodRulDsc[").append (getCodRulDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getOrgComRefUid ())) { str.append ("OrgComRefUid[").append (getOrgComRefUid ()).append ("] "); } }
        if (full) { str.append ("CodRulTyp[").append (getCodRulTyp ()).append ("] "); }
        if (full) { if (Objects.nonNull (getCodPreFix ())) { str.append ("CodPreFix[").append (getCodPreFix ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCodPosFix ())) { str.append ("CodPosFix[").append (getCodPosFix ()).append ("] "); } }
        if (full) { str.append ("CodNumLen[").append (getCodNumLen ()).append ("] "); }
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
        if (getCodValLst () != null) { str.append ("\n").append (indent).append ("CodValLst (").append (getCodValLst ().size ()).append ("):"); for (var model : getCodValLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCodRulTblLst () != null) { str.append ("\n").append (indent).append ("CodRulTblLst (").append (getCodRulTblLst ().size ()).append ("):"); for (var model : getCodRulTblLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getOrg () != null) { str.append ("\n").append (indent).append ("Org: \n").append (getOrg ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngCodRulImpl newEmptyInstance () { return (AngCodRulImpl) newInstance (); }
    
    @Override public AngCodRulImpl getCopy () {
        return (AngCodRulImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngCodRul _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngCodRulImpl.baseUrl (); }
    public static String baseUrl () { return AngCodRulImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngCodRulImpl.baseUrl = baseUrl; } 

    @Override public List<AngCodRulFields> getFields () { return Arrays.asList (AngCodRulFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngCodRulImpl
