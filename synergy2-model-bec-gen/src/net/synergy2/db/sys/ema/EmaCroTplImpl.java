package net.synergy2.db.sys.ema;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class EmaCroTplImpl extends EmaCroTpl {

    protected EmaCroTplImpl () { super (); }

    public enum EmaCroTplFields implements ISField {
        Uid, TplCod, TplDsc, EmaSub, EmaBod, SndIff, Tsi, Tsu, Rsi, Rsu;
    } // EmaCroTplFields
    
    private static String baseUrl = "/rest/sys/ema/EmaCroTpl";


    @Override public String getModelClassName () { return "EmaCroTplImpl"; }




    
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
        str.append ("TplCod[").append (getTplCod ()).append ("] ");
        str.append ("TplDsc[").append (getTplDsc ()).append ("] ");
        if (full) { str.append ("EmaSub[").append (getEmaSub ()).append ("] "); }
        if (full) { if (Objects.nonNull (getEmaBod ())) { str.append ("EmaBod[").append (getEmaBod ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getSndIff ())) { str.append ("SndIff[").append (getSndIff ()).append ("] "); } }
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
        if (getEmaCroLst () != null) { str.append ("\n").append (indent).append ("EmaCroLst (").append (getEmaCroLst ().size ()).append ("):"); for (var model : getEmaCroLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public EmaCroTplImpl newEmptyInstance () { return (EmaCroTplImpl) newInstance (); }
    
    @Override public EmaCroTplImpl getCopy () {
        return (EmaCroTplImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (EmaCroTpl _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return EmaCroTplImpl.baseUrl (); }
    public static String baseUrl () { return EmaCroTplImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { EmaCroTplImpl.baseUrl = baseUrl; } 

    @Override public List<EmaCroTplFields> getFields () { return Arrays.asList (EmaCroTplFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // EmaCroTplImpl
