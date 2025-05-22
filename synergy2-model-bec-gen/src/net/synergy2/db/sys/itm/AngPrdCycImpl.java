package net.synergy2.db.sys.itm;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class AngPrdCycImpl extends AngPrdCyc {

    protected AngPrdCycImpl () { super (); }

    public enum AngPrdCycFields implements ISField {
        Uid, PrdCycCod, ItmUid, PrdCycDsc, PrdCycTypUid, PrdCycStd, ValStrDat, ValEndDat, EtyUid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, PrdPrcUid;
    } // AngPrdCycFields
    
    private static String baseUrl = "/rest/sys/itm/AngPrdCyc";


    @Override public String getModelClassName () { return "AngPrdCycImpl"; }




    
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
        str.append ("PrdCycCod[").append (getPrdCycCod ()).append ("] ");
        str.append ("ItmUid[").append (getItmUid ()).append ("] ");
        str.append ("PrdCycDsc[").append (getPrdCycDsc ()).append ("] ");
        str.append ("PrdCycTypUid[").append (getPrdCycTypUid ()).append ("] ");
        if (full) { str.append ("PrdCycStd[").append (getPrdCycStd ()).append ("] "); }
        if (full) { if (Objects.nonNull (getValStrDat ())) { str.append ("ValStrDat[").append (getValStrDat ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getValEndDat ())) { str.append ("ValEndDat[").append (getValEndDat ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrdPrcUid ())) { str.append ("PrdPrcUid[").append (getPrdPrcUid ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getOprLst () != null) { str.append ("\n").append (indent).append ("OprLst (").append (getOprLst ().size ()).append ("):"); for (var model : getOprLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getItmLvlSugLst () != null) { str.append ("\n").append (indent).append ("ItmLvlSugLst (").append (getItmLvlSugLst ().size ()).append ("):"); for (var model : getItmLvlSugLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getItm () != null) { str.append ("\n").append (indent).append ("Itm: \n").append (getItm ().debug (full, true, indent + "    ")); }
        if (getTyp () != null) { str.append ("\n").append (indent).append ("Typ: \n").append (getTyp ().debug (full, true, indent + "    ")); }
        if (getPrdPrc () != null) { str.append ("\n").append (indent).append ("PrdPrc: \n").append (getPrdPrc ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngPrdCycImpl newEmptyInstance () { return (AngPrdCycImpl) newInstance (); }
    
    @Override public AngPrdCycImpl getCopy () {
        return (AngPrdCycImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngPrdCyc _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngPrdCycImpl.baseUrl (); }
    public static String baseUrl () { return AngPrdCycImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngPrdCycImpl.baseUrl = baseUrl; } 

    @Override public List<AngPrdCycFields> getFields () { return Arrays.asList (AngPrdCycFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngPrdCycImpl
