package net.synergy2.db.sys.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysWksBtnActImpl extends SysWksBtnAct {

    protected SysWksBtnActImpl () { super (); }

    public enum SysWksBtnActFields implements ISField {
        Uid, WksBtnUid, WksActUid, OpnWksUid, ActSrt, Tsi, Tsu, Rsi, Rsu, Url, AppUid, ActGrpUid, EtlJobUid;
    } // SysWksBtnActFields
    
    private static String baseUrl = "/rest/sys/wks/SysWksBtnAct";


    @Override public String getModelClassName () { return "SysWksBtnActImpl"; }




    
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
        str.append ("WksBtnUid[").append (getWksBtnUid ()).append ("] ");
        if (full) { str.append ("WksActUid[").append (getWksActUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getOpnWksUid ())) { str.append ("OpnWksUid[").append (getOpnWksUid ()).append ("] "); } }
        str.append ("ActSrt[").append (getActSrt ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getUrl ())) { str.append ("Url[").append (getUrl ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getAppUid ())) { str.append ("AppUid[").append (getAppUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getActGrpUid ())) { str.append ("ActGrpUid[").append (getActGrpUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEtlJobUid ())) { str.append ("EtlJobUid[").append (getEtlJobUid ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getEtlJobPrmLst () != null) { str.append ("\n").append (indent).append ("EtlJobPrmLst (").append (getEtlJobPrmLst ().size ()).append ("):"); for (var model : getEtlJobPrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEtlJob () != null) { str.append ("\n").append (indent).append ("EtlJob: \n").append (getEtlJob ().debug (full, true, indent + "    ")); }
        if (getBtn () != null) { str.append ("\n").append (indent).append ("Btn: \n").append (getBtn ().debug (full, true, indent + "    ")); }
        if (getAct () != null) { str.append ("\n").append (indent).append ("Act: \n").append (getAct ().debug (full, true, indent + "    ")); }
        if (getWks () != null) { str.append ("\n").append (indent).append ("Wks: \n").append (getWks ().debug (full, true, indent + "    ")); }
        if (getApp () != null) { str.append ("\n").append (indent).append ("App: \n").append (getApp ().debug (full, true, indent + "    ")); }
        if (getActGrp () != null) { str.append ("\n").append (indent).append ("ActGrp: \n").append (getActGrp ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysWksBtnActImpl newEmptyInstance () { return (SysWksBtnActImpl) newInstance (); }
    
    @Override public SysWksBtnActImpl getCopy () {
        return (SysWksBtnActImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysWksBtnAct _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysWksBtnActImpl.baseUrl (); }
    public static String baseUrl () { return SysWksBtnActImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysWksBtnActImpl.baseUrl = baseUrl; } 

    @Override public List<SysWksBtnActFields> getFields () { return Arrays.asList (SysWksBtnActFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysWksBtnActImpl
