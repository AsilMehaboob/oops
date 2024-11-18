import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StackSwing {

    static int top=-1;
    static int size=3;
    static int[] stack;;
    

    public StackSwing(int size){

        this.size=size;
        this.stack=new int[size];

        JFrame f = new JFrame();
        f.setSize(200,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTextField tf = new JTextField(16);
        f.setLayout(new FlowLayout());
        JButton bpush = new JButton("Push");
        JButton bpop = new JButton("Pop");
        JButton bdisplay = new JButton("Display");

        f.add(tf);
        f.add(bpush);
        f.add(bpop);
        f.add(bdisplay);
        f.setVisible(true);

        bpush.addActionListener(e->{
            int data=Integer.parseInt(tf.getText());
            push(data);
        });

        bpop.addActionListener(e->{
            pop();
        });

        bdisplay.addActionListener(e->{
            display();
        });

    }


    static void push(int data){
        if(top==size-1)
            System.out.println("Stack Overflow");
        else{
            top++;
            stack[top]=data;
        }
    }

    static void pop(){
        if(top==-1)
            System.out.println("Stack Underflow");
        else{
            int data=stack[top];
            System.out.println("Deleted item is: "+data);
            top--;
        }
    }

    static void display(){
        if(top==-1){
            System.out.println("Stack Underflow: ");
        }
        else{
        for(int i=0;i<=top;i++){
            
            System.out.print(stack[i]+"\t");
        }
    }
    }

    public static void main(String[] args) {
        new StackSwing(size);
    }
}
