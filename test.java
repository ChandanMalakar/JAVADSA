import java.util.*;
public class test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[] arr={5,4,-1,7,8};
        int sum,max=0;
        for(int i=0;i<5;i++)
        {
            sum=0;
            for(int j=i;j<5;j++)
            {
                sum=sum+arr[j];
                if(max<sum)
                {
                    max=sum;
                }
            }
        }
        System.out.println(max);

    }
}