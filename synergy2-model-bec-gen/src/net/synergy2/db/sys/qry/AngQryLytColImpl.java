package net.synergy2.db.sys.qry;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngQryLytColImpl extends AngQryLytCol {

    protected AngQryLytColImpl () { super (); }

    public enum AngQryLytColFields implements ISField {
        Uid, LytUid, ColUid, ColWid, ColPin, ColHid, ColSrt, RowGrpIdx, RowSrt, RowSrtAsc, RowGrpTmp, RowGrpRng, RowGrpExp, AggFunUid, Tsi, Tsu, Rsi, Rsu, ColCod;
    } // AngQryLytColFields
    
    private static String baseUrl = "/rest/sys/qry/AngQryLytCol";


    @Override public String getModelClassName () { return "AngQryLytColImpl"; }




    
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
        if (full) { str.append ("LytUid[").append (getLytUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getColUid ())) { str.append ("ColUid[").append (getColUid ()).append ("] "); } }
        if (full) { str.append ("ColWid[").append (getColWid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getColPin ())) { str.append ("ColPin[").append (getColPin ()).append ("] "); } }
        if (full) { str.append ("ColHid[").append (getColHid ()).append ("] "); }
        if (full) { str.append ("ColSrt[").append (getColSrt ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRowGrpIdx ())) { str.append ("RowGrpIdx[").append (getRowGrpIdx ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRowSrt ())) { str.append ("RowSrt[").append (getRowSrt ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRowSrtAsc ())) { str.append ("RowSrtAsc[").append (getRowSrtAsc ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRowGrpTmp ())) { str.append ("RowGrpTmp[").append (getRowGrpTmp ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRowGrpRng ())) { str.append ("RowGrpRng[").append (getRowGrpRng ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRowGrpExp ())) { str.append ("RowGrpExp[").append (getRowGrpExp ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getAggFunUid ())) { str.append ("AggFunUid[").append (getAggFunUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getColCod ())) { str.append ("ColCod[").append (getColCod ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getLyt () != null) { str.append ("\n").append (indent).append ("Lyt: \n").append (getLyt ().debug (full, true, indent + "    ")); }
        if (getQryCol () != null) { str.append ("\n").append (indent).append ("QryCol: \n").append (getQryCol ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngQryLytColImpl newEmptyInstance () { return (AngQryLytColImpl) newInstance (); }
    
    @Override public AngQryLytColImpl getCopy () {
        return (AngQryLytColImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngQryLytCol _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngQryLytColImpl.baseUrl (); }
    public static String baseUrl () { return AngQryLytColImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngQryLytColImpl.baseUrl = baseUrl; } 

    @Override public List<AngQryLytColFields> getFields () { return Arrays.asList (AngQryLytColFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngQryLytColImpl
