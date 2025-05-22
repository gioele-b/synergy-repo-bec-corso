package net.synergy2.db.sys.org;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class OrgLvlManGrpImpl extends OrgLvlManGrp {

    protected OrgLvlManGrpImpl () { super (); }

    public enum OrgLvlManGrpFields implements ISField {
        Uid, LvlUid, GrpUid, RolUid, Tsi, Tsu, Rsi, Rsu;
    } // OrgLvlManGrpFields
    
    private static String baseUrl = "/rest/sys/org/OrgLvlManGrp";


    @Override public String getModelClassName () { return "OrgLvlManGrpImpl"; }




    
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
        str.append ("LvlUid[").append (getLvlUid ()).append ("] ");
        str.append ("GrpUid[").append (getGrpUid ()).append ("] ");
        if (full) { if (Objects.nonNull (getRolUid ())) { str.append ("RolUid[").append (getRolUid ()).append ("] "); } }
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
        if (getLvl () != null) { str.append ("\n").append (indent).append ("Lvl: \n").append (getLvl ().debug (full, true, indent + "    ")); }
        if (getGrp () != null) { str.append ("\n").append (indent).append ("Grp: \n").append (getGrp ().debug (full, true, indent + "    ")); }
        if (getRol () != null) { str.append ("\n").append (indent).append ("Rol: \n").append (getRol ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public OrgLvlManGrpImpl newEmptyInstance () { return (OrgLvlManGrpImpl) newInstance (); }
    
    @Override public OrgLvlManGrpImpl getCopy () {
        return (OrgLvlManGrpImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (OrgLvlManGrp _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return OrgLvlManGrpImpl.baseUrl (); }
    public static String baseUrl () { return OrgLvlManGrpImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { OrgLvlManGrpImpl.baseUrl = baseUrl; } 

    @Override public List<OrgLvlManGrpFields> getFields () { return Arrays.asList (OrgLvlManGrpFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // OrgLvlManGrpImpl
