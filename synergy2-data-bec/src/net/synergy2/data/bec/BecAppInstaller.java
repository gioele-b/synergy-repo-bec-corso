package net.synergy2.data.bec;

import net.synergy2.base.util.devel.DebugUtil;
import net.synergy2.data.util.BaseAppInstaller;
import net.synergy2.data.util.InstallConfig;
import net.synergy2.db.bec.Constants;
import net.synergy2.db.sys.uif.AngThm;

// @formatter:off
/**
 * Classe che installare le varie applicazioni e i temi ad esse collegati
 */
public class BecAppInstaller extends BaseAppInstaller {

    /**
     * Crea una nuova istanza impostando la configurazione
     *
     * @becam cfg Configurazione
     */
    public BecAppInstaller (InstallConfig cfg) {
        super (cfg);
    }

    @Override
    protected void execute () throws Exception {
        AngThm sysTheme = this.get("/rest/sys/uif/AngThm/byCode/app-synergy-theme", AngThm.class);
        installApp (Constants.AppId.BEC, "bec", "Budget e Controllo", "bec", "mdi mdi-wheelchair-accessibility", "#000000", BecGroupInstaller.becAppAccess.getGrpCod(), sysTheme.getUid ());
        registerApp (Constants.AppId.BEC, Constants.AppCode.BEC, "Bec");
        DebugUtil.toDebuggers ("\tApplicazioni installate.");
    }

}
