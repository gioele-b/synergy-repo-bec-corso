package net.synergy2.db.sys.cal;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class CalEvtClsImpl extends CalEvtCls {

    protected CalEvtClsImpl () { super (); }

    public enum CalEvtClsFields implements ISField {
        Uid, Cls001Uid, Cls002Uid, Cls003Uid, Cls004Uid, Cls005Uid, Cls006Uid, Cls007Uid, Cls008Uid, Cls009Uid, Cls010Uid, Cls011Uid, Cls012Uid, Cls013Uid, Cls014Uid, Cls015Uid, Cls016Uid, Cls017Uid, Cls018Uid, Cls019Uid, Cls020Uid, Cls021Uid, Cls022Uid, Cls023Uid, Cls024Uid, Cls025Uid, Cls026Uid, Cls027Uid, Cls028Uid, Cls029Uid, Cls030Uid, ClsFre001, ClsFre002, ClsFre003, ClsFre004, ClsFre005, ClsFre006, ClsFre007, ClsFre008, ClsFre009, ClsFre010, ClsFre011, ClsFre012, ClsFre013, ClsFre014, ClsFre015, ClsFre016, ClsFre017, ClsFre018, ClsFre019, ClsFre020, ClsFre021, ClsFre022, ClsFre023, ClsFre024, ClsFre025, ClsFre026, ClsFre027, ClsFre028, ClsFre029, ClsFre030, ClsMul001Uid, ClsMul002Uid, ClsMul003Uid, ClsMul004Uid, ClsMul005Uid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // CalEvtClsFields
    
    private static String baseUrl = "/rest/sys/cal/CalEvtCls";


    @Override public String getModelClassName () { return "CalEvtClsImpl"; }




    
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
        if (full) { if (Objects.nonNull (getCls001Uid ())) { str.append ("Cls001Uid[").append (getCls001Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls002Uid ())) { str.append ("Cls002Uid[").append (getCls002Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls003Uid ())) { str.append ("Cls003Uid[").append (getCls003Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls004Uid ())) { str.append ("Cls004Uid[").append (getCls004Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls005Uid ())) { str.append ("Cls005Uid[").append (getCls005Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls006Uid ())) { str.append ("Cls006Uid[").append (getCls006Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls007Uid ())) { str.append ("Cls007Uid[").append (getCls007Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls008Uid ())) { str.append ("Cls008Uid[").append (getCls008Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls009Uid ())) { str.append ("Cls009Uid[").append (getCls009Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls010Uid ())) { str.append ("Cls010Uid[").append (getCls010Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls011Uid ())) { str.append ("Cls011Uid[").append (getCls011Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls012Uid ())) { str.append ("Cls012Uid[").append (getCls012Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls013Uid ())) { str.append ("Cls013Uid[").append (getCls013Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls014Uid ())) { str.append ("Cls014Uid[").append (getCls014Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls015Uid ())) { str.append ("Cls015Uid[").append (getCls015Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls016Uid ())) { str.append ("Cls016Uid[").append (getCls016Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls017Uid ())) { str.append ("Cls017Uid[").append (getCls017Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls018Uid ())) { str.append ("Cls018Uid[").append (getCls018Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls019Uid ())) { str.append ("Cls019Uid[").append (getCls019Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls020Uid ())) { str.append ("Cls020Uid[").append (getCls020Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls021Uid ())) { str.append ("Cls021Uid[").append (getCls021Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls022Uid ())) { str.append ("Cls022Uid[").append (getCls022Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls023Uid ())) { str.append ("Cls023Uid[").append (getCls023Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls024Uid ())) { str.append ("Cls024Uid[").append (getCls024Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls025Uid ())) { str.append ("Cls025Uid[").append (getCls025Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls026Uid ())) { str.append ("Cls026Uid[").append (getCls026Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls027Uid ())) { str.append ("Cls027Uid[").append (getCls027Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls028Uid ())) { str.append ("Cls028Uid[").append (getCls028Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls029Uid ())) { str.append ("Cls029Uid[").append (getCls029Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getCls030Uid ())) { str.append ("Cls030Uid[").append (getCls030Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre001 ())) { str.append ("ClsFre001[").append (getClsFre001 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre002 ())) { str.append ("ClsFre002[").append (getClsFre002 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre003 ())) { str.append ("ClsFre003[").append (getClsFre003 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre004 ())) { str.append ("ClsFre004[").append (getClsFre004 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre005 ())) { str.append ("ClsFre005[").append (getClsFre005 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre006 ())) { str.append ("ClsFre006[").append (getClsFre006 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre007 ())) { str.append ("ClsFre007[").append (getClsFre007 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre008 ())) { str.append ("ClsFre008[").append (getClsFre008 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre009 ())) { str.append ("ClsFre009[").append (getClsFre009 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre010 ())) { str.append ("ClsFre010[").append (getClsFre010 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre011 ())) { str.append ("ClsFre011[").append (getClsFre011 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre012 ())) { str.append ("ClsFre012[").append (getClsFre012 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre013 ())) { str.append ("ClsFre013[").append (getClsFre013 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre014 ())) { str.append ("ClsFre014[").append (getClsFre014 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre015 ())) { str.append ("ClsFre015[").append (getClsFre015 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre016 ())) { str.append ("ClsFre016[").append (getClsFre016 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre017 ())) { str.append ("ClsFre017[").append (getClsFre017 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre018 ())) { str.append ("ClsFre018[").append (getClsFre018 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre019 ())) { str.append ("ClsFre019[").append (getClsFre019 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre020 ())) { str.append ("ClsFre020[").append (getClsFre020 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre021 ())) { str.append ("ClsFre021[").append (getClsFre021 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre022 ())) { str.append ("ClsFre022[").append (getClsFre022 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre023 ())) { str.append ("ClsFre023[").append (getClsFre023 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre024 ())) { str.append ("ClsFre024[").append (getClsFre024 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre025 ())) { str.append ("ClsFre025[").append (getClsFre025 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre026 ())) { str.append ("ClsFre026[").append (getClsFre026 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre027 ())) { str.append ("ClsFre027[").append (getClsFre027 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre028 ())) { str.append ("ClsFre028[").append (getClsFre028 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre029 ())) { str.append ("ClsFre029[").append (getClsFre029 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsFre030 ())) { str.append ("ClsFre030[").append (getClsFre030 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsMul001Uid ())) { str.append ("ClsMul001Uid[").append (getClsMul001Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsMul002Uid ())) { str.append ("ClsMul002Uid[").append (getClsMul002Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsMul003Uid ())) { str.append ("ClsMul003Uid[").append (getClsMul003Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsMul004Uid ())) { str.append ("ClsMul004Uid[").append (getClsMul004Uid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getClsMul005Uid ())) { str.append ("ClsMul005Uid[").append (getClsMul005Uid ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getCalEvt () != null) { str.append ("\n").append (indent).append ("CalEvt: \n").append (getCalEvt ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt001 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt001: \n").append (getClsCalEvt001 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt002 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt002: \n").append (getClsCalEvt002 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt003 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt003: \n").append (getClsCalEvt003 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt004 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt004: \n").append (getClsCalEvt004 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt005 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt005: \n").append (getClsCalEvt005 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt006 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt006: \n").append (getClsCalEvt006 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt007 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt007: \n").append (getClsCalEvt007 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt008 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt008: \n").append (getClsCalEvt008 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt009 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt009: \n").append (getClsCalEvt009 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt010 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt010: \n").append (getClsCalEvt010 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt011 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt011: \n").append (getClsCalEvt011 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt012 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt012: \n").append (getClsCalEvt012 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt013 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt013: \n").append (getClsCalEvt013 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt014 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt014: \n").append (getClsCalEvt014 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt015 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt015: \n").append (getClsCalEvt015 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt016 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt016: \n").append (getClsCalEvt016 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt017 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt017: \n").append (getClsCalEvt017 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt018 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt018: \n").append (getClsCalEvt018 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt019 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt019: \n").append (getClsCalEvt019 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt020 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt020: \n").append (getClsCalEvt020 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt021 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt021: \n").append (getClsCalEvt021 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt022 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt022: \n").append (getClsCalEvt022 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt023 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt023: \n").append (getClsCalEvt023 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt024 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt024: \n").append (getClsCalEvt024 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt025 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt025: \n").append (getClsCalEvt025 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt026 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt026: \n").append (getClsCalEvt026 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt027 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt027: \n").append (getClsCalEvt027 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt028 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt028: \n").append (getClsCalEvt028 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt029 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt029: \n").append (getClsCalEvt029 ().debug (full, true, indent + "    ")); }
        if (getClsCalEvt030 () != null) { str.append ("\n").append (indent).append ("ClsCalEvt030: \n").append (getClsCalEvt030 ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public CalEvtClsImpl newEmptyInstance () { return (CalEvtClsImpl) newInstance (); }
    
    @Override public CalEvtClsImpl getCopy () {
        return (CalEvtClsImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (CalEvtCls _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return CalEvtClsImpl.baseUrl (); }
    public static String baseUrl () { return CalEvtClsImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { CalEvtClsImpl.baseUrl = baseUrl; } 

    @Override public List<CalEvtClsFields> getFields () { return Arrays.asList (CalEvtClsFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // CalEvtClsImpl
