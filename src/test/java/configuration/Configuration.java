package configuration;

import java.io.*;
import java.util.Properties;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Configuration {
    protected static FileInputStream fis;
    protected static Properties property;

    static Logger logger = Logger.getLogger(Configuration.class.getName());

    static {
        try {
            fis = new FileInputStream("src/test/resources/application.properties");
            property = new Properties();
            property.load(fis);
        } catch (IOException e) {
            logger.log(Level.WARNING, "ОШИБКА: Файл свойств отсуствует!");
        }
    }

    public static String getProperty(String key) {
        return property.getProperty(key);
    }
}