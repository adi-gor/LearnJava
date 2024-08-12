//No need to catch block for file operations.
// Here to numbers are read from file and based on input exception is triggered.
package Exception;
import java.io.*;
import java.util.*;

public class Resources
{

    static void Divide() throws Exception
    {


        try(FileInputStream fi=new FileInputStream("C:\\Users\\HP\\IdeaProjects\\LearnJava\\src\\Exception\\Data.txt");Scanner sc=new Scanner(fi) )
        {
            int a=sc.nextInt();
            int c=sc.nextInt();
            System.out.println(a/c);
        }

    }

    public static void main(String[] args)
    {
        try
        {
            Divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }


    }

}