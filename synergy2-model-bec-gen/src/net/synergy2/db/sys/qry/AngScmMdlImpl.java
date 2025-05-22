package net.synergy2.db.sys.qry;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngScmMdlImpl extends AngScmMdl {

    protected AngScmMdlImpl () { super (); }

    public enum AngScmMdlFields implements ISField {
        Uid, ScmUid, MdlCod, MdlDsc, QryFrm, QryAddFrm, QryFlt, QrySrt, ClsJav, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, QryGrpByy, QryGrpFlt;
    } // AngScmMdlFields
    
    private static String baseUrl = "/rest/sys/qry/AngScmMdl";


    @Override public String getModelClassName () { return "AngScmMdlImpl"; }




    
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
        str.append ("ScmUid[").append (getScmUid ()).append ("] ");
        str.append ("MdlCod[").append (getMdlCod ()).append ("] ");
        str.append ("MdlDsc[").append (getMdlDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getQryFrm ())) { str.append ("QryFrm[").append (getQryFrm ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getQryAddFrm ())) { str.append ("QryAddFrm[").append (getQryAddFrm ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getQryFlt ())) { str.append ("QryFlt[").append (getQryFlt ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getQrySrt ())) { str.append ("QrySrt[").append (getQrySrt ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsJav ())) { str.append ("ClsJav[").append (getClsJav ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getQryGrpByy ())) { str.append ("QryGrpByy[").append (getQryGrpByy ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getQryGrpFlt ())) { str.append ("QryGrpFlt[").append (getQryGrpFlt ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getFldLst () != null) { str.append ("\n").append (indent).append ("FldLst (").append (getFldLst ().size ()).append ("):"); for (var model : getFldLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getQryLst () != null) { str.append ("\n").append (indent).append ("QryLst (").append (getQryLst ().size ()).append ("):"); for (var model : getQryLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getScm () != null) { str.append ("\n").append (indent).append ("Scm: \n").append (getScm ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngScmMdlImpl newEmptyInstance () { return (AngScmMdlImpl) newInstance (); }
    
    @Override public AngScmMdlImpl getCopy () {
        return (AngScmMdlImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngScmMdl _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngScmMdlImpl.baseUrl (); }
    public static String baseUrl () { return AngScmMdlImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngScmMdlImpl.baseUrl = baseUrl; } 

    @Override public List<AngScmMdlFields> getFields () { return Arrays.asList (AngScmMdlFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngScmMdlImpl
