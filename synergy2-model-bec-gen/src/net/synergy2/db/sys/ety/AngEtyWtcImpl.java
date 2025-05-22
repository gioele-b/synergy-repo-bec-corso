package net.synergy2.db.sys.ety;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngEtyWtcImpl extends AngEtyWtc {

    protected AngEtyWtcImpl () { super (); }

    public enum AngEtyWtcFields implements ISField {
        RefEtyUid, ResUid, Tsi, Tsu, Rsi, Rsu;
    } // AngEtyWtcFields
    
    private static String baseUrl = "/rest/sys/ety/AngEtyWtc";


    @Override public String getModelClassName () { return "AngEtyWtcImpl"; }




    
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
        str.append ("RefEtyUid[").append (getRefEtyUid ()).append ("] ");
        str.append ("ResUid[").append (getResUid ()).append ("] ");
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
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getRefEtyUid () + "#" + getResUid (); }

    @Override public AngEtyWtcImpl newEmptyInstance () { return (AngEtyWtcImpl) newInstance (); }
    
    @Override public AngEtyWtcImpl getCopy () {
        return (AngEtyWtcImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngEtyWtc _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngEtyWtcImpl.baseUrl (); }
    public static String baseUrl () { return AngEtyWtcImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngEtyWtcImpl.baseUrl = baseUrl; } 

    @Override public List<AngEtyWtcFields> getFields () { return Arrays.asList (AngEtyWtcFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngEtyWtcImpl
