import java.awt.*;
import java.awt.event.*;

public class AWT2 extends Frame implements KeyListener
{
    Label l;
    TextArea ta;
    
    AWT2()
    {
        l = new Label();
        l.setBounds(10,100,200,50);
        ta = new TextArea();
        ta.setBounds(250,100,200,50);
        ta.addKeyListener(this);
        add(l);
        add(ta);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }
    
    public static void main (String args[])
    {
        new AWT2();
    }

    @Override
    public void keyTyped(KeyEvent e) 
    {
        l.setText("Key typed");
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
        l.setText("Key pressed: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) 
    {
        l.setText("Key pressed: " + e.getKeyChar());
    }
}