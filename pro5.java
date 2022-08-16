import java.util.Scanner;

class Pattern
{
  public void pattern(int iRow,int iCol)
  {
    int i=0,j=0;
    for(i=1;i<=iRow;i++)
    {
        for(j=1;j<=i;j++)
        {
            System.out.print(i);
        }
        System.out.println();
    }
  }

}
class pro5 
{
    public static void main(String arg[])    
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter Row:");
        int iRow=sobj.nextInt();
        System.out.println("Enter col:");
        int iCol=sobj.nextInt();

        Pattern p=new Pattern();
        p.pattern(iRow,iCol);
    }
}
