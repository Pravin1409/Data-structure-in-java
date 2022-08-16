import java.util.*;

import javax.swing.text.html.StyleSheet;
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
        System.out.println("Enter the element: ");
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

class InsertionSort extends ArrayX
{
    public InsertionSort(int no)
    {
        super(no);
    }
    public void Sort()
    {
        int i=0,j=0,key=0;
        int size=Arr.length;
        for(i=0;i<size;i++)
        {
            key=Arr[i];
            for(j=i-1;(j>=0)&&(Arr[j]>key);j--)
            {
                Arr[j+1]=Arr[j];
            }
            Arr[j+1]=key;
        }
    }
}

class insertionSort 
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int length=0;
        System.out.println("Enter the size: ");
        length=sobj.nextInt();
        InsertionSort obj=new InsertionSort(length);
        obj.Accept();
        obj.Display();
        obj.Sort();
        obj.Display();
    }
}
