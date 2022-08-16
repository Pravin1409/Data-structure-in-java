import java.util.*;
class Pattern
{
    public void pattern(int iRow,int iCol)
    {
        int i=0,j=0;
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                System.out.print(j);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}

class pro2 
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=0,iCol=0;
        System.out.println("Enter row number:");
        iRow=sobj.nextInt();
        System.out.println("Enter cols:");
        iCol=sobj.nextInt();
        Pattern p=new Pattern();
        p.pattern(iRow,iCol);
    }
    
}
