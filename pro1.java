import java.util.*;


class Pattern
{
    public void Pattern(int irow,int icol)
    {
        int i=0,j=0;
        char ch='A';
        char ch1='a';
        for(i=0,ch='A',ch1='a';i<=irow;i++,ch++,ch1++)
        {
            for(j=0,ch='A',ch1='a';j<=icol;j++,ch++,ch1++)
            {
                if(i%2==0)
                {
                 System.out.print(ch);
                }
                else
                {
                    System.out.print(ch1);
                }
            }
            System.out.println();
        }
       
    } 
}
class pro1 
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=0,iCol=0;
        System.out.println("Enter row number:");
        iRow=sobj.nextInt();

        System.out.println("Enter Cols number:");
        iCol=sobj.nextInt();
        Pattern p=new Pattern();
         
        p.Pattern(iRow,iCol);

    }
}
