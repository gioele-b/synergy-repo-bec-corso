package net.synergy2.db.sys.ety;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngEtyMenImpl extends AngEtyMen {

    protected AngEtyMenImpl () { super (); }

    public enum AngEtyMenFields implements ISField {
        Uid, RefEtyUid, MenResUid, ResUid, Tsi, Tsu, Rsi, Rsu;
    } // AngEtyMenFields
    
    private static String baseUrl = "/rest/sys/ety/AngEtyMen";


    @Override public String getModelClassName () { return "AngEtyMenImpl"; }




    
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
        str.append ("RefEtyUid[").append (getRefEtyUid ()).append ("] ");
        str.append ("MenResUid[").append (getMenResUid ()).append ("] ");
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
        if (getEty () != null) { str.append ("\n").append (indent).append ("Ety: \n").append (getEty ().debug (full, true, indent + "    ")); }
        if (getResCrt () != null) { str.append ("\n").append (indent).append ("ResCrt: \n").append (getResCrt ().debug (full, true, indent + "    ")); }
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngEtyMenImpl newEmptyInstance () { return (AngEtyMenImpl) newInstance (); }
    
    @Override public AngEtyMenImpl getCopy () {
        return (AngEtyMenImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngEtyMen _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngEtyMenImpl.baseUrl (); }
    public static String baseUrl () { return AngEtyMenImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngEtyMenImpl.baseUrl = baseUrl; } 

    @Override public List<AngEtyMenFields> getFields () { return Arrays.asList (AngEtyMenFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngEtyMenImpl
