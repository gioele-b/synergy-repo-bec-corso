package net.synergy2.data.bec;

import java.util.ArrayList;
import java.util.List;
import net.synergy2.data.sys.installer.abstracts.AMessageInstaller;
import net.synergy2.data.util.InstallConfig;
import net.synergy2.db.sys.tra.SysTraMsg;
import net.synergy2.logic.bec.flt.BecFltMessage;

/**
 * Classe che si occupa di installare tutti i messaggi per i vari moduli
 */
public class BecMessageInstaller extends AMessageInstaller {

    public BecMessageInstaller(InstallConfig cfg) {
        super(cfg);
    }

    @Override
    protected List<SysTraMsg> getMessages(InstallConfig arg0) throws Exception {
        var messages = new ArrayList<SysTraMsg>(1000);
        messages.addAll(addMessage(BecFltMessage.values(), "bec.flt"));
        return messages;
    }
}
