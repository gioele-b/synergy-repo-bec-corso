package net.synergy2.db.sys.uif;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysFrmDsgTabImpl extends SysFrmDsgTab {

    protected SysFrmDsgTabImpl () { super (); }

    public enum SysFrmDsgTabFields implements ISField {
        Uid, TabCod, TabSrt, TabIco, TabClr, LblCod, FrmUid, Tsi, Tsu, Rsi, Rsu, TabExp;
    } // SysFrmDsgTabFields
    
    private static String baseUrl = "/rest/sys/uif/SysFrmDsgTab";


    @Override public String getModelClassName () { return "SysFrmDsgTabImpl"; }




    
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
        if (Objects.nonNull (getTabCod ())) { str.append ("TabCod[").append (getTabCod ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTabSrt ())) { str.append ("TabSrt[").append (getTabSrt ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTabIco ())) { str.append ("TabIco[").append (getTabIco ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTabClr ())) { str.append ("TabClr[").append (getTabClr ()).append ("] "); } }
        if (full) { str.append ("LblCod[").append (getLblCod ()).append ("] "); }
        if (full) { str.append ("FrmUid[").append (getFrmUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { str.append ("TabExp[").append (getTabExp ()).append ("] "); }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getFldLst () != null) { str.append ("\n").append (indent).append ("FldLst (").append (getFldLst ().size ()).append ("):"); for (var model : getFldLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getFrmDsg () != null) { str.append ("\n").append (indent).append ("FrmDsg: \n").append (getFrmDsg ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysFrmDsgTabImpl newEmptyInstance () { return (SysFrmDsgTabImpl) newInstance (); }
    
    @Override public SysFrmDsgTabImpl getCopy () {
        return (SysFrmDsgTabImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysFrmDsgTab _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysFrmDsgTabImpl.baseUrl (); }
    public static String baseUrl () { return SysFrmDsgTabImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysFrmDsgTabImpl.baseUrl = baseUrl; } 

    @Override public List<SysFrmDsgTabFields> getFields () { return Arrays.asList (SysFrmDsgTabFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysFrmDsgTabImpl
