class StudentArr {
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

public class L4Q5 {
    public static void main(String[] args) {
        StudentArr[] students = new StudentArr[5];
        for (int i = 0; i < students.length; i++) {
            students[i] = new StudentArr();
            students[i].setName("Student" + (i + 1));
            students[i].setAge(18 + i);
            students[i].setFaculty("Faculty" + (i + 1));
        }
        for (StudentArr s : students) {
            System.out.println(s.getName() + " " + s.getAge() + " " + s.getFaculty());
        }
    }
}
