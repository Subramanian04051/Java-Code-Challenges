import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //String regex="[A-Za-z !,?._'@]+";
        String s = scan.nextLine().trim();
        String strarr[]=s.split("[ .,'?]");
        if(strarr.length==0)
        {
            System.out.print("0");
        }
        if(strarr.length>40000)
        {
            System.out.print("");
        }
        if(strarr.length>0 && strarr.length<40000)
        {
            System.out.println(strarr.length);
        for(int i=0;i<strarr.length;i++)
        {
            if(strarr[i]!=" ")
            {
            System.out.println(strarr[i]);
            }
        }
        }
        // Write your code here.
        scan.close();
    }
}