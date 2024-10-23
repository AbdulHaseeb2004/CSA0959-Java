import java.util.Scanner;

public class PowerOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.next();

        try {
            int n = Integer.parseInt(input);
            if (isPowerOfThree(n)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
    }

    public static boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
