import java.util.Scanner;

public class PerfectNumber {
    public static boolean isPerfect(int num) {
        if (num <= 0) return false; // Handle non-positive numbers
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (isPerfect(num)) {
                System.out.println("It's a Perfect Number.");
            } else {
                System.out.println("It's not a Perfect Number.");
            }
        } else {
            System.out.println("Invalid input.");
        }
    }
}
