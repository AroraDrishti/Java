/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Assignment {
    public static void main(String[] args) {
       
        //Question 1
        Scanner obj = new Scanner(System.in);
        String name[] = new String[5];
        String email[] = new String[5];
        String empcode[]= new String[5];
        long phone[] = new long[5];
        
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter name: ");
            name[i] = obj.nextLine();
            System.out.print("Enter e-mail: ");
            email[i] = obj.nextLine();
            System.out.print("Enter employee code: ");
            empcode[i] = obj.nextLine();
            System.out.print("Enter phone number: ");
            phone[i] = obj.nextLong();    
        }
        
        System.out.println("NAME MAIL-ID EMPLOYEE-CODE PHONE");
        for(int i=0;i<5;i++)
        {
            System.out.println(name[i] + " " + email[i] + " " + empcode[i] + " " + phone[i]);
        }
        
        //Question 2
        System.out.println("\"Can we print \'\\\' with System.out.println() statement"
                + "?\"");
    }   
}