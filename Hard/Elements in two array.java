import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CommonElements {
    public List<Integer> findCommonElements(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> common = new ArrayList<>();
        
        for (int num : arr1) {
            set.add(num);
        }
        
        for (int num : arr2) {
            if (set.contains(num)) {
                common.add(num);
            }
        }
        
        return common;
    }

    public static void main(String[] args) {
        CommonElements ce = new CommonElements();
        System.out.println(ce.findCommonElements(new int[]{1, 2, 3, 4}, new int[]{2, 4, 5, 6, 7}));  // Output: [2, 4]
    }
}
