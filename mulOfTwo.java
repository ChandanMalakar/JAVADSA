import java.util.*;
public class mulOfTwo {
    public static int mul(int a,int b)
    {
        int m=a*b;
        return m;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS : ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=mul(x,y);
        System.out.println("THE MULTIPLICATION OF TWO NUMBERS ARE : "+z);
    }
}
