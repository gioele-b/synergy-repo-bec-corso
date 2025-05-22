package net.synergy2.db.sys;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngPrsImpl extends AngPrs {

    protected AngPrsImpl () { super (); }

    public enum AngPrsFields implements ISField {
        Uid, PrsCod, PrsDsc, PrsAtr, PrsUidRef, MdlUid, Tsi, Tsu, Rsi, Rsu;
    } // AngPrsFields
    
    private static String baseUrl = "/rest/sys/AngPrs";


    @Override public String getModelClassName () { return "AngPrsImpl"; }




    
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
        str.append ("PrsCod[").append (getPrsCod ()).append ("] ");
        str.append ("PrsDsc[").append (getPrsDsc ()).append ("] ");
        if (full) { str.append ("PrsAtr[").append (getPrsAtr ()).append ("] "); }
        if (full) { if (Objects.nonNull (getPrsUidRef ())) { str.append ("PrsUidRef[").append (getPrsUidRef ()).append ("] "); } }
        if (full) { str.append ("MdlUid[").append (getMdlUid ()).append ("] "); }
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
        if (getChdPrsLst () != null) { str.append ("\n").append (indent).append ("ChdPrsLst (").append (getChdPrsLst ().size ()).append ("):"); for (var model : getChdPrsLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getTblLst () != null) { str.append ("\n").append (indent).append ("TblLst (").append (getTblLst ().size ()).append ("):"); for (var model : getTblLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getSeqLst () != null) { str.append ("\n").append (indent).append ("SeqLst (").append (getSeqLst ().size ()).append ("):"); for (var model : getSeqLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getColLst () != null) { str.append ("\n").append (indent).append ("ColLst (").append (getColLst ().size ()).append ("):"); for (var model : getColLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRfkLst () != null) { str.append ("\n").append (indent).append ("RfkLst (").append (getRfkLst ().size ()).append ("):"); for (var model : getRfkLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWzdLst () != null) { str.append ("\n").append (indent).append ("WzdLst (").append (getWzdLst ().size ()).append ("):"); for (var model : getWzdLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getMdlRef () != null) { str.append ("\n").append (indent).append ("MdlRef: \n").append (getMdlRef ().debug (full, true, indent + "    ")); }
        if (getPrtPrs () != null) { str.append ("\n").append (indent).append ("PrtPrs: \n").append (getPrtPrs ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngPrsImpl newEmptyInstance () { return (AngPrsImpl) newInstance (); }
    
    @Override public AngPrsImpl getCopy () {
        return (AngPrsImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngPrs _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngPrsImpl.baseUrl (); }
    public static String baseUrl () { return AngPrsImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngPrsImpl.baseUrl = baseUrl; } 

    @Override public List<AngPrsFields> getFields () { return Arrays.asList (AngPrsFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngPrsImpl
