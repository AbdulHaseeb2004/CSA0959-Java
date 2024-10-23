import java.util.Scanner;

public class NthOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        
        if (N > 0) {
            for (int i = 1; i <= 2 * N; i += 2) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("N must be positive.");
        }
    }
}
