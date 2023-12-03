package dsa;
import java.util.*;
public class largest {
    public static int large(int arr[],int max)
    {
        int min=Integer.MAX_VALUE;//+infinity
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("THE SMALLEST NUMBER IS : "+min);
        return max;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int max=Integer.MIN_VALUE;//-infinity
        int arr[]={1,2,6,3,5};
        System.out.println("THE LARGEST NUM IS : "+large(arr,max));

    }
}
