package net.synergy2.ws.bec;

import java.util.Map;
import net.synergy2.base.connections.SWriteCon;
import net.synergy2.base.context.ExecutionContext;
import net.synergy2.base.exceptions.SException;
import net.synergy2.db.bec.BecVrsInf;
import net.synergy2.ws.bec.abstracts._WBecVrsInf;

public class BecVrsInfWs extends _WBecVrsInf {
    protected BecVrsInfWs () {}
    public static BecVrsInfWs get () { return _WBecVrsInf.get (); }
    
    public BecVrsInf post (BecVrsInf toInsert, Map<String, Object> params, ExecutionContext context, SWriteCon wCon) throws SException {
        super.checkCreatePermission (context, wCon);
        return super.post (toInsert, context, wCon);
    } // post

    public BecVrsInf updateAll (BecVrsInf toUpdate, Map<String, Object> params, ExecutionContext context, SWriteCon wCon) throws SException {
        super.checkUpdatePermission (context, wCon);
        return super.updateAll (toUpdate, context, wCon);
    } // updateAll

    @Override
    public void delete (long uid, ExecutionContext context, SWriteCon wCon) throws SException {
        super.checkDeletePermission (context, wCon);
        super.delete (uid, context, wCon);
    } // delete

} // BecVrsInfWs