package net.synergy2.db.sys;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngMdlImpl extends AngMdl {

    protected AngMdlImpl () { super (); }

    public enum AngMdlFields implements ISField {
        Uid, MdlCod, MdlDsc, MdlPrs, Tsi, Tsu, Rsi, Rsu;
    } // AngMdlFields
    
    private static String baseUrl = "/rest/sys/AngMdl";


    @Override public String getModelClassName () { return "AngMdlImpl"; }




    
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
        str.append ("MdlCod[").append (getMdlCod ()).append ("] ");
        str.append ("MdlDsc[").append (getMdlDsc ()).append ("] ");
        if (full) { str.append ("MdlPrs[").append (getMdlPrs ()).append ("] "); }
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
        if (getPrsLst () != null) { str.append ("\n").append (indent).append ("PrsLst (").append (getPrsLst ().size ()).append ("):"); for (var model : getPrsLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getChdMdlLst () != null) { str.append ("\n").append (indent).append ("ChdMdlLst (").append (getChdMdlLst ().size ()).append ("):"); for (var model : getChdMdlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getPrtMdlLst () != null) { str.append ("\n").append (indent).append ("PrtMdlLst (").append (getPrtMdlLst ().size ()).append ("):"); for (var model : getPrtMdlLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getTblLst () != null) { str.append ("\n").append (indent).append ("TblLst (").append (getTblLst ().size ()).append ("):"); for (var model : getTblLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getColLst () != null) { str.append ("\n").append (indent).append ("ColLst (").append (getColLst ().size ()).append ("):"); for (var model : getColLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRfkLst () != null) { str.append ("\n").append (indent).append ("RfkLst (").append (getRfkLst ().size ()).append ("):"); for (var model : getRfkLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getMsgLst () != null) { str.append ("\n").append (indent).append ("MsgLst (").append (getMsgLst ().size ()).append ("):"); for (var model : getMsgLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getMnuLst () != null) { str.append ("\n").append (indent).append ("MnuLst (").append (getMnuLst ().size ()).append ("):"); for (var model : getMnuLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngMdlImpl newEmptyInstance () { return (AngMdlImpl) newInstance (); }
    
    @Override public AngMdlImpl getCopy () {
        return (AngMdlImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngMdl _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngMdlImpl.baseUrl (); }
    public static String baseUrl () { return AngMdlImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngMdlImpl.baseUrl = baseUrl; } 

    @Override public List<AngMdlFields> getFields () { return Arrays.asList (AngMdlFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngMdlImpl
