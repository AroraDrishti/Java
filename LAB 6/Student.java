package Lab6;
import java.util.Scanner;

/*  WAP to maintain the student record containing roll number , Name, marks1, marks2, marks3 as data member 
    and getdata(), display() and setdata() as member functions. */

class StudentDetails
{
    int rollNumber;
    String name;
    float marks1;
    float marks2;
    float marks3;

    void setData()
    {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        name = obj.nextLine();
        System.out.println("Enter roll number: ");
        rollNumber = obj.nextInt();
        System.out.println("Enter marks in subject 1: ");
        marks1 = obj.nextInt();
        System.out.println("Enter marks in subject 2: ");
        marks2 = obj.nextInt();
        System.out.println("Enter marks in subject 3: ");
        marks3 = obj.nextInt();        
    }
    
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks in subject 1: " + marks1);
        System.out.println("Marks in subject 2: " + marks2);
        System.out.println("Marks in subject 3: " + marks3);
    }
}

public class Student 
{
    public static void main (String args[])
    {
        StudentDetails st1 = new StudentDetails();
        st1.setData();
        st1.display();
    }
}