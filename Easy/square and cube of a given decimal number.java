import java.util.Scanner;

public class SquareCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double number = sc.nextDouble();

        System.out.println("Square: " + (number * number));
        System.out.println("Cube: " + (number * number * number));
    }
}
