import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class L10Q3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Save Student");
        JTextField id = new JTextField();
        JTextField name = new JTextField();
        JTextField faculty = new JTextField();
        JButton save = new JButton("Save");

        JPanel p = new JPanel(new GridLayout(4, 2, 5, 5));
        p.add(new JLabel("Id"));
        p.add(id);
        p.add(new JLabel("Name"));
        p.add(name);
        p.add(new JLabel("Faculty"));
        p.add(faculty);
        p.add(save);

        save.addActionListener(e -> {
            try (Connection c = DriverManager.getConnection("jdbc:sqlite:lab10.db")) {
                try (Statement st = c.createStatement()) {
                    st.executeUpdate("CREATE TABLE IF NOT EXISTS student(id INTEGER, name TEXT, faculty TEXT)");
                }
                try (PreparedStatement ps = c.prepareStatement("INSERT INTO student VALUES(?,?,?)")) {
                    ps.setInt(1, Integer.parseInt(id.getText()));
                    ps.setString(2, name.getText());
                    ps.setString(3, faculty.getText());
                    ps.executeUpdate();
                }
                JOptionPane.showMessageDialog(f, "Saved");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(f, "Error: " + ex.getMessage());
            }
        });

        f.setContentPane(p);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
