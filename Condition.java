import java.util.*;
public class Condition {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int button;
        System.out.println("ENTER AN INPUT BETWEEN 1-3 : ");
        button=sc.nextInt();
     /*  if(button==1)
            System.out.println("HELLO");
        else if(button==2)
            System.out.println("NAMASTE");
        else if(button==3)
            System.out.println("BONJOUR");
        else
            System.out.println("INVALID INPUT");
    }*/

    switch (button){
        case 1: System.out.println("HELLO");
                break;
        case 2: System.out.println("NAMASTE");
                break;
        case 3: System.out.println("BONJOUR");
                break;
        default: System.out.println("INVALID INPUT");
    }
}
}