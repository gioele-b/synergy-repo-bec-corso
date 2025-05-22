package net.synergy2.db.sys.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysWksBtnImpl extends SysWksBtn {

    protected SysWksBtnImpl () { super (); }

    public enum SysWksBtnFields implements ISField {
        Uid, WksUid, WksWdgUid, BtnRefUid, BtnDsc, BtnIco, BtnSrt, Tsi, Tsu, Rsi, Rsu;
    } // SysWksBtnFields
    
    private static String baseUrl = "/rest/sys/wks/SysWksBtn";


    @Override public String getModelClassName () { return "SysWksBtnImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public SysWksBtnImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("WksUid[").append (getWksUid ()).append ("] ");
        if (Objects.nonNull (getWksWdgUid ())) { str.append ("WksWdgUid[").append (getWksWdgUid ()).append ("] "); }
        if (Objects.nonNull (getBtnRefUid ())) { str.append ("BtnRefUid[").append (getBtnRefUid ()).append ("] "); }
        str.append ("BtnDsc[").append (getBtnDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getBtnIco ())) { str.append ("BtnIco[").append (getBtnIco ()).append ("] "); } }
        str.append ("BtnSrt[").append (getBtnSrt ()).append ("] ");
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
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getBtnLst () != null) { str.append ("\n").append (indent).append ("BtnLst (").append (getBtnLst ().size ()).append ("):"); for (var model : getBtnLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getBtnActLst () != null) { str.append ("\n").append (indent).append ("BtnActLst (").append (getBtnActLst ().size ()).append ("):"); for (var model : getBtnActLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWks () != null) { str.append ("\n").append (indent).append ("Wks: \n").append (getWks ().debug (full, true, indent + "    ")); }
        if (getWdg () != null) { str.append ("\n").append (indent).append ("Wdg: \n").append (getWdg ().debug (full, true, indent + "    ")); }
        if (getBtn () != null) { str.append ("\n").append (indent).append ("Btn: \n").append (getBtn ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysWksBtnImpl newEmptyInstance () { return (SysWksBtnImpl) newInstance (); }
    
    @Override public SysWksBtnImpl getCopy () {
        var toReturn = (SysWksBtnImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (SysWksBtn _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysWksBtnImpl.baseUrl (); }
    public static String baseUrl () { return SysWksBtnImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysWksBtnImpl.baseUrl = baseUrl; } 

    @Override public List<SysWksBtnFields> getFields () { return Arrays.asList (SysWksBtnFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysWksBtnImpl
