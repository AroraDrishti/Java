package Lab7;
import java.lang.NullPointerException;

// Write a program to override CompareTo function of Comparable Interface.
public class Program4 
{
    public static void main (String args[])
    {
        Student st1 = new Student("drishti");
        Student st2= new Student("Drishti");
        int res = st1.compareTo(st2);
        if(res==0)
        {
            System.out.println("Names are same");
        }
        else
        {
            System.out.println("Names are different");
        }
    }
}

class Student implements Comparable<Student>
{
    String name;
    
    Student(String name)
    {
        this.name = name;
        System.out.println("Name of the student is " + name);
    }

    @Override
    public int compareTo(Student st) 
    {
        int diff = name.compareToIgnoreCase(st.name);
        return diff;
    }  
}