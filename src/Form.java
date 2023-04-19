import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Form extends JPanel {
        public static void main(String[] args) {
            // Create a JFrame
            JFrame frame = new JFrame("Work Experience Form");

            // Add the Form panel to the JFrame
            Form form = new Form();
            frame.getContentPane().add(form);

            // Set the size of the JFrame
            frame.setSize(400, 500);

            // Make the JFrame visible
            frame.setVisible(true);

            // Set the default close operation
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    private JButton addJobButton;
    private JPanel panel1;
    private JPanel panel2;
    private JLabel titleLabel;

    private static JTextField companyNameTextField;
    private static JTextField locationTextField;
    private static JTextField startDateTextField;
    private static JTextField endDateTextField;
    private static JTextArea descriptionTextField;
    private JButton submitButton;

    public Form() {
        setLayout(new BorderLayout());

        // Create container panel
        JPanel containerPanel = new JPanel();
        containerPanel.setLayout(new BorderLayout());

        // Create panel 1
        panel1 = new JPanel();
        titleLabel = new JLabel("Work Experience");
        panel1.add(titleLabel);

        // Create panel 2
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(6, 2));

        JLabel companyNameLabel = new JLabel("Company Name:");
        panel2.add(companyNameLabel);

        companyNameTextField = new JTextField(20);
        panel2.add(companyNameTextField);

        JLabel locationLabel = new JLabel("Location:");
        panel2.add(locationLabel);

        locationTextField = new JTextField(20);
        panel2.add(locationTextField);

        JLabel startDateLabel = new JLabel("Start Date:");
        panel2.add(startDateLabel);

        startDateTextField = new JTextField(20);
        panel2.add(startDateTextField);

        JLabel endDateLabel = new JLabel("End Date:");
        panel2.add(endDateLabel);

        endDateTextField = new JTextField(20);
        panel2.add(endDateTextField);

        JLabel descriptionLabel = new JLabel("Description:");
        panel2.add(descriptionLabel);

        descriptionTextField = new JTextArea(5, 20);
        descriptionTextField.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(descriptionTextField);
        panel2.add(scrollPane);

        submitButton = new JButton("Submit");
        panel2.add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveWorkExperience();
            }
        });

        // Add panel 1 and panel 2 to container panel
        containerPanel.add(panel1, BorderLayout.NORTH);
        containerPanel.add(panel2, BorderLayout.CENTER);

        // Add container panel to main panel
        add(containerPanel, BorderLayout.CENTER);

        // Create add job button and add it to the main panel
        addJobButton = new JButton("Add Job");
        add(addJobButton, BorderLayout.SOUTH);
        addJobButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter writer = new FileWriter("work-experience.csv", true);
                    writer.write(companyNameTextField.getText() + ",");
                    writer.write(locationTextField.getText() + ",");
                    writer.write(startDateTextField.getText() + ",");
                    writer.write(endDateTextField.getText() + ",");
                    writer.write(descriptionTextField.getText() + "\n");
                    writer.close();

                    // Clear input fields
                    companyNameTextField.setText("");
                    locationTextField.setText("");
                    startDateTextField.setText("");
                    endDateTextField.setText("");
                    descriptionTextField.setText("");

                    JOptionPane.showMessageDialog(null, "Job added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    private static void saveWorkExperience() {
        // Read input data from text fields
        String companyName = companyNameTextField.getText().trim();
        String location = locationTextField.getText().trim();
        String startDate = startDateTextField.getText().trim();
        String endDate = endDateTextField.getText().trim();
        String description = descriptionTextField.getText().trim();

        // Validate input data
        if (companyName.isEmpty() || location.isEmpty() || startDate.isEmpty() || endDate.isEmpty() || description.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill out all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Create a CSV file if it doesn't exist
        File file = new File("WorkExperience.csv");
        if (!file.exists()) {
            try {
                FileWriter writer = new FileWriter(file);
                writer.write("Company Name,Location,Start Date,End Date,Description\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Failed to create CSV file.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // Write work experience data to CSV file
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(companyName + ",");
            writer.write(location + ",");
            writer.write(startDate + ",");
            writer.write(endDate + ",");
            writer.write(description + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to write data to CSV file.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Clear input fields
        companyNameTextField.setText("");
        locationTextField.setText("");
        startDateTextField.setText("");
        endDateTextField.setText("");
        descriptionTextField.setText("");

        // Show confirmation message
        JOptionPane.showMessageDialog(null, "Work experience added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
}