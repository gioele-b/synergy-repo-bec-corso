package net.synergy2.db.sys.mnc;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngMobAppImpl extends AngMobApp {

    protected AngMobAppImpl () { super (); }

    public enum AngMobAppFields implements ISField {
        Uid, AppNam, AppTrg, AppDsc, AppIdf, AppCrtPat, AppAutTyp, AppNotMan, AppDevPrd, Tsi, Tsu, Rsi, Rsu;
    } // AngMobAppFields
    
    private static String baseUrl = "/rest/sys/mnc/AngMobApp";


    @Override public String getModelClassName () { return "AngMobAppImpl"; }




    
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
        str.append ("AppNam[").append (getAppNam ()).append ("] ");
        str.append ("AppTrg[").append (getAppTrg ()).append ("] ");
        str.append ("AppDsc[").append (getAppDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getAppIdf ())) { str.append ("AppIdf[").append (getAppIdf ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getAppCrtPat ())) { str.append ("AppCrtPat[").append (getAppCrtPat ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getAppAutTyp ())) { str.append ("AppAutTyp[").append (getAppAutTyp ()).append ("] "); } }
        if (full) { str.append ("AppNotMan[").append (getAppNotMan ()).append ("] "); }
        if (full) { str.append ("AppDevPrd[").append (getAppDevPrd ()).append ("] "); }
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
        if (getMobAppTknLst () != null) { str.append ("\n").append (indent).append ("MobAppTknLst (").append (getMobAppTknLst ().size ()).append ("):"); for (var model : getMobAppTknLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngMobAppImpl newEmptyInstance () { return (AngMobAppImpl) newInstance (); }
    
    @Override public AngMobAppImpl getCopy () {
        return (AngMobAppImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngMobApp _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngMobAppImpl.baseUrl (); }
    public static String baseUrl () { return AngMobAppImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngMobAppImpl.baseUrl = baseUrl; } 

    @Override public List<AngMobAppFields> getFields () { return Arrays.asList (AngMobAppFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngMobAppImpl
