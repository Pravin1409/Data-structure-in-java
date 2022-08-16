import java.util.*;
class array
{
    public int Range(int ino)
    {
        int icnt=0;
        int iDigit=0;
        while(ino!=0)
        {
            iDigit=ino%10;
            if(iDigit>3&&iDigit<7)
            {
                icnt++;
            }
            ino=ino/10;
        }
        return icnt++;
    }
}
class pro3 {
    public static void main(String arg[])
    {
        Scanner obj=new Scanner(System.in);
        int ino=0,iRet=0;

        System.out.println("Enter the number:");
        ino=obj.nextInt();
        array a=new array();
        iRet = a.Range(ino);
        System.out.println("Count are:"+iRet);
    }
}

