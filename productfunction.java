import java.util.*;
public class productfunction{
    public static int product(int a , int b){
        int s = a*b;
        return s;
    

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a and b-->");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = product(a , b);
        System.out.println("The product of a and b is "+c);
    }
}