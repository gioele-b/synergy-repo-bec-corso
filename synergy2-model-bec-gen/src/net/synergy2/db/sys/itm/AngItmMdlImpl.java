package net.synergy2.db.sys.itm;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class AngItmMdlImpl extends AngItmMdl {

    protected AngItmMdlImpl () { super (); }

    public enum AngItmMdlFields implements ISField {
        Uid, ItmUid, MdlCod, MdlDsc, MdlStd, EtyUid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // AngItmMdlFields
    
    private static String baseUrl = "/rest/sys/itm/AngItmMdl";


    @Override public String getModelClassName () { return "AngItmMdlImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngItmMdlImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("ItmUid[").append (getItmUid ()).append ("] ");
        str.append ("MdlCod[").append (getMdlCod ()).append ("] ");
        str.append ("MdlDsc[").append (getMdlDsc ()).append ("] ");
        if (full) { str.append ("MdlStd[").append (getMdlStd ()).append ("] "); }
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
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
        if (getItmMdlVrnLst () != null) { str.append ("\n").append (indent).append ("ItmMdlVrnLst (").append (getItmMdlVrnLst ().size ()).append ("):"); for (var model : getItmMdlVrnLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getItmLvlSugLst () != null) { str.append ("\n").append (indent).append ("ItmLvlSugLst (").append (getItmLvlSugLst ().size ()).append ("):"); for (var model : getItmLvlSugLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getItm () != null) { str.append ("\n").append (indent).append ("Itm: \n").append (getItm ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngItmMdlImpl newEmptyInstance () { return (AngItmMdlImpl) newInstance (); }
    
    @Override public AngItmMdlImpl getCopy () {
        var toReturn = (AngItmMdlImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngItmMdl _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngItmMdlImpl.baseUrl (); }
    public static String baseUrl () { return AngItmMdlImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngItmMdlImpl.baseUrl = baseUrl; } 

    @Override public List<AngItmMdlFields> getFields () { return Arrays.asList (AngItmMdlFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngItmMdlImpl
