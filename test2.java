import java.util.*;
public class test2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int maxi=0,sum=0;
        int[] arr={-5,-1,5,-3,-1,2,3,-6};
        maxi=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            maxi=Math.max(maxi,sum);
            if(sum<0){
                sum=0;
            }
        }
        
        System.out.println(maxi);
    }
}
