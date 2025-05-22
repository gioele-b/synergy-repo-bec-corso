package net.synergy2.db.bec.abstracts;

import net.synergy2.base.connections.SReadCon;
import net.synergy2.base.connections.SWriteCon;
import net.synergy2.base.connections.SequencesUtil;
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
import net.synergy2.db.bec.BecVrsInf;

public abstract class _DBecVrsInf extends TableDao<BecVrsInf> {

    private static class Singleton {
        private static final SSingletonHolder<_DBecVrsInf> runtime = new SSingletonHolder<> ("net.synergy2.db.bec.BecVrsInfDao");
    } // Singleton
    
    public static _DBecVrsInf get () {
        return Singleton.runtime.get ();
    } // get

    @Override public String getTableName () { return "BecVrsInf"; }

    protected static final String SQL_SEQUENCE = "SSys014";

    
    @Override
    public BecVrsInf newInstance () {
        return BecVrsInf.newInstance ();
    } // newInstance
    
    
    /* ************************************************************************/
    /* *** Letture ************************************************************/
    /* ************************************************************************/

    /**
     * Ritorna un nuovo id progressivo per la tabella.
     * @param rCon Connessione al DB (sola lettura).
     * @return Nuovo id autogenerato.
     * @throws SConnectionException In caso di errore nella connessione.
     * @throws SSqlException In caso di errore SQL.
     */
    @Override
    public long getNewUid (final ExecutionContext context, final SReadCon rCon) throws SConnectionException, SSqlException {
        return SequencesUtil.getNewValueFor (getSqlSequence (), rCon);
    } // getNewUid
    
    /**
     * Recupera la riga dal database, data la sua chiave.
     * @param uid Id.
     * @param context Dati del contesto di esecuzione.
     * @param rCon Connessione al DB (sola lettura).
     * @return Model recuperato dal database o null se non trovato.
     * @throws SConnectionException In caso di errore nella connessione.
     * @throws SSqlException In caso di errore SQL.
     */
    public BecVrsInf getById (final long uid, final ExecutionContext context, final SReadCon rCon) throws SConnectionException, SSqlException, SModelNullException {
        var model = newInstance ();
        model.setUid (uid);
        return getById (model, context, rCon);
    } // getById
    
    /**
     * Recupera la riga dal database, cercandola per codice codice. Gli eventuali record annullati verranno ignorati.
     * @param vrsMaj Major.
     * @param vrsMin Minor.
     * @param vrsRel Release.
     * @param context Dati del contesto di esecuzione. 
     * @param rCon Connessione al DB (sola lettura).
     * @return Model recuperato dal database o null se non trovato.
     * @throws SConnectionException In caso di errore nella connessione.
     * @throws SSqlException In caso di errore SQL.
     */ 
    public BecVrsInf getByCode (final int vrsMaj, final int vrsMin, final int vrsRel, final ExecutionContext context, final SReadCon rCon) throws SConnectionException, SSqlException {
        var model = newInstance ();
        model.setVrsMaj (vrsMaj);
        model.setVrsMin (vrsMin);
        model.setVrsRel (vrsRel);
        return getByCode (model, context, rCon);
    } // getByCode


    /**
     * Verifica se il record esiste e non e' annullato.
     * @param uid Id.
     * @param context Dati del contesto di esecuzione.
     * @param rCon Connessione al DB (sola lettura).
     * @return Esito della verifica.
     * @throws SConnectionException In caso di errore nella connessione.
     * @throws SSqlException In caso di errore SQL.
     */
    public boolean isValid (final long uid, final ExecutionContext context, final SReadCon rCon) throws SConnectionException, SSqlException {
        var model = newInstance ();
                model.setUid (uid);
        return isValid (model, context, rCon);
    } // isValid

    /**
     * Verifica se esistono altri record non annullatti che hanno lo stesso codice. Se viene passato l'id, il record con tale id verra' ignorato.
     * @param vrsMaj Major.
     * @param vrsMin Minor.
     * @param vrsRel Release.
     * @param uid [Facoltativo] Id del record. Se viene passato, tale record sara' ignorato nella ricerca.
     * @param rCon Connessione al DB (sola lettura).
     * @throws SConnectionException In caso di errore nella connessione.
     * @throws SSqlException In caso di errore SQL.
     * @throws SCodeExistsException In caso di codice gia' presente.
     */
    public void checkCode (final int vrsMaj, final int vrsMin, final int vrsRel, Long uid, final ExecutionContext context, final SReadCon rCon) throws SConnectionException, SSqlException, SCodeExistsException, SModelNullException {
        var model = newInstance ();
        model.setVrsMaj (vrsMaj);
        model.setVrsMin (vrsMin);
        model.setVrsRel (vrsRel);
        model.setUid (uid);
    checkCode (model, context, rCon);
    } // checkCode

    /**
     * Verifica se esistono altri record non annullatti che hanno lo stesso codice.
     * @param vrsMaj Major.
     * @param vrsMin Minor.
     * @param vrsRel Release.
     * @param rCon Connessione al DB (sola lettura).
     * @throws SConnectionException In caso di errore nella connessione.
     * @throws SSqlException In caso di errore SQL.
     * @throws SCodeExistsException In caso di codice gia' presente.
     */
    public void checkCode (final int vrsMaj, final int vrsMin, final int vrsRel, ExecutionContext context, SReadCon rCon) throws SConnectionException, SSqlException, SCodeExistsException, SModelNullException {
        checkCode (vrsMaj, vrsMin, vrsRel, null, context, rCon);
    } // checkCode



    /* ************************************************************************/
    /* *** Scritture **********************************************************/
    /* ************************************************************************/

    /**
     * Elimina un record dal database.
     * @param uid Id.
     * @param context Dati del contesto di esecuzione.
     * @param wCon Connessione al DB (editabile).
     * @throws SConnectionException In caso di errore nella connessione.
     * @throws SSqlException In caso di errore SQL.
     * @throws SModelNullException In caso di model nullo.
     * @throws SRecordNotFoundException In caso di record non trovato per l'eliminazione.
     * @throws SAuditException In caso di errore dell'eventuale cancellazione nell'audit log.
     */
    public void delete (final long uid, final ExecutionContext context, final SWriteCon wCon) throws SModelNullException, SConnectionException, SRecordNotFoundException, SAuditException, SSqlException, SRecordAuthorizationException {
        BecVrsInf model = newInstance ();
        model.setUid (uid);
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
    public BecVrsInf safeAutoUpdateInsert (final BecVrsInf model, final ExecutionContext context, final SWriteCon wCon) throws SModelNullException, SConnectionException, SSqlException, SCodeExistsException, SAuditException, SIdExistsException, SNotLastVersionException, SIdNullException, SModelValidationException {
        return autoUpdateInsert (model, true, context, wCon);
    } // safeAutoUpdateInsert

    /* ************************************************************************/
    /* *** Query **************************************************************/
    /* ************************************************************************/

    /** @return Il codice della sequence di riferimento */
    @Override
    public String getSqlSequence () {
        return _DBecVrsInf.SQL_SEQUENCE;
    } // getSqlSequence

} // _DBecVrsInf
