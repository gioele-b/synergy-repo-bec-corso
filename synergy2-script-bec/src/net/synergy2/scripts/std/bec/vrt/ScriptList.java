package net.synergy2.scripts.std.bec.vrt;

import net.synergy2.manager.script.Dictionary;
import net.synergy2.manager.script.IScriptInterpreter;
import net.synergy2.manager.script.IScriptList;
import net.synergy2.manager.script.ScriptException;
import net.synergy2.scripts.std.bec.util.MigrationBuilder;

public class ScriptList implements IScriptList {

    public static final String MODULE_CODE = "bec.vrt";

    @Override
    public void update(IScriptInterpreter interpreter, Dictionary dictionary)
        throws ScriptException {
        try {
            new MigrationBuilder(interpreter, MODULE_CODE)
                .addSequence(BecVrtSequences.getSBecVrt001(), "SBecVrt001")
                .addTable(
                    BecVrtTables.getBecVrtHisSrs(dictionary),
                    "BecVrtHisSrs"
                )
                .run();
        } catch (Exception ex) {
            throw new ScriptException(ex, MigrationBuilder.getLastScriptCode());
        }
    }
}
