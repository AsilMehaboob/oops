import java.awt.*;
import javax.swing.*;

public class TrafficLight extends JFrame {

    JRadioButton red = new JRadioButton("Red");
    JRadioButton green = new JRadioButton("Green");
    JRadioButton yellow = new JRadioButton("Yellow");

    JPanel buttonPanel;

    public TrafficLight() {
        setTitle("Traffic Light");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Button group and panel setup
        ButtonGroup group = new ButtonGroup();
        group.add(red);
        group.add(yellow);
        group.add(green);

        buttonPanel = new JPanel();
        buttonPanel.add(red);
        buttonPanel.add(yellow);
        buttonPanel.add(green);
        
        // Add panel to frame
        add(buttonPanel, BorderLayout.CENTER);

        // Action listeners for each button to change background color
        red.addActionListener(e -> changecolor(Color.RED));
        yellow.addActionListener(e -> changecolor(Color.YELLOW));
        green.addActionListener(e -> changecolor(Color.GREEN));

        // Frame properties
        setSize(200, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TrafficLight();
    }

    void changecolor(Color color) {
        buttonPanel.setBackground(color);
    }
}
