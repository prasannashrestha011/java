//WAP to show dialog on button click.
import javax.swing.*;
import java.awt.*;

public class L10Q2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Click");
        JTextField t = new JTextField(15);
        JButton b = new JButton("Click");
        b.addActionListener(e -> JOptionPane.showMessageDialog(f, "You clicked the button"));
        JPanel p = new JPanel();
        p.add(t);
        p.add(b);
        f.setContentPane(p);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
