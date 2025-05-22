package net.synergy2.db.sys.ema;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class EmaCroImpl extends EmaCro {

    protected EmaCroImpl () { super (); }

    public enum EmaCroFields implements ISField {
        Uid, EmaCroDsc, EmaCroCat, DatSetUid, EmaSub, EmaBod, CroExp, EmaLstUid, EmaSnd, LstExeSts, LstExeTss, FlgEnb, Tsi, Tsu, Rsi, Rsu, SndIff, EmlSrvUid, TplUid;
    } // EmaCroFields
    
    private static String baseUrl = "/rest/sys/ema/EmaCro";


    @Override public String getModelClassName () { return "EmaCroImpl"; }




    
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
        str.append ("EmaCroDsc[").append (getEmaCroDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getEmaCroCat ())) { str.append ("EmaCroCat[").append (getEmaCroCat ()).append ("] "); } }
        if (full) { str.append ("DatSetUid[").append (getDatSetUid ()).append ("] "); }
        if (full) { str.append ("EmaSub[").append (getEmaSub ()).append ("] "); }
        if (full) { if (Objects.nonNull (getEmaBod ())) { str.append ("EmaBod[").append (getEmaBod ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCroExp ())) { str.append ("CroExp[").append (getCroExp ()).append ("] "); } }
        if (full) { str.append ("EmaLstUid[").append (getEmaLstUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getEmaSnd ())) { str.append ("EmaSnd[").append (getEmaSnd ()).append ("] "); } }
        if (full) { str.append ("LstExeSts[").append (getLstExeSts ()).append ("] "); }
        if (full) { if (Objects.nonNull (getLstExeTss ())) { str.append ("LstExeTss[").append (getLstExeTss ()).append ("] "); } }
        if (full) { str.append ("FlgEnb[").append (getFlgEnb ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getSndIff ())) { str.append ("SndIff[").append (getSndIff ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEmlSrvUid ())) { str.append ("EmlSrvUid[").append (getEmlSrvUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTplUid ())) { str.append ("TplUid[").append (getTplUid ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getPrmLst () != null) { str.append ("\n").append (indent).append ("PrmLst (").append (getPrmLst ().size ()).append ("):"); for (var model : getPrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDatSet () != null) { str.append ("\n").append (indent).append ("DatSet: \n").append (getDatSet ().debug (full, true, indent + "    ")); }
        if (getEmaLst () != null) { str.append ("\n").append (indent).append ("EmaLst: \n").append (getEmaLst ().debug (full, true, indent + "    ")); }
        if (getSrv () != null) { str.append ("\n").append (indent).append ("Srv: \n").append (getSrv ().debug (full, true, indent + "    ")); }
        if (getTpl () != null) { str.append ("\n").append (indent).append ("Tpl: \n").append (getTpl ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public EmaCroImpl newEmptyInstance () { return (EmaCroImpl) newInstance (); }
    
    @Override public EmaCroImpl getCopy () {
        return (EmaCroImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (EmaCro _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return EmaCroImpl.baseUrl (); }
    public static String baseUrl () { return EmaCroImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { EmaCroImpl.baseUrl = baseUrl; } 

    @Override public List<EmaCroFields> getFields () { return Arrays.asList (EmaCroFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // EmaCroImpl
