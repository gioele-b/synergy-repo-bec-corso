package net.synergy2.db.dvz.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzWksQryDsgImpl extends DvzWksQryDsg {

    protected DvzWksQryDsgImpl () { super (); }

    public enum DvzWksQryDsgFields implements ISField {
        Uid, DvzQryUid, DsgCod, DsgDsc, DsgDef, Tsi, Tsu, Rsi, Rsu;
    } // DvzWksQryDsgFields
    
    private static String baseUrl = "/rest/dvz/wks/DvzWksQryDsg";


    @Override public String getModelClassName () { return "DvzWksQryDsgImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public DvzWksQryDsgImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("DvzQryUid[").append (getDvzQryUid ()).append ("] ");
        str.append ("DsgCod[").append (getDsgCod ()).append ("] ");
        str.append ("DsgDsc[").append (getDsgDsc ()).append ("] ");
        if (full) { str.append ("DsgDef[").append (getDsgDef ()).append ("] "); }
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
        if (getStyLst () != null) { str.append ("\n").append (indent).append ("StyLst (").append (getStyLst ().size ()).append ("):"); for (var model : getStyLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzQry () != null) { str.append ("\n").append (indent).append ("DvzQry: \n").append (getDvzQry ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzWksQryDsgImpl newEmptyInstance () { return (DvzWksQryDsgImpl) newInstance (); }
    
    @Override public DvzWksQryDsgImpl getCopy () {
        var toReturn = (DvzWksQryDsgImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (DvzWksQryDsg _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DvzWksQryDsgImpl.baseUrl (); }
    public static String baseUrl () { return DvzWksQryDsgImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzWksQryDsgImpl.baseUrl = baseUrl; } 

    @Override public List<DvzWksQryDsgFields> getFields () { return Arrays.asList (DvzWksQryDsgFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzWksQryDsgImpl
