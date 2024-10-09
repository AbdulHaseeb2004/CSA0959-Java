public class CompositeNumbers {
    public static void main(String[] args) {
        int[] array = {16, 18, 27, 16, 23, 21, 19};
        int compositeCount = 0;
        for (int num : array) {
            if (isComposite(num)) {
                compositeCount++;
            }
        }
        System.out.println("Number of Composite Numbers = " + compositeCount);
    }
    public static boolean isComposite(int num) {
        if (num < 2) return false; // Numbers less than 2 are not composite
        int divisors = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisors++;
            }
        }
        return divisors > 2;
    }
}
