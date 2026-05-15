//WAP to find sum of cubes of three numbers.
import java.util.*;

public class L1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a * a * a + b * b * b + c * c * c;
        System.out.println("Sum of cubes: " + sum);
        sc.close();
    }
}
