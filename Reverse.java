import java.util.Scanner;

public class Reverse
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String a=in.next();
        String b="";
        for(int i=a.length()-1;i>=0;i--)
        {
            b+=a.charAt(i);
        }
        System.out.println(b);
    }
}