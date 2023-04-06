import java.util.Scanner;
import java.io.*;
public class FactorialFind
{
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
int n=in.nextInt();
System.out.print(1+" ");
int i;
for(i=2;i*i<n;i++)
{
	if(n%i==0)
	{
		System.out.print(i+" ");
		System.out.print(n/i+" ");
	}
}
if(n%i==0)
{
	System.out.print(i+" ");
}
System.out.print(n+" ");
}
}