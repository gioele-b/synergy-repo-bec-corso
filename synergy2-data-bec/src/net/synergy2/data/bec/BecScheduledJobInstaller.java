package net.synergy2.data.bec;

import net.synergy2.data.sys.installer.abstracts.AScheduledJobInstaller;
import net.synergy2.data.util.InstallConfig;

/**
 * Classe che si occupa di installare tutti i job dell'applicazione: bec
 */
public class BecScheduledJobInstaller extends AScheduledJobInstaller {

    /**
     * Crea una nuova istanza impostando la configurazione
     *
     * @param cfg Configurazione
     */
    public BecScheduledJobInstaller(InstallConfig cfg) {
        super(cfg);
    } // BecScheduledJobInstaller

    @Override
    protected void execute() throws Exception {} // execute
}
