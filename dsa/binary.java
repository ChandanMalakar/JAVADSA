package dsa;
import java.util.*;
public class binary {
    public static int find(int arr[],int target)
    {
        int start,end,mid=0;
        start=0;
        end=arr.length-1;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(target==arr[mid])
                return mid;
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,4,6,8,10,12};
        System.out.println("ENTER THE ELEMENT YOU WANT TO FIND IN THE ARRAY ");
        int target=sc.nextInt();
        int key=find(arr,target);
        if(key==-1)
        {
            System.out.println("TARGET ELEMENT NOT FOUND ");
        }
        else
            System.out.println("TARGET ELEMENT IS FOUND AT : "+key);
    }
}
