
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the path of the file containing URLs: ");
        String filePath = scanner.nextLine();

        List<String> urls = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String url;
            while ((url = br.readLine()) != null) {
                urls.add(url);
            }
        } catch (IOException e) {
            System.err.println("Error reading URL file.");
            e.printStackTrace();
            return;
        }

        UrlContentDownloader downloader = new UrlContentDownloader(urls);
        downloader.downloadContents();
    }
}
