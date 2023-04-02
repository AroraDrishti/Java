//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Program1
//{
//    public static void main (String args[]) throws IOException
//    {
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
//        System.out.println("Enter name: ");
//        String name = br.readLine();
//        System.out.println("Hello <" + name + ">!");
//    }
//}

class Demo extends Thread
{
    @Override
    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Thread " + i);
        }        
    }
}

public class Program1
{
    public static void main (String args[])
    {
        Demo d1 = new Demo();
        d1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(d1.getPriority());
        
        Demo d2 = new Demo();
        d2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(d2.getPriority());
        
        Demo d3 = new Demo();
        d3.setPriority(Thread.NORM_PRIORITY);
        System.out.println(d3.getPriority());
        
        d1.start();
        d2.start();
        d3.start();
    }
}