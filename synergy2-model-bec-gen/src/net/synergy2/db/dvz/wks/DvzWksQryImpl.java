package net.synergy2.db.dvz.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzWksQryImpl extends DvzWksQry {

    protected DvzWksQryImpl () { super (); }

    public enum DvzWksQryFields implements ISField {
        Uid, WdgUid, WksUid, DvzQryCod, DvzQryDsc, QryUid, Tsi, Tsu, Rsi, Rsu;
    } // DvzWksQryFields
    
    private static String baseUrl = "/rest/dvz/wks/DvzWksQry";


    @Override public String getModelClassName () { return "DvzWksQryImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public DvzWksQryImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        if (full) { if (Objects.nonNull (getWdgUid ())) { str.append ("WdgUid[").append (getWdgUid ()).append ("] "); } }
        if (full) { str.append ("WksUid[").append (getWksUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getDvzQryCod ())) { str.append ("DvzQryCod[").append (getDvzQryCod ()).append ("] "); } }
        if (Objects.nonNull (getDvzQryDsc ())) { str.append ("DvzQryDsc[").append (getDvzQryDsc ()).append ("] "); }
        if (full) { str.append ("QryUid[").append (getQryUid ()).append ("] "); }
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
        if (getPrmLst () != null) { str.append ("\n").append (indent).append ("PrmLst (").append (getPrmLst ().size ()).append ("):"); for (var model : getPrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getFltLst () != null) { str.append ("\n").append (indent).append ("FltLst (").append (getFltLst ().size ()).append ("):"); for (var model : getFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getFmtLst () != null) { str.append ("\n").append (indent).append ("FmtLst (").append (getFmtLst ().size ()).append ("):"); for (var model : getFmtLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDsgLst () != null) { str.append ("\n").append (indent).append ("DsgLst (").append (getDsgLst ().size ()).append ("):"); for (var model : getDsgLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getChrLst () != null) { str.append ("\n").append (indent).append ("ChrLst (").append (getChrLst ().size ()).append ("):"); for (var model : getChrLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getGntLst () != null) { str.append ("\n").append (indent).append ("GntLst (").append (getGntLst ().size ()).append ("):"); for (var model : getGntLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getChrAxxLst () != null) { str.append ("\n").append (indent).append ("ChrAxxLst (").append (getChrAxxLst ().size ()).append ("):"); for (var model : getChrAxxLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getChrAxyLst () != null) { str.append ("\n").append (indent).append ("ChrAxyLst (").append (getChrAxyLst ().size ()).append ("):"); for (var model : getChrAxyLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWdg () != null) { str.append ("\n").append (indent).append ("Wdg: \n").append (getWdg ().debug (full, true, indent + "    ")); }
        if (getWks () != null) { str.append ("\n").append (indent).append ("Wks: \n").append (getWks ().debug (full, true, indent + "    ")); }
        if (getQry () != null) { str.append ("\n").append (indent).append ("Qry: \n").append (getQry ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzWksQryImpl newEmptyInstance () { return (DvzWksQryImpl) newInstance (); }
    
    @Override public DvzWksQryImpl getCopy () {
        var toReturn = (DvzWksQryImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (DvzWksQry _other, boolean checkUid, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DvzWksQryImpl.baseUrl (); }
    public static String baseUrl () { return DvzWksQryImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzWksQryImpl.baseUrl = baseUrl; } 

    @Override public List<DvzWksQryFields> getFields () { return Arrays.asList (DvzWksQryFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzWksQryImpl
