// WAP to read to a file suing FileReader class

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program2
{
    public static void main (String [] args)
    {
        char[] arr = new char[50];
        try
        {
            FileReader fr = new FileReader("C:\\Users\\HP\\Desktop\\Sample.txt");
            fr.read(arr);
            System.out.println(arr);
            fr.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Content is read from the file");       
        }
    }
}
