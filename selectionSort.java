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
        System.out.println("Enter the element:");
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
            System.out.println(Arr[i]+" ");
        }
    }
    public void DisplayX()
    {
        System.out.println("After sorting data are:");
        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }
    }
}
class SelectionSort extends ArrayX
{
    public SelectionSort(int no)
    {
        super(no);
    }
    public void sort()
    {
        int i=0,j=0,temp=0;
        int size=Arr.length;
        int minindex=0;
        for(i=0;i<size;i++)
        {
            minindex=i;
            for(j=i;j<size;j++)
            {
                if(Arr[minindex]>Arr[j])
                {
                    minindex=j;
                }
            }
            temp=Arr[i];
            Arr[i]=Arr[minindex];
            Arr[minindex]=temp;

        }
    }
}
class selectionSort 
{
    public static void main(String arg[])    
    {
        Scanner sobj=new Scanner(System.in);
        int length=0;
        System.out.println("Enter size: ");
        length=sobj.nextInt();

        SelectionSort obj=new SelectionSort(length);
        obj.Accept();
        obj.Display();
        obj.sort();
        obj.DisplayX();
    }
}
