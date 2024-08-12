// sum of numbers using command line arguments
package VariableArguments;

public class MySum
{
    public static void main(String args[])
    {
        double sum = 0;
        for (String s : args)
        {
            if (s.matches("[0-9.]+"))
            {
                sum += Double.parseDouble(s);
            }
        }
        System.out.println(sum);
    }
}