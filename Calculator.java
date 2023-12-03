import java.util.*;
public class Calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b;
        int ch;
        System.out.println("ENTER TWO NUMBERS A AND B :");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("THE LIST OF OPERATIONS ARE :\n 1. ADDITION\n 2. SUBTRACTION\n 3. MULTIPLICATION\n 4. DIVISION\n 5. MODULUS");
        System.out.println("ENTER YOUR CHOICE OF OPERATION :");
        ch=sc.nextInt();
        switch(ch){
            case 1: System.out.println(a+b);
                    break;
            case 2: System.out.println(a-b);
                    break;
            case 3: System.out.println(a*b);
                    break;
            case 4: System.out.println(a/b);
                    break;
            case 5: System.out.println(a%b);
                    break;
            default: System.out.println("INVALID INPUT");
        }
    }
}