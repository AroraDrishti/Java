// WAP to demonstrate Daemon Thread

public class Program7 
{
    public static void main (String args[])
    {
        demo d1 = new demo();
        demo d2 = new demo();
        demo d3 = new demo();
        d1.setDaemon(true);
        d1.start();
        d2.start();
        d3.setDaemon(true);
        d3.start();
    }    
}

class demo extends Thread
{     
    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("This is Daemon thread");
        }      
        else
        {
            System.out.println("This is not a Daemon thread");
        }
    }
}