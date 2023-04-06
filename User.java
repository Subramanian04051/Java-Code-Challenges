import java.util.Scanner;
public class User
{
    int paid=0;
    public void putValue(int paid)
    {
        this.paid=paid;
    }
    public int getValue()
    {
        return this.paid;
    }
    public int cancelOrder()
    {
      int refund=getValue();
      if(refund!=0)
      {
        putValue(0);
      }
       return refund;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number of times user needs to do operations");
        int n=in.nextInt();
        System.out.println("enter your choice 1-user 2-Refiller");
         int ch=in.nextInt();
         int value=0,paid=0,bal=0,m=0;
          User u=new User();
         if(ch==1)
         {
           
         while(n>0)
         {
            System.out.println("enter your choice 1-Buy juice \n 2-Cancel order");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Enter your choice :1-Coke \n 2-Pepsi \n 3-Soda");
                        ch=in.nextInt();
                        if(ch==1)
                        {
                         value=25;
                         System.out.println("enter number of cokes needed to buyed");
                          m=in.nextInt();
                        }
                       else if(ch==2)
                        {
                            value=35;
                            System.out.println("enter number of pepsi needed to buyed");
                          m=in.nextInt();
                        }
                        else
                        {
                            value=45;
                            System.out.println("enter number of Soda needed to buyed");
                          m=in.nextInt();
                        }
                        bal=m*value;
                        while(paid<m*value && bal>=0)
                        {
                            System.out.println("Please enter  coin denomination");
                            int den=in.nextInt();
                            if(den%1==0 ||den%5==0 ||den%25==0 ||den%10==0)
                            {
                            paid+=den;
                            bal-=den;
                            System.out.println("Balance needed to be paid:"+bal);
                            }
                        }
                        //User u=new User();
                        u.putValue(paid);
                        break;
                case 2:if(u.cancelOrder()!=0)
                    {
                    System.out.println("Order successfully cancelled ,please get your refund");
                    }
                    else{
                        System.out.println("Please place an order before requesting a refund");
                    }
                break;
            }

    }
}
    }
}
