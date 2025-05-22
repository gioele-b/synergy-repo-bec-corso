package net.synergy2.db.sys.grp;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngResGrpImpl extends AngResGrp {

    protected AngResGrpImpl () { super (); }

    public enum AngResGrpFields implements ISField {
        Uid, GrpUid, ResUid, Sl1, Sl2, Sl3, Sl4, Sl5, Tsi, Tsu, Rsi, Rsu;
    } // AngResGrpFields
    
    private static String baseUrl = "/rest/sys/grp/AngResGrp";


    @Override public String getModelClassName () { return "AngResGrpImpl"; }




    
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
        str.append ("ResUid[").append (getResUid ()).append ("] ");
        if (full) { str.append ("Sl1[").append (getSl1 ()).append ("] "); }
        if (full) { str.append ("Sl2[").append (getSl2 ()).append ("] "); }
        if (full) { str.append ("Sl3[").append (getSl3 ()).append ("] "); }
        if (full) { str.append ("Sl4[").append (getSl4 ()).append ("] "); }
        if (full) { str.append ("Sl5[").append (getSl5 ()).append ("] "); }
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
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngResGrpImpl newEmptyInstance () { return (AngResGrpImpl) newInstance (); }
    
    @Override public AngResGrpImpl getCopy () {
        return (AngResGrpImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngResGrp _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngResGrpImpl.baseUrl (); }
    public static String baseUrl () { return AngResGrpImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngResGrpImpl.baseUrl = baseUrl; } 

    @Override public List<AngResGrpFields> getFields () { return Arrays.asList (AngResGrpFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngResGrpImpl
