package net.synergy2.db.sys.ety;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngEtyAttCatImpl extends AngEtyAttCat {

    protected AngEtyAttCatImpl () { super (); }

    public enum AngEtyAttCatFields implements ISField {
        Uid, CatCod, CatDsc, CatIco, CatClr, Tsi, Tsu, Rsi, Rsu;
    } // AngEtyAttCatFields
    
    private static String baseUrl = "/rest/sys/ety/AngEtyAttCat";


    @Override public String getModelClassName () { return "AngEtyAttCatImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public AngEtyAttCatImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("CatCod[").append (getCatCod ()).append ("] ");
        str.append ("CatDsc[").append (getCatDsc ()).append ("] ");
        if (full) { str.append ("CatIco[").append (getCatIco ()).append ("] "); }
        if (full) { str.append ("CatClr[").append (getCatClr ()).append ("] "); }
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
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDocCtxLst () != null) { str.append ("\n").append (indent).append ("DocCtxLst (").append (getDocCtxLst ().size ()).append ("):"); for (var model : getDocCtxLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAttLst () != null) { str.append ("\n").append (indent).append ("AttLst (").append (getAttLst ().size ()).append ("):"); for (var model : getAttLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngEtyAttCatImpl newEmptyInstance () { return (AngEtyAttCatImpl) newInstance (); }
    
    @Override public AngEtyAttCatImpl getCopy () {
        var toReturn = (AngEtyAttCatImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (AngEtyAttCat _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngEtyAttCatImpl.baseUrl (); }
    public static String baseUrl () { return AngEtyAttCatImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngEtyAttCatImpl.baseUrl = baseUrl; } 

    @Override public List<AngEtyAttCatFields> getFields () { return Arrays.asList (AngEtyAttCatFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngEtyAttCatImpl
