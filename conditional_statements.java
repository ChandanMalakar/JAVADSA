import java.util.*;
public class conditional_statements {
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("ENTER THE AGE OF THE USER : ");
        age=sc.nextInt();
        if(age>18){
            System.out.println("ADULT");
        }
        else{
            System.out.println("NOT AN ADULT");
        }
    }
}
