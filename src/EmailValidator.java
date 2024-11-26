
import java.io.*;
import java.util.regex.*;

public class EmailValidator {
    private static final String EMAIL_REGEX = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    private Pattern pattern;

    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean isValid(String email) {
        return pattern.matcher(email).matches();
    }

    public void filterValidEmails(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String email;
            while ((email = reader.readLine()) != null) {
                if (isValid(email)) {
                    writer.write(email);
                    writer.newLine();
                }
            }
            System.out.println("Valid emails have been written to " + outputFile);
        } catch (IOException e) {
            System.err.println("Error processing files.");
            e.printStackTrace();
        }
    }
}
