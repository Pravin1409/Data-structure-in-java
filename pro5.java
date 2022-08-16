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
    public void Display()
    {
        System.out.println("hello:"+str);
    }
}
class Marvellous extends StringX
{
    public String Reverse()
    {
        char Arr[]=str.toCharArray();
        int start=0,end=Arr.length-1;
        char temp;
        while(start<end)
        {
            temp=Arr[start];
            Arr[start]=Arr[end];
            Arr[end]=temp;
            start++;
            end--;
        }
        return new String(Arr);
    }
}
class pro5
{
    public static void main(String Arg[])
    {
        Marvellous mobj=new Marvellous();
        String s;
        mobj.Accept();
        mobj.Display();
        s=mobj.Reverse();
        System.out.println("String Are:"+s);
    }
}