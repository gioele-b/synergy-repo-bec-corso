package net.synergy2.db.dvz.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzWksGntColImpl extends DvzWksGntCol {

    protected DvzWksGntColImpl () { super (); }

    public enum DvzWksGntColFields implements ISField {
        Uid, DvzGntUid, GntColTblAls, GntColColUid, GntColClcUid, GntColSrt, Tsi, Tsu, Rsi, Rsu, ShwCol, GntColFldUid;
    } // DvzWksGntColFields
    
    private static String baseUrl = "/rest/dvz/wks/DvzWksGntCol";


    @Override public String getModelClassName () { return "DvzWksGntColImpl"; }




    
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
        if (full) { str.append ("DvzGntUid[").append (getDvzGntUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getGntColTblAls ())) { str.append ("GntColTblAls[").append (getGntColTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getGntColColUid ())) { str.append ("GntColColUid[").append (getGntColColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getGntColClcUid ())) { str.append ("GntColClcUid[").append (getGntColClcUid ()).append ("] "); } }
        if (full) { str.append ("GntColSrt[").append (getGntColSrt ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { str.append ("ShwCol[").append (getShwCol ()).append ("] "); }
        if (full) { if (Objects.nonNull (getGntColFldUid ())) { str.append ("GntColFldUid[").append (getGntColFldUid ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getDvzGnt () != null) { str.append ("\n").append (indent).append ("DvzGnt: \n").append (getDvzGnt ().debug (full, true, indent + "    ")); }
        if (getGntColCol () != null) { str.append ("\n").append (indent).append ("GntColCol: \n").append (getGntColCol ().debug (full, true, indent + "    ")); }
        if (getGntColClc () != null) { str.append ("\n").append (indent).append ("GntColClc: \n").append (getGntColClc ().debug (full, true, indent + "    ")); }
        if (getGntColFld () != null) { str.append ("\n").append (indent).append ("GntColFld: \n").append (getGntColFld ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzWksGntColImpl newEmptyInstance () { return (DvzWksGntColImpl) newInstance (); }
    
    @Override public DvzWksGntColImpl getCopy () {
        return (DvzWksGntColImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (DvzWksGntCol _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DvzWksGntColImpl.baseUrl (); }
    public static String baseUrl () { return DvzWksGntColImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzWksGntColImpl.baseUrl = baseUrl; } 

    @Override public List<DvzWksGntColFields> getFields () { return Arrays.asList (DvzWksGntColFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzWksGntColImpl
