package net.synergy2.db.sys.qry;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngQryJoiImpl extends AngQryJoi {

    protected AngQryJoiImpl () { super (); }

    public enum AngQryJoiFields implements ISField {
        Uid, QryUid, SrtOrd, TblFrmAls, RfkUid, RfkChd, TblAls, JoiTyp, QryCpl, QryUpf, JoiAdd, QryEty, IgnAut, Tsi, Tsu, Rsi, Rsu, JoiAddPlh;
    } // AngQryJoiFields
    
    private static String baseUrl = "/rest/sys/qry/AngQryJoi";


    @Override public String getModelClassName () { return "AngQryJoiImpl"; }




    
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
        str.append ("QryUid[").append (getQryUid ()).append ("] ");
        str.append ("SrtOrd[").append (getSrtOrd ()).append ("] ");
        if (full) { str.append ("TblFrmAls[").append (getTblFrmAls ()).append ("] "); }
        if (full) { str.append ("RfkUid[").append (getRfkUid ()).append ("] "); }
        if (full) { str.append ("RfkChd[").append (getRfkChd ()).append ("] "); }
        if (full) { str.append ("TblAls[").append (getTblAls ()).append ("] "); }
        if (full) { str.append ("JoiTyp[").append (getJoiTyp ()).append ("] "); }
        if (full) { str.append ("QryCpl[").append (getQryCpl ()).append ("] "); }
        if (full) { str.append ("QryUpf[").append (getQryUpf ()).append ("] "); }
        if (full) { if (Objects.nonNull (getJoiAdd ())) { str.append ("JoiAdd[").append (getJoiAdd ()).append ("] "); } }
        if (full) { str.append ("QryEty[").append (getQryEty ()).append ("] "); }
        if (full) { str.append ("IgnAut[").append (getIgnAut ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { str.append ("JoiAddPlh[").append (getJoiAddPlh ()).append ("] "); }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getRfk () != null) { str.append ("\n").append (indent).append ("Rfk: \n").append (getRfk ().debug (full, true, indent + "    ")); }
        if (getQry () != null) { str.append ("\n").append (indent).append ("Qry: \n").append (getQry ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngQryJoiImpl newEmptyInstance () { return (AngQryJoiImpl) newInstance (); }
    
    @Override public AngQryJoiImpl getCopy () {
        return (AngQryJoiImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngQryJoi _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngQryJoiImpl.baseUrl (); }
    public static String baseUrl () { return AngQryJoiImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngQryJoiImpl.baseUrl = baseUrl; } 

    @Override public List<AngQryJoiFields> getFields () { return Arrays.asList (AngQryJoiFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngQryJoiImpl
