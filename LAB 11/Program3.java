//WAP to write to a file using FileWriter class

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program3 
{
    public static void main (String [] args) throws IOException
    {
        try
        {
            FileWriter fw = new FileWriter("C:\\Users\\HP\\Desktop\\Sample.txt");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the content to be written to the file");
            fw.write(sc.nextLine());
            fw.close();
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