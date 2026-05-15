//WAP to use Student getters/setters with two objects.

public class L4Q4 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setName("Asha");
        s1.setAge(20);
        s1.setFaculty("Science");
        s2.setName("Ravi");
        s2.setAge(21);
        s2.setFaculty("Management");
        System.out.println(s1.getName() + " " + s1.getAge() + " " + s1.getFaculty());
        System.out.println(s2.getName() + " " + s2.getAge() + " " + s2.getFaculty());
    }
}

class Student {
    private String name;
    private int age;
    private String faculty;

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getFaculty() {
        return faculty;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}