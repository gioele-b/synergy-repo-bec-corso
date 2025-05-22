package net.synergy2.db.sys.uif;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysFrmDsgImpl extends SysFrmDsg {

    protected SysFrmDsgImpl () { super (); }

    public enum SysFrmDsgFields implements ISField {
        Uid, DsgCod, DsgDsc, DsgAppRef, Tsi, Tsu, Rsi, Rsu, HidCfg;
    } // SysFrmDsgFields
    
    private static String baseUrl = "/rest/sys/uif/SysFrmDsg";


    @Override public String getModelClassName () { return "SysFrmDsgImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public SysFrmDsgImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("DsgCod[").append (getDsgCod ()).append ("] ");
        str.append ("DsgDsc[").append (getDsgDsc ()).append ("] ");
        if (full) { str.append ("DsgAppRef[").append (getDsgAppRef ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { str.append ("HidCfg[").append (getHidCfg ()).append ("] "); }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDocClsCtxLst () != null) { str.append ("\n").append (indent).append ("DocClsCtxLst (").append (getDocClsCtxLst ().size ()).append ("):"); for (var model : getDocClsCtxLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSrvTypLst () != null) { str.append ("\n").append (indent).append ("SrvTypLst (").append (getSrvTypLst ().size ()).append ("):"); for (var model : getSrvTypLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDsgTabLst () != null) { str.append ("\n").append (indent).append ("DsgTabLst (").append (getDsgTabLst ().size ()).append ("):"); for (var model : getDsgTabLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getFldFrmLst () != null) { str.append ("\n").append (indent).append ("FldFrmLst (").append (getFldFrmLst ().size ()).append ("):"); for (var model : getFldFrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getApp () != null) { str.append ("\n").append (indent).append ("App: \n").append (getApp ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysFrmDsgImpl newEmptyInstance () { return (SysFrmDsgImpl) newInstance (); }
    
    @Override public SysFrmDsgImpl getCopy () {
        var toReturn = (SysFrmDsgImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (SysFrmDsg _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysFrmDsgImpl.baseUrl (); }
    public static String baseUrl () { return SysFrmDsgImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysFrmDsgImpl.baseUrl = baseUrl; } 

    @Override public List<SysFrmDsgFields> getFields () { return Arrays.asList (SysFrmDsgFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysFrmDsgImpl
