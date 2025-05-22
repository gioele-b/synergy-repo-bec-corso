package net.synergy2.db.sys.qry;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngQryLytImpl extends AngQryLyt {

    protected AngQryLytImpl () { super (); }

    public enum AngQryLytFields implements ISField {
        Uid, LytCod, LytDsc, LytIco, LytClr, QryUid, GrpColPin, GrpColWid, GrpColRowSrt, GrpColRowAsc, QryLytLmt, AskFlt, Tsi, Tsu, Rsi, Rsu, LytPrv;
    } // AngQryLytFields
    
    private static String baseUrl = "/rest/sys/qry/AngQryLyt";


    @Override public String getModelClassName () { return "AngQryLytImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngQryLytImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        if (full) { if (Objects.nonNull (getLytCod ())) { str.append ("LytCod[").append (getLytCod ()).append ("] "); } }
        str.append ("LytDsc[").append (getLytDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getLytIco ())) { str.append ("LytIco[").append (getLytIco ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLytClr ())) { str.append ("LytClr[").append (getLytClr ()).append ("] "); } }
        if (full) { str.append ("QryUid[").append (getQryUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getGrpColPin ())) { str.append ("GrpColPin[").append (getGrpColPin ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getGrpColWid ())) { str.append ("GrpColWid[").append (getGrpColWid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getGrpColRowSrt ())) { str.append ("GrpColRowSrt[").append (getGrpColRowSrt ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getGrpColRowAsc ())) { str.append ("GrpColRowAsc[").append (getGrpColRowAsc ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getQryLytLmt ())) { str.append ("QryLytLmt[").append (getQryLytLmt ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getAskFlt ())) { str.append ("AskFlt[").append (getAskFlt ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { str.append ("LytPrv[").append (getLytPrv ()).append ("] "); }
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
        if (getLytColLst () != null) { str.append ("\n").append (indent).append ("LytColLst (").append (getLytColLst ().size ()).append ("):"); for (var model : getLytColLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getResLst () != null) { str.append ("\n").append (indent).append ("ResLst (").append (getResLst ().size ()).append ("):"); for (var model : getResLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getFltLst () != null) { str.append ("\n").append (indent).append ("FltLst (").append (getFltLst ().size ()).append ("):"); for (var model : getFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLytSrtLst () != null) { str.append ("\n").append (indent).append ("LytSrtLst (").append (getLytSrtLst ().size ()).append ("):"); for (var model : getLytSrtLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQry () != null) { str.append ("\n").append (indent).append ("Qry: \n").append (getQry ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngQryLytImpl newEmptyInstance () { return (AngQryLytImpl) newInstance (); }
    
    @Override public AngQryLytImpl getCopy () {
        var toReturn = (AngQryLytImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngQryLyt _other, boolean checkUid, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngQryLytImpl.baseUrl (); }
    public static String baseUrl () { return AngQryLytImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngQryLytImpl.baseUrl = baseUrl; } 

    @Override public List<AngQryLytFields> getFields () { return Arrays.asList (AngQryLytFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngQryLytImpl
