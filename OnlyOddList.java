import java.util.*;
import java.lang.Math;
public class OnlyOddList
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        List<Integer> l=new ArrayList<Integer>();
        int n=Integer.parseInt(args[0]);
        for(int i=0;i<n;i++)
        {
            l.add(in.nextInt());
        }
        System.out.println(onlyOddList(l,n,0));
    }
    public static boolean onlyOddList(List<Integer> l,int size,int count)
    {
        if(size==0)
        {
            System.out.println("Size is 0");
        }
        int i=(int)(Math.random()*size);
        if(l.get(i)%2==0)
        {
             count++;
             System.out.println("Failed"+count);
             return false;
        }
        else{
           return onlyOddList(l,size,count+1);
        }
    }
}