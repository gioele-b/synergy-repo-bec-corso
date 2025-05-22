package net.synergy2.scripts.std.bec.util;

import net.synergy2.manager.script.Dictionary;
import net.synergy2.manager.script.TableDef;

public class TableBuilder {

    private final TableDef table;
    private final Dictionary dictionary;

    public TableBuilder(String name, String moduleCode, Dictionary dictionary) {
        this.table = TableDef.create(name, moduleCode).setFlags(false, true);
        this.dictionary = dictionary;
    }

    public TableBuilder description(String shortDesc, String longDesc) {
        table.setDescriptions(shortDesc, longDesc);
        return this;
    }

    public TableBuilder id(String sequence) {
        table.addColumn(
            dictionary
                .createNew(Dictionary.UID)
                .setDescriptions("Id", "Id univoco")
                .setSequenceRef(sequence)
                .setFlags(true, false, false, false)
        );
        return this;
    }

    public TableBuilder code(String name, String shortDesc, String longDesc) {
        table.addColumn(
            dictionary
                .createNew(Dictionary.CODE, name)
                .setDescriptions(shortDesc, longDesc)
                .setFlags(false, false, true, false)
        );
        return this;
    }

    public TableBuilder text(String name, String shortDesc, String longDesc) {
        table.addColumn(
            dictionary
                .createNew(Dictionary.LONG_DESC, name)
                .setDescriptions(shortDesc, longDesc)
                .setFlags(false, false, false, true)
        );
        return this;
    }

    public TableBuilder foreignId(
        String name,
        String shortDesc,
        String longDesc
    ) {
        table.addColumn(
            dictionary
                .createNew(Dictionary.UID, name)
                .setDescriptions(shortDesc, longDesc)
                .setFlags(false, false, false, false)
        );
        return this;
    }

    public TableBuilder softDeletes() {
        table.addColumn(dictionary.createNew(Dictionary.LOGICAL_DELETE));
        return this;
    }

    public TableBuilder entity() {
        table.addColumn(
            dictionary
                .createNew(Dictionary.ENTITY)
                .setFlags(false, true, false, false)
        );
        return this;
    }

    public TableDef build() {
        return table;
    }
}
