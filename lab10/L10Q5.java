import java.sql.*;

public class L10Q5 {
    public static void main(String[] args) {
        try (Connection c = DriverManager.getConnection("jdbc:sqlite:lab10.db")) {
            try (Statement st = c.createStatement()) {
                st.executeUpdate("CREATE TABLE IF NOT EXISTS student(id INTEGER, name TEXT, faculty TEXT)");
            }
            try (Statement st = c.createStatement();
                    ResultSet rs = st.executeQuery("SELECT id, name, faculty FROM student")) {
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
