import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileWordCharLineCount {
    public static void main(String[] args) {
        String filePath = "example.txt";  // Change this to your file path

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int wordCount = 0, charCount = 0, lineCount = 0;

            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.split("\\s+");  // Split line by spaces
                wordCount += words.length;
            }

            System.out.println("Number of Lines: " + lineCount);
            System.out.println("Number of Words: " + wordCount);
            System.out.println("Number of Characters: " + charCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
