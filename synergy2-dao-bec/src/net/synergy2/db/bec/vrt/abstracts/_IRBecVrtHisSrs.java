package net.synergy2.db.bec.vrt.abstracts;

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
import net.synergy2.db.bec.vrt.BecVrtHisSrs;

public interface _IRBecVrtHisSrs {

    BecVrtHisSrs getById (long uid, ExecutionContext context, SReadCon rCon, SReadRemCon rrCon) throws SConnectionException, SSqlException;
    BecVrtHisSrs getByCode (String itmCod, String cusCod, ExecutionContext context, SReadCon rCon, SReadRemCon rrCon) throws SConnectionException, SSqlException;
    List<BecVrtHisSrs> getAll (boolean completeQuery, ExecutionContext context, SReadCon rCon, SReadRemCon rrCon) throws SConnectionException, SSqlException;
    List<BecVrtHisSrs> getActive (boolean completeQuery, ExecutionContext context, SReadCon rCon, SReadRemCon rrCon) throws SConnectionException, SSqlException;
    List<BecVrtHisSrs> getAll (boolean completeQuery, Set<String> selectCols, Set<String> searchCols, List<String> sorts, String searchString, ExecutionContext context, SReadCon rCon, SReadRemCon rrCon) throws SConnectionException, SSqlException;
    List<BecVrtHisSrs> getActive (boolean completeQuery, Set<String> selectCols, Set<String> searchCols, List<String> sorts, String searchString, ExecutionContext context, SReadCon rCon, SReadRemCon rrCon) throws SConnectionException, SSqlException;
    BecVrtHisSrs insert (BecVrtHisSrs model, ExecutionContext context, SWriteCon wCon, SWriteRemCon wrCon) throws SConnectionException, SSqlException, SCodeExistsException, SModelNullException, SAuditException, SIdExistsException;
    BecVrtHisSrs updateAll (BecVrtHisSrs model, ExecutionContext context, SWriteCon wCon, SWriteRemCon wrCon) throws SConnectionException, SSqlException, SCodeExistsException, SModelNullException, SNotLastVersionException, SAuditException, SIdNullException, SIdExistsException;
    void delete (BecVrtHisSrs model, ExecutionContext context, SWriteCon wCon, SWriteRemCon wrCon) throws SModelNullException, SConnectionException, SRecordNotFoundException, SAuditException, SSqlException;
    BecVrtHisSrs ensure (BecVrtHisSrs model, Boolean checkValid, ExecutionContext context, SReadCon rCon, SReadRemCon rrCon) throws SSqlException, SConnectionException;
    void setDataSource (String dataSource);
    
} // _IRBecVrtHisSrs
