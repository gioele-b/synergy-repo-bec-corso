package net.synergy2.db.sys.lgs;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngPlnImpl extends AngPln {

    protected AngPlnImpl () { super (); }

    public enum AngPlnFields implements ISField {
        Uid, PlnCod, PlnDsc, OrgComUid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, CalUid;
    } // AngPlnFields
    
    private static String baseUrl = "/rest/sys/lgs/AngPln";


    @Override public String getModelClassName () { return "AngPlnImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngPlnImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("PlnCod[").append (getPlnCod ()).append ("] ");
        str.append ("PlnDsc[").append (getPlnDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getOrgComUid ())) { str.append ("OrgComUid[").append (getOrgComUid ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCalUid ())) { str.append ("CalUid[").append (getCalUid ()).append ("] "); } }
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
        if (getAbsLst () != null) { str.append ("\n").append (indent).append ("AbsLst (").append (getAbsLst ().size ()).append ("):"); for (var model : getAbsLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWhsLst () != null) { str.append ("\n").append (indent).append ("WhsLst (").append (getWhsLst ().size ()).append ("):"); for (var model : getWhsLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getOrgCom () != null) { str.append ("\n").append (indent).append ("OrgCom: \n").append (getOrgCom ().debug (full, true, indent + "    ")); }
        if (getCal () != null) { str.append ("\n").append (indent).append ("Cal: \n").append (getCal ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngPlnImpl newEmptyInstance () { return (AngPlnImpl) newInstance (); }
    
    @Override public AngPlnImpl getCopy () {
        var toReturn = (AngPlnImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngPln _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngPlnImpl.baseUrl (); }
    public static String baseUrl () { return AngPlnImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngPlnImpl.baseUrl = baseUrl; } 

    @Override public List<AngPlnFields> getFields () { return Arrays.asList (AngPlnFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngPlnImpl
