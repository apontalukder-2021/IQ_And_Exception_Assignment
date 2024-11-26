
import java.util.Scanner;

public class Runner6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String filePath = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.nextLine();

        System.out.print("Enter the new word: ");
        String newWord = scanner.nextLine();

        TextFileEditor editor = new TextFileEditor(filePath);
        editor.replaceWord(oldWord, newWord);
    }
}
