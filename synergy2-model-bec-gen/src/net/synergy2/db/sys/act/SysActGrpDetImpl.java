package net.synergy2.db.sys.act;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysActGrpDetImpl extends SysActGrpDet {

    protected SysActGrpDetImpl () { super (); }

    public enum SysActGrpDetFields implements ISField {
        Uid, GrpUid, ActUid, ActSrt, Tsi, Tsu, Rsi, Rsu;
    } // SysActGrpDetFields
    
    private static String baseUrl = "/rest/sys/act/SysActGrpDet";


    @Override public String getModelClassName () { return "SysActGrpDetImpl"; }




    
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
        str.append ("GrpUid[").append (getGrpUid ()).append ("] ");
        if (full) { str.append ("ActUid[").append (getActUid ()).append ("] "); }
        str.append ("ActSrt[").append (getActSrt ()).append ("] ");
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
        if (getGrp () != null) { str.append ("\n").append (indent).append ("Grp: \n").append (getGrp ().debug (full, true, indent + "    ")); }
        if (getAct () != null) { str.append ("\n").append (indent).append ("Act: \n").append (getAct ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysActGrpDetImpl newEmptyInstance () { return (SysActGrpDetImpl) newInstance (); }
    
    @Override public SysActGrpDetImpl getCopy () {
        return (SysActGrpDetImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysActGrpDet _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysActGrpDetImpl.baseUrl (); }
    public static String baseUrl () { return SysActGrpDetImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysActGrpDetImpl.baseUrl = baseUrl; } 

    @Override public List<SysActGrpDetFields> getFields () { return Arrays.asList (SysActGrpDetFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysActGrpDetImpl
