//WAP to make swing GUI with 3 fields and 4 ops.
import javax.swing.*;
import java.awt.*;

public class L10Q1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JButton add = new JButton("Add");
        JButton sub = new JButton("Sub");
        JButton mul = new JButton("Mul");
        JButton div = new JButton("Div");

        JPanel p = new JPanel(new GridLayout(5, 2, 5, 5));
        p.add(new JLabel("A"));
        p.add(t1);
        p.add(new JLabel("B"));
        p.add(t2);
        p.add(new JLabel("Result"));
        p.add(t3);
        p.add(add);
        p.add(sub);
        p.add(mul);
        p.add(div);

        add.addActionListener(e -> t3.setText(calc(t1.getText(), t2.getText(), '+')));
        sub.addActionListener(e -> t3.setText(calc(t1.getText(), t2.getText(), '-')));
        mul.addActionListener(e -> t3.setText(calc(t1.getText(), t2.getText(), '*')));
        div.addActionListener(e -> t3.setText(calc(t1.getText(), t2.getText(), '/')));

        f.setContentPane(p);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    static String calc(String a, String b, char op) {
        try {
            double x = Double.parseDouble(a);
            double y = Double.parseDouble(b);
            if (op == '/' && y == 0)
                return "NaN";
            double r = switch (op) {
                case '+' -> x + y;
                case '-' -> x - y;
                case '*' -> x * y;
                default -> x / y;
            };
            return String.valueOf(r);
        } catch (Exception e) {
            return "Error";
        }
    }
}
