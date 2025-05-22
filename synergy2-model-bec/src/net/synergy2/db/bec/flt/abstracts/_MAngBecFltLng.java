package net.synergy2.db.bec.flt.abstracts;

import java.sql.Timestamp;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.SModelSingletonHolder;
import net.synergy2.base.util.datas.StringUtil;
import net.synergy2.db.base.SLanguageModel;
import net.synergy2.db.bec.flt.AngBecFlt;
import net.synergy2.db.bec.flt.AngBecFltLng;
import net.synergy2.db.sys.AngLng;

import static net.synergy2.base.util.datas.Constant.makeConst;

public abstract class _MAngBecFltLng extends SLanguageModel {

    private static final String baseUrl = makeConst ("/rest/bec/flt/AngBecFltLng");

    private static class Singleton {
        private static final SModelSingletonHolder<AngBecFltLng> INSTANCE = new SModelSingletonHolder<> ("net.synergy2.db.bec.flt.AngBecFltLngImpl");
    }
    public static Class<? extends AngBecFltLng> runtimeClass () { return Singleton.INSTANCE.get (); }
    public static AngBecFltLng newInstance () { return Singleton.INSTANCE.newInstance (); }

    @Override
    public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        var setted = true;
        switch (fieldName) {
            case "BecFltDsc" -> setBecFltDsc ((String)value);
            case "LngUid" -> setLngUid ((long)value);
            case "RecUid" -> setRecUid ((long)value);
            case "RecVer" -> setRecVer ((int)value);
            case "Rsi" -> setRsi ((Long)value);
            case "Rsu" -> setRsu ((Long)value);
            case "Tsi" -> setTsi ((Timestamp)value);
            case "Tsu" -> setTsu ((Timestamp)value);
            case "Rec" -> setRec ((AngBecFlt) value); 
            case "Lng" -> setLng ((AngLng) value); 

            default -> setted = false;
        } // switch
        return settedSuper || setted;
    } // set

    private String becFltDsc = null;
    public String getBecFltDsc () { return getBecFltDsc (null); }
    public String getBecFltDsc (String defBecFltDsc) { return this.becFltDsc == null ? defBecFltDsc : this.becFltDsc; }
    public AngBecFltLng setBecFltDsc (String becFltDsc) { this.becFltDsc = becFltDsc == null ? null : becFltDsc.trim (); return (AngBecFltLng) this; }

    private long lngUid = 0;
    public long getLngUid () { return this.lngUid; }
    public AngBecFltLng setLngUid (long lngUid) { this.lngUid = lngUid; return (AngBecFltLng) this; }

    private long recUid = 0;
    public long getRecUid () { return this.recUid; }
    public AngBecFltLng setRecUid (long recUid) { this.recUid = recUid; return (AngBecFltLng) this; }

    @Override public int getRecVer () { return super.recVer; }
    @Override public AngBecFltLng setRecVer (int recVer) { super.recVer = recVer; return (AngBecFltLng) this; }

    private Long rsi = null;
    @Override public Long getRsi () { return getRsi (null); }
    @Override public Long getRsi (Long defRsi) { return this.rsi == null ? defRsi : this.rsi; }
    @Override public AngBecFltLng setRsi (Long rsi) { this.rsi = rsi; return (AngBecFltLng) this; }

    private Long rsu = null;
    @Override public Long getRsu () { return getRsu (null); }
    @Override public Long getRsu (Long defRsu) { return this.rsu == null ? defRsu : this.rsu; }
    @Override public AngBecFltLng setRsu (Long rsu) { this.rsu = rsu; return (AngBecFltLng) this; }

    private Timestamp tsi = null;
    @Override public Timestamp getTsi () { return getTsi (null); }
    @Override public Timestamp getTsi (Timestamp defTsi) { return this.tsi == null ? defTsi : this.tsi; }
    @Override public AngBecFltLng setTsi (Timestamp tsi) { this.tsi = tsi; return (AngBecFltLng) this; }

    private Timestamp tsu = null;
    @Override public Timestamp getTsu () { return getTsu (null); }
    @Override public Timestamp getTsu (Timestamp defTsu) { return this.tsu == null ? defTsu : this.tsu; }
    @Override public AngBecFltLng setTsu (Timestamp tsu) { this.tsu = tsu; return (AngBecFltLng) this; }


    private AngBecFlt _Rec = null;
    public AngBecFlt getRec () { return this._Rec; }
    public AngBecFltLng setRec (AngBecFlt obj) { this._Rec = obj; return (AngBecFltLng) this; }

    private AngLng _Lng = null;
    public AngLng getLng () { return this._Lng; }
    public AngBecFltLng setLng (AngLng obj) { this._Lng = obj; return (AngBecFltLng) this; }


    
    
    public AngBecFltLng getCopy () {
        var toReturn = (AngBecFltLng) newInstance ();
        toReturn.setBecFltDsc (getBecFltDsc ());
        toReturn.setLngUid (getLngUid ());
        toReturn.setRecUid (getRecUid ());
        toReturn.setRecVer (getRecVer ());
        toReturn.setRsi (getRsi ());
        toReturn.setRsu (getRsu ());
        toReturn.setTsi (getTsi ());
        toReturn.setTsu (getTsu ());

        return toReturn;
    } // getCopy
    
    public abstract boolean equals (AngBecFltLng other, boolean checkUid, boolean checkCommon);

    @Override
    public boolean equals (Object other) {
        if (other instanceof AngBecFltLng ) { return equals ((AngBecFltLng ) other, true, true); }
        return false;
    }

    protected boolean standardEquals (AngBecFltLng other, boolean checkUid, boolean checkCommon) {
        if (other == null) { return false; }
        if (checkUid) { if (!checkEquals (getLngUid (), other.getLngUid ())) { return false; } } 
        if (checkUid) { if (!checkEquals (getRecUid (), other.getRecUid ())) { return false; } } 
        if (!checkEquals (getBecFltDsc (), other.getBecFltDsc ())) { return false; }
        if (checkCommon) { if (!checkEquals (getRecVer (), other.getRecVer ())) { return false; } } 
        if (checkCommon) { if (!checkEquals (getRsi (), other.getRsi ())) { return false; } } 
        if (checkCommon) { if (!checkEquals (getRsu (), other.getRsu ())) { return false; } } 
        if (checkCommon) { if (!checkEquals (getTsi (), other.getTsi ())) { return false; } } 
        if (checkCommon) { if (!checkEquals (getTsu (), other.getTsu ())) { return false; } } 

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
            case "BecFltDsc" -> getBecFltDsc (); 
            case "Lng" -> getLng (); 
            case "LngUid" -> getLngUid (); 
            case "Rec" -> getRec (); 
            case "RecUid" -> getRecUid (); 
            case "RecVer" -> getRecVer (); 
            case "Rsi" -> getRsi (); 
            case "Rsu" -> getRsu (); 
            case "Tsi" -> getTsi (); 
            case "Tsu" -> getTsu (); 

            default -> null;
        }; // switch
    } // getByFieldName
    
    public static String baseUrl () { return _MAngBecFltLng.baseUrl; }




} // _MAngBecFltLng
