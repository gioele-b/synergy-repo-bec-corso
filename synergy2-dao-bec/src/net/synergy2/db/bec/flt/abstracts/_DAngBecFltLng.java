package net.synergy2.db.bec.flt.abstracts;

import net.synergy2.base.connections.SReadCon;
import net.synergy2.base.connections.SWriteCon;
import net.synergy2.base.context.ExecutionContext;
import net.synergy2.base.exceptions.SAuditException;
import net.synergy2.base.exceptions.SCodeExistsException;
import net.synergy2.base.exceptions.SConnectionException;
import net.synergy2.base.exceptions.SIdExistsException;
import net.synergy2.base.exceptions.SIdNullException;
import net.synergy2.base.exceptions.SModelNullException;
import net.synergy2.base.exceptions.SModelValidationException;
import net.synergy2.base.exceptions.SNotLastVersionException;
import net.synergy2.base.exceptions.SRecordAuthorizationException;
import net.synergy2.base.exceptions.SRecordNotFoundException;
import net.synergy2.base.exceptions.SSqlException;
import net.synergy2.base.types.SSingletonHolder;
import net.synergy2.db.base.dao.TableDao;
import net.synergy2.db.bec.flt.AngBecFltLng;

public abstract class _DAngBecFltLng extends TableDao<AngBecFltLng> {

    private static class Singleton {
        private static final SSingletonHolder<_DAngBecFltLng> runtime = new SSingletonHolder<> ("net.synergy2.db.bec.flt.AngBecFltLngDao");
    } // Singleton
    
    public static _DAngBecFltLng get () {
        return Singleton.runtime.get ();
    } // get

    @Override public String getTableName () { return "AngBecFltLng"; }


    
    @Override
    public AngBecFltLng newInstance () {
        return AngBecFltLng.newInstance ();
    } // newInstance
    
    
    /* ************************************************************************/
    /* *** Letture ************************************************************/
    /* ************************************************************************/


    
    /**
     * Recupera la riga dal database, data la sua chiave.
     * @param recUid Uid record.
     * @param lngUid Uid lingua.
     * @param context Dati del contesto di esecuzione.
     * @param rCon Connessione al DB (sola lettura).
     * @return Model recuperato dal database o null se non trovato.
     * @throws SConnectionException In caso di errore nella connessione.
     * @throws SSqlException In caso di errore SQL.
     */
    public AngBecFltLng getById (final long recUid, final long lngUid, final ExecutionContext context, final SReadCon rCon) throws SConnectionException, SSqlException, SModelNullException {
        var model = newInstance ();
        model.setRecUid (recUid);
        model.setLngUid (lngUid);
        return getById (model, context, rCon);
    } // getById
    


    /**
     * Verifica se il record esiste e non e' annullato.
     * @param recUid Uid record.
     * @param lngUid Uid lingua.
     * @param context Dati del contesto di esecuzione.
     * @param rCon Connessione al DB (sola lettura).
     * @return Esito della verifica.
     * @throws SConnectionException In caso di errore nella connessione.
     * @throws SSqlException In caso di errore SQL.
     */
    public boolean isValid (final long recUid, final long lngUid, final ExecutionContext context, final SReadCon rCon) throws SConnectionException, SSqlException {
        var model = newInstance ();
                model.setRecUid (recUid);
        model.setLngUid (lngUid);
        return isValid (model, context, rCon);
    } // isValid



    /* ************************************************************************/
    /* *** Scritture **********************************************************/
    /* ************************************************************************/

    /**
     * Elimina un record dal database.
     * @param recUid Uid record.
     * @param lngUid Uid lingua.
     * @param context Dati del contesto di esecuzione.
     * @param wCon Connessione al DB (editabile).
     * @throws SConnectionException In caso di errore nella connessione.
     * @throws SSqlException In caso di errore SQL.
     * @throws SModelNullException In caso di model nullo.
     * @throws SRecordNotFoundException In caso di record non trovato per l'eliminazione.
     * @throws SAuditException In caso di errore dell'eventuale cancellazione nell'audit log.
     */
    public void delete (final long recUid, final long lngUid, final ExecutionContext context, final SWriteCon wCon) throws SModelNullException, SConnectionException, SRecordNotFoundException, SAuditException, SSqlException, SRecordAuthorizationException {
        AngBecFltLng model = newInstance ();
        model.setRecUid (recUid);
        model.setLngUid (lngUid);
        delete (model, context, wCon);
    } // delete

    /**
     * Modifica un record in db o lo inserisce se non presente, verificando che non esistano altri record con lo stesso codice.
     * @param model Model da aggiornare / inserire in db.
     * @param context Dati del contesto di esecuzione.
     * @param wCon Connessione al DB (editabile).
     * @return Lo stesso model passato in input, con la nuova versione del record impostata.
     * @throws Exception In caso di codice gia' presente. In caso di errore nella connessione o errore SQL. In caso di model nullo. In
     *             caso di versione di partenza non coerente. In caso di id nullo.
     */
    public AngBecFltLng safeAutoUpdateInsert (final AngBecFltLng model, final ExecutionContext context, final SWriteCon wCon) throws SModelNullException, SConnectionException, SSqlException, SCodeExistsException, SAuditException, SIdExistsException, SNotLastVersionException, SIdNullException, SModelValidationException {
        return autoUpdateInsert (model, true, context, wCon);
    } // safeAutoUpdateInsert

    /* ************************************************************************/
    /* *** Query **************************************************************/
    /* ************************************************************************/



} // _DAngBecFltLng
