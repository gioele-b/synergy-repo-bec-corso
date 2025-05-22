package net.synergy2.rest.bec;

import java.util.List;
import java.util.Set;
import net.synergy2.base.fw.IModuleConfig;
import net.synergy2.base.fw.inject.IStartable;
import net.synergy2.base.fw.inject.IStoppable;
import net.synergy2.db.bec.Constants;
import net.synergy2.swagger.IModuleApiConfig;

public class BecModuleConfig implements IModuleConfig, IModuleApiConfig {

    @Override
    public String getModuleCode() {
        return Constants.AppCode.BEC;
    }

    @Override
    public List<IStartable> getStartables() {
        return List.of();
    } // getStartables

    @Override
    public List<IStoppable> getStoppables() {
        return List.of();
    } // getStoppables

    @Override
    public void injectProviders(Set<String> appCodes) {} // injectProviders

    @Override
    public SwaggerApiConfigurations getSwaggerApiConfigurations() {
        return new SwaggerApiConfigurations(List.of(), List.of());
    }
}
