// WAP to demonstrate thread synchronization

public class Program6 
{
    public static void main (String args[])
    {
        demo d1 = new demo();
        demo d2 = new demo();
        d1.start();
        d2.start();
    }
}

class demo extends Thread
{
    @Override
    public synchronized void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Number is " + i);
        }        
    }
}