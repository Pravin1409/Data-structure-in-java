
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
        System.out.println("Enter numbers:");
        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }
    }
    public void Display()
    {
        System.out.println("Element are:");
        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }
      
    }
}
class Searching extends ArrayX
{
    public Searching(int no)
    {
        super(no);
    }
    public boolean BinarySearch(int no)
    {
        int start=0,i=0;
        int size=Arr.length;
        int end=size-1;
        int mid=(start+end)/2;
        
        for( i=0;i<size;i++)
        {
            if(Arr[mid]==no)
            {
                break;
            }
            else if(no>Arr[mid])
            {
                start=mid+1;
            }
            else if(no<Arr[mid])
            {
                end=mid-1;
            }
            mid=(start+end)/2;
        }
        if(i==size)
        {
            return false;
        }
        else
        {
            return true;
        }

    }
}
class BinarySearch 
{
    public static void main(String arg[])    
    {
        Scanner sobj=new Scanner(System.in);
        int length=0;
        System.out.println("enter the length :");
        length =sobj.nextInt();

        Searching obj=new Searching(length);
        obj.Accept();
        obj.Display();
        System.out.println("Enter number which you want to search:");
        int no=sobj.nextInt();

        boolean bRet=false;
        bRet=obj.BinarySearch( no);
        if(bRet==true)
        {
            System.out.print("Number is their\n");
        }
        else
        {
            System.out.println("Number is not present");
        }
    
    }
}
