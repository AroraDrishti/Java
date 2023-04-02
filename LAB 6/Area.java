package Lab6;
import java.util.Scanner;

// Calculate area of different geometrical figures (circle, rectangle, square, triangle) using function overloading.

class AreaOfGeometricalFigures
{
    double area;
    String shape;
    
    void getData()
    {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter shape: ");
        shape = obj.nextLine();
    }
    
    void calcArea(float dim1)
    {
        if(shape.equalsIgnoreCase("Circle"))
        {
            area = 3.14 * dim1 * dim1;
            System.out.println("Area of circle with radius " + dim1 + " is " + area);
        }
        else if (shape.equalsIgnoreCase("Square"))
        {
            area = dim1 * dim1;
            System.out.println("Area of square with side " + dim1 + " is " + area);
        }
    }
    
    void calcArea(float dim1, float dim2)
    {
        if(shape.equalsIgnoreCase("Rectangle"))
        {
            area = dim1 * dim2;
            System.out.println("Area of rectangle with sides " + dim1 + " and " + dim2 + " is " + area);
        }
        else if (shape.equalsIgnoreCase("Triangle"))
        {
            area = 0.5 * dim1 * dim2;
            System.out.println("Area of triangle of height and base" + dim1 + "," + dim2 + " is " + area);
        }
    }
}

public class Area 
{
    public static void main (String args[])
    {
        AreaOfGeometricalFigures s1 = new AreaOfGeometricalFigures();
        AreaOfGeometricalFigures s2 = new AreaOfGeometricalFigures();
        s1.getData();
        s1.calcArea(5);
        s2.getData();
        s2.calcArea(5,9);
    }
}
