import java.util.*;
import java.io.*;
public class XORImp
{
    public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]);
        String arr[]=new String[n];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            arr[i]=in.next();
        }
       // arr=XorInput(0,n,arr);
        arr=binaryCalculated(0,arr);
        for(String i:arr)
        {
            System.out.println(i);
        }

    }
    public static String[] binaryCalculated(int n,String arr[])
    {
        if(n!=arr.length)
        {
            String remstore=Integer.toBinaryString(Integer.parseInt(arr[n]));
            arr[n]=remstore;
            XorCalculated(n+1,arr);
        }
        return arr;
    }
}
