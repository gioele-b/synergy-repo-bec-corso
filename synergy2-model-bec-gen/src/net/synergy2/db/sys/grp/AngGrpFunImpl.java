package net.synergy2.db.sys.grp;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngGrpFunImpl extends AngGrpFun {

    protected AngGrpFunImpl () { super (); }

    public enum AngGrpFunFields implements ISField {
        Uid, GrpUid, FunSrt, GrpFunUid, FunTyp, Tsi, Tsu, Rsi, Rsu;
    } // AngGrpFunFields
    
    private static String baseUrl = "/rest/sys/grp/AngGrpFun";


    @Override public String getModelClassName () { return "AngGrpFunImpl"; }




    
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
        str.append ("FunSrt[").append (getFunSrt ()).append ("] ");
        if (full) { str.append ("GrpFunUid[").append (getGrpFunUid ()).append ("] "); }
        if (full) { str.append ("FunTyp[").append (getFunTyp ()).append ("] "); }
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
        if (getGrpMbr () != null) { str.append ("\n").append (indent).append ("GrpMbr: \n").append (getGrpMbr ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngGrpFunImpl newEmptyInstance () { return (AngGrpFunImpl) newInstance (); }
    
    @Override public AngGrpFunImpl getCopy () {
        return (AngGrpFunImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngGrpFun _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngGrpFunImpl.baseUrl (); }
    public static String baseUrl () { return AngGrpFunImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngGrpFunImpl.baseUrl = baseUrl; } 

    @Override public List<AngGrpFunFields> getFields () { return Arrays.asList (AngGrpFunFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngGrpFunImpl
