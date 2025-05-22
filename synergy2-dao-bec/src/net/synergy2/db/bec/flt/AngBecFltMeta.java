package net.synergy2.db.bec.flt;

import java.util.List;
import net.synergy2.base.types.SSingletonHolder;
import net.synergy2.base.util.datas.Constant;
import net.synergy2.db.base.field.BooleanField;
import net.synergy2.db.base.field.IntegerField;
import net.synergy2.db.base.field.RefField;
import net.synergy2.db.base.field.RefFieldMatch;
import net.synergy2.db.base.field.RefInField;
import net.synergy2.db.base.field.RefListField;
import net.synergy2.db.base.field.StringField;
import net.synergy2.db.base.field.TimestampField;
import net.synergy2.db.base.field.UidField;
import net.synergy2.db.base.field.ValueField;
import net.synergy2.db.base.meta.Meta;
import net.synergy2.db.sys.ety.AngEty;
import net.synergy2.db.sys.qry.AngQryDbmTblCol;

public class AngBecFltMeta extends Meta<AngBecFlt> {

    protected AngBecFltMeta () { super (); }

    private static class Singleton {
        private static final SSingletonHolder<AngBecFltMeta> runtime = new SSingletonHolder<> (AngBecFltMeta.class);
    }

    public static AngBecFltMeta get () { return Singleton.runtime.get (); }

    public static final String TABLE_NAME = Constant.makeConst ("AngBecFlt");
    @Override public String tableName () { return TABLE_NAME; }

    private static final StringField<AngBecFlt> BecFltCod = new StringField<> ("BecFltCod", TABLE_NAME, AngBecFlt::getBecFltCod, AngBecFlt::setBecFltCod);
    private static final StringField<AngBecFlt> BecFltDsc = new StringField<> ("BecFltDsc", TABLE_NAME, AngBecFlt::getBecFltDsc, AngBecFlt::setBecFltDsc);
    private static final UidField<AngBecFlt> EtyUid = new UidField<> ("EtyUid", TABLE_NAME, AngBecFlt::getEtyUid, AngBecFlt::setEtyUid);
    private static final BooleanField<AngBecFlt> LogDel = new BooleanField<> ("LogDel", TABLE_NAME, AngBecFlt::getLogDel, AngBecFlt::setLogDel);
    private static final UidField<AngBecFlt> QryDbmTblColUid = new UidField<> ("QryDbmTblColUid", TABLE_NAME, AngBecFlt::getQryDbmTblColUid, AngBecFlt::setQryDbmTblColUid);
    private static final IntegerField<AngBecFlt> RecVer = new IntegerField<> ("RecVer", TABLE_NAME, AngBecFlt::getRecVer, AngBecFlt::setRecVer);
    private static final UidField<AngBecFlt> Rsd = new UidField<> ("Rsd", TABLE_NAME, AngBecFlt::getRsd, AngBecFlt::setRsd);
    private static final UidField<AngBecFlt> Rsi = new UidField<> ("Rsi", TABLE_NAME, AngBecFlt::getRsi, AngBecFlt::setRsi);
    private static final UidField<AngBecFlt> Rsu = new UidField<> ("Rsu", TABLE_NAME, AngBecFlt::getRsu, AngBecFlt::setRsu);
    private static final TimestampField<AngBecFlt> Tsd = new TimestampField<> ("Tsd", TABLE_NAME, AngBecFlt::getTsd, AngBecFlt::setTsd);
    private static final TimestampField<AngBecFlt> Tsi = new TimestampField<> ("Tsi", TABLE_NAME, AngBecFlt::getTsi, AngBecFlt::setTsi);
    private static final TimestampField<AngBecFlt> Tsu = new TimestampField<> ("Tsu", TABLE_NAME, AngBecFlt::getTsu, AngBecFlt::setTsu);
    private static final UidField<AngBecFlt> Uid = new UidField<> ("Uid", TABLE_NAME, AngBecFlt::getUid, AngBecFlt::setUid);

    private static final RefListField<AngBecFlt, AngBecFltLng> LngLst = new RefListField<> ("LngLst", AngBecFlt::getLngLst, AngBecFlt::setLngLst, AngBecFlt::addLngLst, "AngBecFltLng", new RefFieldMatch ("Uid", "RecUid"));

    private static final RefInField<AngBecFlt, AngQryDbmTblCol> QryDbmTblCol = new RefInField<> ("QryDbmTblCol", AngBecFlt::getQryDbmTblCol, AngBecFlt::setQryDbmTblCol, "AngQryDbmTblCol", new RefFieldMatch ("QryDbmTblColUid", "Uid"));
    private static final RefInField<AngBecFlt, AngEty> Entity = new RefInField<> ("Entity", AngBecFlt::getEntity, AngBecFlt::setEntity, "AngEty", new RefFieldMatch ("EtyUid", "Uid"));

    @Override protected List<ValueField<?, AngBecFlt>> originalValueFields () { return VALUE_FIELDS; }
    private static final List<ValueField<?, AngBecFlt>> VALUE_FIELDS = List.of (
        BecFltCod,
        BecFltDsc,
        EtyUid,
        LogDel,
        QryDbmTblColUid,
        RecVer,
        Rsd,
        Rsi,
        Rsu,
        Tsd,
        Tsi,
        Tsu,
        Uid
    );

    @Override protected List<RefField<AngBecFlt, ?>> originalRefFields () { return REF_FIELDS; }
    private static final List<RefField<AngBecFlt, ?>> REF_FIELDS = List.of (
        Entity,
        LngLst,
        QryDbmTblCol
    );
}
