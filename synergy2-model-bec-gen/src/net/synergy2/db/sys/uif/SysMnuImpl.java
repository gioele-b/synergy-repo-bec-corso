package net.synergy2.db.sys.uif;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class SysMnuImpl extends SysMnu {

    protected SysMnuImpl () { super (); }

    public enum SysMnuFields implements ISField {
        Uid, MdlUid, Url, MnuDsc, MnuTyp, RefUid, MnuLvl, GrpUid, MnuIco, MnuEnb, MnuHid, SrtOrd, AppUid, MnuMov, MnuNew, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, MnuIns, MnuClr, GrdMod;
    } // SysMnuFields
    
    private static String baseUrl = "/rest/sys/uif/SysMnu";


    @Override public String getModelClassName () { return "SysMnuImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public SysMnuImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        if (full) { if (Objects.nonNull (getMdlUid ())) { str.append ("MdlUid[").append (getMdlUid ()).append ("] "); } }
        str.append ("Url[").append (getUrl ()).append ("] ");
        str.append ("MnuDsc[").append (getMnuDsc ()).append ("] ");
        if (full) { str.append ("MnuTyp[").append (getMnuTyp ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRefUid ())) { str.append ("RefUid[").append (getRefUid ()).append ("] "); } }
        if (full) { str.append ("MnuLvl[").append (getMnuLvl ()).append ("] "); }
        if (full) { if (Objects.nonNull (getGrpUid ())) { str.append ("GrpUid[").append (getGrpUid ()).append ("] "); } }
        if (full) { str.append ("MnuIco[").append (getMnuIco ()).append ("] "); }
        if (full) { str.append ("MnuEnb[").append (getMnuEnb ()).append ("] "); }
        if (full) { str.append ("MnuHid[").append (getMnuHid ()).append ("] "); }
        if (full) { str.append ("SrtOrd[").append (getSrtOrd ()).append ("] "); }
        if (full) { if (Objects.nonNull (getAppUid ())) { str.append ("AppUid[").append (getAppUid ()).append ("] "); } }
        if (full) { str.append ("MnuMov[").append (getMnuMov ()).append ("] "); }
        if (full) { str.append ("MnuNew[").append (getMnuNew ()).append ("] "); }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { str.append ("MnuIns[").append (getMnuIns ()).append ("] "); }
        if (full) { if (Objects.nonNull (getMnuClr ())) { str.append ("MnuClr[").append (getMnuClr ()).append ("] "); } }
        if (full) { str.append ("GrdMod[").append (getGrdMod ()).append ("] "); }
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
        if (getChdLst () != null) { str.append ("\n").append (indent).append ("ChdLst (").append (getChdLst ().size ()).append ("):"); for (var model : getChdLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getResFavLst () != null) { str.append ("\n").append (indent).append ("ResFavLst (").append (getResFavLst ().size ()).append ("):"); for (var model : getResFavLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getAppLst () != null) { str.append ("\n").append (indent).append ("AppLst (").append (getAppLst ().size ()).append ("):"); for (var model : getAppLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getMdl () != null) { str.append ("\n").append (indent).append ("Mdl: \n").append (getMdl ().debug (full, true, indent + "    ")); }
        if (getPrt () != null) { str.append ("\n").append (indent).append ("Prt: \n").append (getPrt ().debug (full, true, indent + "    ")); }
        if (getGrp () != null) { str.append ("\n").append (indent).append ("Grp: \n").append (getGrp ().debug (full, true, indent + "    ")); }
        if (getDefApp () != null) { str.append ("\n").append (indent).append ("DefApp: \n").append (getDefApp ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public SysMnuImpl newEmptyInstance () { return (SysMnuImpl) newInstance (); }
    
    @Override public SysMnuImpl getCopy () {
        var toReturn = (SysMnuImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (SysMnu _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return SysMnuImpl.baseUrl (); }
    public static String baseUrl () { return SysMnuImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { SysMnuImpl.baseUrl = baseUrl; } 

    @Override public List<SysMnuFields> getFields () { return Arrays.asList (SysMnuFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // SysMnuImpl
