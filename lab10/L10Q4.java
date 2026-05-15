//WAP to delete record by id using GUI.
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class L10Q4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Delete Student");
        JTextField id = new JTextField();
        JButton del = new JButton("Delete");

        JPanel p = new JPanel(new GridLayout(2, 2, 5, 5));
        p.add(new JLabel("Id"));
        p.add(id);
        p.add(del);

        del.addActionListener(e -> {
            try (Connection c = DriverManager.getConnection("jdbc:sqlite:lab10.db")) {
                try (PreparedStatement ps = c.prepareStatement("DELETE FROM student WHERE id = ?")) {
                    ps.setInt(1, Integer.parseInt(id.getText()));
                    int rows = ps.executeUpdate();
                    JOptionPane.showMessageDialog(f, "Deleted: " + rows);
                }
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
