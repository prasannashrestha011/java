class Person {
    String firstName;
    String lastName;
    int age;

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    void showInfo() {
        System.out.println(firstName + " " + lastName + " " + age);
    }
}

class StudentP extends Person {
    String faculty;

    StudentP(String firstName, String lastName, int age, String faculty) {
        super(firstName, lastName, age);
        this.faculty = faculty;
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Faculty: " + faculty);
    }
}

class Teacher extends Person {
    double salary;

    Teacher(String firstName, String lastName, int age, double salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Salary: " + salary);
    }
}

public class L4Q7 {
    public static void main(String[] args) {
        StudentP s = new StudentP("Rita", "Shah", 20, "Science");
        Teacher t = new Teacher("Mohan", "Das", 35, 45000);
        s.showInfo();
        t.showInfo();
    }
}
