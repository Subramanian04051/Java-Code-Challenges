import java.util.Scanner;
public class BinarySearch
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=in.nextInt();
        }
        int ind=doBinarySearch(arr,in.nextInt());
        if(ind==-1)
        {
            System.out.println("element not found");
        }
        else{
            System.out.println("Element is found at index" +ind);
        }
    }
    public static int doBinarySearch(int arr[],int key)
    {
        int low=0;
        int high=arr.length-1;
        int mid=(low+high)/2;
        //System.out.println(mid);
        while(low<=high)
        {
            if(arr[mid]<key)
            {
                low=mid+1;
                System.out.println("Low:"+low);
            }
            else if(arr[mid]==key)
            {
                return mid;
            }
            else{
                high=mid-1;
                System.out.println("High:"+high);
            }
            mid=(low+high)/2;
        }
        return -1;
    }
}