import java.util.*;


class ArrayX
{
    public int Arr[];
    public ArrayX(int isize)
    {
        Arr=new int [isize];
    }

    public void Accept()
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter elemnts:");
        int i=0;
        for(i=0;i<Arr.length;i++)
        {
            Arr[i]=sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elemente are:");
        int i=0;
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
    public void Show()
    {
        int i=0;
        for(i=0;i<Arr.length;i++)
        {
            if(Arr[i]%11==0)
            {
                System.out.println(Arr[i]);
            }
        }
    }
}
class pro5
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int ilength=0;
        System.out.println("Enter size:");
        ilength=sobj.nextInt();

        Marvellous mobj=new Marvellous(ilength);

        mobj.Accept();
        mobj.Display();
        System.out.println("number are:");
        mobj.Show();
    }
}