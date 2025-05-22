package net.synergy2.db.sys;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngDbmSeqImpl extends AngDbmSeq {

    protected AngDbmSeqImpl () { super (); }

    public enum AngDbmSeqFields implements ISField {
        Uid, DbmSeqNam, SeqAls, SeqStr, SeqStp, SeqRstTyp, SeqRstTse, PrsUid, Tsi, Tsu, Rsi, Rsu;
    } // AngDbmSeqFields
    
    private static String baseUrl = "/rest/sys/AngDbmSeq";


    @Override public String getModelClassName () { return "AngDbmSeqImpl"; }




    
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
        str.append ("DbmSeqNam[").append (getDbmSeqNam ()).append ("] ");
        str.append ("SeqAls[").append (getSeqAls ()).append ("] ");
        if (full) { str.append ("SeqStr[").append (getSeqStr ()).append ("] "); }
        if (full) { str.append ("SeqStp[").append (getSeqStp ()).append ("] "); }
        if (full) { if (Objects.nonNull (getSeqRstTyp ())) { str.append ("SeqRstTyp[").append (getSeqRstTyp ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getSeqRstTse ())) { str.append ("SeqRstTse[").append (getSeqRstTse ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getPrsUid ())) { str.append ("PrsUid[").append (getPrsUid ()).append ("] "); } }
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
        if (getColLst () != null) { str.append ("\n").append (indent).append ("ColLst (").append (getColLst ().size ()).append ("):"); for (var model : getColLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getPrs () != null) { str.append ("\n").append (indent).append ("Prs: \n").append (getPrs ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngDbmSeqImpl newEmptyInstance () { return (AngDbmSeqImpl) newInstance (); }
    
    @Override public AngDbmSeqImpl getCopy () {
        return (AngDbmSeqImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngDbmSeq _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngDbmSeqImpl.baseUrl (); }
    public static String baseUrl () { return AngDbmSeqImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngDbmSeqImpl.baseUrl = baseUrl; } 

    @Override public List<AngDbmSeqFields> getFields () { return Arrays.asList (AngDbmSeqFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngDbmSeqImpl
