//suclass method overrides superclass method
package Inheritance;

class TV
{
    public void switchON()
    {
        System.out.println("TV is switched on");
    }
    public void switchChannel() {
        System.out.println("TV channel switched");
    }
    public void isWorking()
    {
        System.out.println("TV is working");
    }
}

class SmartTV extends TV
{
    @Override
    public void switchON()
    {
        System.out.println("Smart TV switched on");
    }
    @Override
    public void switchChannel()
    {
        System.out.println("Smart TV channel switched");
    }
    public void turnVolume()
    {
        System.out.println("Smart TV volume turned");
    }
}

public class Overriding {
    public static void main(String[] args)
    {
        TV t = new TV();
        t.switchON();
        SmartTV st = new SmartTV();
        st.isWorking();

    }
}
