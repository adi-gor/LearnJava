//Multiple threads execute setter and then getter processes based on availability of shared resource.
package Multithreading;

class Board
{
    String text;
    int n = 0, cnt = 0;
    public void attendance()
    {
        n++;
    }
    synchronized public void write(String text)
    {
        System.out.println("Teacher writing: " + text);
        while (cnt != 0)
        {
            try
            {
                wait();
            }
            catch (Exception e)
            {

            }
        }
        cnt = n;
        this.text = text;
        notifyAll();
    }
    synchronized public String read()
    {
        while (cnt == 0)
        {
            try
            {
                wait();
            }
            catch(Exception e)
            {

            }
        }
        String t = text;
        cnt--;
        if (cnt == 0)
        {
            notify();
        }
        return t;
    }
}

class Teacher extends Thread
{
    Board b;
    String notes[] = {"C++", "Java", "Python", "End"};
    public Teacher(Board b)
    {
        this.b = b;
    }
    public void run()
    {
        for (int i = 0; i < notes.length; i++)
        {
            b.write(notes[i]);
        }
    }
}

class Student extends Thread
{
    Board b;
    String name;
    public Student(String name, Board b)
    {
        this.name = name;
        this.b = b;
    }
    public void run()
    {
        b.attendance();
        String text;
        do
        {
            text = b.read();
            System.out.println(name + " Reading: " + text);
            System.out.flush();
        } while (!text.equals("End"));
    }
}

public class IPC1 {
    public static void main(String[] args)
    {
        Board b = new Board();
        Teacher t = new Teacher(b);
        Student s1 = new Student("Aditya", b);
        Student s2 = new Student("Han", b);
        Student s3 = new Student("Marcus", b);
        t.start();
        s1.start();
        s2.start();
        s3.start();
    }
}
