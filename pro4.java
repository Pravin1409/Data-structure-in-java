import java.util.Scanner;
class Pattern
{
    public void Pattern(int iRow,int iCol)
    {
        int i=0,j=0;
        for(i=iRow;i>0;i--)
        {
            for(j=iCol;j>0;j--)
            {
                System.out.print(i);
                
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
class pro4 
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter Row number:");
        int iRow=sobj.nextInt();

        System.out.println("Enter col number:");
        int iCol=sobj.nextInt();
        Pattern p=new Pattern();
        p.Pattern(iRow, iCol);

    }
}
