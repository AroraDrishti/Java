package Lab7;

// Write a program with given interfaces MotorBike and Cycle, then implement in child class TwoWheeler and display distance & speed.

public class Program2 
{
    public static void main (String args[])
    {
        TwoWheeler ob1 = new TwoWheeler();
        ob1.distance();
        ob1.speed();
    }
}

interface MotorBike
{
    int speed = 20;
    public void distance();
}

interface Cycle
{
    int distance = 200;
    public void speed();
}

class TwoWheeler implements MotorBike, Cycle
{
    @Override
    public void distance() 
    {
        System.out.println("Distance Travelled : " + distance);
    }

    @Override
    public void speed() 
    {
        System.out.println("Speed maintained : " + speed);
    } 
}