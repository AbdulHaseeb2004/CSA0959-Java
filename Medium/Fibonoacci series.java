class Fibonacci implements Runnable {
    private int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    public void run() {
        if (n < 0) {
            System.out.println("Invalid input");
            return;
        }
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }
}

public class FibonacciThread {
    public static void main(String[] args) {
        Thread t = new Thread(new Fibonacci(5));
        t.start();
    }
}
