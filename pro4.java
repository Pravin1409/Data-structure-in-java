import java.util.*;
class array
{
    public int Diff(int ino)
    {
        int isum=0,sum=0,iDigit=0;
        while(ino!=0)
        {
            iDigit=ino%10;
            if(ino%2==0)
            {
                isum=isum+iDigit;
            }
            else if(ino%2!=0)
            {
                sum=sum+iDigit;
            }
            ino=ino/10;

        }
        return isum-sum;
    }
}

class pro4 {
    public static void main(String arg[])
    {
        Scanner obj=new Scanner(System.in);
        int ino=0,iRet=0;

        System.out.println("Enter the number:");
        ino=obj.nextInt();
        array a=new array();
        iRet = a.Diff(ino);
        System.out.println("Count are:"+iRet);
    }
}
