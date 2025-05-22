package net.synergy2.data.bec.SOTTO_MODULO;

import java.util.ArrayList;
import java.util.List;
import net.synergy2.logic.base.IQueryModel;
import net.synergy2.logic.base.QueryInstallModel;
import net.synergy2.logic.base.QueryUpdateModel;

/**
 * Classe che si occupa di generare la lista delle query standard per il modulo: bec.SOTTO_MODULO
 */
public class BecSOTTO_MODULOQuery {

    public static List<IQueryModel> get() {
        var toReturn = new ArrayList<IQueryModel>();
        QueryInstallModel query;
        QueryUpdateModel queryUpdate;

        // query = new QueryInstallModel ("stdAngEtyAtt", "Allegati", SAlias.AngEtyAtt, "EtyAtt", true);
        // query.addColumn ("EtyAtt", AngEtyAttFields.RefEtyUid, true);
        // query.addColumn ("EtyAtt", AngEtyAttFields.AttNam, true);
        // toReturn.add (query);

        return toReturn;
    } // get
}
