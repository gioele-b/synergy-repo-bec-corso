package net.synergy2.db.sys.wzd;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DefWzdStpPrmImpl extends DefWzdStpPrm {

    protected DefWzdStpPrmImpl () { super (); }

    public enum DefWzdStpPrmFields implements ISField {
        StpUid, PrmNam, PrmVal, Tsi, Tsu, Rsi, Rsu;
    } // DefWzdStpPrmFields
    
    private static String baseUrl = "/rest/sys/wzd/DefWzdStpPrm";


    @Override public String getModelClassName () { return "DefWzdStpPrmImpl"; }




    
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
        str.append ("StpUid[").append (getStpUid ()).append ("] ");
        str.append ("PrmNam[").append (getPrmNam ()).append ("] ");
        if (full) { if (Objects.nonNull (getPrmVal ())) { str.append ("PrmVal[").append (getPrmVal ()).append ("] "); } }
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
        if (getTsk () != null) { str.append ("\n").append (indent).append ("Tsk: \n").append (getTsk ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getStpUid () + "#" + getPrmNam ().replace ("*", "**").replace ("#", "*#"); }

    @Override public DefWzdStpPrmImpl newEmptyInstance () { return (DefWzdStpPrmImpl) newInstance (); }
    
    @Override public DefWzdStpPrmImpl getCopy () {
        return (DefWzdStpPrmImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (DefWzdStpPrm _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DefWzdStpPrmImpl.baseUrl (); }
    public static String baseUrl () { return DefWzdStpPrmImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DefWzdStpPrmImpl.baseUrl = baseUrl; } 

    @Override public List<DefWzdStpPrmFields> getFields () { return Arrays.asList (DefWzdStpPrmFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DefWzdStpPrmImpl
