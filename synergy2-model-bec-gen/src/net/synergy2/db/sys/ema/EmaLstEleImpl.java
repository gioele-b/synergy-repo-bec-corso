package net.synergy2.db.sys.ema;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class EmaLstEleImpl extends EmaLstEle {

    protected EmaLstEleImpl () { super (); }

    public enum EmaLstEleFields implements ISField {
        Uid, EmaLstUid, ResUid, GrpUid, GrpSndMod, EmaAdd, RcvMod, Tsi, Tsu, Rsi, Rsu;
    } // EmaLstEleFields
    
    private static String baseUrl = "/rest/sys/ema/EmaLstEle";


    @Override public String getModelClassName () { return "EmaLstEleImpl"; }




    
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
        if (full) { str.append ("EmaLstUid[").append (getEmaLstUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getResUid ())) { str.append ("ResUid[").append (getResUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getGrpUid ())) { str.append ("GrpUid[").append (getGrpUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getGrpSndMod ())) { str.append ("GrpSndMod[").append (getGrpSndMod ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEmaAdd ())) { str.append ("EmaAdd[").append (getEmaAdd ()).append ("] "); } }
        if (full) { str.append ("RcvMod[").append (getRcvMod ()).append ("] "); }
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
        if (getEmaLst () != null) { str.append ("\n").append (indent).append ("EmaLst: \n").append (getEmaLst ().debug (full, true, indent + "    ")); }
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        if (getGrp () != null) { str.append ("\n").append (indent).append ("Grp: \n").append (getGrp ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public EmaLstEleImpl newEmptyInstance () { return (EmaLstEleImpl) newInstance (); }
    
    @Override public EmaLstEleImpl getCopy () {
        return (EmaLstEleImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (EmaLstEle _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return EmaLstEleImpl.baseUrl (); }
    public static String baseUrl () { return EmaLstEleImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { EmaLstEleImpl.baseUrl = baseUrl; } 

    @Override public List<EmaLstEleFields> getFields () { return Arrays.asList (EmaLstEleFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // EmaLstEleImpl
