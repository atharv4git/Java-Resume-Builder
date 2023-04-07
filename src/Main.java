import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main() {
        super("My Form");

        // Create components
        JLabel labelName = new JLabel("Name:");
        JTextField textFieldName = new JTextField(20);
        JLabel labelEmail = new JLabel("Email:");
        JTextField textFieldEmail = new JTextField(20);
        JButton buttonSubmit = new JButton("Submit");

        // Set layout
        setLayout(new FlowLayout());

        // Add components to form
        add(labelName);
        add(textFieldName);
        add(labelEmail);
        add(textFieldEmail);
        add(buttonSubmit);

        // Set form properties
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Main form = new Main();
    }
}
