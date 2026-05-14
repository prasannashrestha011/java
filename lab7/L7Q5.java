public class L7Q5 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 50; i++) {
                System.out.println(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 100; i >= 50; i--) {
                System.out.println(i);
            }
        });
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
