public class L7Q2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> showFactors(20, 1000));
        Thread t2 = new Thread(() -> showFactors(25, 1500));
        t1.start();
        t2.start();
    }

    static void showFactors(int n, int delay) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(n + " factor: " + i);
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }
}
