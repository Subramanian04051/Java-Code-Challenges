import java.util.Scanner;
import java.io.*;
public class StringWork
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String a=in.next();
        int n=a.length();
        int len;
        if(n%2==0)
        {
             len=n/2;
        }
        else{
             len=(n/2)+1;
        }
        for(int i=0;i<len;i++)
        {
            if(a.charAt(i)!=a.charAt(n-i-1))
            {
                System.out.println("Not a palindrome");
                return ;
            }
        }
        System.out.println("Palindrome");
    }
}