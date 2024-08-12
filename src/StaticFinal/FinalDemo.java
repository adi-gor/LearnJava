//final variables can only be initialized not updated
package StaticFinal;

class Test2 {
    public final void show()
    {
        System.out.println();
    }
}

class Test3 extends Test2
{
    //public void show(){}
    //gives error as final methods cannot be overloaded.
}

public class FinalDemo {

    public static void main(String[] args) {

        final float PI;
        PI=3.1425f;
        System.out.println(PI);

    }
}