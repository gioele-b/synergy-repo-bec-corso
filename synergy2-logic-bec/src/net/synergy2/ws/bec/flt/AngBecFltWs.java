/*KEEP*/
package net.synergy2.ws.bec.flt;

import java.util.Map;
import net.synergy2.base.connections.SWriteCon;
import net.synergy2.base.context.ExecutionContext;
import net.synergy2.base.exceptions.SException;
import net.synergy2.db.bec.flt.AngBecFlt;
import net.synergy2.logic.bec.flt.BecFltLogic;
import net.synergy2.ws.bec.flt.abstracts._WAngBecFlt;

public class AngBecFltWs extends _WAngBecFlt {

    protected AngBecFltWs() {}

    public static AngBecFltWs get() {
        return _WAngBecFlt.get();
    }

    public AngBecFlt post(
        AngBecFlt toInsert,
        Map<String, Object> params,
        ExecutionContext context,
        SWriteCon wCon
    ) throws SException {
        super.checkCreatePermission(context, wCon);
        return BecFltLogic.get().insertFilter(toInsert, context, wCon);
    }

    public AngBecFlt updateAll(
        AngBecFlt toUpdate,
        Map<String, Object> params,
        ExecutionContext context,
        SWriteCon wCon
    ) throws SException {
        super.checkUpdatePermission(context, wCon);
        return BecFltLogic.get().updateFilter(toUpdate, context, wCon);
    }

    @Override
    public void delete(long uid, ExecutionContext context, SWriteCon wCon)
        throws SException {
        super.checkDeletePermission(context, wCon);
        super.delete(uid, context, wCon);
    }
}
