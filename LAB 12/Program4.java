//WAP to create components

import java.awt.*;
import java.awt.event.*;

public class Program4
{           
    public Program4()
    {
        Frame f = new Frame();
        
        Choice ch = new Choice();
        ch.setBounds(100, 100, 75, 75);  
        ch.add("a");
        ch.add("b");
        ch.add("c");
        ch.add("d");
        ch.add("e");
        
        f.add(ch);  
        f.setSize(300, 300);
        f.setLayout(null);  
        f.setVisible(true);
    }
    
    public static void main (String [] args)
    {
        Program4 awt = new Program4(); 
    }
}