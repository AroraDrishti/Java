package Lab7;

// Write a program to show concept of multiple inheritance through implementation of interfaces in a class.

interface Coder
{
    void displayCoder();
}

interface Player
{
    void displayPlayer();
}

class Employee implements Coder, Player
{

    @Override
    public void displayCoder() 
    {
        System.out.println("I am a coder");
    }

    @Override
    public void displayPlayer()
    {
        System.out.println("I am a player");
    }
    
}

public class Program1 
{
    public static void main (String args[])
    {
        Employee emp1 = new Employee();
        emp1.displayCoder();
        emp1.displayPlayer();
    }
}