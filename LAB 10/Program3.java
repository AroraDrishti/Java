// WAP to demonstrate some functions of threads 

public class Program3
{
    public static void main(String args[])
    {
       demo1 d1 = new demo1();
       demo2 d2 = new demo2();
       d1.start();
       d2.start();
       
       // isAlive() --> returns boolean whether the thread has completed execution or not
       System.out.println(d1.getState());
       System.out.println(d1.isAlive());
       
       // d1.currentThread() --> returns a Thread variable pointing to the currently executing thread
       Thread currentThread = d1.currentThread();
       
       // setName() --> sets the name of the currently executing thread
       // getName() --> returns the name of the current thread
       for(int i=0;i<5;i++)
       {
           d2.setName("Hello " + i);
           System.out.println(d2.getName());
       }
       
       // setPriority() --> sets the priority of the thread
       // getPriority() --> returns the priority of the thread
       d1.setPriority(Thread.MAX_PRIORITY);
       System.out.println("Priority of thread d1 is " + d1.getPriority());
       
       // isAlive() --> returns boolean whether the thread has completed execution or not
       System.out.println(d2.getState());
       System.out.println(d2.isAlive());           
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