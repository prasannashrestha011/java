public class L2Q6 {
    public static void main(String[] args) {
        for (int n = 100; n <= 500; n++) {
            if (isPalindrome(n)) {
                System.out.println(n);
            }
        }
    }

    static boolean isPalindrome(int n) {
        int orig = n;
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return orig == rev;
    }
}
