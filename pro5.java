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
        System.out.println("Enter elements:");
        for(i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        } 
    }
    public void Display()
    {
        System.out.println("elements Are:");
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
    public int product()
    {
        int i=0,mul=1;
        for(i=0;i<Arr.length;i++)
        {
            if(Arr[i]%2!=0)
            {
                mul=mul*Arr[i];
            }
        }
        return mul;
    }
}
class pro5
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int ilength=0;
        System.out.println("Enter length:");
        ilength=sobj.nextInt();
        Marvellous mobj=new Marvellous(ilength);
        int iRet=0;
        mobj.Accept();
        mobj.Display();
        iRet=mobj.product();
        System.out.println("product Are:"+iRet);
    }
}