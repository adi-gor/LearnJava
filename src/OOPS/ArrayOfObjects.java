//Array of objects
package OOPS;

class Subject
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marks;
    Subject(String subID, String name, int maxMarks, int marks)
    {
        this.subID = subID;
        this.maxMarks = maxMarks;
        setName(name);
        setMarks(marks);
    }
    public String getSubID() {return subID;}
    public String getName() {return name;}
    public int getMaxMarks() {return maxMarks;}
    public int getMarks() {return marks;}
    public String getResult()
    {
        if (marks >= maxMarks * 0.4)
        {
            return "Passed";
        }
        else
        {
            return "Failed";
        }
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setMarks(int marks)
    {
        this.marks = marks;
    }
}

public class ArrayOfObjects
{
    public static void main(String[] args)
    {
        Subject[] sub = new Subject[3];
        sub[0] = new Subject("MAT", "Aditya", 50, 50);
        sub[1] = new Subject("PHY", "Tomas", 50, 20);
        sub[2] = new Subject("CHE", "Heung", 50, 48);
        for (Subject s : sub)
        {
            System.out.println(s.getSubID());
            System.out.println(s.getName());
            System.out.println(s.getMaxMarks());
            System.out.println(s.getMarks());
            System.out.println(s.getResult());
        }
    }
}
