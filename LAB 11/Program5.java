//WAP to write to a file using FileOutputStream

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program5
{
    public static void main (String [] args)
    {
        byte [] arr =new byte[100];
        
        try
        {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\HP\\Desktop\\Sample.txt");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the content to be written to the file");
            String str = sc.nextLine();
            arr = str.getBytes();
            fos.write(arr);
            fos.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Content is written to the file");       
        }
    }
}