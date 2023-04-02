package Lab6;
import java.util.Scanner;

/*  WAP to increment the employee salaries on the basis of their designation(Manager-5000, General Manager-10000, CEO-20000, 
    worker-2000). Use employee name, id, designation , salary as data member and inc_sal as member function.  */

class EmployeeIncrement
{
    String empName;
    String empDesignation;
    int empId;
    float empSalary;
    
    EmployeeIncrement()
    {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter employee name: ");
        empName = obj.nextLine();
        System.out.println("Enter employee designation: ");
        empDesignation = obj.nextLine();
        System.out.println("Enter employee id: ");
        empId = obj.nextInt();
        System.out.println("Enter employee salary: ");
        empSalary = obj.nextFloat();
    }
    
    EmployeeIncrement(String name, String designation, int id, int salary)
    {
        empName = name;
        empId = id;
        empDesignation = designation;
        empSalary = salary;
    }
    
    void inc_sal()
    {
        switch(empDesignation)
        {
            case "Manager": 
                System.out.println("Incremented salary : " + (empSalary + 5000));
                break;
            case "General Manager": 
                System.out.println("Incremented salary : " + (empSalary + 10000));
                break;
            case "CEO": 
                System.out.println("Incremented salary : " + (empSalary + 20000));
                break;
            case "Worker": 
                System.out.println("Incremented salary : " + (empSalary + 2000));
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }
}

public class Employee 
{
    public static void main (String args[])
    {
        EmployeeIncrement emp1 = new EmployeeIncrement();
        emp1.inc_sal();
    }
}
