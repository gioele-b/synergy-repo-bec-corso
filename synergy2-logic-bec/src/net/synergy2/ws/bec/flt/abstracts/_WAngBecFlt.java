package net.synergy2.ws.bec.flt.abstracts;

import java.util.List;
import net.synergy2.base.connections.SReadCon;
import net.synergy2.base.connections.SWriteCon;
import net.synergy2.base.context.ExecutionContext;
import net.synergy2.base.exceptions.SException;
import net.synergy2.base.types.SSingletonHolder;
import net.synergy2.db.bec.flt.AngBecFlt;
import net.synergy2.db.bec.flt.AngBecFltDao;
import net.synergy2.db.bec.flt.AngBecFltMeta;
import net.synergy2.db.sys.AngLng;
import net.synergy2.db.sys.upf.UpfIstDao;
import net.synergy2.query.SQuery;
import net.synergy2.ws.base.SWs;
import net.synergy2.ws.bec.flt.AngBecFltWs;

public abstract class _WAngBecFlt extends SWs {
    private static class Singleton {
        private static final SSingletonHolder<AngBecFltWs> runtime = new SSingletonHolder<> (AngBecFltWs.class);
    }
    public static AngBecFltWs get () {
        return Singleton.runtime.get ();
    } // get

    protected AngBecFltDao getDao () { return AngBecFltDao.get (); }

    @Override
    protected String getTableName () { return "AngBecFlt"; }

    public boolean isValid (long uid, ExecutionContext context, SReadCon rCon) throws SException {
      return getDao ().isValid (uid, context, rCon);
    } // isValid



/************************************************************************************/
/**  SINGLE GETS  *******************************************************************/
/************************************************************************************/

    public long getNewUid (ExecutionContext context, SReadCon rCon) throws SException {
        return getDao ().getNewUid (context, rCon);
    } // getNewUid
    public AngBecFlt getById (long uid, ExecutionContext context, SReadCon rCon) throws SException {
      return getById (uid, false, false, context, rCon);
    } // getById

    public AngBecFlt getById (long uid, boolean loadUpf, boolean withAuth, ExecutionContext context, SReadCon rCon) throws SException {
        AngBecFlt toReturn = getDao ().getById (uid, context, rCon);
        if (loadUpf && toReturn != null && getDao ().hasDefinedUserFields (context, rCon)) { toReturn.setUserFields (UpfIstDao.get ().getByCode (AngBecFltMeta.get ().tableUid (), uid, context, rCon)); }
        return toReturn;
    } // getById

    public AngBecFlt getByCode (String becFltCod, ExecutionContext context, SReadCon rCon) throws SException {
      return getByCode (becFltCod, false, context, rCon);
    } // getByCode

    public AngBecFlt getByCode (String becFltCod, boolean withAuth, ExecutionContext context, SReadCon rCon) throws SException {
        AngBecFlt toReturn = getDao ().getByCode (becFltCod, context, rCon);
        return toReturn;
    } // getByCode

/************************************************************************************/
/**  MULTI GETS  ********************************************************************/
/************************************************************************************/

    public List<AngBecFlt> getAll (boolean completeQuery, ExecutionContext context, SReadCon rCon) throws SException {
        return getAll (completeQuery, false, context, rCon);
    } // getAll

    public List<AngBecFlt> getAll (boolean completeQuery, boolean withAuth, ExecutionContext context, SReadCon rCon) throws SException {
        SQuery s = SQuery.of (context, rCon).from (getDao ().getTableName (), "Tbl", completeQuery);
        s.sortByAsc ("Tbl.Uid").execute ();
        List<AngBecFlt> toReturn = s.readNestedValuesAndCast (null, AngBecFlt.class);
        s.close ();
        return toReturn;
    } // getAll

    public List<AngBecFlt> getActive (boolean completeQuery, ExecutionContext context, SReadCon rCon) throws SException {
        return getActive (completeQuery, false, context, rCon);
    } // getActive

    public List<AngBecFlt> getActive (boolean completeQuery, boolean withAuth, ExecutionContext context, SReadCon rCon) throws SException {
        SQuery s = SQuery.of (context, rCon).from (getDao ().getTableName (), "Tbl", completeQuery);
        s.whereActive ("Tbl");
        s.sortByAsc ("Tbl.Uid").execute ();
        List<AngBecFlt> toReturn = s.readNestedValuesAndCast (null, AngBecFlt.class);
        s.close ();
        return toReturn;
    } // getActive



/************************************************************************************/
/**  GETS LOG, TRANSLATIONS  ********************************************************/
/************************************************************************************/

    /**
     * Cerca tutte le traduzioni in lingua di un record. 
     * @param uid L'uid del record di cui cercarne le traduzioni.
     * @param context Il contesto.
     * @param rCon Connessione al DB (sola lettura).
     * @return La lista delle lingue in db ciascuna contenente la lista delle traduzioni di #tableName# con la traduzione in lingua del record. Se la lista delle traduzioni e' null, non esistono traduzioni in quella lingua del record.
     * @throws SException
     */
    public List<AngLng> getTranslations (long uid, boolean withAuth, ExecutionContext context, SReadCon rCon) throws SException {
        return getDao ().getTranslations (uid, context, rCon);
    } // getTranslations

/************************************************************************************/
/**  POST, UPDATES, DELETE  *********************************************************/
/************************************************************************************/

    protected AngBecFlt post (AngBecFlt toInsert, ExecutionContext context, SWriteCon wCon) throws SException {
      return getDao ().safeInsert (toInsert, context, wCon);
    } // post

    protected AngBecFlt updateAll (AngBecFlt toUpdate, ExecutionContext context, SWriteCon wCon) throws SException {
        return getDao ().updateAll (toUpdate, true, context, wCon);
    } // updateAll


    public void delete (long uid, ExecutionContext context, SWriteCon wCon) throws SException {
        getDao ().delete (uid, context, wCon);
    } // delete


} // _WAngBecFlt
