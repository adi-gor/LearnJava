package StaticFinal;
import java.util.Date;

class Student
{
    private String rollNo;

    private static int count=1;

    Student()
    {
        rollNo=assignRollNo();
    }

    private String assignRollNo()
    {
        Date d=new Date();

        String rno="Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rno;
    }
    public String getRollNo()
    {
        return rollNo;
    }

}

public class StaticPractice2
{
    public static void main(String[] args)
    {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();

        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());

    }
}