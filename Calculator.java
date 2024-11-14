import java.awt.*;
import javax.swing.*;



public class Calculator extends JFrame{
    
    
    String currentText = "";
    double firstOperand = 0;
    String operator = "";
    JTextField tf;
    public static void main(String[] args) {
        new Calculator();
    }
    
    public Calculator(){

    JFrame f = new JFrame("Calculator");
    tf = new JTextField(16);


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

    JPanel panel = new JPanel();
    
    panel.add(tf);
    panel.add(b7);
    panel.add(b8);
    panel.add(b9);
    panel.add(bdiv);
    panel.add(b4);
    panel.add(b5);
    panel.add(b6);
    panel.add(bmul);
    panel.add(b1);
    panel.add(b2);
    panel.add(b3);
    panel.add(badd);
    panel.add(b0);
    panel.add(bdot);
    panel.add(beq);
    panel.add(bsub);
    
    f.setSize(200,300);
    f.setLayout(new BorderLayout());
    f.add(panel);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    b0.addActionListener(e->appendtext("0"));
    b1.addActionListener(e->appendtext("1"));
    b2.addActionListener(e->appendtext("2"));
    b3.addActionListener(e->appendtext("3"));
    b4.addActionListener(e->appendtext("4"));
    b5.addActionListener(e->appendtext("5"));
    b6.addActionListener(e->appendtext("6"));
    b7.addActionListener(e->appendtext("7"));
    b8.addActionListener(e->appendtext("8"));
    b9.addActionListener(e->appendtext("0"));
    bdot.addActionListener(e->appendtext("."));
    badd.addActionListener(e->setoperator("+"));
    bsub.addActionListener(e->setoperator("-"));
    bmul.addActionListener(e->setoperator("*"));
    bdiv.addActionListener(e->setoperator("/"));
    
    beq.addActionListener(e->calculate());
    



    }

    void appendtext(String text){
        currentText+=text;
        tf.setText(currentText);
    }

    void setoperator(String operator){
        if(!currentText.isEmpty()){
            firstOperand=Double.parseDouble(currentText);
            this.operator=operator;
            currentText="";
        }
    }

    void calculate(){
        if(!currentText.isEmpty()&&!operator.isEmpty()){
            double secondOperand=Double.parseDouble(currentText);
            double result=0;
            switch (operator) {
                case "+":
                    result = firstOperand + secondOperand;
                    break;
                case "-":
                    result = firstOperand - secondOperand;
                    break;
                case "*":
                    result = firstOperand * secondOperand;
                    break;
                case "/":
                    if (secondOperand != 0) {
                        result = firstOperand / secondOperand;
                    } else {
                        tf.setText("Error");
                        return;
                    }
                    break;
            }
            tf.setText(String.valueOf(result));
            currentText=String.valueOf(result);
            operator="";
        }
    }
    void clear(){
        currentText="";
        operator="";
        tf.setText("");
    }

}
