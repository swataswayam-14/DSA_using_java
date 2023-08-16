import java.util.*;
public class FibinacciRec{
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.print("which term of the fibonacci sequence you want to know:-->");
         int n = sc.nextInt();
         if(n < 0){
             System.out.print("Invalid input: n must be greater than or equal to 0");
         }
        else{
            System.out.print("The "+n+"th term is: "+fib(n));
        }
        
    }
}
//the space complexity is O(n)
//the time complexity -> exponential time complexity O(2^n)