import java.util.*;
public class facNum {
    public static int factorial(int n)
    {
        int fac=1;
        for(int i=1;i<=n;i++)
        {
            fac=fac*i;
        }
        return fac;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        int n=sc.nextInt();
        System.out.println("THE FACTORIAL OF THE GIVEN NUMBER IS : "+factorial(n));
    }
}
