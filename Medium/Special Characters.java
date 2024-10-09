import java.util.Scanner;
public class SpecialCharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the statement: ");
        String statement = scanner.nextLine();
        int specialCharCount = 0;
        for (char c : statement.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                specialCharCount++;
            }
        }
        System.out.println("Number of special characters: " + specialCharCount);
        scanner.close();
    }
}
