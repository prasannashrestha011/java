//WAP to find greatest and smallest in array.
import java.util.*;

public class L3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int n : arr) {
            if (n < min)
                min = n;
            if (n > max)
                max = n;
        }
        System.out.println("Smallest: " + min);
        System.out.println("Greatest: " + max);
        sc.close();
    }
}
