package net.synergy2.db.dvz.rep;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzRepChrImpl extends DvzRepChr {

    protected DvzRepChrImpl () { super (); }

    public enum DvzRepChrFields implements ISField {
        Uid, RepQryUid, ChrTypUid, WdgCod, WdgDsc, WdgPosHrz, WdgPosVrt, WdgSpnHrz, WdgSpnVrt, WdgHid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // DvzRepChrFields
    
    private static String baseUrl = "/rest/dvz/rep/DvzRepChr";


    @Override public String getModelClassName () { return "DvzRepChrImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public DvzRepChrImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("RepQryUid[").append (getRepQryUid ()).append ("] ");
        str.append ("ChrTypUid[").append (getChrTypUid ()).append ("] ");
        str.append ("WdgCod[").append (getWdgCod ()).append ("] ");
        str.append ("WdgDsc[").append (getWdgDsc ()).append ("] ");
        if (full) { str.append ("WdgPosHrz[").append (getWdgPosHrz ()).append ("] "); }
        if (full) { str.append ("WdgPosVrt[").append (getWdgPosVrt ()).append ("] "); }
        if (full) { str.append ("WdgSpnHrz[").append (getWdgSpnHrz ()).append ("] "); }
        if (full) { str.append ("WdgSpnVrt[").append (getWdgSpnVrt ()).append ("] "); }
        if (full) { str.append ("WdgHid[").append (getWdgHid ()).append ("] "); }
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
        if (getAxxLst () != null) { str.append ("\n").append (indent).append ("AxxLst (").append (getAxxLst ().size ()).append ("):"); for (var model : getAxxLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAxyLst () != null) { str.append ("\n").append (indent).append ("AxyLst (").append (getAxyLst ().size ()).append ("):"); for (var model : getAxyLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepQry () != null) { str.append ("\n").append (indent).append ("RepQry: \n").append (getRepQry ().debug (full, true, indent + "    ")); }
        if (getChrTyp () != null) { str.append ("\n").append (indent).append ("ChrTyp: \n").append (getChrTyp ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzRepChrImpl newEmptyInstance () { return (DvzRepChrImpl) newInstance (); }
    
    @Override public DvzRepChrImpl getCopy () {
        var toReturn = (DvzRepChrImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (DvzRepChr _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return DvzRepChrImpl.baseUrl (); }
    public static String baseUrl () { return DvzRepChrImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzRepChrImpl.baseUrl = baseUrl; } 

    @Override public List<DvzRepChrFields> getFields () { return Arrays.asList (DvzRepChrFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzRepChrImpl
