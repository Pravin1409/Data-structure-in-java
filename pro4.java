import java.util.*;
class StringX
{
    public String str;
    public void Accept()

    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter string:");
        str=sobj.nextLine();
    }
}
class Marvellous extends StringX
{
    int i=0;
    char Arr[]=str.toCharArray();
    public boolean Check()
    {
        if(Arr[i]=='a'||Arr[i]=='e'||Arr[i]=='o'||Arr[i]=='u'||Arr[i]=='i')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class pro4
{
    public static void main(String[] args) 
    {
        boolean bRet=false;
        Marvellous mobj=new Marvellous();
        mobj.Accept();;
        if(bRet==true)    
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}