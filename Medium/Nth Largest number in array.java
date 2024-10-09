import java.util.Arrays;
import java.util.Scanner;

public class NthLargestNumber {
    public static void main(String[] args) {
        int[] array = {14, 67, 48, 23, 5, 62};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        if (N <= 0 || N > array.length) {
            System.out.println("Invalid value for N.");
        } else {
            Arrays.sort(array);
            System.out.println(N + "th Largest number: " + array[array.length - N]);
        }
        scanner.close();
    }
}
