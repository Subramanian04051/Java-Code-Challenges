import java.util.*;
public class PrimeFactorial
{
public static void main(String args[])
{
	findFactorial(Integer.parseInt(args[0]));
	
}
public static void findFactorial(int n)
{
	int m=n;
	for(int i=2;i*i<=m;i++)
	{
		while(n%i==0)
		{
			System.out.println(i);
			n=n/i;
		}
	}
	if(n>1)
	{
		System.out.println(n);
	}
}
}