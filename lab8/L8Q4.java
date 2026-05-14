import java.util.*;

public class L8Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        System.out.println("Enter 5 names:");
        for (int i = 0; i < 5; i++) {
            names[i] = sc.nextLine();
            if (names[i].isEmpty()) {
                names[i] = sc.nextLine();
            }
        }
        for (String n : names) {
            if (!n.isEmpty() && (n.charAt(0) == 'R' || n.charAt(0) == 'r')) {
                System.out.println(n);
            }
        }
        sc.close();
    }
}
