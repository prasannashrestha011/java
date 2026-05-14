import java.util.*;

public class L4Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        Area a = new Area(l, b);
        System.out.println("Area: " + a.returnArea());
        sc.close();
    }
}

class Area {
    private final double length;
    private final double breadth;

    Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double returnArea() {
        return length * breadth;
    }
}
