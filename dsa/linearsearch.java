package dsa;
import java.util.*;
public class linearsearch {
    public static int search(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
                return i;
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,4,6,8,10,12};
        System.out.println("ENTER THE ELEMENT YOU WANT TO SEARCH");
        int key=sc.nextInt();
        //System.out.println("THE INDEX OF THE SEARCH ELEMENT IS : "+search(arr,key));
        int index=search(arr,key);
        if(index==-1)
        {
            System.out.println("ELEMENT NOT FOUND");
        }
        else
        {
            System.out.println("THE ELEMENT IS AT THE LOCATION : "+index);
        }
    }
}
