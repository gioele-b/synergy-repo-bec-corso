package net.synergy2.scripts.std.bec.flt;

import net.synergy2.manager.script.Dictionary;
import net.synergy2.manager.script.TableDef;
import net.synergy2.scripts.std.bec.util.TableBuilder;

public class BecFltTables {

    public static TableDef getAngBecFlt(Dictionary dictionary) {
        return new TableBuilder("AngBecFlt", ScriptList.MODULE_CODE, dictionary)
            .description("Filtri", "Filtri")
            .id("SBecFlt001")
            .code("BecFltCod", "Codice", "Codice filtro")
            .text("BecFltDsc", "Descrizione", "Descrizione filtro")
            .foreignId("QryDbmTblColUid", "Colonna", "Colonna")
            .softDeletes()
            .entity()
            .build();
    }
}
