// WAP to demonstrate Multithreading 

public class Program5
{
    public static void main(String args[])
    {
       demo1 d1 = new demo1();
       demo2 d2 = new demo2();
       d1.setPriority(Thread.MIN_PRIORITY);
       d2.setPriority(Thread.MAX_PRIORITY);
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

class demo2 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
            System.out.println("In thread 2");
    }
}