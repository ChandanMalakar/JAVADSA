import java.util.*;
public class SUM {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);    
        int n,sum=0;
        System.out.println("ENTER A NUMBER :");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("THE SUM OF N NATURAL NUMBERS IS : "+sum);
    }
}
