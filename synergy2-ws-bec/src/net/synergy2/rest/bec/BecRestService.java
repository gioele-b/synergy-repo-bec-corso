package net.synergy2.rest.bec;

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
import net.synergy2.db.bec.BecVrsInf;
import net.synergy2.rest.util.ErrorResponse;
import net.synergy2.ws.bec.BecVrsInfWs;

@Path("/rest/bec")
public final class BecRestService {
    
    @Path("/BecVrsInf")
    @POST @Consumes (MediaType.APPLICATION_JSON) @Produces (MediaType.APPLICATION_JSON)
    public Response postBecVrsInf (ApiInput<BecVrsInf> input, @SynergyRestContext () ExecutionContext context) {
        SWriteCon wCon = null;
        try {
            wCon = SConnectionFactory.get ().getWriteConnection ();
            RestOutput output = new RestOutput (BecVrsInfWs.get ().post (input.entity, input.params, context, wCon), context);
            wCon.commit ();
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            ConnectionsUtil.safeRollback (wCon);
            return ErrorResponse.get ().manageError (e, context, null);
        } finally {
            ConnectionsUtil.safeClose (wCon);
        } // try - catch - finally
    } // postBecVrsInf


    @Path("/BecVrsInf/newId")
    @GET @Produces (MediaType.APPLICATION_JSON)
    public Response getBecVrsInfNewUid (@SynergyRestContext () ExecutionContext context) {
        SReadCon rCon = null;
        try {
            rCon = SConnectionFactory.get ().getReadConnection ();
            return Response.ok ().entity (new RestOutput (BecVrsInfWs.get ().getNewUid (context, rCon), context)).build ();
        } catch (Throwable e) {
            return ErrorResponse.get ().manageError (e, context, rCon);
        } finally {
            ConnectionsUtil.safeClose (rCon);
        } // try - catch - finally
    } // getBecVrsInfNewUid

    @Path("/BecVrsInf/byCode/{vrsMaj}/{vrsMin}/{vrsRel}")
    @GET @Produces (MediaType.APPLICATION_JSON)
    @Deprecated
    public Response getBecVrsInfByCode (@PathParam("vrsMaj") int vrsMaj, @PathParam("vrsMin") int vrsMin, @PathParam("vrsRel") int vrsRel, @SynergyRestContext () ExecutionContext context) {
        SReadCon rCon = null;
        try {
            rCon = SConnectionFactory.get ().getReadConnection ();
            RestOutput output = new RestOutput (BecVrsInfWs.get ().getByCode (vrsMaj, vrsMin, vrsRel, true, context, rCon), context);
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            return ErrorResponse.get ().manageError (e, context, rCon);
        } finally {
            ConnectionsUtil.safeClose (rCon);
        } // try - catch - finally
    } // getBecVrsInfByCode
    
    @Path("/BecVrsInf/byCode")
    @GET @Produces (MediaType.APPLICATION_JSON)
    public Response getBecVrsInfByCode2 (@QueryParam("vrsMaj") int vrsMaj, @QueryParam("vrsMin") int vrsMin, @QueryParam("vrsRel") int vrsRel, @SynergyRestContext () ExecutionContext context) {
        SReadCon rCon = null;
        try {
            rCon = SConnectionFactory.get ().getReadConnection ();
            RestOutput output = new RestOutput (BecVrsInfWs.get ().getByCode (vrsMaj, vrsMin, vrsRel, true, context, rCon), context);
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            return ErrorResponse.get ().manageError (e, context, rCon);
        } finally {
            ConnectionsUtil.safeClose (rCon);
        } // try - catch - finally
    } // getBecVrsInfByCode

    @Path("/BecVrsInf/{uid}")
    @DELETE @Produces (MediaType.APPLICATION_JSON)
    public Response deleteBecVrsInfById (@PathParam("uid") long uid, @SynergyRestContext () ExecutionContext context) {
        SWriteCon wCon = null;
        try {
            wCon = SConnectionFactory.get ().getWriteConnection ();
            BecVrsInfWs.get ().delete (uid, context, wCon);

            wCon.commit ();
            RestOutput output = new RestOutput (true, context);
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            ConnectionsUtil.safeRollback (wCon);
            return ErrorResponse.get ().manageError (e, context, null);
        } finally {
            ConnectionsUtil.safeClose (wCon);
        } // try - catch - finally
    } // deleteBecVrsInfById


    @Path("/BecVrsInf/all")
    @PUT @Produces (MediaType.APPLICATION_JSON)
    public Response updateBecVrsInfAll (ApiInput<BecVrsInf> input, @SynergyRestContext () ExecutionContext context) {
        SWriteCon wCon = null;
        try {
            wCon = SConnectionFactory.get ().getWriteConnection ();
            var output = new RestOutput (BecVrsInfWs.get ().updateAll (input.entity, input.params, context, wCon), context);
            wCon.commit ();
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            ConnectionsUtil.safeRollback (wCon);
            return ErrorResponse.get ().manageError (e, context, null);
        } finally {
            ConnectionsUtil.safeClose (wCon);
        } // try - catch - finally
    } // updateBecVrsInfAll
      



    @Path("/BecVrsInf/all")
    @GET @Produces (MediaType.APPLICATION_JSON)
    public Response getAllBecVrsInf (@SynergyRestContext () ExecutionContext context, @QueryParam("complete") boolean completeQuery) {
        SReadCon rCon = null;
        try {
            rCon = SConnectionFactory.get ().getReadConnection ();
            RestOutput output = new RestOutput (BecVrsInfWs.get ().getAll (completeQuery, true, context, rCon), context);
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            return ErrorResponse.get ().manageError (e, context, rCon);
        } finally {
            ConnectionsUtil.safeClose (rCon);
        } // try - catch - finally
    } // getAllBecVrsInf
  
    @Path("/BecVrsInf/active")
    @GET @Produces (MediaType.APPLICATION_JSON)
    public Response getActiveBecVrsInf (@SynergyRestContext () ExecutionContext context, @QueryParam("complete") boolean completeQuery) {
        SReadCon rCon = null;
        try {
            rCon = SConnectionFactory.get ().getReadConnection ();
            RestOutput output = new RestOutput (BecVrsInfWs.get ().getActive (completeQuery, true, context, rCon), context);
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            return ErrorResponse.get ().manageError (e, context, rCon);
        } finally {
            ConnectionsUtil.safeClose (rCon);
        } // try - catch - finally
    } // getActiveBecVrsInf

    @Path("/BecVrsInf/byId/{uid}")
    @GET @Produces (MediaType.APPLICATION_JSON)
    public Response getBecVrsInfById (@PathParam("uid") long uid, @SynergyRestContext () ExecutionContext context, @QueryParam("upf") Boolean loadUpf) {
        SReadCon rCon = null;
        try {
            rCon = SConnectionFactory.get ().getReadConnection ();
            RestOutput output = new RestOutput (BecVrsInfWs.get ().getById (uid, loadUpf == null ? true : loadUpf, true, context, rCon), context);
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            return ErrorResponse.get ().manageError (e, context, rCon);
        } finally {
            ConnectionsUtil.safeClose (rCon);
        } // try - catch - finally
    } // getBecVrsInfById

    
    
} // BecRestService