package configuration;

import java.io.*;
import java.util.Properties;
import java.io.IOException;

public class Configuration {
    public void props() {

        FileInputStream fis;
        Properties property = new Properties();


        try {
            fis = new FileInputStream("src/test/resources/application.properties");
            property.load(fis);

            String host = property.getProperty("host");
            String login = property.getProperty("login");
            String password = property.getProperty("password");
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
    }
    public static void printProperties(Properties properties)
    {
        properties.stringPropertyNames().stream()
                .map(key -> key + ":" + properties.getProperty(key))
                .forEach(System.out::println);
    }

}