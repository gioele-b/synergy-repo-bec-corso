package net.synergy2.db.sys.bas;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysClsRefCfgImpl extends SysClsRefCfg {

    protected SysClsRefCfgImpl () { super (); }

    public enum SysClsRefCfgFields implements ISField {
        Uid, TblUid, ClsRef001, ClsRef002, ClsRef003, ClsRef004, ClsRef005, ClsRef006, ClsRef007, ClsRef008, ClsRef009, ClsRef010, ClsRef011, ClsRef012, ClsRef013, ClsRef014, ClsRef015, ClsFre001, ClsFre002, ClsFre003, ClsFre004, ClsFre005, ClsFre006, ClsFre007, ClsFre008, ClsFre009, ClsFre010, ClsFre011, ClsFre012, ClsFre013, ClsFre014, ClsFre015, Tsi, Tsu, Rsi, Rsu, ClsRef016, ClsRef017, ClsRef018, ClsRef019, ClsRef020, ClsRef021, ClsRef022, ClsRef023, ClsRef024, ClsRef025, ClsRef026, ClsRef027, ClsRef028, ClsRef029, ClsRef030, ClsFre016, ClsFre017, ClsFre018, ClsFre019, ClsFre020, ClsFre021, ClsFre022, ClsFre023, ClsFre024, ClsFre025, ClsFre026, ClsFre027, ClsFre028, ClsFre029, ClsFre030;
    } // SysClsRefCfgFields
    
    private static String baseUrl = "/rest/sys/bas/SysClsRefCfg";


    @Override public String getModelClassName () { return "SysClsRefCfgImpl"; }




    
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
        str.append ("TblUid[").append (getTblUid ()).append ("] ");
        if (full) { if (Objects.nonNull (getClsRef001 ())) { str.append ("ClsRef001[").append (getClsRef001 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef002 ())) { str.append ("ClsRef002[").append (getClsRef002 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef003 ())) { str.append ("ClsRef003[").append (getClsRef003 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef004 ())) { str.append ("ClsRef004[").append (getClsRef004 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef005 ())) { str.append ("ClsRef005[").append (getClsRef005 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef006 ())) { str.append ("ClsRef006[").append (getClsRef006 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef007 ())) { str.append ("ClsRef007[").append (getClsRef007 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef008 ())) { str.append ("ClsRef008[").append (getClsRef008 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef009 ())) { str.append ("ClsRef009[").append (getClsRef009 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef010 ())) { str.append ("ClsRef010[").append (getClsRef010 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef011 ())) { str.append ("ClsRef011[").append (getClsRef011 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef012 ())) { str.append ("ClsRef012[").append (getClsRef012 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef013 ())) { str.append ("ClsRef013[").append (getClsRef013 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef014 ())) { str.append ("ClsRef014[").append (getClsRef014 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef015 ())) { str.append ("ClsRef015[").append (getClsRef015 ()).append ("] "); } }
        if (full) { str.append ("ClsFre001[").append (getClsFre001 ()).append ("] "); }
        if (full) { str.append ("ClsFre002[").append (getClsFre002 ()).append ("] "); }
        if (full) { str.append ("ClsFre003[").append (getClsFre003 ()).append ("] "); }
        if (full) { str.append ("ClsFre004[").append (getClsFre004 ()).append ("] "); }
        if (full) { str.append ("ClsFre005[").append (getClsFre005 ()).append ("] "); }
        if (full) { str.append ("ClsFre006[").append (getClsFre006 ()).append ("] "); }
        if (full) { str.append ("ClsFre007[").append (getClsFre007 ()).append ("] "); }
        if (full) { str.append ("ClsFre008[").append (getClsFre008 ()).append ("] "); }
        if (full) { str.append ("ClsFre009[").append (getClsFre009 ()).append ("] "); }
        if (full) { str.append ("ClsFre010[").append (getClsFre010 ()).append ("] "); }
        if (full) { str.append ("ClsFre011[").append (getClsFre011 ()).append ("] "); }
        if (full) { str.append ("ClsFre012[").append (getClsFre012 ()).append ("] "); }
        if (full) { str.append ("ClsFre013[").append (getClsFre013 ()).append ("] "); }
        if (full) { str.append ("ClsFre014[").append (getClsFre014 ()).append ("] "); }
        if (full) { str.append ("ClsFre015[").append (getClsFre015 ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef016 ())) { str.append ("ClsRef016[").append (getClsRef016 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef017 ())) { str.append ("ClsRef017[").append (getClsRef017 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef018 ())) { str.append ("ClsRef018[").append (getClsRef018 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef019 ())) { str.append ("ClsRef019[").append (getClsRef019 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef020 ())) { str.append ("ClsRef020[").append (getClsRef020 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef021 ())) { str.append ("ClsRef021[").append (getClsRef021 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef022 ())) { str.append ("ClsRef022[").append (getClsRef022 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef023 ())) { str.append ("ClsRef023[").append (getClsRef023 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef024 ())) { str.append ("ClsRef024[").append (getClsRef024 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef025 ())) { str.append ("ClsRef025[").append (getClsRef025 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef026 ())) { str.append ("ClsRef026[").append (getClsRef026 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef027 ())) { str.append ("ClsRef027[").append (getClsRef027 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef028 ())) { str.append ("ClsRef028[").append (getClsRef028 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef029 ())) { str.append ("ClsRef029[").append (getClsRef029 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsRef030 ())) { str.append ("ClsRef030[").append (getClsRef030 ()).append ("] "); } }
        if (full) { str.append ("ClsFre016[").append (getClsFre016 ()).append ("] "); }
        if (full) { str.append ("ClsFre017[").append (getClsFre017 ()).append ("] "); }
        if (full) { str.append ("ClsFre018[").append (getClsFre018 ()).append ("] "); }
        if (full) { str.append ("ClsFre019[").append (getClsFre019 ()).append ("] "); }
        if (full) { str.append ("ClsFre020[").append (getClsFre020 ()).append ("] "); }
        if (full) { str.append ("ClsFre021[").append (getClsFre021 ()).append ("] "); }
        if (full) { str.append ("ClsFre022[").append (getClsFre022 ()).append ("] "); }
        if (full) { str.append ("ClsFre023[").append (getClsFre023 ()).append ("] "); }
        if (full) { str.append ("ClsFre024[").append (getClsFre024 ()).append ("] "); }
        if (full) { str.append ("ClsFre025[").append (getClsFre025 ()).append ("] "); }
        if (full) { str.append ("ClsFre026[").append (getClsFre026 ()).append ("] "); }
        if (full) { str.append ("ClsFre027[").append (getClsFre027 ()).append ("] "); }
        if (full) { str.append ("ClsFre028[").append (getClsFre028 ()).append ("] "); }
        if (full) { str.append ("ClsFre029[").append (getClsFre029 ()).append ("] "); }
        if (full) { str.append ("ClsFre030[").append (getClsFre030 ()).append ("] "); }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getTbl () != null) { str.append ("\n").append (indent).append ("Tbl: \n").append (getTbl ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysClsRefCfgImpl newEmptyInstance () { return (SysClsRefCfgImpl) newInstance (); }
    
    @Override public SysClsRefCfgImpl getCopy () {
        return (SysClsRefCfgImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (SysClsRefCfg _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysClsRefCfgImpl.baseUrl (); }
    public static String baseUrl () { return SysClsRefCfgImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysClsRefCfgImpl.baseUrl = baseUrl; } 

    @Override public List<SysClsRefCfgFields> getFields () { return Arrays.asList (SysClsRefCfgFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysClsRefCfgImpl
