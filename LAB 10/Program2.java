// WAP to demonstrate Multithreading 

public class Program2
{
    public static void main(String args[])
    {
       demo1 d1 = new demo1();
       demo2 t2 = new demo2();  
       Thread d2= new Thread(t2);
       d1.start();
       d2.start();
    }
}

class demo1 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
            System.out.println("In thread 1");
    }
}

class demo2 implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
            System.out.println("In thread 2");
    }
}