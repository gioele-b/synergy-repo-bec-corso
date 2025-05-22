package net.synergy2.data.bec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.synergy2.data.sys.installer.abstracts.AMenuInstaller;
import net.synergy2.data.util.InstallConfig;
import net.synergy2.data.util.SetupUtil;
import net.synergy2.db.bec.Constants;
import net.synergy2.db.bec.uif.route.BecRoute;
import net.synergy2.db.sys.grp.AngGrp;
import net.synergy2.db.sys.uif.SysMnu;
import net.synergy2.db.sys.uif.route.ISynergyRoute;
import net.synergy2.db.sys.uif.route.SysRoute;

/**
 * Classe che si occupa di installare tutti i punti a menu per i vari moduli
 */
public class BecMenuInstaller extends AMenuInstaller {

    public BecMenuInstaller(InstallConfig cfg) {
        super(cfg);
    }

    @Override
    protected List<SysMnu> getMenuList() throws Exception {
        var su = SetupUtil.get();
        var toReturn = new ArrayList<SysMnu>();

        var folderAng = newFolder(
            "folderSysAng",
            "Anagrafiche di base",
            "mdi mdi-folder-edit",
            true,
            su.getModule("sys"),
            null
        );

        folderAng.addChdLst(
            newVoice(
                Constants.AppId.BEC,
                BecRoute.BEC_FILTER_BASE_PATH,
                "Filtri",
                "mdi mdi-filter",
                true,
                su.getModule("bec.flt"),
                BecGroupInstaller.becAdminAccess
            )
        );

        toReturn.add(folderAng);

        return toReturn;
    }

    @Override
    protected List<ISynergyRoute> getMenuUrlToAddInThisApp() throws Exception {
        return Arrays.asList(
            // SysRoute.WORKSPACES,
            SysRoute.GLOBAL_OPTIONS
        );
    }

    @Override
    protected long getAppUidForMenuUrl(String menuUrl) throws Exception {
        return Constants.AppId.BEC;
    }

    private static SysMnu newFolder(
        String mnuCod,
        String mnuDsc,
        String mnuIco,
        boolean mnuEnb,
        Long mdlUid,
        AngGrp grp
    ) {
        return SysMnu.createNewFolder(
            mnuCod,
            mnuDsc,
            mnuIco,
            mnuEnb,
            mdlUid,
            grp == null ? null : grp.getUid()
        );
    }

    private static SysMnu newVoice(
        long appUid,
        ISynergyRoute url,
        String mnuDsc,
        String mnuIco,
        boolean mnuEnb,
        Long mdlUid,
        AngGrp grp
    ) {
        return newVoice(
            appUid,
            url,
            mnuDsc,
            mnuIco,
            mnuEnb,
            false,
            mdlUid,
            grp
        );
    }

    private static SysMnu newVoice(
        long appUid,
        ISynergyRoute url,
        String mnuDsc,
        String mnuIco,
        boolean mnuEnb,
        boolean mnuHid,
        Long mdlUid,
        AngGrp grp
    ) {
        return SysMnu.createNewVoice(
            url,
            mnuDsc,
            mnuIco,
            mnuEnb,
            mnuHid,
            mdlUid,
            grp == null ? null : grp.getUid(),
            appUid
        );
    }
}
