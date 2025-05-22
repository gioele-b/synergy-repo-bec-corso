package net.synergy2.data.bec.flt;

import java.util.ArrayList;
import java.util.List;
import net.synergy2.data.sys.installer.abstracts.AColumnLabelInstaller.ColumnLabel;
import net.synergy2.db.base.SAlias;
import net.synergy2.db.bec.flt.AngBecFltImpl.AngBecFltFields;

/**
 * Classe che contiene la lista di label per le colonne nel modulo: bec.flt
 */
public class BecFltColumnLabels {

    public static List<ColumnLabel> get() throws Exception {
        List<ColumnLabel> r = new ArrayList<>();

        r.add(
            ColumnLabel.alterByColumn(
                SAlias.AngBecFlt,
                AngBecFltFields.Uid,
                "filtro"
            )
        );
        r.add(
            ColumnLabel.alterByColumn(
                SAlias.AngBecFlt,
                AngBecFltFields.BecFltCod,
                "filtro"
            )
        );
        r.add(
            ColumnLabel.alterByColumn(
                SAlias.AngBecFlt,
                AngBecFltFields.BecFltDsc,
                "descrizioneFiltro"
            )
        );
        r.add(
            ColumnLabel.alterByColumn(
                SAlias.AngBecFlt,
                AngBecFltFields.QryDbmTblColUid,
                "colonna"
            )
        );

        return r;
    }
}
