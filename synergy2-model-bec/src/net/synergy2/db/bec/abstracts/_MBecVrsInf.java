package net.synergy2.db.bec.abstracts;

import java.sql.Timestamp;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.SModelSingletonHolder;
import net.synergy2.base.util.datas.StringUtil;
import net.synergy2.db.base.SModel;
import net.synergy2.db.bec.BecVrsInf;

import static net.synergy2.base.util.datas.Constant.makeConst;

public abstract class _MBecVrsInf extends SModel {

    private static final String baseUrl = makeConst ("/rest/bec/BecVrsInf");

    private static class Singleton {
        private static final SModelSingletonHolder<BecVrsInf> INSTANCE = new SModelSingletonHolder<> ("net.synergy2.db.bec.BecVrsInfImpl");
    }
    public static Class<? extends BecVrsInf> runtimeClass () { return Singleton.INSTANCE.get (); }
    public static BecVrsInf newInstance () { return Singleton.INSTANCE.newInstance (); }

    @Override
    public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        var setted = true;
        switch (fieldName) {
            case "RecVer" -> setRecVer ((int)value);
            case "Rsi" -> setRsi ((Long)value);
            case "Rsu" -> setRsu ((Long)value);
            case "StpPlg" -> setStpPlg ((boolean)value);
            case "Tsi" -> setTsi ((Timestamp)value);
            case "Tsu" -> setTsu ((Timestamp)value);
            case "Uid" -> setUid ((long)value);
            case "VrsClr" -> setVrsClr ((String)value);
            case "VrsIco" -> setVrsIco ((String)value);
            case "VrsMaj" -> setVrsMaj ((int)value);
            case "VrsMin" -> setVrsMin ((int)value);
            case "VrsNam" -> setVrsNam ((String)value);
            case "VrsRel" -> setVrsRel ((int)value);

            default -> setted = false;
        } // switch
        return settedSuper || setted;
    } // set

    @Override public int getRecVer () { return super.recVer; }
    @Override public BecVrsInf setRecVer (int recVer) { super.recVer = recVer; return (BecVrsInf) this; }

    private Long rsi = null;
    @Override public Long getRsi () { return getRsi (null); }
    @Override public Long getRsi (Long defRsi) { return this.rsi == null ? defRsi : this.rsi; }
    @Override public BecVrsInf setRsi (Long rsi) { this.rsi = rsi; return (BecVrsInf) this; }

    private Long rsu = null;
    @Override public Long getRsu () { return getRsu (null); }
    @Override public Long getRsu (Long defRsu) { return this.rsu == null ? defRsu : this.rsu; }
    @Override public BecVrsInf setRsu (Long rsu) { this.rsu = rsu; return (BecVrsInf) this; }

    private boolean stpPlg = true;
    public boolean getStpPlg () { return this.stpPlg; }
    public BecVrsInf setStpPlg (boolean stpPlg) { this.stpPlg = stpPlg; return (BecVrsInf) this; }

    private Timestamp tsi = null;
    @Override public Timestamp getTsi () { return getTsi (null); }
    @Override public Timestamp getTsi (Timestamp defTsi) { return this.tsi == null ? defTsi : this.tsi; }
    @Override public BecVrsInf setTsi (Timestamp tsi) { this.tsi = tsi; return (BecVrsInf) this; }

    private Timestamp tsu = null;
    @Override public Timestamp getTsu () { return getTsu (null); }
    @Override public Timestamp getTsu (Timestamp defTsu) { return this.tsu == null ? defTsu : this.tsu; }
    @Override public BecVrsInf setTsu (Timestamp tsu) { this.tsu = tsu; return (BecVrsInf) this; }

    private long uid = 0;
    public long getUid () { return this.uid; }
    public BecVrsInf setUid (long uid) { this.uid = uid; return (BecVrsInf) this; }

    private String vrsClr = "#000";
    public String getVrsClr () { return getVrsClr (null); }
    public String getVrsClr (String defVrsClr) { return this.vrsClr == null ? defVrsClr : this.vrsClr; }
    public BecVrsInf setVrsClr (String vrsClr) { this.vrsClr = vrsClr == null ? null : vrsClr.trim (); return (BecVrsInf) this; }

    private String vrsIco = "mdi mdi-glass-cocktail";
    public String getVrsIco () { return getVrsIco (null); }
    public String getVrsIco (String defVrsIco) { return this.vrsIco == null ? defVrsIco : this.vrsIco; }
    public BecVrsInf setVrsIco (String vrsIco) { this.vrsIco = vrsIco == null ? null : vrsIco.trim (); return (BecVrsInf) this; }

    private int vrsMaj = 0;
    public int getVrsMaj () { return this.vrsMaj; }
    public BecVrsInf setVrsMaj (int vrsMaj) { this.vrsMaj = vrsMaj; return (BecVrsInf) this; }

    private int vrsMin = 0;
    public int getVrsMin () { return this.vrsMin; }
    public BecVrsInf setVrsMin (int vrsMin) { this.vrsMin = vrsMin; return (BecVrsInf) this; }

    private String vrsNam = "";
    public String getVrsNam () { return getVrsNam (null); }
    public String getVrsNam (String defVrsNam) { return this.vrsNam == null ? defVrsNam : this.vrsNam; }
    public BecVrsInf setVrsNam (String vrsNam) { this.vrsNam = vrsNam == null ? null : vrsNam.trim (); return (BecVrsInf) this; }

    private int vrsRel = 0;
    public int getVrsRel () { return this.vrsRel; }
    public BecVrsInf setVrsRel (int vrsRel) { this.vrsRel = vrsRel; return (BecVrsInf) this; }



    
    
    public BecVrsInf getCopy () {
        var toReturn = (BecVrsInf) newInstance ();
        toReturn.setRecVer (getRecVer ());
        toReturn.setRsi (getRsi ());
        toReturn.setRsu (getRsu ());
        toReturn.setStpPlg (getStpPlg ());
        toReturn.setTsi (getTsi ());
        toReturn.setTsu (getTsu ());
        toReturn.setUid (getUid ());
        toReturn.setVrsClr (getVrsClr ());
        toReturn.setVrsIco (getVrsIco ());
        toReturn.setVrsMaj (getVrsMaj ());
        toReturn.setVrsMin (getVrsMin ());
        toReturn.setVrsNam (getVrsNam ());
        toReturn.setVrsRel (getVrsRel ());

        return toReturn;
    } // getCopy
    
    public abstract boolean equals (BecVrsInf other, boolean checkUid, boolean checkCod, boolean checkCommon);

    @Override
    public boolean equals (Object other) {
        if (other instanceof BecVrsInf ) { return equals ((BecVrsInf ) other, true, true, true); }
        return false;
    }

    protected boolean standardEquals (BecVrsInf other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        if (other == null) { return false; }
        if (checkUid) { if (!checkEquals (getUid (), other.getUid ())) { return false; } } 
        if (checkCod) { if (!checkEquals (getVrsMaj (), other.getVrsMaj ())) { return false; } } 
        if (checkCod) { if (!checkEquals (getVrsMin (), other.getVrsMin ())) { return false; } } 
        if (checkCod) { if (!checkEquals (getVrsRel (), other.getVrsRel ())) { return false; } } 
        if (checkCommon) { if (!checkEquals (getRecVer (), other.getRecVer ())) { return false; } } 
        if (checkCommon) { if (!checkEquals (getRsi (), other.getRsi ())) { return false; } } 
        if (checkCommon) { if (!checkEquals (getRsu (), other.getRsu ())) { return false; } } 
        if (!checkEquals (getStpPlg (), other.getStpPlg ())) { return false; }
        if (checkCommon) { if (!checkEquals (getTsi (), other.getTsi ())) { return false; } } 
        if (checkCommon) { if (!checkEquals (getTsu (), other.getTsu ())) { return false; } } 
        if (!checkEquals (getVrsClr (), other.getVrsClr ())) { return false; }
        if (!checkEquals (getVrsIco (), other.getVrsIco ())) { return false; }
        if (!checkEquals (getVrsNam (), other.getVrsNam ())) { return false; }

        return true;
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public abstract boolean isValid ();

    @Override
    public Object getByFieldName (String fieldName) {
        if (StringUtil.isEmpty (fieldName)) { return null; }
        return switch (fieldName) {
            case "RecVer" -> getRecVer (); 
            case "Rsi" -> getRsi (); 
            case "Rsu" -> getRsu (); 
            case "StpPlg" -> getStpPlg (); 
            case "Tsi" -> getTsi (); 
            case "Tsu" -> getTsu (); 
            case "Uid" -> getUid (); 
            case "VrsClr" -> getVrsClr (); 
            case "VrsIco" -> getVrsIco (); 
            case "VrsMaj" -> getVrsMaj (); 
            case "VrsMin" -> getVrsMin (); 
            case "VrsNam" -> getVrsNam (); 
            case "VrsRel" -> getVrsRel (); 

            default -> null;
        }; // switch
    } // getByFieldName
    
    public static String baseUrl () { return _MBecVrsInf.baseUrl; }




} // _MBecVrsInf
