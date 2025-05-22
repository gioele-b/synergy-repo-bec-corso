package net.synergy2.data.bec;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.synergy2.data.base.IDataInstaller;
import net.synergy2.data.bec.flt.BecFltColumnLabels;
import net.synergy2.data.label.bec.BecStandardLabelList;
import net.synergy2.data.sys.installer.FormDesignInstaller;
import net.synergy2.data.sys.installer.abstracts.AColumnLabelInstaller.ColumnLabel;
import net.synergy2.data.sys.installer.formDesign.base.IFormDesignInstaller.IDbmColUidGetter;
import net.synergy2.data.sys.installer.formDesign.base.IFormDesignInstaller.ISTranslator;
import net.synergy2.data.util.InstallConfig;
import net.synergy2.data.util.InstallerUtil;
import net.synergy2.db.bec.Constants;
import net.synergy2.db.sys.tra.SysTraLbl;
import net.synergy2.db.sys.uif.SysFrmDsg;
import net.synergy2.logic.sys.ColumnDesigns.ColumnDesign;

/**
 * Classe che si occupa di installare in ordine tutti gli elementi dell'applicazione bec
 */
public class BecInstaller implements IDataInstaller {

    @Override
    public String getModuleCode() {
        return Constants.AppCode.BEC;
    }

    @Override
    public List<String> getProducts() {
        // TODO inserire i prodotti altrimenti lista vuota
        // return List.of (BecProducts.STANDARD.toString (), BecProducts.PROFESSIONAL.toString (), BecProducts.ADVANCED.toString ());
        return List.of();
    }

    @Override
    public List<SysTraLbl> getLabelList(InstallConfig cfg) throws Exception {
        return new BecStandardLabelList().get(cfg);
    }

    @Override
    public Map<String, List<ColumnLabel>> getInjectedColumnLabelListByApp(
        InstallConfig cfg
    ) throws Exception {
        // TODO inserisci qui la gestione delle inejctedColumnLabel altrimenti lascia il null
        return null;
    }

    @Override
    public List<ColumnLabel> getColumnLabelList(InstallConfig cfg)
        throws Exception {
        var labels = new ArrayList<ColumnLabel>(500);
        labels.addAll(BecFltColumnLabels.get());
        return labels;
    }

    @Override
    public List<ColumnDesign> getColumnDesignList(InstallConfig cfg)
        throws Exception {
        // TODO inserisci qui la gestione delle columnDesign altrimenti lascia il null
        return null;
    }

    @Override
    public List<ColumnDesign> getTagsDictionary(InstallConfig cfg)
        throws Exception {
        // TODO inserisci qui la gestione delle tagsDictionary altrimenti lascia il null
        return null;
    }

    @Override
    public void injectFormDesign(
        SysFrmDsg formDesign,
        IDbmColUidGetter colUidGetter,
        ISTranslator sTranslate
    ) throws Exception {
        // TODO inserisci qui la gestione dell'injection del formDesign altrimenti lascia vuoto il metodo
        new BecFormDesignInjection()
            .injectFormDesign(formDesign, colUidGetter, sTranslate);
    }

    @Override
    public void install(InstallConfig cfg) throws Exception {
        int step = 1;
        InstallerUtil.install(
            new BecMessageInstaller(cfg),
            "Installazione messaggi BEC",
            step++
        );
        InstallerUtil.install(
            new BecGroupInstaller(cfg),
            "Installazione gruppi BEC",
            step++
        );
        // InstallerUtil.install (new BecSOTTO_MODULODataInstaller (cfg), "Installazione messaggi", step++);
        // InstallerUtil.install (new BecResourceInstaller (cfg), "Installazione risorse BEC", step++);
        InstallerUtil.install(
            new BecAppInstaller(cfg),
            "Installazione app BEC",
            step++
        );
        InstallerUtil.install(
            new BecMenuInstaller(cfg),
            "Installazione menù BEC",
            step++
        );
        InstallerUtil.install(
            new BecQueryInstaller(cfg),
            "Installazione query BEC",
            step++
        );
        InstallerUtil.install(
            new FormDesignInstaller(
                cfg,
                BecFormDesignList.get(),
                Constants.AppId.BEC
            ),
            "Installazione form design BEC",
            step++
        );
        InstallerUtil.install(
            new BecScheduledJobInstaller(cfg),
            "Installazione lavori schedulati BEC",
            step++
        );
        InstallerUtil.install(
            new BecRemoteInstaller(cfg),
            "Installazione ambienti remoti",
            step++
        );
    }
}
