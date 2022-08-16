import java.util.*;
class array
{
    public int Multiplecation(int ino)
    {
        int mul=1;
        int iDigit=0;
        while(ino!=0) 
        {
            iDigit=ino%10;
            mul=mul*iDigit;

            ino=ino/10;

        }
        return mul;
    }
}
class pro5
{
    public static void main(String arg[])
    {
        Scanner obj=new Scanner(System.in);
        int ino=0;
        int iRet=0;
        System.out.println("Enter the number:");
        ino=obj.nextInt();

        array a=new array();
        iRet=a.Multiplecation(ino);
        System.out.println("Multiplication are:"+iRet);

    }
}