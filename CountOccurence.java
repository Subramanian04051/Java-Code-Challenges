import java.util.*;
public class CountOccurence
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String splittedarr[]=in.nextLine().split("\\s+");
        int count=1;
        Map<String,Integer> hashmap=new HashMap<String,Integer>();
        for(int i=0;i<splittedarr.length;i++)
        {
            for(int j=i+1;j<splittedarr.length;j++)
            {
                if(splittedarr[i]==splittedarr[j])
                {
                    count++;
                }
            }
            hashmap.put(splittedarr[i],count);
        }
       for(Map.Entry<String,Integer> i:hashmap.entrySet())
       {
        System.out.println(i.getValue()+" "+ i.getKey());
       }
    }
}