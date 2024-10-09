import java.util.Scanner;
public class BinaryConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        String binaryString = scanner.nextLine();
        if (!binaryString.matches("[01]+")) {
            System.out.println("Invalid binary input.");
        } else {
            int decimal = Integer.parseInt(binaryString, 2);
            String octal = Integer.toOctalString(decimal);

            System.out.println("Decimal Number: " + decimal);
            System.out.println("Octal: " + octal);
        }
        scanner.close();
    }
}
