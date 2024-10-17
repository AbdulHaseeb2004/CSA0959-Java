import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if (n < 0) return -1; // Handle negative inputs
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        if (sc.hasNextInt()) {
            int N = sc.nextInt();
            int result = factorial(N);
            if (result == -1) {
                System.out.println("Factorial not defined for negative numbers.");
            } else {
                System.out.println(N + " Factorial = " + result);
            }
        } else {
            System.out.println("Invalid input.");
        }
    }
}
