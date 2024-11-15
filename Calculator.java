import java.awt.FlowLayout;

import javax.swing.*;

public class Calculator {

    public static void main(String[] args) {
        new Calculator();
    }
    String current = "";
    double num1 =0;
    String operator="";

    JTextField tf;

    public Calculator(){
        JFrame f = new JFrame();
        tf = new JTextField(16);

        f.setLayout(new FlowLayout());
        f.setSize(200,200);
        



        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton beq = new JButton("=");
        JButton badd = new JButton("+");
        JButton bsub = new JButton("-");
        JButton bmul = new JButton("*");
        JButton bdiv = new JButton("/");
        JButton bdot = new JButton(".");
        JButton bclear = new JButton("C");


        f.add(tf);
    f.add(b7);
    f.add(b8);
    f.add(b9);
    f.add(bdiv);
    f.add(b4);
    f.add(b5);
    f.add(b6);
    f.add(bmul);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(badd);
    f.add(b0);
    f.add(bdot);
    f.add(beq);
    f.add(bsub);


        b0.addActionListener(e->appendtext("0"));
        b1.addActionListener(e->appendtext("1"));
        b2.addActionListener(e->appendtext("2"));
        b3.addActionListener(e->appendtext("3"));
        b4.addActionListener(e->appendtext("4"));
        b5.addActionListener(e->appendtext("5"));
        b6.addActionListener(e->appendtext("6"));
        b7.addActionListener(e->appendtext("7"));
        b8.addActionListener(e->appendtext("8"));
        b9.addActionListener(e->appendtext("9"));
        bdot.addActionListener(e->appendtext("."));
        badd.addActionListener(e->setoperator("+"));
        bsub.addActionListener(e->setoperator("-"));
        bmul.addActionListener(e->setoperator("*"));
        bdiv.addActionListener(e->setoperator("/"));
        beq.addActionListener(e->calculate());


        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void appendtext(String text){
        current+=text;
        tf.setText(current);
    }

    public void setoperator(String operator){
        num1=Double.parseDouble(current);
        this.operator=operator;
        current="";
    }
    public void calculate(){
        if(!current.isEmpty()&&!operator.isEmpty()){
            double num2= Double.parseDouble(current);
            double result=0;
            switch (operator) {
                case "+":
                    result=num1+num2;
                    break;
                case "-":
                    result=num1-num2;
                    break;
                case "*":
                    result=num1*num2;
                    break;

                case "/":
                    result=num1/num2;
                    break;
                case "%":
                    result=num1%num2;
                    break;
            
                default:
                    break;
                
                
            }
            tf.setText(String.valueOf(result));
        }
    }
}