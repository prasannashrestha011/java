//WAP to show inheritance with Student, Test, Result.
import java.util.*;

public class L4Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result r = new Result();
        System.out.print("Enter roll no: ");
        r.readRoll(sc);
        System.out.print("Enter marks of two subjects: ");
        r.readMarks(sc);
        r.calcTotal();
        r.showRoll();
        r.showMarks();
        r.showTotal();
        sc.close();
    }
}

class StudentBase {
    int rollNo;

    void readRoll(Scanner sc) {
        rollNo = sc.nextInt();
    }

    void showRoll() {
        System.out.println("Roll No: " + rollNo);
    }
}

class Test extends StudentBase {
    int m1;
    int m2;

    void readMarks(Scanner sc) {
        m1 = sc.nextInt();
        m2 = sc.nextInt();
    }

    void showMarks() {
        System.out.println("Marks: " + m1 + ", " + m2);
    }
}

class Result extends Test {
    int total;

    void calcTotal() {
        total = m1 + m2;
    }

    void showTotal() {
        System.out.println("Total: " + total);
    }
}