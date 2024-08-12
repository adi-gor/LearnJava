//Static block is implicitly called when object is created
package StaticFinal;

class Test1
{
    static
    {
        System.out.println("Hello World");
    }
}

public class StaticPractice1 {
    public static void main(String[] args)
    {

        Test1 t=new Test1();
    }

}