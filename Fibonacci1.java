import java.util.Scanner;
public class Fibonacci1
{
    public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]);
        fibonacci(n,-1,1);
    }
    public static void fibonacci(int n,int f1,int f2)
    {
        try{
        if(n==0)
        {
            return ;
        }
        else
        {
           System.out.print((f1+f2)+"\t");
           fibonacci(n-1,f2,f1+f2);  
        }
        }catch(StackOverFlowException e)
        {
            System.out.println("Stack overflow exception");
        }
    }
}