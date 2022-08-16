import java.util.*;
class Pro
{
    public void Display(int iRow,int iCol)
    {
        int i=0,j=0;
        for(i=iRow;i>=1;i--)
        {
            for(j=iCol;j>=1;j--)
            {
                System.out.print(j);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}

class pro3 
{
 public static void main(String[] args) {
     Scanner sobj=new Scanner(System.in);
     int i=0,j=0;
     System.out.println("Enter row:");
     i=sobj.nextInt();
     System.out.println("Entr cols:");
     j=sobj.nextInt();
     Pro p=new Pro();
     p.Display(i,j);
 }   
}
