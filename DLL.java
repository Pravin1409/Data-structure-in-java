
class Node
{
    public int data;
    public Node prev;
    public Node next;
}
class DoublyLL
{
    public Node first;
    public int size;
    DoublyLL()
    {
        this.first=null;
        this.size=0;
    }

    public void InsertFirst(int no)
    {
        Node newn=null;
        newn=new Node();
        newn.data=no;
        newn.prev=null;
        newn.next=null;
        if(first==null)
        {
            first=newn;
        }
        else
        {
             newn.next=first;
             first.prev=newn;
             first=newn;

        }
        this.size++;
    }

    public void InsertLast(int no)
    {
        Node newn=new Node();
        newn.data=no;
        newn.next=null;
        newn.prev=null;

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
            newn.prev=temp;
            temp.next=newn;
        }
        this.size++;
    }

    public void DeleteFirst()
    {
        if(size==0)
        {
            return;
        }
        else if(size==1)
        {
            first=null;
        }
        else
        {
            first=first.next;
        }
        this.size--;
    }
    public void DeleteLast()
    {
        if(size==0)
        {
            return;
        }
        else if(size==1)
        {
            first=null;
        }
        else
        {
            Node temp=first;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
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
            Node temp=first;
            Node newn=new Node();
            newn.data=no;
            newn.next=null;
            newn.prev=null;
            for(int i=1;i<pos-1;i++)
            {
                temp=temp.next;
            }
            newn.next=temp.next;
            newn.next.prev=newn;
            newn.prev=temp;
            temp.next=newn;
        }
        this.size++;
    }

    public void DeleteAtPos(int pos)
    {
        if((pos<0)||(pos>size))
        {
            return;
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
    public int Count()
    {
        return size;
    }
}
class DLL
{
    public static void main(String arg[])
    {
        DoublyLL obj=new DoublyLL();
        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);
        obj.InsertLast(101);
        obj.DeleteFirst();
        obj.DeleteLast();
        obj.InsertAtPos(4, 2);
        obj.DeleteAtPos(2);
        obj.Display();
        int iRet=obj.Count();
        System.out.println("Count are:"+obj.Count());
    
    }
}
