import java.awt.FlowLayout;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.*;


public class TokenizerReadFile {
    public static void main(String args[]){

        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());   
        JTextField tf = new JTextField(16);
        JButton btn = new JButton("Read");
        
        btn.addActionListener(e->{
            String str = tf.getText();
            writetofile(str);
        });
        

        f.add(tf);
        f.add(btn);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(200,200);
    }   
    static void writetofile(String str){
        try (BufferedWriter w = new BufferedWriter(new FileWriter("Output.txt"))) {
            w.write("Sl.No\tToken\n");
            w.write("=================\n");

            StringTokenizer st = new StringTokenizer(str);
            int serialnumber=111;
            while(st.hasMoreTokens()){
                String token=st.nextToken();
                w.write(serialnumber+"\t"+token+"\n");
                serialnumber++;
            }

        } 
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
