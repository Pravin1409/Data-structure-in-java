import java.util.*;
class StringX
{
    public String str;
    public void Accept()
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter String:");
        str=sobj.nextLine();
    }
}
class Marvellos extends StringX
{
    char Arr[]=str.toCharArray();
    public void Display(int iRow,int iCol)
    {
      int i=0,j=0;
      char ch=Arr[i];
      for(i=1,ch=Arr[i];i<=iRow;i++,ch++)
      {
          for(j=1,ch=Arr[i];j<=iCol;j++,ch++)
          {
              System.out.println(ch);
              System.out.print("\t");
          }
          System.out.println();
      }
    }
}
class pro1
 {
   public static void main(String[] args) {
       Scanner sobj=new Scanner(System.in);
       Marvellos mobj=new Marvellos();
       int i=0,j=0;
       i=sobj.nextInt();
       j=sobj.nextInt();
       mobj.Accept();
       mobj.Display(i,j);
   } 
}
