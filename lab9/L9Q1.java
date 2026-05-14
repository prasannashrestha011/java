import java.io.*;
import java.util.*;

public class L9Q1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = sc.nextLine();
        try (FileWriter fw = new FileWriter("line.txt")) {
            fw.write(line);
        }
        try (BufferedReader br = new BufferedReader(new FileReader("line.txt"))) {
            System.out.println("File content: " + br.readLine());
        }
        sc.close();
    }
}
