
import java.io.*;

public class FileManager {
    private String file1Path;
    private String file2Path;
    private String outputPath;

    public FileManager(String file1Path, String file2Path, String outputPath) {
        this.file1Path = file1Path;
        this.file2Path = file2Path;
        this.outputPath = outputPath;
    }

    // Method to merge the files
    public void mergeFiles() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath, true));
             BufferedReader reader1 = new BufferedReader(new FileReader(file1Path));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2Path))) {

            copyFileContent(reader1, writer);
            copyFileContent(reader2, writer);
            System.out.println("Files merged successfully into " + outputPath);

        } catch (IOException e) {
            System.err.println("Error occurred during file merge: " + e.getMessage());
        }
    }

    private void copyFileContent(BufferedReader reader, BufferedWriter writer) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            writer.write(line);
            writer.newLine();
        }
    }
}
