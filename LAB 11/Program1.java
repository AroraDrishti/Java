// WAP to read a file

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program1 
{
    public static void main (String [] args) throws IOException
    {
        File f =new File("C:\\Users\\HP\\Desktop\\Sample.txt");
        Scanner sc = new Scanner(f);
        while (sc.hasNext())
        {
            String str = sc.nextLine();
            System.out.println(str);
        }
    }
}
