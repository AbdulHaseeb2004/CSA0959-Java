import java.util.Scanner;
import java.util.ArrayList;

public class PerfectSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter lower range: ");
        int lower = sc.nextInt();
        System.out.print("Enter upper range: ");
        int upper = sc.nextInt();
        
        if (lower > upper || lower < 0 || upper < 0) {
            System.out.println("Invalid range.");
        } else {
            ArrayList<Integer> result = findPerfectSquares(lower, upper);
            System.out.println(result);
        }
        sc.close();
    }
    
    public static ArrayList<Integer> findPerfectSquares(int lower, int upper) {
        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = (int) Math.ceil(Math.sqrt(lower)); i <= Math.sqrt(upper); i++) {
            int square = i * i;
            if (sumOfDigits(square) < 10) {
                squares.add(square);
            }
        }
        return squares;
    }
    
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
