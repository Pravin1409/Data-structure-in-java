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
      int i=0;
      System.out.println("Enter number's:");
      for(i=0;i<Arr.length;i++)
      {
          Arr[i]=sobj.nextInt();
      }
  }

  public void Display()
  {
      System.out.println("numbers are:");
      int i=0;
      for(i=0;i<Arr.length;i++)
      {
          System.out.println(Arr[i]);
      }
  }
}

class Marvellous extends ArrayX
{
    public Marvellous(int no)
    {
        super(no);
    }
    public void show()
    {
        int i=0;
        for(i=0;i<Arr.length;i++)
        {
            if(Arr[i]%5==0)
            {
                System.out.println(Arr[i]);
            }
        }
    }
}
class pro2
{
     public static void main(String[] args) 
     {
         Scanner sobj=new Scanner(System.in);
         int ilength=0;
         System.out.println("Enter length");
         ilength=sobj.nextInt();
        Marvellous mobj=new Marvellous(ilength);
        mobj.Accept();
        mobj.Display();
        System.out.println("Result:");
        mobj.show();
     }
} 