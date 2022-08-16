import java.net.PortUnreachableException;

class Node
{
    public int data;
    public Node prev;
    public Node next;
}
class DoublyCL
{
    public Node first;
    public Node last;
    public int size;
    DoublyCL()
    {
        this.first=null;
        this.last=null;
        this.size=0;
    }

    public void InsertFirst(int no)
    {
        Node newn=new  Node();
        newn.data=no;
        newn.next=null;
        newn.prev=null;
        if(first==null&&last==null)
        {
            first=newn;
            last=newn;
        }
        else
        {
            newn.next=first;
            newn.next.prev=newn;
            first=newn;
            first.prev=last;
        }
        this.size++;
    }
    public void InsertLast(int no)
    {
        Node newn=new Node();
        newn.data=no;
        newn.next=null;
        newn.prev=null;
        if(first==null&&last==null)
        {
            first=newn;
            last=newn;
        }
        else
        {
            Node temp=first;
            while(temp!=last)
            {
                temp=temp.next;
            }
            temp.next=newn;
            newn.prev=temp;
            last=newn;
            last.next=first;
            first.prev=last;
        }
        this.size++;
    }
    public void DeleteFirst()
    {
        if(first==null&&last==null)
        {
            return;
        }
        else if(first==last)
        {
            first=null;
            last=null;
        }
        else
        {
            first=first.next;
        }
        last.next=first;
        first.prev=last;
        this.size--;
    }

    public void DeleteLast()
    {
        if(first==null&&last==null)
        {
            return;
        }
        else if(first==last)
        {
            first=null;
            last=null;
        }
        else
        {
            last=last.prev;
            last.next=first;
            first.prev=last;
        }
        this.size--;
    }

    public void InsertAtPos(int no,int pos)
    {
        if((pos<0)||(pos>size+1))
        {
            return;
        }
        if(pos==1)
        {
            InsertFirst(no);
        }
        else if(pos==size+1)
        {
            InsertLast(no);
        }
        else
        {
            Node newn=new Node();
            newn.data=no;
            newn.next=null;
            newn.prev=null;
            Node temp=first;
            for(int i=1;i<pos-1;i++)
            {
                temp=temp.next;
            }
            newn.next=temp.next;
            newn.next.prev=newn;
            temp.next=newn;
            newn.prev=temp;
        }
        this.size++;
    }

    public void DeleteAtPos(int pos)
    {
        if((pos<0)||(pos>size))
        {
            return ;
        }
        if(pos==1)
        {
            DeleteFirst();
        }
        else if(pos==size)
        {
            DeleteLast();
        }
        else
        {
            
            Node temp=first;
            for(int i=1;i<pos-1;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.prev=temp;
        }
        this.size--;
    }
    public void Display()
    {
        Node temp=first;
        for(int i=1;i<=size;i++)
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

class DCL 
{
    public static void main(String arg[])    
    {
        DoublyCL obj=new DoublyCL();
        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);
        obj.InsertFirst(8);
        obj.InsertLast(101);
        obj.InsertLast(111);
        // obj.DeleteFirst();
        // obj.DeleteLast();
        obj.InsertAtPos(8, 3);
        obj.DeleteAtPos(3);
        obj.Display();
        int iRet=obj.Count();
        System.out.print("Count Are:"+obj.Count());
    }
}
