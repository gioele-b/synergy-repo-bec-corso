package net.synergy2.db.sys.org;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngCstCenImpl extends AngCstCen {

    protected AngCstCenImpl () { super (); }

    public enum AngCstCenFields implements ISField {
        Uid, CstCenCod, CstCenDsc, CstCenIco, CstCenCol, CstCenTypUid, OrgComUid, CstCenCrp, Cst, CurUid, UniMeaTmpUid, CstCenNot, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // AngCstCenFields
    
    private static String baseUrl = "/rest/sys/org/AngCstCen";


    @Override public String getModelClassName () { return "AngCstCenImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngCstCenImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("CstCenCod[").append (getCstCenCod ()).append ("] ");
        str.append ("CstCenDsc[").append (getCstCenDsc ()).append ("] ");
        if (full) { str.append ("CstCenIco[").append (getCstCenIco ()).append ("] "); }
        if (full) { str.append ("CstCenCol[").append (getCstCenCol ()).append ("] "); }
        if (full) { str.append ("CstCenTypUid[").append (getCstCenTypUid ()).append ("] "); }
        if (full) { str.append ("OrgComUid[").append (getOrgComUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getCstCenCrp ())) { str.append ("CstCenCrp[").append (getCstCenCrp ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCst ())) { str.append ("Cst[").append (getCst ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCurUid ())) { str.append ("CurUid[").append (getCurUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getUniMeaTmpUid ())) { str.append ("UniMeaTmpUid[").append (getUniMeaTmpUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCstCenNot ())) { str.append ("CstCenNot[").append (getCstCenNot ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
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
        if (getPrdWrkLst () != null) { str.append ("\n").append (indent).append ("PrdWrkLst (").append (getPrdWrkLst ().size ()).append ("):"); for (var model : getPrdWrkLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAngCstCenTyp () != null) { str.append ("\n").append (indent).append ("AngCstCenTyp: \n").append (getAngCstCenTyp ().debug (full, true, indent + "    ")); }
        if (getAngOrgCom () != null) { str.append ("\n").append (indent).append ("AngOrgCom: \n").append (getAngOrgCom ().debug (full, true, indent + "    ")); }
        if (getAngCur () != null) { str.append ("\n").append (indent).append ("AngCur: \n").append (getAngCur ().debug (full, true, indent + "    ")); }
        if (getAngUniMeaTmp () != null) { str.append ("\n").append (indent).append ("AngUniMeaTmp: \n").append (getAngUniMeaTmp ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngCstCenImpl newEmptyInstance () { return (AngCstCenImpl) newInstance (); }
    
    @Override public AngCstCenImpl getCopy () {
        var toReturn = (AngCstCenImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngCstCen _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngCstCenImpl.baseUrl (); }
    public static String baseUrl () { return AngCstCenImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngCstCenImpl.baseUrl = baseUrl; } 

    @Override public List<AngCstCenFields> getFields () { return Arrays.asList (AngCstCenFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngCstCenImpl
