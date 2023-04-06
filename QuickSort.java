import java.util.*;
public class QuickSort
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int oldarr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            oldarr[i]=in.nextInt();
        }
       int arr[]=quickSort(oldarr,0,size-1);
       System.out.println("Sorted Array is "+Arrays.toString(arr));
    }
    public static int[] quickSort(int arr[],int low,int high)
    {
        int i=low;
        int j=high;
        System.out.println("Reached quicksort function");
        int pivot=arr[low+(high-low)/2];
        while(i<=j)
        {
            System.out.println("entered while loop");
            while(arr[i]<pivot)
            {
                i++;
            }
            while(arr[j]>pivot) 
            {
                j--;
            }
            if(i<=j)
            {
                arr=swap(i,j,arr);
            }
        }
        if(low<j)
        {
            quickSort(arr,low,j);
        }
        if(i<high)
        {
            quickSort(arr,i,high);
        }
        return arr;
    }
    public static int[] swap(int i,int j,int arr[])
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }  
}