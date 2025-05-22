package net.synergy2.ws.bec.vrt;

import java.util.Map;
import net.synergy2.base.connections.SWriteCon;
import net.synergy2.base.connections.SWriteRemCon;
import net.synergy2.base.context.ExecutionContext;
import net.synergy2.base.exceptions.SException;
import net.synergy2.db.bec.vrt.BecVrtHisSrs;
import net.synergy2.ws.bec.vrt.abstracts._WBecVrtHisSrs;

public class BecVrtHisSrsWs extends _WBecVrtHisSrs {
    protected BecVrtHisSrsWs () {}
    public static BecVrtHisSrsWs get () { return _WBecVrtHisSrs.get (); }
    
    public BecVrtHisSrs post (BecVrtHisSrs toInsert, Map<String, Object> params, ExecutionContext context, SWriteCon wCon, SWriteRemCon wrCon) throws SException {
        super.checkCreatePermission (context, wCon);
        return super.post (toInsert, context, wCon, wrCon);
    } // post

    public BecVrtHisSrs updateAll (BecVrtHisSrs toUpdate, Map<String, Object> params, ExecutionContext context, SWriteCon wCon, SWriteRemCon wrCon) throws SException {
        super.checkUpdatePermission (context, wCon);
        return super.updateAll (toUpdate, context, wCon, wrCon);
    } // updateAll

    @Override
    public void delete (long uid, ExecutionContext context, SWriteCon wCon, SWriteRemCon wrCon) throws SException {
        super.checkDeletePermission (context, wCon);
        super.delete (uid, context, wCon, wrCon);
    } // delete

} // BecVrtHisSrsWs