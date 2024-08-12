//A lambda expression can be passed around as if it was an object and executed on demand.
package Lambda;

interface MyLambda1
{
    public void display();
}

class UseLambda
{
    public void callLambda(MyLambda1 ml)
    {
        ml.display();
    }
}

class Demo
{
    public void method1(){
        UseLambda ul=new UseLambda();
        ul.callLambda(()->{System.err.println("Hello");});
    }
}
public class LamdaDemo2 {

    public static void main(String[] args) {
        Demo d=new Demo();
        d.method1();
    }

}