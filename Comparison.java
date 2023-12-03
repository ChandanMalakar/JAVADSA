import java.util.*;
public class Comparison {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("ENTER TWO NUMBERS :");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a==b)
            System.out.println(" A EQUALS B ");
        else if(a>b)
            System.out.println(" A IS GREATER ");
        else
            System.out.println(" A IS SMALLER ");
    }
}
