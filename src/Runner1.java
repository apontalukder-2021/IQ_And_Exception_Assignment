
import java.util.Scanner;

public class Runner1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the path of the file containing email addresses: ");
        String inputFile = scanner.nextLine();

        System.out.print("Enter the output file path for valid email addresses: ");
        String outputFile = scanner.nextLine();

        EmailValidator validator = new EmailValidator();
        validator.filterValidEmails(inputFile, outputFile);
    }
}
