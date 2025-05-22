package net.synergy2.db.sys.mnc;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class MncNotImpl extends MncNot {

    protected MncNotImpl () { super (); }

    public enum MncNotFields implements ISField {
        Uid, ResUid, TypUid, FlgUrg, NotPrm, TssRed, TblUidRef, RecUidRef, NotTit, NotMsg, NotTypLnk, Tsi, Tsu, Rsi, Rsu, SndMai, SndBot, SndApp, SndWeb, NotSev, NumAtt, SndPsh;
    } // MncNotFields
    
    private static String baseUrl = "/rest/sys/mnc/MncNot";


    @Override public String getModelClassName () { return "MncNotImpl"; }




    
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
        if (full) { str.append ("ResUid[").append (getResUid ()).append ("] "); }
        if (full) { str.append ("TypUid[").append (getTypUid ()).append ("] "); }
        if (full) { str.append ("FlgUrg[").append (getFlgUrg ()).append ("] "); }
        if (full) { if (Objects.nonNull (getNotPrm ())) { str.append ("NotPrm[").append (getNotPrm ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTssRed ())) { str.append ("TssRed[").append (getTssRed ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTblUidRef ())) { str.append ("TblUidRef[").append (getTblUidRef ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRecUidRef ())) { str.append ("RecUidRef[").append (getRecUidRef ()).append ("] "); } }
        if (full) { str.append ("NotTit[").append (getNotTit ()).append ("] "); }
        if (full) { if (Objects.nonNull (getNotMsg ())) { str.append ("NotMsg[").append (getNotMsg ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getNotTypLnk ())) { str.append ("NotTypLnk[").append (getNotTypLnk ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { str.append ("SndMai[").append (getSndMai ()).append ("] "); }
        if (full) { str.append ("SndBot[").append (getSndBot ()).append ("] "); }
        if (full) { str.append ("SndApp[").append (getSndApp ()).append ("] "); }
        if (full) { str.append ("SndWeb[").append (getSndWeb ()).append ("] "); }
        if (full) { str.append ("NotSev[").append (getNotSev ()).append ("] "); }
        if (full) { str.append ("NumAtt[").append (getNumAtt ()).append ("] "); }
        if (full) { str.append ("SndPsh[").append (getSndPsh ()).append ("] "); }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getQueNotLst () != null) { str.append ("\n").append (indent).append ("QueNotLst (").append (getQueNotLst ().size ()).append ("):"); for (var model : getQueNotLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEtyAttNotLst () != null) { str.append ("\n").append (indent).append ("EtyAttNotLst (").append (getEtyAttNotLst ().size ()).append ("):"); for (var model : getEtyAttNotLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        if (getTyp () != null) { str.append ("\n").append (indent).append ("Typ: \n").append (getTyp ().debug (full, true, indent + "    ")); }
        if (getTbl () != null) { str.append ("\n").append (indent).append ("Tbl: \n").append (getTbl ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public MncNotImpl newEmptyInstance () { return (MncNotImpl) newInstance (); }
    
    @Override public MncNotImpl getCopy () {
        return (MncNotImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (MncNot _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return MncNotImpl.baseUrl (); }
    public static String baseUrl () { return MncNotImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { MncNotImpl.baseUrl = baseUrl; } 

    @Override public List<MncNotFields> getFields () { return Arrays.asList (MncNotFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // MncNotImpl
