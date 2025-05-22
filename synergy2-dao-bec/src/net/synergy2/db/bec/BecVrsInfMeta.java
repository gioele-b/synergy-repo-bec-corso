package net.synergy2.db.bec;

import java.util.List;
import net.synergy2.base.types.SSingletonHolder;
import net.synergy2.base.util.datas.Constant;
import net.synergy2.db.base.field.BooleanField;
import net.synergy2.db.base.field.IntegerField;
import net.synergy2.db.base.field.RefField;
import net.synergy2.db.base.field.StringField;
import net.synergy2.db.base.field.TimestampField;
import net.synergy2.db.base.field.UidField;
import net.synergy2.db.base.field.ValueField;
import net.synergy2.db.base.meta.Meta;

public class BecVrsInfMeta extends Meta<BecVrsInf> {

    protected BecVrsInfMeta () { super (); }

    private static class Singleton {
        private static final SSingletonHolder<BecVrsInfMeta> runtime = new SSingletonHolder<> (BecVrsInfMeta.class);
    }

    public static BecVrsInfMeta get () { return Singleton.runtime.get (); }

    public static final String TABLE_NAME = Constant.makeConst ("BecVrsInf");
    @Override public String tableName () { return TABLE_NAME; }

    private static final IntegerField<BecVrsInf> RecVer = new IntegerField<> ("RecVer", TABLE_NAME, BecVrsInf::getRecVer, BecVrsInf::setRecVer);
    private static final UidField<BecVrsInf> Rsi = new UidField<> ("Rsi", TABLE_NAME, BecVrsInf::getRsi, BecVrsInf::setRsi);
    private static final UidField<BecVrsInf> Rsu = new UidField<> ("Rsu", TABLE_NAME, BecVrsInf::getRsu, BecVrsInf::setRsu);
    private static final BooleanField<BecVrsInf> StpPlg = new BooleanField<> ("StpPlg", TABLE_NAME, BecVrsInf::getStpPlg, BecVrsInf::setStpPlg);
    private static final TimestampField<BecVrsInf> Tsi = new TimestampField<> ("Tsi", TABLE_NAME, BecVrsInf::getTsi, BecVrsInf::setTsi);
    private static final TimestampField<BecVrsInf> Tsu = new TimestampField<> ("Tsu", TABLE_NAME, BecVrsInf::getTsu, BecVrsInf::setTsu);
    private static final UidField<BecVrsInf> Uid = new UidField<> ("Uid", TABLE_NAME, BecVrsInf::getUid, BecVrsInf::setUid);
    private static final StringField<BecVrsInf> VrsClr = new StringField<> ("VrsClr", TABLE_NAME, BecVrsInf::getVrsClr, BecVrsInf::setVrsClr);
    private static final StringField<BecVrsInf> VrsIco = new StringField<> ("VrsIco", TABLE_NAME, BecVrsInf::getVrsIco, BecVrsInf::setVrsIco);
    private static final IntegerField<BecVrsInf> VrsMaj = new IntegerField<> ("VrsMaj", TABLE_NAME, BecVrsInf::getVrsMaj, BecVrsInf::setVrsMaj);
    private static final IntegerField<BecVrsInf> VrsMin = new IntegerField<> ("VrsMin", TABLE_NAME, BecVrsInf::getVrsMin, BecVrsInf::setVrsMin);
    private static final StringField<BecVrsInf> VrsNam = new StringField<> ("VrsNam", TABLE_NAME, BecVrsInf::getVrsNam, BecVrsInf::setVrsNam);
    private static final IntegerField<BecVrsInf> VrsRel = new IntegerField<> ("VrsRel", TABLE_NAME, BecVrsInf::getVrsRel, BecVrsInf::setVrsRel);



    @Override protected List<ValueField<?, BecVrsInf>> originalValueFields () { return VALUE_FIELDS; }
    private static final List<ValueField<?, BecVrsInf>> VALUE_FIELDS = List.of (
        RecVer,
        Rsi,
        Rsu,
        StpPlg,
        Tsi,
        Tsu,
        Uid,
        VrsClr,
        VrsIco,
        VrsMaj,
        VrsMin,
        VrsNam,
        VrsRel
    );

    @Override protected List<RefField<BecVrsInf, ?>> originalRefFields () { return REF_FIELDS; }
    private static final List<RefField<BecVrsInf, ?>> REF_FIELDS = List.of (
    );
}
