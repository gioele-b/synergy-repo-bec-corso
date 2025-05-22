package net.synergy2.db.sys.itm;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngUniMeaImpl extends AngUniMea {

    protected AngUniMeaImpl () { super (); }

    public enum AngUniMeaFields implements ISField {
        Uid, UniMeaCod, UniMeaDsc, Tsi, Tsu, Rsi, Rsu, SymSiu, UniMeaAcc, UniMeaLngDsc, CatUid;
    } // AngUniMeaFields
    
    private static String baseUrl = "/rest/sys/itm/AngUniMea";


    @Override public String getModelClassName () { return "AngUniMeaImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngUniMeaImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("UniMeaCod[").append (getUniMeaCod ()).append ("] ");
        str.append ("UniMeaDsc[").append (getUniMeaDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getSymSiu ())) { str.append ("SymSiu[").append (getSymSiu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getUniMeaAcc ())) { str.append ("UniMeaAcc[").append (getUniMeaAcc ()).append ("] "); } }
        if (full) { str.append ("UniMeaLngDsc[").append (getUniMeaLngDsc ()).append ("] "); }
        if (full) { if (Objects.nonNull (getCatUid ())) { str.append ("CatUid[").append (getCatUid ()).append ("] "); } }
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
        if (getItmAltLst () != null) { str.append ("\n").append (indent).append ("ItmAltLst (").append (getItmAltLst ().size ()).append ("):"); for (var model : getItmAltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getItmLst () != null) { str.append ("\n").append (indent).append ("ItmLst (").append (getItmLst ().size ()).append ("):"); for (var model : getItmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getExtPhsUniMeaLst () != null) { str.append ("\n").append (indent).append ("ExtPhsUniMeaLst (").append (getExtPhsUniMeaLst ().size ()).append ("):"); for (var model : getExtPhsUniMeaLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getItmDimLst () != null) { str.append ("\n").append (indent).append ("ItmDimLst (").append (getItmDimLst ().size ()).append ("):"); for (var model : getItmDimLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDefCatLst () != null) { str.append ("\n").append (indent).append ("DefCatLst (").append (getDefCatLst ().size ()).append ("):"); for (var model : getDefCatLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCat () != null) { str.append ("\n").append (indent).append ("Cat: \n").append (getCat ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngUniMeaImpl newEmptyInstance () { return (AngUniMeaImpl) newInstance (); }
    
    @Override public AngUniMeaImpl getCopy () {
        var toReturn = (AngUniMeaImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngUniMea _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngUniMeaImpl.baseUrl (); }
    public static String baseUrl () { return AngUniMeaImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngUniMeaImpl.baseUrl = baseUrl; } 

    @Override public List<AngUniMeaFields> getFields () { return Arrays.asList (AngUniMeaFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngUniMeaImpl
