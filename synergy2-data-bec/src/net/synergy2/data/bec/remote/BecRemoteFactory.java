package net.synergy2.data.bec.remote;

import java.util.Optional;
import net.synergy2.base.fw.InstanceManager;

public class BecRemoteFactory {

    public static final String KEY = "bec";

    public static final String CLICKHOUSE = "clickhouse";

    public static Optional<IBecRemoteConfig> getConfig(String configName) {
        if (configName != null) {
            return switch (configName) {
                case CLICKHOUSE -> Optional.of(new ClickHouseConfig());
                default -> Optional.ofNullable(
                    InstanceManager.create(IBecRemoteConfig.class, configName)
                );
            };
        } else {
            return Optional.empty();
        }
    }
}
