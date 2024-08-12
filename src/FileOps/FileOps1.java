package FileOps;

import java.io.*;

public class FileOps1
{
    public static void main(String[] args) throws Exception
    {

        FileInputStream fis1=new FileInputStream("C:\\Users\\HP\\IdeaProjects\\LearnJava\\src\\FileOps\\Source1.txt");
        FileInputStream fis2=new FileInputStream("C:\\Users\\HP\\IdeaProjects\\LearnJava\\src\\FileOps\\Source2.txt");

        FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\IdeaProjects\\LearnJava\\src\\FileOps\\Destination.txt");

        SequenceInputStream sis=new SequenceInputStream(fis1,fis2);


        int b;
        while((b=sis.read())!=-1)
        {

            fos.write(b);
        }

        sis.close();
        fis1.close();
        fis2.close();
        fos.close();

    }
}