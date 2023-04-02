package Lab7;

// Write a program in Java to use final variables, final methods and final classes.

public class Program3 
{
    public static void main (String args[])
    {
        // final variable
        int a=3;
        final int b=4;
        
        a=5;
        // b=6; --> error (cannot assign value to final variable)
        Derived d1 = new Derived();
        d1.func1();
        d1.func2();
    }
}

class Base
{
    void func1()
    {
        System.out.println("Body of function 1 in base");
    }
    
    static void func2()
    {
        System.out.println("Body of function 2 in base");
    }
}

final class Derived extends Base
{
    @Override
    void func1()
    {
        System.out.println("Body of function 1 in derived");
    }
     
    /* error (final method cannot be overrided)
    @Override
    void func2()
    {
        System.out.println("Body of function 2");
    } */
}

/* error (cannot inherit a final class)
class Derived2 extends Derived
{
    // data members and methods
} */