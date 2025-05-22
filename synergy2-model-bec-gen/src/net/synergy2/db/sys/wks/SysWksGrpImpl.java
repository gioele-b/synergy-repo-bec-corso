package net.synergy2.db.sys.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysWksGrpImpl extends SysWksGrp {

    protected SysWksGrpImpl () { super (); }

    public enum SysWksGrpFields implements ISField {
        Uid, WksUid, GrpUid, Edt, Tsi, Tsu, Rsi, Rsu;
    } // SysWksGrpFields
    
    private static String baseUrl = "/rest/sys/wks/SysWksGrp";


    @Override public String getModelClassName () { return "SysWksGrpImpl"; }




    
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
        str.append ("WksUid[").append (getWksUid ()).append ("] ");
        str.append ("GrpUid[").append (getGrpUid ()).append ("] ");
        if (full) { str.append ("Edt[").append (getEdt ()).append ("] "); }
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
        if (getWks () != null) { str.append ("\n").append (indent).append ("Wks: \n").append (getWks ().debug (full, true, indent + "    ")); }
        if (getAngGrp () != null) { str.append ("\n").append (indent).append ("AngGrp: \n").append (getAngGrp ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysWksGrpImpl newEmptyInstance () { return (SysWksGrpImpl) newInstance (); }
    
    @Override public SysWksGrpImpl getCopy () {
        return (SysWksGrpImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysWksGrp _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysWksGrpImpl.baseUrl (); }
    public static String baseUrl () { return SysWksGrpImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysWksGrpImpl.baseUrl = baseUrl; } 

    @Override public List<SysWksGrpFields> getFields () { return Arrays.asList (SysWksGrpFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysWksGrpImpl
