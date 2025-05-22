package net.synergy2.db.sys.app;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysFrmPrmImpl extends SysFrmPrm {

    protected SysFrmPrmImpl () { super (); }

    public enum SysFrmPrmFields implements ISField {
        Uid, FrmUid, PrmUid, Tsi, Tsu, Rsi, Rsu;
    } // SysFrmPrmFields
    
    private static String baseUrl = "/rest/sys/app/SysFrmPrm";


    @Override public String getModelClassName () { return "SysFrmPrmImpl"; }




    
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
        str.append ("FrmUid[").append (getFrmUid ()).append ("] ");
        str.append ("PrmUid[").append (getPrmUid ()).append ("] ");
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
        if (getFrm () != null) { str.append ("\n").append (indent).append ("Frm: \n").append (getFrm ().debug (full, true, indent + "    ")); }
        if (getPrm () != null) { str.append ("\n").append (indent).append ("Prm: \n").append (getPrm ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysFrmPrmImpl newEmptyInstance () { return (SysFrmPrmImpl) newInstance (); }
    
    @Override public SysFrmPrmImpl getCopy () {
        return (SysFrmPrmImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysFrmPrm _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysFrmPrmImpl.baseUrl (); }
    public static String baseUrl () { return SysFrmPrmImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysFrmPrmImpl.baseUrl = baseUrl; } 

    @Override public List<SysFrmPrmFields> getFields () { return Arrays.asList (SysFrmPrmFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysFrmPrmImpl
