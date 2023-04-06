import java.util.Scanner;
public class Calculator
{
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static double add(double a,double b)
    {
        return a+b;
    }
    public static int subtract(int a,int b)
    {
        return a-b;
    }
     public static double subtract(double a,double b)
    {
        return a-b;
    }
     public static int multiply(int a,int b)
    {
        return a*b;
    }
    public static double multiply(double a,double b)
    {
        return a*b;
    }
    public static double division(int a,int b)
    {
        double c;
        try{
        c=a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be zero");
            c=-1;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        boolean flag=true;
        int choice;
        while(flag)
        {
        System.out.println("Enter your choice \n 1-Add \n 2-Sub \n 3-Multiply \n 4-Division \n 5-Exit");
        choice=in.nextInt();
        System.out.println("Enter the numbers: 1-Integer \n 2-Decimal number");
        int ch=in.nextInt();
        if(ch==1)
        {
            int a=in.nextInt();
            int b=in.nextInt();
             switch(choice)
        {
            case 1:System.out.println("Addition"+" "+add(a,b));break;
            case 2:System.out.println("Subtraction"+" "+subtract(a,b));break;
            case 3:System.out.println("Multiplication"+" "+multiply(a,b));break;
            case 4:System.out.println("Division"+ " " +division(a,b));break;
            case 5:flag=false; break;
        }
        }
        else
        {
            double c=in.nextDouble();
            double d=in.nextDouble();
             switch(choice)
        {
            case 1:System.out.println("Addition"+" "+add(c,d));break;
            case 2:System.out.println("Subtraction"+ " "+subtract(c,d));break;
            case 3:System.out.println("Multiplication"+" "+multiply(c,d));break;
           // case 4:System.out.println("Division"+ division(c,d));break;
            case 5:flag=false; break;
        }
        }
       
    }
}
}