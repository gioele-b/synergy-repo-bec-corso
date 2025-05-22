package net.synergy2.db.sys.lgs;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngWhsImpl extends AngWhs {

    protected AngWhsImpl () { super (); }

    public enum AngWhsFields implements ISField {
        Uid, WhsCod, WhsDsc, PlnUid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // AngWhsFields
    
    private static String baseUrl = "/rest/sys/lgs/AngWhs";


    @Override public String getModelClassName () { return "AngWhsImpl"; }




    
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
        str.append ("WhsCod[").append (getWhsCod ()).append ("] ");
        str.append ("WhsDsc[").append (getWhsDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getPlnUid ())) { str.append ("PlnUid[").append (getPlnUid ()).append ("] "); } }
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
        if (getItmLst () != null) { str.append ("\n").append (indent).append ("ItmLst (").append (getItmLst ().size ()).append ("):"); for (var model : getItmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getPln () != null) { str.append ("\n").append (indent).append ("Pln: \n").append (getPln ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngWhsImpl newEmptyInstance () { return (AngWhsImpl) newInstance (); }
    
    @Override public AngWhsImpl getCopy () {
        return (AngWhsImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngWhs _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngWhsImpl.baseUrl (); }
    public static String baseUrl () { return AngWhsImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngWhsImpl.baseUrl = baseUrl; } 

    @Override public List<AngWhsFields> getFields () { return Arrays.asList (AngWhsFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngWhsImpl
