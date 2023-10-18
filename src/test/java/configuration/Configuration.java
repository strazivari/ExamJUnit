package configuration;

import java.io.*;
import java.util.Properties;
import java.io.IOException;

public class Configuration {
    protected static FileInputStream fis;
    protected static Properties property;

    static {
        try {
            fis = new FileInputStream("src/test/resources/application.properties");
            property = new Properties();
            property.load(fis);
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
    }

    public static String getProperty(String key) {
        return property.getProperty(key);
    }
}