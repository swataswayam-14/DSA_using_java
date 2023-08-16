import java.util.*;
public class factorialFunction{
    public static int factorial(int n){
        int i =1;
        int fact=1; 
        while(i<=n){
            fact*=i;
            i++;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number to find its factorial-->");
        int n = sc.nextInt();
        int s = factorial(n);
        System.out.println("the factorial of the number is "+s);
    }
}