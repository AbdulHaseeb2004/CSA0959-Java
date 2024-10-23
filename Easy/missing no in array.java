import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println("Missing number: " + findMissingNumber(nums));
    }

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return totalSum - sum;
    }
}
