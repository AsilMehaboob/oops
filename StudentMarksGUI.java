import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class StudentMarksGUI {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Student Marks");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 2));

        // Labels and Text Fields
        JLabel rollLabel = new JLabel("Roll No:");
        JTextField rollField = new JTextField();
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel mark1Label = new JLabel("Mark1:");
        JTextField mark1Field = new JTextField();
        JLabel mark2Label = new JLabel("Mark2:");
        JTextField mark2Field = new JTextField();
        JLabel totalLabel = new JLabel("Total Marks:");
        JTextField totalField = new JTextField();
        
        totalField.setEditable(false);

        // Buttons
        JButton importButton = new JButton("Import Data");
        JButton calculateButton = new JButton("Calculate");

        // Add components to frame
        frame.add(rollLabel);
        frame.add(rollField);
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(mark1Label);
        frame.add(mark1Field);
        frame.add(mark2Label);
        frame.add(mark2Field);
        frame.add(totalLabel);
        frame.add(totalField);
        frame.add(importButton);
        frame.add(calculateButton);

        // Import Button Action
        importButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                File file = new File("student_data.txt"); // File in the same directory as the program
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line = reader.readLine(); // Skip the header
                    line = reader.readLine();       // Read the actual data

                    if (line != null) {
                        String[] data = line.trim().split("\\s+");
                        rollField.setText(data[0]);  // Set Roll No
                        nameField.setText(data[1]); // Set Name
                        mark1Field.setText(data[2]); // Set Mark1
                        mark2Field.setText(data[3]); // Set Mark2
                    }
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Error reading file: " + ex.getMessage());
                }
            }
        });

        // Calculate Button Action
        calculateButton.addActionListener(e-> {
            
            
                try {
                    int mark1 = Integer.parseInt(mark1Field.getText());
                    int mark2 = Integer.parseInt(mark2Field.getText());
                    int total = mark1 + mark2;
                    totalField.setText(String.valueOf(total));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid marks entered.");
                }
            
        });

        // Show frame
        frame.setVisible(true);
    }
}
