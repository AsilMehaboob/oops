import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing1 extends JFrame {
    public Swing1(){
        setTitle("Swing Example");
        setLayout(new FlowLayout());

        JButton btn = new JButton("Click");

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Button Clicked!");
            }
        });

        add(btn);
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
        public static void main(String[] args){
            new Swing1();
    }
}