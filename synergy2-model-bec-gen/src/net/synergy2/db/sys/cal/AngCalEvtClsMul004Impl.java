package net.synergy2.db.sys.cal;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngCalEvtClsMul004Impl extends AngCalEvtClsMul004 {

    protected AngCalEvtClsMul004Impl () { super (); }

    public enum AngCalEvtClsMul004Fields implements ISField {
        Uid, ClsCod, ClsDsc, ClsSrt, ClsIco, ClsClr, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // AngCalEvtClsMul004Fields
    
    private static String baseUrl = "/rest/sys/cal/AngCalEvtClsMul004";


    @Override public String getModelClassName () { return "AngCalEvtClsMul004Impl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngCalEvtClsMul004Impl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngCalEvtClsMul004Impl newEmptyInstance () { return (AngCalEvtClsMul004Impl) newInstance (); }
    
    @Override public AngCalEvtClsMul004Impl getCopy () {
        var toReturn = (AngCalEvtClsMul004Impl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngCalEvtClsMul004 _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngCalEvtClsMul004Impl.baseUrl (); }
    public static String baseUrl () { return AngCalEvtClsMul004Impl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngCalEvtClsMul004Impl.baseUrl = baseUrl; } 

    @Override public List<AngCalEvtClsMul004Fields> getFields () { return Arrays.asList (AngCalEvtClsMul004Fields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngCalEvtClsMul004Impl
