package net.synergy2.db.sys.jst;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class JstJobImpl extends JstJob {

    protected JstJobImpl () { super (); }

    public enum JstJobFields implements ISField {
        Uid, JobCod, JobDsc, GrpUid, FlgEnb, JobCls, MinDly, ResUid, LngUid, JobKepSts, JobKepLog, JobKepErr, JobSrcDep, JobSrcCod, EtyUid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // JstJobFields
    
    private static String baseUrl = "/rest/sys/jst/JstJob";


    @Override public String getModelClassName () { return "JstJobImpl"; }




    
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
        str.append ("JobCod[").append (getJobCod ()).append ("] ");
        str.append ("JobDsc[").append (getJobDsc ()).append ("] ");
        if (full) { str.append ("GrpUid[").append (getGrpUid ()).append ("] "); }
        if (full) { str.append ("FlgEnb[").append (getFlgEnb ()).append ("] "); }
        if (full) { str.append ("JobCls[").append (getJobCls ()).append ("] "); }
        if (full) { str.append ("MinDly[").append (getMinDly ()).append ("] "); }
        if (full) { str.append ("ResUid[").append (getResUid ()).append ("] "); }
        if (full) { str.append ("LngUid[").append (getLngUid ()).append ("] "); }
        if (full) { str.append ("JobKepSts[").append (getJobKepSts ()).append ("] "); }
        if (full) { str.append ("JobKepLog[").append (getJobKepLog ()).append ("] "); }
        if (full) { str.append ("JobKepErr[").append (getJobKepErr ()).append ("] "); }
        if (full) { if (Objects.nonNull (getJobSrcDep ())) { str.append ("JobSrcDep[").append (getJobSrcDep ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getJobSrcCod ())) { str.append ("JobSrcCod[").append (getJobSrcCod ()).append ("] "); } }
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
        if (getSta () != null) { str.append ("\n").append (indent).append ("Sta : "); str.append ("\n").append (getSta ().debug (full, true, indent + "    ")); } 
        if (getPrmLst () != null) { str.append ("\n").append (indent).append ("PrmLst (").append (getPrmLst ().size ()).append ("):"); for (var model : getPrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getLogLst () != null) { str.append ("\n").append (indent).append ("LogLst (").append (getLogLst ().size ()).append ("):"); for (var model : getLogLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getTrgLst () != null) { str.append ("\n").append (indent).append ("TrgLst (").append (getTrgLst ().size ()).append ("):"); for (var model : getTrgLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getGrp () != null) { str.append ("\n").append (indent).append ("Grp: \n").append (getGrp ().debug (full, true, indent + "    ")); }
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        if (getLng () != null) { str.append ("\n").append (indent).append ("Lng: \n").append (getLng ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public JstJobImpl newEmptyInstance () { return (JstJobImpl) newInstance (); }
    
    @Override public JstJobImpl getCopy () {
        return (JstJobImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (JstJob _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return JstJobImpl.baseUrl (); }
    public static String baseUrl () { return JstJobImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { JstJobImpl.baseUrl = baseUrl; } 

    @Override public List<JstJobFields> getFields () { return Arrays.asList (JstJobFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // JstJobImpl
