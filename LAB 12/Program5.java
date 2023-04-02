//WAP to create components

import java.awt.*;
import java.awt.event.*;

public class Program5 extends Frame implements ActionListener
{            
    Button b;
//    TextField tf;
    
    Program5()
    {
//        tf = new TextField("Hello");
//        tf.setBounds(10,10,50,50);
//        add(tf);
        
        b = new Button("Click here");
        b.setBounds(100,100,50,50);
        add(b);
        b.addActionListener(this);
        
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        b.setLabel("Hiee");
    }
    
    public static void main (String [] args)
    {
        Program5 awt = new Program5(); 
    }
}