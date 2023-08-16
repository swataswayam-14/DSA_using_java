import java.util.*;
public class SumRecursion{
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int summ1 = sum(n-1);
        int sm = n+summ1;
        return sm;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter till which you want to calculate the sum:-");
        int n = sc.nextInt();
        System.out.print("the sum is "+sum(n));
        
    }
}
// time and space complexity for this code is O(n)