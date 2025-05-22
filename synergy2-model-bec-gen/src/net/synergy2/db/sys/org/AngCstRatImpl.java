package net.synergy2.db.sys.org;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngCstRatImpl extends AngCstRat {

    protected AngCstRatImpl () { super (); }

    public enum AngCstRatFields implements ISField {
        Uid, RatCls, RatCod, RatDsc, RatDef, RatSrt, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // AngCstRatFields
    
    private static String baseUrl = "/rest/sys/org/AngCstRat";


    @Override public String getModelClassName () { return "AngCstRatImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngCstRatImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        if (full) { if (Objects.nonNull (getRatCls ())) { str.append ("RatCls[").append (getRatCls ()).append ("] "); } }
        str.append ("RatCod[").append (getRatCod ()).append ("] ");
        str.append ("RatDsc[").append (getRatDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getRatDef ())) { str.append ("RatDef[").append (getRatDef ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRatSrt ())) { str.append ("RatSrt[").append (getRatSrt ()).append ("] "); } }
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
        if (getCstRatLst () != null) { str.append ("\n").append (indent).append ("CstRatLst (").append (getCstRatLst ().size ()).append ("):"); for (var model : getCstRatLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngCstRatImpl newEmptyInstance () { return (AngCstRatImpl) newInstance (); }
    
    @Override public AngCstRatImpl getCopy () {
        var toReturn = (AngCstRatImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngCstRat _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngCstRatImpl.baseUrl (); }
    public static String baseUrl () { return AngCstRatImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngCstRatImpl.baseUrl = baseUrl; } 

    @Override public List<AngCstRatFields> getFields () { return Arrays.asList (AngCstRatFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngCstRatImpl
