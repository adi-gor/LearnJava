//If you declare variables or non abstract methods in an interface you must define them to be static.
//Variables in an interface are by default public, static and final but can be inherited. Static methods can't be inherited.
package Interface;

interface Test
{
    public final static int X=10;
    public abstract void meth1();
    public abstract void meth2();
    public static void meth3()
    {
        System.out.println("Meth3 of Test");
    }
}

interface Test2 extends Test
{
    void meth4();
}

class My implements Test2
{
    public void meth1(){System.out.println("Meth1");}
    public void meth2(){System.out.println("Meth2");}
    public void meth4(){System.out.println("Meth4");}
}
public class InterfaceExample3
{
    public static void main(String[] args)
    {
        System.out.println(Test2.X);
        Test.meth3();
    }
}
