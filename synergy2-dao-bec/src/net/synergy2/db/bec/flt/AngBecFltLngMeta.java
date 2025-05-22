package net.synergy2.db.bec.flt;

import java.util.List;
import net.synergy2.base.types.SSingletonHolder;
import net.synergy2.base.util.datas.Constant;
import net.synergy2.db.base.field.IntegerField;
import net.synergy2.db.base.field.RefField;
import net.synergy2.db.base.field.RefFieldMatch;
import net.synergy2.db.base.field.RefInField;
import net.synergy2.db.base.field.StringField;
import net.synergy2.db.base.field.TimestampField;
import net.synergy2.db.base.field.UidField;
import net.synergy2.db.base.field.ValueField;
import net.synergy2.db.base.meta.Meta;
import net.synergy2.db.sys.AngLng;

public class AngBecFltLngMeta extends Meta<AngBecFltLng> {

    protected AngBecFltLngMeta () { super (); }

    private static class Singleton {
        private static final SSingletonHolder<AngBecFltLngMeta> runtime = new SSingletonHolder<> (AngBecFltLngMeta.class);
    }

    public static AngBecFltLngMeta get () { return Singleton.runtime.get (); }

    public static final String TABLE_NAME = Constant.makeConst ("AngBecFltLng");
    @Override public String tableName () { return TABLE_NAME; }

    private static final StringField<AngBecFltLng> BecFltDsc = new StringField<> ("BecFltDsc", TABLE_NAME, AngBecFltLng::getBecFltDsc, AngBecFltLng::setBecFltDsc);
    private static final UidField<AngBecFltLng> LngUid = new UidField<> ("LngUid", TABLE_NAME, AngBecFltLng::getLngUid, AngBecFltLng::setLngUid);
    private static final UidField<AngBecFltLng> RecUid = new UidField<> ("RecUid", TABLE_NAME, AngBecFltLng::getRecUid, AngBecFltLng::setRecUid);
    private static final IntegerField<AngBecFltLng> RecVer = new IntegerField<> ("RecVer", TABLE_NAME, AngBecFltLng::getRecVer, AngBecFltLng::setRecVer);
    private static final UidField<AngBecFltLng> Rsi = new UidField<> ("Rsi", TABLE_NAME, AngBecFltLng::getRsi, AngBecFltLng::setRsi);
    private static final UidField<AngBecFltLng> Rsu = new UidField<> ("Rsu", TABLE_NAME, AngBecFltLng::getRsu, AngBecFltLng::setRsu);
    private static final TimestampField<AngBecFltLng> Tsi = new TimestampField<> ("Tsi", TABLE_NAME, AngBecFltLng::getTsi, AngBecFltLng::setTsi);
    private static final TimestampField<AngBecFltLng> Tsu = new TimestampField<> ("Tsu", TABLE_NAME, AngBecFltLng::getTsu, AngBecFltLng::setTsu);


    private static final RefInField<AngBecFltLng, AngBecFlt> Rec = new RefInField<> ("Rec", AngBecFltLng::getRec, AngBecFltLng::setRec, "AngBecFlt", new RefFieldMatch ("RecUid", "Uid"));
    private static final RefInField<AngBecFltLng, AngLng> Lng = new RefInField<> ("Lng", AngBecFltLng::getLng, AngBecFltLng::setLng, "AngLng", new RefFieldMatch ("LngUid", "Uid"));

    @Override protected List<ValueField<?, AngBecFltLng>> originalValueFields () { return VALUE_FIELDS; }
    private static final List<ValueField<?, AngBecFltLng>> VALUE_FIELDS = List.of (
        BecFltDsc,
        LngUid,
        RecUid,
        RecVer,
        Rsi,
        Rsu,
        Tsi,
        Tsu
    );

    @Override protected List<RefField<AngBecFltLng, ?>> originalRefFields () { return REF_FIELDS; }
    private static final List<RefField<AngBecFltLng, ?>> REF_FIELDS = List.of (
        Rec,
        Lng
    );
}
