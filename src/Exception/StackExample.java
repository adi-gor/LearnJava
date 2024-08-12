//Invalid push and pop operations results in StackOverFlow or StackUnderFlow Exception.
package Exception;

class StackOverFlow extends Exception
{
    public String toString()
    {
        return "Stack is Full";
    }
}

class StackUnderFlow extends Exception
{
    public String toString()
    {
        return "Stack is Empty";
    }
}


class Stack
{
    private int size;
    private int top=-1;
    private int S[];

    public Stack(int sz)
    {
        size=sz;
        S=new int[sz];
    }

    public void push(int x) throws StackOverFlow
    {
        if(top==size-1)
            throw new StackOverFlow();
        top++;
        S[top]=x;
    }

    public int pop() throws StackUnderFlow
    {
        int x=-1;

        if(top==-1)
            throw new StackUnderFlow();
        x=S[top];
        top--;
        return x;
    }
}




public class StackExample
{
    public static void main(String[] args)
    {
        Stack st=new Stack(5);
        try
        {
            st.push(10);
            st.push(15);
            st.push(10);
            st.push(15);
            st.push(10);

        }
        catch(StackOverFlow s)
        {
            System.out.println(s);
        }
        try
        {
            st.pop();
            st.pop();
            st.pop();
            st.pop();
            st.pop();
            st.pop();
        }
        catch(StackUnderFlow s)
        {
            System.out.println(s);
        }
    }
}