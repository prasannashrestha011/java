//WAP to demonstrate synchronization.

public class L7Q4 {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                c.inc();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                c.inc();
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count: " + c.get());
    }
}

class Counter {
    private int count = 0;

    synchronized void inc() {
        count++;
    }

    int get() {
        return count;
    }
}