package net.synergy2.db.sys.geo;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysCmpBnkImpl extends SysCmpBnk {

    protected SysCmpBnkImpl () { super (); }

    public enum SysCmpBnkFields implements ISField {
        Uid, BnkUid, Ibn, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, BnkDsc, BnkNot, FrnBnkDet;
    } // SysCmpBnkFields
    
    private static String baseUrl = "/rest/sys/geo/SysCmpBnk";


    @Override public String getModelClassName () { return "SysCmpBnkImpl"; }




    
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
        str.append ("BnkUid[").append (getBnkUid ()).append ("] ");
        if (Objects.nonNull (getIbn ())) { str.append ("Ibn[").append (getIbn ()).append ("] "); }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (Objects.nonNull (getBnkDsc ())) { str.append ("BnkDsc[").append (getBnkDsc ()).append ("] "); }
        if (full) { if (Objects.nonNull (getBnkNot ())) { str.append ("BnkNot[").append (getBnkNot ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFrnBnkDet ())) { str.append ("FrnBnkDet[").append (getFrnBnkDet ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getBnk () != null) { str.append ("\n").append (indent).append ("Bnk: \n").append (getBnk ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysCmpBnkImpl newEmptyInstance () { return (SysCmpBnkImpl) newInstance (); }
    
    @Override public SysCmpBnkImpl getCopy () {
        return (SysCmpBnkImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysCmpBnk _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return SysCmpBnkImpl.baseUrl (); }
    public static String baseUrl () { return SysCmpBnkImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysCmpBnkImpl.baseUrl = baseUrl; } 

    @Override public List<SysCmpBnkFields> getFields () { return Arrays.asList (SysCmpBnkFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysCmpBnkImpl
