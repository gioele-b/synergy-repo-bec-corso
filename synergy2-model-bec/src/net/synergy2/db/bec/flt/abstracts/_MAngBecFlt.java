package net.synergy2.db.bec.flt.abstracts;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.SModelSingletonHolder;
import net.synergy2.base.util.datas.StringUtil;
import net.synergy2.db.base.SModel;
import net.synergy2.db.base.types.IEntity;
import net.synergy2.db.bec.flt.AngBecFlt;
import net.synergy2.db.bec.flt.AngBecFltLng;
import net.synergy2.db.sys.ety.AngEty;
import net.synergy2.db.sys.qry.AngQryDbmTblCol;

import static net.synergy2.base.util.datas.Constant.makeConst;

public abstract class _MAngBecFlt extends SModel implements IEntity<AngBecFlt> {

    private static final String baseUrl = makeConst ("/rest/bec/flt/AngBecFlt");

    private static class Singleton {
        private static final SModelSingletonHolder<AngBecFlt> INSTANCE = new SModelSingletonHolder<> ("net.synergy2.db.bec.flt.AngBecFltImpl");
    }
    public static Class<? extends AngBecFlt> runtimeClass () { return Singleton.INSTANCE.get (); }
    public static AngBecFlt newInstance () { return Singleton.INSTANCE.newInstance (); }

    @Override
    public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        var setted = true;
        switch (fieldName) {
            case "BecFltCod" -> setBecFltCod ((String)value);
            case "BecFltDsc" -> setBecFltDsc ((String)value);
            case "EtyUid" -> setEtyUid ((Long)value);
            case "LogDel" -> setLogDel ((boolean)value);
            case "QryDbmTblColUid" -> setQryDbmTblColUid ((long)value);
            case "RecVer" -> setRecVer ((int)value);
            case "Rsd" -> setRsd ((Long)value);
            case "Rsi" -> setRsi ((Long)value);
            case "Rsu" -> setRsu ((Long)value);
            case "Tsd" -> setTsd ((Timestamp)value);
            case "Tsi" -> setTsi ((Timestamp)value);
            case "Tsu" -> setTsu ((Timestamp)value);
            case "Uid" -> setUid ((long)value);
            case "QryDbmTblCol" -> setQryDbmTblCol ((AngQryDbmTblCol) value); 
            case "LngLst" -> addLngLst ((AngBecFltLng) value); 
            case "LngRecVer" -> setLngRecVer ((int) value); 

            default -> setted = false;
        } // switch
        return settedSuper || setted;
    } // set

    private String becFltCod = "";
    public String getBecFltCod () { return getBecFltCod (null); }
    public String getBecFltCod (String defBecFltCod) { return this.becFltCod == null ? defBecFltCod : this.becFltCod; }
    public AngBecFlt setBecFltCod (String becFltCod) { this.becFltCod = becFltCod == null ? null : becFltCod.trim (); return (AngBecFlt) this; }

    private String becFltDsc = "";
    public String getBecFltDsc () { return getBecFltDsc (null); }
    public String getBecFltDsc (String defBecFltDsc) { return this.becFltDsc == null ? defBecFltDsc : this.becFltDsc; }
    public AngBecFlt setBecFltDsc (String becFltDsc) { this.becFltDsc = becFltDsc == null ? null : becFltDsc.trim (); return (AngBecFlt) this; }

    private Long etyUid = null;
    public Long getEtyUid () { return getEtyUid (null); }
    public Long getEtyUid (Long defEtyUid) { return this.etyUid == null ? defEtyUid : this.etyUid; }
    public AngBecFlt setEtyUid (Long etyUid) { this.etyUid = etyUid; return (AngBecFlt) this; }

    private boolean logDel = false;
    public boolean getLogDel () { return this.logDel; }
    public AngBecFlt setLogDel (boolean logDel) { this.logDel = logDel; return (AngBecFlt) this; }

    private long qryDbmTblColUid = 0;
    public long getQryDbmTblColUid () { return this.qryDbmTblColUid; }
    public AngBecFlt setQryDbmTblColUid (long qryDbmTblColUid) { this.qryDbmTblColUid = qryDbmTblColUid; return (AngBecFlt) this; }

    @Override public int getRecVer () { return super.recVer; }
    @Override public AngBecFlt setRecVer (int recVer) { super.recVer = recVer; return (AngBecFlt) this; }

    private Long rsd = null;
    public Long getRsd () { return getRsd (null); }
    public Long getRsd (Long defRsd) { return this.rsd == null ? defRsd : this.rsd; }
    public AngBecFlt setRsd (Long rsd) { this.rsd = rsd; return (AngBecFlt) this; }

    private Long rsi = null;
    @Override public Long getRsi () { return getRsi (null); }
    @Override public Long getRsi (Long defRsi) { return this.rsi == null ? defRsi : this.rsi; }
    @Override public AngBecFlt setRsi (Long rsi) { this.rsi = rsi; return (AngBecFlt) this; }

    private Long rsu = null;
    @Override public Long getRsu () { return getRsu (null); }
    @Override public Long getRsu (Long defRsu) { return this.rsu == null ? defRsu : this.rsu; }
    @Override public AngBecFlt setRsu (Long rsu) { this.rsu = rsu; return (AngBecFlt) this; }

    private Timestamp tsd = null;
    public Timestamp getTsd () { return getTsd (null); }
    public Timestamp getTsd (Timestamp defTsd) { return this.tsd == null ? defTsd : this.tsd; }
    public AngBecFlt setTsd (Timestamp tsd) { this.tsd = tsd; return (AngBecFlt) this; }

    private Timestamp tsi = null;
    @Override public Timestamp getTsi () { return getTsi (null); }
    @Override public Timestamp getTsi (Timestamp defTsi) { return this.tsi == null ? defTsi : this.tsi; }
    @Override public AngBecFlt setTsi (Timestamp tsi) { this.tsi = tsi; return (AngBecFlt) this; }

    private Timestamp tsu = null;
    @Override public Timestamp getTsu () { return getTsu (null); }
    @Override public Timestamp getTsu (Timestamp defTsu) { return this.tsu == null ? defTsu : this.tsu; }
    @Override public AngBecFlt setTsu (Timestamp tsu) { this.tsu = tsu; return (AngBecFlt) this; }

    private long uid = 0;
    public long getUid () { return this.uid; }
    public AngBecFlt setUid (long uid) { this.uid = uid; return (AngBecFlt) this; }


    private AngQryDbmTblCol _QryDbmTblCol = null;
    public AngQryDbmTblCol getQryDbmTblCol () { return this._QryDbmTblCol; }
    public AngBecFlt setQryDbmTblCol (AngQryDbmTblCol obj) { this._QryDbmTblCol = obj; return (AngBecFlt) this; }

    private List<AngBecFltLng> _LngLst = null;
    public List<AngBecFltLng> getLngLst () { return this._LngLst; }
    public AngBecFlt setLngLst (List<AngBecFltLng> obj) { this._LngLst = obj; return (AngBecFlt) this; }
    public AngBecFlt addLngLst (AngBecFltLng obj) {
        if (_LngLst == null) { _LngLst = new ArrayList<> (); }
        _LngLst.add (obj);
        return (AngBecFlt) this;
    } // addLngLst


    @Override public long getKeyValue () { return getUid (); }

    
    public AngBecFlt getCopy () {
        var toReturn = (AngBecFlt) newInstance ();
        toReturn.setBecFltCod (getBecFltCod ());
        toReturn.setBecFltDsc (getBecFltDsc ());
        toReturn.setEtyUid (getEtyUid ());
        toReturn.setLogDel (getLogDel ());
        toReturn.setQryDbmTblColUid (getQryDbmTblColUid ());
        toReturn.setRecVer (getRecVer ());
        toReturn.setRsd (getRsd ());
        toReturn.setRsi (getRsi ());
        toReturn.setRsu (getRsu ());
        toReturn.setTsd (getTsd ());
        toReturn.setTsi (getTsi ());
        toReturn.setTsu (getTsu ());
        toReturn.setUid (getUid ());
        toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;
    } // getCopy
    
    public abstract boolean equals (AngBecFlt other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon);

    @Override
    public boolean equals (Object other) {
        if (other instanceof AngBecFlt ) { return equals ((AngBecFlt ) other, true, true, true, true); }
        return false;
    }

    protected boolean standardEquals (AngBecFlt other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        if (other == null) { return false; }
        if (checkUid) { if (!checkEquals (getUid (), other.getUid ())) { return false; } } 
        if (checkCod) { if (!checkEquals (getBecFltCod (), other.getBecFltCod ())) { return false; } } 
        if (checkTra) { if (!checkEquals (getBecFltDsc (), other.getBecFltDsc ())) { return false; } } 
        if (!checkEquals (getEtyUid (), other.getEtyUid ())) { return false; }
        if (checkCommon) { if (!checkEquals (getLogDel (), other.getLogDel ())) { return false; } } 
        if (!checkEquals (getQryDbmTblColUid (), other.getQryDbmTblColUid ())) { return false; }
        if (checkCommon) { if (!checkEquals (getRecVer (), other.getRecVer ())) { return false; } } 
        if (checkCommon) { if (!checkEquals (getRsd (), other.getRsd ())) { return false; } } 
        if (checkCommon) { if (!checkEquals (getRsi (), other.getRsi ())) { return false; } } 
        if (checkCommon) { if (!checkEquals (getRsu (), other.getRsu ())) { return false; } } 
        if (checkCommon) { if (!checkEquals (getTsd (), other.getTsd ())) { return false; } } 
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
            case "BecFltCod" -> getBecFltCod (); 
            case "BecFltDsc" -> getBecFltDsc (); 
            case "EtyUid" -> getEtyUid (); 
            case "LngLst" -> getLngLst (); 
            case "LogDel" -> getLogDel (); 
            case "QryDbmTblCol" -> getQryDbmTblCol (); 
            case "QryDbmTblColUid" -> getQryDbmTblColUid (); 
            case "RecVer" -> getRecVer (); 
            case "Rsd" -> getRsd (); 
            case "Rsi" -> getRsi (); 
            case "Rsu" -> getRsu (); 
            case "Tsd" -> getTsd (); 
            case "Tsi" -> getTsi (); 
            case "Tsu" -> getTsu (); 
            case "Uid" -> getUid (); 
            case "LngRecVer" -> getLngRecVer (); 

            default -> null;
        }; // switch
    } // getByFieldName
    
    public static String baseUrl () { return _MAngBecFlt.baseUrl; }



    private AngEty entity = null;
    @Override
    public AngBecFlt setEntity (final AngEty entity) { this.entity = entity; return (AngBecFlt) this; }
    @Override
    public AngEty getEntity () { return entity; }


} // _MAngBecFlt
