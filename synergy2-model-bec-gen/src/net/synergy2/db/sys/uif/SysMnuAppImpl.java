package net.synergy2.db.sys.uif;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysMnuAppImpl extends SysMnuApp {

    protected SysMnuAppImpl () { super (); }

    public enum SysMnuAppFields implements ISField {
        Uid, MnuUid, AppUid, SrtOrd, Tsi, Tsu, Rsi, Rsu;
    } // SysMnuAppFields
    
    private static String baseUrl = "/rest/sys/uif/SysMnuApp";


    @Override public String getModelClassName () { return "SysMnuAppImpl"; }




    
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
        str.append ("MnuUid[").append (getMnuUid ()).append ("] ");
        str.append ("AppUid[").append (getAppUid ()).append ("] ");
        if (full) { str.append ("SrtOrd[").append (getSrtOrd ()).append ("] "); }
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
        if (getApp () != null) { str.append ("\n").append (indent).append ("App: \n").append (getApp ().debug (full, true, indent + "    ")); }
        if (getMnu () != null) { str.append ("\n").append (indent).append ("Mnu: \n").append (getMnu ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysMnuAppImpl newEmptyInstance () { return (SysMnuAppImpl) newInstance (); }
    
    @Override public SysMnuAppImpl getCopy () {
        return (SysMnuAppImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysMnuApp _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysMnuAppImpl.baseUrl (); }
    public static String baseUrl () { return SysMnuAppImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysMnuAppImpl.baseUrl = baseUrl; } 

    @Override public List<SysMnuAppFields> getFields () { return Arrays.asList (SysMnuAppFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysMnuAppImpl
