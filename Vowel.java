import java.util.Scanner;
import java.lang.*;
public class Vowel
{
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	String n=in.next();
	String vow="";
	char a;
	for(int i=0;i<n.length();i++)
	{
		a=n.charAt(i);
		if(a=='a'|| a=='e'|| a=='i'|| a=='o'|| a=='u')
		{
			 vow+=Character.toUpperCase(a);
		}
		else
		{
			vow+=a;
		}
	}
	System.out.print(vow);
}
}

			
	