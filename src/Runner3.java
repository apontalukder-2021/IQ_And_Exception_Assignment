
public class Runner3 {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String oddFilePath = "oddLines.txt";
        String evenFilePath = "evenLines.txt";

        FileProcessor processor = new FileProcessor(inputFilePath, oddFilePath, evenFilePath);
        processor.processFile();

        System.out.println("Processing complete. Check oddLines.txt and evenLines.txt for output.");
    }
}
