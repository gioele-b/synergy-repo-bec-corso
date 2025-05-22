package net.synergy2.db.sys.doc;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysDocCtxCatAttImpl extends SysDocCtxCatAtt {

    protected SysDocCtxCatAttImpl () { super (); }

    public enum SysDocCtxCatAttFields implements ISField {
        Uid, DocCtxUid, CatAttUid, CatSrt, Tsi, Tsu, Rsi, Rsu;
    } // SysDocCtxCatAttFields
    
    private static String baseUrl = "/rest/sys/doc/SysDocCtxCatAtt";


    @Override public String getModelClassName () { return "SysDocCtxCatAttImpl"; }




    
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
        str.append ("DocCtxUid[").append (getDocCtxUid ()).append ("] ");
        str.append ("CatAttUid[").append (getCatAttUid ()).append ("] ");
        if (full) { str.append ("CatSrt[").append (getCatSrt ()).append ("] "); }
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
        if (getDocCtx () != null) { str.append ("\n").append (indent).append ("DocCtx: \n").append (getDocCtx ().debug (full, true, indent + "    ")); }
        if (getCatAtt () != null) { str.append ("\n").append (indent).append ("CatAtt: \n").append (getCatAtt ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysDocCtxCatAttImpl newEmptyInstance () { return (SysDocCtxCatAttImpl) newInstance (); }
    
    @Override public SysDocCtxCatAttImpl getCopy () {
        return (SysDocCtxCatAttImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysDocCtxCatAtt _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysDocCtxCatAttImpl.baseUrl (); }
    public static String baseUrl () { return SysDocCtxCatAttImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysDocCtxCatAttImpl.baseUrl = baseUrl; } 

    @Override public List<SysDocCtxCatAttFields> getFields () { return Arrays.asList (SysDocCtxCatAttFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysDocCtxCatAttImpl
