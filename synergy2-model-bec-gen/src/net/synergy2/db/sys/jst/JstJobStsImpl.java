package net.synergy2.db.sys.jst;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class JstJobStsImpl extends JstJobSts {

    protected JstJobStsImpl () { super (); }

    public enum JstJobStsFields implements ISField {
        Uid, LstTss, LstTrgUid, LstSts, LstTim, FaiTss, FaiTrgUid, MaxTss, MaxTrgUid, MaxTim, TotExe, TotFai, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // JstJobStsFields
    
    private static String baseUrl = "/rest/sys/jst/JstJobSts";


    @Override public String getModelClassName () { return "JstJobStsImpl"; }




    
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
        if (full) { if (Objects.nonNull (getLstTss ())) { str.append ("LstTss[").append (getLstTss ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLstTrgUid ())) { str.append ("LstTrgUid[").append (getLstTrgUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLstSts ())) { str.append ("LstSts[").append (getLstSts ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLstTim ())) { str.append ("LstTim[").append (getLstTim ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFaiTss ())) { str.append ("FaiTss[").append (getFaiTss ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFaiTrgUid ())) { str.append ("FaiTrgUid[").append (getFaiTrgUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getMaxTss ())) { str.append ("MaxTss[").append (getMaxTss ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getMaxTrgUid ())) { str.append ("MaxTrgUid[").append (getMaxTrgUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getMaxTim ())) { str.append ("MaxTim[").append (getMaxTim ()).append ("] "); } }
        if (full) { str.append ("TotExe[").append (getTotExe ()).append ("] "); }
        if (full) { str.append ("TotFai[").append (getTotFai ()).append ("] "); }
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
        if (getJob () != null) { str.append ("\n").append (indent).append ("Job: \n").append (getJob ().debug (full, true, indent + "    ")); }
        if (getLstTrg () != null) { str.append ("\n").append (indent).append ("LstTrg: \n").append (getLstTrg ().debug (full, true, indent + "    ")); }
        if (getFaiTrg () != null) { str.append ("\n").append (indent).append ("FaiTrg: \n").append (getFaiTrg ().debug (full, true, indent + "    ")); }
        if (getMaxTrg () != null) { str.append ("\n").append (indent).append ("MaxTrg: \n").append (getMaxTrg ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public JstJobStsImpl newEmptyInstance () { return (JstJobStsImpl) newInstance (); }
    
    @Override public JstJobStsImpl getCopy () {
        return (JstJobStsImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (JstJobSts _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return JstJobStsImpl.baseUrl (); }
    public static String baseUrl () { return JstJobStsImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { JstJobStsImpl.baseUrl = baseUrl; } 

    @Override public List<JstJobStsFields> getFields () { return Arrays.asList (JstJobStsFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // JstJobStsImpl
