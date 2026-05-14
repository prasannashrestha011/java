import java.util.*;

public class L3Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size n: ");
        int n = sc.nextInt();
        int[][] m = new int[n][n];
        System.out.println("Enter matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        System.out.println("Diagonal elements:");
        for (int i = 0; i < n; i++) {
            System.out.println(m[i][i]);
        }
        sc.close();
    }
}
