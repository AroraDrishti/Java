//WAP to create components

import java.awt.*;
import java.awt.event.*;

public class Program2
{           
    public Program2()
    {
        Frame f = new Frame();
        
        List l =new List(5);
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.add("e");
        l.setBounds(50, 50, 100, 40);
        f.add(l); 
        f.setSize(300, 300);
        f.setLayout(null);  
        f.setVisible(true);
    }
    
    public static void main (String [] args)
    {
        Program2 awt = new Program2(); 
    }
}