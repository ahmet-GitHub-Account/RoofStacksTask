package com.roofStacks.utilities;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * We can read all the information from the configuration.properties file through ConfigurationReader class.
 * Thus we can put our for instance the browser type, credentials, url or the other informations.
 * So we have the easy maintenance and more centralize code.
 */
public class ConfigurationReader {

    private static Properties properties;

    static {

        try {
            String path = "configuration.properties";
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);

            input.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static String get(String keyName) {
        return properties.getProperty(keyName);
    }

}