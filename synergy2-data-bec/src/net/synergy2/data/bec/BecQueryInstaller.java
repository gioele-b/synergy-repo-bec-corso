package net.synergy2.data.bec;

import net.synergy2.base.util.devel.DebugUtil;
import net.synergy2.data.bec.flt.BecFltQuery;
import net.synergy2.data.util.BaseQueryInstaller;
import net.synergy2.data.util.InstallConfig;

/**
 * Classe che si occupa di installare tutte le query di default per i vari moduli
 */
public class BecQueryInstaller extends BaseQueryInstaller {

    public BecQueryInstaller(InstallConfig cfg) {
        super(cfg);
    }

    @Override
    protected void execute() throws Exception {
        installQuery(BecFltQuery.get());

        DebugUtil.toDebuggers("\tQuery installate.");
        System.out.flush();
    }
}
