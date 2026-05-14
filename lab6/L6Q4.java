import java.util.*;

public class L6Q4 {
    static int readPositive(Scanner sc) throws Exception {
        int n = sc.nextInt();
        if (n <= 0)
            throw new Exception("Not positive");
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        try {
            int n = readPositive(sc);
            System.out.println("Number: " + n);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
