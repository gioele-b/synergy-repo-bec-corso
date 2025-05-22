package net.synergy2.scripts.std.bec.vrt;

import net.synergy2.manager.script.ColumnDef;
import net.synergy2.manager.script.Dictionary;
import net.synergy2.manager.script.TableDef;

public class BecVrtTables {

    public static TableDef getBecVrtHisSrs(Dictionary dictionary) {
        TableDef sct = TableDef.create(
            "BecVrtHisSrs",
            ScriptList.MODULE_CODE,
            null
        )
            .setDescriptions("BecVrtHisSrs", "[virtual] Serie Storica")
            .setFlags(false, false, true);

        sct.addColumn(
            dictionary
                .createNew(Dictionary.UID, "Uid")
                .setFlags(true, false, false, false)
        );
        sct.addColumn(
            dictionary
                .createNew(Dictionary.CODE, "ItmCod")
                .setFlags(false, false, true, false)
        );
        sct.addColumn(
            dictionary
                .createNew(Dictionary.LONG_DESC, "ItmDsc")
                .setFlags(false, false, false, true)
                .setTranslatable(false)
        );
        sct.addColumn(
            dictionary
                .createNew(Dictionary.CODE, "CusCod")
                .setFlags(false, false, true, false)
        );
        sct.addColumn(
            dictionary
                .createNew(Dictionary.LONG_DESC, "CusDsc")
                .setFlags(false, false, false, true)
                .setTranslatable(false)
        );
        sct.addColumn(
            ColumnDef.createIntegerColumn("Month", 2).setDescriptions(
                "Month",
                "Month"
            )
        );
        sct.addColumn(
            ColumnDef.createDecimalColumn("Qta", 9, 6).setDescriptions(
                "Qta",
                "Quantity"
            )
        );

        return sct;
    }
}
