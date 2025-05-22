package net.synergy2.db.sys.org;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class OrgImpl extends Org {

    protected OrgImpl () { super (); }

    public enum OrgFields implements ISField {
        Uid, OrgCod, EtyUid, OrgDsc, LogDel, OrgTypUid, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // OrgFields
    
    private static String baseUrl = "/rest/sys/org/Org";


    @Override public String getModelClassName () { return "OrgImpl"; }




    
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
        str.append ("OrgCod[").append (getOrgCod ()).append ("] ");
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
        str.append ("OrgDsc[").append (getOrgDsc ()).append ("] ");
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getOrgTypUid ())) { str.append ("OrgTypUid[").append (getOrgTypUid ()).append ("] "); } }
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
        if (getLvlLst () != null) { str.append ("\n").append (indent).append ("LvlLst (").append (getLvlLst ().size ()).append ("):"); for (var model : getLvlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getTyp () != null) { str.append ("\n").append (indent).append ("Typ: \n").append (getTyp ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public OrgImpl newEmptyInstance () { return (OrgImpl) newInstance (); }
    
    @Override public OrgImpl getCopy () {
        return (OrgImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (Org _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return OrgImpl.baseUrl (); }
    public static String baseUrl () { return OrgImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { OrgImpl.baseUrl = baseUrl; } 

    @Override public List<OrgFields> getFields () { return Arrays.asList (OrgFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // OrgImpl
