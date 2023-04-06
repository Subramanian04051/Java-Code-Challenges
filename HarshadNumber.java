import java.util.*;
import java.io.*;
public class HarshadNumber
{
    public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]);
        int value=checkHarshad(n,0);
        if(n%value==0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    public static int checkHarshad(int n,int sum)
    {
        if(n>0)
        {
            sum+=n%10;
        checkHarshad(n/10,sum);
        }
        return sum;
    }
}