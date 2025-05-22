package net.synergy2.db.sys.ecm;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysEcmClsImpl extends SysEcmCls {

    protected SysEcmClsImpl () { super (); }

    public enum SysEcmClsFields implements ISField {
        Uid, EcmClsCod, EcmClsDsc, Sit, DocCls, Tsi, Tsu, Rsi, Rsu;
    } // SysEcmClsFields
    
    private static String baseUrl = "/rest/sys/ecm/SysEcmCls";


    @Override public String getModelClassName () { return "SysEcmClsImpl"; }




    
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
        str.append ("EcmClsCod[").append (getEcmClsCod ()).append ("] ");
        str.append ("EcmClsDsc[").append (getEcmClsDsc ()).append ("] ");
        if (full) { str.append ("Sit[").append (getSit ()).append ("] "); }
        if (full) { str.append ("DocCls[").append (getDocCls ()).append ("] "); }
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
        if (getEcmClsQryLst () != null) { str.append ("\n").append (indent).append ("EcmClsQryLst (").append (getEcmClsQryLst ().size ()).append ("):"); for (var model : getEcmClsQryLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysEcmClsImpl newEmptyInstance () { return (SysEcmClsImpl) newInstance (); }
    
    @Override public SysEcmClsImpl getCopy () {
        return (SysEcmClsImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysEcmCls _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysEcmClsImpl.baseUrl (); }
    public static String baseUrl () { return SysEcmClsImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysEcmClsImpl.baseUrl = baseUrl; } 

    @Override public List<SysEcmClsFields> getFields () { return Arrays.asList (SysEcmClsFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysEcmClsImpl
