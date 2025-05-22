package net.synergy2.db.sys.mnc;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngResNotTypImpl extends AngResNotTyp {

    protected AngResNotTypImpl () { super (); }

    public enum AngResNotTypFields implements ISField {
        Uid, ResUid, NotTypUid, SndMai, SndBot, SndApp, SndWeb, Tsi, Tsu, Rsi, Rsu, SndPsh;
    } // AngResNotTypFields
    
    private static String baseUrl = "/rest/sys/mnc/AngResNotTyp";


    @Override public String getModelClassName () { return "AngResNotTypImpl"; }




    
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
        str.append ("ResUid[").append (getResUid ()).append ("] ");
        str.append ("NotTypUid[").append (getNotTypUid ()).append ("] ");
        if (full) { str.append ("SndMai[").append (getSndMai ()).append ("] "); }
        if (full) { str.append ("SndBot[").append (getSndBot ()).append ("] "); }
        if (full) { str.append ("SndApp[").append (getSndApp ()).append ("] "); }
        if (full) { str.append ("SndWeb[").append (getSndWeb ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { str.append ("SndPsh[").append (getSndPsh ()).append ("] "); }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        if (getNotTyp () != null) { str.append ("\n").append (indent).append ("NotTyp: \n").append (getNotTyp ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngResNotTypImpl newEmptyInstance () { return (AngResNotTypImpl) newInstance (); }
    
    @Override public AngResNotTypImpl getCopy () {
        return (AngResNotTypImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngResNotTyp _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngResNotTypImpl.baseUrl (); }
    public static String baseUrl () { return AngResNotTypImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngResNotTypImpl.baseUrl = baseUrl; } 

    @Override public List<AngResNotTypFields> getFields () { return Arrays.asList (AngResNotTypFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngResNotTypImpl
