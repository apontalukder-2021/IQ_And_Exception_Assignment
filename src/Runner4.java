
import java.util.Scanner;

public class Runner4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = "config.properties";

        ConfigManager configManager = new ConfigManager(filePath);

        System.out.println("Current properties:");
        configManager.displayProperties();

        System.out.print("Enter the property key to update: ");
        String key = scanner.nextLine();

        System.out.print("Enter the new value: ");
        String value = scanner.nextLine();

        configManager.updateProperty(key, value);
        configManager.saveProperties();
    }
}
