package net.synergy2.db.sys.jst;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class JstTrgImpl extends JstTrg {

    protected JstTrgImpl () { super (); }

    public enum JstTrgFields implements ISField {
        Uid, TrgCod, TrgDsc, GrpUid, FlgEnb, TrgPri, TrgTyp, TrgCrnExp, TrgRepInt, TrgRepNum, EtyUid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // JstTrgFields
    
    private static String baseUrl = "/rest/sys/jst/JstTrg";


    @Override public String getModelClassName () { return "JstTrgImpl"; }




    
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
        str.append ("TrgCod[").append (getTrgCod ()).append ("] ");
        str.append ("TrgDsc[").append (getTrgDsc ()).append ("] ");
        if (full) { str.append ("GrpUid[").append (getGrpUid ()).append ("] "); }
        if (full) { str.append ("FlgEnb[").append (getFlgEnb ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTrgPri ())) { str.append ("TrgPri[").append (getTrgPri ()).append ("] "); } }
        if (full) { str.append ("TrgTyp[").append (getTrgTyp ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTrgCrnExp ())) { str.append ("TrgCrnExp[").append (getTrgCrnExp ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTrgRepInt ())) { str.append ("TrgRepInt[").append (getTrgRepInt ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTrgRepNum ())) { str.append ("TrgRepNum[").append (getTrgRepNum ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getStsLstLst () != null) { str.append ("\n").append (indent).append ("StsLstLst (").append (getStsLstLst ().size ()).append ("):"); for (var model : getStsLstLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getStsFaiLst () != null) { str.append ("\n").append (indent).append ("StsFaiLst (").append (getStsFaiLst ().size ()).append ("):"); for (var model : getStsFaiLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getStsMaxLst () != null) { str.append ("\n").append (indent).append ("StsMaxLst (").append (getStsMaxLst ().size ()).append ("):"); for (var model : getStsMaxLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getJobLst () != null) { str.append ("\n").append (indent).append ("JobLst (").append (getJobLst ().size ()).append ("):"); for (var model : getJobLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getGrp () != null) { str.append ("\n").append (indent).append ("Grp: \n").append (getGrp ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public JstTrgImpl newEmptyInstance () { return (JstTrgImpl) newInstance (); }
    
    @Override public JstTrgImpl getCopy () {
        return (JstTrgImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (JstTrg _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return JstTrgImpl.baseUrl (); }
    public static String baseUrl () { return JstTrgImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { JstTrgImpl.baseUrl = baseUrl; } 

    @Override public List<JstTrgFields> getFields () { return Arrays.asList (JstTrgFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // JstTrgImpl
