package net.synergy2.db.sys;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngDbmDicImpl extends AngDbmDic {

    protected AngDbmDicImpl () { super (); }

    public enum AngDbmDicFields implements ISField {
        DbmDicColNam, ColTyp, ColSizPri, ColSizSec, ColDefVal, Tsi, Tsu, Rsi, Rsu;
    } // AngDbmDicFields
    
    private static String baseUrl = "/rest/sys/AngDbmDic";


    @Override public String getModelClassName () { return "AngDbmDicImpl"; }




    
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
        str.append ("DbmDicColNam[").append (getDbmDicColNam ()).append ("] ");
        if (full) { str.append ("ColTyp[").append (getColTyp ()).append ("] "); }
        if (full) { if (Objects.nonNull (getColSizPri ())) { str.append ("ColSizPri[").append (getColSizPri ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getColSizSec ())) { str.append ("ColSizSec[").append (getColSizSec ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getColDefVal ())) { str.append ("ColDefVal[").append (getColDefVal ()).append ("] "); } }
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
        if (getColLst () != null) { str.append ("\n").append (indent).append ("ColLst (").append (getColLst ().size ()).append ("):"); for (var model : getColLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getDbmDicColNam ().replace ("*", "**").replace ("#", "*#"); }

    @Override public AngDbmDicImpl newEmptyInstance () { return (AngDbmDicImpl) newInstance (); }
    
    @Override public AngDbmDicImpl getCopy () {
        return (AngDbmDicImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngDbmDic _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngDbmDicImpl.baseUrl (); }
    public static String baseUrl () { return AngDbmDicImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngDbmDicImpl.baseUrl = baseUrl; } 

    @Override public List<AngDbmDicFields> getFields () { return Arrays.asList (AngDbmDicFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngDbmDicImpl
