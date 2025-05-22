package net.synergy2.db.sys.ety;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngEtyImpl extends AngEty {

    protected AngEtyImpl () { super (); }

    public enum AngEtyFields implements ISField {
        Uid, TblUidRef, NumInnLnk, NumOutLnk, NumCom, NumExtLnk, NumLik, NumMen, RecUidRef, NumAtt, NumWtc, Tsi, Tsu, Rsi, Rsu;
    } // AngEtyFields
    
    private static String baseUrl = "/rest/sys/ety/AngEty";


    @Override public String getModelClassName () { return "AngEtyImpl"; }




    
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
        str.append ("TblUidRef[").append (getTblUidRef ()).append ("] ");
        if (full) { str.append ("NumInnLnk[").append (getNumInnLnk ()).append ("] "); }
        if (full) { str.append ("NumOutLnk[").append (getNumOutLnk ()).append ("] "); }
        if (full) { str.append ("NumCom[").append (getNumCom ()).append ("] "); }
        if (full) { str.append ("NumExtLnk[").append (getNumExtLnk ()).append ("] "); }
        if (full) { str.append ("NumLik[").append (getNumLik ()).append ("] "); }
        if (full) { str.append ("NumMen[").append (getNumMen ()).append ("] "); }
        str.append ("RecUidRef[").append (getRecUidRef ()).append ("] ");
        if (full) { str.append ("NumAtt[").append (getNumAtt ()).append ("] "); }
        if (full) { str.append ("NumWtc[").append (getNumWtc ()).append ("] "); }
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
        if (getEvt () != null) { str.append ("\n").append (indent).append ("Evt : "); str.append ("\n").append (getEvt ().debug (full, true, indent + "    ")); } 
        if (getEtyTrgLst () != null) { str.append ("\n").append (indent).append ("EtyTrgLst (").append (getEtyTrgLst ().size ()).append ("):"); for (var model : getEtyTrgLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEtySrcLst () != null) { str.append ("\n").append (indent).append ("EtySrcLst (").append (getEtySrcLst ().size ()).append ("):"); for (var model : getEtySrcLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getComLst () != null) { str.append ("\n").append (indent).append ("ComLst (").append (getComLst ().size ()).append ("):"); for (var model : getComLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getExtLnkLst () != null) { str.append ("\n").append (indent).append ("ExtLnkLst (").append (getExtLnkLst ().size ()).append ("):"); for (var model : getExtLnkLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLikLst () != null) { str.append ("\n").append (indent).append ("LikLst (").append (getLikLst ().size ()).append ("):"); for (var model : getLikLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getMenLst () != null) { str.append ("\n").append (indent).append ("MenLst (").append (getMenLst ().size ()).append ("):"); for (var model : getMenLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAttLst () != null) { str.append ("\n").append (indent).append ("AttLst (").append (getAttLst ().size ()).append ("):"); for (var model : getAttLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWtcLst () != null) { str.append ("\n").append (indent).append ("WtcLst (").append (getWtcLst ().size ()).append ("):"); for (var model : getWtcLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDocLst () != null) { str.append ("\n").append (indent).append ("DocLst (").append (getDocLst ().size ()).append ("):"); for (var model : getDocLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRepMdlLngLst () != null) { str.append ("\n").append (indent).append ("RepMdlLngLst (").append (getRepMdlLngLst ().size ()).append ("):"); for (var model : getRepMdlLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getTbl () != null) { str.append ("\n").append (indent).append ("Tbl: \n").append (getTbl ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngEtyImpl newEmptyInstance () { return (AngEtyImpl) newInstance (); }
    
    @Override public AngEtyImpl getCopy () {
        return (AngEtyImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngEty _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngEtyImpl.baseUrl (); }
    public static String baseUrl () { return AngEtyImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngEtyImpl.baseUrl = baseUrl; } 

    @Override public List<AngEtyFields> getFields () { return Arrays.asList (AngEtyFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngEtyImpl
