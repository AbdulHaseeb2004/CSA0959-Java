import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
                sum += arr[i];
            }

            // Trying to access index beyond the array size to throw exception
            System.out.println("Sum: " + sum);
            System.out.println(arr[n]);  // This will throw ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access array index beyond its size.");
        } finally {
            scanner.close();
        }
    }
}
