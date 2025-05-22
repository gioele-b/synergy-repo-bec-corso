package net.synergy2.db.sys;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngMdlDepImpl extends AngMdlDep {

    protected AngMdlDepImpl () { super (); }

    public enum AngMdlDepFields implements ISField {
        MdlUid, MdlDepUid, Tsi, Tsu, Rsi, Rsu;
    } // AngMdlDepFields
    
    private static String baseUrl = "/rest/sys/AngMdlDep";


    @Override public String getModelClassName () { return "AngMdlDepImpl"; }




    
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
        str.append ("MdlUid[").append (getMdlUid ()).append ("] ");
        str.append ("MdlDepUid[").append (getMdlDepUid ()).append ("] ");
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
        if (getPrtMdl () != null) { str.append ("\n").append (indent).append ("PrtMdl: \n").append (getPrtMdl ().debug (full, true, indent + "    ")); }
        if (getChdMdl () != null) { str.append ("\n").append (indent).append ("ChdMdl: \n").append (getChdMdl ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getMdlUid () + "#" + getMdlDepUid (); }

    @Override public AngMdlDepImpl newEmptyInstance () { return (AngMdlDepImpl) newInstance (); }
    
    @Override public AngMdlDepImpl getCopy () {
        return (AngMdlDepImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngMdlDep _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngMdlDepImpl.baseUrl (); }
    public static String baseUrl () { return AngMdlDepImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngMdlDepImpl.baseUrl = baseUrl; } 

    @Override public List<AngMdlDepFields> getFields () { return Arrays.asList (AngMdlDepFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngMdlDepImpl
