package net.synergy2.db.sys.mnc;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngCntTypImpl extends AngCntTyp {

    protected AngCntTypImpl () { super (); }

    public enum AngCntTypFields implements ISField {
        Uid, TypNam, TypDsc, TypIco, TypClr, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // AngCntTypFields
    
    private static String baseUrl = "/rest/sys/mnc/AngCntTyp";


    @Override public String getModelClassName () { return "AngCntTypImpl"; }




    
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
        str.append ("TypNam[").append (getTypNam ()).append ("] ");
        str.append ("TypDsc[").append (getTypDsc ()).append ("] ");
        if (full) { str.append ("TypIco[").append (getTypIco ()).append ("] "); }
        if (full) { str.append ("TypClr[").append (getTypClr ()).append ("] "); }
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
        if (getCntLst () != null) { str.append ("\n").append (indent).append ("CntLst (").append (getCntLst ().size ()).append ("):"); for (var model : getCntLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngCntTypImpl newEmptyInstance () { return (AngCntTypImpl) newInstance (); }
    
    @Override public AngCntTypImpl getCopy () {
        return (AngCntTypImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngCntTyp _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngCntTypImpl.baseUrl (); }
    public static String baseUrl () { return AngCntTypImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngCntTypImpl.baseUrl = baseUrl; } 

    @Override public List<AngCntTypFields> getFields () { return Arrays.asList (AngCntTypFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngCntTypImpl
