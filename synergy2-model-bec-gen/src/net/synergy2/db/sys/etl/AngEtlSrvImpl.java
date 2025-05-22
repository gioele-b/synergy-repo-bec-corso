package net.synergy2.db.sys.etl;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngEtlSrvImpl extends AngEtlSrv {

    protected AngEtlSrvImpl () { super (); }

    public enum AngEtlSrvFields implements ISField {
        Uid, EtlCod, EtlDsc, SrvEtlRstBasUrl, SrvManRstBasUrl, EtlCtx, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // AngEtlSrvFields
    
    private static String baseUrl = "/rest/sys/etl/AngEtlSrv";


    @Override public String getModelClassName () { return "AngEtlSrvImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngEtlSrvImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("EtlCod[").append (getEtlCod ()).append ("] ");
        str.append ("EtlDsc[").append (getEtlDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getSrvEtlRstBasUrl ())) { str.append ("SrvEtlRstBasUrl[").append (getSrvEtlRstBasUrl ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getSrvManRstBasUrl ())) { str.append ("SrvManRstBasUrl[").append (getSrvManRstBasUrl ()).append ("] "); } }
        if (full) { str.append ("EtlCtx[").append (getEtlCtx ()).append ("] "); }
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
        if (getEtlJobLst () != null) { str.append ("\n").append (indent).append ("EtlJobLst (").append (getEtlJobLst ().size ()).append ("):"); for (var model : getEtlJobLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngEtlSrvImpl newEmptyInstance () { return (AngEtlSrvImpl) newInstance (); }
    
    @Override public AngEtlSrvImpl getCopy () {
        var toReturn = (AngEtlSrvImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngEtlSrv _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngEtlSrvImpl.baseUrl (); }
    public static String baseUrl () { return AngEtlSrvImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngEtlSrvImpl.baseUrl = baseUrl; } 

    @Override public List<AngEtlSrvFields> getFields () { return Arrays.asList (AngEtlSrvFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngEtlSrvImpl
