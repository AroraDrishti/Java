import java.awt.*;
import java.awt.event.*;

public class Program7 extends Frame implements KeyListener {
    Label l;
    TextArea area;
    Program7(){
        l = new Label();
        l.setBounds(20,50,100,20);
        area = new TextArea();
        area.setBounds(20,80,300,300);
        area.addKeyListener(this);
        add(l);
        add(area);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    
    public void keyPressed(KeyEvent e)
    {
        l.setText("Key pressed");
    }
    
    public void keyTyped(KeyEvent e)
    {
        l.setText("Key Typed");
    }
    
    public void keyReleased(KeyEvent e) 
    {
        l.setText("Key released");
    }
    
    public static void main(String[] args)
    {
        new Program7();
    }
}