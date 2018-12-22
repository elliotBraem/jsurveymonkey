package utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {

    private static final Properties APPLICATION_PROPERTIES;

    /**
     * Static utility class
     */
    private ConfigManager() { }

    static {
        String propFileName = "/config.properties";
        // Try to load application properties
        Properties properties = new Properties();

        InputStream in = ConfigManager.class.getResourceAsStream(propFileName);
        try {
            properties.load(in);
        } catch (Exception e) {
            e.printStackTrace();
        }
        APPLICATION_PROPERTIES = properties;
    }

    public static String getProperty(String key) {
        return APPLICATION_PROPERTIES.getProperty(key);
    }
    public static void setProperty(String property) { APPLICATION_PROPERTIES.setProperty("category", property); }
}