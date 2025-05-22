package net.synergy2.db.bec.flt;

import java.util.List;
import net.synergy2.db.base.meta.MetaExtension;
import net.synergy2.db.base.meta.MetaExtensionFactory;

public class BecFltMetaExtensionFactory implements MetaExtensionFactory {

    @Override public List<Class<? extends MetaExtension<?>>> getMetaExtensionClasses () {
        return List.of (
            AngLng_BecFltMeta.class,
            AngQryDbmTblCol_BecFltMeta.class
        );
    }

}