import java.util.*;
import java.io.*;
public class AddArray
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int sum=0;
Scanner in=new Scanner(System.in);
int arr[]=new int[n];
arr=getInput(arr,n);
/**for(int i=0;i<n;i++)
{
	arr[i]=in.nextInt();
}**/
sum=addArray(arr,arr.length,sum);
System.out.print(sum);
}
public static int addArray(int[] value,int n,int sum)
{
	if(n==0)
	{
		return sum;
	}
	else
	{
		
	return value[n-1]+addArray(value,n-1,value[n-1]);
	}
}
public static int[] getInput(int arr[],int n)
{
	Scanner in=new Scanner(System.in);
	if(n!=0){
		arr[n-1]=in.nextInt();
		return getInput(arr,n-1);
	}
	else{
		return arr;
	}
}
}



	
	
	
	
	