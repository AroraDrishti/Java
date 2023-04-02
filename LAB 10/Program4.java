// WAP to demonstrate join() function in threads

public class Program4
{
    public static void main(String args[])
    {
       demo1 d1 = new demo1();
       demo2 d2 = new demo2();
       d1.start();
       d2.start();
       
       try
       {
           d1.join();
           d2.join();
           d1.sleep(20); // delays execution of the thread by 20ms
           d2.yield(); //pauses execution of the invoking thread and let other threads complete their execution first
       }
       catch(InterruptedException e)
       {
           System.out.println(e);
       }
    }
}

class demo1 extends Thread
{
    public void run()
    {
        for(int i=0;i<500;i++)
            System.out.println("In thread 1");
    }
}

class demo2 extends Thread
{
    public void run()
    {
        for(int i=0;i<500;i++)
            System.out.println("In thread 2");
    }
}