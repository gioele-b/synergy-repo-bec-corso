package net.synergy2.db.dvz.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzWksChrAxyClrRngImpl extends DvzWksChrAxyClrRng {

    protected DvzWksChrAxyClrRngImpl () { super (); }

    public enum DvzWksChrAxyClrRngFields implements ISField {
        Uid, AxyUid, IncEnd, Clr, RngEnd, Tsi, Tsu, Rsi, Rsu;
    } // DvzWksChrAxyClrRngFields
    
    private static String baseUrl = "/rest/dvz/wks/DvzWksChrAxyClrRng";


    @Override public String getModelClassName () { return "DvzWksChrAxyClrRngImpl"; }




    
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
        str.append ("AxyUid[").append (getAxyUid ()).append ("] ");
        if (full) { str.append ("IncEnd[").append (getIncEnd ()).append ("] "); }
        if (full) { str.append ("Clr[").append (getClr ()).append ("] "); }
        if (full) { str.append ("RngEnd[").append (getRngEnd ()).append ("] "); }
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
        if (getChrAxy () != null) { str.append ("\n").append (indent).append ("ChrAxy: \n").append (getChrAxy ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzWksChrAxyClrRngImpl newEmptyInstance () { return (DvzWksChrAxyClrRngImpl) newInstance (); }
    
    @Override public DvzWksChrAxyClrRngImpl getCopy () {
        return (DvzWksChrAxyClrRngImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (DvzWksChrAxyClrRng _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DvzWksChrAxyClrRngImpl.baseUrl (); }
    public static String baseUrl () { return DvzWksChrAxyClrRngImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzWksChrAxyClrRngImpl.baseUrl = baseUrl; } 

    @Override public List<DvzWksChrAxyClrRngFields> getFields () { return Arrays.asList (DvzWksChrAxyClrRngFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzWksChrAxyClrRngImpl
