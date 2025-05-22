package net.synergy2.db.dvz.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzWksChrImpl extends DvzWksChr {

    protected DvzWksChrImpl () { super (); }

    public enum DvzWksChrFields implements ISField {
        Uid, WdgUid, DvzQryUid, ChrTypUid, AxyFmtVal, Tsi, Tsu, Rsi, Rsu, LgdPos, FmtVal;
    } // DvzWksChrFields
    
    private static String baseUrl = "/rest/dvz/wks/DvzWksChr";


    @Override public String getModelClassName () { return "DvzWksChrImpl"; }




    
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
        if (full) { str.append ("WdgUid[").append (getWdgUid ()).append ("] "); }
        if (full) { str.append ("DvzQryUid[").append (getDvzQryUid ()).append ("] "); }
        if (full) { str.append ("ChrTypUid[").append (getChrTypUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getAxyFmtVal ())) { str.append ("AxyFmtVal[").append (getAxyFmtVal ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { str.append ("LgdPos[").append (getLgdPos ()).append ("] "); }
        if (full) { if (Objects.nonNull (getFmtVal ())) { str.append ("FmtVal[").append (getFmtVal ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getAxxLst () != null) { str.append ("\n").append (indent).append ("AxxLst (").append (getAxxLst ().size ()).append ("):"); for (var model : getAxxLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAxyLst () != null) { str.append ("\n").append (indent).append ("AxyLst (").append (getAxyLst ().size ()).append ("):"); for (var model : getAxyLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWdg () != null) { str.append ("\n").append (indent).append ("Wdg: \n").append (getWdg ().debug (full, true, indent + "    ")); }
        if (getDvzQry () != null) { str.append ("\n").append (indent).append ("DvzQry: \n").append (getDvzQry ().debug (full, true, indent + "    ")); }
        if (getChrTyp () != null) { str.append ("\n").append (indent).append ("ChrTyp: \n").append (getChrTyp ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzWksChrImpl newEmptyInstance () { return (DvzWksChrImpl) newInstance (); }
    
    @Override public DvzWksChrImpl getCopy () {
        return (DvzWksChrImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (DvzWksChr _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DvzWksChrImpl.baseUrl (); }
    public static String baseUrl () { return DvzWksChrImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzWksChrImpl.baseUrl = baseUrl; } 

    @Override public List<DvzWksChrFields> getFields () { return Arrays.asList (DvzWksChrFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzWksChrImpl
