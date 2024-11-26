
import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class ConfigManager {
    private Properties properties;
    private String filePath;

    public ConfigManager(String filePath) {
        this.filePath = filePath;
        properties = new Properties();
        loadProperties();
    }

    private void loadProperties() {
        try (FileInputStream inputStream = new FileInputStream(filePath)) {
            properties.load(inputStream);
        } catch (IOException e) {
            System.err.println("Error loading configuration file: " + e.getMessage());
        }
    }

    public void displayProperties() {
        properties.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public void updateProperty(String key, String value) {
        properties.setProperty(key, value);
    }

    public void saveProperties() {
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            properties.store(outputStream, "Updated configuration properties");
            System.out.println("Properties updated successfully.");
        } catch (IOException e) {
            System.err.println("Error saving configuration file: " + e.getMessage());
        }
    }
}
