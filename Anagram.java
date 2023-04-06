import java.util.*;
public class Anagram
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String a=in.next();
        String b=in.next();
        int index=b.indexOf(a.charAt(3));
        //System.out.println(index);
        System.out.println(findAnagram(a.toLowerCase(),b.toLowerCase()));
    }
    public static boolean findAnagram(String a,String b)
    {
         if(a.length()!=b.length())
        {
            System.out.println("Length");
            return false;
        }
        char c[]=a.toCharArray();
        char d[]=b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        a=c.toString();
        b=d.toString();
        for(char i:c)
        {
            System.out.println(i);
        }
        for(char i:d)
        {
            System.out.println(i);
        }
        //System.out.println(c)
        if(Arrays.equals(c,d))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}