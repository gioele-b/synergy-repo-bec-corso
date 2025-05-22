package net.synergy2.db.sys.ety;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngEtyAttVisImpl extends AngEtyAttVis {

    protected AngEtyAttVisImpl () { super (); }

    public enum AngEtyAttVisFields implements ISField {
        Uid, AttRefUid, GrpUid, ResUid, Tsi, Tsu, Rsi, Rsu;
    } // AngEtyAttVisFields
    
    private static String baseUrl = "/rest/sys/ety/AngEtyAttVis";


    @Override public String getModelClassName () { return "AngEtyAttVisImpl"; }




    
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
        str.append ("AttRefUid[").append (getAttRefUid ()).append ("] ");
        if (Objects.nonNull (getGrpUid ())) { str.append ("GrpUid[").append (getGrpUid ()).append ("] "); }
        if (Objects.nonNull (getResUid ())) { str.append ("ResUid[").append (getResUid ()).append ("] "); }
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
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        if (getGrp () != null) { str.append ("\n").append (indent).append ("Grp: \n").append (getGrp ().debug (full, true, indent + "    ")); }
        if (getAtt () != null) { str.append ("\n").append (indent).append ("Att: \n").append (getAtt ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngEtyAttVisImpl newEmptyInstance () { return (AngEtyAttVisImpl) newInstance (); }
    
    @Override public AngEtyAttVisImpl getCopy () {
        return (AngEtyAttVisImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngEtyAttVis _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return true;
    } // isValid
    
    @Override public String getBaseUrl () { return AngEtyAttVisImpl.baseUrl (); }
    public static String baseUrl () { return AngEtyAttVisImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngEtyAttVisImpl.baseUrl = baseUrl; } 

    @Override public List<AngEtyAttVisFields> getFields () { return Arrays.asList (AngEtyAttVisFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngEtyAttVisImpl
