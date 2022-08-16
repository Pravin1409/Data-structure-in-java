import java.util.*;
class ArrayX
{
    public int Arr[];
    public ArrayX(int size)
    {
        Arr=new int[size];
    }
    public void Accept()
    {
        Scanner sobj=new Scanner(System.in);
        int i=0;
        System.out.println("Enter element:");
        for(i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Data are:");
        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }
    }
}
class linearSearch extends ArrayX
{
    public linearSearch(int no)
    {
        super(no);
    }

    public boolean search(int no)
    {
        int i=0;
        for(i=0;i<Arr.length;i++)
        {
            if(Arr[i]==no)
            {
                break;
            }
        }
        if(i==Arr.length)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
class LinearSearch
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int length=0;
        System.out.println("Enter size: ");
        length=sobj.nextInt();
        linearSearch obj=new linearSearch(length);
        obj.Accept();
        obj.Display();
        System.out.println("Enter number you want to search:");
        int no=sobj.nextInt();
        boolean bRet=false;
         bRet=obj.search(no);
         if(bRet==true)
         {
             System.out.println("Number is their");
         }
         else
         {
             System.out.println("Number is not their");
         }

    }
}
