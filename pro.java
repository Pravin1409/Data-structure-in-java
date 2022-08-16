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
        System.out.println("Enter:");
        for(i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }
    }

    public void Display()
    {
        int i=0;
        System.out.println("Elements Are:");
        for(i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }
    }
  
}
class Marvellous extends ArrayX
{
    public Marvellous(int ivalue)
    {
        super(ivalue);
    }

    public int Diff()
    {
        int i=0,isum=0,psum=0;
        for(i=0;i<Arr.length;i++)
        {
            if(Arr[i]%2==0)
            {
                isum=isum+Arr[i];
            }
            else if(Arr[i]%2!=0)
            {
                psum=psum+Arr[i];
            }
        }
        return isum-psum;
    }
}
class pro
{
    public static void main(String arg[])
    {
        Scanner sobj= new Scanner(System.in);
         int ilength=0;
         int iRet=0;
        System.out.println("Enter the lendth:");
        ilength=sobj.nextInt();

        Marvellous mobj=new Marvellous(ilength);
        mobj.Accept();
        mobj.Display();
        iRet=mobj.Diff();
        System.out.println("Difference is:"+iRet);
      
    }
}