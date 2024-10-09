class MultiplicationTable implements Runnable {
    int number;

    MultiplicationTable(int number) {
        this.number = number;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
    }
}

public class MainThreadClass {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MultiplicationTable(5));
        Thread t2 = new Thread(new MultiplicationTable(10));

        t1.start();
        t2.start();
    }
}
