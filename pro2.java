import java.util.*;
class array
{
    public int countOdd(int ino)
    {
        int icnt=0,iDigit=0;
        while(ino!=0)
        {
            iDigit=ino%10;
            if(iDigit%2!=0)
            {
                icnt++;
            }
            ino=ino/10;
        }
        return icnt;
    }

}
class pro2 {
    public static void main(String arg[])
    {
        Scanner obj=new Scanner(System.in);
        int ino=0,iRet=0;

        System.out.println("Enter the number:");
        ino=obj.nextInt();
        array a=new array();
        iRet = a.countOdd(ino);
        System.out.println("Count are:"+iRet);
    }
}
