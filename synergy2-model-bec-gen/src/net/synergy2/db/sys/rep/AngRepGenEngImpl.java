package net.synergy2.db.sys.rep;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngRepGenEngImpl extends AngRepGenEng {

    protected AngRepGenEngImpl () { super (); }

    public enum AngRepGenEngFields implements ISField {
        Uid, EngCod, EngDsc, EngUrl, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // AngRepGenEngFields
    
    private static String baseUrl = "/rest/sys/rep/AngRepGenEng";


    @Override public String getModelClassName () { return "AngRepGenEngImpl"; }




    
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
        str.append ("EngCod[").append (getEngCod ()).append ("] ");
        str.append ("EngDsc[").append (getEngDsc ()).append ("] ");
        if (full) { str.append ("EngUrl[").append (getEngUrl ()).append ("] "); }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getRepMdlLst () != null) { str.append ("\n").append (indent).append ("RepMdlLst (").append (getRepMdlLst ().size ()).append ("):"); for (var model : getRepMdlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngRepGenEngImpl newEmptyInstance () { return (AngRepGenEngImpl) newInstance (); }
    
    @Override public AngRepGenEngImpl getCopy () {
        return (AngRepGenEngImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngRepGenEng _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngRepGenEngImpl.baseUrl (); }
    public static String baseUrl () { return AngRepGenEngImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngRepGenEngImpl.baseUrl = baseUrl; } 

    @Override public List<AngRepGenEngFields> getFields () { return Arrays.asList (AngRepGenEngFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngRepGenEngImpl
