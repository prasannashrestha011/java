class StudentYoung {
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

public class L4Q6 {
    public static void main(String[] args) {
        StudentYoung[] students = new StudentYoung[5];
        for (int i = 0; i < students.length; i++) {
            students[i] = new StudentYoung();
            students[i].setName("Student" + (i + 1));
            students[i].setAge(22 - i);
            students[i].setFaculty("Faculty" + (i + 1));
        }
        StudentYoung youngest = students[0];
        for (StudentYoung s : students) {
            if (s.getAge() < youngest.getAge()) {
                youngest = s;
            }
        }
        System.out.println(youngest.getName() + " " + youngest.getAge() + " " + youngest.getFaculty());
    }
}
