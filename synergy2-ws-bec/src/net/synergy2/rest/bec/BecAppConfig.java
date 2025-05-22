package net.synergy2.rest.bec;

import java.util.List;
import java.util.Set;
import net.synergy2.base.fw.IModuleConfig;
import net.synergy2.base.fw.inject.IStartable;
import net.synergy2.base.fw.inject.IStoppable;
import net.synergy2.logic.bec.flt.BecFltLogic;
import net.synergy2.logic.sys.qry.ISysQryInjectedLogic.SysQryInjectedLogics;

public class BecAppConfig implements IModuleConfig {

    @Override
    public String getModuleCode() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "Unimplemented method 'getModuleCode'"
        );
    }

    @Override
    public List<IStartable> getStartables() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "Unimplemented method 'getStartables'"
        );
    }

    @Override
    public List<IStoppable> getStoppables() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
            "Unimplemented method 'getStoppables'"
        );
    }

    @Override
    public void injectProviders(Set<String> var1) {
        SysQryInjectedLogics.get().registerLogic(BecFltLogic.get());
    }
}
