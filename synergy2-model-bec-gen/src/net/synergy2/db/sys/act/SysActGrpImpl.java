package net.synergy2.db.sys.act;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysActGrpImpl extends SysActGrp {

    protected SysActGrpImpl () { super (); }

    public enum SysActGrpFields implements ISField {
        Uid, ActGrpCod, ActGrpDsc, Tsi, Tsu, Rsi, Rsu;
    } // SysActGrpFields
    
    private static String baseUrl = "/rest/sys/act/SysActGrp";


    @Override public String getModelClassName () { return "SysActGrpImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public SysActGrpImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("ActGrpCod[").append (getActGrpCod ()).append ("] ");
        str.append ("ActGrpDsc[").append (getActGrpDsc ()).append ("] ");
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
        if (getGrpDetLst () != null) { str.append ("\n").append (indent).append ("GrpDetLst (").append (getGrpDetLst ().size ()).append ("):"); for (var model : getGrpDetLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWksBtnActLst () != null) { str.append ("\n").append (indent).append ("WksBtnActLst (").append (getWksBtnActLst ().size ()).append ("):"); for (var model : getWksBtnActLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysActGrpImpl newEmptyInstance () { return (SysActGrpImpl) newInstance (); }
    
    @Override public SysActGrpImpl getCopy () {
        var toReturn = (SysActGrpImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (SysActGrp _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysActGrpImpl.baseUrl (); }
    public static String baseUrl () { return SysActGrpImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysActGrpImpl.baseUrl = baseUrl; } 

    @Override public List<SysActGrpFields> getFields () { return Arrays.asList (SysActGrpFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysActGrpImpl
