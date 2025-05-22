package net.synergy2.db.sys.wzd;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DefWzdRevPrmImpl extends DefWzdRevPrm {

    protected DefWzdRevPrmImpl () { super (); }

    public enum DefWzdRevPrmFields implements ISField {
        RevUid, PrmNam, PrmVal, Tsi, Tsu, Rsi, Rsu;
    } // DefWzdRevPrmFields
    
    private static String baseUrl = "/rest/sys/wzd/DefWzdRevPrm";


    @Override public String getModelClassName () { return "DefWzdRevPrmImpl"; }




    
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
        str.append ("RevUid[").append (getRevUid ()).append ("] ");
        str.append ("PrmNam[").append (getPrmNam ()).append ("] ");
        if (full) { str.append ("PrmVal[").append (getPrmVal ()).append ("] "); }
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
        if (getRev () != null) { str.append ("\n").append (indent).append ("Rev: \n").append (getRev ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getRevUid () + "#" + getPrmNam ().replace ("*", "**").replace ("#", "*#"); }

    @Override public DefWzdRevPrmImpl newEmptyInstance () { return (DefWzdRevPrmImpl) newInstance (); }
    
    @Override public DefWzdRevPrmImpl getCopy () {
        return (DefWzdRevPrmImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (DefWzdRevPrm _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DefWzdRevPrmImpl.baseUrl (); }
    public static String baseUrl () { return DefWzdRevPrmImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DefWzdRevPrmImpl.baseUrl = baseUrl; } 

    @Override public List<DefWzdRevPrmFields> getFields () { return Arrays.asList (DefWzdRevPrmFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DefWzdRevPrmImpl
