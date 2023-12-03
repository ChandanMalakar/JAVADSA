import java.util.*;
public class function{
    public static void printMyName(String name)
    {
        System.out.println(name);
        return;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR NAME : ");
        String name=sc.next();
        printMyName(name);
    }
}