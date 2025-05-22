package net.synergy2.ws.bec.flt.abstracts;

import java.util.List;
import net.synergy2.base.connections.SReadCon;
import net.synergy2.base.connections.SWriteCon;
import net.synergy2.base.context.ExecutionContext;
import net.synergy2.base.exceptions.SException;
import net.synergy2.base.types.SSingletonHolder;
import net.synergy2.db.bec.flt.AngBecFltLng;
import net.synergy2.db.bec.flt.AngBecFltLngDao;
import net.synergy2.query.SQuery;
import net.synergy2.ws.base.SWs;
import net.synergy2.ws.bec.flt.AngBecFltLngWs;

public abstract class _WAngBecFltLng extends SWs {
    private static class Singleton {
        private static final SSingletonHolder<AngBecFltLngWs> runtime = new SSingletonHolder<> (AngBecFltLngWs.class);
    }
    public static AngBecFltLngWs get () {
        return Singleton.runtime.get ();
    } // get

    protected AngBecFltLngDao getDao () { return AngBecFltLngDao.get (); }

    @Override
    protected String getTableName () { return "AngBecFltLng"; }

    public boolean isValid (long recUid, long lngUid, ExecutionContext context, SReadCon rCon) throws SException {
      return getDao ().isValid (recUid, lngUid, context, rCon);
    } // isValid



/************************************************************************************/
/**  SINGLE GETS  *******************************************************************/
/************************************************************************************/


    public AngBecFltLng getById (long recUid, long lngUid, ExecutionContext context, SReadCon rCon) throws SException {
      return getById (recUid, lngUid, false, false, context, rCon);
    } // getById

    public AngBecFltLng getById (long recUid, long lngUid, boolean loadUpf, boolean withAuth, ExecutionContext context, SReadCon rCon) throws SException {
        AngBecFltLng toReturn = getDao ().getById (recUid, lngUid, context, rCon);
        
        return toReturn;
    } // getById



/************************************************************************************/
/**  MULTI GETS  ********************************************************************/
/************************************************************************************/

    public List<AngBecFltLng> getAll (boolean completeQuery, ExecutionContext context, SReadCon rCon) throws SException {
        return getAll (completeQuery, false, context, rCon);
    } // getAll

    public List<AngBecFltLng> getAll (boolean completeQuery, boolean withAuth, ExecutionContext context, SReadCon rCon) throws SException {
        SQuery s = SQuery.of (context, rCon).from (getDao ().getTableName (), "Tbl", completeQuery);
        s.sortByAsc ("Tbl.RecUid").sortByAsc ("Tbl.LngUid").execute ();
        List<AngBecFltLng> toReturn = s.readNestedValuesAndCast (null, AngBecFltLng.class);
        s.close ();
        return toReturn;
    } // getAll

    public List<AngBecFltLng> getActive (boolean completeQuery, ExecutionContext context, SReadCon rCon) throws SException {
        return getActive (completeQuery, false, context, rCon);
    } // getActive

    public List<AngBecFltLng> getActive (boolean completeQuery, boolean withAuth, ExecutionContext context, SReadCon rCon) throws SException {
        return getAll (completeQuery, withAuth, context, rCon);
    } // getActive



/************************************************************************************/
/**  GETS LOG, TRANSLATIONS  ********************************************************/
/************************************************************************************/



/************************************************************************************/
/**  POST, UPDATES, DELETE  *********************************************************/
/************************************************************************************/

    protected AngBecFltLng post (AngBecFltLng toInsert, ExecutionContext context, SWriteCon wCon) throws SException {
      return getDao ().safeInsert (toInsert, context, wCon);
    } // post

    protected AngBecFltLng updateAll (AngBecFltLng toUpdate, ExecutionContext context, SWriteCon wCon) throws SException {
        return getDao ().updateAll (toUpdate, true, context, wCon);
    } // updateAll


    public void delete (long recUid, long lngUid, ExecutionContext context, SWriteCon wCon) throws SException {
        getDao ().delete (recUid, lngUid, context, wCon);
    } // delete


} // _WAngBecFltLng
