import java.awt.*;  
import java.awt.event.*;  

class NewCalc extends WindowAdapter implements ActionListener{ 
    Frame f;
    Label l1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Button add,sub,mult,div,eq,clr;
    double d;
    double num1,num2,check;

NewCalc(){  
  f= new Frame("CALCULATOR");
  //f.setBackground(Color.cyan);
  l1=new Label(); 
  //l1.setBackground(Color.WHITE);
  l1.setBounds(50,50,250,60);
  b1=new Button("1");
  b1.setBounds(50,340,50,50);
  b2=new Button("2");
  b2.setBounds(120,340,50,50);
  b3=new Button("3");
  b3.setBounds(190,340,50,50);
  b4=new Button("4");
  b4.setBounds(50,270,50,50);
  b5=new Button("5");
  b5.setBounds(120,270,50,50); 
  b6=new Button("6");
  b6.setBounds(190,270,50,50);
  b7=new Button("7");
  b7.setBounds(50,200,50,50);
  b8=new Button("8");
  b8.setBounds(120,200,50,50);
  b9=new Button("9");
  b9.setBounds(190,200,50,50);
  b0=new Button("0");
  b0.setBounds(50,410,50,50);
  add=new Button("+");
  add.setBounds(50,130,40,50);
  sub=new Button("-");
  sub.setBounds(100,130,40,50);
  mult=new Button("*");
  mult.setBounds(150,130,40,50);
  div=new Button("/");
  div.setBounds(200,130,40,50);
  eq=new Button("=");
  eq.setBounds(120,410,120,50);
  clr=new Button("CLR");
  clr.setBounds(250,130,50,330);
  b1.addActionListener(this); 
  b2.addActionListener(this);  
  b3.addActionListener(this);  
  b4.addActionListener(this);
  b5.addActionListener(this); 
  b6.addActionListener(this); 
  b7.addActionListener(this); 
  b8.addActionListener(this); 
  b9.addActionListener(this);  
  b0.addActionListener(this);
  add.addActionListener(this);
  sub.addActionListener(this);
  mult.addActionListener(this);
  div.addActionListener(this);
  eq.addActionListener(this);
  clr.addActionListener(this);
  f.addWindowListener(this);
  f.add(l1);  
  f.add(b1); 
  f.add(b2); 
  f.add(b3); 
  f.add(b4); 
  f.add(b5);
  f.add(b6);
  f.add(b7); 
  f.add(b8);
  f.add(b9);
  f.add(b0);
  f.add(add);
  f.add(sub); 
  f.add(mult);
  f.add(div);
  f.add(eq);
  f.add(clr);
  
  f.setSize(400,500);  
  f.setLayout(null);  
  f.setVisible(true); 
}
public void windowClosing(WindowEvent we){
    f.dispose();
}

public void actionPerformed(ActionEvent ae){ 
    String z,zt;
    if(ae.getSource()==b1){
        zt=l1.getText();
        z=zt+"1";
        l1.setText(z);
    }
    if(ae.getSource()==b2){
        zt=l1.getText();
        z=zt+"2";
        l1.setText(z);
    }
    if(ae.getSource()==b3){
        zt=l1.getText();
        z=zt+"3";
        l1.setText(z);
    }
    if(ae.getSource()==b4){
        zt=l1.getText();
        z=zt+"4";
        l1.setText(z);
    }
    if(ae.getSource()==b5){
        zt=l1.getText();
        z=zt+"5";
        l1.setText(z);
    }
    if(ae.getSource()==b6){
        zt=l1.getText();
        z=zt+"6";
        l1.setText(z);
    }
    if(ae.getSource()==b7){
        zt=l1.getText();
        z=zt+"7";
        l1.setText(z);
    }
    if(ae.getSource()==b8){
        zt=l1.getText();
        z=zt+"8";
        l1.setText(z);
    }
    if(ae.getSource()==b9){
        zt=l1.getText();
        z=zt+"9";
        l1.setText(z);
    }
    if(ae.getSource()==b0){
        zt=l1.getText();
        z=zt+"0";
        l1.setText(z);
    }
    if(ae.getSource()==add){
        try{
            num1=Double.parseDouble(l1.getText());
        }
        catch(NumberFormatException f){
            l1.setText("Invalid Format");
            return;
        }
        z="";
        l1.setText(z);
        check=1;
    }
    if(ae.getSource()==sub){
        try{
            num1=Double.parseDouble(l1.getText());
        }
        catch(NumberFormatException f){
            l1.setText("Invalid Format");
            return;
        }
        z="";
        l1.setText(z);
        check=2;
    }
    if(ae.getSource()==mult){
        try{
            num1=Double.parseDouble(l1.getText());
        }
        catch(NumberFormatException f){
            l1.setText("Invalid Format");
            return;
        }
        z="";
        l1.setText(z);
        check=3;
    }
    if(ae.getSource()==div){
        try{
            num1=Double.parseDouble(l1.getText());
        }
        catch(NumberFormatException f){
            l1.setText("Invalid Format");
            return;
        }
        z="";
        l1.setText(z);
        check=4;
    }
    if(ae.getSource()==clr){
        num1=0;
        num2=0;
        check=0;
        d=0;
        z="";
        l1.setText(z);
   }
    if(ae.getSource()==eq){
        try{
            num2=Double.parseDouble(l1.getText());
        }
        catch(Exception e){
            l1.setText("ENTER NUMBER");
      return;
    }
        if(check==1)
            d =num1+num2;
        if(check==2)
            d =num1-num2;
        if(check==3)
            d =num1*num2;
        if(check==4)
            d =num1/num2;
        l1.setText(String.valueOf(d));
    }
}
 public static void main(String args[]){  
       NewCalc obj =new NewCalc();  
   }
}