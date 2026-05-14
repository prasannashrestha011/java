import java.io.*;
import java.util.*;

public class L9Q2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        try (FileWriter fw = new FileWriter("colleges.txt")) {
            for (int i = 0; i < 10; i++) {
                System.out.print("College name: ");
                String name = sc.nextLine();
                if (name.isEmpty())
                    name = sc.nextLine();
                System.out.print("Students: ");
                int students = Integer.parseInt(sc.nextLine());
                fw.write(name + "," + students + "\n");
            }
        }
        try (BufferedReader br = new BufferedReader(new FileReader("colleges.txt"))) {
            String line;
            System.out.println("Colleges with more than 500 students:");
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    int count = Integer.parseInt(parts[1].trim());
                    if (count > 500) {
                        System.out.println(parts[0]);
                    }
                }
            }
        }
        sc.close();
    }
}
