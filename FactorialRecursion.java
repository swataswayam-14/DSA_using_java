import java.util.*;
public class FactorialRecursion{
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n*fnm1;
        return fn;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to find its factorial-->");
        int n = sc.nextInt();
        System.out.print("the factorial of the number is "+fact(n));
    }
}
//the space complexity and time complexity of this code is O(n)