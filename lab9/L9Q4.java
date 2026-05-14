import java.io.*;

public class L9Q4 {
    public static void main(String[] args) throws Exception {
        PersonRecord p = new PersonRecord(1, "Asha");
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            out.writeObject(p);
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.dat"))) {
            PersonRecord r = (PersonRecord) in.readObject();
            System.out.println("Id: " + r.id + ", Name: " + r.name);
        }
    }
}

class PersonRecord implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;

    PersonRecord(int id, String name) {
        this.id = id;
        this.name = name;
    }
}