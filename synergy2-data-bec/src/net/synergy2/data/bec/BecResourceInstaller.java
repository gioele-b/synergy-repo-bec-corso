package net.synergy2.data.bec;

import net.synergy2.data.sys.installer.abstracts.AResourceInstaller;
import net.synergy2.data.util.InstallConfig;

/**
 * Classe che si occupa di installare tutte le risorse bec
 */
public class BecResourceInstaller extends AResourceInstaller {

    public BecResourceInstaller(InstallConfig cfg) {
        super(cfg);
    } // BecResourceInstaller

    @Override
    protected void execute() throws Exception {
        // var type = getTyp ("type");
        // installAngRes (BEC_SERVICE, "Bec service user", "@bec", "bec40S3rv1c3", type);
    } // execute
}
