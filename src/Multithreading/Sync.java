//Next process is allowed to run only after finishing the previous one due to synchronization.
package Multithreading;

class MyData
{
    synchronized public void display(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i));
            try{Thread.sleep(1000);}catch(Exception e){}
        }

    }
}

class MyThread1 extends Thread
{
    MyData d;
    public MyThread1(MyData d)
    {
        this.d=d;
    }

    public void run()
    {
        d.display("Hello");
    }


}

class MyThread2 extends Thread
{
    MyData d;
    public MyThread2(MyData d)
    {
        this.d=d;
    }

    public void run()
    {
        d.display("World");
    }


}

public class Sync
{
    public static void main(String[] args)
    {
        MyData data=new MyData();

        MyThread1 t1=new MyThread1(data);
        MyThread2 t2=new MyThread2(data);

        t1.start();
        t2.start();



    }
}