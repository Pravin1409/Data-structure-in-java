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
        int i=0;
        System.out.println("enter number:");
        for(i=0;i<Arr.length;i++) 
        {
            Arr[i]=sobj.nextInt();
        }
    }
    public void Display()
    {
        System.out.println("Elements are:");
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
    public int First(int no)
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
            return -1;
        }
        else
        {
            return i;
        }
    }
}
class pro2
{
    public static void main(String Arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int ilength=0,ino=0,iRet=0;
        System.out.println("Enter length:");
        ilength=sobj.nextInt();
        Marvellous mobj=new Marvellous(ilength);
        mobj.Accept();
        mobj.Display();
        System.out.println("Enter another number:");
        ino=sobj.nextInt();
        iRet=mobj.First(ino);
        System.out.println("index at:"+iRet); 
    }
}