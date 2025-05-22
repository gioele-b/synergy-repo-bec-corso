package net.synergy2.db.sys.wks;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.dvz.wks.DvzWksChr;
import net.synergy2.db.dvz.wks.DvzWksChrImpl;
import net.synergy2.db.dvz.wks.DvzWksGnt;
import net.synergy2.db.dvz.wks.DvzWksGntImpl;
import net.synergy2.db.dvz.wks.DvzWksQry;
import net.synergy2.db.dvz.wks.DvzWksQryImpl;

public class SysWksWdgImpl extends SysWksWdg {

    protected SysWksWdgImpl () { super (); }

    public enum SysWksWdgFields implements ISField {
        Uid, WdgCod, WdgDsc, WksUid, WksWdgTypUid, QryUid, WksFltEvt, Tsi, Tsu, Rsi, Rsu, WdgRfs;
    } // SysWksWdgFields
    
    private static String baseUrl = "/rest/sys/wks/SysWksWdg";


    @Override public String getModelClassName () { return "SysWksWdgImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public SysWksWdgImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }



    private DvzWksQryImpl _DvzQry = null;
    public DvzWksQryImpl getDvzQry () { return this._DvzQry; }
    public SysWksWdgImpl setDvzQry (DvzWksQry obj) { this._DvzQry = (DvzWksQryImpl) obj; return this; }

    private DvzWksChrImpl _DvzChr = null;
    public DvzWksChrImpl getDvzChr () { return this._DvzChr; }
    public SysWksWdgImpl setDvzChr (DvzWksChr obj) { this._DvzChr = (DvzWksChrImpl) obj; return this; }

    private DvzWksGntImpl _DvzGnt = null;
    public DvzWksGntImpl getDvzGnt () { return this._DvzGnt; }
    public SysWksWdgImpl setDvzGnt (DvzWksGnt obj) { this._DvzGnt = (DvzWksGntImpl) obj; return this; }


    
    @Override public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        switch (fieldName) {
            case "DvzQry" -> setDvzQry ((DvzWksQryImpl) value); 
            case "DvzChr" -> setDvzChr ((DvzWksChrImpl) value); 
            case "DvzGnt" -> setDvzGnt ((DvzWksGntImpl) value); 

            default -> {
                if (!settedSuper) { throw new SQueryException ("No reference specification found for field [" + fieldName + "]."); }
            }
        } // switch
        return true;
    } // set
    
    @Override public String debug (boolean full, boolean cascade, String indent) {
        StringBuilder str = new StringBuilder (indent).append (getModelClassName ()).append (" = {");
        str.append ("Uid[").append (getUid ()).append ("] ");
        str.append ("WdgCod[").append (getWdgCod ()).append ("] ");
        str.append ("WdgDsc[").append (getWdgDsc ()).append ("] ");
        str.append ("WksUid[").append (getWksUid ()).append ("] ");
        if (full) { str.append ("WksWdgTypUid[").append (getWksWdgTypUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getQryUid ())) { str.append ("QryUid[").append (getQryUid ()).append ("] "); } }
        if (full) { str.append ("WksFltEvt[").append (getWksFltEvt ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { str.append ("WdgRfs[").append (getWdgRfs ()).append ("] "); }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getDvzQry () != null) { str.append ("\n").append (indent).append ("DvzQry : "); str.append ("\n").append (getDvzQry ().debug (full, true, indent + "    ")); } 
        if (getDvzChr () != null) { str.append ("\n").append (indent).append ("DvzChr : "); str.append ("\n").append (getDvzChr ().debug (full, true, indent + "    ")); } 
        if (getDvzGnt () != null) { str.append ("\n").append (indent).append ("DvzGnt : "); str.append ("\n").append (getDvzGnt ().debug (full, true, indent + "    ")); } 
        if (getLngLst () != null) { str.append ("\n").append (indent).append ("LngLst (").append (getLngLst ().size ()).append ("):"); for (var model : getLngLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getTabWdgLst () != null) { str.append ("\n").append (indent).append ("TabWdgLst (").append (getTabWdgLst ().size ()).append ("):"); for (var model : getTabWdgLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getBtnLst () != null) { str.append ("\n").append (indent).append ("BtnLst (").append (getBtnLst ().size ()).append ("):"); for (var model : getBtnLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWdgCfgLst () != null) { str.append ("\n").append (indent).append ("WdgCfgLst (").append (getWdgCfgLst ().size ()).append ("):"); for (var model : getWdgCfgLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getPrmLst () != null) { str.append ("\n").append (indent).append ("PrmLst (").append (getPrmLst ().size ()).append ("):"); for (var model : getPrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getFltLst () != null) { str.append ("\n").append (indent).append ("FltLst (").append (getFltLst ().size ()).append ("):"); for (var model : getFltLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getViwFltPrmLst () != null) { str.append ("\n").append (indent).append ("ViwFltPrmLst (").append (getViwFltPrmLst ().size ()).append ("):"); for (var model : getViwFltPrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getWks () != null) { str.append ("\n").append (indent).append ("Wks: \n").append (getWks ().debug (full, true, indent + "    ")); }
        if (getWdgTyp () != null) { str.append ("\n").append (indent).append ("WdgTyp: \n").append (getWdgTyp ().debug (full, true, indent + "    ")); }
        if (getQry () != null) { str.append ("\n").append (indent).append ("Qry: \n").append (getQry ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysWksWdgImpl newEmptyInstance () { return (SysWksWdgImpl) newInstance (); }
    
    @Override public SysWksWdgImpl getCopy () {
        var toReturn = (SysWksWdgImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (SysWksWdg _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return SysWksWdgImpl.baseUrl (); }
    public static String baseUrl () { return SysWksWdgImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysWksWdgImpl.baseUrl = baseUrl; } 

    @Override public List<SysWksWdgFields> getFields () { return Arrays.asList (SysWksWdgFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        var field = super.getByFieldName (fieldName);
        if (field != null) { return field; }
            return switch (fieldName) {
                case "DvzChr" -> getDvzChr (); 
                case "DvzGnt" -> getDvzGnt (); 
                case "DvzQry" -> getDvzQry (); 

            default -> null;
        }; // switch

    } // getByFieldName

} // SysWksWdgImpl
