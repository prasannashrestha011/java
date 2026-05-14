import java.util.*;

public class L8Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] countries = new String[5];
        System.out.println("Enter 5 country names:");
        for (int i = 0; i < 5; i++) {
            countries[i] = sc.nextLine();
            if (countries[i].isEmpty()) {
                countries[i] = sc.nextLine();
            }
        }
        for (String c : countries) {
            if (!c.isEmpty()) {
                char last = Character.toLowerCase(c.charAt(c.length() - 1));
                if (last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u') {
                    System.out.println(c);
                }
            }
        }
        sc.close();
    }
}
