import java.util.*;
import java.io.*;
public class Duplicate
{
    public static void main(String args[])
    {
        HashSet<Integer> s=new HashSet<Integer>();
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++)
        {
            int m=in.nextInt();
            if(!s.contains(m))
            {
                s.add(m);
            }
        }
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
