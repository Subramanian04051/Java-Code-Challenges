import java.util.*;
public class StringArray
{
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	int n,k=0;
	String arr[]={"Hi","Hello","Hi","Friend","Hi","Hello","Subramanian"};
	int count=1;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
			}
		}
		System.out.println("The string \t"+arr[i]+"\t occurs \t"+count);
		count=1;
				
	}
}
}
		