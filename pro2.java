import java.util.*;
class Pattern
{
    public void Pattern(int iRow,int iCol)
    {
        int i=0,j=0;
        char ch='A';
        char ch1='a';
        for(i=0,ch='A',ch1='a';i<=iRow;i++)
        {
            for(j=0,ch='A',ch1='a';j<=iCol;j++,ch1++)
            {
                if(j%2==0)
                {
                    System.out.print(ch1);
                }
                else
                {
                    System.out.print(ch);
                }
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
        System.out.println("Enter row:");
        int iRow=sobj.nextInt();

        System.out.println("Enter col number:");
        int iCol=sobj.nextInt();
        Pattern p=new Pattern();
        p.Pattern(iRow,iCol);
    }
}
