package net.synergy2.ws.bec.vrt.abstracts;

import java.util.List;
import net.synergy2.base.connections.SReadCon;
import net.synergy2.base.connections.SReadRemCon;
import net.synergy2.base.connections.SWriteCon;
import net.synergy2.base.connections.SWriteRemCon;
import net.synergy2.base.context.ExecutionContext;
import net.synergy2.base.exceptions.SConnectionException;
import net.synergy2.base.exceptions.SException;
import net.synergy2.base.exceptions.SSqlException;
import net.synergy2.base.types.SSingletonHolder;
import net.synergy2.db.bec.vrt.BecVrtHisSrs;
import net.synergy2.db.bec.vrt.BecVrtHisSrsDao;
import net.synergy2.ws.base.SWs;
import net.synergy2.ws.bec.vrt.BecVrtHisSrsWs;

public abstract class _WBecVrtHisSrs extends SWs {
    private static class Singleton {
        private static final SSingletonHolder<BecVrtHisSrsWs> runtime = new SSingletonHolder<> (BecVrtHisSrsWs.class);
    }
    public static BecVrtHisSrsWs get () {
        return Singleton.runtime.get ();
    } // get

    protected BecVrtHisSrsDao getDao () { return BecVrtHisSrsDao.get (); }

    @Override
    protected String getTableName () { return "BecVrtHisSrs"; }

    public boolean isValid (long uid, ExecutionContext context, SReadCon rCon, SReadRemCon rrCon) throws SException {
      return getDao ().isValid (uid, context, rCon, rrCon);
    } // isValid

    public String getDataSource (ExecutionContext context, SReadCon rCon) throws SConnectionException, SSqlException { return getDao ().getDataSource(context, rCon); }

/************************************************************************************/
/**  SINGLE GETS  *******************************************************************/
/************************************************************************************/


    public BecVrtHisSrs getById (long uid, ExecutionContext context, SReadCon rCon, SReadRemCon rrCon) throws SException {
      return getById (uid, false, context, rCon, rrCon);    } // getById

    public BecVrtHisSrs getById (long uid, boolean loadUpf, ExecutionContext context, SReadCon rCon, SReadRemCon rrCon) throws SException {
        BecVrtHisSrs toReturn = getDao ().getById (uid, context, rCon, rrCon);        
        return toReturn;
    } // getById

    public BecVrtHisSrs getByCode (String itmCod, String cusCod, ExecutionContext context, SReadCon rCon, SReadRemCon rrCon) throws SException {
      return getDao ().getByCode (itmCod, cusCod, context, rCon, rrCon);
    } // getByCode


/************************************************************************************/
/**  MULTI GETS  ********************************************************************/
/************************************************************************************/

    public List<BecVrtHisSrs> getAll (boolean completeQuery, ExecutionContext context, SReadCon rCon, SReadRemCon rrCon) throws SException {
        return getDao ().getAll (completeQuery, context, rCon, rrCon);
    } // getAll


    public List<BecVrtHisSrs> getActive (boolean completeQuery, ExecutionContext context, SReadCon rCon, SReadRemCon rrCon) throws SException {
        return getDao ().getActive (completeQuery, context, rCon, rrCon);
    } // getActive




/************************************************************************************/
/**  GETS LOG, TRANSLATIONS  ********************************************************/
/************************************************************************************/



/************************************************************************************/
/**  POST, UPDATES, DELETE  *********************************************************/
/************************************************************************************/

    protected BecVrtHisSrs post (BecVrtHisSrs toInsert, ExecutionContext context, SWriteCon wCon, SWriteRemCon wrCon) throws SException {
      return getDao ().insert (toInsert, context, wCon, wrCon);
    } // post

    protected BecVrtHisSrs updateAll (BecVrtHisSrs toUpdate, ExecutionContext context, SWriteCon wCon, SWriteRemCon wrCon) throws SException {
        return getDao ().updateAll (toUpdate, context, wCon, wrCon);
    } // updateAll


    public void delete (long uid, ExecutionContext context, SWriteCon wCon, SWriteRemCon wrCon) throws SException {
        getDao ().delete (uid, context, wCon, wrCon);
    } // delete


} // _WBecVrtHisSrs
