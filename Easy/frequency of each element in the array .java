import java.util.HashMap;

public class FrequencyArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element | Frequency");
        for (int key : freqMap.keySet()) {
            System.out.println(key + "       | " + freqMap.get(key));
        }
    }
}
