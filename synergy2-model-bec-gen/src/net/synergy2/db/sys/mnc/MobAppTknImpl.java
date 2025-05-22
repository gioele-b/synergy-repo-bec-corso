package net.synergy2.db.sys.mnc;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class MobAppTknImpl extends MobAppTkn {

    protected MobAppTknImpl () { super (); }

    public enum MobAppTknFields implements ISField {
        Uid, MobAppUid, AppTkn, ResUid, LstLgn, AppVrs, DevUid, DevSysVrs, DevMdl, DevNam, AppAut, Tsi, Tsu, Rsi, Rsu;
    } // MobAppTknFields
    
    private static String baseUrl = "/rest/sys/mnc/MobAppTkn";


    @Override public String getModelClassName () { return "MobAppTknImpl"; }




    
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
        str.append ("MobAppUid[").append (getMobAppUid ()).append ("] ");
        str.append ("AppTkn[").append (getAppTkn ()).append ("] ");
        if (full) { str.append ("ResUid[").append (getResUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getLstLgn ())) { str.append ("LstLgn[").append (getLstLgn ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getAppVrs ())) { str.append ("AppVrs[").append (getAppVrs ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDevUid ())) { str.append ("DevUid[").append (getDevUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDevSysVrs ())) { str.append ("DevSysVrs[").append (getDevSysVrs ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDevMdl ())) { str.append ("DevMdl[").append (getDevMdl ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDevNam ())) { str.append ("DevNam[").append (getDevNam ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getAppAut ())) { str.append ("AppAut[").append (getAppAut ()).append ("] "); } }
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
        if (getApp () != null) { str.append ("\n").append (indent).append ("App: \n").append (getApp ().debug (full, true, indent + "    ")); }
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public MobAppTknImpl newEmptyInstance () { return (MobAppTknImpl) newInstance (); }
    
    @Override public MobAppTknImpl getCopy () {
        return (MobAppTknImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (MobAppTkn _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return MobAppTknImpl.baseUrl (); }
    public static String baseUrl () { return MobAppTknImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { MobAppTknImpl.baseUrl = baseUrl; } 

    @Override public List<MobAppTknFields> getFields () { return Arrays.asList (MobAppTknFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // MobAppTknImpl
