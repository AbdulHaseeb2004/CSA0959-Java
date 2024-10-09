import java.util.Arrays;
import java.util.HashMap;

public class MeanMedianMode {
    public static void main(String[] args) {
        int[] array = {16, 18, 27, 16, 23, 21, 19};
        double mean = calculateMean(array);
        System.out.println("Mean = " + mean);
        double median = calculateMedian(array);
        System.out.println("Median = " + median);
        int mode = calculateMode(array);
        System.out.println("Mode = " + mode);
    }
    public static double calculateMean(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    public static double calculateMedian(int[] array) {
        Arrays.sort(array);
        if (array.length % 2 == 0) {
            return (array[array.length / 2 - 1] + array[array.length / 2]) / 2.0;
        } else {
            return array[array.length / 2];
        }
    }
    public static int calculateMode(int[] array) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int mode = array[0];
        int maxCount = 0;
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) > maxCount) {
                maxCount = frequencyMap.get(num);
                mode = num;
            }
        }
        return mode;
    }
}
