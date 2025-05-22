package net.synergy2.db.bec.vrt;

import java.util.List;
import net.synergy2.base.types.SSingletonHolder;
import net.synergy2.base.util.datas.Constant;
import net.synergy2.db.base.field.BigDecimalField;
import net.synergy2.db.base.field.IntegerField;
import net.synergy2.db.base.field.RefField;
import net.synergy2.db.base.field.StringField;
import net.synergy2.db.base.field.UidField;
import net.synergy2.db.base.field.ValueField;
import net.synergy2.db.base.meta.Meta;

public class BecVrtHisSrsMeta extends Meta<BecVrtHisSrs> {

    protected BecVrtHisSrsMeta () { super (); }

    private static class Singleton {
        private static final SSingletonHolder<BecVrtHisSrsMeta> runtime = new SSingletonHolder<> (BecVrtHisSrsMeta.class);
    }

    public static BecVrtHisSrsMeta get () { return Singleton.runtime.get (); }

    public static final String TABLE_NAME = Constant.makeConst ("BecVrtHisSrs");
    @Override public String tableName () { return TABLE_NAME; }

    private static final StringField<BecVrtHisSrs> CusCod = new StringField<> ("CusCod", TABLE_NAME, BecVrtHisSrs::getCusCod, BecVrtHisSrs::setCusCod);
    private static final StringField<BecVrtHisSrs> CusDsc = new StringField<> ("CusDsc", TABLE_NAME, BecVrtHisSrs::getCusDsc, BecVrtHisSrs::setCusDsc);
    private static final StringField<BecVrtHisSrs> ItmCod = new StringField<> ("ItmCod", TABLE_NAME, BecVrtHisSrs::getItmCod, BecVrtHisSrs::setItmCod);
    private static final StringField<BecVrtHisSrs> ItmDsc = new StringField<> ("ItmDsc", TABLE_NAME, BecVrtHisSrs::getItmDsc, BecVrtHisSrs::setItmDsc);
    private static final IntegerField<BecVrtHisSrs> Month = new IntegerField<> ("Month", TABLE_NAME, BecVrtHisSrs::getMonth, BecVrtHisSrs::setMonth);
    private static final BigDecimalField<BecVrtHisSrs> Qta = new BigDecimalField<> ("Qta", TABLE_NAME, BecVrtHisSrs::getQta, BecVrtHisSrs::setQta);
    private static final UidField<BecVrtHisSrs> Uid = new UidField<> ("Uid", TABLE_NAME, BecVrtHisSrs::getUid, BecVrtHisSrs::setUid);



    @Override protected List<ValueField<?, BecVrtHisSrs>> originalValueFields () { return VALUE_FIELDS; }
    private static final List<ValueField<?, BecVrtHisSrs>> VALUE_FIELDS = List.of (
        CusCod,
        CusDsc,
        ItmCod,
        ItmDsc,
        Month,
        Qta,
        Uid
    );

    @Override protected List<RefField<BecVrtHisSrs, ?>> originalRefFields () { return REF_FIELDS; }
    private static final List<RefField<BecVrtHisSrs, ?>> REF_FIELDS = List.of (
    );
}
