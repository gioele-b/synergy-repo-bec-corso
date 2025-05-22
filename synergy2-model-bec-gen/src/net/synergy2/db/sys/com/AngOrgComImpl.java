package net.synergy2.db.sys.com;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngOrgComImpl extends AngOrgCom {

    protected AngOrgComImpl () { super (); }

    public enum AngOrgComFields implements ISField {
        Uid, OrgComCod, OrgComDsc, OrgComFlt, OrgComShwGlb, OrgComEdtGlb, OrgComLogImg, Tsi, Tsu, Rsi, Rsu, OrgVatCod, OrgComPlcUid, CalUid;
    } // AngOrgComFields
    
    private static String baseUrl = "/rest/sys/com/AngOrgCom";


    @Override public String getModelClassName () { return "AngOrgComImpl"; }




    
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
        str.append ("OrgComCod[").append (getOrgComCod ()).append ("] ");
        str.append ("OrgComDsc[").append (getOrgComDsc ()).append ("] ");
        if (full) { str.append ("OrgComFlt[").append (getOrgComFlt ()).append ("] "); }
        if (full) { str.append ("OrgComShwGlb[").append (getOrgComShwGlb ()).append ("] "); }
        if (full) { str.append ("OrgComEdtGlb[").append (getOrgComEdtGlb ()).append ("] "); }
        if (full) { if (Objects.nonNull (getOrgComLogImg ())) { str.append ("OrgComLogImg[").append (getOrgComLogImg ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getOrgVatCod ())) { str.append ("OrgVatCod[").append (getOrgVatCod ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getOrgComPlcUid ())) { str.append ("OrgComPlcUid[").append (getOrgComPlcUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCalUid ())) { str.append ("CalUid[").append (getCalUid ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getAngResLst () != null) { str.append ("\n").append (indent).append ("AngResLst (").append (getAngResLst ().size ()).append ("):"); for (var model : getAngResLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngItmLst () != null) { str.append ("\n").append (indent).append ("AngItmLst (").append (getAngItmLst ().size ()).append ("):"); for (var model : getAngItmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngPlnLst () != null) { str.append ("\n").append (indent).append ("AngPlnLst (").append (getAngPlnLst ().size ()).append ("):"); for (var model : getAngPlnLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAbsLst () != null) { str.append ("\n").append (indent).append ("AbsLst (").append (getAbsLst ().size ()).append ("):"); for (var model : getAbsLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysCodRulLst () != null) { str.append ("\n").append (indent).append ("SysCodRulLst (").append (getSysCodRulLst ().size ()).append ("):"); for (var model : getSysCodRulLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRemSrvLst () != null) { str.append ("\n").append (indent).append ("RemSrvLst (").append (getRemSrvLst ().size ()).append ("):"); for (var model : getRemSrvLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLstLst () != null) { str.append ("\n").append (indent).append ("LstLst (").append (getLstLst ().size ()).append ("):"); for (var model : getLstLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCstCenLst () != null) { str.append ("\n").append (indent).append ("CstCenLst (").append (getCstCenLst ().size ()).append ("):"); for (var model : getCstCenLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getBusUniLst () != null) { str.append ("\n").append (indent).append ("BusUniLst (").append (getBusUniLst ().size ()).append ("):"); for (var model : getBusUniLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getOrgComPlc () != null) { str.append ("\n").append (indent).append ("OrgComPlc: \n").append (getOrgComPlc ().debug (full, true, indent + "    ")); }
        if (getCal () != null) { str.append ("\n").append (indent).append ("Cal: \n").append (getCal ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngOrgComImpl newEmptyInstance () { return (AngOrgComImpl) newInstance (); }
    
    @Override public AngOrgComImpl getCopy () {
        return (AngOrgComImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngOrgCom _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngOrgComImpl.baseUrl (); }
    public static String baseUrl () { return AngOrgComImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngOrgComImpl.baseUrl = baseUrl; } 

    @Override public List<AngOrgComFields> getFields () { return Arrays.asList (AngOrgComFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngOrgComImpl
