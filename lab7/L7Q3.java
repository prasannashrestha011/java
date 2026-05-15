//WAP to print bird and animal names using threads.
public class L7Q3 {
    public static void main(String[] args) {
        String[] birds = { "Sparrow", "Parrot", "Eagle", "Pigeon", "Crow" };
        String[] animals = { "Dog", "Cat", "Cow", "Lion", "Tiger" };
        Thread t1 = new Thread(() -> showNames(birds, 1000));
        Thread t2 = new Thread(() -> showNames(animals, 1500));
        t1.start();
        t2.start();
    }

    static void showNames(String[] arr, int delay) {
        for (String s : arr) {
            System.out.println(s);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
