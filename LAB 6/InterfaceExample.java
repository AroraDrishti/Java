package Lab6;

// Write a java program to implement Interface.

interface in1
{
    int a = 1;
    void func1();
    void func2();
}

interface in2
{
    int a = 1;
    void func3();
    void func4();
}

class Sample implements in1, in2
{
    @Override
    public void func1()
    {
        System.out.println("Function 1");
    }

    @Override
    public void func2()
    {
        System.out.println("Function 2");
    }

    @Override
    public void func3()
    {
        System.out.println("Function 3");
    }

    @Override
    public void func4()
    {
        System.out.println("Function 4");
    }
}

public class InterfaceExample 
{
    public static void main (String args[])
    {
        Sample obj = new Sample();
        obj.func1();
        obj.func2();
        obj.func3();
        obj.func4();
    }
}