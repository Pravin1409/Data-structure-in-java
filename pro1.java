import java.util.*;
class array
{
    public int CountEven(int ino)
    {
        int iDigit=0,icnt=0;
        while(ino!=0)
        {
            iDigit=ino%10;
            if(iDigit%2==0)
            {
                icnt++;
            }
            ino=ino/10;
        }
        return icnt;
    }

}
class pro1 {
    public static void main(String arg[])
    {
        Scanner obj=new Scanner(System.in);
        int ino=0,iRet=0;
        System.out.println("Enter the number :");
        ino=obj.nextInt();
        array a=new array();
        iRet=a.CountEven(ino);
        System.out.print("Count are:"+iRet);
    }
}
