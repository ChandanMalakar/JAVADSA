import java.util.*;
public class BIRTH_MONTH {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("ENTER THE NUMBER OF YOUR BIRTH MONTH :");
        num=sc.nextInt();
        switch(num){
            case 1: System.out.println("JAN");
            break;
            case 2:System.out.println("FEB");
            break;
            case 3:System.out.println("MARCH");
            break;
            default:System.out.println("THERE ARE ONLY 12 MONTHS IN A YEAR");
        }
    }
}

