import java.util.*;
class Node
{
    public int data;
    public Node next;
}
class Insert
{
    private Node first;
    private int size;
    public Insert()
    {
        first=null;
        size=0;
    }

    public void Push(int no)
    {
        Node newn=new Node();
        newn.data=no;
        newn.next=null;
        if(first==null)
        {
            first=newn;
        }
        else
        {
            newn.next=first;
            first=newn;
        }
        this.size++;
    }
    public int Pop()
    {
        int no=0;
        if(first==null)
        {
            return-1;
        }
        else if(size==1)
        {
            first=null;
        }
        else
        {
            
            
            no=first.data;
            first=first.next;
            
        }
        this.size--;
        return no;
    }
    public void Display()
    {
        Node temp=first;
        while(temp!=null)
        {
            System.out.print("|"+temp.data+"|->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public int Count()
    {
        return size;
    }
}
class Stack 
{
    public static void main(String arg[])
    {
        Insert obj=new Insert();
        obj.Push(51);
        obj.Push(21);
        obj.Push(11);
        obj.Push(8);
        int iRet=obj.Pop();
        System.out.println("Poped data are:"+iRet);
        obj.Display();
        int iret=obj.Count();
        System.out.println("\nCount are:"+obj.Count());
    }
}
