import java.sql.Struct;

class Node
{
    public int data;
    public Node next;
}
class Insert
{
    private Node first;
    private int size=0;
    public Insert()
    {
        first=null;
        size=0;
    }

    public void Enque(int no)
    {
        Node newn =new Node();
        newn.data=no;
        newn.next=null;

        if(first==null)
        {
            first=newn;
        }
        else
        {
            Node temp=first;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newn;
        }
        this.size++;
    }
    public int Deque()
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
}

class Queue 
{
    public static void main(String arg[])
    {
        Insert obj=new Insert();
        obj.Enque(11);
        obj.Enque(21);
        obj.Enque(51);
        obj.Enque(101);
        obj.Enque(111);
        obj.Enque(59);
        obj.Display();
        int iRet=obj.Deque();
        System.out.println("\nDeque lement are:"+iRet);
        obj.Display();
    }
}
