import java.util.Scanner;
import java.lang.Math.*;
//import java.Math.*;
public class Sum
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
            arr[i][j]=in.nextInt();
        }
        }
        System.out.println("Input successfully");
        int sum1=0,sum2=0;
       // m=n;
        for(int i=0;i<n;i++)
        {
            sum1+=arr[i][i];
            sum2+=arr[i][n-i-1];
        }
        System.out.println("The difference is:"+(Math.abs(sum1-sum2)));
    }
}