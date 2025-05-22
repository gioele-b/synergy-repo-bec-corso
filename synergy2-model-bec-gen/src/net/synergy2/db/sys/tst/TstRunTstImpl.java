package net.synergy2.db.sys.tst;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class TstRunTstImpl extends TstRunTst {

    protected TstRunTstImpl () { super (); }

    public enum TstRunTstFields implements ISField {
        Uid, RunUid, TstApp, TstTit, TstCls, TstSuc, Tms, NumErr, TstTyp, Tsi, Tsu, Rsi, Rsu;
    } // TstRunTstFields
    
    private static String baseUrl = "/rest/sys/tst/TstRunTst";


    @Override public String getModelClassName () { return "TstRunTstImpl"; }




    
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
        if (full) { str.append ("RunUid[").append (getRunUid ()).append ("] "); }
        if (full) { str.append ("TstApp[").append (getTstApp ()).append ("] "); }
        if (full) { str.append ("TstTit[").append (getTstTit ()).append ("] "); }
        str.append ("TstCls[").append (getTstCls ()).append ("] ");
        if (full) { str.append ("TstSuc[").append (getTstSuc ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTms ())) { str.append ("Tms[").append (getTms ()).append ("] "); } }
        if (full) { str.append ("NumErr[").append (getNumErr ()).append ("] "); }
        if (full) { str.append ("TstTyp[").append (getTstTyp ()).append ("] "); }
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
        if (getTstRun () != null) { str.append ("\n").append (indent).append ("TstRun: \n").append (getTstRun ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public TstRunTstImpl newEmptyInstance () { return (TstRunTstImpl) newInstance (); }
    
    @Override public TstRunTstImpl getCopy () {
        return (TstRunTstImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (TstRunTst _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return TstRunTstImpl.baseUrl (); }
    public static String baseUrl () { return TstRunTstImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { TstRunTstImpl.baseUrl = baseUrl; } 

    @Override public List<TstRunTstFields> getFields () { return Arrays.asList (TstRunTstFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // TstRunTstImpl
