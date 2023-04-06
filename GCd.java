import java.util.Scanner;
public class GCd
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n1=in.nextInt();
		int n2=in.nextInt();
		System.out.println("The GCD value is:\t"+hcf(n1,n2));
	}
	public static int hcf(int n1,int n2)
	{
		if(n2!=0)
		{
			return hcf(n1,n1%n2);
		}
		else
		{
			return n1;
		}
	}
}
