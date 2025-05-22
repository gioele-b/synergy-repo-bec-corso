package net.synergy2.db.sys.itm;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngItmClsRefImpl extends AngItmClsRef {

    protected AngItmClsRefImpl () { super (); }

    public enum AngItmClsRefFields implements ISField {
        Uid, ClsUid, ClsRefUid, Tsi, Tsu, Rsi, Rsu;
    } // AngItmClsRefFields
    
    private static String baseUrl = "/rest/sys/itm/AngItmClsRef";


    @Override public String getModelClassName () { return "AngItmClsRefImpl"; }




    
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
        str.append ("ClsUid[").append (getClsUid ()).append ("] ");
        str.append ("ClsRefUid[").append (getClsRefUid ()).append ("] ");
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
        if (getCls001 () != null) { str.append ("\n").append (indent).append ("Cls001: \n").append (getCls001 ().debug (full, true, indent + "    ")); }
        if (getCls002 () != null) { str.append ("\n").append (indent).append ("Cls002: \n").append (getCls002 ().debug (full, true, indent + "    ")); }
        if (getCls003 () != null) { str.append ("\n").append (indent).append ("Cls003: \n").append (getCls003 ().debug (full, true, indent + "    ")); }
        if (getCls004 () != null) { str.append ("\n").append (indent).append ("Cls004: \n").append (getCls004 ().debug (full, true, indent + "    ")); }
        if (getCls005 () != null) { str.append ("\n").append (indent).append ("Cls005: \n").append (getCls005 ().debug (full, true, indent + "    ")); }
        if (getCls006 () != null) { str.append ("\n").append (indent).append ("Cls006: \n").append (getCls006 ().debug (full, true, indent + "    ")); }
        if (getCls007 () != null) { str.append ("\n").append (indent).append ("Cls007: \n").append (getCls007 ().debug (full, true, indent + "    ")); }
        if (getCls008 () != null) { str.append ("\n").append (indent).append ("Cls008: \n").append (getCls008 ().debug (full, true, indent + "    ")); }
        if (getCls009 () != null) { str.append ("\n").append (indent).append ("Cls009: \n").append (getCls009 ().debug (full, true, indent + "    ")); }
        if (getCls010 () != null) { str.append ("\n").append (indent).append ("Cls010: \n").append (getCls010 ().debug (full, true, indent + "    ")); }
        if (getCls011 () != null) { str.append ("\n").append (indent).append ("Cls011: \n").append (getCls011 ().debug (full, true, indent + "    ")); }
        if (getCls012 () != null) { str.append ("\n").append (indent).append ("Cls012: \n").append (getCls012 ().debug (full, true, indent + "    ")); }
        if (getCls013 () != null) { str.append ("\n").append (indent).append ("Cls013: \n").append (getCls013 ().debug (full, true, indent + "    ")); }
        if (getCls014 () != null) { str.append ("\n").append (indent).append ("Cls014: \n").append (getCls014 ().debug (full, true, indent + "    ")); }
        if (getCls015 () != null) { str.append ("\n").append (indent).append ("Cls015: \n").append (getCls015 ().debug (full, true, indent + "    ")); }
        if (getClsRef001 () != null) { str.append ("\n").append (indent).append ("ClsRef001: \n").append (getClsRef001 ().debug (full, true, indent + "    ")); }
        if (getClsRef002 () != null) { str.append ("\n").append (indent).append ("ClsRef002: \n").append (getClsRef002 ().debug (full, true, indent + "    ")); }
        if (getClsRef003 () != null) { str.append ("\n").append (indent).append ("ClsRef003: \n").append (getClsRef003 ().debug (full, true, indent + "    ")); }
        if (getClsRef004 () != null) { str.append ("\n").append (indent).append ("ClsRef004: \n").append (getClsRef004 ().debug (full, true, indent + "    ")); }
        if (getClsRef005 () != null) { str.append ("\n").append (indent).append ("ClsRef005: \n").append (getClsRef005 ().debug (full, true, indent + "    ")); }
        if (getClsRef006 () != null) { str.append ("\n").append (indent).append ("ClsRef006: \n").append (getClsRef006 ().debug (full, true, indent + "    ")); }
        if (getClsRef007 () != null) { str.append ("\n").append (indent).append ("ClsRef007: \n").append (getClsRef007 ().debug (full, true, indent + "    ")); }
        if (getClsRef008 () != null) { str.append ("\n").append (indent).append ("ClsRef008: \n").append (getClsRef008 ().debug (full, true, indent + "    ")); }
        if (getClsRef009 () != null) { str.append ("\n").append (indent).append ("ClsRef009: \n").append (getClsRef009 ().debug (full, true, indent + "    ")); }
        if (getClsRef010 () != null) { str.append ("\n").append (indent).append ("ClsRef010: \n").append (getClsRef010 ().debug (full, true, indent + "    ")); }
        if (getClsRef011 () != null) { str.append ("\n").append (indent).append ("ClsRef011: \n").append (getClsRef011 ().debug (full, true, indent + "    ")); }
        if (getClsRef012 () != null) { str.append ("\n").append (indent).append ("ClsRef012: \n").append (getClsRef012 ().debug (full, true, indent + "    ")); }
        if (getClsRef013 () != null) { str.append ("\n").append (indent).append ("ClsRef013: \n").append (getClsRef013 ().debug (full, true, indent + "    ")); }
        if (getClsRef014 () != null) { str.append ("\n").append (indent).append ("ClsRef014: \n").append (getClsRef014 ().debug (full, true, indent + "    ")); }
        if (getClsRef015 () != null) { str.append ("\n").append (indent).append ("ClsRef015: \n").append (getClsRef015 ().debug (full, true, indent + "    ")); }
        if (getCls016 () != null) { str.append ("\n").append (indent).append ("Cls016: \n").append (getCls016 ().debug (full, true, indent + "    ")); }
        if (getCls017 () != null) { str.append ("\n").append (indent).append ("Cls017: \n").append (getCls017 ().debug (full, true, indent + "    ")); }
        if (getCls018 () != null) { str.append ("\n").append (indent).append ("Cls018: \n").append (getCls018 ().debug (full, true, indent + "    ")); }
        if (getCls019 () != null) { str.append ("\n").append (indent).append ("Cls019: \n").append (getCls019 ().debug (full, true, indent + "    ")); }
        if (getCls020 () != null) { str.append ("\n").append (indent).append ("Cls020: \n").append (getCls020 ().debug (full, true, indent + "    ")); }
        if (getCls021 () != null) { str.append ("\n").append (indent).append ("Cls021: \n").append (getCls021 ().debug (full, true, indent + "    ")); }
        if (getCls022 () != null) { str.append ("\n").append (indent).append ("Cls022: \n").append (getCls022 ().debug (full, true, indent + "    ")); }
        if (getCls023 () != null) { str.append ("\n").append (indent).append ("Cls023: \n").append (getCls023 ().debug (full, true, indent + "    ")); }
        if (getCls024 () != null) { str.append ("\n").append (indent).append ("Cls024: \n").append (getCls024 ().debug (full, true, indent + "    ")); }
        if (getCls025 () != null) { str.append ("\n").append (indent).append ("Cls025: \n").append (getCls025 ().debug (full, true, indent + "    ")); }
        if (getCls026 () != null) { str.append ("\n").append (indent).append ("Cls026: \n").append (getCls026 ().debug (full, true, indent + "    ")); }
        if (getCls027 () != null) { str.append ("\n").append (indent).append ("Cls027: \n").append (getCls027 ().debug (full, true, indent + "    ")); }
        if (getCls028 () != null) { str.append ("\n").append (indent).append ("Cls028: \n").append (getCls028 ().debug (full, true, indent + "    ")); }
        if (getCls029 () != null) { str.append ("\n").append (indent).append ("Cls029: \n").append (getCls029 ().debug (full, true, indent + "    ")); }
        if (getCls030 () != null) { str.append ("\n").append (indent).append ("Cls030: \n").append (getCls030 ().debug (full, true, indent + "    ")); }
        if (getClsRef016 () != null) { str.append ("\n").append (indent).append ("ClsRef016: \n").append (getClsRef016 ().debug (full, true, indent + "    ")); }
        if (getClsRef017 () != null) { str.append ("\n").append (indent).append ("ClsRef017: \n").append (getClsRef017 ().debug (full, true, indent + "    ")); }
        if (getClsRef018 () != null) { str.append ("\n").append (indent).append ("ClsRef018: \n").append (getClsRef018 ().debug (full, true, indent + "    ")); }
        if (getClsRef019 () != null) { str.append ("\n").append (indent).append ("ClsRef019: \n").append (getClsRef019 ().debug (full, true, indent + "    ")); }
        if (getClsRef020 () != null) { str.append ("\n").append (indent).append ("ClsRef020: \n").append (getClsRef020 ().debug (full, true, indent + "    ")); }
        if (getClsRef021 () != null) { str.append ("\n").append (indent).append ("ClsRef021: \n").append (getClsRef021 ().debug (full, true, indent + "    ")); }
        if (getClsRef022 () != null) { str.append ("\n").append (indent).append ("ClsRef022: \n").append (getClsRef022 ().debug (full, true, indent + "    ")); }
        if (getClsRef023 () != null) { str.append ("\n").append (indent).append ("ClsRef023: \n").append (getClsRef023 ().debug (full, true, indent + "    ")); }
        if (getClsRef024 () != null) { str.append ("\n").append (indent).append ("ClsRef024: \n").append (getClsRef024 ().debug (full, true, indent + "    ")); }
        if (getClsRef025 () != null) { str.append ("\n").append (indent).append ("ClsRef025: \n").append (getClsRef025 ().debug (full, true, indent + "    ")); }
        if (getClsRef026 () != null) { str.append ("\n").append (indent).append ("ClsRef026: \n").append (getClsRef026 ().debug (full, true, indent + "    ")); }
        if (getClsRef027 () != null) { str.append ("\n").append (indent).append ("ClsRef027: \n").append (getClsRef027 ().debug (full, true, indent + "    ")); }
        if (getClsRef028 () != null) { str.append ("\n").append (indent).append ("ClsRef028: \n").append (getClsRef028 ().debug (full, true, indent + "    ")); }
        if (getClsRef029 () != null) { str.append ("\n").append (indent).append ("ClsRef029: \n").append (getClsRef029 ().debug (full, true, indent + "    ")); }
        if (getClsRef030 () != null) { str.append ("\n").append (indent).append ("ClsRef030: \n").append (getClsRef030 ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngItmClsRefImpl newEmptyInstance () { return (AngItmClsRefImpl) newInstance (); }
    
    @Override public AngItmClsRefImpl getCopy () {
        return (AngItmClsRefImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngItmClsRef _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngItmClsRefImpl.baseUrl (); }
    public static String baseUrl () { return AngItmClsRefImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngItmClsRefImpl.baseUrl = baseUrl; } 

    @Override public List<AngItmClsRefFields> getFields () { return Arrays.asList (AngItmClsRefFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngItmClsRefImpl
