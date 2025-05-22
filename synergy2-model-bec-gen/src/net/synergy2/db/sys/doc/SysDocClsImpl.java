package net.synergy2.db.sys.doc;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysDocClsImpl extends SysDocCls {

    protected SysDocClsImpl () { super (); }

    public enum SysDocClsFields implements ISField {
        Uid, DocClsDsc, RemOrg, RemSpc, RemDocCls, DocClsIco, DocClsClr, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // SysDocClsFields
    
    private static String baseUrl = "/rest/sys/doc/SysDocCls";


    @Override public String getModelClassName () { return "SysDocClsImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public SysDocClsImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("DocClsDsc[").append (getDocClsDsc ()).append ("] ");
        if (Objects.nonNull (getRemOrg ())) { str.append ("RemOrg[").append (getRemOrg ()).append ("] "); }
        if (Objects.nonNull (getRemSpc ())) { str.append ("RemSpc[").append (getRemSpc ()).append ("] "); }
        str.append ("RemDocCls[").append (getRemDocCls ()).append ("] ");
        if (full) { if (Objects.nonNull (getDocClsIco ())) { str.append ("DocClsIco[").append (getDocClsIco ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDocClsClr ())) { str.append ("DocClsClr[").append (getDocClsClr ()).append ("] "); } }
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
        if (getExtLst () != null) { str.append ("\n").append (indent).append ("ExtLst (").append (getExtLst ().size ()).append ("):"); for (var model : getExtLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAttLst () != null) { str.append ("\n").append (indent).append ("AttLst (").append (getAttLst ().size ()).append ("):"); for (var model : getAttLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDocCtxLst () != null) { str.append ("\n").append (indent).append ("DocCtxLst (").append (getDocCtxLst ().size ()).append ("):"); for (var model : getDocCtxLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDocLst () != null) { str.append ("\n").append (indent).append ("DocLst (").append (getDocLst ().size ()).append ("):"); for (var model : getDocLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysDocClsImpl newEmptyInstance () { return (SysDocClsImpl) newInstance (); }
    
    @Override public SysDocClsImpl getCopy () {
        var toReturn = (SysDocClsImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (SysDocCls _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return SysDocClsImpl.baseUrl (); }
    public static String baseUrl () { return SysDocClsImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysDocClsImpl.baseUrl = baseUrl; } 

    @Override public List<SysDocClsFields> getFields () { return Arrays.asList (SysDocClsFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysDocClsImpl
