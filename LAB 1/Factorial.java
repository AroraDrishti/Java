package factorial;


public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;
        int factorial = factorial(n);
        System.out.println("Factorial of " + n + " is " + factorial);
    }
    
    static int factorial(int num)
    {
        int fact = 1;
        for(int i = 1; i <= num; i++)
        {
            fact = fact * i;
        }
        return fact;
    }
    
}
