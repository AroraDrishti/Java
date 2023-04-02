// To implement a simple calculator using AWT

import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator implements ActionListener
{
    Frame f;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, badd, bsub, bmul, bdiv, bcalc;
    GridLayout g;
    Panel p;
    TextField tf;
    
    public void func()
    {
        f = new Frame("Calculator");
        f.setLayout(new FlowLayout());
        p = new Panel();
        
        b0 = new Button("0");
        b0.addActionListener(this);
        
        b1 = new Button("1");
        b1.addActionListener(this);
        
        b2 = new Button("2");
        b2.addActionListener(this);
        
        b3 = new Button("3");
        b3.addActionListener(this);
        
        b4 = new Button("4");
        b4.addActionListener(this);
        
        b5 = new Button("5");
        b5.addActionListener(this);
        
        b6 = new Button("6");
        b6.addActionListener(this);
        
        b7 = new Button("7");
        b7.addActionListener(this);
        
        b8 = new Button("8");
        b8.addActionListener(this);
        
        b9 = new Button("9");
        b9.addActionListener(this);
        
        badd = new Button("+");
        badd.addActionListener(this);
        
        bsub = new Button("-");
        bsub.addActionListener(this);
        
        bmul = new Button("*");
        bmul.addActionListener(this);
        
        bdiv = new Button("/");
        bdiv.addActionListener(this);
        
        bcalc = new Button("=");
        bcalc.addActionListener(this);        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        // do nothing  
    }
    
    public static void main(String[] args)
    {
        SimpleCalculator sc = new SimpleCalculator();
        sc.func();
    }
}
