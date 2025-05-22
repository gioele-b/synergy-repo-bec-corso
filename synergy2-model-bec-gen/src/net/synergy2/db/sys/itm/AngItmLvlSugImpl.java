package net.synergy2.db.sys.itm;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngItmLvlSugImpl extends AngItmLvlSug {

    protected AngItmLvlSugImpl () { super (); }

    public enum AngItmLvlSugFields implements ISField {
        Uid, ItmUid, OrgLvlUid, PrdCycUid, MdlUid, Srt, Tsi, Tsu, Rsi, Rsu;
    } // AngItmLvlSugFields
    
    private static String baseUrl = "/rest/sys/itm/AngItmLvlSug";


    @Override public String getModelClassName () { return "AngItmLvlSugImpl"; }




    
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
        str.append ("ItmUid[").append (getItmUid ()).append ("] ");
        if (Objects.nonNull (getOrgLvlUid ())) { str.append ("OrgLvlUid[").append (getOrgLvlUid ()).append ("] "); }
        if (Objects.nonNull (getPrdCycUid ())) { str.append ("PrdCycUid[").append (getPrdCycUid ()).append ("] "); }
        if (Objects.nonNull (getMdlUid ())) { str.append ("MdlUid[").append (getMdlUid ()).append ("] "); }
        if (full) { str.append ("Srt[").append (getSrt ()).append ("] "); }
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
        if (getItm () != null) { str.append ("\n").append (indent).append ("Itm: \n").append (getItm ().debug (full, true, indent + "    ")); }
        if (getMdl () != null) { str.append ("\n").append (indent).append ("Mdl: \n").append (getMdl ().debug (full, true, indent + "    ")); }
        if (getPrdCyc () != null) { str.append ("\n").append (indent).append ("PrdCyc: \n").append (getPrdCyc ().debug (full, true, indent + "    ")); }
        if (getOrgLvl () != null) { str.append ("\n").append (indent).append ("OrgLvl: \n").append (getOrgLvl ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngItmLvlSugImpl newEmptyInstance () { return (AngItmLvlSugImpl) newInstance (); }
    
    @Override public AngItmLvlSugImpl getCopy () {
        return (AngItmLvlSugImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngItmLvlSug _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngItmLvlSugImpl.baseUrl (); }
    public static String baseUrl () { return AngItmLvlSugImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngItmLvlSugImpl.baseUrl = baseUrl; } 

    @Override public List<AngItmLvlSugFields> getFields () { return Arrays.asList (AngItmLvlSugFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngItmLvlSugImpl
