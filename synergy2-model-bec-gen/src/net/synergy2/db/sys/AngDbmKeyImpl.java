package net.synergy2.db.sys;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngDbmKeyImpl extends AngDbmKey {

    protected AngDbmKeyImpl () { super (); }

    public enum AngDbmKeyFields implements ISField {
        Uid, KeyEnv, KeyChk, KeyVat, KeyMan, KeyMsg, KeyLic, KeyLicChk, KeyChkChk, Tsi, Tsu, Rsi, Rsu, KeySerNum;
    } // AngDbmKeyFields
    
    private static String baseUrl = "/rest/sys/AngDbmKey";


    @Override public String getModelClassName () { return "AngDbmKeyImpl"; }




    
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
        if (full) { if (Objects.nonNull (getKeyEnv ())) { str.append ("KeyEnv[").append (getKeyEnv ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getKeyChk ())) { str.append ("KeyChk[").append (getKeyChk ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getKeyVat ())) { str.append ("KeyVat[").append (getKeyVat ()).append ("] "); } }
        if (full) { str.append ("KeyMan[").append (getKeyMan ()).append ("] "); }
        if (full) { if (Objects.nonNull (getKeyMsg ())) { str.append ("KeyMsg[").append (getKeyMsg ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getKeyLic ())) { str.append ("KeyLic[").append (getKeyLic ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getKeyLicChk ())) { str.append ("KeyLicChk[").append (getKeyLicChk ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getKeyChkChk ())) { str.append ("KeyChkChk[").append (getKeyChkChk ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getKeySerNum ())) { str.append ("KeySerNum[").append (getKeySerNum ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();

        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngDbmKeyImpl newEmptyInstance () { return (AngDbmKeyImpl) newInstance (); }
    
    @Override public AngDbmKeyImpl getCopy () {
        return (AngDbmKeyImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngDbmKey _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngDbmKeyImpl.baseUrl (); }
    public static String baseUrl () { return AngDbmKeyImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngDbmKeyImpl.baseUrl = baseUrl; } 

    @Override public List<AngDbmKeyFields> getFields () { return Arrays.asList (AngDbmKeyFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngDbmKeyImpl
