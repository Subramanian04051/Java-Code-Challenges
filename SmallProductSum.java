import java.util.*;
import java.io.*;
public class SmallProductSum
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        int sum=in.nextInt();
        if(arr[0]+arr[1]<=sum){
            System.out.println("the least pair is"+(arr[0])+(arr[1])+arr[0]*arr[1]);
             //  break;
            }
    }
}