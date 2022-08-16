import java.util.*;

import javax.swing.plaf.synth.SynthStyle;
class ArrayX
{
    public int Arr[];
    public ArrayX(int isize)
    {
        Arr=new int[isize];
    }
    public void Accept()
    {
        Scanner sobj=new Scanner(System.in);
        int i=0;
        System.out.println("Enter numbers:");
        for(i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }
    }
    public void Display()
    {
        System.out.println("Elements are:");
        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }
    }
}
class Marvellous extends ArrayX
{
    public Marvellous(int ino)
    {
        super(ino);
    }
    public void Show(int start,int end)
    {
        int i=0;
        for(i=0;i<Arr.length;i++)
        {
            if(Arr[i]>start&&Arr[i]<end)
            {
                System.out.println(Arr[i]);
            } 
        }
    }
}
class pro4
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int ilength=0,is=0,ie=0;
        System.out.println("Enter length:");
        ilength=sobj.nextInt();
        Marvellous mobj=new Marvellous(ilength);
        mobj.Accept();
        mobj.Display();
        System.out.println("enter start:");
        is=sobj.nextInt();
        System.out.println("enter start:");
        ie=sobj.nextInt();
        System.out.println("Result:");
        mobj.Show(is, ie);
    }
}