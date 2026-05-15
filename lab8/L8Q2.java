//WAP to reverse a word and check palindrome.
import java.util.*;

public class L8Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = sc.next();
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println("Reverse: " + rev);
        System.out.println(s.equalsIgnoreCase(rev) ? "Palindrome" : "Not palindrome");
        sc.close();
    }
}
