import java.util.*;
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
        System.out.println("Enter numbers:");
        int i=0;
        for(i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }
    }
    public void Display()
    {
        System.out.println("Elements Are:");
        int i=0;
        for(i=0;i<Arr.length;i++)
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
public boolean Check(int ino)
{
    int i=0;
    for(i=0;i<Arr.length;i++)
    {
        if(Arr[i]==ino)
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
class pro1
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int ilength=0,ino=0;
        boolean bRet=false;
        System.out.println("enter the length:");
        ilength=sobj.nextInt(); 
        Marvellous mobj=new Marvellous(ilength);
        mobj.Accept();
        mobj.Display();
        System.out.println("Enter another number:");
        ino=sobj.nextInt();
        bRet=mobj.Check(ino);
        if (bRet==true)
        { 
            System.out.println("present"); 
        }
        else
        {
            System.out.println("not present");
        }
    }
}