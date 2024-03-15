package io.matheusvictor.singleton;

public class Singleton {
    public static void main(String[] args) {
        ConfigurationAPI config = ConfigurationAPI.getInstance();
        ConfigurationAPI config2 = ConfigurationAPI.getInstance();

        System.out.println(config);
        System.out.println(config2);
    }
}
