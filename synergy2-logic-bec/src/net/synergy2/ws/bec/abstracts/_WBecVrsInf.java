package net.synergy2.ws.bec.abstracts;

import java.util.List;
import net.synergy2.base.connections.SReadCon;
import net.synergy2.base.connections.SWriteCon;
import net.synergy2.base.context.ExecutionContext;
import net.synergy2.base.exceptions.SException;
import net.synergy2.base.types.SSingletonHolder;
import net.synergy2.db.bec.BecVrsInf;
import net.synergy2.db.bec.BecVrsInfDao;
import net.synergy2.query.SQuery;
import net.synergy2.ws.base.SWs;
import net.synergy2.ws.bec.BecVrsInfWs;

public abstract class _WBecVrsInf extends SWs {
    private static class Singleton {
        private static final SSingletonHolder<BecVrsInfWs> runtime = new SSingletonHolder<> (BecVrsInfWs.class);
    }
    public static BecVrsInfWs get () {
        return Singleton.runtime.get ();
    } // get

    protected BecVrsInfDao getDao () { return BecVrsInfDao.get (); }

    @Override
    protected String getTableName () { return "BecVrsInf"; }

    public boolean isValid (long uid, ExecutionContext context, SReadCon rCon) throws SException {
      return getDao ().isValid (uid, context, rCon);
    } // isValid



/************************************************************************************/
/**  SINGLE GETS  *******************************************************************/
/************************************************************************************/

    public long getNewUid (ExecutionContext context, SReadCon rCon) throws SException {
        return getDao ().getNewUid (context, rCon);
    } // getNewUid
    public BecVrsInf getById (long uid, ExecutionContext context, SReadCon rCon) throws SException {
      return getById (uid, false, false, context, rCon);
    } // getById

    public BecVrsInf getById (long uid, boolean loadUpf, boolean withAuth, ExecutionContext context, SReadCon rCon) throws SException {
        BecVrsInf toReturn = getDao ().getById (uid, context, rCon);
        
        return toReturn;
    } // getById

    public BecVrsInf getByCode (int vrsMaj, int vrsMin, int vrsRel, ExecutionContext context, SReadCon rCon) throws SException {
      return getByCode (vrsMaj, vrsMin, vrsRel, false, context, rCon);
    } // getByCode

    public BecVrsInf getByCode (int vrsMaj, int vrsMin, int vrsRel, boolean withAuth, ExecutionContext context, SReadCon rCon) throws SException {
        BecVrsInf toReturn = getDao ().getByCode (vrsMaj, vrsMin, vrsRel, context, rCon);
        return toReturn;
    } // getByCode

/************************************************************************************/
/**  MULTI GETS  ********************************************************************/
/************************************************************************************/

    public List<BecVrsInf> getAll (boolean completeQuery, ExecutionContext context, SReadCon rCon) throws SException {
        return getAll (completeQuery, false, context, rCon);
    } // getAll

    public List<BecVrsInf> getAll (boolean completeQuery, boolean withAuth, ExecutionContext context, SReadCon rCon) throws SException {
        SQuery s = SQuery.of (context, rCon).from (getDao ().getTableName (), "Tbl", completeQuery);
        s.sortByAsc ("Tbl.Uid").execute ();
        List<BecVrsInf> toReturn = s.readNestedValuesAndCast (null, BecVrsInf.class);
        s.close ();
        return toReturn;
    } // getAll

    public List<BecVrsInf> getActive (boolean completeQuery, ExecutionContext context, SReadCon rCon) throws SException {
        return getActive (completeQuery, false, context, rCon);
    } // getActive

    public List<BecVrsInf> getActive (boolean completeQuery, boolean withAuth, ExecutionContext context, SReadCon rCon) throws SException {
        return getAll (completeQuery, withAuth, context, rCon);
    } // getActive



/************************************************************************************/
/**  GETS LOG, TRANSLATIONS  ********************************************************/
/************************************************************************************/



/************************************************************************************/
/**  POST, UPDATES, DELETE  *********************************************************/
/************************************************************************************/

    protected BecVrsInf post (BecVrsInf toInsert, ExecutionContext context, SWriteCon wCon) throws SException {
      return getDao ().safeInsert (toInsert, context, wCon);
    } // post

    protected BecVrsInf updateAll (BecVrsInf toUpdate, ExecutionContext context, SWriteCon wCon) throws SException {
        return getDao ().updateAll (toUpdate, true, context, wCon);
    } // updateAll


    public void delete (long uid, ExecutionContext context, SWriteCon wCon) throws SException {
        getDao ().delete (uid, context, wCon);
    } // delete


} // _WBecVrsInf
