package io.matheusvictor.singleton;

import java.util.Objects;

public class ConfigurationAPI {
    private static ConfigurationAPI instance;

    private ConfigurationAPI() {}

    public static ConfigurationAPI getInstance() {
        synchronized (ConfigurationAPI.class) {
            if (Objects.isNull(instance)) instance = new ConfigurationAPI();
        }

        return instance;
    }
}
