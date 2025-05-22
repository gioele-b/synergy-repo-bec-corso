package net.synergy2.db.sys.app;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class SysPrmImpl extends SysPrm {

    protected SysPrmImpl () { super (); }

    public enum SysPrmFields implements ISField {
        Uid, PrmNam, PrmDsc, PrmEnb, EtyUid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // SysPrmFields
    
    private static String baseUrl = "/rest/sys/app/SysPrm";


    @Override public String getModelClassName () { return "SysPrmImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public SysPrmImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
    @Override public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        switch (fieldName) {
            case SAlias.ENTITY -> setEntity ((AngEty) value); 

            default -> {
                if (!settedSuper) { throw new SQueryException ("No reference specification found for field [" + fieldName + "]."); }
            }
        } // switch
        return true;
    } // set
    
    @Override public String debug (boolean full, boolean cascade, String indent) {
        StringBuilder str = new StringBuilder (indent).append (getModelClassName ()).append (" = {");
        str.append ("Uid[").append (getUid ()).append ("] ");
        str.append ("PrmNam[").append (getPrmNam ()).append ("] ");
        str.append ("PrmDsc[").append (getPrmDsc ()).append ("] ");
        if (full) { str.append ("PrmEnb[").append (getPrmEnb ()).append ("] "); }
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
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
        if (getAppLst () != null) { str.append ("\n").append (indent).append ("AppLst (").append (getAppLst ().size ()).append ("):"); for (var model : getAppLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCtxLst () != null) { str.append ("\n").append (indent).append ("CtxLst (").append (getCtxLst ().size ()).append ("):"); for (var model : getCtxLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getFrmLst () != null) { str.append ("\n").append (indent).append ("FrmLst (").append (getFrmLst ().size ()).append ("):"); for (var model : getFrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysPrmImpl newEmptyInstance () { return (SysPrmImpl) newInstance (); }
    
    @Override public SysPrmImpl getCopy () {
        var toReturn = (SysPrmImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (SysPrm _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return SysPrmImpl.baseUrl (); }
    public static String baseUrl () { return SysPrmImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysPrmImpl.baseUrl = baseUrl; } 

    @Override public List<SysPrmFields> getFields () { return Arrays.asList (SysPrmFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysPrmImpl
