package net.synergy2.db.sys.itm;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class ItmSerNumImpl extends ItmSerNum {

    protected ItmSerNumImpl () { super (); }

    public enum ItmSerNumFields implements ISField {
        Uid, SerNum, ItmUid, SerNumDsc, DatPrd, EtyUid, Tsi, Tsu, Rsi, Rsu;
    } // ItmSerNumFields
    
    private static String baseUrl = "/rest/sys/itm/ItmSerNum";


    @Override public String getModelClassName () { return "ItmSerNumImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public ItmSerNumImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("SerNum[").append (getSerNum ()).append ("] ");
        if (full) { str.append ("ItmUid[").append (getItmUid ()).append ("] "); }
        str.append ("SerNumDsc[").append (getSerNumDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getDatPrd ())) { str.append ("DatPrd[").append (getDatPrd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
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
        if (getItm () != null) { str.append ("\n").append (indent).append ("Itm: \n").append (getItm ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public ItmSerNumImpl newEmptyInstance () { return (ItmSerNumImpl) newInstance (); }
    
    @Override public ItmSerNumImpl getCopy () {
        var toReturn = (ItmSerNumImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (ItmSerNum _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return ItmSerNumImpl.baseUrl (); }
    public static String baseUrl () { return ItmSerNumImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { ItmSerNumImpl.baseUrl = baseUrl; } 

    @Override public List<ItmSerNumFields> getFields () { return Arrays.asList (ItmSerNumFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // ItmSerNumImpl
