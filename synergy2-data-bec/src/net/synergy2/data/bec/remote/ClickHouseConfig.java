package net.synergy2.data.bec.remote;

import net.synergy2.db.bec.vrt.BecVrtHisSrs;

public class ClickHouseConfig implements IBecRemoteConfig {

    public static final String DATSRCBECCKH = "ckh-bec-ds";

    @Override
    public Class<? extends BecVrtHisSrs> getBecVrtHisSrsDaoImplCls() {
        //TODO! Da capire cosa ritornare
        return null;
    }

    @Override
    public String getDatasource() {
        return DATSRCBECCKH;
    }
}
