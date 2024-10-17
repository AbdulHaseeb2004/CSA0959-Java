import java.util.Scanner;

public class NumberOfFactors {
    public static int countFactors(int num) {
        if (num <= 0) return -1; 
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int result = countFactors(num);
        if (result == -1) {
            System.out.println("Factors not defined for zero or negative numbers.");
        } else {
            System.out.println("Number of factors = " + result);
        }
    }
}
