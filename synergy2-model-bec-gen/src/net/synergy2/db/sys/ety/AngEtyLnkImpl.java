package net.synergy2.db.sys.ety;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngEtyLnkImpl extends AngEtyLnk {

    protected AngEtyLnkImpl () { super (); }

    public enum AngEtyLnkFields implements ISField {
        Uid, EtySrcUid, EtyTrgUid, EtyLnkTyp, LnkTypUid, ResUid, Tsi, Tsu, Rsi, Rsu;
    } // AngEtyLnkFields
    
    private static String baseUrl = "/rest/sys/ety/AngEtyLnk";


    @Override public String getModelClassName () { return "AngEtyLnkImpl"; }




    
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
        str.append ("EtySrcUid[").append (getEtySrcUid ()).append ("] ");
        str.append ("EtyTrgUid[").append (getEtyTrgUid ()).append ("] ");
        if (full) { if (Objects.nonNull (getEtyLnkTyp ())) { str.append ("EtyLnkTyp[").append (getEtyLnkTyp ()).append ("] "); } }
        if (full) { str.append ("LnkTypUid[").append (getLnkTypUid ()).append ("] "); }
        if (full) { str.append ("ResUid[").append (getResUid ()).append ("] "); }
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
        if (getEtySrc () != null) { str.append ("\n").append (indent).append ("EtySrc: \n").append (getEtySrc ().debug (full, true, indent + "    ")); }
        if (getEtyTrg () != null) { str.append ("\n").append (indent).append ("EtyTrg: \n").append (getEtyTrg ().debug (full, true, indent + "    ")); }
        if (getTyp () != null) { str.append ("\n").append (indent).append ("Typ: \n").append (getTyp ().debug (full, true, indent + "    ")); }
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngEtyLnkImpl newEmptyInstance () { return (AngEtyLnkImpl) newInstance (); }
    
    @Override public AngEtyLnkImpl getCopy () {
        return (AngEtyLnkImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngEtyLnk _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngEtyLnkImpl.baseUrl (); }
    public static String baseUrl () { return AngEtyLnkImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngEtyLnkImpl.baseUrl = baseUrl; } 

    @Override public List<AngEtyLnkFields> getFields () { return Arrays.asList (AngEtyLnkFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngEtyLnkImpl
