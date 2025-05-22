package net.synergy2.db.bec.vrt.abstracts;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Set;
import net.synergy2.base.connections.SReadCon;
import net.synergy2.base.connections.SReadRemCon;
import net.synergy2.base.connections.SWriteCon;
import net.synergy2.base.connections.SWriteRemCon;
import net.synergy2.base.context.ExecutionContext;
import net.synergy2.base.exceptions.SAuditException;
import net.synergy2.base.exceptions.SCodeExistsException;
import net.synergy2.base.exceptions.SConnectionException;
import net.synergy2.base.exceptions.SIdExistsException;
import net.synergy2.base.exceptions.SIdNullException;
import net.synergy2.base.exceptions.SModelNullException;
import net.synergy2.base.exceptions.SNotLastVersionException;
import net.synergy2.base.exceptions.SRecordNotFoundException;
import net.synergy2.base.exceptions.SSqlException;
import net.synergy2.base.types.SSingletonHolder;
import net.synergy2.db.base.dao.VirtualDao;
import net.synergy2.db.bec.vrt.BecVrtHisSrs;
import net.synergy2.db.sys.AngDbmTbl;
import net.synergy2.db.sys.abstracts._DAngDbmTbl;

public abstract class _DBecVrtHisSrs extends VirtualDao<BecVrtHisSrs> {

    private static class Singleton {
        private static final SSingletonHolder<_DBecVrtHisSrs> runtime = new SSingletonHolder<> ("net.synergy2.db.bec.vrt.BecVrtHisSrsDao");
    } // Singleton
    public static _DBecVrtHisSrs get () {
        return Singleton.runtime.get ();
    } // get

    @Override public String getTableName () { return "BecVrtHisSrs"; }

    private _IRBecVrtHisSrs remote = null;
    private String dataSource;

    protected _DBecVrtHisSrs () { }

    @Override
    public BecVrtHisSrs newInstance () {
        return BecVrtHisSrs.newInstance ();
    } // newInstance
    
    /**
     * Restituisce il dao per l'accesso al database in remoto.
     * @param context Dati del contesto di esecuzione.
     * @param rCon Connessione al DB (sola lettura).
     * @return Il dao per l'accesso al database in remoto.
     */
    protected _IRBecVrtHisSrs getRemote (final ExecutionContext context, final SReadCon rCon) throws SConnectionException, SSqlException {
        if (remote == null) {
            AngDbmTbl tbl = _DAngDbmTbl.get ().getById (getTableUid (), context, rCon);
            try {
                Class<?> daoImplClass = Class.forName (tbl.getTblDaoImplCls ());
                Constructor<?> daoImplConstructor = daoImplClass.getConstructor ();
                remote = (_IRBecVrtHisSrs) daoImplConstructor.newInstance ();
                setDataSource (tbl.getTblDatSrc ());
                remote.setDataSource (dataSource);
            } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                throw new SConnectionException ("Errore reperimento classe implementativa remoto.", e);
            } // try - catch
        } // if
        return remote;
    } // getRemote
    
    /**
     * Restituisce il nome della sorgente dati con cui poter connettersi al database remoto.
     * @param context Dati del contesto di esecuzione.
     * @param rCon Connessione al DB (sola lettura).
     * @return Il nome della sorgente dati.
     */
    public String getDataSource (final ExecutionContext context, final SReadCon rCon) throws SConnectionException, SSqlException {
        if (remote == null) { getRemote (context, rCon); }
        return dataSource;
    } // getDataSource
    
    /**
     * Valorizza il nome della sorgente dati con cui poter connettersi al database remoto.
     * @param dataSource Il nome della sorgente dati.
     */
    public void setDataSource (final String dataSource) {
        this.dataSource = dataSource;
    } // setDataSource
    

        
    /**
     * Verifica se il record esiste e non e' annullato.
     * @param uid Id.
     * @param context Dati del contesto di esecuzione. 
     * @param rCon Connessione al DB (sola lettura).
     * @param rrCon Connessione al DB remoto (sola lettura).
     * @return Esito della verifica.
     * @throws SConnectionException In caso di errore nella connessione.
     * @throws SSqlException In caso di errore SQL.
     */    
    public boolean isValid (final long uid, final ExecutionContext context, final SReadCon rCon, final SReadRemCon rrCon) throws SConnectionException, SSqlException {
        return getById (uid, context, rCon, rrCon) != null;
    } // isValid
    

    /**
     * Recupera la riga dal database, data la sua chiave ed eventualmente la versione corrente del record.
     * @param uid Id.
     * @param context Dati del contesto di esecuzione. 
     * @param rCon Connessione al DB (sola lettura).
     * @param rrCon Connessione al DB remoto (sola lettura).
     * @return Model recuperato dal database o null se non trovato.
     * @throws SConnectionException In caso di errore nella connessione.
     * @throws SSqlException In caso di errore SQL.
     */    
    public BecVrtHisSrs getById (final long uid, final ExecutionContext context, final SReadCon rCon, final SReadRemCon rrCon) throws SConnectionException, SSqlException {
        return getRemote (context, rCon).getById (uid, context, rCon, rrCon);
    } // getById
    
    /**
     * Recupera la riga dal database, cercandola per chiave.
     * @param model Model da cui viene prelevato l'id per la ricerca.
     * @param context Dati del contesto di esecuzione. 
     * @param rCon Connessione al DB (sola lettura).
     * @param rrCon Connessione al DB remoto (sola lettura).
     * @return Model recuperato dal database o null se non trovato.
     * @throws SConnectionException In caso di errore nella connessione.
     * @throws SSqlException In caso di errore SQL.
     * @throws SModelNullException In caso di model nullo. 
     */ 
    public BecVrtHisSrs getById (final BecVrtHisSrs model, final ExecutionContext context, final SReadCon rCon, final SReadRemCon rrCon) throws SConnectionException, SSqlException, SModelNullException {
        if (model == null) { throw new SModelNullException (getTableUid (), getTableName ()); }
        return getById (model.getUid (), context, rCon, rrCon);
    } // getById
    
    /**
     * Recupera la riga dal database, cercandola per codice codice. Gli eventuali record annullati verranno ignorati.
     * @param itmCod Codice.
     * @param cusCod Codice.
     * @param context Dati del contesto di esecuzione. 
     * @param rCon Connessione al DB (sola lettura).
     * @param rrCon Connessione al DB remoto (sola lettura).
     * @return Model recuperato dal database o null se non trovato.
     * @throws SConnectionException In caso di errore nella connessione.
     * @throws SSqlException In caso di errore SQL.
     */ 
    public BecVrtHisSrs getByCode (final String itmCod, final String cusCod, final ExecutionContext context, final SReadCon rCon, final SReadRemCon rrCon) throws SConnectionException, SSqlException {
        return getRemote (context, rCon).getByCode (itmCod, cusCod, context, rCon, rrCon);
    } // getByCode
    
    /**
     * Recupera la riga dal database, cercandola per codice. Gli eventuali record annullati verranno ignorati.
     * @param model Model da cui viene prelevato il codice per la ricerca.
     * @param context Dati del contesto di esecuzione. 
     * @param rCon Connessione al DB (sola lettura).
     * @paramn rrCon Connessione al DB remoto (sola lettura).
     * @return Model recuperato dal database o null se non trovato.
     * @throws SConnectionException In caso di errore nella connessione.
     * @throws SSqlException In caso di errore SQL.
     * @throws SModelNullException In caso di model nullo.
     */ 
    public BecVrtHisSrs getByCode (final BecVrtHisSrs model, final ExecutionContext context, final SReadCon rCon, final SReadRemCon rrCon) throws SConnectionException, SSqlException, SModelNullException {
        if (model == null) { throw new SModelNullException (getTableUid (), getTableName ()); }
        return getByCode (model.getItmCod (), model.getCusCod (), context, rCon, rrCon);
    } // getByCode 
    
    /**
     * Recupera tutti i record della tabella.
     * @param completeQuery Se true, reperisce i record completi.
     * @param context Dati del contesto di esecuzione. 
     * @param rCon Connessione al DB (sola lettura).
     * @param rrCon Connessione al DB remoto (sola lettura).
     * @return La lista dei modelli recuperati dal database.
     * @throws SConnectionException In caso di errore nella connessione.
     * @throws SSqlException In caso di errore SQL.
     */    
    public List<BecVrtHisSrs> getAll (final boolean completeQuery, final ExecutionContext context, final SReadCon rCon, final SReadRemCon rrCon) throws SConnectionException, SSqlException {
        return getRemote (context, rCon).getAll (completeQuery, context, rCon, rrCon);
    } // getAll
    
    /**
     * Recupera tutti i record attivi della tabella.
     * @param completeQuery Se true, reperisce i record completi.
     * @param context Dati del contesto di esecuzione. 
     * @param rCon Connessione al DB (sola lettura).
     * @param rrCon Connessione al DB remoto (sola lettura).
     * @return La lista dei modelli recuperati dal database.
     * @throws SConnectionException In caso di errore nella connessione.
     * @throws SSqlException In caso di errore SQL.
     */    
    public List<BecVrtHisSrs> getActive (final boolean completeQuery, final ExecutionContext context, final SReadCon rCon, final SReadRemCon rrCon) throws SConnectionException, SSqlException {
        return getRemote (context, rCon).getActive (completeQuery, context, rCon, rrCon);
    } // getActive
    
    /**
     * Recupera tutti i record della tabella.
     * @param completeQuery Se true, reperisce i record completi.
     * @param context Dati del contesto di esecuzione. 
     * @param rCon Connessione al DB (sola lettura).
     * @param rrCon Connessione al DB remoto (sola lettura).
     * @return La lista dei modelli recuperati dal database.
     * @throws SConnectionException In caso di errore nella connessione.
     * @throws SSqlException In caso di errore SQL.
     */    
    public List<BecVrtHisSrs> getAll (final boolean completeQuery, final Set<String> selectCols, final Set<String> searchCols, final List<String> sorts, final String searchString, final ExecutionContext context, final SReadCon rCon, final SReadRemCon rrCon) throws SConnectionException, SSqlException {
        return getRemote (context, rCon).getAll (completeQuery, selectCols, searchCols, sorts, searchString, context, rCon, rrCon);
    } // getAll
    
    /**
     * Recupera tutti i record attivi della tabella.
     * @param completeQuery Se true, reperisce i record completi.
     * @param context Dati del contesto di esecuzione. 
     * @param rCon Connessione al DB (sola lettura).
     * @param rrCon Connessione al DB remoto (sola lettura).
     * @return La lista dei modelli recuperati dal database.
     * @throws SConnectionException In caso di errore nella connessione.
     * @throws SSqlException In caso di errore SQL.
     */    
    public List<BecVrtHisSrs> getActive (final boolean completeQuery, final Set<String> selectCols, final Set<String> searchCols, final List<String> sorts, final String searchString, final ExecutionContext context, final SReadCon rCon, final SReadRemCon rrCon) throws SConnectionException, SSqlException {
        return getRemote (context, rCon).getActive (completeQuery, selectCols, searchCols, sorts, searchString, context, rCon, rrCon);
    } // getActive    
    
    /**
     * Aggiunge un record in database verificando (se richiesto) che non ne esistano con lo stesso codice. #commentInsert1#
     * @param model Model di cui eseguire l'inserimento.
     * @param context Dati del contesto di esecuzione.
     * @param wCon Connessione al DB (editabile).
     * @param wrCon Connessione al DB remoto (editabile).
     * @return Lo stesso model passato in input#commentInsert2#.
     * @throws SConnectionException In caso di errore nella connessione.
     * @throws SSqlException In caso di errore SQL.
     * @throws SModelNullException In caso di model nullo.
     * @throws SCodeExistsException In caso di codice gia' presente.
     * @throws SAuditException In caso di errore dell'eventuale inserimento nell'audit log.
     * @throws SIdExistsException In caso di tentativo di inserimento con id gia' esistente.     
     */
    public BecVrtHisSrs insert (final BecVrtHisSrs model, final ExecutionContext context, final SWriteCon wCon, final SWriteRemCon wrCon) throws SConnectionException, SSqlException, SCodeExistsException, SModelNullException, SAuditException, SIdExistsException {
        if (model == null) { throw new SModelNullException (getTableUid (), getTableName ()); }
        return getRemote (context, wCon).insert (model, context, wCon, wrCon);
    } // insert
           
    /**
     * Aggiorna un record in db con i dati passati nel model verificando (se richiesto) che non esistano altri record con lo stesso codice. Il metodo assicura
     * che il record non abbia subito modifiche da altre fonti, da quando e' stato letto.
     * @param model Model di cui eseguire l'aggiornamento.
     * @param context Dati del contesto di esecuzione.
     * @param wCon Connessione al DB (editabile).
     * @param wrCon Connessione al DB remoto (editabile).
     * @return Lo stesso model passato in input, con la nuova versione del record impostata.
     * @throws SConnectionException In caso di errore nella connessione.
     * @throws SSqlException In caso di errore SQL.
     * @throws SModelNullException In caso di model nullo.
     * @throws SNotLastVersionException Se si sta cercando di aggiornare una versione obsoleta.
     * @throws SCodeExistsException In caso di codice gia' presente.
     * @throws SIdNullException In caso di model con id nullo.
     * @throws SAuditException In caso di errore dell'eventuale modifica nell'audit log.
     */
    public BecVrtHisSrs updateAll (final BecVrtHisSrs model, final ExecutionContext context, final SWriteCon wCon, final SWriteRemCon wrCon) throws SConnectionException, SSqlException, SCodeExistsException, SModelNullException, SNotLastVersionException, SAuditException, SIdNullException, SIdExistsException {
        return getRemote (context, wCon).updateAll (model, context, wCon, wrCon);
    } // updateAll
    
    /**
     * Elimina un record dal database.
     * @param uid Id.
     * @param context Dati del contesto di esecuzione.
     * @param wCon Connessione al DB (editabile).
     * @param wrCon Connessione al DB remoto (editabile).
     * @throws SConnectionException In caso di errore nella connessione.
     * @throws SSqlException In caso di errore SQL.
     * @throws SModelNullException In caso di model nullo.
     * @throws SRecordNotFoundException In caso di record non trovato per l'eliminazione.
     * @throws SAuditException In caso di errore dell'eventuale cancellazione nell'audit log.
     */
    public void delete (final long uid, final ExecutionContext context, final SWriteCon wCon, final SWriteRemCon wrCon) throws SModelNullException, SConnectionException, SRecordNotFoundException, SAuditException, SSqlException {
        BecVrtHisSrs model = BecVrtHisSrs.newInstance ();
        model.setUid (uid);
        delete (model, context, wCon, wrCon);
    } // delete

    
    /**
     * Elimina un record dal database.
     * @param model Model da eliminare (da cui viene reperito l'id).
     * @param context Dati del contesto di esecuzione.
     * @param wCon Connessione al DB (editabile).
     * @param wrCon Connessione al DB remoto (editabile).
     * @throws SConnectionException In caso di errore nella connessione.
     * @throws SSqlException In caso di errore SQL.
     * @throws SModelNullException In caso di model nullo.
     * @throws SRecordNotFoundException In caso di record non trovato per l'eliminazione.
     * @throws SAuditException In caso di errore dell'eventuale cancellazione nell'audit log.
     */
    public void delete (final BecVrtHisSrs model, final ExecutionContext context, final SWriteCon wCon, final SWriteRemCon wrCon) throws SModelNullException, SConnectionException, SRecordNotFoundException, SAuditException, SSqlException {
        getRemote (context, wCon).delete (model, context, wCon, wrCon);
    } // delete

    /**
     * Lettura del record da DB se questo non e' mai stato letto e quindi puo' essere incompleto.
     * @param model Model del record.
     * @param checkValid Indica se effettuare il controllo di validita' sul model completo.
     * @param context Dati del contesto di esecuzione.
     * @param rCon Connessione al DB (sola lettura).
     * @param rrCon Connessione al DB remoto (sola lettura).
     * @throws SConnectionException Eccezione della connessione.
     * @throws SSqlException Eccezione SQL.
     */
    public BecVrtHisSrs ensure (final BecVrtHisSrs model, final Boolean checkValid, final ExecutionContext context, final SReadCon rCon, final SReadRemCon rrCon) throws SSqlException, SConnectionException {
        return getRemote (context, rCon).ensure (model, checkValid, context, rCon, rrCon);
    } // ensure


} // _DBecVrtHisSrs
