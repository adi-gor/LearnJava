package Collections;

import java.util.*;
import java.io.*;

public class PropertyDemo
{
    public static void main(String[] args) throws Exception
    {
        Properties p=new Properties();

        p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "i7");
        p.setProperty("OS", "Windows10");
        p.setProperty("Model", "Latitude");


        p.storeToXML(new FileOutputStream("C:\\Users\\HP\\IdeaProjects\\LearnJava\\src\\Collections\\MyData.xml"), "Laptop");


        p.load(new FileInputStream("C:\\Users\\HP\\IdeaProjects\\LearnJava\\src\\Collections\\MyData.xml"));

        System.out.println(p);
    }
}