//WAP to create components

import java.awt.*;

public class Program3
{
    public Program3()
    {
        Frame f = new Frame();

        CheckboxGroup obj = new CheckboxGroup();
        Checkbox ch11 = new Checkbox("a",obj,true);
        ch11.setBounds(100,100,10,10);
        Checkbox ch22 = new Checkbox("b",obj,false);
        ch22.setBounds(100,150,10,10);
        f.add(ch11);
        f.add(ch22); 

        f.setSize(300, 300);
        f.setLayout(null);  
        f.setVisible(true);
        
    }
    
    public static void main (String [] args)
    {
        Program3 awt = new Program3(); 
    }
}
