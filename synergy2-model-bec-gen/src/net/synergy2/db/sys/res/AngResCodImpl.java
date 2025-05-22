package net.synergy2.db.sys.res;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngResCodImpl extends AngResCod {

    protected AngResCodImpl () { super (); }

    public enum AngResCodFields implements ISField {
        Uid, ResUid, App, AppCod, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // AngResCodFields
    
    private static String baseUrl = "/rest/sys/res/AngResCod";


    @Override public String getModelClassName () { return "AngResCodImpl"; }




    
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
        str.append ("ResUid[").append (getResUid ()).append ("] ");
        str.append ("App[").append (getApp ()).append ("] ");
        str.append ("AppCod[").append (getAppCod ()).append ("] ");
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
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngResCodImpl newEmptyInstance () { return (AngResCodImpl) newInstance (); }
    
    @Override public AngResCodImpl getCopy () {
        return (AngResCodImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngResCod _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngResCodImpl.baseUrl (); }
    public static String baseUrl () { return AngResCodImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngResCodImpl.baseUrl = baseUrl; } 

    @Override public List<AngResCodFields> getFields () { return Arrays.asList (AngResCodFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngResCodImpl
