package net.synergy2.db.sys.bas;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class AngSupImpl extends AngSup {

    protected AngSupImpl () { super (); }

    public enum AngSupFields implements ISField {
        Uid, SupCod, SupDsc, SupIco, EtyUid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, EmlAdd, LngDefUid;
    } // AngSupFields
    
    private static String baseUrl = "/rest/sys/bas/AngSup";


    @Override public String getModelClassName () { return "AngSupImpl"; }




    
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
        str.append ("SupCod[").append (getSupCod ()).append ("] ");
        if (Objects.nonNull (getSupDsc ())) { str.append ("SupDsc[").append (getSupDsc ()).append ("] "); }
        if (full) { str.append ("SupIco[").append (getSupIco ()).append ("] "); }
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEmlAdd ())) { str.append ("EmlAdd[").append (getEmlAdd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLngDefUid ())) { str.append ("LngDefUid[").append (getLngDefUid ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getSupItmLst () != null) { str.append ("\n").append (indent).append ("SupItmLst (").append (getSupItmLst ().size ()).append ("):"); for (var model : getSupItmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSupPrdLst () != null) { str.append ("\n").append (indent).append ("SupPrdLst (").append (getSupPrdLst ().size ()).append ("):"); for (var model : getSupPrdLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSupLng () != null) { str.append ("\n").append (indent).append ("SupLng: \n").append (getSupLng ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngSupImpl newEmptyInstance () { return (AngSupImpl) newInstance (); }
    
    @Override public AngSupImpl getCopy () {
        return (AngSupImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngSup _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngSupImpl.baseUrl (); }
    public static String baseUrl () { return AngSupImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngSupImpl.baseUrl = baseUrl; } 

    @Override public List<AngSupFields> getFields () { return Arrays.asList (AngSupFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngSupImpl
