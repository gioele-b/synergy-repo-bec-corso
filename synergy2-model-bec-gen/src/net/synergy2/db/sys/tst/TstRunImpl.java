package net.synergy2.db.sys.tst;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class TstRunImpl extends TstRun {

    protected TstRunImpl () { super (); }

    public enum TstRunFields implements ISField {
        Uid, RunDsc, ResUid, NumTot, NumSuc, Tss, Tse, Tms, Tsi, Tsu, Rsi, Rsu, TstEnvNam;
    } // TstRunFields
    
    private static String baseUrl = "/rest/sys/tst/TstRun";


    @Override public String getModelClassName () { return "TstRunImpl"; }




    
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
        str.append ("RunDsc[").append (getRunDsc ()).append ("] ");
        if (full) { str.append ("ResUid[").append (getResUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getNumTot ())) { str.append ("NumTot[").append (getNumTot ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getNumSuc ())) { str.append ("NumSuc[").append (getNumSuc ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTss ())) { str.append ("Tss[").append (getTss ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTse ())) { str.append ("Tse[").append (getTse ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTms ())) { str.append ("Tms[").append (getTms ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { str.append ("TstEnvNam[").append (getTstEnvNam ()).append ("] "); }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getTstLst () != null) { str.append ("\n").append (indent).append ("TstLst (").append (getTstLst ().size ()).append ("):"); for (var model : getTstLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public TstRunImpl newEmptyInstance () { return (TstRunImpl) newInstance (); }
    
    @Override public TstRunImpl getCopy () {
        return (TstRunImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (TstRun _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return TstRunImpl.baseUrl (); }
    public static String baseUrl () { return TstRunImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { TstRunImpl.baseUrl = baseUrl; } 

    @Override public List<TstRunFields> getFields () { return Arrays.asList (TstRunFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // TstRunImpl
