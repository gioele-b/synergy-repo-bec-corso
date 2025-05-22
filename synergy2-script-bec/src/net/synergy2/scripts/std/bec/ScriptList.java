package net.synergy2.scripts.std.bec;

import net.synergy2.manager.script.Dictionary;
import net.synergy2.manager.script.Dictionary.TABLE_TYPE;
import net.synergy2.manager.script.IScriptInterpreter;
import net.synergy2.manager.script.IScriptList;
import net.synergy2.manager.script.ScriptException;
import net.synergy2.manager.script.TableDef;
import net.synergy2.scripts.std.setup.SetupTables;

public class ScriptList implements IScriptList {

    public static final String MODULE_CODE = "bec";

    @Override
    public void update(IScriptInterpreter interpreter, Dictionary dictionary)
        throws ScriptException {
        String scriptCode = null;
        try {
            interpreter.create(
                getBecVrsInf(dictionary),
                MODULE_CODE,
                scriptCode = "BecVrsInf"
            );

            interpreter.create(
                BecModules.getMBecFlt(),
                MODULE_CODE,
                scriptCode = "MBecFlt"
            );

            interpreter.create(
                BecModules.getMBecVrt(),
                MODULE_CODE,
                scriptCode = "MBecVrt"
            );
            // IMPL - Aggiungere sempre in coda i prossimi script e spostare questo commento alla fine

        } catch (Exception exception) {
            throw new ScriptException(exception, scriptCode);
        }
    }

    public static TableDef getBecVrsInf(Dictionary dictionary) {
        TableDef sct = TableDef.create(
            "BecVrsInf",
            MODULE_CODE,
            TABLE_TYPE.SYN_COMMON
        ).setDescriptions("Vers.Info", "Informazioni versione BEC");
        SetupTables.addStandardColumnsToVersionTable(dictionary, sct);
        return sct;
    }
}
