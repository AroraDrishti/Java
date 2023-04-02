//WAP to create components

import java.awt.*;

public class Program1 
{
    public Program1()
    {
        Frame f = new Frame();
        
        Label l = new Label("This is a label"); 
        l.setBounds(100, 100, 200, 100); 
        f.add(l); 
        
        TextField t = new TextField();
        t.setBounds(300, 100, 200, 100);    
        f.add(t); 
        
        Button b = new Button("button1");
        b.setBounds(200, 200, 200, 100);
        f.add(b);
        
        f.setTitle("Components of AWT");
        f.setSize(300, 300);
        f.setLayout(null);  
        f.setVisible(true);
    }
    
public static void main (String [] args)
    {
        Program1 awt = new Program1(); 
    }
}
