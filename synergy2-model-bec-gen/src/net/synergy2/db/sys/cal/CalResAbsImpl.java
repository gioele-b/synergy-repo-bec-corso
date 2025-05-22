package net.synergy2.db.sys.cal;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class CalResAbsImpl extends CalResAbs {

    protected CalResAbsImpl () { super (); }

    public enum CalResAbsFields implements ISField {
        Uid, ResUid, DayUid, AbsDsc, TssStr, TssEnd, AbsTyp, AbsApp, AbsSrcRef, AbsSrcUid, EtyUid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // CalResAbsFields
    
    private static String baseUrl = "/rest/sys/cal/CalResAbs";


    @Override public String getModelClassName () { return "CalResAbsImpl"; }




    
    @Override public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        switch (fieldName) {
            case SAlias.ENTITY -> setEntity ((AngEty) value); 

            default -> {
                if (!settedSuper) { throw new SQueryException ("No reference specification found for field [" + fieldName + "]."); }
            }
        } // switch
        return true;
    } // set
    
    @Override public String debug (boolean full, boolean cascade, String indent) {
        StringBuilder str = new StringBuilder (indent).append (getModelClassName ()).append (" = {");
        str.append ("Uid[").append (getUid ()).append ("] ");
        str.append ("ResUid[").append (getResUid ()).append ("] ");
        str.append ("DayUid[").append (getDayUid ()).append ("] ");
        str.append ("AbsDsc[").append (getAbsDsc ()).append ("] ");
        str.append ("TssStr[").append (getTssStr ()).append ("] ");
        str.append ("TssEnd[").append (getTssEnd ()).append ("] ");
        if (full) { str.append ("AbsTyp[").append (getAbsTyp ()).append ("] "); }
        if (full) { str.append ("AbsApp[").append (getAbsApp ()).append ("] "); }
        if (full) { if (Objects.nonNull (getAbsSrcRef ())) { str.append ("AbsSrcRef[").append (getAbsSrcRef ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getAbsSrcUid ())) { str.append ("AbsSrcUid[").append (getAbsSrcUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
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
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        if (getDay () != null) { str.append ("\n").append (indent).append ("Day: \n").append (getDay ().debug (full, true, indent + "    ")); }
        if (getAbsSrc () != null) { str.append ("\n").append (indent).append ("AbsSrc: \n").append (getAbsSrc ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public CalResAbsImpl newEmptyInstance () { return (CalResAbsImpl) newInstance (); }
    
    @Override public CalResAbsImpl getCopy () {
        return (CalResAbsImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (CalResAbs _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return CalResAbsImpl.baseUrl (); }
    public static String baseUrl () { return CalResAbsImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { CalResAbsImpl.baseUrl = baseUrl; } 

    @Override public List<CalResAbsFields> getFields () { return Arrays.asList (CalResAbsFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // CalResAbsImpl
