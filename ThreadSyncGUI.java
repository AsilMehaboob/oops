import java.awt.FlowLayout;


import javax.swing.*;

class MEC extends Thread{
    int n;
    public MEC(int num){
        n=num;
    }
    public void run(){
        for(int i=0;i<n;i++){
            System.out.println("MEC");
        }
    }
}

class Place extends Thread{
    int n;
    public Place(int num){
        n=num;
    }
    public void run(){
        for(int i=0;i<n;i++){
            System.out.println("Thrikkakara");
        }
    }
}

public class ThreadSyncGUI {
    public static void main(String[] args) {

        

        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());
        JTextField tf = new JTextField(16);
        JButton btn = new JButton("PRINT");
        
        btn.addActionListener(e->{
            int input=Integer.parseInt(tf.getText());

            MEC m = new MEC(input);
            Place p = new Place(input);

            m.start();
            try {
                m.join();
            } catch (InterruptedException e1) {
                
                e1.printStackTrace();
            }
            
            
            p.start();
            try {
                p.join();
            } catch (InterruptedException e1) {
                
                e1.printStackTrace();
            }

        });
        f.add(tf);
        f.add(btn);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200,200);
        f.setVisible(true);
    }
}
