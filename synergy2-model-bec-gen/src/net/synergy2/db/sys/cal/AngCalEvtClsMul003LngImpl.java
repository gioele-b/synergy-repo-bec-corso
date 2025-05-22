package net.synergy2.db.sys.cal;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngCalEvtClsMul003LngImpl extends AngCalEvtClsMul003Lng {

    protected AngCalEvtClsMul003LngImpl () { super (); }

    public enum AngCalEvtClsMul003LngFields implements ISField {
        RecUid, LngUid, ClsDsc, Tsi, Tsu, Rsi, Rsu;
    } // AngCalEvtClsMul003LngFields
    
    private static String baseUrl = "/rest/sys/cal/AngCalEvtClsMul003Lng";


    @Override public String getModelClassName () { return "AngCalEvtClsMul003LngImpl"; }




    
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
        str.append ("RecUid[").append (getRecUid ()).append ("] ");
        str.append ("LngUid[").append (getLngUid ()).append ("] ");
        if (Objects.nonNull (getClsDsc ())) { str.append ("ClsDsc[").append (getClsDsc ()).append ("] "); }
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
        if (getRec () != null) { str.append ("\n").append (indent).append ("Rec: \n").append (getRec ().debug (full, true, indent + "    ")); }
        if (getLng () != null) { str.append ("\n").append (indent).append ("Lng: \n").append (getLng ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getRecUid () + "#" + getLngUid (); }

    @Override public AngCalEvtClsMul003LngImpl newEmptyInstance () { return (AngCalEvtClsMul003LngImpl) newInstance (); }
    
    @Override public AngCalEvtClsMul003LngImpl getCopy () {
        return (AngCalEvtClsMul003LngImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngCalEvtClsMul003Lng _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngCalEvtClsMul003LngImpl.baseUrl (); }
    public static String baseUrl () { return AngCalEvtClsMul003LngImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngCalEvtClsMul003LngImpl.baseUrl = baseUrl; } 

    @Override public List<AngCalEvtClsMul003LngFields> getFields () { return Arrays.asList (AngCalEvtClsMul003LngFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngCalEvtClsMul003LngImpl
