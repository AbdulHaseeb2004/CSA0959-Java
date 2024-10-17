import java.util.Scanner;
public class LCMGCD {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N value: ");
        int N = sc.nextInt();
        int[] numbers = new int[N];
        System.out.println("Enter numbers:");
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        int resultGCD = numbers[0];
        int resultLCM = numbers[0];
        
        for (int i = 1; i < N; i++) {
            resultGCD = gcd(resultGCD, numbers[i]);
            resultLCM = lcm(resultLCM, numbers[i]);
        }
        System.out.println("LCM = " + resultLCM);
        System.out.println("GCD = " + resultGCD);
    }
}
