import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
        System.out.println("Modified array: " + Arrays.toString(arr));
    }

    public static void duplicateZeros(int[] arr) {
        int possibleDups = 0;
        int length = arr.length - 1;

        for (int i = 0; i <= length - possibleDups; i++) {
            if (arr[i] == 0) {
                if (i == length - possibleDups) {
                    arr[length] = 0;
                    length--;
                    break;
                }
                possibleDups++;
            }
        }

        for (int i = length - possibleDups; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }
}
