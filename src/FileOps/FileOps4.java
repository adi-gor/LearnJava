package FileOps;
import java.io.*;

class Student1 implements Serializable
{
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data=10;
    public transient int t;

    public Student1()
    {

    }
    public Student1(int r,String n,float a,String d)
    {
        rollno=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;
        t=500;
    }

    public String toString()
    {
        return "\nStudent Details\n"+
                "\nRoll "+rollno+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient "+t+"\n";
    }

}

public class FileOps4
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\IdeaProjects\\LearnJava\\src\\FileOps\\Student1.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        Student1 s=new Student1(10,"John",89.9f,"CSE");

        oos.writeObject(s);

        fos.close();
        oos.close();

        FileInputStream fis=new FileInputStream("C:\\Users\\HP\\IdeaProjects\\LearnJava\\src\\FileOps\\Student1.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);

        Student1 s1=(Student1)ois.readObject();

        System.out.println(s1);

        fis.close();
        ois.close();

    }
}