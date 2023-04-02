// WAP to demonstrate Threads 

public class Program1
{
    public static void main(String args[])
    {
       demo d = new demo();
       d.start(); // implicitly invokes run() function
    }
}

class demo extends Thread
{
    public void run()
    {
        System.out.println("Thread is created");
    }
}