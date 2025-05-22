package net.synergy2.db.sys.cal;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngCalEvtCls028LngImpl extends AngCalEvtCls028Lng {

    protected AngCalEvtCls028LngImpl () { super (); }

    public enum AngCalEvtCls028LngFields implements ISField {
        RecUid, LngUid, ClsDsc, Tsi, Tsu, Rsi, Rsu;
    } // AngCalEvtCls028LngFields
    
    private static String baseUrl = "/rest/sys/cal/AngCalEvtCls028Lng";


    @Override public String getModelClassName () { return "AngCalEvtCls028LngImpl"; }




    
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

    @Override public AngCalEvtCls028LngImpl newEmptyInstance () { return (AngCalEvtCls028LngImpl) newInstance (); }
    
    @Override public AngCalEvtCls028LngImpl getCopy () {
        return (AngCalEvtCls028LngImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngCalEvtCls028Lng _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngCalEvtCls028LngImpl.baseUrl (); }
    public static String baseUrl () { return AngCalEvtCls028LngImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngCalEvtCls028LngImpl.baseUrl = baseUrl; } 

    @Override public List<AngCalEvtCls028LngFields> getFields () { return Arrays.asList (AngCalEvtCls028LngFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngCalEvtCls028LngImpl
