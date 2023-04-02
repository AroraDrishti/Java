// WAP to demonstrate exceptions (throw keyword)

class NewException1 extends Exception
{
    NewException1()
    {
        System.out.println("New Exception 1 is generated");
    }
    NewException1(int num)
    {
        System.out.println("New Exception 1 is generated with " + num);
    }
}

public class Program2
{
    public static void main (String args[])
    {
        try
        {
            throw new NewException1(); // this exception is catched  
        }
        catch(NewException1 e)
        {
            System.out.println("Exception generated: " + e);
            e.getMessage();
        }
        finally
        {
            System.out.println("Execution terminated. ");
        }
    }
}