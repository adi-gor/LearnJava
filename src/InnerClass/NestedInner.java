//Inner class can access outer class methods and variables whereas for the outer class to access inner class variables and methods object of the inner class must be created
//As both outer and inner classes are non static we need to create objects of both
package InnerClass;

class Outer
{
    static int x=10;
    Inner i=new Inner();

    class Inner
    {
        int y=20;
        public void innerDisplay()
        {
            System.out.println(x+" "+y);
        }
    }

    public void outerDisplay()
    {

        i.innerDisplay();
        System.out.println(i.y);

    }
}

public class NestedInner {

    public static void main(String[] args)
    {
        Outer.Inner oi=new Outer().new Inner();
        oi.innerDisplay();
        Outer o = new Outer();
        o.outerDisplay();
    }

}