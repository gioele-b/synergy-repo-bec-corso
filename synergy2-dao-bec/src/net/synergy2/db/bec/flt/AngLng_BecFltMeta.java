package net.synergy2.db.bec.flt;

import java.util.List;
import net.synergy2.base.types.SSingletonHolder;
import net.synergy2.db.base.field.RefField;
import net.synergy2.db.base.field.RefFieldMatch;
import net.synergy2.db.base.field.RefListField;
import net.synergy2.db.base.field.ValueField;
import net.synergy2.db.base.meta.MetaExtension;
import net.synergy2.db.sys.AngLngImpl;

public class AngLng_BecFltMeta implements MetaExtension<AngLngImpl> {

    protected AngLng_BecFltMeta () { }

    private static class Singleton {
        private static final SSingletonHolder<AngLng_BecFltMeta> runtime = new SSingletonHolder<> (AngLng_BecFltMeta.class);
    }

    public static AngLng_BecFltMeta get () { return Singleton.runtime.get (); }


    private static final RefListField<AngLngImpl, AngBecFltLng> AngBecFltLst = new RefListField<> ("AngBecFltLst", AngLngImpl::getAngBecFltLst, AngLngImpl::setAngBecFltLst, AngLngImpl::addAngBecFltLst, "AngBecFltLng", new RefFieldMatch ("Uid", "LngUid"));


    @Override public List<ValueField<?, AngLngImpl>> valueFields () { return VALUE_FIELDS; }
    private static final List<ValueField<?, AngLngImpl>> VALUE_FIELDS = List.of (
    );

    @Override public List<RefField<AngLngImpl, ?>> refFields () { return REF_FIELDS; }
    private static final List<RefField<AngLngImpl, ?>> REF_FIELDS = List.of (
        AngBecFltLst
    );
}
