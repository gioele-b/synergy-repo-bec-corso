package net.synergy2.rest.bec.vrt;

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
import net.synergy2.base.connections.SReadRemCon;
import net.synergy2.base.connections.SWriteCon;
import net.synergy2.base.connections.SWriteRemCon;
import net.synergy2.base.context.ExecutionContext;
import net.synergy2.base.rest.ApiInput;
import net.synergy2.base.rest.RestOutput;
import net.synergy2.base.rest.SynergyRestContext;
import net.synergy2.db.bec.vrt.BecVrtHisSrs;
import net.synergy2.rest.util.ErrorResponse;
import net.synergy2.ws.bec.vrt.BecVrtHisSrsWs;

@Path("/rest/bec/vrt")
public final class BecVrtRestService {
    
    @Path("/BecVrtHisSrs")
    @POST @Consumes (MediaType.APPLICATION_JSON) @Produces (MediaType.APPLICATION_JSON)
    public Response postBecVrtHisSrs (ApiInput<BecVrtHisSrs> input, @SynergyRestContext () ExecutionContext context) {
        SWriteCon wCon = null;
        SWriteRemCon wrCon = null;
        try {
            wCon = SConnectionFactory.get ().getWriteConnection ();
            wrCon = SConnectionFactory.get ().getRemoteWriteConnection (BecVrtHisSrsWs.get ().getDataSource (context, wCon));
            RestOutput output = new RestOutput (BecVrtHisSrsWs.get ().post (input.entity, input.params, context, wCon, wrCon), context);
            wCon.commit ();
            wrCon.commit ();
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            ConnectionsUtil.safeRollback (wCon);
            ConnectionsUtil.safeRollback (wrCon);
            return ErrorResponse.get ().manageError (e, context, null);
        } finally {
            ConnectionsUtil.safeClose (wCon);
            ConnectionsUtil.safeClose (wrCon);
        } // try - catch - finally
    } // postBecVrtHisSrs


    @Path("/BecVrtHisSrs/byCode/{itmCod}/{cusCod}")
    @GET @Produces (MediaType.APPLICATION_JSON)
    @Deprecated
    public Response getBecVrtHisSrsByCode (@PathParam("itmCod") String itmCod, @PathParam("cusCod") String cusCod, @SynergyRestContext () ExecutionContext context) {
        SReadCon rCon = null;SReadRemCon rrCon = null;
        try {
            rCon = SConnectionFactory.get ().getReadConnection ();rrCon = SConnectionFactory.get ().getRemoteReadConnection (BecVrtHisSrsWs.get ().getDataSource (context, rCon));
            RestOutput output = new RestOutput (BecVrtHisSrsWs.get ().getByCode (itmCod, cusCod, context, rCon, rrCon), context);
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            return ErrorResponse.get ().manageError (e, context, rCon);
        } finally {
            ConnectionsUtil.safeClose (rCon);if (rrCon != null) { rrCon.close (); }
        } // try - catch - finally
    } // getBecVrtHisSrsByCode
    
    @Path("/BecVrtHisSrs/byCode")
    @GET @Produces (MediaType.APPLICATION_JSON)
    public Response getBecVrtHisSrsByCode2 (@QueryParam("itmCod") String itmCod, @QueryParam("cusCod") String cusCod, @SynergyRestContext () ExecutionContext context) {
        SReadCon rCon = null;SReadRemCon rrCon = null;
        try {
            rCon = SConnectionFactory.get ().getReadConnection ();rrCon = SConnectionFactory.get ().getRemoteReadConnection (BecVrtHisSrsWs.get ().getDataSource (context, rCon));
            RestOutput output = new RestOutput (BecVrtHisSrsWs.get ().getByCode (itmCod, cusCod, context, rCon, rrCon), context);
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            return ErrorResponse.get ().manageError (e, context, rCon);
        } finally {
            ConnectionsUtil.safeClose (rCon);if (rrCon != null) { rrCon.close (); }
        } // try - catch - finally
    } // getBecVrtHisSrsByCode

    @Path("/BecVrtHisSrs/{uid}")
    @DELETE @Produces (MediaType.APPLICATION_JSON)
    public Response deleteBecVrtHisSrsById (@PathParam("uid") long uid, @SynergyRestContext () ExecutionContext context) {
        SWriteCon wCon = null;SWriteRemCon wrCon = null;
        try {
            wCon = SConnectionFactory.get ().getWriteConnection ();wrCon = SConnectionFactory.get ().getRemoteWriteConnection (BecVrtHisSrsWs.get ().getDataSource (context, wCon));
            BecVrtHisSrsWs.get ().delete (uid, context, wCon, wrCon);

            wCon.commit ();wrCon.commit ();
            RestOutput output = new RestOutput (true, context);
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            ConnectionsUtil.safeRollback (wCon);ConnectionsUtil.safeRollback (wrCon);
            return ErrorResponse.get ().manageError (e, context, null);
        } finally {
            ConnectionsUtil.safeClose (wCon);ConnectionsUtil.safeClose (wrCon);
        } // try - catch - finally
    } // deleteBecVrtHisSrsById


    @Path("/BecVrtHisSrs/all")
    @PUT @Produces (MediaType.APPLICATION_JSON)
    public Response updateBecVrtHisSrsAll (ApiInput<BecVrtHisSrs> input, @SynergyRestContext () ExecutionContext context) {
        SWriteCon wCon = null;SWriteRemCon wrCon = null;
        try {
            wCon = SConnectionFactory.get ().getWriteConnection ();wrCon = SConnectionFactory.get ().getRemoteWriteConnection (BecVrtHisSrsWs.get ().getDataSource (context, wCon));
            var output = new RestOutput (BecVrtHisSrsWs.get ().updateAll (input.entity, input.params, context, wCon, wrCon), context);
            wCon.commit ();wrCon.commit ();
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            ConnectionsUtil.safeRollback (wCon);ConnectionsUtil.safeRollback (wCon);
            return ErrorResponse.get ().manageError (e, context, null);
        } finally {
            ConnectionsUtil.safeClose (wCon);ConnectionsUtil.safeClose (wrCon);
        } // try - catch - finally
    } // updateBecVrtHisSrsAll
      



    @Path("/BecVrtHisSrs/all")
    @GET @Produces (MediaType.APPLICATION_JSON)
    public Response getAllBecVrtHisSrs (@SynergyRestContext () ExecutionContext context, @QueryParam("complete") boolean completeQuery) {
        SReadCon rCon = null;
        SReadRemCon rrCon = null;
        try {
            rCon = SConnectionFactory.get ().getReadConnection ();
            rrCon = SConnectionFactory.get ().getRemoteReadConnection (BecVrtHisSrsWs.get ().getDataSource (context, rCon));
            RestOutput output = new RestOutput (BecVrtHisSrsWs.get ().getAll (completeQuery, context, rCon, rrCon), context);
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            return ErrorResponse.get ().manageError (e, context, rCon);
        } finally {
            ConnectionsUtil.safeClose (rCon);
            ConnectionsUtil.safeClose (rrCon);
        } // try - catch - finally
    } // getAllBecVrtHisSrs
  
    @Path("/BecVrtHisSrs/active")
    @GET @Produces (MediaType.APPLICATION_JSON)
    public Response getActiveBecVrtHisSrs (@SynergyRestContext () ExecutionContext context, @QueryParam("complete") boolean completeQuery) {
        SReadCon rCon = null;
        SReadRemCon rrCon = null;
        try {
            rCon = SConnectionFactory.get ().getReadConnection ();
            rrCon = SConnectionFactory.get ().getRemoteReadConnection (BecVrtHisSrsWs.get ().getDataSource (context, rCon));
            RestOutput output = new RestOutput (BecVrtHisSrsWs.get ().getActive (completeQuery, context, rCon, rrCon), context);
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            return ErrorResponse.get ().manageError (e, context, rCon);
        } finally {
            ConnectionsUtil.safeClose (rCon);
            ConnectionsUtil.safeClose (rrCon);
        } // try - catch - finally
    } // getActiveBecVrtHisSrs

    @Path("/BecVrtHisSrs/byId/{uid}")
    @GET @Produces (MediaType.APPLICATION_JSON)
    public Response getBecVrtHisSrsById (@PathParam("uid") long uid, @SynergyRestContext () ExecutionContext context, @QueryParam("upf") Boolean loadUpf) {
        SReadCon rCon = null;
        SReadRemCon rrCon = null;
        try {
            rCon = SConnectionFactory.get ().getReadConnection ();
            rrCon = SConnectionFactory.get ().getRemoteReadConnection (BecVrtHisSrsWs.get ().getDataSource (context, rCon));
            RestOutput output = new RestOutput (BecVrtHisSrsWs.get ().getById (uid, loadUpf == null ? true : loadUpf, context, rCon, rrCon), context);
            return Response.ok ().entity (output).build ();
        } catch (Throwable e) {
            return ErrorResponse.get ().manageError (e, context, rCon);
        } finally {
            ConnectionsUtil.safeClose (rCon);
            ConnectionsUtil.safeClose (rrCon);
        } // try - catch - finally
    } // getBecVrtHisSrsById

    
    
} // BecVrtRestService