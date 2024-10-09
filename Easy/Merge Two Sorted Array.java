import java.util.ArrayList;
import java.util.Collections;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};
        ArrayList<Integer> mergedArray = new ArrayList<>();
        for (int num : arr1) {
            mergedArray.add(num);
        }
        for (int num : arr2) {
            mergedArray.add(num);
        }
        Collections.sort(mergedArray);
        System.out.println("Merged Sorted Array: " + mergedArray);
    }
}
