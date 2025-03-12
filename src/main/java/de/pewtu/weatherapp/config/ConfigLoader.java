package de.pewtu.weatherapp.config;

import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Properties;

public class ConfigLoader {
    public static String getApiKey() {
        try (InputStreamReader reader = new InputStreamReader(
                Objects.requireNonNull(ConfigLoader.class.getClassLoader().getResourceAsStream("config.properties")))) {
            Properties properties = new Properties();
            properties.load(reader);
            return properties.getProperty("api.key");
        } catch (Exception e) {
            throw new RuntimeException("API key not found in config.properties");
        }
    }
}
