package net.synergy2.db.sys.mnc;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class MncNotEtyAttImpl extends MncNotEtyAtt {

    protected MncNotEtyAttImpl () { super (); }

    public enum MncNotEtyAttFields implements ISField {
        Uid, NotUid, EtyAttUid, Tsi, Tsu, Rsi, Rsu;
    } // MncNotEtyAttFields
    
    private static String baseUrl = "/rest/sys/mnc/MncNotEtyAtt";


    @Override public String getModelClassName () { return "MncNotEtyAttImpl"; }




    
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
        str.append ("NotUid[").append (getNotUid ()).append ("] ");
        str.append ("EtyAttUid[").append (getEtyAttUid ()).append ("] ");
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
        if (getNot () != null) { str.append ("\n").append (indent).append ("Not: \n").append (getNot ().debug (full, true, indent + "    ")); }
        if (getAtt () != null) { str.append ("\n").append (indent).append ("Att: \n").append (getAtt ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public MncNotEtyAttImpl newEmptyInstance () { return (MncNotEtyAttImpl) newInstance (); }
    
    @Override public MncNotEtyAttImpl getCopy () {
        return (MncNotEtyAttImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (MncNotEtyAtt _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return MncNotEtyAttImpl.baseUrl (); }
    public static String baseUrl () { return MncNotEtyAttImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { MncNotEtyAttImpl.baseUrl = baseUrl; } 

    @Override public List<MncNotEtyAttFields> getFields () { return Arrays.asList (MncNotEtyAttFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // MncNotEtyAttImpl
