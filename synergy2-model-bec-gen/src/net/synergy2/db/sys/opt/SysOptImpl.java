package net.synergy2.db.sys.opt;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysOptImpl extends SysOpt {

    protected SysOptImpl () { super (); }

    public enum SysOptFields implements ISField {
        Uid, OptCod, FlgVal, IntVal, DecVal, StrVal, TssVal, Tsi, Tsu, Rsi, Rsu;
    } // SysOptFields
    
    private static String baseUrl = "/rest/sys/opt/SysOpt";


    @Override public String getModelClassName () { return "SysOptImpl"; }




    
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
        str.append ("OptCod[").append (getOptCod ()).append ("] ");
        if (full) { if (Objects.nonNull (getFlgVal ())) { str.append ("FlgVal[").append (getFlgVal ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getIntVal ())) { str.append ("IntVal[").append (getIntVal ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDecVal ())) { str.append ("DecVal[").append (getDecVal ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStrVal ())) { str.append ("StrVal[").append (getStrVal ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTssVal ())) { str.append ("TssVal[").append (getTssVal ()).append ("] "); } }
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

        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysOptImpl newEmptyInstance () { return (SysOptImpl) newInstance (); }
    
    @Override public SysOptImpl getCopy () {
        return (SysOptImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysOpt _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysOptImpl.baseUrl (); }
    public static String baseUrl () { return SysOptImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysOptImpl.baseUrl = baseUrl; } 

    @Override public List<SysOptFields> getFields () { return Arrays.asList (SysOptFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysOptImpl
