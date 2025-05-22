package net.synergy2.db.sys.tra;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysTraMsgImpl extends SysTraMsg {

    protected SysTraMsgImpl () { super (); }

    public enum SysTraMsgFields implements ISField {
        Uid, MsgCod, MdlUid, MsgTyp, MsgIco, MsgTxt, Tsi, Tsu, Rsi, Rsu, MsgPrs;
    } // SysTraMsgFields
    
    private static String baseUrl = "/rest/sys/tra/SysTraMsg";


    @Override public String getModelClassName () { return "SysTraMsgImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public SysTraMsgImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("MsgCod[").append (getMsgCod ()).append ("] ");
        if (full) { if (Objects.nonNull (getMdlUid ())) { str.append ("MdlUid[").append (getMdlUid ()).append ("] "); } }
        if (full) { str.append ("MsgTyp[").append (getMsgTyp ()).append ("] "); }
        if (full) { str.append ("MsgIco[").append (getMsgIco ()).append ("] "); }
        str.append ("MsgTxt[").append (getMsgTxt ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { str.append ("MsgPrs[").append (getMsgPrs ()).append ("] "); }
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
        if (getMdl () != null) { str.append ("\n").append (indent).append ("Mdl: \n").append (getMdl ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysTraMsgImpl newEmptyInstance () { return (SysTraMsgImpl) newInstance (); }
    
    @Override public SysTraMsgImpl getCopy () {
        var toReturn = (SysTraMsgImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (SysTraMsg _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysTraMsgImpl.baseUrl (); }
    public static String baseUrl () { return SysTraMsgImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysTraMsgImpl.baseUrl = baseUrl; } 

    @Override public List<SysTraMsgFields> getFields () { return Arrays.asList (SysTraMsgFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysTraMsgImpl
