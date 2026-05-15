//WAP to store and show employee info.
import java.util.*;

public class L4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        System.out.print("Enter name, age, salary: ");
        e.setInfo(sc.next(), sc.nextInt(), sc.nextDouble());
        e.showInfo();
        sc.close();
    }
}

class Employee {
    String name;
    int age;
    double salary;

    void setInfo(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}