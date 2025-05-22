package net.synergy2.db.sys.org;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class GenOrgLvlManImpl extends GenOrgLvlMan {

    protected GenOrgLvlManImpl () { super (); }

    public enum GenOrgLvlManFields implements ISField {
        Uid, ManUid, LvlUid, FlgFav, AutVieDec, AutInsDec, Tsi, Tsu, Rsi, Rsu, ManDir;
    } // GenOrgLvlManFields
    
    private static String baseUrl = "/rest/sys/org/GenOrgLvlMan";


    @Override public String getModelClassName () { return "GenOrgLvlManImpl"; }




    
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
        str.append ("ManUid[").append (getManUid ()).append ("] ");
        str.append ("LvlUid[").append (getLvlUid ()).append ("] ");
        if (full) { str.append ("FlgFav[").append (getFlgFav ()).append ("] "); }
        if (full) { str.append ("AutVieDec[").append (getAutVieDec ()).append ("] "); }
        if (full) { str.append ("AutInsDec[").append (getAutInsDec ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getManDir ())) { str.append ("ManDir[").append (getManDir ()).append ("] "); } }
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
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public GenOrgLvlManImpl newEmptyInstance () { return (GenOrgLvlManImpl) newInstance (); }
    
    @Override public GenOrgLvlManImpl getCopy () {
        return (GenOrgLvlManImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (GenOrgLvlMan _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return GenOrgLvlManImpl.baseUrl (); }
    public static String baseUrl () { return GenOrgLvlManImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { GenOrgLvlManImpl.baseUrl = baseUrl; } 

    @Override public List<GenOrgLvlManFields> getFields () { return Arrays.asList (GenOrgLvlManFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // GenOrgLvlManImpl
