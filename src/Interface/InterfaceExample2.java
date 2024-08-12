//Member interface is implemented by customer class. Member is stored in store class and its method is called by that class
package Interface;

interface Member
{
    public void callback();
}

class Store
{
    Member[] members = new Member[10];
    int cnt = 0;
    public void register(Member m)
    {
        members[cnt++] = m;
    }
    public void greeting()
    {
        for (int i = 0; i < cnt; i++)
        {
            members[i].callback();
        }
    }
}

class Customer implements Member
{
    String name;
    Customer(String name)
    {
        this.name = name;
    }
    public void callback()
    {
        System.out.println("Hi, " + name);
    }
}

public class InterfaceExample2
{
    public static void main(String[] args)
    {
        Store s = new Store();
        Customer c1 = new Customer("Aditya");
        Customer c2 = new Customer("John");
        s.register(c1);
        s.register(c2);
        s.greeting();
    }
}
