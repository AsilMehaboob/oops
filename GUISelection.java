import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

import javax.swing.*;

public class GUISelection implements ActionListener {

    JRadioButton r1,r2;
    JTextField tf;

    public GUISelection() {
        
        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());
        r1 = new JRadioButton("bit1");
        r2 = new JRadioButton("but0");
        tf = new JTextField(16);
        

        f.add(r1);
        f.add(r2);
        f.add(tf);

        r1.addActionListener(this);
        r2.addActionListener(this);
        
        f.setVisible(true);
        f.setSize(200,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        public void actionPerformed(ActionEvent e){

        if(!r1.isSelected()&&!r2.isSelected())
            tf.setText("0");
        else if(r1.isSelected()&&r2.isSelected())
            tf.setText("3");
        else if(r1.isSelected())
            tf.setText("2");
        else if(r2.isSelected())
            tf.setText("1");

        }

        public static void main(String args[]){
            new GUISelection();
        }

    }

    
    

