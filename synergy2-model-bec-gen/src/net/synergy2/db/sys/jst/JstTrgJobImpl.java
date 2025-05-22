package net.synergy2.db.sys.jst;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class JstTrgJobImpl extends JstTrgJob {

    protected JstTrgJobImpl () { super (); }

    public enum JstTrgJobFields implements ISField {
        Uid, TrgUid, JobUid, FlgEnb, Tsi, Tsu, Rsi, Rsu;
    } // JstTrgJobFields
    
    private static String baseUrl = "/rest/sys/jst/JstTrgJob";


    @Override public String getModelClassName () { return "JstTrgJobImpl"; }




    
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
        str.append ("TrgUid[").append (getTrgUid ()).append ("] ");
        str.append ("JobUid[").append (getJobUid ()).append ("] ");
        if (full) { str.append ("FlgEnb[").append (getFlgEnb ()).append ("] "); }
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
        if (getJob () != null) { str.append ("\n").append (indent).append ("Job: \n").append (getJob ().debug (full, true, indent + "    ")); }
        if (getTrg () != null) { str.append ("\n").append (indent).append ("Trg: \n").append (getTrg ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public JstTrgJobImpl newEmptyInstance () { return (JstTrgJobImpl) newInstance (); }
    
    @Override public JstTrgJobImpl getCopy () {
        return (JstTrgJobImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (JstTrgJob _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return JstTrgJobImpl.baseUrl (); }
    public static String baseUrl () { return JstTrgJobImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { JstTrgJobImpl.baseUrl = baseUrl; } 

    @Override public List<JstTrgJobFields> getFields () { return Arrays.asList (JstTrgJobFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // JstTrgJobImpl
