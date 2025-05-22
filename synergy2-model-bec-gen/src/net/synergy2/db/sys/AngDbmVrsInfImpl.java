package net.synergy2.db.sys;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngDbmVrsInfImpl extends AngDbmVrsInf {

    protected AngDbmVrsInfImpl () { super (); }

    public enum AngDbmVrsInfFields implements ISField {
        Uid, VrsMaj, VrsMin, VrsRel, VrsNam, VrsIco, VrsClr, StpPlg, Tsi, Tsu, Rsi, Rsu;
    } // AngDbmVrsInfFields
    
    private static String baseUrl = "/rest/sys/AngDbmVrsInf";


    @Override public String getModelClassName () { return "AngDbmVrsInfImpl"; }




    
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
        str.append ("VrsMaj[").append (getVrsMaj ()).append ("] ");
        str.append ("VrsMin[").append (getVrsMin ()).append ("] ");
        str.append ("VrsRel[").append (getVrsRel ()).append ("] ");
        str.append ("VrsNam[").append (getVrsNam ()).append ("] ");
        if (full) { str.append ("VrsIco[").append (getVrsIco ()).append ("] "); }
        if (full) { str.append ("VrsClr[").append (getVrsClr ()).append ("] "); }
        if (full) { str.append ("StpPlg[").append (getStpPlg ()).append ("] "); }
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

    @Override public AngDbmVrsInfImpl newEmptyInstance () { return (AngDbmVrsInfImpl) newInstance (); }
    
    @Override public AngDbmVrsInfImpl getCopy () {
        return (AngDbmVrsInfImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngDbmVrsInf _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngDbmVrsInfImpl.baseUrl (); }
    public static String baseUrl () { return AngDbmVrsInfImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngDbmVrsInfImpl.baseUrl = baseUrl; } 

    @Override public List<AngDbmVrsInfFields> getFields () { return Arrays.asList (AngDbmVrsInfFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngDbmVrsInfImpl
