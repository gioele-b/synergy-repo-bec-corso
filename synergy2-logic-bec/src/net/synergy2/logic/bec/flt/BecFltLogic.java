/*KEEP*/
package net.synergy2.logic.bec.flt;

import java.util.List;
import net.synergy2.base.connections.SReadCon;
import net.synergy2.base.connections.SWriteCon;
import net.synergy2.base.context.ExecutionContext;
import net.synergy2.base.exceptions.SException;
import net.synergy2.base.types.SSingletonHolder;
import net.synergy2.base.util.datas.NumberUtil;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.bec.flt.AngBecFlt;
import net.synergy2.db.bec.flt.AngBecFltDao;
import net.synergy2.db.bec.flt.AngBecFltImpl.AngBecFltFields;
import net.synergy2.db.sys.qry.AngQryDbmTblCol;
import net.synergy2.db.sys.qry.AngQryDbmTblColDao;
import net.synergy2.logic.base.ExceptionLogic;
import net.synergy2.logic.sys.qry.ISysQryInjectedLogic;
import net.synergy2.query.SQuery;

public class BecFltLogic implements ISysQryInjectedLogic {

    protected BecFltLogic() {}

    private static class Singleton {

        private static final SSingletonHolder<BecFltLogic> INSTANCE =
            new SSingletonHolder<>(BecFltLogic.class);
    }

    public static BecFltLogic get() {
        return Singleton.INSTANCE.get();
    }

    public AngBecFlt insertFilter(
        AngBecFlt filter,
        ExecutionContext context,
        SWriteCon wCon
    ) throws SException {
        checkColumnValidity(filter, context, wCon);

        return AngBecFltDao.get().safeInsert(filter, context, wCon);
    }

    public AngBecFlt updateFilter(
        AngBecFlt filter,
        ExecutionContext context,
        SWriteCon wCon
    ) throws SException {
        var filterFromDb = AngBecFltDao.get()
            .getById(filter.getUid(), context, wCon);

        checkFilterColumnUnchanged(filter, filterFromDb, context, wCon);

        return AngBecFltDao.get().safeUpdateAll(filter, context, wCon);
    }

    protected void checkColumnValidity(
        AngBecFlt filter,
        ExecutionContext context,
        SWriteCon wCon
    ) throws SException {
        if (
            !AngQryDbmTblColDao.get()
                .isValid(filter.getQryDbmTblColUid(), context, wCon)
        ) {
            throw ExceptionLogic.error(
                BecFltMessage.becFltColNotValid,
                context,
                wCon
            );
        }
    }

    protected void checkFilterColumnUnchanged(
        AngBecFlt filter,
        AngBecFlt filterFromDb,
        ExecutionContext context,
        SWriteCon wCon
    ) throws SException {
        if (
            !NumberUtil.equalsLong(
                filter.getQryDbmTblColUid(),
                filterFromDb.getQryDbmTblColUid()
            )
        ) {
            throw ExceptionLogic.error(
                BecFltMessage.becFltColNotChanged,
                context,
                wCon
            );
        }
    }

    @Override
    public void onBeforeAngQryDbmTblColDelete(
        AngQryDbmTblCol qryCol,
        ExecutionContext context,
        SWriteCon wCon
    ) throws SException {
        var filters = getFiltersByColumn(qryCol.getUid(), context, wCon);
        if (!filters.isEmpty()) {
            throw ExceptionLogic.error(
                BecFltMessage.becFltColNotDeleted,
                context,
                wCon,
                filters.get(0).getBecFltCod()
            );
        }
    }

    protected List<AngBecFlt> getFiltersByColumn(
        long qryColUid,
        ExecutionContext context,
        SReadCon rCon
    ) throws SException {
        try (var s = SQuery.of(context, rCon)) {
            s.from(SAlias.AngBecFlt, "BecFlt", false);
            s
                .whereActive("BecFlt")
                .and()
                .whereEQ("BecFlt", AngBecFltFields.QryDbmTblColUid, qryColUid);
            s.execute();

            return s.readMergedValuesAndCast();
        }
    }
}
