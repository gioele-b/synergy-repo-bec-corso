package net.synergy2.db.sys.rep;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class RepMdlImpl extends RepMdl {

    protected RepMdlImpl () { super (); }

    public enum RepMdlFields implements ISField {
        Uid, MdlCod, MdlDsc, TblUid, ForTpl, DatSetUid, AthGrpUid, ExpKepSaf, Tsi, Tsu, Rsi, Rsu, GenEngUid, GetLbl;
    } // RepMdlFields
    
    private static String baseUrl = "/rest/sys/rep/RepMdl";


    @Override public String getModelClassName () { return "RepMdlImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public RepMdlImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("MdlCod[").append (getMdlCod ()).append ("] ");
        str.append ("MdlDsc[").append (getMdlDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getTblUid ())) { str.append ("TblUid[").append (getTblUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getForTpl ())) { str.append ("ForTpl[").append (getForTpl ()).append ("] "); } }
        if (full) { str.append ("DatSetUid[").append (getDatSetUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getAthGrpUid ())) { str.append ("AthGrpUid[").append (getAthGrpUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getExpKepSaf ())) { str.append ("ExpKepSaf[").append (getExpKepSaf ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { str.append ("GenEngUid[").append (getGenEngUid ()).append ("] "); }
        if (full) { str.append ("GetLbl[").append (getGetLbl ()).append ("] "); }
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
        if (getRepMdlLngLst () != null) { str.append ("\n").append (indent).append ("RepMdlLngLst (").append (getRepMdlLngLst ().size ()).append ("):"); for (var model : getRepMdlLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getPrmLst () != null) { str.append ("\n").append (indent).append ("PrmLst (").append (getPrmLst ().size ()).append ("):"); for (var model : getPrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDbmTbl () != null) { str.append ("\n").append (indent).append ("DbmTbl: \n").append (getDbmTbl ().debug (full, true, indent + "    ")); }
        if (getDatSet () != null) { str.append ("\n").append (indent).append ("DatSet: \n").append (getDatSet ().debug (full, true, indent + "    ")); }
        if (getAthGrp () != null) { str.append ("\n").append (indent).append ("AthGrp: \n").append (getAthGrp ().debug (full, true, indent + "    ")); }
        if (getGenEng () != null) { str.append ("\n").append (indent).append ("GenEng: \n").append (getGenEng ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public RepMdlImpl newEmptyInstance () { return (RepMdlImpl) newInstance (); }
    
    @Override public RepMdlImpl getCopy () {
        var toReturn = (RepMdlImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (RepMdl _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return RepMdlImpl.baseUrl (); }
    public static String baseUrl () { return RepMdlImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { RepMdlImpl.baseUrl = baseUrl; } 

    @Override public List<RepMdlFields> getFields () { return Arrays.asList (RepMdlFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // RepMdlImpl
