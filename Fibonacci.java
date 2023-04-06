import java.util.Scanner;

public class Fibonacci
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int f1=-1,f2=1,f3;
		for(int i=0;i<n;i++)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			System.out.print("\t"+f3);
		}
	}
}