package net.synergy2.data.bec;

import net.synergy2.data.sys.installer.abstracts.AGroupInstaller;
import net.synergy2.data.util.InstallConfig;
import net.synergy2.db.sys.grp.AngGrp;
import net.synergy2.logic.base.BaseLogic.BaseDataConstants;

/**
 * Classe che si occupa di installare tutte le risorse bec
 */
public class BecGroupInstaller extends AGroupInstaller {

    public static AngGrp becAdminAccess;
    public static AngGrp becAppAccess;

    public BecGroupInstaller(InstallConfig cfg) {
        super(cfg);
    }

    @Override
    protected void execute() throws Exception {
        var becAdminMembers = userGroup(
            "@BecAdminMembers",
            "BEC admin [membri]",
            "mdi mdi-security-account",
            PRIVATE_GROUP
        );
        var becAppMembers = userGroup(
            "@BecAppMembers",
            "BEC app [membri]",
            "mdi mdi-security-account",
            PRIVATE_GROUP
        );

        var systemAdmin = get(
            AngGrp.baseUrl() + "/byCode/" + BaseDataConstants.SYSTEM_ADMIN_GRP,
            AngGrp.class
        );

        var becAdminAccess = calculatedGroup(
            "@BecAdmin",
            "BEC admin [autorizzazione]",
            "mdi mdi-security-account",
            PUBLIC_GROUP,
            becAdminMembers,
            systemAdmin
        );
        var becAppAccess = calculatedGroup(
            "@BecApp",
            "BEC app [autorizzazione]",
            "mdi mdi-security-account",
            PUBLIC_GROUP,
            becAppMembers,
            becAdminAccess
        );

        BecGroupInstaller.becAdminAccess = becAdminAccess;
        BecGroupInstaller.becAppAccess = becAppAccess;
    }
}
