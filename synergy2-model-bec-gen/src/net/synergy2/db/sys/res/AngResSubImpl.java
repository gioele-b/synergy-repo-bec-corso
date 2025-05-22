package net.synergy2.db.sys.res;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngResSubImpl extends AngResSub {

    protected AngResSubImpl () { super (); }

    public enum AngResSubFields implements ISField {
        Uid, ResUid, ResSubUid, TssStr, TssEnd, EnbSub, Tsi, Tsu, Rsi, Rsu;
    } // AngResSubFields
    
    private static String baseUrl = "/rest/sys/res/AngResSub";


    @Override public String getModelClassName () { return "AngResSubImpl"; }




    
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
        if (full) { str.append ("ResUid[").append (getResUid ()).append ("] "); }
        if (full) { str.append ("ResSubUid[").append (getResSubUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTssStr ())) { str.append ("TssStr[").append (getTssStr ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTssEnd ())) { str.append ("TssEnd[").append (getTssEnd ()).append ("] "); } }
        if (full) { str.append ("EnbSub[").append (getEnbSub ()).append ("] "); }
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
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        if (getSub () != null) { str.append ("\n").append (indent).append ("Sub: \n").append (getSub ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngResSubImpl newEmptyInstance () { return (AngResSubImpl) newInstance (); }
    
    @Override public AngResSubImpl getCopy () {
        return (AngResSubImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngResSub _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngResSubImpl.baseUrl (); }
    public static String baseUrl () { return AngResSubImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngResSubImpl.baseUrl = baseUrl; } 

    @Override public List<AngResSubFields> getFields () { return Arrays.asList (AngResSubFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngResSubImpl
