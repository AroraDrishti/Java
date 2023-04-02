import java.awt.*;
import java.awt.event.*;

public class Calculator  implements ActionListener
{
    int c, n1, n2;
    Frame f;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, badd, bsub, bmul, bdiv, bcalc, bclr;
    Panel p;
    TextField t, t1;
    GridLayout g;
    
    Calculator()
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
        
        bclr = new Button("CLR");
        bclr.addActionListener(this);
        
        t = new TextField(20);
        f.add(t);
        
        g = new GridLayout(4,4);
        p.setLayout(g);
        
        p.add(b0);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(badd);
        p.add(bsub);
        p.add(bmul);
        p.add(bdiv);
        p.add(bcalc);
        p.add(bclr);
        
        f.add(p);
        f.setSize(200,175);
        f.setVisible(true);
        f.setBackground(Color.LIGHT_GRAY);
        f.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()== b0)
        {
            String str = t.getText();
            t.setText(str + "0");
        }
        if(e.getSource()== b1)
        {
            String str = t.getText();
            t.setText(str + "1");
        }
        if(e.getSource()== b2)
        {
            String str = t.getText();
            t.setText(str + "2");
        }
        if(e.getSource()== b3)
        {
            String str = t.getText();
            t.setText(str + "3");
        }
        if(e.getSource()== b4)
        {
            String str = t.getText();
            t.setText(str + "4");
        }
        if(e.getSource()== b5)
        {
           String str = t.getText();
            t.setText(str + "5");
        }
        if(e.getSource()== b6)
        {
            String str = t.getText();
            t.setText(str + "6");
        }
        if(e.getSource()== b7)
        {
            String str = t.getText();
            t.setText(str + "7");
        }
        if(e.getSource()== b8)
        {
            String str = t.getText();
            t.setText(str + "8");
        }
        if(e.getSource()== b9)
        {
            String str = t.getText();
            t.setText(str + "9");
        }
        if(e.getSource()== badd)
        {
            String str = t.getText();
            t.setText(str + " ");
            c = 1;
        }
        if(e.getSource()== bsub)
        {
            String str = t.getText();
            t.setText(str + " ");
            c = 2;
        }
        if(e.getSource()== bmul)
        {
            String str = t.getText();
            t.setText(str + " ");
            c = 3;
        }
        if(e.getSource()== bdiv)
        {
            String str = t.getText();
            t.setText(str + " ");
            c = 4;
        }
        
        if(e.getSource() == bcalc)
        {
            String[] arrOfStr = t.getText().split(" ");
            n1 = Integer.parseInt(arrOfStr[0]);      
            n2 = Integer.parseInt(arrOfStr[1]); 
                        
            if(c == 1)
            {
                t.setText(String.valueOf(n1 + n2));
            }
            else if(c == 2)
            {
                t.setText(String.valueOf(n1 - n2));
            }
            else if(c == 3)
            {
                t.setText(String.valueOf(n1 * n2));
            }
            else if(c == 4)
            {
                t.setText(String.valueOf(n1 / n2));
            }
        }
        
        if(e.getSource()== bclr)
        {
            t.setText("");
        }
    }
        
    public static void main (String args[])
    {
        Calculator obj = new Calculator();
    }
}