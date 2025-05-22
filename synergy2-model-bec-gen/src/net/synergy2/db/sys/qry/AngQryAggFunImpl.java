package net.synergy2.db.sys.qry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;
import net.synergy2.db.dvz.wks.DvzWksChrAxy;
import net.synergy2.db.dvz.wks.DvzWksChrAxyImpl;
import net.synergy2.db.dvz.wks.DvzWksQryFmt;
import net.synergy2.db.dvz.wks.DvzWksQryFmtImpl;

public class AngQryAggFunImpl extends AngQryAggFun {

    protected AngQryAggFunImpl () { super (); }

    public enum AngQryAggFunFields implements ISField {
        Uid, AggCod, AggShtCod, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // AngQryAggFunFields
    
    private static String baseUrl = "/rest/sys/qry/AngQryAggFun";


    @Override public String getModelClassName () { return "AngQryAggFunImpl"; }



    private List<DvzWksQryFmt> _DvzQryFmtLst = null;
    public List<DvzWksQryFmt> getDvzQryFmtLst () { return this._DvzQryFmtLst; }
    public AngQryAggFun setDvzQryFmtLst (List<DvzWksQryFmt> obj) { this._DvzQryFmtLst = obj; return this; }
    public AngQryAggFun addDvzQryFmtLst (DvzWksQryFmt obj) {
        if (_DvzQryFmtLst == null) { _DvzQryFmtLst = new ArrayList<> (); }
        _DvzQryFmtLst.add (obj);
        return this;
    } // addDvzQryFmtLst

    private List<DvzWksChrAxy> _DvzChrAxyLst = null;
    public List<DvzWksChrAxy> getDvzChrAxyLst () { return this._DvzChrAxyLst; }
    public AngQryAggFun setDvzChrAxyLst (List<DvzWksChrAxy> obj) { this._DvzChrAxyLst = obj; return this; }
    public AngQryAggFun addDvzChrAxyLst (DvzWksChrAxy obj) {
        if (_DvzChrAxyLst == null) { _DvzChrAxyLst = new ArrayList<> (); }
        _DvzChrAxyLst.add (obj);
        return this;
    } // addDvzChrAxyLst


    
    @Override public boolean set (String fieldName, Object value) throws SQueryException {
        var settedSuper = super.set (fieldName, value);
        switch (fieldName) {
            case "DvzQryFmtLst" -> addDvzQryFmtLst ((DvzWksQryFmtImpl) value); 
            case "DvzChrAxyLst" -> addDvzChrAxyLst ((DvzWksChrAxyImpl) value); 

            default -> {
                if (!settedSuper) { throw new SQueryException ("No reference specification found for field [" + fieldName + "]."); }
            }
        } // switch
        return true;
    } // set
    
    @Override public String debug (boolean full, boolean cascade, String indent) {
        StringBuilder str = new StringBuilder (indent).append (getModelClassName ()).append (" = {");
        str.append ("Uid[").append (getUid ()).append ("] ");
        str.append ("AggCod[").append (getAggCod ()).append ("] ");
        if (full) { str.append ("AggShtCod[").append (getAggShtCod ()).append ("] "); }
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
        if (getDvzQryFmtLst () != null) { str.append ("\n").append (indent).append ("DvzQryFmtLst (").append (getDvzQryFmtLst ().size ()).append ("):"); for (var model : getDvzQryFmtLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getDvzChrAxyLst () != null) { str.append ("\n").append (indent).append ("DvzChrAxyLst (").append (getDvzChrAxyLst ().size ()).append ("):"); for (var model : getDvzChrAxyLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngQryAggFunImpl newEmptyInstance () { return (AngQryAggFunImpl) newInstance (); }
    
    @Override public AngQryAggFunImpl getCopy () {
        return (AngQryAggFunImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngQryAggFun _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngQryAggFunImpl.baseUrl (); }
    public static String baseUrl () { return AngQryAggFunImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngQryAggFunImpl.baseUrl = baseUrl; } 

    @Override public List<AngQryAggFunFields> getFields () { return Arrays.asList (AngQryAggFunFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        var field = super.getByFieldName (fieldName);
        if (field != null) { return field; }
            return switch (fieldName) {
                case "DvzChrAxyLst" -> getDvzChrAxyLst (); 
                case "DvzQryFmtLst" -> getDvzQryFmtLst (); 

            default -> null;
        }; // switch

    } // getByFieldName

} // AngQryAggFunImpl
