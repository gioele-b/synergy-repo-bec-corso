package net.synergy2.db.sys.wzd;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class DefWzdStpImpl extends DefWzdStp {

    protected DefWzdStpImpl () { super (); }

    public enum DefWzdStpFields implements ISField {
        Uid, RevUid, StpCod, StpDsc, StpAct, StpTyp, StpDrwInf, StpAnn, StpAnnDrwInf, Tsi, Tsu, Rsi, Rsu;
    } // DefWzdStpFields
    
    private static String baseUrl = "/rest/sys/wzd/DefWzdStp";


    @Override public String getModelClassName () { return "DefWzdStpImpl"; }

    public int getLngRecVer () { return this.lngRecVer; }
    public DefWzdStpImpl setLngRecVer (int lngRecVer) { this.lngRecVer = lngRecVer; return this; }




    
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
        str.append ("RevUid[").append (getRevUid ()).append ("] ");
        str.append ("StpCod[").append (getStpCod ()).append ("] ");
        if (Objects.nonNull (getStpDsc ())) { str.append ("StpDsc[").append (getStpDsc ()).append ("] "); }
        if (full) { str.append ("StpAct[").append (getStpAct ()).append ("] "); }
        if (full) { str.append ("StpTyp[").append (getStpTyp ()).append ("] "); }
        if (full) { str.append ("StpDrwInf[").append (getStpDrwInf ()).append ("] "); }
        if (full) { if (Objects.nonNull (getStpAnn ())) { str.append ("StpAnn[").append (getStpAnn ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStpAnnDrwInf ())) { str.append ("StpAnnDrwInf[").append (getStpAnnDrwInf ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
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
        if (getPrmLst () != null) { str.append ("\n").append (indent).append ("PrmLst (").append (getPrmLst ().size ()).append ("):"); for (var model : getPrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getOutLst () != null) { str.append ("\n").append (indent).append ("OutLst (").append (getOutLst ().size ()).append ("):"); for (var model : getOutLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getIncLst () != null) { str.append ("\n").append (indent).append ("IncLst (").append (getIncLst ().size ()).append ("):"); for (var model : getIncLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRev () != null) { str.append ("\n").append (indent).append ("Rev: \n").append (getRev ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public DefWzdStpImpl newEmptyInstance () { return (DefWzdStpImpl) newInstance (); }
    
    @Override public DefWzdStpImpl getCopy () {
        var toReturn = (DefWzdStpImpl) super.getCopy ();
                toReturn.setLngRecVer (getLngRecVer ());

        return toReturn;

    } // getCopy
    
    public boolean equals (DefWzdStp _other, boolean checkUid, boolean checkCod, boolean checkTra, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod, checkTra,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return DefWzdStpImpl.baseUrl (); }
    public static String baseUrl () { return DefWzdStpImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { DefWzdStpImpl.baseUrl = baseUrl; } 

    @Override public List<DefWzdStpFields> getFields () { return Arrays.asList (DefWzdStpFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // DefWzdStpImpl
