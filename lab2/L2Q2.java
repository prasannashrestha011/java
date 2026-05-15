//WAP to find sum of first N natural numbers.
import java.util.*;

public class L2Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int sum = n * (n + 1) / 2;
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
