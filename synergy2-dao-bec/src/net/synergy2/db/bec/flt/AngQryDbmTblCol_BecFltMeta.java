package net.synergy2.db.bec.flt;

import java.util.List;
import net.synergy2.base.types.SSingletonHolder;
import net.synergy2.db.base.field.RefField;
import net.synergy2.db.base.field.RefFieldMatch;
import net.synergy2.db.base.field.RefListField;
import net.synergy2.db.base.field.ValueField;
import net.synergy2.db.base.meta.MetaExtension;
import net.synergy2.db.sys.qry.AngQryDbmTblColImpl;

public class AngQryDbmTblCol_BecFltMeta implements MetaExtension<AngQryDbmTblColImpl> {

    protected AngQryDbmTblCol_BecFltMeta () { }

    private static class Singleton {
        private static final SSingletonHolder<AngQryDbmTblCol_BecFltMeta> runtime = new SSingletonHolder<> (AngQryDbmTblCol_BecFltMeta.class);
    }

    public static AngQryDbmTblCol_BecFltMeta get () { return Singleton.runtime.get (); }


    private static final RefListField<AngQryDbmTblColImpl, AngBecFlt> BecFltLst = new RefListField<> ("BecFltLst", AngQryDbmTblColImpl::getBecFltLst, AngQryDbmTblColImpl::setBecFltLst, AngQryDbmTblColImpl::addBecFltLst, "AngBecFlt", new RefFieldMatch ("Uid", "QryDbmTblColUid"));


    @Override public List<ValueField<?, AngQryDbmTblColImpl>> valueFields () { return VALUE_FIELDS; }
    private static final List<ValueField<?, AngQryDbmTblColImpl>> VALUE_FIELDS = List.of (
    );

    @Override public List<RefField<AngQryDbmTblColImpl, ?>> refFields () { return REF_FIELDS; }
    private static final List<RefField<AngQryDbmTblColImpl, ?>> REF_FIELDS = List.of (
        BecFltLst
    );
}
