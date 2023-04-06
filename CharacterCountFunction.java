import java.util.*;
import java.io.*;
public class CharacterCountFunction
{
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
//int count=0;
int n=Integer.parseInt(args[0]);
//String strarr[]=new String[n];
for(int i=0;i<n;i++)
{
	String arr[]=in.next().split(",");
	for(int j=0;j<arr.length;j++)
	{
		System.out.println(arr[j]);
	}
}
//System.out.print(a.chars().filter(ch->ch =='e').count());
}
}

