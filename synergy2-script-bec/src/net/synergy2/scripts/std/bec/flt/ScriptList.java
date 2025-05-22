package net.synergy2.scripts.std.bec.flt;

import net.synergy2.manager.script.Dictionary;
import net.synergy2.manager.script.IScriptInterpreter;
import net.synergy2.manager.script.IScriptList;
import net.synergy2.manager.script.ScriptException;
import net.synergy2.scripts.std.bec.util.MigrationBuilder;

public class ScriptList implements IScriptList {

    public static final String MODULE_CODE = "bec.flt";

    @Override
    public void update(IScriptInterpreter interpreter, Dictionary dictionary)
        throws ScriptException {
        try {
            new MigrationBuilder(interpreter, MODULE_CODE)
                .addSequence(BecFltSequences.getSBecFlt001(), "SBecFlt001")
                .addTable(BecFltTables.getAngBecFlt(dictionary), "AngBecFlt")
                .addForeignKey(BecFltForeignKeys.getFBecFlt001(), "FBecFlt001")
                .run();
        } catch (Exception ex) {
            throw new ScriptException(ex, MigrationBuilder.getLastScriptCode());
        }
    }
}
