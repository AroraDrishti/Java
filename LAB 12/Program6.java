import java.awt.*;
import java.awt.event.*;

public class Program6 extends Frame implements MouseListener
{
    Label l;
    Program6()
    {
        addMouseListener(this);
        l=new Label();
        l.setBounds(20,50,100,20);
        add(l);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    
    @Override
    public void mouseClicked(MouseEvent e)
    {
        l.setText("Mouse Clicked");
    }
    
    @Override
    public void mouseEntered(MouseEvent e)
    {
        l.setText("Mouse entered");
    }
    
    @Override
    public void mouseExited(MouseEvent e)
    {
        l.setText("Mouse exited");
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        l.setText("Mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        l.setText("Mouse released");
    }
            
    public static void main(String[] args)
    {
        new Program6();
    }
}