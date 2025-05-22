package net.synergy2.db.sys.itm;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngUniMeaCatImpl extends AngUniMeaCat {

    protected AngUniMeaCatImpl () { super (); }

    public enum AngUniMeaCatFields implements ISField {
        Uid, CatCod, CatDsc, DefUniMeaUid, Tsi, Tsu, Rsi, Rsu;
    } // AngUniMeaCatFields
    
    private static String baseUrl = "/rest/sys/itm/AngUniMeaCat";


    @Override public String getModelClassName () { return "AngUniMeaCatImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngUniMeaCatImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("CatCod[").append (getCatCod ()).append ("] ");
        str.append ("CatDsc[").append (getCatDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getDefUniMeaUid ())) { str.append ("DefUniMeaUid[").append (getDefUniMeaUid ()).append ("] "); } }
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
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUniMeaLst () != null) { str.append ("\n").append (indent).append ("UniMeaLst (").append (getUniMeaLst ().size ()).append ("):"); for (var model : getUniMeaLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getUniMea () != null) { str.append ("\n").append (indent).append ("UniMea: \n").append (getUniMea ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngUniMeaCatImpl newEmptyInstance () { return (AngUniMeaCatImpl) newInstance (); }
    
    @Override public AngUniMeaCatImpl getCopy () {
        var toReturn = (AngUniMeaCatImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngUniMeaCat _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngUniMeaCatImpl.baseUrl (); }
    public static String baseUrl () { return AngUniMeaCatImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngUniMeaCatImpl.baseUrl = baseUrl; } 

    @Override public List<AngUniMeaCatFields> getFields () { return Arrays.asList (AngUniMeaCatFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngUniMeaCatImpl
