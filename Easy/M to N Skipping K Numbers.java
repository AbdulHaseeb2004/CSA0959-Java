import java.util.Scanner;

public class SkipNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M value: ");
        int M = sc.nextInt();
        System.out.print("Enter N value: ");
        int N = sc.nextInt();
        System.out.print("Enter K value: ");
        int K = sc.nextInt();

        for (int i = M; i <= N; i += K + 1) {
            System.out.print(i + " ");
        }
    }
}
