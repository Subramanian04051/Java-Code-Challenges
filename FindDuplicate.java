import java.util.HashSet;
import java.util.*;
public class FindDuplicate
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String s[]=new String[n];
        HashMap<String,Integer> h1=new HashMap<String,Integer>();
        for(int i=0;i<n;i++)
        {
            s[i]=in.next();
        }
        for(int i=0;i<n;i++)
        {
            String s=s[i];
            String s1[]=s.split(",");
            for(String a:s1)
            {
                if(h1.contains(a))
                {
                    h1.put(a,h1.get(a)+1);
                }
                else
                {
                    h1.put(a,1);
                }
            }
        }
        Iterator itr=h1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}