import java.util.*;
class Pro
{
    public void Display(int iRow,int iCol)
    {
        int i=0,j=0;
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                if(j%2==0)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}

class pro4 
{
public static void main(String[] args) {
    Scanner sobj=new Scanner(System.in);
    int i=0,j=0;
    System.out.println("Enter row");
    i=sobj.nextInt();
    System.out.println("Enter col:");
    j=sobj.nextInt();
    Pro p=new Pro();
    p.Display(i, j);
}
}
