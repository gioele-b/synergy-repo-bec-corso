package net.synergy2.db.sys.ety;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngEtyDocImpl extends AngEtyDoc {

    protected AngEtyDocImpl () { super (); }

    public enum AngEtyDocFields implements ISField {
        Uid, RefEtyUid, RemUid, RemVrs, DocClsUid, Tsi, Tsu, Rsi, Rsu, AssDoc, DocDrf, SrcDocUid;
    } // AngEtyDocFields
    
    private static String baseUrl = "/rest/sys/ety/AngEtyDoc";


    @Override public String getModelClassName () { return "AngEtyDocImpl"; }




    
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
        str.append ("RemUid[").append (getRemUid ()).append ("] ");
        if (Objects.nonNull (getRemVrs ())) { str.append ("RemVrs[").append (getRemVrs ()).append ("] "); }
        if (full) { str.append ("DocClsUid[").append (getDocClsUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getAssDoc ())) { str.append ("AssDoc[").append (getAssDoc ()).append ("] "); } }
        if (full) { str.append ("DocDrf[").append (getDocDrf ()).append ("] "); }
        if (full) { if (Objects.nonNull (getSrcDocUid ())) { str.append ("SrcDocUid[").append (getSrcDocUid ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getEtyAttLst () != null) { str.append ("\n").append (indent).append ("EtyAttLst (").append (getEtyAttLst ().size ()).append ("):"); for (var model : getEtyAttLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDupDocLst () != null) { str.append ("\n").append (indent).append ("DupDocLst (").append (getDupDocLst ().size ()).append ("):"); for (var model : getDupDocLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDocCls () != null) { str.append ("\n").append (indent).append ("DocCls: \n").append (getDocCls ().debug (full, true, indent + "    ")); }
        if (getEty () != null) { str.append ("\n").append (indent).append ("Ety: \n").append (getEty ().debug (full, true, indent + "    ")); }
        if (getSrcDoc () != null) { str.append ("\n").append (indent).append ("SrcDoc: \n").append (getSrcDoc ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngEtyDocImpl newEmptyInstance () { return (AngEtyDocImpl) newInstance (); }
    
    @Override public AngEtyDocImpl getCopy () {
        return (AngEtyDocImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngEtyDoc _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngEtyDocImpl.baseUrl (); }
    public static String baseUrl () { return AngEtyDocImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngEtyDocImpl.baseUrl = baseUrl; } 

    @Override public List<AngEtyDocFields> getFields () { return Arrays.asList (AngEtyDocFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngEtyDocImpl
