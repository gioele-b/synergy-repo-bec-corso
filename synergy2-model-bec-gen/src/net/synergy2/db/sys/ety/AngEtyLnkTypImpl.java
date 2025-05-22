package net.synergy2.db.sys.ety;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngEtyLnkTypImpl extends AngEtyLnkTyp {

    protected AngEtyLnkTypImpl () { super (); }

    public enum AngEtyLnkTypFields implements ISField {
        Uid, LnkTypDsc, LnkTypIco, LnkTypRevDsc, Tsi, Tsu, Rsi, Rsu;
    } // AngEtyLnkTypFields
    
    private static String baseUrl = "/rest/sys/ety/AngEtyLnkTyp";


    @Override public String getModelClassName () { return "AngEtyLnkTypImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngEtyLnkTypImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("LnkTypDsc[").append (getLnkTypDsc ()).append ("] ");
        if (full) { str.append ("LnkTypIco[").append (getLnkTypIco ()).append ("] "); }
        str.append ("LnkTypRevDsc[").append (getLnkTypRevDsc ()).append ("] ");
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
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLnkLst () != null) { str.append ("\n").append (indent).append ("LnkLst (").append (getLnkLst ().size ()).append ("):"); for (var model : getLnkLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngEtyLnkTypImpl newEmptyInstance () { return (AngEtyLnkTypImpl) newInstance (); }
    
    @Override public AngEtyLnkTypImpl getCopy () {
        var toReturn = (AngEtyLnkTypImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngEtyLnkTyp _other, boolean checkUid, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngEtyLnkTypImpl.baseUrl (); }
    public static String baseUrl () { return AngEtyLnkTypImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngEtyLnkTypImpl.baseUrl = baseUrl; } 

    @Override public List<AngEtyLnkTypFields> getFields () { return Arrays.asList (AngEtyLnkTypFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngEtyLnkTypImpl
