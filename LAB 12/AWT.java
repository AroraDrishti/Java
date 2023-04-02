import java.awt.*;
import java.awt.event.*;

public class AWT extends Frame implements MouseListener
{
    Label l;
    
    AWT()
    {
        addMouseListener(this);
        l = new Label();
        l.setBounds(20,20,200,100);
        add(l);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("ABC");    
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");    
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");    
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");    
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }
    
    public static void main (String args[])           
    {
        new AWT();
    }
}
