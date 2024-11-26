
import java.io.*;

public class FileProcessor {
    private String inputFilePath;
    private String oddFilePath;
    private String evenFilePath;

    public FileProcessor(String inputFilePath, String oddFilePath, String evenFilePath) {
        this.inputFilePath = inputFilePath;
        this.oddFilePath = oddFilePath;
        this.evenFilePath = evenFilePath;
    }

    public void processFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             PrintWriter oddWriter = new PrintWriter(new FileWriter(oddFilePath));
             PrintWriter evenWriter = new PrintWriter(new FileWriter(evenFilePath))) {

            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                if (lineNumber % 2 == 0) {
                    evenWriter.println(line);
                } else {
                    oddWriter.println(line);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            System.err.println("An error occurred while processing the file: " + e.getMessage());
        }
    }
}
