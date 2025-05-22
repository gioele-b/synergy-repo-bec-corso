package net.synergy2.db.sys.cal;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.sys.ety.AngEty;

public class CalEvtImpl extends CalEvt {

    protected CalEvtImpl () { super (); }

    public enum CalEvtFields implements ISField {
        Uid, EvtTypUid, EvtShtDsc, EvtLngDsc, EvtTss, EvtTse, EvtAllDay, EvtLoc, EvtLocLat, EvtLocLon, EvtSrcRef, EvtSrcUid, EvtManUid, EvtRefUid, EvtStsUid, EvtRep, EvtRepEvr, EvtRepEvrWek, EvtRepEnd, EvtRepEndNum, EvtRepEndDte, EtyUid, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, EvtTsk, EvtPrv, TimZonUid, EvtUtcTss, EvtUtcTse, TimZonEndUid;
    } // CalEvtFields
    
    private static String baseUrl = "/rest/sys/cal/CalEvt";


    @Override public String getModelClassName () { return "CalEvtImpl"; }




    
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
        if (full) { str.append ("EvtTypUid[").append (getEvtTypUid ()).append ("] "); }
        str.append ("EvtShtDsc[").append (getEvtShtDsc ()).append ("] ");
        if (full) { if (Objects.nonNull (getEvtLngDsc ())) { str.append ("EvtLngDsc[").append (getEvtLngDsc ()).append ("] "); } }
        if (full) { str.append ("EvtTss[").append (getEvtTss ()).append ("] "); }
        if (full) { str.append ("EvtTse[").append (getEvtTse ()).append ("] "); }
        if (full) { str.append ("EvtAllDay[").append (getEvtAllDay ()).append ("] "); }
        if (full) { if (Objects.nonNull (getEvtLoc ())) { str.append ("EvtLoc[").append (getEvtLoc ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEvtLocLat ())) { str.append ("EvtLocLat[").append (getEvtLocLat ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEvtLocLon ())) { str.append ("EvtLocLon[").append (getEvtLocLon ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEvtSrcRef ())) { str.append ("EvtSrcRef[").append (getEvtSrcRef ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEvtSrcUid ())) { str.append ("EvtSrcUid[").append (getEvtSrcUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEvtManUid ())) { str.append ("EvtManUid[").append (getEvtManUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEvtRefUid ())) { str.append ("EvtRefUid[").append (getEvtRefUid ()).append ("] "); } }
        if (full) { str.append ("EvtStsUid[").append (getEvtStsUid ()).append ("] "); }
        if (full) { if (Objects.nonNull (getEvtRep ())) { str.append ("EvtRep[").append (getEvtRep ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEvtRepEvr ())) { str.append ("EvtRepEvr[").append (getEvtRepEvr ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEvtRepEvrWek ())) { str.append ("EvtRepEvrWek[").append (getEvtRepEvrWek ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEvtRepEnd ())) { str.append ("EvtRepEnd[").append (getEvtRepEnd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEvtRepEndNum ())) { str.append ("EvtRepEndNum[").append (getEvtRepEndNum ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEvtRepEndDte ())) { str.append ("EvtRepEndDte[").append (getEvtRepEndDte ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEtyUid ())) { str.append ("EtyUid[").append (getEtyUid ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { str.append ("EvtTsk[").append (getEvtTsk ()).append ("] "); }
        if (full) { str.append ("EvtPrv[").append (getEvtPrv ()).append ("] "); }
        if (full) { if (Objects.nonNull (getTimZonUid ())) { str.append ("TimZonUid[").append (getTimZonUid ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEvtUtcTss ())) { str.append ("EvtUtcTss[").append (getEvtUtcTss ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getEvtUtcTse ())) { str.append ("EvtUtcTse[").append (getEvtUtcTse ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTimZonEndUid ())) { str.append ("TimZonEndUid[").append (getTimZonEndUid ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getEvtRepLst () != null) { str.append ("\n").append (indent).append ("EvtRepLst (").append (getEvtRepLst ().size ()).append ("):"); for (var model : getEvtRepLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getInvLst () != null) { str.append ("\n").append (indent).append ("InvLst (").append (getInvLst ().size ()).append ("):"); for (var model : getInvLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getPrpLst () != null) { str.append ("\n").append (indent).append ("PrpLst (").append (getPrpLst ().size ()).append ("):"); for (var model : getPrpLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getCalEvtCls () != null) { str.append ("\n").append (indent).append ("CalEvtCls : "); str.append ("\n").append (getCalEvtCls ().debug (full, true, indent + "    ")); } 
        if (getEvtTyp () != null) { str.append ("\n").append (indent).append ("EvtTyp: \n").append (getEvtTyp ().debug (full, true, indent + "    ")); }
        if (getEvtSrc () != null) { str.append ("\n").append (indent).append ("EvtSrc: \n").append (getEvtSrc ().debug (full, true, indent + "    ")); }
        if (getEvtMan () != null) { str.append ("\n").append (indent).append ("EvtMan: \n").append (getEvtMan ().debug (full, true, indent + "    ")); }
        if (getEvtOrg () != null) { str.append ("\n").append (indent).append ("EvtOrg: \n").append (getEvtOrg ().debug (full, true, indent + "    ")); }
        if (getEvtSts () != null) { str.append ("\n").append (indent).append ("EvtSts: \n").append (getEvtSts ().debug (full, true, indent + "    ")); }
        if (getEty () != null) { str.append ("\n").append (indent).append ("Ety: \n").append (getEty ().debug (full, true, indent + "    ")); }
        if (getTimZon () != null) { str.append ("\n").append (indent).append ("TimZon: \n").append (getTimZon ().debug (full, true, indent + "    ")); }
        if (getTimZonEnd () != null) { str.append ("\n").append (indent).append ("TimZonEnd: \n").append (getTimZonEnd ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public CalEvtImpl newEmptyInstance () { return (CalEvtImpl) newInstance (); }
    
    @Override public CalEvtImpl getCopy () {
        return (CalEvtImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (CalEvt _other, boolean checkUid, boolean checkCommon) {
        return super.standardEquals (_other,checkUid,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return CalEvtImpl.baseUrl (); }
    public static String baseUrl () { return CalEvtImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { CalEvtImpl.baseUrl = baseUrl; } 

    @Override public List<CalEvtFields> getFields () { return Arrays.asList (CalEvtFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // CalEvtImpl
