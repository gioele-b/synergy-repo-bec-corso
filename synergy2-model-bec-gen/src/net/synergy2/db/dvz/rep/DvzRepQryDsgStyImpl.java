package net.synergy2.db.dvz.rep;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzRepQryDsgStyImpl extends DvzRepQryDsgSty {

    protected DvzRepQryDsgStyImpl () { super (); }

    public enum DvzRepQryDsgStyFields implements ISField {
        Uid, DsgUid, QryColUid, StySrt, StyLgd, ClrBak, ClrBrd, ClrTxt, Ico, Tsi, Tsu, Rsi, Rsu;
    } // DvzRepQryDsgStyFields
    
    private static String baseUrl = "/rest/dvz/rep/DvzRepQryDsgSty";


    @Override public String getModelClassName () { return "DvzRepQryDsgStyImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public DvzRepQryDsgStyImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("DsgUid[").append (getDsgUid ()).append ("] ");
        if (Objects.nonNull (getQryColUid ())) { str.append ("QryColUid[").append (getQryColUid ()).append ("] "); }
        str.append ("StySrt[").append (getStySrt ()).append ("] ");
        str.append ("StyLgd[").append (getStyLgd ()).append ("] ");
        if (full) { if (Objects.nonNull (getClrBak ())) { str.append ("ClrBak[").append (getClrBak ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClrBrd ())) { str.append ("ClrBrd[").append (getClrBrd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClrTxt ())) { str.append ("ClrTxt[").append (getClrTxt ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getIco ())) { str.append ("Ico[").append (getIco ()).append ("] "); } }
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
        if (getFltLst () != null) { str.append ("\n").append (indent).append ("FltLst (").append (getFltLst ().size ()).append ("):"); for (var model : getFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDsg () != null) { str.append ("\n").append (indent).append ("Dsg: \n").append (getDsg ().debug (full, true, indent + "    ")); }
        if (getQryCol () != null) { str.append ("\n").append (indent).append ("QryCol: \n").append (getQryCol ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzRepQryDsgStyImpl newEmptyInstance () { return (DvzRepQryDsgStyImpl) newInstance (); }
    
    @Override public DvzRepQryDsgStyImpl getCopy () {
        var toReturn = (DvzRepQryDsgStyImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (DvzRepQryDsgSty _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DvzRepQryDsgStyImpl.baseUrl (); }
    public static String baseUrl () { return DvzRepQryDsgStyImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzRepQryDsgStyImpl.baseUrl = baseUrl; } 

    @Override public List<DvzRepQryDsgStyFields> getFields () { return Arrays.asList (DvzRepQryDsgStyFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzRepQryDsgStyImpl
