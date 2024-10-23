public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 7, 8, 6};  // Example input
        int n = 8;  // Array range from 1 to 8
        System.out.println("Missing number: " + findMissingNumber(arr, n));
    }

    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;  // Sum of numbers from 1 to n
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;  // Missing number is the difference
    }
}
