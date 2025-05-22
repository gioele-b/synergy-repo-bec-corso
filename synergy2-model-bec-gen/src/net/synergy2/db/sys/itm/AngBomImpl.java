package net.synergy2.db.sys.itm;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class AngBomImpl extends AngBom {

    protected AngBomImpl () { super (); }

    public enum AngBomFields implements ISField {
        Uid, ItmUid, IgnMis, BomQty, FixQty, Tsi, Tsu, Rsi, Rsu, EtyUid, LogDel, Tsd, Rsd, PrdItmUid, ItmVrnUid, Mtc;
    } // AngBomFields
    
    private static String baseUrl = "/rest/sys/itm/AngBom";


    @Override public String getModelClassName () { return "AngBomImpl"; }




    
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
        if (full) { str.append ("IgnMis[").append (getIgnMis ()).append ("] "); }
        if (full) { str.append ("BomQty[").append (getBomQty ()).append ("] "); }
        if (full) { str.append ("FixQty[").append (getFixQty ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        str.append ("PrdItmUid[").append (getPrdItmUid ()).append ("] ");
        if (Objects.nonNull (getItmVrnUid ())) { str.append ("ItmVrnUid[").append (getItmVrnUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getMtc ())) { str.append ("Mtc[").append (getMtc ()).append ("] "); } }
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
        if (getPrdItm () != null) { str.append ("\n").append (indent).append ("PrdItm: \n").append (getPrdItm ().debug (full, true, indent + "    ")); }
        if (getItmVrn () != null) { str.append ("\n").append (indent).append ("ItmVrn: \n").append (getItmVrn ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngBomImpl newEmptyInstance () { return (AngBomImpl) newInstance (); }
    
    @Override public AngBomImpl getCopy () {
        return (AngBomImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngBom _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngBomImpl.baseUrl (); }
    public static String baseUrl () { return AngBomImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngBomImpl.baseUrl = baseUrl; } 

    @Override public List<AngBomFields> getFields () { return Arrays.asList (AngBomFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngBomImpl
