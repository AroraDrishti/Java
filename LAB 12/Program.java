import java.util.ArrayList;
import java.util.Iterator;

public class Program
 {  
    public static void main(String args[])
    {  
       ArrayList<String> list = new ArrayList<String>();
       list.add("hie");
       list.add("bie");
       Iterator<String> i = list.iterator();
        while(i.hasNext() == true)
        {
            System.out.println(i.next());
        }
    }  
}  