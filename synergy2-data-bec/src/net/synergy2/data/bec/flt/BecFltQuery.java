package net.synergy2.data.bec.flt;

import java.util.ArrayList;
import java.util.List;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.bec.flt.AngBecFltImpl.AngBecFltFields;
import net.synergy2.db.sys.AngDbmTblColImpl.AngDbmTblColFields;
import net.synergy2.logic.base.IQueryModel;
import net.synergy2.logic.base.QueryInstallModel;
import net.synergy2.logic.base.QueryInstallModel.QueryDetailInstallModel;
import net.synergy2.logic.base.QueryUpdateModel;

/**
 * Classe che si occupa di generare la lista delle query standard per il modulo: bec.flt
 */
public class BecFltQuery {

    public static List<IQueryModel> get() {
        var toReturn = new ArrayList<IQueryModel>();
        QueryInstallModel query;
        QueryUpdateModel queryUpdate;

        query = new QueryInstallModel(
            "stdAngBecFlt",
            "Filtri",
            SAlias.AngBecFlt,
            "BecFlt",
            false
        );

        query.new QueryDetailInstallModel(
                "BecFlt",
                "QryCol",
                SAlias.AngBecFlt_FKI_QryDbmTblCol,
                false,
                QueryDetailInstallModel.INNER_JOIN,
                null
            );

        query.new QueryDetailInstallModel(
                "QryCol",
                "Col",
                SAlias.AngQryDbmTblCol_FKI_Col,
                false,
                QueryDetailInstallModel.INNER_JOIN,
                null
            );

        query.addColumn("BecFlt", AngBecFltFields.BecFltCod, true);
        query.addColumn("BecFlt", AngBecFltFields.BecFltDsc, true);
        query.addColumn("Col", AngDbmTblColFields.ColDsc, true);

        query.addSort("BecFlt", AngBecFltFields.BecFltCod, true);

        toReturn.add(query);

        return toReturn;
    }
}
