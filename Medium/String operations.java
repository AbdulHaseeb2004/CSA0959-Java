import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        // i) Replace a word in the string
        String replacedString = input.replace("Saveetha", "XYZ");
        System.out.println("String after replacement: " + replacedString);

        // ii) Find the length of the string
        System.out.println("Length of the string: " + input.length());

        // iii) Uppercase conversion
        System.out.println("Uppercase conversion: " + input.toUpperCase());
    }
}
