package Package1;
import Package2.*;

//  WAP to implement package concept.

public final class PackagesExample 
{
    public static void main (String[] args)
    {
        Sample ob1 = new Sample(); //--> error --> class Sample is in another package
        ob1.func();
        // ob1.func1(); --> error --> method not public
        // System.out.println(ob1.a); --> error --> variable not public
        System.out.println(ob1.b);
        
//        Sample2 ob2 = new Sample2();
//        ob2.func2();
//        ob2.func(); // inherited method
    }
}

//class Sample2 extends Sample
//{
//    void func2()
//    {
//        System.out.println("In Sample2");
//    }
//}