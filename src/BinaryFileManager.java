
import java.io.*;
import java.util.Scanner;

public class BinaryFileManager {
    private String filePath;

    public BinaryFileManager(String filePath) {
        this.filePath = filePath;
    }

    // Reads a binary file and writes its contents to another file
    public void copyFile(String destinationPath) {
        try (FileInputStream inputStream = new FileInputStream(filePath);
             FileOutputStream outputStream = new FileOutputStream(destinationPath)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }
    }

    // Appends data to the end of the file
    public void appendData(byte[] data) {
        try (FileOutputStream outputStream = new FileOutputStream(filePath, true)) {
            outputStream.write(data);
            System.out.println("Data appended successfully.");

        } catch (IOException e) {
            System.err.println("Error appending data: " + e.getMessage());
        }
    }
}
