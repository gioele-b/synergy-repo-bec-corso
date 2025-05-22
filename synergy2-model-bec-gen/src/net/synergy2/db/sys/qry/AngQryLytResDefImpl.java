package net.synergy2.db.sys.qry;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngQryLytResDefImpl extends AngQryLytResDef {

    protected AngQryLytResDefImpl () { super (); }

    public enum AngQryLytResDefFields implements ISField {
        Uid, ResUid, LytUid, Tsi, Tsu, Rsi, Rsu, DefCtx;
    } // AngQryLytResDefFields
    
    private static String baseUrl = "/rest/sys/qry/AngQryLytResDef";


    @Override public String getModelClassName () { return "AngQryLytResDefImpl"; }




    
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
        if (Objects.nonNull (getResUid ())) { str.append ("ResUid[").append (getResUid ()).append ("] "); }
        str.append ("LytUid[").append (getLytUid ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (Objects.nonNull (getDefCtx ())) { str.append ("DefCtx[").append (getDefCtx ()).append ("] "); }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        if (getLyt () != null) { str.append ("\n").append (indent).append ("Lyt: \n").append (getLyt ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngQryLytResDefImpl newEmptyInstance () { return (AngQryLytResDefImpl) newInstance (); }
    
    @Override public AngQryLytResDefImpl getCopy () {
        return (AngQryLytResDefImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngQryLytResDef _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngQryLytResDefImpl.baseUrl (); }
    public static String baseUrl () { return AngQryLytResDefImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngQryLytResDefImpl.baseUrl = baseUrl; } 

    @Override public List<AngQryLytResDefFields> getFields () { return Arrays.asList (AngQryLytResDefFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngQryLytResDefImpl
