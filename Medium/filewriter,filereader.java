import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) {
        String content = "Computer Science and Engineering";

        // Writing to a file
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(content);
            System.out.println("Successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred during writing: " + e.getMessage());
        }

        // Reading from a file
        try (FileReader reader = new FileReader("output.txt")) {
            int ch;
            System.out.print("File content: ");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("An error occurred during reading: " + e.getMessage());
        }
    }
}
