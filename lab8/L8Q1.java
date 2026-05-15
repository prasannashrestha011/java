//WAP to sort 5 city names alphabetically.
import java.util.*;

public class L8Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cities = new String[5];
        System.out.println("Enter 5 city names:");
        for (int i = 0; i < 5; i++) {
            cities[i] = sc.nextLine();
            if (cities[i].isEmpty()) {
                cities[i] = sc.nextLine();
            }
        }
        Arrays.sort(cities);
        System.err.println("sorted array");
        for (String c : cities) {
            System.out.println(c);
        }
        sc.close();
    }
}
