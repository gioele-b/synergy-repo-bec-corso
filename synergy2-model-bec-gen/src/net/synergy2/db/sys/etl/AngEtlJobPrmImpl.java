package net.synergy2.db.sys.etl;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngEtlJobPrmImpl extends AngEtlJobPrm {

    protected AngEtlJobPrmImpl () { super (); }

    public enum AngEtlJobPrmFields implements ISField {
        Uid, EtlJobUid, EtlJobPrmCod, EtlJobPrmDsc, EtlJobPrmVal, EtlJobPrmTyp, EtlJobPrmSubTyp, Tsi, Tsu, Rsi, Rsu;
    } // AngEtlJobPrmFields
    
    private static String baseUrl = "/rest/sys/etl/AngEtlJobPrm";


    @Override public String getModelClassName () { return "AngEtlJobPrmImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngEtlJobPrmImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("EtlJobUid[").append (getEtlJobUid ()).append ("] ");
        str.append ("EtlJobPrmCod[").append (getEtlJobPrmCod ()).append ("] ");
        str.append ("EtlJobPrmDsc[").append (getEtlJobPrmDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getEtlJobPrmVal ())) { str.append ("EtlJobPrmVal[").append (getEtlJobPrmVal ()).append ("] "); } }
        if (full) { str.append ("EtlJobPrmTyp[").append (getEtlJobPrmTyp ()).append ("] "); }
        if (full) { if (Objects.nonNull (getEtlJobPrmSubTyp ())) { str.append ("EtlJobPrmSubTyp[").append (getEtlJobPrmSubTyp ()).append ("] "); } }
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
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSysWksBtnActLst () != null) { str.append ("\n").append (indent).append ("SysWksBtnActLst (").append (getSysWksBtnActLst ().size ()).append ("):"); for (var model : getSysWksBtnActLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEtlJob () != null) { str.append ("\n").append (indent).append ("EtlJob: \n").append (getEtlJob ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngEtlJobPrmImpl newEmptyInstance () { return (AngEtlJobPrmImpl) newInstance (); }
    
    @Override public AngEtlJobPrmImpl getCopy () {
        var toReturn = (AngEtlJobPrmImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngEtlJobPrm _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngEtlJobPrmImpl.baseUrl (); }
    public static String baseUrl () { return AngEtlJobPrmImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngEtlJobPrmImpl.baseUrl = baseUrl; } 

    @Override public List<AngEtlJobPrmFields> getFields () { return Arrays.asList (AngEtlJobPrmFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngEtlJobPrmImpl
