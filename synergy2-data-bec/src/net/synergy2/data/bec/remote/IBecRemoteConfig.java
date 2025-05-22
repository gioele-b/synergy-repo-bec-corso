package net.synergy2.data.bec.remote;

import net.synergy2.db.bec.vrt.BecVrtHisSrs;

public interface IBecRemoteConfig {
    Class<? extends BecVrtHisSrs> getBecVrtHisSrsDaoImplCls();

    String getDatasource();
}
