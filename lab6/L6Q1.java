//WAP to divide two ints; handle ArithmeticException.
import java.util.*;

public class L6Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int res = a / b;
            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        sc.close();
    }
}
