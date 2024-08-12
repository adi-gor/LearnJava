//Here Inter Process Communication is achieved using synchronization of 2 threads by wait and notify methods to access shared resource.
//Difference between  sleep and wait methods is that sleep method pauses the thread execution without releasing lock on objects whereas wait releases lock on objects.
package Multithreading;

class Data
{
    int value;
    boolean flag=true;

    synchronized public void set(int v)
    {
        while(flag!=true)
            try {wait();}catch(Exception e){}

        value=v;
        flag=false;
        notify();
    }

    synchronized public int get()
    {
        int x=0;
        while(flag!=false)
            try {wait();}catch(Exception e){}


        x=value;
        flag=true;
        notify();

        return x;
    }
}

class Producer extends Thread
{
    Data data;

    public Producer(Data d)
    {
        data=d;
    }
    public void run()
    {
        int count=1;
        while(true)
        {
            data.set(count);
            System.out.println("Producer "+count);
            count++;
        }
    }
}

class Consumer extends Thread
{
    Data data;

    public Consumer(Data d)
    {
        data=d;
    }
    public void run()
    {
        int value;
        while(true)
        {
            value=data.get();
            System.out.println("Consumer "+value);
        }
    }
}

public class IPC
{
    public static void main(String[] args)
    {
        Data data=new Data();

        Producer p=new Producer(data);
        Consumer c=new Consumer(data);

        p.start();
        c.start();

    }
}