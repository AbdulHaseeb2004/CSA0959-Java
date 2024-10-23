class NaturalNumbersThread extends Thread {
    private int start;

    public NaturalNumbersThread(int start) {
        this.start = start;
    }

    @Override
    public void run() {
        for (int i = start; i <= start + 2; i++) {
            System.out.println("Thread " + start + ": " + i);
            try {
                Thread.sleep(500);  // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class NaturalNumbersInParallel {
    public static void main(String[] args) {
        Thread t1 = new NaturalNumbersThread(1);
        Thread t2 = new NaturalNumbersThread(4);
        Thread t3 = new NaturalNumbersThread(7);

        t1.start();
        t2.start();
        t3.start();
    }
}
