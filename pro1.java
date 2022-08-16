
import java.util.*;
class StringX
{
    public String str;
    public void Accept()
    {
    Scanner sobj=new Scanner(System.in);
    System.out.println("Enter String:");
    str=sobj.nextLine();
    
    }
}
class Marvellos extends StringX
{
    public int Count()
    {
        int i=0,icnt=0;
        char Arr[]=str.toCharArray();
        for(i=0;i<Arr.length;i++)
        {
            if(Arr[i]>'A'&&Arr[i]<'Z')
            {
                icnt++;
            }
        }
        return icnt;
    }
}
class pro1
{
    public static void main(String arg []) 
    {
        int iRet=0;
        Marvellos mobj=new Marvellos();
        mobj.Accept();
        iRet=mobj.Count();
        System.out.println("Count Are:"+iRet);
    }
   
}