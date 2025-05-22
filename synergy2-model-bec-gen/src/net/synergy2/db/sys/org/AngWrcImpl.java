package net.synergy2.db.sys.org;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngWrcImpl extends AngWrc {

    protected AngWrcImpl () { super (); }

    public enum AngWrcFields implements ISField {
        Uid, WrcErpCod, WrcDsc, Enb, Prv, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // AngWrcFields
    
    private static String baseUrl = "/rest/sys/org/AngWrc";


    @Override public String getModelClassName () { return "AngWrcImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngWrcImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("WrcErpCod[").append (getWrcErpCod ()).append ("] ");
        str.append ("WrcDsc[").append (getWrcDsc ()).append ("] ");
        if (full) { str.append ("Enb[").append (getEnb ()).append ("] "); }
        if (full) { str.append ("Prv[").append (getPrv ()).append ("] "); }
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
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWrcWrkLst () != null) { str.append ("\n").append (indent).append ("WrcWrkLst (").append (getWrcWrkLst ().size ()).append ("):"); for (var model : getWrcWrkLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWrcLst () != null) { str.append ("\n").append (indent).append ("WrcLst (").append (getWrcLst ().size ()).append ("):"); for (var model : getWrcLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCstWrkCenLst () != null) { str.append ("\n").append (indent).append ("CstWrkCenLst (").append (getCstWrkCenLst ().size ()).append ("):"); for (var model : getCstWrkCenLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngWrcImpl newEmptyInstance () { return (AngWrcImpl) newInstance (); }
    
    @Override public AngWrcImpl getCopy () {
        var toReturn = (AngWrcImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngWrc _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngWrcImpl.baseUrl (); }
    public static String baseUrl () { return AngWrcImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngWrcImpl.baseUrl = baseUrl; } 

    @Override public List<AngWrcFields> getFields () { return Arrays.asList (AngWrcFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngWrcImpl
