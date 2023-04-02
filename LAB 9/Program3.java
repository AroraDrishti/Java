import java.util.Scanner;

// WAP to demonstrate exceptions (throw and throws keyword)

class NewEvenException extends Exception
{
    NewEvenException(int num)
    {
        super();
        System.out.println("Only even numbers are accepted!");
    }
}

public class Program3
{
    public static void main (String args[]) throws NewEvenException
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = obj.nextInt();
        func1(num);
    }
    public static void func1(int num) throws NewEvenException
    {
        if(num%2==0)
        {
            System.out.println("Even number " + num + " accepted");
        }
        else
        {
            throw new NewEvenException(num);
        }
    }
}