import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;
public class Main extends JFrame implements ActionListener {
    private JTextField inputField;
    private JButton submitButton;
    private JTextField outputField;
    private JComboBox<String> comboBox;

    public Main(){
        setTitle("Base64 Password Generator");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set up the input field
        inputField = new JTextField(20);

        // Set up the submit button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        // Add components to the JFrame
        setLayout(new FlowLayout());
        add(inputField);
        add(submitButton);

        // Display the JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}