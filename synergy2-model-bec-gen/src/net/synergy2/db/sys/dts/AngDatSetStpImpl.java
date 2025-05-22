package net.synergy2.db.sys.dts;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngDatSetStpImpl extends AngDatSetStp {

    protected AngDatSetStpImpl () { super (); }

    public enum AngDatSetStpFields implements ISField {
        Uid, DatSetUid, StpCod, RslPth, TypUid, StpSrt, QryUid, ClsNam, OutLst, Tsi, Tsu, Rsi, Rsu;
    } // AngDatSetStpFields
    
    private static String baseUrl = "/rest/sys/dts/AngDatSetStp";


    @Override public String getModelClassName () { return "AngDatSetStpImpl"; }




    
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
        str.append ("DatSetUid[").append (getDatSetUid ()).append ("] ");
        str.append ("StpCod[").append (getStpCod ()).append ("] ");
        if (full) { if (Objects.nonNull (getRslPth ())) { str.append ("RslPth[").append (getRslPth ()).append ("] "); } }
        if (full) { str.append ("TypUid[").append (getTypUid ()).append ("] "); }
        if (full) { str.append ("StpSrt[").append (getStpSrt ()).append ("] "); }
        if (full) { if (Objects.nonNull (getQryUid ())) { str.append ("QryUid[").append (getQryUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsNam ())) { str.append ("ClsNam[").append (getClsNam ()).append ("] "); } }
        if (full) { str.append ("OutLst[").append (getOutLst ()).append ("] "); }
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
        if (getQryFltLst () != null) { str.append ("\n").append (indent).append ("QryFltLst (").append (getQryFltLst ().size ()).append ("):"); for (var model : getQryFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQryFltValLst () != null) { str.append ("\n").append (indent).append ("QryFltValLst (").append (getQryFltValLst ().size ()).append ("):"); for (var model : getQryFltValLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDatSet () != null) { str.append ("\n").append (indent).append ("DatSet: \n").append (getDatSet ().debug (full, true, indent + "    ")); }
        if (getStpTyp () != null) { str.append ("\n").append (indent).append ("StpTyp: \n").append (getStpTyp ().debug (full, true, indent + "    ")); }
        if (getQry () != null) { str.append ("\n").append (indent).append ("Qry: \n").append (getQry ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngDatSetStpImpl newEmptyInstance () { return (AngDatSetStpImpl) newInstance (); }
    
    @Override public AngDatSetStpImpl getCopy () {
        return (AngDatSetStpImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngDatSetStp _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngDatSetStpImpl.baseUrl (); }
    public static String baseUrl () { return AngDatSetStpImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngDatSetStpImpl.baseUrl = baseUrl; } 

    @Override public List<AngDatSetStpFields> getFields () { return Arrays.asList (AngDatSetStpFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngDatSetStpImpl
