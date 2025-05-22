package net.synergy2.db.sys.itm;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngItmCls008Impl extends AngItmCls008 {

    protected AngItmCls008Impl () { super (); }

    public enum AngItmCls008Fields implements ISField {
        Uid, ClsCod, ClsDsc, ClsSrt, ClsIco, ClsClr, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // AngItmCls008Fields
    
    private static String baseUrl = "/rest/sys/itm/AngItmCls008";


    @Override public String getModelClassName () { return "AngItmCls008Impl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngItmCls008Impl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("ClsCod[").append (getClsCod ()).append ("] ");
        str.append ("ClsDsc[").append (getClsDsc ()).append ("] ");
        if (full) { str.append ("ClsSrt[").append (getClsSrt ()).append ("] "); }
        if (full) { if (Objects.nonNull (getClsIco ())) { str.append ("ClsIco[").append (getClsIco ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsClr ())) { str.append ("ClsClr[").append (getClsClr ()).append ("] "); } }
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
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getClsLst () != null) { str.append ("\n").append (indent).append ("ClsLst (").append (getClsLst ().size ()).append ("):"); for (var model : getClsLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getClsRefLst () != null) { str.append ("\n").append (indent).append ("ClsRefLst (").append (getClsRefLst ().size ()).append ("):"); for (var model : getClsRefLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getItmLst () != null) { str.append ("\n").append (indent).append ("ItmLst (").append (getItmLst ().size ()).append ("):"); for (var model : getItmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRecRulLst () != null) { str.append ("\n").append (indent).append ("RecRulLst (").append (getRecRulLst ().size ()).append ("):"); for (var model : getRecRulLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngItmCls008Impl newEmptyInstance () { return (AngItmCls008Impl) newInstance (); }
    
    @Override public AngItmCls008Impl getCopy () {
        var toReturn = (AngItmCls008Impl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngItmCls008 _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngItmCls008Impl.baseUrl (); }
    public static String baseUrl () { return AngItmCls008Impl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngItmCls008Impl.baseUrl = baseUrl; } 

    @Override public List<AngItmCls008Fields> getFields () { return Arrays.asList (AngItmCls008Fields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngItmCls008Impl
