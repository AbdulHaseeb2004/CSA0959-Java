import java.util.Scanner;

public class FactorFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Given Number: ");
        int num = sc.nextInt();
        System.out.print("N = ");
        int n = sc.nextInt();
        
        if (num <= 0 || n <= 0) {
            System.out.println("Invalid input. Number and N must be positive.");
        } else {
            int count = 0;
            System.out.println("Factors of " + num + ": ");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                    System.out.print(i + " ");
                }
            }
            System.out.println("\nNumber of factors = " + count);
            System.out.println(n + "th factor of " + num + " = " + nthFactor(num, n));
        }
        sc.close();
    }
    
    public static int nthFactor(int num, int n) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
                if (count == n) {
                    return i;
                }
            }
        }
        return -1; // Return -1 if n is greater than number of factors.
    }
}
