package net.synergy2.db.dvz.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DvzWksGntImpl extends DvzWksGnt {

    protected DvzWksGntImpl () { super (); }

    public enum DvzWksGntFields implements ISField {
        Uid, WdgUid, DvzQryUid, StrTblAls, StrColUid, StrClcUid, EndTblAls, EndColUid, EndClcUid, ClrTblAls, ClrColUid, ClrClcUid, DayTblAls, DayColUid, DayClcUid, TmpScaIni, Tsi, Tsu, Rsi, Rsu, LblLftTblAls, LblLftColUid, LblLftClcUid, LblMidTblAls, LblMidColUid, LblMidClcUid, LblRgtTblAls, LblRgtColUid, LblRgtClcUid, StrFldUid, EndFldUid, ClrFldUid, DayFldUid, LblLftFldUid, LblMidFldUid, LblRgtFldUid;
    } // DvzWksGntFields
    
    private static String baseUrl = "/rest/dvz/wks/DvzWksGnt";


    @Override public String getModelClassName () { return "DvzWksGntImpl"; }




    
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
        if (full) { str.append ("WdgUid[").append (getWdgUid ()).append ("] "); }
        if (full) { str.append ("DvzQryUid[").append (getDvzQryUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getStrTblAls ())) { str.append ("StrTblAls[").append (getStrTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStrColUid ())) { str.append ("StrColUid[").append (getStrColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStrClcUid ())) { str.append ("StrClcUid[").append (getStrClcUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEndTblAls ())) { str.append ("EndTblAls[").append (getEndTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEndColUid ())) { str.append ("EndColUid[").append (getEndColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEndClcUid ())) { str.append ("EndClcUid[").append (getEndClcUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClrTblAls ())) { str.append ("ClrTblAls[").append (getClrTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClrColUid ())) { str.append ("ClrColUid[").append (getClrColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClrClcUid ())) { str.append ("ClrClcUid[").append (getClrClcUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDayTblAls ())) { str.append ("DayTblAls[").append (getDayTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDayColUid ())) { str.append ("DayColUid[").append (getDayColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDayClcUid ())) { str.append ("DayClcUid[").append (getDayClcUid ()).append ("] "); } }
        if (full) { str.append ("TmpScaIni[").append (getTmpScaIni ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLblLftTblAls ())) { str.append ("LblLftTblAls[").append (getLblLftTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLblLftColUid ())) { str.append ("LblLftColUid[").append (getLblLftColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLblLftClcUid ())) { str.append ("LblLftClcUid[").append (getLblLftClcUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLblMidTblAls ())) { str.append ("LblMidTblAls[").append (getLblMidTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLblMidColUid ())) { str.append ("LblMidColUid[").append (getLblMidColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLblMidClcUid ())) { str.append ("LblMidClcUid[").append (getLblMidClcUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLblRgtTblAls ())) { str.append ("LblRgtTblAls[").append (getLblRgtTblAls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLblRgtColUid ())) { str.append ("LblRgtColUid[").append (getLblRgtColUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLblRgtClcUid ())) { str.append ("LblRgtClcUid[").append (getLblRgtClcUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStrFldUid ())) { str.append ("StrFldUid[").append (getStrFldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEndFldUid ())) { str.append ("EndFldUid[").append (getEndFldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClrFldUid ())) { str.append ("ClrFldUid[").append (getClrFldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDayFldUid ())) { str.append ("DayFldUid[").append (getDayFldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLblLftFldUid ())) { str.append ("LblLftFldUid[").append (getLblLftFldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLblMidFldUid ())) { str.append ("LblMidFldUid[").append (getLblMidFldUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLblRgtFldUid ())) { str.append ("LblRgtFldUid[").append (getLblRgtFldUid ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getGntColLst () != null) { str.append ("\n").append (indent).append ("GntColLst (").append (getGntColLst ().size ()).append ("):"); for (var model : getGntColLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getGrpLst () != null) { str.append ("\n").append (indent).append ("GrpLst (").append (getGrpLst ().size ()).append ("):"); for (var model : getGrpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLayLst () != null) { str.append ("\n").append (indent).append ("LayLst (").append (getLayLst ().size ()).append ("):"); for (var model : getLayLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWdg () != null) { str.append ("\n").append (indent).append ("Wdg: \n").append (getWdg ().debug (full, true, indent + "    ")); }
        if (getDvzQry () != null) { str.append ("\n").append (indent).append ("DvzQry: \n").append (getDvzQry ().debug (full, true, indent + "    ")); }
        if (getStrCol () != null) { str.append ("\n").append (indent).append ("StrCol: \n").append (getStrCol ().debug (full, true, indent + "    ")); }
        if (getStrClc () != null) { str.append ("\n").append (indent).append ("StrClc: \n").append (getStrClc ().debug (full, true, indent + "    ")); }
        if (getEndCol () != null) { str.append ("\n").append (indent).append ("EndCol: \n").append (getEndCol ().debug (full, true, indent + "    ")); }
        if (getEndClc () != null) { str.append ("\n").append (indent).append ("EndClc: \n").append (getEndClc ().debug (full, true, indent + "    ")); }
        if (getClrCol () != null) { str.append ("\n").append (indent).append ("ClrCol: \n").append (getClrCol ().debug (full, true, indent + "    ")); }
        if (getClrClc () != null) { str.append ("\n").append (indent).append ("ClrClc: \n").append (getClrClc ().debug (full, true, indent + "    ")); }
        if (getDayCol () != null) { str.append ("\n").append (indent).append ("DayCol: \n").append (getDayCol ().debug (full, true, indent + "    ")); }
        if (getDayClc () != null) { str.append ("\n").append (indent).append ("DayClc: \n").append (getDayClc ().debug (full, true, indent + "    ")); }
        if (getLblLftCol () != null) { str.append ("\n").append (indent).append ("LblLftCol: \n").append (getLblLftCol ().debug (full, true, indent + "    ")); }
        if (getLblLftClc () != null) { str.append ("\n").append (indent).append ("LblLftClc: \n").append (getLblLftClc ().debug (full, true, indent + "    ")); }
        if (getLblMidCol () != null) { str.append ("\n").append (indent).append ("LblMidCol: \n").append (getLblMidCol ().debug (full, true, indent + "    ")); }
        if (getLblMidClc () != null) { str.append ("\n").append (indent).append ("LblMidClc: \n").append (getLblMidClc ().debug (full, true, indent + "    ")); }
        if (getLblRgtCol () != null) { str.append ("\n").append (indent).append ("LblRgtCol: \n").append (getLblRgtCol ().debug (full, true, indent + "    ")); }
        if (getLblRgtClc () != null) { str.append ("\n").append (indent).append ("LblRgtClc: \n").append (getLblRgtClc ().debug (full, true, indent + "    ")); }
        if (getStrFld () != null) { str.append ("\n").append (indent).append ("StrFld: \n").append (getStrFld ().debug (full, true, indent + "    ")); }
        if (getEndFld () != null) { str.append ("\n").append (indent).append ("EndFld: \n").append (getEndFld ().debug (full, true, indent + "    ")); }
        if (getClrFld () != null) { str.append ("\n").append (indent).append ("ClrFld: \n").append (getClrFld ().debug (full, true, indent + "    ")); }
        if (getDayFld () != null) { str.append ("\n").append (indent).append ("DayFld: \n").append (getDayFld ().debug (full, true, indent + "    ")); }
        if (getLblLftFld () != null) { str.append ("\n").append (indent).append ("LblLftFld: \n").append (getLblLftFld ().debug (full, true, indent + "    ")); }
        if (getLblMidFld () != null) { str.append ("\n").append (indent).append ("LblMidFld: \n").append (getLblMidFld ().debug (full, true, indent + "    ")); }
        if (getLblRgtFld () != null) { str.append ("\n").append (indent).append ("LblRgtFld: \n").append (getLblRgtFld ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DvzWksGntImpl newEmptyInstance () { return (DvzWksGntImpl) newInstance (); }
    
    @Override public DvzWksGntImpl getCopy () {
        return (DvzWksGntImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (DvzWksGnt _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DvzWksGntImpl.baseUrl (); }
    public static String baseUrl () { return DvzWksGntImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DvzWksGntImpl.baseUrl = baseUrl; } 

    @Override public List<DvzWksGntFields> getFields () { return Arrays.asList (DvzWksGntFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DvzWksGntImpl
