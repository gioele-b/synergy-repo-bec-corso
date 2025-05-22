package net.synergy2.data.bec;

import java.util.Objects;
import java.util.Optional;
import net.synergy2.base.util.devel.SynergyLogger;
import net.synergy2.data.bec.remote.BecRemoteFactory;
import net.synergy2.data.bec.remote.IBecRemoteConfig;
import net.synergy2.data.util.InstallConfig;
import net.synergy2.data.util.RestInstaller;
import net.synergy2.db.base.SRemoteModel;
import net.synergy2.db.bec.vrt.BecVrtHisSrs;
import net.synergy2.db.sys.AngDbmTbl;
import net.synergy2.rest.client.ResponseException;

public class BecRemoteInstaller extends RestInstaller {

    public BecRemoteInstaller(InstallConfig cfg) {
        super(cfg);
    }

    @Override
    protected void execute() throws Exception {
        Optional<IBecRemoteConfig> remoteConfigOptional =
            BecRemoteFactory.getConfig(
                this.getCfg().getRemoteConfigByKey(BecRemoteFactory.KEY)
            );
        if (remoteConfigOptional.isPresent()) {
            var remoteConfig = remoteConfigOptional.get();
            updateTable(
                BecVrtHisSrs.class,
                remoteConfig.getBecVrtHisSrsDaoImplCls(),
                remoteConfig.getDatasource()
            );
        }
        SynergyLogger.get().info("\tAmbienti remoti installati.");
    }

    private <R extends SRemoteModel> void updateTable(
        Class<R> tableClass,
        Class<? extends R> implClass,
        String dataSource
    ) throws ResponseException {
        AngDbmTbl table = get(
            "rest/sys/AngDbmTbl/byCode/" + tableClass.getSimpleName(),
            AngDbmTbl.class
        );
        Objects.requireNonNull(
            table,
            "Table not found: " + tableClass.getSimpleName()
        );
        table.setTblDaoImplCls(implClass.getCanonicalName());
        table.setTblDatSrc(dataSource);
        put("rest/sys/AngDbmTbl/all", table, AngDbmTbl.class);
    }
}
