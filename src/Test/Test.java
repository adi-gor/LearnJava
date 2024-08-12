package Test;

import java.io.*;
import java.util.*;

class Account implements Serializable
{
    String accno, name;
    double balance;
    Account(String accno, String name, double balance)
    {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }
    public String toString()
    {
        return "Account no " + accno +
                "\nName " + name +
                "\nBalance " + balance + "\n";
    }
}

class Test
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        Account acc = null;
        HashMap<String, Account> hm = new HashMap<>();
        try
        {
            FileInputStream fis = new FileInputStream("C:\\Users\\HP\\IdeaProjects\\LearnJava\\src\\Collections\\Accounts.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            int cnt = ois.readInt();
            for (int i = 0; i < cnt; i++)
            {
                acc = (Account)ois.readObject();
                hm.put(acc.accno, acc);
            }
            ois.close();
            fis.close();
        }
        catch(Exception e)
        {

        }
        FileOutputStream fos = new FileOutputStream("C:\\Users\\HP\\IdeaProjects\\LearnJava\\src\\Collections\\Accounts.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        int choice;
        String accno, name;
        double balance;
        do
        {
            System.out.println("1. Create account");
            System.out.println("2. Read account");
            System.out.println("3. Read all accounts");
            System.out.println("4. Delete account");
            System.out.println("5. Exit");
            System.out.println("Enter your choice ");
            choice = sc.nextInt();
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            switch (choice)
            {
                case 1:
                    System.out.println("Enter AccNo, name and balance ");
                    accno = sc.nextLine();
                    name = sc.nextLine();
                    balance = sc.nextDouble();
                    acc = new Account(accno, name, balance);
                    hm.put(accno, acc);
                    System.out.println("Account created successfully");
                    break;

                case 2:
                    System.out.println("Enter accno ");
                    accno = sc.nextLine();
                    acc = hm.get(accno);
                    System.out.println(acc);
                    break;

                case 3:
                    for (Account a : hm.values())
                    {
                        System.out.println(a);
                    }
                    break;

                case 4:
                    System.out.println("Enter accno to delete");
                    accno = sc.nextLine();
                    hm.remove(accno);
                    break;

                case 5:
                    oos.writeInt(hm.size());
                    for (Account a : hm.values())
                    {
                        oos.writeObject(a);
                    }
                    break;
            }
        } while (choice != 5);
        oos.flush();
        oos.close();
        fos.close();
    }
}