package net.synergy2.rest.bec.flt;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import net.synergy2.base.connections.ConnectionsUtil;
import net.synergy2.base.connections.SConnectionFactory;
import net.synergy2.base.connections.SReadCon;
import net.synergy2.base.connections.SWriteCon;
import net.synergy2.base.context.ExecutionContext;
import net.synergy2.base.rest.ApiInput;
import net.synergy2.base.rest.RestOutput;
import net.synergy2.base.rest.SynergyRestContext;
import net.synergy2.db.bec.flt.AngBecFlt;
import net.synergy2.db.bec.flt.AngBecFltLng;
import net.synergy2.rest.util.ErrorResponse;
import net.synergy2.ws.bec.flt.AngBecFltLngWs;
import net.synergy2.ws.bec.flt.AngBecFltWs;

@Path("/rest/bec/flt")
public final class BecFltRestService {
    
    @Path("/AngBecFlt")
    @POST @Consumes (MediaType.APPLICATION_JSON) @Produces (MediaType.APPLICATION_JSON)
    public Response postAngBecFlt (ApiInput<AngBecFlt> input, @SynergyRestContext () ExecutionContext context) {
        SWriteCon wCon = null;
        try {
            wCon = SConnectionFactory.get ().getWriteConnection ();
            RestOutput output = new RestOutput (AngBecFltWs.get ().post (input.entity, input.params, context, wCon), context);
            wCon.commit ();
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            ConnectionsUtil.safeRollback (wCon);
            return ErrorResponse.get ().manageError (e, context, null);
        } finally {
            ConnectionsUtil.safeClose (wCon);
        } // try - catch - finally
    } // postAngBecFlt


    @Path("/AngBecFlt/newId")
    @GET @Produces (MediaType.APPLICATION_JSON)
    public Response getAngBecFltNewUid (@SynergyRestContext () ExecutionContext context) {
        SReadCon rCon = null;
        try {
            rCon = SConnectionFactory.get ().getReadConnection ();
            return Response.ok ().entity (new RestOutput (AngBecFltWs.get ().getNewUid (context, rCon), context)).build ();
        } catch (Throwable e) {
            return ErrorResponse.get ().manageError (e, context, rCon);
        } finally {
            ConnectionsUtil.safeClose (rCon);
        } // try - catch - finally
    } // getAngBecFltNewUid

    @Path("/AngBecFlt/byCode/{becFltCod}")
    @GET @Produces (MediaType.APPLICATION_JSON)
    @Deprecated
    public Response getAngBecFltByCode (@PathParam("becFltCod") String becFltCod, @SynergyRestContext () ExecutionContext context) {
        SReadCon rCon = null;
        try {
            rCon = SConnectionFactory.get ().getReadConnection ();
            RestOutput output = new RestOutput (AngBecFltWs.get ().getByCode (becFltCod, true, context, rCon), context);
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            return ErrorResponse.get ().manageError (e, context, rCon);
        } finally {
            ConnectionsUtil.safeClose (rCon);
        } // try - catch - finally
    } // getAngBecFltByCode
    
    @Path("/AngBecFlt/byCode")
    @GET @Produces (MediaType.APPLICATION_JSON)
    public Response getAngBecFltByCode2 (@QueryParam("becFltCod") String becFltCod, @SynergyRestContext () ExecutionContext context) {
        SReadCon rCon = null;
        try {
            rCon = SConnectionFactory.get ().getReadConnection ();
            RestOutput output = new RestOutput (AngBecFltWs.get ().getByCode (becFltCod, true, context, rCon), context);
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            return ErrorResponse.get ().manageError (e, context, rCon);
        } finally {
            ConnectionsUtil.safeClose (rCon);
        } // try - catch - finally
    } // getAngBecFltByCode

    /**
     * Cerca tutte le traduzioni in lingua di un record. 
     *
     * @param uid L'uid del record di cui cercarne le traduzioni.
     * @return La lista delle lingue in db ciascuna contenente la lista delle traduzioni di AngBecFlt con la traduzione in lingua del record. Se la lista delle traduzioni e' null, non esistono traduzioni in quella lingua del record.
     */
    @Path("/AngBecFlt/tra/{uid}")
    @GET @Produces (MediaType.APPLICATION_JSON)
    public Response getAngBecFltTranslations (@PathParam("uid") long uid, @SynergyRestContext () ExecutionContext context) {
        SReadCon rCon = null;
        try {
            rCon = SConnectionFactory.get ().getReadConnection ();
            RestOutput output = new RestOutput (AngBecFltWs.get ().getTranslations (uid, true, context, rCon), context);
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            return ErrorResponse.get ().manageError (e, context, rCon);
        } finally {
            ConnectionsUtil.safeClose (rCon);
        } // try - catch - finally
    } // getAngBecFltTranslations


    @Path("/AngBecFlt/{uid}")
    @DELETE @Produces (MediaType.APPLICATION_JSON)
    public Response deleteAngBecFltById (@PathParam("uid") long uid, @SynergyRestContext () ExecutionContext context) {
        SWriteCon wCon = null;
        try {
            wCon = SConnectionFactory.get ().getWriteConnection ();
            AngBecFltWs.get ().delete (uid, context, wCon);

            wCon.commit ();
            RestOutput output = new RestOutput (true, context);
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            ConnectionsUtil.safeRollback (wCon);
            return ErrorResponse.get ().manageError (e, context, null);
        } finally {
            ConnectionsUtil.safeClose (wCon);
        } // try - catch - finally
    } // deleteAngBecFltById


    @Path("/AngBecFlt/all")
    @PUT @Produces (MediaType.APPLICATION_JSON)
    public Response updateAngBecFltAll (ApiInput<AngBecFlt> input, @SynergyRestContext () ExecutionContext context) {
        SWriteCon wCon = null;
        try {
            wCon = SConnectionFactory.get ().getWriteConnection ();
            var output = new RestOutput (AngBecFltWs.get ().updateAll (input.entity, input.params, context, wCon), context);
            wCon.commit ();
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            ConnectionsUtil.safeRollback (wCon);
            return ErrorResponse.get ().manageError (e, context, null);
        } finally {
            ConnectionsUtil.safeClose (wCon);
        } // try - catch - finally
    } // updateAngBecFltAll
      



    @Path("/AngBecFlt/all")
    @GET @Produces (MediaType.APPLICATION_JSON)
    public Response getAllAngBecFlt (@SynergyRestContext () ExecutionContext context, @QueryParam("complete") boolean completeQuery) {
        SReadCon rCon = null;
        try {
            rCon = SConnectionFactory.get ().getReadConnection ();
            RestOutput output = new RestOutput (AngBecFltWs.get ().getAll (completeQuery, true, context, rCon), context);
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            return ErrorResponse.get ().manageError (e, context, rCon);
        } finally {
            ConnectionsUtil.safeClose (rCon);
        } // try - catch - finally
    } // getAllAngBecFlt
  
    @Path("/AngBecFlt/active")
    @GET @Produces (MediaType.APPLICATION_JSON)
    public Response getActiveAngBecFlt (@SynergyRestContext () ExecutionContext context, @QueryParam("complete") boolean completeQuery) {
        SReadCon rCon = null;
        try {
            rCon = SConnectionFactory.get ().getReadConnection ();
            RestOutput output = new RestOutput (AngBecFltWs.get ().getActive (completeQuery, true, context, rCon), context);
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            return ErrorResponse.get ().manageError (e, context, rCon);
        } finally {
            ConnectionsUtil.safeClose (rCon);
        } // try - catch - finally
    } // getActiveAngBecFlt

    @Path("/AngBecFlt/byId/{uid}")
    @GET @Produces (MediaType.APPLICATION_JSON)
    public Response getAngBecFltById (@PathParam("uid") long uid, @SynergyRestContext () ExecutionContext context, @QueryParam("upf") Boolean loadUpf) {
        SReadCon rCon = null;
        try {
            rCon = SConnectionFactory.get ().getReadConnection ();
            RestOutput output = new RestOutput (AngBecFltWs.get ().getById (uid, loadUpf == null ? true : loadUpf, true, context, rCon), context);
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            return ErrorResponse.get ().manageError (e, context, rCon);
        } finally {
            ConnectionsUtil.safeClose (rCon);
        } // try - catch - finally
    } // getAngBecFltById

    @Path("/AngBecFltLng")
    @POST @Consumes (MediaType.APPLICATION_JSON) @Produces (MediaType.APPLICATION_JSON)
    public Response postAngBecFltLng (ApiInput<AngBecFltLng> input, @SynergyRestContext () ExecutionContext context) {
        SWriteCon wCon = null;
        try {
            wCon = SConnectionFactory.get ().getWriteConnection ();
            RestOutput output = new RestOutput (AngBecFltLngWs.get ().post (input.entity, input.params, context, wCon), context);
            wCon.commit ();
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            ConnectionsUtil.safeRollback (wCon);
            return ErrorResponse.get ().manageError (e, context, null);
        } finally {
            ConnectionsUtil.safeClose (wCon);
        } // try - catch - finally
    } // postAngBecFltLng


    @Path("/AngBecFltLng/{recUid}/{lngUid}")
    @DELETE @Produces (MediaType.APPLICATION_JSON)
    public Response deleteAngBecFltLngById (@PathParam("recUid") long recUid, @PathParam("lngUid") long lngUid, @SynergyRestContext () ExecutionContext context) {
        SWriteCon wCon = null;
        try {
            wCon = SConnectionFactory.get ().getWriteConnection ();
            AngBecFltLngWs.get ().delete (recUid, lngUid, context, wCon);

            wCon.commit ();
            RestOutput output = new RestOutput (true, context);
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            ConnectionsUtil.safeRollback (wCon);
            return ErrorResponse.get ().manageError (e, context, null);
        } finally {
            ConnectionsUtil.safeClose (wCon);
        } // try - catch - finally
    } // deleteAngBecFltLngById


    @Path("/AngBecFltLng/all")
    @PUT @Produces (MediaType.APPLICATION_JSON)
    public Response updateAngBecFltLngAll (ApiInput<AngBecFltLng> input, @SynergyRestContext () ExecutionContext context) {
        SWriteCon wCon = null;
        try {
            wCon = SConnectionFactory.get ().getWriteConnection ();
            var output = new RestOutput (AngBecFltLngWs.get ().updateAll (input.entity, input.params, context, wCon), context);
            wCon.commit ();
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            ConnectionsUtil.safeRollback (wCon);
            return ErrorResponse.get ().manageError (e, context, null);
        } finally {
            ConnectionsUtil.safeClose (wCon);
        } // try - catch - finally
    } // updateAngBecFltLngAll
      



    @Path("/AngBecFltLng/all")
    @GET @Produces (MediaType.APPLICATION_JSON)
    public Response getAllAngBecFltLng (@SynergyRestContext () ExecutionContext context, @QueryParam("complete") boolean completeQuery) {
        SReadCon rCon = null;
        try {
            rCon = SConnectionFactory.get ().getReadConnection ();
            RestOutput output = new RestOutput (AngBecFltLngWs.get ().getAll (completeQuery, true, context, rCon), context);
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            return ErrorResponse.get ().manageError (e, context, rCon);
        } finally {
            ConnectionsUtil.safeClose (rCon);
        } // try - catch - finally
    } // getAllAngBecFltLng
  
    @Path("/AngBecFltLng/active")
    @GET @Produces (MediaType.APPLICATION_JSON)
    public Response getActiveAngBecFltLng (@SynergyRestContext () ExecutionContext context, @QueryParam("complete") boolean completeQuery) {
        SReadCon rCon = null;
        try {
            rCon = SConnectionFactory.get ().getReadConnection ();
            RestOutput output = new RestOutput (AngBecFltLngWs.get ().getActive (completeQuery, true, context, rCon), context);
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            return ErrorResponse.get ().manageError (e, context, rCon);
        } finally {
            ConnectionsUtil.safeClose (rCon);
        } // try - catch - finally
    } // getActiveAngBecFltLng

    @Path("/AngBecFltLng/byId/{recUid}/{lngUid}")
    @GET @Produces (MediaType.APPLICATION_JSON)
    public Response getAngBecFltLngById (@PathParam("recUid") long recUid, @PathParam("lngUid") long lngUid, @SynergyRestContext () ExecutionContext context, @QueryParam("upf") Boolean loadUpf) {
        SReadCon rCon = null;
        try {
            rCon = SConnectionFactory.get ().getReadConnection ();
            RestOutput output = new RestOutput (AngBecFltLngWs.get ().getById (recUid, lngUid, loadUpf == null ? true : loadUpf, true, context, rCon), context);
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            return ErrorResponse.get ().manageError (e, context, rCon);
        } finally {
            ConnectionsUtil.safeClose (rCon);
        } // try - catch - finally
    } // getAngBecFltLngById

    
    
} // BecFltRestService