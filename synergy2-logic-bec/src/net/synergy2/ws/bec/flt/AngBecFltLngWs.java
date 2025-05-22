package net.synergy2.ws.bec.flt;

import java.util.Map;
import net.synergy2.base.connections.SWriteCon;
import net.synergy2.base.context.ExecutionContext;
import net.synergy2.base.exceptions.SException;
import net.synergy2.db.bec.flt.AngBecFltLng;
import net.synergy2.ws.bec.flt.abstracts._WAngBecFltLng;

public class AngBecFltLngWs extends _WAngBecFltLng {
    protected AngBecFltLngWs () {}
    public static AngBecFltLngWs get () { return _WAngBecFltLng.get (); }
    
    public AngBecFltLng post (AngBecFltLng toInsert, Map<String, Object> params, ExecutionContext context, SWriteCon wCon) throws SException {
        super.checkCreatePermission (context, wCon);
        return super.post (toInsert, context, wCon);
    } // post

    public AngBecFltLng updateAll (AngBecFltLng toUpdate, Map<String, Object> params, ExecutionContext context, SWriteCon wCon) throws SException {
        super.checkUpdatePermission (context, wCon);
        return super.updateAll (toUpdate, context, wCon);
    } // updateAll

    @Override
    public void delete (long recUid, long lngUid, ExecutionContext context, SWriteCon wCon) throws SException {
        super.checkDeletePermission (context, wCon);
        super.delete (recUid, lngUid, context, wCon);
    } // delete

} // AngBecFltLngWs