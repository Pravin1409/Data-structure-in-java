import java.util.Scanner;
class pattern
{
    public void Pattern(int iRow,int iCol)
    {
        int i=0,j=0;
        char ch1='A';
        char ch='A';
        for(i=0,ch1='A';i<=iRow;i++,ch1++)
        {
            for(j=0,ch='A';j<=iCol;j++,ch++)
            {
                System.out.print(ch1);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
   
}
class pro3 
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=0,iCol=0;
        System.out.println("Enter row number:");
        iRow=sobj.nextInt();

        System.out.println("Enter Cols number:");
        iCol=sobj.nextInt();
        pattern p=new pattern();
         
        p.Pattern(iRow,iCol);

       
    }

}
