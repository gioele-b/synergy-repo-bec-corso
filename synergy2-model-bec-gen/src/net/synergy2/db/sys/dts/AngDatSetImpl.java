package net.synergy2.db.sys.dts;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngDatSetImpl extends AngDatSet {

    protected AngDatSetImpl () { super (); }

    public enum AngDatSetFields implements ISField {
        Uid, DatSetCod, DatSetDsc, DbmTblUid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // AngDatSetFields
    
    private static String baseUrl = "/rest/sys/dts/AngDatSet";


    @Override public String getModelClassName () { return "AngDatSetImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngDatSetImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("DatSetCod[").append (getDatSetCod ()).append ("] ");
        str.append ("DatSetDsc[").append (getDatSetDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getDbmTblUid ())) { str.append ("DbmTblUid[").append (getDbmTblUid ()).append ("] "); } }
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
        if (getDocClsCtxLst () != null) { str.append ("\n").append (indent).append ("DocClsCtxLst (").append (getDocClsCtxLst ().size ()).append ("):"); for (var model : getDocClsCtxLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDatSetPrmLst () != null) { str.append ("\n").append (indent).append ("DatSetPrmLst (").append (getDatSetPrmLst ().size ()).append ("):"); for (var model : getDatSetPrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getStpLst () != null) { str.append ("\n").append (indent).append ("StpLst (").append (getStpLst ().size ()).append ("):"); for (var model : getStpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEmaCroLst () != null) { str.append ("\n").append (indent).append ("EmaCroLst (").append (getEmaCroLst ().size ()).append ("):"); for (var model : getEmaCroLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepMdlLst () != null) { str.append ("\n").append (indent).append ("RepMdlLst (").append (getRepMdlLst ().size ()).append ("):"); for (var model : getRepMdlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDbmTbl () != null) { str.append ("\n").append (indent).append ("DbmTbl: \n").append (getDbmTbl ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngDatSetImpl newEmptyInstance () { return (AngDatSetImpl) newInstance (); }
    
    @Override public AngDatSetImpl getCopy () {
        var toReturn = (AngDatSetImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngDatSet _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngDatSetImpl.baseUrl (); }
    public static String baseUrl () { return AngDatSetImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngDatSetImpl.baseUrl = baseUrl; } 

    @Override public List<AngDatSetFields> getFields () { return Arrays.asList (AngDatSetFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngDatSetImpl
