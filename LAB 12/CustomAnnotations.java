import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.TYPE) 
@interface Student
{
    String name() default "";
    int age() default 20;    
}

@Student(name = "Something")
class StudentDetails
{
    int semester;
    String subject;
    
    StudentDetails(int sem, String sub)
    {
        semester = sem;
        subject = sub;
    }
    
    void getDetails()
    {
        System.out.println("Semester: " + semester);
        System.out.println("Subject: " + subject);
    }
}

public class CustomAnnotations 
{
    public static void main (String args[])
    {
        StudentDetails s1 = new StudentDetails(4,"idc");
        s1.getDetails();
    }
}
