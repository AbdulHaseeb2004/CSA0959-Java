import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Invalid input. N must be a positive integer.");
        } else {
            int nthPrime = findNthPrime(n);
            System.out.println(n + "rd Prime number is " + nthPrime);
            System.out.println(n + " prime numbers after " + nthPrime + " are: ");
            printPrimesAfterNth(nthPrime, n);
        }
        sc.close();
    }
    
    public static int findNthPrime(int n) {
        int count = 0;
        int num = 1;
        while (count < n) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }
        return num;
    }
    
    public static void printPrimesAfterNth(int nthPrime, int n) {
        int count = 0;
        int num = nthPrime + 1;
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
