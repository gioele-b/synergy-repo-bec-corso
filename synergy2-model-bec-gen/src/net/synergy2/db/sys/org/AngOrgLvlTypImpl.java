package net.synergy2.db.sys.org;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngOrgLvlTypImpl extends AngOrgLvlTyp {

    protected AngOrgLvlTypImpl () { super (); }

    public enum AngOrgLvlTypFields implements ISField {
        Uid, TypCod, TypDsc, TypIco, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // AngOrgLvlTypFields
    
    private static String baseUrl = "/rest/sys/org/AngOrgLvlTyp";


    @Override public String getModelClassName () { return "AngOrgLvlTypImpl"; }




    
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
        str.append ("TypCod[").append (getTypCod ()).append ("] ");
        str.append ("TypDsc[").append (getTypDsc ()).append ("] ");
        if (full) { str.append ("TypIco[").append (getTypIco ()).append ("] "); }
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
        if (getLvlLst () != null) { str.append ("\n").append (indent).append ("LvlLst (").append (getLvlLst ().size ()).append ("):"); for (var model : getLvlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngOrgLvlTypImpl newEmptyInstance () { return (AngOrgLvlTypImpl) newInstance (); }
    
    @Override public AngOrgLvlTypImpl getCopy () {
        return (AngOrgLvlTypImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngOrgLvlTyp _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngOrgLvlTypImpl.baseUrl (); }
    public static String baseUrl () { return AngOrgLvlTypImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngOrgLvlTypImpl.baseUrl = baseUrl; } 

    @Override public List<AngOrgLvlTypFields> getFields () { return Arrays.asList (AngOrgLvlTypFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngOrgLvlTypImpl
