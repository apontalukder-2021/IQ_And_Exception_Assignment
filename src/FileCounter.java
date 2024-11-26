
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCounter {
    private String filename;
    private int lineCount, wordCount, charCount;

    public FileCounter(String filename) {
        this.filename = filename;
    }

    public void processFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                wordCount += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public void displayCounts() {
        System.out.println("Lines: " + lineCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Characters: " + charCount);
    }
}
