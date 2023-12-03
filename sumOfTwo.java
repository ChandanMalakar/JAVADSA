import java.util.*;
public class sumOfTwo {
    public static int add(int a,int b, int sum)
    {
        sum=a+b;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER VALUES FOR X AND Y :");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=0;
        System.out.println("The sum of the two numbers is :"+add(x,y,z));

    }
}
