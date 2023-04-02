package Lab6;

// Write a java program to represent Abstract class with example.

abstract class LivingBeing
{
    abstract void introduction();
    void greet()
    {
        System.out.println("Hello!");
    }
}

class Human extends LivingBeing
{
    @Override
    void introduction() 
    {
        System.out.println("I am a human");
    }
}

class Animal extends LivingBeing
{
    @Override
    void introduction() 
    {
        System.out.println("I am an animal");
    }
}
        
public class AbstractClassExample 
{
    public static void main (String args[])
    {
        Human h1 = new Human();
        h1.introduction();
        h1.greet();
        
        Animal a1 = new Animal();
        a1.introduction();
        a1.greet();
    }
}