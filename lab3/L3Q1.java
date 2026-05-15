//WAP to sum array values whose last digit is 1.
import java.util.*;

public class L3Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int n : arr) {
            if (Math.abs(n) % 5 == 1) {
                sum += n;
            }
        }
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
