package net.synergy2.db.sys.mnc;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class AngMobBotImpl extends AngMobBot {

    protected AngMobBotImpl () { super (); }

    public enum AngMobBotFields implements ISField {
        Uid, BotNam, BotDsc, BotTkn, BotEnb, LngUid, ResUid, BotMan, LgnTkn, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd;
    } // AngMobBotFields
    
    private static String baseUrl = "/rest/sys/mnc/AngMobBot";


    @Override public String getModelClassName () { return "AngMobBotImpl"; }




    
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
        str.append ("BotNam[").append (getBotNam ()).append ("] ");
        str.append ("BotDsc[").append (getBotDsc ()).append ("] ");
        if (full) { str.append ("BotTkn[").append (getBotTkn ()).append ("] "); }
        if (full) { str.append ("BotEnb[").append (getBotEnb ()).append ("] "); }
        if (full) { str.append ("LngUid[").append (getLngUid ()).append ("] "); }
        if (full) { str.append ("ResUid[").append (getResUid ()).append ("] "); }
        if (full) { str.append ("BotMan[").append (getBotMan ()).append ("] "); }
        if (full) { str.append ("LgnTkn[").append (getLgnTkn ()).append ("] "); }
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
        if (getPrmLst () != null) { str.append ("\n").append (indent).append ("PrmLst (").append (getPrmLst ().size ()).append ("):"); for (var model : getPrmLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getResCntLst () != null) { str.append ("\n").append (indent).append ("ResCntLst (").append (getResCntLst ().size ()).append ("):"); for (var model : getResCntLst ()) { str.append ("\n").append (model.debug (full, true, indent + "    ")); } }
        if (getRes () != null) { str.append ("\n").append (indent).append ("Res: \n").append (getRes ().debug (full, true, indent + "    ")); }
        if (getLng () != null) { str.append ("\n").append (indent).append ("Lng: \n").append (getLng ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public AngMobBotImpl newEmptyInstance () { return (AngMobBotImpl) newInstance (); }
    
    @Override public AngMobBotImpl getCopy () {
        return (AngMobBotImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (AngMobBot _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return AngMobBotImpl.baseUrl (); }
    public static String baseUrl () { return AngMobBotImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { AngMobBotImpl.baseUrl = baseUrl; } 

    @Override public List<AngMobBotFields> getFields () { return Arrays.asList (AngMobBotFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // AngMobBotImpl
