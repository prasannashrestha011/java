//WAP to print primes between 100 and 200.
public class L2Q5 {
    public static void main(String[] args) {
        for (int n = 100; n <= 200; n++) {
            if (isPrime(n)) {
                System.out.println(n);
            }
        }
    }

    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
