import java.util.*;
interface Addition
{
    public static void addition(int a,int b ){}
} 
interface Subtraction
{
public static void subtraction(int a,int b ){}
}
interface Multiplication
{
public static void multiplication(int a,int b ){}
}
interface Division
{
public static void division(int a,int b ){}
}
class CalculatorClass implements Addition,Subtraction,Multiplication,Division
{
     public static void addition(int a,int b)
     {
         System.out.println(a+b);
     } 
     public static void subtraction(int a,int b)
     {
         System.out.println(a-b);
     } 
     public static void multiplication(int a,int b)
     {
         System.out.println(a*b);
     } 
     public static void division(int a,int b)
     {
        try{
         System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
     } 

}

public class SampleInterfaceOperation
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        CalculatorClass c=new CalculatorClass();
        int a=in.nextInt();
        int b=in.nextInt();
        c.addition(a,b);
        c.subtraction(a,b);
        c.multiplication(a,b);
        c.division(a,b);
    }
}