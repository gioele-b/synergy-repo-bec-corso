package net.synergy2.db.sys.ety;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngEtyComImpl extends AngEtyCom {

    protected AngEtyComImpl () { super (); }

    public enum AngEtyComFields implements ISField {
        Uid, RefEtyUid, ResUid, Com, Tsi, Tsu, Rsi, Rsu, CtxRecUid, CtxTblUid, Prv;
    } // AngEtyComFields
    
    private static String baseUrl = "/rest/sys/ety/AngEtyCom";


    @Override public String getModelClassName () { return "AngEtyComImpl"; }




    
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
        if (full) { str.append ("RefEtyUid[").append (getRefEtyUid ()).append ("] "); }
        if (full) { str.append ("ResUid[").append (getResUid ()).append ("] "); }
        if (full) { str.append ("Com[").append (getCom ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCtxRecUid ())) { str.append ("CtxRecUid[").append (getCtxRecUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCtxTblUid ())) { str.append ("CtxTblUid[").append (getCtxTblUid ()).append ("] "); } }
        if (full) { str.append ("Prv[").append (getPrv ()).append ("] "); }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getAttLst () != null) { str.append ("\n").append (indent).append ("AttLst (").append (getAttLst ().size ()).append ("):"); for (var model : getAttLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getVisLst () != null) { str.append ("\n").append (indent).append ("VisLst (").append (getVisLst ().size ()).append ("):"); for (var model : getVisLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getEty () != null) { str.append ("\n").append (indent).append ("Ety: \n").append (getEty ().debug (full, true, indent + "    ")); }
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        if (getCtxTbl () != null) { str.append ("\n").append (indent).append ("CtxTbl: \n").append (getCtxTbl ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngEtyComImpl newEmptyInstance () { return (AngEtyComImpl) newInstance (); }
    
    @Override public AngEtyComImpl getCopy () {
        return (AngEtyComImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngEtyCom _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngEtyComImpl.baseUrl (); }
    public static String baseUrl () { return AngEtyComImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngEtyComImpl.baseUrl = baseUrl; } 

    @Override public List<AngEtyComFields> getFields () { return Arrays.asList (AngEtyComFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngEtyComImpl
