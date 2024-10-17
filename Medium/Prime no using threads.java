import java.util.Scanner;

class PrimeCheck implements Runnable {
    private int num;

    public PrimeCheck(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        if (num <= 1) {
            System.out.println(num + " is not Prime.");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is Prime.");
        } else {
            System.out.println(num + " is not Prime.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            PrimeCheck primeCheck = new PrimeCheck(num);
            Thread thread = new Thread(primeCheck);
            thread.start();
        } else {
            System.out.println("Invalid input.");
        }
    }
}
