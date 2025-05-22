package net.synergy2.db.sys.env;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngRemSrvTypImpl extends AngRemSrvTyp {

    protected AngRemSrvTypImpl () { super (); }

    public enum AngRemSrvTypFields implements ISField {
        Uid, RemSrvTypCod, RemSrvTypDsc, RemSrvTypCls, Tsi, Tsu, Rsi, Rsu, RemSrvTypIco, FrmDsgUid;
    } // AngRemSrvTypFields
    
    private static String baseUrl = "/rest/sys/env/AngRemSrvTyp";


    @Override public String getModelClassName () { return "AngRemSrvTypImpl"; }




    
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
        str.append ("RemSrvTypCod[").append (getRemSrvTypCod ()).append ("] ");
        str.append ("RemSrvTypDsc[").append (getRemSrvTypDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getRemSrvTypCls ())) { str.append ("RemSrvTypCls[").append (getRemSrvTypCls ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { str.append ("RemSrvTypIco[").append (getRemSrvTypIco ()).append ("] "); }
        if (full) { if (Objects.nonNull (getFrmDsgUid ())) { str.append ("FrmDsgUid[").append (getFrmDsgUid ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getRemSrvLst () != null) { str.append ("\n").append (indent).append ("RemSrvLst (").append (getRemSrvLst ().size ()).append ("):"); for (var model : getRemSrvLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getFrmDsg () != null) { str.append ("\n").append (indent).append ("FrmDsg: \n").append (getFrmDsg ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngRemSrvTypImpl newEmptyInstance () { return (AngRemSrvTypImpl) newInstance (); }
    
    @Override public AngRemSrvTypImpl getCopy () {
        return (AngRemSrvTypImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngRemSrvTyp _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngRemSrvTypImpl.baseUrl (); }
    public static String baseUrl () { return AngRemSrvTypImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngRemSrvTypImpl.baseUrl = baseUrl; } 

    @Override public List<AngRemSrvTypFields> getFields () { return Arrays.asList (AngRemSrvTypFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngRemSrvTypImpl
