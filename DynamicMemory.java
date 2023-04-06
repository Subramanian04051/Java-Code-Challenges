import java.util.Scanner;
import java.io.*;
public class DynamicMemory
{
	//int space;
	int arr[];
	public DynamicMemory(int space)
	{
		//this.space=space;
		arr=new int[space];
	}
		
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	System.out.println("enter number of memory spaces:");
	int n=in.nextInt();
	System.out.println("enter number of process to be inserted:");
	int m=in.nextInt();
	DynamicMemory d=new DynamicMemory(n);
	System.out.println("Enter contigous memory");
	for(int i=0;i<n;i++)
	{
		d.arr[i]=in.nextInt();
	}
	//d.sort(d.arr);
	for(int i=0;i<m;i++)
	{
		System.out.println("Enter the process memory to be inserted");
		int p=in.nextInt();
		int index=fit(d.arr,p);
		if(index>=0)
		{
			d.arr[index]-=p;
			System.out.println("dynamic fit done");
			print(d.arr,0);
		}
		else
		{
			System.out.println("Memory Fit is not possible , because size if either over or under allocation");
		}
	}
		
} 
/**public static void sort(int []arr)
{
	int temp;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
}**/
public static int fit(int []arr,int memory)
{
	int min=Integer.MIN_VALUE;
	int index=-1;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]-memory<min && arr[i]-memory>=0)
		{
			min=arr[i]-memory;
			index=i;
		}		
	}
	if(index<0)
	{
		System.out.println("entered if");
		return -1;
	}
	else{
		return index;
	}
}
public static void print(int []arr,int index)
{
	if(index==arr.length)
	{
		return ;
	}
	else{
		
		System.out.println(arr[index]);
		print(arr,index+1);
	}
}
}				
		
		
	
	