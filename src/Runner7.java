
import java.util.Scanner;

public class Runner7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the path for the first file: ");
        String file1Path = scanner.nextLine();

        System.out.print("Enter the path for the second file: ");
        String file2Path = scanner.nextLine();

        System.out.print("Enter the path for the output file: ");
        String outputPath = scanner.nextLine();

        FileMerger merger = new FileMerger(file1Path, file2Path, outputPath);
        merger.mergeFiles();
    }
}
