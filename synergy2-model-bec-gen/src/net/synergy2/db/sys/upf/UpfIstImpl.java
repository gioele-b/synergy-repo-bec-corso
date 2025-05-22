package net.synergy2.db.sys.upf;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.synergy2.base.exceptions.SQueryException;
import net.synergy2.base.types.ISField;

public class UpfIstImpl extends UpfIst {

    protected UpfIstImpl () { super (); }

    public enum UpfIstFields implements ISField {
        Uid, TblUid, RecUid, Int_01, Int_02, Int_03, Int_04, Int_05, Int_06, Int_07, Int_08, Int_09, Int_10, Int_11, Int_12, Int_13, Int_14, Int_15, Int_16, Int_17, Int_18, Int_19, Int_20, Flg_01, Flg_02, Flg_03, Flg_04, Flg_05, Flg_06, Flg_07, Flg_08, Flg_09, Flg_10, Flg_11, Flg_12, Flg_13, Flg_14, Flg_15, Flg_16, Flg_17, Flg_18, Flg_19, Flg_20, Tss_01, Tss_02, Tss_03, Tss_04, Tss_05, Tss_06, Tss_07, Tss_08, Tss_09, Tss_10, Tss_11, Tss_12, Tss_13, Tss_14, Tss_15, Tss_16, Tss_17, Tss_18, Tss_19, Tss_20, Str_01, Str_02, Str_03, Str_04, Str_05, Str_06, Str_07, Str_08, Str_09, Str_10, Str_11, Str_12, Str_13, Str_14, Str_15, Str_16, Str_17, Str_18, Str_19, Str_20, LogDel, Tsi, Tsu, Rsi, Rsu, Tsd, Rsd, Lst_01, Lst_02, Lst_03, Lst_04, Lst_05, Lst_06, Lst_07, Lst_08, Lst_09, Lst_10, Lst_11, Lst_12, Lst_13, Lst_14, Lst_15, Lst_16, Lst_17, Lst_18, Lst_19, Lst_20, Dec_01, Dec_02, Dec_03, Dec_04, Dec_05, Dec_06, Dec_07, Dec_08, Dec_09, Dec_10, Dec_11, Dec_12, Dec_13, Dec_14, Dec_15, Dec_16, Dec_17, Dec_18, Dec_19, Dec_20, Blb_01, Blb_02, Blb_03, Blb_04, Blb_05;
    } // UpfIstFields
    
    private static String baseUrl = "/rest/sys/upf/UpfIst";


    @Override public String getModelClassName () { return "UpfIstImpl"; }




    
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
        str.append ("TblUid[").append (getTblUid ()).append ("] ");
        str.append ("RecUid[").append (getRecUid ()).append ("] ");
        if (full) { if (Objects.nonNull (getInt_01 ())) { str.append ("Int_01[").append (getInt_01 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getInt_02 ())) { str.append ("Int_02[").append (getInt_02 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getInt_03 ())) { str.append ("Int_03[").append (getInt_03 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getInt_04 ())) { str.append ("Int_04[").append (getInt_04 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getInt_05 ())) { str.append ("Int_05[").append (getInt_05 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getInt_06 ())) { str.append ("Int_06[").append (getInt_06 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getInt_07 ())) { str.append ("Int_07[").append (getInt_07 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getInt_08 ())) { str.append ("Int_08[").append (getInt_08 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getInt_09 ())) { str.append ("Int_09[").append (getInt_09 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getInt_10 ())) { str.append ("Int_10[").append (getInt_10 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getInt_11 ())) { str.append ("Int_11[").append (getInt_11 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getInt_12 ())) { str.append ("Int_12[").append (getInt_12 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getInt_13 ())) { str.append ("Int_13[").append (getInt_13 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getInt_14 ())) { str.append ("Int_14[").append (getInt_14 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getInt_15 ())) { str.append ("Int_15[").append (getInt_15 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getInt_16 ())) { str.append ("Int_16[").append (getInt_16 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getInt_17 ())) { str.append ("Int_17[").append (getInt_17 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getInt_18 ())) { str.append ("Int_18[").append (getInt_18 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getInt_19 ())) { str.append ("Int_19[").append (getInt_19 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getInt_20 ())) { str.append ("Int_20[").append (getInt_20 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlg_01 ())) { str.append ("Flg_01[").append (getFlg_01 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlg_02 ())) { str.append ("Flg_02[").append (getFlg_02 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlg_03 ())) { str.append ("Flg_03[").append (getFlg_03 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlg_04 ())) { str.append ("Flg_04[").append (getFlg_04 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlg_05 ())) { str.append ("Flg_05[").append (getFlg_05 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlg_06 ())) { str.append ("Flg_06[").append (getFlg_06 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlg_07 ())) { str.append ("Flg_07[").append (getFlg_07 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlg_08 ())) { str.append ("Flg_08[").append (getFlg_08 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlg_09 ())) { str.append ("Flg_09[").append (getFlg_09 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlg_10 ())) { str.append ("Flg_10[").append (getFlg_10 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlg_11 ())) { str.append ("Flg_11[").append (getFlg_11 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlg_12 ())) { str.append ("Flg_12[").append (getFlg_12 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlg_13 ())) { str.append ("Flg_13[").append (getFlg_13 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlg_14 ())) { str.append ("Flg_14[").append (getFlg_14 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlg_15 ())) { str.append ("Flg_15[").append (getFlg_15 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlg_16 ())) { str.append ("Flg_16[").append (getFlg_16 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlg_17 ())) { str.append ("Flg_17[").append (getFlg_17 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlg_18 ())) { str.append ("Flg_18[").append (getFlg_18 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlg_19 ())) { str.append ("Flg_19[").append (getFlg_19 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getFlg_20 ())) { str.append ("Flg_20[").append (getFlg_20 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTss_01 ())) { str.append ("Tss_01[").append (getTss_01 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTss_02 ())) { str.append ("Tss_02[").append (getTss_02 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTss_03 ())) { str.append ("Tss_03[").append (getTss_03 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTss_04 ())) { str.append ("Tss_04[").append (getTss_04 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTss_05 ())) { str.append ("Tss_05[").append (getTss_05 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTss_06 ())) { str.append ("Tss_06[").append (getTss_06 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTss_07 ())) { str.append ("Tss_07[").append (getTss_07 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTss_08 ())) { str.append ("Tss_08[").append (getTss_08 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTss_09 ())) { str.append ("Tss_09[").append (getTss_09 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTss_10 ())) { str.append ("Tss_10[").append (getTss_10 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTss_11 ())) { str.append ("Tss_11[").append (getTss_11 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTss_12 ())) { str.append ("Tss_12[").append (getTss_12 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTss_13 ())) { str.append ("Tss_13[").append (getTss_13 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTss_14 ())) { str.append ("Tss_14[").append (getTss_14 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTss_15 ())) { str.append ("Tss_15[").append (getTss_15 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTss_16 ())) { str.append ("Tss_16[").append (getTss_16 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTss_17 ())) { str.append ("Tss_17[").append (getTss_17 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTss_18 ())) { str.append ("Tss_18[").append (getTss_18 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTss_19 ())) { str.append ("Tss_19[").append (getTss_19 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTss_20 ())) { str.append ("Tss_20[").append (getTss_20 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr_01 ())) { str.append ("Str_01[").append (getStr_01 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr_02 ())) { str.append ("Str_02[").append (getStr_02 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr_03 ())) { str.append ("Str_03[").append (getStr_03 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr_04 ())) { str.append ("Str_04[").append (getStr_04 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr_05 ())) { str.append ("Str_05[").append (getStr_05 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr_06 ())) { str.append ("Str_06[").append (getStr_06 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr_07 ())) { str.append ("Str_07[").append (getStr_07 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr_08 ())) { str.append ("Str_08[").append (getStr_08 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr_09 ())) { str.append ("Str_09[").append (getStr_09 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr_10 ())) { str.append ("Str_10[").append (getStr_10 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr_11 ())) { str.append ("Str_11[").append (getStr_11 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr_12 ())) { str.append ("Str_12[").append (getStr_12 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr_13 ())) { str.append ("Str_13[").append (getStr_13 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr_14 ())) { str.append ("Str_14[").append (getStr_14 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr_15 ())) { str.append ("Str_15[").append (getStr_15 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr_16 ())) { str.append ("Str_16[").append (getStr_16 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr_17 ())) { str.append ("Str_17[").append (getStr_17 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr_18 ())) { str.append ("Str_18[").append (getStr_18 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr_19 ())) { str.append ("Str_19[").append (getStr_19 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getStr_20 ())) { str.append ("Str_20[").append (getStr_20 ()).append ("] "); } }
        str.append ("LogDel[").append (getLogDel ()).append ("] ");
        if (full) { if (Objects.nonNull (getTsi ())) { str.append ("Tsi[").append (getTsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsu ())) { str.append ("Tsu[").append (getTsu ()).append ("] "); } }
        if (full) { str.append ("RecVer[").append (getRecVer ()).append ("] "); }
        if (full) { if (Objects.nonNull (getRsi ())) { str.append ("Rsi[").append (getRsi ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsu ())) { str.append ("Rsu[").append (getRsu ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getTsd ())) { str.append ("Tsd[").append (getTsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getRsd ())) { str.append ("Rsd[").append (getRsd ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLst_01 ())) { str.append ("Lst_01[").append (getLst_01 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLst_02 ())) { str.append ("Lst_02[").append (getLst_02 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLst_03 ())) { str.append ("Lst_03[").append (getLst_03 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLst_04 ())) { str.append ("Lst_04[").append (getLst_04 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLst_05 ())) { str.append ("Lst_05[").append (getLst_05 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLst_06 ())) { str.append ("Lst_06[").append (getLst_06 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLst_07 ())) { str.append ("Lst_07[").append (getLst_07 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLst_08 ())) { str.append ("Lst_08[").append (getLst_08 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLst_09 ())) { str.append ("Lst_09[").append (getLst_09 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLst_10 ())) { str.append ("Lst_10[").append (getLst_10 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLst_11 ())) { str.append ("Lst_11[").append (getLst_11 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLst_12 ())) { str.append ("Lst_12[").append (getLst_12 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLst_13 ())) { str.append ("Lst_13[").append (getLst_13 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLst_14 ())) { str.append ("Lst_14[").append (getLst_14 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLst_15 ())) { str.append ("Lst_15[").append (getLst_15 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLst_16 ())) { str.append ("Lst_16[").append (getLst_16 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLst_17 ())) { str.append ("Lst_17[").append (getLst_17 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLst_18 ())) { str.append ("Lst_18[").append (getLst_18 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLst_19 ())) { str.append ("Lst_19[").append (getLst_19 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getLst_20 ())) { str.append ("Lst_20[").append (getLst_20 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDec_01 ())) { str.append ("Dec_01[").append (getDec_01 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDec_02 ())) { str.append ("Dec_02[").append (getDec_02 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDec_03 ())) { str.append ("Dec_03[").append (getDec_03 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDec_04 ())) { str.append ("Dec_04[").append (getDec_04 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDec_05 ())) { str.append ("Dec_05[").append (getDec_05 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDec_06 ())) { str.append ("Dec_06[").append (getDec_06 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDec_07 ())) { str.append ("Dec_07[").append (getDec_07 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDec_08 ())) { str.append ("Dec_08[").append (getDec_08 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDec_09 ())) { str.append ("Dec_09[").append (getDec_09 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDec_10 ())) { str.append ("Dec_10[").append (getDec_10 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDec_11 ())) { str.append ("Dec_11[").append (getDec_11 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDec_12 ())) { str.append ("Dec_12[").append (getDec_12 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDec_13 ())) { str.append ("Dec_13[").append (getDec_13 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDec_14 ())) { str.append ("Dec_14[").append (getDec_14 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDec_15 ())) { str.append ("Dec_15[").append (getDec_15 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDec_16 ())) { str.append ("Dec_16[").append (getDec_16 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDec_17 ())) { str.append ("Dec_17[").append (getDec_17 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDec_18 ())) { str.append ("Dec_18[").append (getDec_18 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDec_19 ())) { str.append ("Dec_19[").append (getDec_19 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getDec_20 ())) { str.append ("Dec_20[").append (getDec_20 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getBlb_01 ())) { str.append ("Blb_01[").append (getBlb_01 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getBlb_02 ())) { str.append ("Blb_02[").append (getBlb_02 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getBlb_03 ())) { str.append ("Blb_03[").append (getBlb_03 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getBlb_04 ())) { str.append ("Blb_04[").append (getBlb_04 ()).append ("] "); } }
        if (full) { if (Objects.nonNull (getBlb_05 ())) { str.append ("Blb_05[").append (getBlb_05 ()).append ("] "); } }
        if (getUserFields () != null) {
            if (full) { str.append ("UserFields[").append (getUserFields ().debug (full, cascade)).append ("] "); } else { str.append ("with UserFields "); }
        } // if
        str.setLength (str.length () - 1);
        if (cascade) { str.append (debugCascade (full, indent + "    ")); }

        return str.append ("}").toString ();
    } // debug
    
    @Override public String debugCascade (boolean full, String indent) { 
        StringBuilder str = new StringBuilder ();
        if (getTbl () != null) { str.append ("\n").append (indent).append ("Tbl: \n").append (getTbl ().debug (full, true, indent + "    ")); }
        if (getRefLst_01 () != null) { str.append ("\n").append (indent).append ("RefLst_01: \n").append (getRefLst_01 ().debug (full, true, indent + "    ")); }
        if (getRefLst_02 () != null) { str.append ("\n").append (indent).append ("RefLst_02: \n").append (getRefLst_02 ().debug (full, true, indent + "    ")); }
        if (getRefLst_03 () != null) { str.append ("\n").append (indent).append ("RefLst_03: \n").append (getRefLst_03 ().debug (full, true, indent + "    ")); }
        if (getRefLst_04 () != null) { str.append ("\n").append (indent).append ("RefLst_04: \n").append (getRefLst_04 ().debug (full, true, indent + "    ")); }
        if (getRefLst_05 () != null) { str.append ("\n").append (indent).append ("RefLst_05: \n").append (getRefLst_05 ().debug (full, true, indent + "    ")); }
        if (getRefLst_06 () != null) { str.append ("\n").append (indent).append ("RefLst_06: \n").append (getRefLst_06 ().debug (full, true, indent + "    ")); }
        if (getRefLst_07 () != null) { str.append ("\n").append (indent).append ("RefLst_07: \n").append (getRefLst_07 ().debug (full, true, indent + "    ")); }
        if (getRefLst_08 () != null) { str.append ("\n").append (indent).append ("RefLst_08: \n").append (getRefLst_08 ().debug (full, true, indent + "    ")); }
        if (getRefLst_09 () != null) { str.append ("\n").append (indent).append ("RefLst_09: \n").append (getRefLst_09 ().debug (full, true, indent + "    ")); }
        if (getRefLst_10 () != null) { str.append ("\n").append (indent).append ("RefLst_10: \n").append (getRefLst_10 ().debug (full, true, indent + "    ")); }
        if (getRefLst_11 () != null) { str.append ("\n").append (indent).append ("RefLst_11: \n").append (getRefLst_11 ().debug (full, true, indent + "    ")); }
        if (getRefLst_12 () != null) { str.append ("\n").append (indent).append ("RefLst_12: \n").append (getRefLst_12 ().debug (full, true, indent + "    ")); }
        if (getRefLst_13 () != null) { str.append ("\n").append (indent).append ("RefLst_13: \n").append (getRefLst_13 ().debug (full, true, indent + "    ")); }
        if (getRefLst_14 () != null) { str.append ("\n").append (indent).append ("RefLst_14: \n").append (getRefLst_14 ().debug (full, true, indent + "    ")); }
        if (getRefLst_15 () != null) { str.append ("\n").append (indent).append ("RefLst_15: \n").append (getRefLst_15 ().debug (full, true, indent + "    ")); }
        if (getRefLst_16 () != null) { str.append ("\n").append (indent).append ("RefLst_16: \n").append (getRefLst_16 ().debug (full, true, indent + "    ")); }
        if (getRefLst_17 () != null) { str.append ("\n").append (indent).append ("RefLst_17: \n").append (getRefLst_17 ().debug (full, true, indent + "    ")); }
        if (getRefLst_18 () != null) { str.append ("\n").append (indent).append ("RefLst_18: \n").append (getRefLst_18 ().debug (full, true, indent + "    ")); }
        if (getRefLst_19 () != null) { str.append ("\n").append (indent).append ("RefLst_19: \n").append (getRefLst_19 ().debug (full, true, indent + "    ")); }
        if (getRefLst_20 () != null) { str.append ("\n").append (indent).append ("RefLst_20: \n").append (getRefLst_20 ().debug (full, true, indent + "    ")); }
        return str.toString (); 
    } // debugCascade
    
    @Override public String getOneStringId () { return "" + getUid (); }

    @Override public UpfIstImpl newEmptyInstance () { return (UpfIstImpl) newInstance (); }
    
    @Override public UpfIstImpl getCopy () {
        return (UpfIstImpl) super.getCopy ();
    } // getCopy
    
    public boolean equals (UpfIst _other, boolean checkUid, boolean checkCod, boolean checkCommon) {
        return super.standardEquals (_other,checkUid, checkCod,  checkCommon);
    } // equals
    
   /**
    * Ritorna se il record e' valido, cioe' non eliminato logicamente.
    * @return True se il record e' valido. False se non lo e'.
    */
    public boolean isValid () {
      return !getLogDel ();
    } // isValid
    
    @Override public String getBaseUrl () { return UpfIstImpl.baseUrl (); }
    public static String baseUrl () { return UpfIstImpl.baseUrl; }
    @Override public void setBaseUrl (String baseUrl) { UpfIstImpl.baseUrl = baseUrl; } 

    @Override public List<UpfIstFields> getFields () { return Arrays.asList (UpfIstFields.values ()); }

    @Override public Object getByFieldName (String fieldName) {
        return super.getByFieldName (fieldName);
    } // getByFieldName

} // UpfIstImpl
