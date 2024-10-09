import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : array) {
            set.add(num);
        }
        Integer[] nonDuplicateArray = set.toArray(new Integer[0]);
        System.out.println("Non-duplicate items: " + Arrays.toString(nonDuplicateArray));
        scanner.close();
    }
}
