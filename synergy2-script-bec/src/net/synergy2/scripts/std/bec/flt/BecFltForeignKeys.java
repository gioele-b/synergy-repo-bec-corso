package net.synergy2.scripts.std.bec.flt;

import net.synergy2.manager.script.RfkDef;

public class BecFltForeignKeys {

    public static RfkDef getFBecFlt001() {
        return RfkDef.createManyToOne("FBecFlt001", "QryDbmTblCol", "BecFltLst")
            .setSource("AngBecFlt", "QryDbmTblColUid")
            .setTarget("AngQryDbmTblCol", "Uid");
    }
}
