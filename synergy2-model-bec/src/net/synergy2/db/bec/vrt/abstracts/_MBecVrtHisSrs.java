package net.synergy2.db.bec.vrt.abstracts;

import java.math.BigDecimal;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.SModelSingletonHolder;
import net.synergy2.base.util.datas.StringUtil;
import net.synergy2.db.base.SRemoteModel;
import net.synergy2.db.bec.vrt.BecVrtHisSrs;

import static net.synergy2.base.util.datas.Constant.makeConst;

public abstract class _MBecVrtHisSrs extends SRemoteModel {

    private static final String baseUrl = makeConst ("/rest/bec/vrt/BecVrtHisSrs");

    private static class Singleton {
        private static final SModelSingletonHolder<BecVrtHisSrs> INSTANCE = new SModelSingletonHolder<> ("net.synergy2.db.bec.vrt.BecVrtHisSrsImpl");
    }
    public static Class<? extends BecVrtHisSrs> runtimeClass () { return Singleton.INSTANCE.get (); }
    public static BecVrtHisSrs newInstance () { return Singleton.INSTANCE.newInstance (); }

    @Override
    public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        var setted = true;
        switch (fieldName) {
            case "CusCod" -> setCusCod ((String)value);
            case "CusDsc" -> setCusDsc ((String)value);
            case "ItmCod" -> setItmCod ((String)value);
            case "ItmDsc" -> setItmDsc ((String)value);
            case "Month" -> setMonth ((int)value);
            case "Qta" -> setQta ((BigDecimal)value);
            case "Uid" -> setUid ((long)value);

            default -> setted = false;
        } // switch
        return settedSuper || setted;
    } // set

    private String cusCod = "";
    public String getCusCod () { return getCusCod (null); }
    public String getCusCod (String defCusCod) { return this.cusCod == null ? defCusCod : this.cusCod; }
    public BecVrtHisSrs setCusCod (String cusCod) { this.cusCod = cusCod == null ? null : cusCod.trim (); return (BecVrtHisSrs) this; }

    private String cusDsc = "";
    public String getCusDsc () { return getCusDsc (null); }
    public String getCusDsc (String defCusDsc) { return this.cusDsc == null ? defCusDsc : this.cusDsc; }
    public BecVrtHisSrs setCusDsc (String cusDsc) { this.cusDsc = cusDsc == null ? null : cusDsc.trim (); return (BecVrtHisSrs) this; }

    private String itmCod = "";
    public String getItmCod () { return getItmCod (null); }
    public String getItmCod (String defItmCod) { return this.itmCod == null ? defItmCod : this.itmCod; }
    public BecVrtHisSrs setItmCod (String itmCod) { this.itmCod = itmCod == null ? null : itmCod.trim (); return (BecVrtHisSrs) this; }

    private String itmDsc = "";
    public String getItmDsc () { return getItmDsc (null); }
    public String getItmDsc (String defItmDsc) { return this.itmDsc == null ? defItmDsc : this.itmDsc; }
    public BecVrtHisSrs setItmDsc (String itmDsc) { this.itmDsc = itmDsc == null ? null : itmDsc.trim (); return (BecVrtHisSrs) this; }

    private int month = 0;
    public int getMonth () { return this.month; }
    public BecVrtHisSrs setMonth (int month) { this.month = month; return (BecVrtHisSrs) this; }

    private BigDecimal qta = new BigDecimal (0);
    public BigDecimal getQta () { return getQta (null); }
    public BigDecimal getQta (BigDecimal defQta) { return this.qta == null ? defQta : this.qta; }
    public BecVrtHisSrs setQta (BigDecimal qta) { this.qta = qta; return (BecVrtHisSrs) this; }

    private long uid = 0;
    public long getUid () { return this.uid; }
    public BecVrtHisSrs setUid (long uid) { this.uid = uid; return (BecVrtHisSrs) this; }



    
    
    public BecVrtHisSrs getCopy () {
        var toReturn = (BecVrtHisSrs) newInstance ();
        toReturn.setCusCod (getCusCod ());
        toReturn.setCusDsc (getCusDsc ());
        toReturn.setItmCod (getItmCod ());
        toReturn.setItmDsc (getItmDsc ());
        toReturn.setMonth (getMonth ());
        toReturn.setQta (getQta ());
        toReturn.setUid (getUid ());

        return toReturn;
    } // getCopy
    
    public abstract boolean equals (BecVrtHisSrs other, boolean checkUid, boolean checkCod, boolean checkCommon);

    @Override
    public boolean equals (Object other) {
        if (other instanceof BecVrtHisSrs ) { return equals ((BecVrtHisSrs ) other, true, true, true); }
        return false;
    }

    protected boolean standardEquals (BecVrtHisSrs other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        if (other == null) { return false; }
        if (checkUid) { if (!checkEquals (getUid (), other.getUid ())) { return false; } } 
        if (checkCod) { if (!checkEquals (getCusCod (), other.getCusCod ())) { return false; } } 
        if (checkCod) { if (!checkEquals (getItmCod (), other.getItmCod ())) { return false; } } 
        if (!checkEquals (getCusDsc (), other.getCusDsc ())) { return false; }
        if (!checkEquals (getItmDsc (), other.getItmDsc ())) { return false; }
        if (!checkEquals (getMonth (), other.getMonth ())) { return false; }
        if (!checkEquals (getQta (), other.getQta ())) { return false; }

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
            case "CusCod" -> getCusCod (); 
            case "CusDsc" -> getCusDsc (); 
            case "ItmCod" -> getItmCod (); 
            case "ItmDsc" -> getItmDsc (); 
            case "Month" -> getMonth (); 
            case "Qta" -> getQta (); 
            case "Uid" -> getUid (); 

            default -> null;
        }; // switch
    } // getByFieldName
    
    public static String baseUrl () { return _MBecVrtHisSrs.baseUrl; }




} // _MBecVrtHisSrs
