//As the inner class is static we only need to create the outer class
package InnerClass;

class OuterClass
{
    int x=10;
    static int y=20;

    static class My
    {
        public void show()
        {
            System.out.println(y);
        }
    }

}

public class LocalInner
{
    public static void main(String[] args)
    {
        OuterClass.My m=new OuterClass.My();
        m.show();
    }

}