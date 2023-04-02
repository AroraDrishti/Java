package Package1;

// Write a program in Java to create an immutable class.

public class ImmutableClass 
{
    public static void main (String[] args)
    {
        Person p1 = new Person("Drishti");
        // p1.name = "Simran"; // error -> cannot assign value to final variable
        p1.getDetails();
    }
}

final class Person
{
    final String name;
    
    Person(String name)
    {
        this.name=name;
    }
    
    void getDetails()
    {
        System.out.println("Name is " + name);
    }      
}

// cannot be inherited since it is final class
/*
class Person2 extends Person
{
    // code
}*/