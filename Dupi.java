import java.util.*;

public class Dupi
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int arr[]={1,2,3,3,4};
        Set<Integer> s=new HashSet<Integer>();
        s.addAll(Arrays.asList(new Integer[]{1,2,3,4,4}));
        System.out.println(s);
    }
}