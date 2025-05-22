package net.synergy2.db.sys.ema;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class AngEmaSrvImpl extends AngEmaSrv {

    protected AngEmaSrvImpl () { super (); }

    public enum AngEmaSrvFields implements ISField {
        Uid, SrvCod, SrvDsc, SrvAdd, SrvPrt, SrvUsr, SrvPwd, FlgEnb, DefEmaSnd, DefEmaPri, LogDel, EtyUid, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, SrvTmt;
    } // AngEmaSrvFields
    
    private static String baseUrl = "/rest/sys/ema/AngEmaSrv";


    @Override public String getModelClassName () { return "AngEmaSrvImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngEmaSrvImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("SrvCod[").append (getSrvCod ()).append ("] ");
        str.append ("SrvDsc[").append (getSrvDsc ()).append ("] ");
        if (full) { str.append ("SrvAdd[").append (getSrvAdd ()).append ("] "); }
        if (full) { str.append ("SrvPrt[").append (getSrvPrt ()).append ("] "); }
        if (full) { if (Objects.nonNull (getSrvUsr ())) { str.append ("SrvUsr[").append (getSrvUsr ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getSrvPwd ())) { str.append ("SrvPwd[").append (getSrvPwd ()).append ("] "); } }
        if (full) { str.append ("FlgEnb[").append (getFlgEnb ()).append ("] "); }
        if (full) { if (Objects.nonNull (getDefEmaSnd ())) { str.append ("DefEmaSnd[").append (getDefEmaSnd ()).append ("] "); } }
        if (full) { str.append ("DefEmaPri[").append (getDefEmaPri ()).append ("] "); }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getSrvTmt ())) { str.append ("SrvTmt[").append (getSrvTmt ()).append ("] "); } }
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
        if (getPrpEmaLst () != null) { str.append ("\n").append (indent).append ("PrpEmaLst (").append (getPrpEmaLst ().size ()).append ("):"); for (var model : getPrpEmaLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEmaCroLst () != null) { str.append ("\n").append (indent).append ("EmaCroLst (").append (getEmaCroLst ().size ()).append ("):"); for (var model : getEmaCroLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngEmaSrvImpl newEmptyInstance () { return (AngEmaSrvImpl) newInstance (); }
    
    @Override public AngEmaSrvImpl getCopy () {
        var toReturn = (AngEmaSrvImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngEmaSrv _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngEmaSrvImpl.baseUrl (); }
    public static String baseUrl () { return AngEmaSrvImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngEmaSrvImpl.baseUrl = baseUrl; } 

    @Override public List<AngEmaSrvFields> getFields () { return Arrays.asList (AngEmaSrvFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngEmaSrvImpl
