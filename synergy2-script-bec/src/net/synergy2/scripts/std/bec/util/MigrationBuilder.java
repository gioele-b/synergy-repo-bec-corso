package net.synergy2.scripts.std.bec.util;

import java.util.ArrayList;
import java.util.List;
import net.synergy2.manager.script.ICreationScript;
import net.synergy2.manager.script.IScriptInterpreter;
import net.synergy2.scripts.std.util.AtomicScriptCode;

public class MigrationBuilder {

    private final IScriptInterpreter interpreter;
    private final String moduleCode;
    private final AtomicScriptCode scriptCode = new AtomicScriptCode();
    private final List<ThrowingRunnable> tasks = new ArrayList<>();

    private static String lastScriptCode = null;

    public MigrationBuilder(IScriptInterpreter interpreter, String moduleCode) {
        this.interpreter = interpreter;
        this.moduleCode = moduleCode;
    }

    public MigrationBuilder addSequence(ICreationScript sequence, String name) {
        tasks.add(() -> {
            lastScriptCode = scriptCode.setAndGet(name);
            interpreter.create(sequence, moduleCode, lastScriptCode);
        });
        return this;
    }

    public MigrationBuilder addTable(ICreationScript table, String name) {
        tasks.add(() -> {
            lastScriptCode = scriptCode.setAndGet(name);
            interpreter.create(table, moduleCode, lastScriptCode);
        });
        return this;
    }

    public MigrationBuilder addForeignKey(ICreationScript fk, String name) {
        tasks.add(() -> {
            lastScriptCode = scriptCode.setAndGet(name);
            interpreter.create(fk, moduleCode, lastScriptCode);
        });
        return this;
    }

    public void run() throws Exception {
        for (ThrowingRunnable task : tasks) {
            task.run();
        }
    }

    public static String getLastScriptCode() {
        return lastScriptCode;
    }
}
