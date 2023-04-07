import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Math.max;


public class ModernForm {
    static JLabel labelName = new JLabel("Name:");
    static JLabel labelEmail = new JLabel("Email:");
    static JLabel labelAddress = new JLabel("Address:");
    static JLabel labelTwitter = new JLabel("Twitter:");
    static JLabel labelGH = new JLabel("GitHub:");
    static JLabel labelLinkedin = new JLabel("LinkedIn:");
    static JLabel labelPhone = new JLabel("Phone No.:");
    static JTextField nameTextField = new JTextField(20);
    static JTextField addressTextField = new JTextField(20);
    static JTextField twitterTextField = new JTextField(20);
    static JTextField githubTextField = new JTextField(20);
    static JTextField linkedinTextField = new JTextField(20);
    static JTextField phoneTextField = new JTextField(20);
    static JTextField emailTextField = new JTextField(20);
    static JButton buttonSubmit = new JButton("Submit");

    static JLabel labelSkills = new JLabel("Skills:");
    static JLabel labelExperience = new JLabel("Experience:");
    static JLabel labelGoals = new JLabel("Goals:");
    static JTextArea skillsTextArea = new JTextArea(5, 20);
    static JTextArea experienceTextArea = new JTextArea(5, 20);
    static JTextArea goalsTextArea = new JTextArea(5, 20);
    static JButton buttonSubmit3 = new JButton("Submit");

    static JLabel labelSchoolName = new JLabel("School Name:");
    static JLabel labelDegreeName = new JLabel("Degree Name:");
    static JLabel labelMajor = new JLabel("Major:");
    static JLabel labelGPA = new JLabel("GPA:");
    static JLabel labelCertificationName = new JLabel("Certification Name:");
    static JLabel labelCertificationAuthority = new JLabel("Certification Authority:");
    static JLabel labelCertificationDate = new JLabel("Certification Date:");
    static JTextField schoolNameTextField = new JTextField(20);
    static JTextField degreeNameTextField = new JTextField(20);
    static JTextField majorTextField = new JTextField(20);
    static JTextField gpaTextField = new JTextField(20);
    static JTextField certificationNameTextField = new JTextField(20);
    static JTextField certificationAuthorityTextField = new JTextField(20);
    static JTextField certificationDateTextField = new JTextField(20);
    static JButton buttonSubmit4 = new JButton("Submit");
    static JButton buttonAddCertificate = new JButton("Add Certificate");
    static JButton buttonAddDegree = new JButton("Add Degree");


    public static void main(String[] args) {
        // Create a JFrame and set its properties
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Create a JTabbedPane and add tabs
        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        tabbedPane.addTab("Contact Information", panel1);
        tabbedPane.addTab("Work Experience", panel2);
        tabbedPane.addTab("Skills", panel3);
        tabbedPane.addTab("Education", panel4);
        tabbedPane.addTab("Awards and Accomplishments", panel5);
        tabbedPane.addTab("Hobbies", panel6);

        // Add the JTabbedPane to the JFrame
        frame.add(tabbedPane);

        // Define layout manager for panel1
        panel1.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

// Set insets (padding) for components
        gbc.insets = new Insets(5, 5, 5, 5);

// Add label and text field for name
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel1.add(labelName, gbc);

        gbc.gridx = 1;
        panel1.add(nameTextField, gbc);

// Add label and text field for phone number
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel1.add(labelPhone, gbc);

        gbc.gridx = 1;
        panel1.add(phoneTextField, gbc);

// Add label and text field for email
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel1.add(labelEmail, gbc);

        gbc.gridx = 1;
        panel1.add(emailTextField, gbc);

// Add label and text field for address
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel1.add(labelAddress, gbc);

        gbc.gridx = 1;
        panel1.add(addressTextField, gbc);

// Add label and text field for LinkedIn
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel1.add(labelLinkedin, gbc);

        gbc.gridx = 1;
        panel1.add(linkedinTextField, gbc);

// Add label and text field for Twitter
        gbc.gridx = 0;
        gbc.gridy = 5;
        panel1.add(labelTwitter, gbc);

        gbc.gridx = 1;
        panel1.add(twitterTextField, gbc);

// Add label and text field for GitHub
        gbc.gridx = 0;
        gbc.gridy = 6;
        panel1.add(labelGH, gbc);

        gbc.gridx = 1;
        panel1.add(githubTextField, gbc);

// Add submit button
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton button = new JButton("Submit");
        button.setBackground(Color.BLUE);
        button.setForeground(Color.WHITE);
        panel1.add(buttonSubmit, gbc);

        panel1.setVisible(true);

        buttonSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveContactInfo();
            }
        });


        saveContactInfo();

        // Display the JFrame
        frame.setVisible(true);

        panel3.setLayout(new GridBagLayout());
        GridBagConstraints gbc3 = new GridBagConstraints();

        // Set insets (padding) for components
        gbc3.insets = new Insets(5, 5, 5, 5);

        // Add label and text area for skills
        gbc3.gridx = 0;
        gbc3.gridy = 0;
        panel3.add(labelSkills, gbc3);

        gbc3.gridx = 1;
        panel3.add(skillsTextArea, gbc3);

        // Add label and text area for experience
        gbc3.gridx = 0;
        gbc3.gridy = 1;
        panel3.add(labelExperience, gbc3);

        gbc3.gridx = 1;
        panel3.add(experienceTextArea, gbc3);

        // Add label and text area for goals
        gbc3.gridx = 0;
        gbc3.gridy = 2;
        panel3.add(labelGoals, gbc3);

        gbc3.gridx = 1;
        panel3.add(goalsTextArea, gbc3);

        // Add submit button
        gbc3.gridx = 0;
        gbc3.gridy = 3;
        gbc3.gridwidth = 2;
        gbc3.anchor = GridBagConstraints.CENTER;
        panel3.add(buttonSubmit3, gbc3);

        buttonSubmit3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveSummary();
            }
        });

        // Display the JFrame
        frame.setVisible(true);

        panel4.setLayout(new GridBagLayout());
        GridBagConstraints gbc4 = new GridBagConstraints();

// Set insets (padding) for components
        gbc4.insets = new Insets(5, 5, 5, 5);

// Add label and text field for school name
        gbc4.gridx = 0;
        gbc4.gridy = 0;
        panel4.add(labelSchoolName, gbc4);

        gbc4.gridx = 1;
        panel4.add(schoolNameTextField, gbc4);

// Add label and text field for degree name
        gbc4.gridx = 0;
        gbc4.gridy = 1;
        panel4.add(labelDegreeName, gbc4);

        gbc4.gridx = 1;
        panel4.add(degreeNameTextField, gbc4);

// Add label and text field for major
        gbc4.gridx = 0;
        gbc4.gridy = 2;
        panel4.add(labelMajor, gbc4);

        gbc4.gridx = 1;
        panel4.add(majorTextField, gbc4);

// Add label and text field for GPA
        gbc4.gridx = 0;
        gbc4.gridy = 3;
        panel4.add(labelGPA, gbc4);

        gbc4.gridx = 1;
        panel4.add(gpaTextField, gbc4);

// Add label and text field for certification name
        gbc4.gridx = 0;
        gbc4.gridy = 4;
        panel4.add(labelCertificationName, gbc4);

        gbc4.gridx = 1;
        panel4.add(certificationNameTextField, gbc4);

// Add label and text field for certification authority
        gbc4.gridx = 0;
        gbc4.gridy = 5;
        panel4.add(labelCertificationAuthority, gbc4);

        gbc4.gridx = 1;
        panel4.add(certificationAuthorityTextField, gbc4);

// Add label and text field for certification date
        gbc4.gridx = 0;
        gbc4.gridy = 6;
        panel4.add(labelCertificationDate, gbc4);

        gbc4.gridx = 1;
        panel4.add(certificationDateTextField, gbc4);

// Add submit button
        gbc4.gridx = 0;
        gbc4.gridy = 7;
        gbc4.gridwidth = 2;
        gbc4.anchor = GridBagConstraints.CENTER;
        panel4.add(buttonSubmit, gbc4);

// Add button for adding more certificates
        gbc4.gridx = 0;
        gbc4.gridy = 8;
        gbc4.gridwidth = 1;
        gbc4.anchor = GridBagConstraints.LINE_END;
        panel4.add(buttonAddCertificate, gbc4);

// Add button for adding more degrees
        gbc4.gridx = 1;
        gbc4.anchor = GridBagConstraints.LINE_START;
        panel4.add(buttonAddDegree, gbc4);

        buttonSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveEducation();
            }
        });

        final int[] certificateCount = {1};
        final int[] degreeCount = {1};
        buttonAddCertificate.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                // Add code to handle adding more certificates
                GridBagConstraints gbc4 = new GridBagConstraints();
                gbc4.insets = new Insets(5, 5, 5, 5);
                gbc4.gridx = 0;
                gbc4.gridy = certificateCount[0] + 1;
                panel4.add(new JLabel("Certification Name"), gbc4);
                gbc4.gridx = 1;
                panel4.add(new JTextField(20), gbc4);
                gbc4.gridx = 0;
                gbc4.gridy = certificateCount[0] + 2;
                panel4.add(new JLabel("Certification Authority"), gbc4);
                gbc4.gridx = 1;
                panel4.add(new JTextField(20), gbc4);
                gbc4.gridx = 0;
                gbc4.gridy = certificateCount[0] + 3;
                panel4.add(new JLabel("Certification Date"), gbc4);
                gbc4.gridx = 1;
                panel4.add(new JTextField(20), gbc4);
                gbc4.gridx = 0;
                gbc4.gridy = certificateCount[0] + 4;
                gbc4.gridwidth = 2;
                gbc4.anchor = GridBagConstraints.CENTER;
                panel4.add(buttonSubmit, gbc4);
                gbc4.gridy = max(degreeCount[0], certificateCount[0]) + 5;
                panel4.add(buttonAddCertificate, gbc4);
                frame.pack();
                certificateCount[0]++;
            }
        });

        buttonAddDegree.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                // Add code to handle adding more degrees
                GridBagConstraints gbc4 = new GridBagConstraints();
                gbc4.insets = new Insets(5, 5, 5, 5);
                gbc4.gridx = 0;
                gbc4.gridy = degreeCount[0] + 6;
                panel4.add(new JLabel("Degree Name"), gbc4);
                gbc4.gridx = 1;
                panel4.add(new JTextField(20), gbc4);
                gbc4.gridx = 0;
                gbc4.gridy = degreeCount[0] + 7;
                panel4.add(new JLabel("Major"), gbc4);
                gbc4.gridx = 1;
                panel4.add(new JTextField(20), gbc4);
                gbc4.gridx = 0;
                gbc4.gridy = degreeCount[0] + 8;
                panel4.add(new JLabel("GPA"), gbc4);
                gbc4.gridx = 1;
                panel4.add(new JTextField(20), gbc4);
                gbc4.gridx = 0;
                gbc4.gridy = degreeCount[0] + 9;
                panel4.add(new JLabel("School Name"), gbc4);
                gbc4.gridx = 1;
                panel4.add(new JTextField(20), gbc4);
                gbc4.gridx = 0;
                gbc4.gridy = degreeCount[0] + 10;
                gbc4.gridwidth = 2;
                gbc4.anchor = GridBagConstraints.CENTER;
                panel4.add(buttonSubmit, gbc4);
                gbc4.gridy = max(degreeCount[0], certificateCount[0]) + 11;
                panel4.add(buttonAddDegree, gbc4);
                frame.pack();
                degreeCount[0]++;
            }
        });




// Display the JFrame
        frame.setVisible(true);

    }
    public static void saveContactInfo() {
        ContactInfo.name = nameTextField.getText();
        ContactInfo.address = addressTextField.getText();
        ContactInfo.twitter = twitterTextField.getText();
        ContactInfo.github = githubTextField.getText();
        ContactInfo.linkedin = linkedinTextField.getText();
        String phoneString = phoneTextField.getText();
        if (!phoneString.isEmpty()) {
            ContactInfo.phone_number = Long.parseLong(phoneString);
        }
        ContactInfo.email = emailTextField.getText();
        try {
            FileWriter writer = new FileWriter("contact.csv");
            writer.write(ContactInfo.name + ",");
            writer.write(ContactInfo.address + ",");
            writer.write(ContactInfo.twitter + ",");
            writer.write(ContactInfo.github + ",");
            writer.write(ContactInfo.linkedin + ",");
            writer.write(ContactInfo.phone_number + ",");
            writer.write(ContactInfo.email);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveSummary() {
        Summary.skills = skillsTextArea.getText();
        Summary.experience = experienceTextArea.getText();
        Summary.goals = goalsTextArea.getText();
        try {
            FileWriter writer = new FileWriter("summary.csv");
            writer.write(Summary.skills + ",");
            writer.write(Summary.experience + ",");
            writer.write(Summary.goals);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void saveEducation() {
        String schoolName = schoolNameTextField.getText();
        String degreeName = degreeNameTextField.getText();
        String major = majorTextField.getText();
        double gpa = Double.parseDouble(gpaTextField.getText());
        String certificationName = certificationNameTextField.getText();
        String certificationAuthority = certificationAuthorityTextField.getText();
        String certificationDate = certificationDateTextField.getText();

        // create a new Education object
        Education education = new Education(schoolName,
                new Degree(degreeName, major, gpa),
                new Certification(certificationName, certificationAuthority, certificationDate));

        // write the data to a CSV file
        try {
            FileWriter writer = new FileWriter("Education.csv", true);
            writer.write(schoolName + ",");
            writer.write(degreeName + ",");
            writer.write(major + ",");
            writer.write(gpa + ",");
            writer.write(certificationName + ",");
            writer.write(certificationAuthority + ",");
            writer.write(certificationDate + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
