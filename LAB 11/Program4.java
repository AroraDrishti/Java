// WAP to read a file using FileInputStraem class

import java.io.FileInputStream;
import java.io.IOException;

public class Program4 
{
    public static void main (String [] args)
    {
        byte [] arr =new byte[100];
        
        try
        {
            FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\Sample.txt");
            fis.read(arr);
            String str = new String(arr); //using the platform's default charset
            char [] chararray = str.toCharArray();
            System.out.println(chararray);
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
