package net.synergy2.db.sys.org;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class OrgLvlImpl extends OrgLvl {

    protected OrgLvlImpl () { super (); }

    public enum OrgLvlFields implements ISField {
        Uid, OrgUid, LvlCod, LvlTypUid, EtyUid, LvlDsc, LvlIco, RefLvlUid, LvlDep, LvlSrtBro, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, RepResUid, RepGrpUid;
    } // OrgLvlFields
    
    private static String baseUrl = "/rest/sys/org/OrgLvl";


    @Override public String getModelClassName () { return "OrgLvlImpl"; }




    
    @Override public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        switch (fieldName) {
            case SAlias.ENTITY -> setEntity ((AngEty) value); 

            default -> {
                if (!settedSuper) { throw new SQueryException ("No reference specification found for field [" + fieldName + "]."); }
            }
        } // switch
        return true;
    } // set
    
    @Override public String debug (boolean full, boolean cascade, String indent) {
        StringBuilder str = new StringBuilder (indent).append (getModelClassName ()).append (" = {");
        str.append ("Uid[").append (getUid ()).append ("] ");
        str.append ("OrgUid[").append (getOrgUid ()).append ("] ");
        str.append ("LvlCod[").append (getLvlCod ()).append ("] ");
        if (full) { str.append ("LvlTypUid[").append (getLvlTypUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
        str.append ("LvlDsc[").append (getLvlDsc ()).append ("] ");
        if (full) { str.append ("LvlIco[").append (getLvlIco ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRefLvlUid ())) { str.append ("RefLvlUid[").append (getRefLvlUid ()).append ("] "); } }
        if (full) { str.append ("LvlDep[").append (getLvlDep ()).append ("] "); }
        if (full) { str.append ("LvlSrtBro[").append (getLvlSrtBro ()).append ("] "); }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRepResUid ())) { str.append ("RepResUid[").append (getRepResUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRepGrpUid ())) { str.append ("RepGrpUid[").append (getRepGrpUid ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getPrdPrcLst () != null) { str.append ("\n").append (indent).append ("PrdPrcLst (").append (getPrdPrcLst ().size ()).append ("):"); for (var model : getPrdPrcLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getItmLvlSugLst () != null) { str.append ("\n").append (indent).append ("ItmLvlSugLst (").append (getItmLvlSugLst ().size ()).append ("):"); for (var model : getItmLvlSugLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getOptLst () != null) { str.append ("\n").append (indent).append ("OptLst (").append (getOptLst ().size ()).append ("):"); for (var model : getOptLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLvlLst () != null) { str.append ("\n").append (indent).append ("LvlLst (").append (getLvlLst ().size ()).append ("):"); for (var model : getLvlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getResLst () != null) { str.append ("\n").append (indent).append ("ResLst (").append (getResLst ().size ()).append ("):"); for (var model : getResLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getManResLst () != null) { str.append ("\n").append (indent).append ("ManResLst (").append (getManResLst ().size ()).append ("):"); for (var model : getManResLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getManGrpLst () != null) { str.append ("\n").append (indent).append ("ManGrpLst (").append (getManGrpLst ().size ()).append ("):"); for (var model : getManGrpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getGenManResLst () != null) { str.append ("\n").append (indent).append ("GenManResLst (").append (getGenManResLst ().size ()).append ("):"); for (var model : getGenManResLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getGenResResLst () != null) { str.append ("\n").append (indent).append ("GenResResLst (").append (getGenResResLst ().size ()).append ("):"); for (var model : getGenResResLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getGrpLst () != null) { str.append ("\n").append (indent).append ("GrpLst (").append (getGrpLst ().size ()).append ("):"); for (var model : getGrpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getGenGrpLst () != null) { str.append ("\n").append (indent).append ("GenGrpLst (").append (getGenGrpLst ().size ()).append ("):"); for (var model : getGenGrpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getOrg () != null) { str.append ("\n").append (indent).append ("Org: \n").append (getOrg ().debug (full, true, indent + "    ")); }
        if (getLvlTyp () != null) { str.append ("\n").append (indent).append ("LvlTyp: \n").append (getLvlTyp ().debug (full, true, indent + "    ")); }
        if (getLvlRef () != null) { str.append ("\n").append (indent).append ("LvlRef: \n").append (getLvlRef ().debug (full, true, indent + "    ")); }
        if (getRepRes () != null) { str.append ("\n").append (indent).append ("RepRes: \n").append (getRepRes ().debug (full, true, indent + "    ")); }
        if (getRepGrp () != null) { str.append ("\n").append (indent).append ("RepGrp: \n").append (getRepGrp ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public OrgLvlImpl newEmptyInstance () { return (OrgLvlImpl) newInstance (); }
    
    @Override public OrgLvlImpl getCopy () {
        return (OrgLvlImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (OrgLvl _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return OrgLvlImpl.baseUrl (); }
    public static String baseUrl () { return OrgLvlImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { OrgLvlImpl.baseUrl = baseUrl; } 

    @Override public List<OrgLvlFields> getFields () { return Arrays.asList (OrgLvlFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // OrgLvlImpl
